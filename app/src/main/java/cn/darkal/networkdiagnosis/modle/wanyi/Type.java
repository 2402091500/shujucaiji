package cn.darkal.networkdiagnosis.modle.wanyi;

import java.util.HashMap;
import java.util.Map;

public enum Type {



    yule(7839,"娱乐"),
    tiyu(9062,"体育"),
    caijin(6099,"财经"),
    keji         (692,"科技"),
    shishang     (3803,"时尚"),
    junshi       (1035,"军事"),
    lishi        (9546,"历史"),
    diantai      (8239,"电台"),
    luntan       (0307,"论坛"),
    hangkong     (9612,"航空"),
    boke         (8345,"博客"),
    xingwen      (3327,"新闻"),
    lvyou        (4705,"旅游"),
    jiankang     (1036,"健康"),
    tianmao      (2433,"天猫"),
    jiaoyu       (5495,"教育"),
    nba          (5984,"NBA"),
    jingdong     (8215,"京东"),
    xingshidai   (4384,"新时代"),
    jianju       (5308,"家居"),
    shuma        (6727,"数码"),
    yinyue       (1149,"音乐");

    private final int key;
    private final String value;

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    Type(int key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * 根据key获取value
     *
     * @param key
     *            : 键值key
     * @return String
     */
    public static String getValueByKey(int key) {
        Type[] enums = Type.values();
        for (int i = 0; i < enums.length; i++) {
            if (enums[i].getKey()==(key)) {
                return enums[i].getValue();
            }
        }
        return "";
    }





}
