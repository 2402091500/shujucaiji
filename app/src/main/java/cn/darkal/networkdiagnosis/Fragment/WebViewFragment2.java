package cn.darkal.networkdiagnosis.Fragment;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.security.KeyChain;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;

import butterknife.ButterKnife;
import cn.darkal.networkdiagnosis.Activity.MainActivity;
import cn.darkal.networkdiagnosis.Activity.SettingsActivity;
import cn.darkal.networkdiagnosis.R;
import cn.darkal.networkdiagnosis.Utils.FileUtil;
import cn.darkal.networkdiagnosis.Utils.OpenAccessibilitySettingHelper;
import cn.darkal.networkdiagnosis.Utils.SharedPreferenceUtils;
import cn.darkal.networkdiagnosis.service.MyAccessibilityService;
import cn.darkal.networkdiagnosis.service.URL;

public class WebViewFragment2 extends Fragment implements View.OnClickListener {


    Receiver receiver;

    private final static WebViewFragment2 webViewFragment = new WebViewFragment2();
    private Button startBt;
    private LinearLayout llserice;
    private LinearLayout llset;
    private TextView tvser;
    private ImageView imastate;
    private LinearLayout llzhensu;
    private LinearLayout llpintai;
    private ImageView im_pingtai;
    private TextView tv_pintai;
    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE };

    public static void verifyStoragePermissions(Activity activity) {
        // Check if we have write permission
        int permission = ActivityCompat.checkSelfPermission(activity,
                Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (permission != PackageManager.PERMISSION_GRANTED) {
            // We don't have permission so prompt the user
            ActivityCompat.requestPermissions(activity, PERMISSIONS_STORAGE,
                    REQUEST_EXTERNAL_STORAGE);
        }
    }
    public static WebViewFragment2 getInstance() {
        return webViewFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_webview2, container, false);
        ButterKnife.bind(this, view);
        verifyStoragePermissions(getActivity());
        startBt = (Button) view.findViewById(R.id.send);
        tvser = (TextView) view.findViewById(R.id.tvser);
        tv_pintai = (TextView) view.findViewById(R.id.tv_pintai);
        imastate = (ImageView) view.findViewById(R.id.imastate);
        im_pingtai = (ImageView) view.findViewById(R.id.im_pingtai);
        llserice = (LinearLayout) view.findViewById(R.id.llserice);
        llset = (LinearLayout) view.findViewById(R.id.llset);
        llzhensu = (LinearLayout) view.findViewById(R.id.llzhensu);
        llpintai = (LinearLayout) view.findViewById(R.id.llpintai);
        llzhensu.setOnClickListener(this);
        llpintai.setOnClickListener(this);
        llserice.setOnClickListener(this);
        llset.setOnClickListener(this);
        startBt.setOnClickListener(this);
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            ((MainActivity) getActivity()).navigationView.getMenu().getItem(0).setChecked(true);
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        receiver = new Receiver();
        getActivity().registerReceiver(receiver, new IntentFilter("proxyfinished"));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        getActivity().unregisterReceiver(receiver);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //com.hipu.yidian
            case R.id.send:
                String packagename = SharedPreferenceUtils.getString(getContext(), "pingtai", URL.kuaibao);
                Intent settintIntent = getContext().getPackageManager().getLaunchIntentForPackage(packagename);
                startActivity(settintIntent);
                break;
            case R.id.llserice:
                OpenAccessibilitySettingHelper.jumpToSettingPage(getContext());// 跳转到开启页面
                break;
            case R.id.llset:
                startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
                break;
            case R.id.llzhensu:
                installCert();
                break;
            case R.id.llpintai:
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("选择要采集数据的平台：");
                builder.setCancelable(true);
                final String[] lesson = new String[]{"抖音", "天天快报", "一点资讯", "今日头条", "知乎","趣头条", "惠头条", "百度新闻", "万能钥匙"};
                builder.setIcon(R.drawable.logo);
                builder.setIcon(R.drawable.logo)
                        .setItems(lesson, new DialogInterface.OnClickListener() {
                            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                switch (which) {
                                    case 0:
                                        im_pingtai.setImageDrawable(getContext().getDrawable(R.drawable.douyin));
                                        tv_pintai.setText("抖音");
                                        SharedPreferenceUtils.putString(getContext(), "pingtai", URL.douyin);
                                        break;
                                    case 1:
                                        im_pingtai.setImageDrawable(getContext().getDrawable(R.drawable.kuaibao));
                                        tv_pintai.setText("看点快报");
                                        SharedPreferenceUtils.putString(getContext(), "pingtai", URL.kuaibao);
                                        break;
                                    case 2:
                                        im_pingtai.setImageDrawable(getContext().getDrawable(R.drawable.yidianzhixun));
                                        tv_pintai.setText("一点资讯");
                                        SharedPreferenceUtils.putString(getContext(), "pingtai", URL.yidianzhixun);
                                        break;
                                    case 3:
                                        im_pingtai.setImageDrawable(getContext().getDrawable(R.drawable.toutiao));
                                        tv_pintai.setText("今日头条");
                                        SharedPreferenceUtils.putString(getContext(), "pingtai", URL.toutiao);
                                        break;
                                    case 4:
                                        im_pingtai.setImageDrawable(getContext().getDrawable(R.drawable.zhihu));
                                        tv_pintai.setText("知乎");
                                        SharedPreferenceUtils.putString(getContext(), "pingtai", URL.zhihu);
                                        break;
                                }
                                dialog.dismiss();
                            }
                        }).create();
                AlertDialog dialog = builder.create();
                dialog.show();

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }


    public class Receiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.i("~~~~", "Receiver initProxyWebView");
        }
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onResume() {
        super.onResume();
        if (!OpenAccessibilitySettingHelper.isAccessibilitySettingsOn(getContext(),
                MyAccessibilityService.class.getName())) {// 判断服务是否开启
            tvser.setText("服务关闭");
            imastate.setImageDrawable(getContext().getDrawable(R.drawable.noservise));
        } else {
            tvser.setText("服务已开启");
            imastate.setImageDrawable(getContext().getDrawable(R.drawable.yessevise));
            //do other things...
        }
    }


    public void installCert() {
        final String CERTIFICATE_RESOURCE = Environment.getExternalStorageDirectory() + "/har/littleproxy-mitm.pem";
        Toast.makeText(getActivity(), "必须安装证书才可实现HTTPS抓包", Toast.LENGTH_LONG).show();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    byte[] keychainBytes;
                    FileInputStream is = null;
                    try {
                        is = new FileInputStream(CERTIFICATE_RESOURCE);
                        keychainBytes = new byte[is.available()];
                        is.read(keychainBytes);
                    } finally {
                        IOUtils.closeQuietly(is);
                    }

                    Intent intent = KeyChain.createInstallIntent();
                    intent.putExtra(KeyChain.EXTRA_CERTIFICATE, keychainBytes);
                    intent.putExtra(KeyChain.EXTRA_NAME, "NetworkDiagnosis CA Certificate");
                    startActivityForResult(intent, 3);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        FileUtil.checkPermission(getActivity(), runnable);
    }

}
