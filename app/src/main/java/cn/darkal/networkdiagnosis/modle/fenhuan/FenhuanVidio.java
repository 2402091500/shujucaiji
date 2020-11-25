package cn.darkal.networkdiagnosis.modle.fenhuan;

import java.util.ArrayList;
import java.util.List;

import cn.darkal.networkdiagnosis.Utils.DateUtil;
import cn.darkal.networkdiagnosis.modle.PostInfoVido;

public class FenhuanVidio {

    public String listId;
    private List<ItemBean> item;
    private PostInfoVido postInfo;

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public PostInfoVido getPostInfo() {
        return postInfo;
    }

    public void setPostInfo(PostInfoVido postInfo) {
        this.postInfo = postInfo;
    }

    public List<ItemBean> getItem() {
        return item;
    }

    public void setItem(List<ItemBean> item) {
        this.item = item;
    }

    public static class ItemBean {
        /**
         * type : phvideo
         * id : 90205680-df76-40e5-81a4-faa1766d99fc
         * thumbnail : https://d.ifengimg.com/w690_h346_q100_webp/x0.ifengimg.com/res/2020/997F7E320AEB5E059EDC58656E27DD4548B96A3B_size15_w696_h319.jpeg.webp
         * title : 黄渤给孙红雷颁奖词太搞笑啦，孙红雷的致词笑翻所有明星
         * source : 轻松十刻钟
         * subscribe : {"cateid":1579512,"catename":"轻松十刻钟","type":"vampire","description":"精彩的搞笑内容大看点","logo":"http://d.ifengimg.com/q100/img1.ugc.ifeng.com/newugc/20200106/15/wemedia/914d4033b0122c1a23ddd14ab1be7d5cb63129c8_size81_w200_h200.png","honorImg":"https://x0.ifengimg.com/cmpp/2020/1012/877079c2abbb417size5_w66_h66.png","honorImg_night":"https://x0.ifengimg.com/cmpp/2020/1010/faa6b03c33a1709size5_w66_h66.png","redirectTab":"video","originalName":"","cateSource":"","forbidFollow":"0","forbidJump":"0","showDescription":"1"}
         * updateTime : 2020/08/13 00:15:00
         * documentId : 90205680-df76-40e5-81a4-faa1766d99fc
         * staticId : video_90205680-df76-40e5-81a4-faa1766d99fc
         * style : {"view":"videobigimg","backreason":["0_不感兴趣","0_来源：轻松十刻钟","c_娱乐","sc_娱乐其他"],"defaultreason":"0_不感兴趣"}
         * commentsUrl : 90205680-df76-40e5-81a4-faa1766d99fc
         * comments : 1
         * commentsall : 4
         * link : {"type":"phvideo","url":"90205680-df76-40e5-81a4-faa1766d99fc","weburl":"https://ishare.ifeng.com/c/s/v004M-_RbrunjssSi2X2DMk2ogoPGpsG5-_wM8ZzGi4m1VhEvMIwTkwaQVIIhmK8bO9htmh4qbNsBw-_dq84OUI-_tZKIQ____?spss=np","openType":"1","vid":"90205680-df76-40e5-81a4-faa1766d99fc","mp4":"http://ips.ifeng.com/video19.ifeng.com/video09/2020/08/13/s46725038-102-9987642-001634.mp4?ifsign=1","staticId":"video_90205680-df76-40e5-81a4-faa1766d99fc"}
         * reftype : ai|video_7yt1tX3lJSw|||||%E5%A8%B1%E4%B9%90-%E6%98%8E%E6%98%9F%E8%BF%91%E6%9C%9F%E5%8A%A8%E6%80%81|%7B%22flatResults%22%3A%5B%22%E5%8A%A8%E6%80%81%E6%B4%BB%E5%8A%A8%22%2C%22%E5%AD%99%E7%BA%A2%E9%9B%B7%22%2C%22%E9%BB%84%E6%B8%A4%22%5D%7D
         * intro :
         * simId : clusterId_1nmYTcAGhdI
         * recomToken : d1c302b582b14982-450538efe1df4b4ba69b3354b5bc407b
         * statisticTag :
         * phvideo : {"channelName":"轻松十刻钟","columnid":"1579512","path":"27-95283-95287-","filesize":"8804","aspect":"320:147","length":164,"previewlength":0,"preview":0,"currentPlay":0,"completePlay":"0","videoPlayUrl":"http://ips.ifeng.com/video19.ifeng.com/video09/2020/08/13/s46725038-102-9987642-001634.mp4?ifsign=1","playTime":"11568","praise":"1","tread":"0","playTimeStr":"1.2万次播放","grade":"热度6.2"}
         * appSource : 专柜正品1折秒杀
         * adId : iis_feather_23090_57600_2738523_BB29C084C000C080_1606206528084_lahvmb
         * adPositionId : 10023090
         * pid : 10023090
         * icon : {"showIcon":1,"text":"广告"}
         * h5text : 立即购买
         * adError : 1
         * errorText : no  addata
         */

        private String type;
        private String id;
        private String thumbnail;
        private String title;
        private String source;
        private SubscribeBean subscribe;
        private String updateTime;
        private String documentId;
        private String staticId;
        private StyleBean style;
        private String commentsUrl;
        private String comments;
        private String commentsall;
        private LinkBean link;
        private String reftype;
        private String intro;
        private String simId;
        private String recomToken;
        private String statisticTag;
        private PhvideoBean phvideo;
        private String appSource;
        private String adId;
        private String adPositionId;
        private String pid;
        private IconBean icon;
        private String h5text;
        private int adError;
        private String errorText;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public SubscribeBean getSubscribe() {
            return subscribe;
        }

        public void setSubscribe(SubscribeBean subscribe) {
            this.subscribe = subscribe;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getDocumentId() {
            return documentId;
        }

        public void setDocumentId(String documentId) {
            this.documentId = documentId;
        }

        public String getStaticId() {
            return staticId;
        }

        public void setStaticId(String staticId) {
            this.staticId = staticId;
        }

        public StyleBean getStyle() {
            return style;
        }

        public void setStyle(StyleBean style) {
            this.style = style;
        }

        public String getCommentsUrl() {
            return commentsUrl;
        }

        public void setCommentsUrl(String commentsUrl) {
            this.commentsUrl = commentsUrl;
        }

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

        public String getCommentsall() {
            return commentsall;
        }

        public void setCommentsall(String commentsall) {
            this.commentsall = commentsall;
        }

        public LinkBean getLink() {
            return link;
        }

        public void setLink(LinkBean link) {
            this.link = link;
        }

        public String getReftype() {
            return reftype;
        }

        public void setReftype(String reftype) {
            this.reftype = reftype;
        }

        public String getIntro() {
            return intro;
        }

        public void setIntro(String intro) {
            this.intro = intro;
        }

        public String getSimId() {
            return simId;
        }

        public void setSimId(String simId) {
            this.simId = simId;
        }

        public String getRecomToken() {
            return recomToken;
        }

        public void setRecomToken(String recomToken) {
            this.recomToken = recomToken;
        }

        public String getStatisticTag() {
            return statisticTag;
        }

        public void setStatisticTag(String statisticTag) {
            this.statisticTag = statisticTag;
        }

        public PhvideoBean getPhvideo() {
            return phvideo;
        }

        public void setPhvideo(PhvideoBean phvideo) {
            this.phvideo = phvideo;
        }

        public String getAppSource() {
            return appSource;
        }

        public void setAppSource(String appSource) {
            this.appSource = appSource;
        }

        public String getAdId() {
            return adId;
        }

        public void setAdId(String adId) {
            this.adId = adId;
        }

        public String getAdPositionId() {
            return adPositionId;
        }

        public void setAdPositionId(String adPositionId) {
            this.adPositionId = adPositionId;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public IconBean getIcon() {
            return icon;
        }

        public void setIcon(IconBean icon) {
            this.icon = icon;
        }

        public String getH5text() {
            return h5text;
        }

        public void setH5text(String h5text) {
            this.h5text = h5text;
        }

        public int getAdError() {
            return adError;
        }

        public void setAdError(int adError) {
            this.adError = adError;
        }

        public String getErrorText() {
            return errorText;
        }

        public void setErrorText(String errorText) {
            this.errorText = errorText;
        }

        public static class SubscribeBean {
            /**
             * cateid : 1579512
             * catename : 轻松十刻钟
             * type : vampire
             * description : 精彩的搞笑内容大看点
             * logo : http://d.ifengimg.com/q100/img1.ugc.ifeng.com/newugc/20200106/15/wemedia/914d4033b0122c1a23ddd14ab1be7d5cb63129c8_size81_w200_h200.png
             * honorImg : https://x0.ifengimg.com/cmpp/2020/1012/877079c2abbb417size5_w66_h66.png
             * honorImg_night : https://x0.ifengimg.com/cmpp/2020/1010/faa6b03c33a1709size5_w66_h66.png
             * redirectTab : video
             * originalName :
             * cateSource :
             * forbidFollow : 0
             * forbidJump : 0
             * showDescription : 1
             */

            private int cateid;
            private String catename;
            private String type;
            private String description;
            private String logo;
            private String honorImg;
            private String honorImg_night;
            private String redirectTab;
            private String originalName;
            private String cateSource;
            private String forbidFollow;
            private String forbidJump;
            private String showDescription;

            public int getCateid() {
                return cateid;
            }

            public void setCateid(int cateid) {
                this.cateid = cateid;
            }

            public String getCatename() {
                return catename;
            }

            public void setCatename(String catename) {
                this.catename = catename;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHonorImg() {
                return honorImg;
            }

            public void setHonorImg(String honorImg) {
                this.honorImg = honorImg;
            }

            public String getHonorImg_night() {
                return honorImg_night;
            }

            public void setHonorImg_night(String honorImg_night) {
                this.honorImg_night = honorImg_night;
            }

            public String getRedirectTab() {
                return redirectTab;
            }

            public void setRedirectTab(String redirectTab) {
                this.redirectTab = redirectTab;
            }

            public String getOriginalName() {
                return originalName;
            }

            public void setOriginalName(String originalName) {
                this.originalName = originalName;
            }

            public String getCateSource() {
                return cateSource;
            }

            public void setCateSource(String cateSource) {
                this.cateSource = cateSource;
            }

            public String getForbidFollow() {
                return forbidFollow;
            }

            public void setForbidFollow(String forbidFollow) {
                this.forbidFollow = forbidFollow;
            }

            public String getForbidJump() {
                return forbidJump;
            }

            public void setForbidJump(String forbidJump) {
                this.forbidJump = forbidJump;
            }

            public String getShowDescription() {
                return showDescription;
            }

            public void setShowDescription(String showDescription) {
                this.showDescription = showDescription;
            }
        }

        public static class StyleBean {
            /**
             * view : videobigimg
             * backreason : ["0_不感兴趣","0_来源：轻松十刻钟","c_娱乐","sc_娱乐其他"]
             * defaultreason : 0_不感兴趣
             */

            private String view;
            private String defaultreason;
            private List<String> backreason;

            public String getView() {
                return view;
            }

            public void setView(String view) {
                this.view = view;
            }

            public String getDefaultreason() {
                return defaultreason;
            }

            public void setDefaultreason(String defaultreason) {
                this.defaultreason = defaultreason;
            }

            public List<String> getBackreason() {
                return backreason;
            }

            public void setBackreason(List<String> backreason) {
                this.backreason = backreason;
            }
        }

        public static class LinkBean {
            /**
             * type : phvideo
             * url : 90205680-df76-40e5-81a4-faa1766d99fc
             * weburl : https://ishare.ifeng.com/c/s/v004M-_RbrunjssSi2X2DMk2ogoPGpsG5-_wM8ZzGi4m1VhEvMIwTkwaQVIIhmK8bO9htmh4qbNsBw-_dq84OUI-_tZKIQ____?spss=np
             * openType : 1
             * vid : 90205680-df76-40e5-81a4-faa1766d99fc
             * mp4 : http://ips.ifeng.com/video19.ifeng.com/video09/2020/08/13/s46725038-102-9987642-001634.mp4?ifsign=1
             * staticId : video_90205680-df76-40e5-81a4-faa1766d99fc
             */

            private String type;
            private String url;
            private String weburl;
            private String openType;
            private String vid;
            private String mp4;
            private String staticId;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getWeburl() {
                return weburl;
            }

            public void setWeburl(String weburl) {
                this.weburl = weburl;
            }

            public String getOpenType() {
                return openType;
            }

            public void setOpenType(String openType) {
                this.openType = openType;
            }

            public String getVid() {
                return vid;
            }

            public void setVid(String vid) {
                this.vid = vid;
            }

            public String getMp4() {
                return mp4;
            }

            public void setMp4(String mp4) {
                this.mp4 = mp4;
            }

            public String getStaticId() {
                return staticId;
            }

            public void setStaticId(String staticId) {
                this.staticId = staticId;
            }
        }

        public static class PhvideoBean {
            /**
             * channelName : 轻松十刻钟
             * columnid : 1579512
             * path : 27-95283-95287-
             * filesize : 8804
             * aspect : 320:147
             * length : 164
             * previewlength : 0
             * preview : 0
             * currentPlay : 0
             * completePlay : 0
             * videoPlayUrl : http://ips.ifeng.com/video19.ifeng.com/video09/2020/08/13/s46725038-102-9987642-001634.mp4?ifsign=1
             * playTime : 11568
             * praise : 1
             * tread : 0
             * playTimeStr : 1.2万次播放
             * grade : 热度6.2
             */

            private String channelName;
            private String columnid;
            private String path;
            private String filesize;
            private String aspect;
            private int length;
            private int previewlength;
            private int preview;
            private int currentPlay;
            private String completePlay;
            private String videoPlayUrl;
            private String playTime;
            private String praise;
            private String tread;
            private String playTimeStr;
            private String grade;

            public String getChannelName() {
                return channelName;
            }

            public void setChannelName(String channelName) {
                this.channelName = channelName;
            }

            public String getColumnid() {
                return columnid;
            }

            public void setColumnid(String columnid) {
                this.columnid = columnid;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public String getFilesize() {
                return filesize;
            }

            public void setFilesize(String filesize) {
                this.filesize = filesize;
            }

            public String getAspect() {
                return aspect;
            }

            public void setAspect(String aspect) {
                this.aspect = aspect;
            }

            public int getLength() {
                return length;
            }

            public void setLength(int length) {
                this.length = length;
            }

            public int getPreviewlength() {
                return previewlength;
            }

            public void setPreviewlength(int previewlength) {
                this.previewlength = previewlength;
            }

            public int getPreview() {
                return preview;
            }

            public void setPreview(int preview) {
                this.preview = preview;
            }

            public int getCurrentPlay() {
                return currentPlay;
            }

            public void setCurrentPlay(int currentPlay) {
                this.currentPlay = currentPlay;
            }

            public String getCompletePlay() {
                return completePlay;
            }

            public void setCompletePlay(String completePlay) {
                this.completePlay = completePlay;
            }

            public String getVideoPlayUrl() {
                return videoPlayUrl;
            }

            public void setVideoPlayUrl(String videoPlayUrl) {
                this.videoPlayUrl = videoPlayUrl;
            }

            public String getPlayTime() {
                return playTime;
            }

            public void setPlayTime(String playTime) {
                this.playTime = playTime;
            }

            public String getPraise() {
                return praise;
            }

            public void setPraise(String praise) {
                this.praise = praise;
            }

            public String getTread() {
                return tread;
            }

            public void setTread(String tread) {
                this.tread = tread;
            }

            public String getPlayTimeStr() {
                return playTimeStr;
            }

            public void setPlayTimeStr(String playTimeStr) {
                this.playTimeStr = playTimeStr;
            }

            public String getGrade() {
                return grade;
            }

            public void setGrade(String grade) {
                this.grade = grade;
            }
        }

        public static class IconBean {
            /**
             * showIcon : 1
             * text : 广告
             */

            private int showIcon;
            private String text;

            public int getShowIcon() {
                return showIcon;
            }

            public void setShowIcon(int showIcon) {
                this.showIcon = showIcon;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }
    }

    public PostInfoVido getdata(){
        postInfo=new PostInfoVido();
        if(this.item==null){
            return null;
        }
        postInfo.setCount(this.item.size()+"");
        ArrayList<PostInfoVido.InfoBean> postinfobeanlist=new ArrayList<>();
        for (FenhuanVidio.ItemBean b:item
        ) {
            if(b==null||b.getPhvideo()==null||b.getLink()==null){
                continue;
            }
            PostInfoVido.InfoBean bean=new PostInfoVido.InfoBean();
            bean.setCreateTime(b.getUpdateTime()+"");
            bean.setItemAuthor(b.getSource());

            if(b.getSubscribe()!=null){
                bean.setItemDomain(b.getSubscribe().getDescription());
            }else {
                bean.setItemDomain(getListId());

            }
            bean.setItemType("1");
            bean.setItemTitle(b.getTitle());
            bean.setItemSource("凤凰新闻");
            bean.setItemUrl(b.getLink().getWeburl());
            bean.setItemComment(b.getComments()+"");
            bean.setItemRead((b.getCommentsall()+""));
            bean.setItemVideoUrl(b.getLink().getMp4());
            bean.setVideoDuration(b.getPhvideo().getLength()+"");
            bean.setItemVideoCover(b.getThumbnail());
            postinfobeanlist.add(bean);
        }
        postInfo.setInfo(postinfobeanlist);
        return postInfo;
    }
}
