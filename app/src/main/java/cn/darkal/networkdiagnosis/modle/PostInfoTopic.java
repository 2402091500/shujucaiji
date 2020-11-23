package cn.darkal.networkdiagnosis.modle;

import java.util.List;

public class PostInfoTopic {

    /**
     * count : 2
     * info : [{"
     * item_title":"知识点！《习近平谈治国理政》第三卷中的方法论","
     * item_url":"/c/user/token/MS4wLjABAAAAP09LrX61xFpIWrgGdBDqkp-5om9Lans_kuIZ_ipAGRE/","
     * item_source":"头条号","
     * item_author":"新华网客户端","
     * item_domain":"时政","
     * item_type":"1","
     * create_time":"2020-10-08 00:00:00","
     * item_read":"16","
     * item_comment":"21"},]
     */

    private String count;
    private List<InfoBean> info;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<InfoBean> getInfo() {
        return info;
    }

    public void setInfo(List<InfoBean> info) {
        this.info = info;
    }

    public static class InfoBean {
        /**
         * item_title : 知识点！《习近平谈治国理政》第三卷中的方法论
         * item_url : /c/user/token/MS4wLjABAAAAP09LrX61xFpIWrgGdBDqkp-5om9Lans_kuIZ_ipAGRE/
         * item_source : 头条号
         * item_author : 新华网客户端
         * item_domain : 时政
         * item_type : 1
         * create_time : 2020-10-08 00:00:00
         * item_read : 16
         * item_comment : 21
         *
         *
         *  "itemTitle":"知识点！《习近平谈治国理政》第三卷中的方法论",
         *  "itemUrl":"/c/user/token/MS4wLjABAAAAP09LrX61xFpIWrgGdBDqkp-5om9Lans_kuIZ_ipAGRE/",
         * "itemSource":"头条号",
         *  "itemAuthor":"新华网客户端",
         * "itemDomain":"时政",
         * "itemType":"1",
         * "createTime":"2020-10-08 00:00:00",
         * "itemRead":"16",
         * "itemComment":"21"
         */

        private String itemTitle;
        private String itemUrl;
        private String itemSource;
        private String itemAuthor;
        private String itemDomain;
        private String itemType;
        private String createTime;
        private String itemRead;
        private String itemComment;
        private String topicFollowerNum;
        private String topicDiscussionNum;

        public String getTopicFollowerNum() {
            return topicFollowerNum;
        }

        public void setTopicFollowerNum(String topicFollowerNum) {
            this.topicFollowerNum = topicFollowerNum;
        }

        public String getTopicDiscussionNum() {
            return topicDiscussionNum;
        }

        public void setTopicDiscussionNum(String topicDiscussionNum) {
            this.topicDiscussionNum = topicDiscussionNum;
        }

        public String getItemTitle() {
            return itemTitle;
        }

        public void setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
        }

        public String getItemUrl() {
            return itemUrl;
        }

        public void setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
        }

        public String getItemSource() {
            return itemSource;
        }

        public void setItemSource(String itemSource) {
            this.itemSource = itemSource;
        }

        public String getItemAuthor() {
            return itemAuthor;
        }

        public void setItemAuthor(String itemAuthor) {
            this.itemAuthor = itemAuthor;
        }

        public String getItemDomain() {
            return itemDomain;
        }

        public void setItemDomain(String itemDomain) {
            this.itemDomain = itemDomain;
        }

        public String getItemType() {
            return itemType;
        }

        public void setItemType(String itemType) {
            this.itemType = itemType;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getItemRead() {
            return itemRead;
        }

        public void setItemRead(String itemRead) {
            this.itemRead = itemRead;
        }

        public String getItemComment() {
            return itemComment;
        }

        public void setItemComment(String itemComment) {
            this.itemComment = itemComment;
        }
    }
}
