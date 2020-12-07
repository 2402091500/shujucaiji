package cn.darkal.networkdiagnosis.modle.wanyi;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import cn.darkal.networkdiagnosis.modle.PostInfo;
import cn.darkal.networkdiagnosis.modle.souhu.SouHu;

public class WanYi {

    private List<JarttBean> jartt;
    private PostInfo postInfo;

    public List<JarttBean> getJartt() {
        return jartt;
    }

    public void setJartt(List<JarttBean> jartt) {
        this.jartt = jartt;
    }

    public static class JarttBean {
        /**
         * sourceId : T1348647909107
         * template : normal1
         * upTimes : 268641
         * lmodify : 2020-11-25 10:25:14
         * source : 海报新闻
         * postid : FS95FNRT0001899O
         * title : 老人将300万房产送给水果摊主 家属发声:他老年痴呆
         * mtime : 2020-11-25 10:25:14
         * hasImg : 1
         * topicid : 00019B3E
         * topic_background : http://cms-bucket.ws.126.net/2020/0422/1e44993bp00q966r20011c000u000a0c.png
         * digest : 大众网·海报新闻记者庄滨滨张海振上海报道近日，家住上海宝山区的一位八旬老人，通过意定监护的方式，将家中价值300万元的房产赠予水果摊主的新闻引发关注。11月24
         * boardid : news2_bbs
         * alias : Top News
         * hasAD : 1
         * imgsrc : http://cms-bucket.ws.126.net/2020/1125/e3b74fb8p00qkbwpu00elc000s600e3c.png
         * ptime : 2020-11-25 09:43:15
         * daynum : 18591
         * extraShowFields : [{"title":"","showDocid":"00019B3E_FS95FNRT0001899O_1"}]
         * hasHead : 1
         * order : 1
         * votecount : 268641
         * hasCover : false
         * docid : FS95FNRT0001899O
         * tname : 头条
         * url_3w :
         * priority : 100
         * url : https://3g.163.com/news/20/1125/09/FS95FNRT0001899O.html
         * quality : 80
         * commentStatus : 1
         * ads : [{"subtitle":"","skipType":"photoset","skipID":"00AP0001|2310630","tag":"photoset","title":"14岁男孩身高221.03厘米 成世界最高青少年","imgsrc":"http://cms-bucket.ws.126.net/2020/1118/8dae7151j00qjz7po0035c000s600e3c.jpg","url":"00AP0001|2310630"},{"subtitle":"","skipType":"photoset","skipID":"00AO0001|2310629","tag":"photoset","title":"德国天气寒冷 天鹅坐船前往无冰水域","imgsrc":"http://pic-bucket.ws.126.net/photo/0001/2020-11-18/FRN9R12M00AO0001NOS.jpg","url":"00AO0001|2310629"},{"subtitle":"","skipType":"photoset","skipID":"00AO0001|2310621","tag":"photoset","title":"西伯利亚上学艰难！大学生爬树找信号上课","imgsrc":"http://cms-bucket.ws.126.net/2020/1117/9db79cfej00qjx91m002kc000s600e3c.jpg","url":"00AO0001|2310621"},{"subtitle":"","skipType":"photoset","skipID":"00AP0001|2310526","tag":"photoset","title":"飞行汽车首次试飞 速度高达200公里/小时","imgsrc":"http://cms-bucket.ws.126.net/2020/1104/bbc51bb1j00qj9fsk002dc000s600e3c.jpg","url":"00AP0001|2310526"},{"subtitle":"","skipType":"photoset","skipID":"00AO0001|2310519","tag":"photoset","title":"美国东部16个州投票结束 开始关闭投票站","imgsrc":"http://pic-bucket.ws.126.net/photo/0001/2020-11-04/FQJ4PGAS00AO0001NOS.jpg","url":"00AO0001|2310519"}]
         * ename : androidnews
         * replyCount : 273423
         * ltitle : 老人将300万房产送给水果摊主 家属发声:他老年痴呆
         * hasIcon : false
         * subtitle :
         * cid : C1348646712614
         */

        private String sourceId;
        private String template;
        private int upTimes;
        private String lmodify;
        private String source;
        private String postid;
        private String title;
        private String mtime;
        private int hasImg;
        private String topicid;
        private String topic_background;
        private String digest;
        private String boardid;
        private String alias;
        private int hasAD;
        private String imgsrc;
        private String ptime;
        private String daynum;
        private String extraShowFields;
        private int hasHead;
        private int order;
        private int votecount;
        private boolean hasCover;
        private String docid;
        private String tname;
        private String url_3w;
        private int priority;
        private String url;
        private int quality;
        private int commentStatus;
        private String ename;
        private int replyCount;
        private String ltitle;
        private boolean hasIcon;
        private String subtitle;
        private String cid;
        private List<AdsBean> ads;

        public String getSourceId() {
            return sourceId;
        }

        public void setSourceId(String sourceId) {
            this.sourceId = sourceId;
        }

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public int getUpTimes() {
            return upTimes;
        }

        public void setUpTimes(int upTimes) {
            this.upTimes = upTimes;
        }

        public String getLmodify() {
            return lmodify;
        }

        public void setLmodify(String lmodify) {
            this.lmodify = lmodify;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getPostid() {
            return postid;
        }

        public void setPostid(String postid) {
            this.postid = postid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getMtime() {
            return mtime;
        }

        public void setMtime(String mtime) {
            this.mtime = mtime;
        }

        public int getHasImg() {
            return hasImg;
        }

        public void setHasImg(int hasImg) {
            this.hasImg = hasImg;
        }

        public String getTopicid() {
            return topicid;
        }

        public void setTopicid(String topicid) {
            this.topicid = topicid;
        }

        public String getTopic_background() {
            return topic_background;
        }

        public void setTopic_background(String topic_background) {
            this.topic_background = topic_background;
        }

        public String getDigest() {
            return digest;
        }

        public void setDigest(String digest) {
            this.digest = digest;
        }

        public String getBoardid() {
            return boardid;
        }

        public void setBoardid(String boardid) {
            this.boardid = boardid;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public int getHasAD() {
            return hasAD;
        }

        public void setHasAD(int hasAD) {
            this.hasAD = hasAD;
        }

        public String getImgsrc() {
            return imgsrc;
        }

        public void setImgsrc(String imgsrc) {
            this.imgsrc = imgsrc;
        }

        public String getPtime() {
            return ptime;
        }

        public void setPtime(String ptime) {
            this.ptime = ptime;
        }

        public String getDaynum() {
            return daynum;
        }

        public void setDaynum(String daynum) {
            this.daynum = daynum;
        }

        public String getExtraShowFields() {
            return extraShowFields;
        }

        public void setExtraShowFields(String extraShowFields) {
            this.extraShowFields = extraShowFields;
        }

        public int getHasHead() {
            return hasHead;
        }

        public void setHasHead(int hasHead) {
            this.hasHead = hasHead;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getVotecount() {
            return votecount;
        }

        public void setVotecount(int votecount) {
            this.votecount = votecount;
        }

        public boolean isHasCover() {
            return hasCover;
        }

        public void setHasCover(boolean hasCover) {
            this.hasCover = hasCover;
        }

        public String getDocid() {
            return docid;
        }

        public void setDocid(String docid) {
            this.docid = docid;
        }

        public String getTname() {
            return tname;
        }

        public void setTname(String tname) {
            this.tname = tname;
        }

        public String getUrl_3w() {
            return url_3w;
        }

        public void setUrl_3w(String url_3w) {
            this.url_3w = url_3w;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getQuality() {
            return quality;
        }

        public void setQuality(int quality) {
            this.quality = quality;
        }

        public int getCommentStatus() {
            return commentStatus;
        }

        public void setCommentStatus(int commentStatus) {
            this.commentStatus = commentStatus;
        }

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public int getReplyCount() {
            return replyCount;
        }

        public void setReplyCount(int replyCount) {
            this.replyCount = replyCount;
        }

        public String getLtitle() {
            return ltitle;
        }

        public void setLtitle(String ltitle) {
            this.ltitle = ltitle;
        }

        public boolean isHasIcon() {
            return hasIcon;
        }

        public void setHasIcon(boolean hasIcon) {
            this.hasIcon = hasIcon;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public List<AdsBean> getAds() {
            return ads;
        }

        public void setAds(List<AdsBean> ads) {
            this.ads = ads;
        }

        public static class AdsBean {
            /**
             * subtitle :
             * skipType : photoset
             * skipID : 00AP0001|2310630
             * tag : photoset
             * title : 14岁男孩身高221.03厘米 成世界最高青少年
             * imgsrc : http://cms-bucket.ws.126.net/2020/1118/8dae7151j00qjz7po0035c000s600e3c.jpg
             * url : 00AP0001|2310630
             */

            private String subtitle;
            private String skipType;
            private String skipID;
            private String tag;
            private String title;
            private String imgsrc;
            private String url;

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getSkipType() {
                return skipType;
            }

            public void setSkipType(String skipType) {
                this.skipType = skipType;
            }

            public String getSkipID() {
                return skipID;
            }

            public void setSkipID(String skipID) {
                this.skipID = skipID;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImgsrc() {
                return imgsrc;
            }

            public void setImgsrc(String imgsrc) {
                this.imgsrc = imgsrc;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }

    public PostInfo getdata(){
        postInfo=new PostInfo();
        if(this.jartt==null){
            return null;
        }
        postInfo.setCount(this.jartt.size()+"");
        ArrayList<PostInfo.InfoBean> postinfobeanlist=new ArrayList<>();
        for (WanYi.JarttBean b:jartt
        ) {
            PostInfo.InfoBean bean=new PostInfo.InfoBean();
            bean.setCreateTime(b.getPtime());
            bean.setItemAuthor(b.getSource());
            String skey = b.getSourceId();
            skey=skey.substring(10,skey.length());
            Log.i("skey",skey);

            bean.setItemDomain(Type.getValueByKey(Integer.parseInt(skey)));
            bean.setItemType("1");
            bean.setItemTitle(b.getTitle());
            bean.setItemSource("网易");
            bean.setItemUrl(b.getUrl());
            bean.setItemComment(b.getReplyCount()+"");
            bean.setItemRead(b.getVotecount()+"");
            postinfobeanlist.add(bean);
        }
        postInfo.setInfo(postinfobeanlist);
        return postInfo;
    }
}
