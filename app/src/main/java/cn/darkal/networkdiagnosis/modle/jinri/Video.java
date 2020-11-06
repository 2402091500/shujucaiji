package cn.darkal.networkdiagnosis.modle.jinri;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import cn.darkal.networkdiagnosis.modle.PostInfo;

public class Video {



    private List<DataBean> data;
    private PostInfo postInfo;




    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }


    public static class DataBean {


        private ContentBean content;

        public ContentBean getContent() {
            return content;
        }

        public void setContent(ContentBean content) {
            this.content = content;
        }


        public static class ContentBean {
            /**
             * abstract :
             * action_extra : {"channel_id":3431225546}
             * action_list : [{"action":1,"desc":"","extra":{}},{"action":3,"desc":"","extra":{}},{"action":7,"desc":"","extra":{}},{"action":9,"desc":"","extra":{}}]
             * aggr_type : 1
             * allow_download : false
             * article_sub_type : 0
             * article_type : 0
             * article_url : http://toutiao.com/group/6886969624714281476/
             * ban_comment : 0
             * ban_danmaku : 1
             * ban_danmaku_send : 0
             * ban_immersive : 0
             * behot_time : 1604470255
             * bury_count : 5
             * bury_style_show : 0
             * can_comment_level : 0
             * categories : ["video_military"]
             * cell_flag : 262155
             * cell_layout_style : 1
             * cell_type : 0
             * comment_count : 22
             * composition : 256
             * content_decoration :
             * cursor : 1604470255999
             * danmaku_count : 0
             * data_type : 1
             * default_danmaku : 0
             * detail_schema :
             * digg_count : 849
             * display_url : http://toutiao.com/group/6886969624714281476/
             * extension_type : 2
             * extensions : [{"Button":null,"DisplayDuration":null,"Extra":{"total":"23"},"GroupId":6886360842749608451,"ImgUrl":"http://p9-tt.byteimg.com/large/tos-cn-i-0004/fcd380145fcb4438ae078d78167237b7","InsertTime":null,"Schema":null,"Text":null,"Title":"中国军魂：不畏强敌，抵御外辱，我们该记住他们","Type":2}]
             * filter_words : [{"id":"8:0","is_selected":false,"name":"看过了"},{"id":"9:1","is_selected":false,"name":"内容太水"},{"id":"5:3050353677","is_selected":false,"name":"拉黑作者:苇说历史真相"},{"id":"6:37358","is_selected":false,"name":"不想看:抗美援朝"}]
             * first_frame_image : {"height":486,"uri":"img/mosaic-legacy/3586b00096d02feb0f870~c5_q75_864x486.jpeg","url":"http://p1-tt-ipv6.byteimg.com/img/mosaic-legacy/3586b00096d02feb0f870~c5_q75_864x486.jpeg","url_list":[{"url":"http://p1-tt-ipv6.byteimg.com/img/mosaic-legacy/3586b00096d02feb0f870~c5_q75_864x486.jpeg"},{"url":"http://p1-tt-ipv6.byteimg.com/img/mosaic-legacy/3586b00096d02feb0f870~c5_q75_864x486.jpeg"},{"url":"http://p1-tt-ipv6.byteimg.com/img/mosaic-legacy/3586b00096d02feb0f870~c5_q75_864x486.jpeg"}],"width":864}
             * followers_count : 232338
             * forward_info : {"forward_count":5}
             * gid : 6886969624714281476
             * group_flags : 32832
             * group_id : 6886969624714281476
             * group_source : 2
             * has_m3u8_video : false
             * has_mp4_video : 0
             * has_video : true
             * history_duration : 0
             * hot : 0
             * id : 6886969624714281476
             * ignore_web_transform : 0
             * impression_count : 6297540
             * interaction_data :
             * is_key_video : false
             * is_original : true
             * is_subject : false
             * is_subscribe : false
             * item_id : 6886969624714281476
             * item_version : 0
             * large_image_list : [{"height":326,"uri":"video1609/tos-cn-i-0004/ad2b8dec65134534ab8fe9c6c1a72eb6","url":"http://p3-tt.byteimg.com/video1609/tos-cn-i-0004/ad2b8dec65134534ab8fe9c6c1a72eb6","url_list":[{"url":"http://p3-tt.byteimg.com/video1609/tos-cn-i-0004/ad2b8dec65134534ab8fe9c6c1a72eb6"},{"url":"http://p9-tt.byteimg.com/video1609/tos-cn-i-0004/ad2b8dec65134534ab8fe9c6c1a72eb6"},{"url":"http://p9-tt.byteimg.com/video1609/tos-cn-i-0004/ad2b8dec65134534ab8fe9c6c1a72eb6"}],"width":580}]
             * level : 0
             * log_pb : {"album_id":"6886360842749608451","album_type":"18","impr_id":"2020110414105501020405909337065483","is_following":"0"}
             * media_info : {"avatar_url":"https://sf1-ttcdn-tos.pstatp.com/img/pgc-image/150e7343f33a4bb19ad6d1b600e6e86c~360x360.image","media_id":50011210270,"name":"苇说历史真相","subcribed":0,"subscribed":0,"user_id":50012123223,"user_verified":true,"verified_content":"优质历史领域创作者"}
             * media_name : 苇说历史真相
             * middle_image : {"height":2503,"uri":"list/tos-cn-i-0004/ad2b8dec65134534ab8fe9c6c1a72eb6","url":"http://p3-tt.byteimg.com/list/300x196/tos-cn-i-0004/ad2b8dec65134534ab8fe9c6c1a72eb6.webp","url_list":[{"url":"http://p3-tt.byteimg.com/list/300x196/tos-cn-i-0004/ad2b8dec65134534ab8fe9c6c1a72eb6.webp"},{"url":"http://p9-tt.byteimg.com/list/300x196/tos-cn-i-0004/ad2b8dec65134534ab8fe9c6c1a72eb6.webp"},{"url":"http://p9-tt.byteimg.com/list/300x196/tos-cn-i-0004/ad2b8dec65134534ab8fe9c6c1a72eb6.webp"}],"width":4450}
             * near_id : 6886948890579328000
             * near_id2 : 6886948890579344384
             * near_id3 : 0
             * need_client_impr_recycle : 1
             * opcat_activity : null
             * play_auth_token : HMAC-SHA1:2.0:1604643055771445119:bab42eac5b9e4a8eb25a91fc371ad533:7aFbT4kLJOkfdxXuCgYX1+4WLL8=
             * play_biz_token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2MDQ2NDMwNTUsInZlciI6InYxIiwiYWsiOiJiYWI0MmVhYzViOWU0YThlYjI1YTkxZmMzNzFhZDUzMyIsInN1YiI6InBnY18xMDgwcCJ9.p_OtKL21eIXtse0lVFipolpTVnm0RbWiM25nAJRLlV0
             * pread_params : {"group_id":6886969624714281476,"item_id":6886969624714281476,"media_id":50011210270,"channel_id":3431225546,"category_tag":"video_military","from_category":"video","is_gov_article":false,"display_flags":0,"review_comment_mode":1,"group_source":2,"categories":["video_military"],"video_duration":166,"rec_quality":0,"title":"抗美援朝我们共投入240万兵力，但你知道五次战役分别投入多少吗"}
             * pseries : {"id":6886360842749608451,"is_favourite":false,"is_latest":false,"large_image_list":[{"height":486,"uri":"img/tos-cn-i-0004/fcd380145fcb4438ae078d78167237b7~c5_q75_864x486.jpeg","url":"http://p6-tt-ipv6.byteimg.com/img/tos-cn-i-0004/fcd380145fcb4438ae078d78167237b7~c5_q75_864x486.jpeg","url_list":[{"url":"http://p6-tt-ipv6.byteimg.com/img/tos-cn-i-0004/fcd380145fcb4438ae078d78167237b7~c5_q75_864x486.jpeg"},{"url":"http://p6-tt-ipv6.byteimg.com/img/tos-cn-i-0004/fcd380145fcb4438ae078d78167237b7~c5_q75_864x486.jpeg"},{"url":"http://p6-tt-ipv6.byteimg.com/img/tos-cn-i-0004/fcd380145fcb4438ae078d78167237b7~c5_q75_864x486.jpeg"}],"width":864}],"middle_image":{"height":324,"uri":"img/tos-cn-i-0004/fcd380145fcb4438ae078d78167237b7~c5_q75_576x324.jpeg","url":"http://p6-tt-ipv6.byteimg.com/img/tos-cn-i-0004/fcd380145fcb4438ae078d78167237b7~c5_q75_576x324.jpeg","url_list":[{"url":"http://p6-tt-ipv6.byteimg.com/img/tos-cn-i-0004/fcd380145fcb4438ae078d78167237b7~c5_q75_576x324.jpeg"},{"url":"http://p6-tt-ipv6.byteimg.com/img/tos-cn-i-0004/fcd380145fcb4438ae078d78167237b7~c5_q75_576x324.jpeg"},{"url":"http://p6-tt-ipv6.byteimg.com/img/tos-cn-i-0004/fcd380145fcb4438ae078d78167237b7~c5_q75_576x324.jpeg"}],"width":576},"title":"中国军魂：不畏强敌，抵御外辱，我们该记住他们","total":23}
             * pseries_rank : 20
             * publish_time : 1603497570
             * rank : 0
             * read_count : 90617
             * repin_count : 573
             * req_id : 2020110414105501020405909337065483
             * rid : 2020110414105501020405909337065483
             * share_count : 538
             * share_info : {"cover_image":null,"description":null,"hidden_url":null,"on_suppress":0,"share_control":{"image":"false","video":"false"},"share_type":{"pyq":3,"qq":3,"qzone":3,"wx":3},"share_url":"https://m.toutiaoimg.cn/a6886969624714281476/?app=news_article_liteu0026is_hit_share_recommend=0","title":"抗美援朝我们共投入240万兵力，但你知道五次战役分别投入多少吗","token_type":1,"video_url":"","weixin_cover_image":{"height":966,"uri":"large/tos-cn-i-0000/1d1b6f92-158c-11eb-9c05-00163e144030","url":"http://p1-tt.byteimg.com/large/tos-cn-i-0000/1d1b6f92-158c-11eb-9c05-00163e144030","url_list":[{"url":"http://p1-tt.byteimg.com/large/tos-cn-i-0000/1d1b6f92-158c-11eb-9c05-00163e144030"},{"url":"http://p3-tt.byteimg.com/large/tos-cn-i-0000/1d1b6f92-158c-11eb-9c05-00163e144030"},{"url":"http://p3-tt.byteimg.com/large/tos-cn-i-0000/1d1b6f92-158c-11eb-9c05-00163e144030"}],"width":1125}}
             * share_type : 2
             * share_url : https://m.toutiaoimg.cn/a6886969624714281476/?app=news_article_liteu0026is_hit_share_recommend=0
             * show_dislike : true
             * show_portrait : false
             * show_portrait_article : false
             * small_image : null
             * source : 苇说历史真相
             * source_icon_style : 6
             * source_open_url : sslocal://profile?refer=videou0026uid=50012123223
             * tag : video_military
             * tip : 0
             * title : 抗美援朝我们共投入240万兵力，但你知道五次战役分别投入多少吗
             * ugc_recommend : {"activity":"","reason":"优质历史领域创作者"}
             * url : http://toutiao.com/group/6886969624714281476/
             * user_repin : 0
             * user_verified : 1
             * verified_content : 优质历史领域创作者
             * verify_reason :
             * verify_status : 0
             * video_detail_info : {"detail_video_large_image":{"height":326,"uri":"video1609/tos-cn-i-0004/ad2b8dec65134534ab8fe9c6c1a72eb6","url":"http://p3-tt.byteimg.com/video1609/tos-cn-i-0004/ad2b8dec65134534ab8fe9c6c1a72eb6","url_list":[{"url":"http://p3-tt.byteimg.com/video1609/tos-cn-i-0004/ad2b8dec65134534ab8fe9c6c1a72eb6"},{"url":"http://p9-tt.byteimg.com/video1609/tos-cn-i-0004/ad2b8dec65134534ab8fe9c6c1a72eb6"},{"url":"http://p9-tt.byteimg.com/video1609/tos-cn-i-0004/ad2b8dec65134534ab8fe9c6c1a72eb6"}],"width":580},"direct_play":1,"group_flags":32832,"last_play_duration":0,"show_pgc_subscribe":1,"use_last_duration":false,"video_id":"v03004150000bu9mr33fnepurjpvj000","video_preloading_flag":1,"video_type":0,"video_watch_count":146178}
             * video_duration : 166
             * video_exclusive : false
             * video_id : v03004150000bu9mr33fnepurjpvj000
             * video_like_count : 849
             * video_play_info : {"status":10,"message":"success","video_duration":166.832,"validate":"","enable_ssl":true,"enable_adaptive":true,"poster_url":"http://p3-tt.bytecdn.cn/obj/tos-cn-p-0000/bf27445eb4424c23a1411f4be0de7c69","auto_definition":"360p","media_type":"video","big_thumbs":[{"img_num":167,"uri":"343bd00048b1d966423f9","img_url":"http://p3-tt.bytecdn.cn/origin/343bd00048b1d966423f9","img_urls":["http://p3-tt.bytecdn.cn/origin/343bd00048b1d966423f9"],"img_x_size":240,"img_y_size":136,"img_x_len":10,"img_y_len":17,"duration":166.747332,"interval":1,"fext":"jpg"}],"original_play_url":{"backup_url":"http://tosv.byted.org/obj/tos-cn-v-0000c002/4b4a7810447b48f1987f05738aa52189?toskey=tos-cn-v-0000c002%2F4b4a7810447b48f1987f05738aa52189","main_url":"http://tosv.byted.org/obj/tos-cn-v-0000c002/4b4a7810447b48f1987f05738aa52189?toskey=tos-cn-v-0000c002%2F4b4a7810447b48f1987f05738aa52189"},"video_list":{"video_1":{"definition":"360p","quality":"normal","vtype":"mp4","vwidth":636,"vheight":360,"bitrate":223373,"logo_type":"xigua","codec_type":"h265","size":4658340,"main_url":"aHR0cDovL3Y2LXR0Lml4aWd1YS5jb20vODI3MDhlZGM1OGU3N2E5Y2ViZjcwNjRmYzk0Nzc1OTkvNWZhMjU0YTUvdmlkZW8vdG9zL2NuL3Rvcy1jbi12ZS00LzUwOWI3ZjkzM2YzMDQ1ODA4NTcxZjYyMjgxOWZlOWMyLz9hPTM1JmJyPTY1NCZidD0yMTgmY3I9MCZjcz0mY3Y9MSZkcj0wJmRzPTEmZXI9Jmw9MjAyMDExMDQxNDEwNTUwMTAyMDQwNTkwOTMzNzA2NTQ4MyZscj0mbWltZV90eXBlPXZpZGVvX21wNCZxcz0wJnJjPU16TjViWGhvYVRad2VETXpPRGN6TTBBcFBHUTdPams2T0R4a056WThObVZuUEdjdFoyMXZiV3N3YnpaZkxTMHVMVEJ6Y3kwdlhsODJMVFplTHpRMFlHQXRNVE02WXclM0QlM0Qmdmw9JnZyPQ==","backup_url_1":"aHR0cDovL3YyOS10dC5peGlndWEuY29tL2FiMTEwNDc0ZmVjZTFmNTc5ZmE3ZWUyNzM3NDMxNzJkLzVmYTI1NGE1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC81MDliN2Y5MzNmMzA0NTgwODU3MWY2MjI4MTlmZTljMi8/YT0zNSZicj02NTQmYnQ9MjE4JmNyPTAmY3M9JmN2PTEmZHI9MCZkcz0xJmVyPSZsPTIwMjAxMTA0MTQxMDU1MDEwMjA0MDU5MDkzMzcwNjU0ODMmbHI9Jm1pbWVfdHlwZT12aWRlb19tcDQmcXM9MCZyYz1Nek41Ylhob2FUWndlRE16T0Rjek0wQXBQR1E3T2prNk9EeGtOelk4Tm1WblBHY3RaMjF2Yldzd2J6WmZMUzB1TFRCemN5MHZYbDgyTFRaZUx6UTBZR0F0TVRNNll3JTNEJTNEJnZsPSZ2cj0=","main_http_url":"aHR0cDovL3Y2LXR0Lml4aWd1YS5jb20vODI3MDhlZGM1OGU3N2E5Y2ViZjcwNjRmYzk0Nzc1OTkvNWZhMjU0YTUvdmlkZW8vdG9zL2NuL3Rvcy1jbi12ZS00LzUwOWI3ZjkzM2YzMDQ1ODA4NTcxZjYyMjgxOWZlOWMyLz9hPTM1JmJyPTY1NCZidD0yMTgmY3I9MCZjcz0mY3Y9MSZkcj0wJmRzPTEmZXI9Jmw9MjAyMDExMDQxNDEwNTUwMTAyMDQwNTkwOTMzNzA2NTQ4MyZscj0mbWltZV90eXBlPXZpZGVvX21wNCZxcz0wJnJjPU16TjViWGhvYVRad2VETXpPRGN6TTBBcFBHUTdPams2T0R4a056WThObVZuUEdjdFoyMXZiV3N3YnpaZkxTMHVMVEJ6Y3kwdlhsODJMVFplTHpRMFlHQXRNVE02WXclM0QlM0Qmdmw9JnZyPQ==","backup_http_url":"aHR0cDovL3YyOS10dC5peGlndWEuY29tL2FiMTEwNDc0ZmVjZTFmNTc5ZmE3ZWUyNzM3NDMxNzJkLzVmYTI1NGE1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC81MDliN2Y5MzNmMzA0NTgwODU3MWY2MjI4MTlmZTljMi8/YT0zNSZicj02NTQmYnQ9MjE4JmNyPTAmY3M9JmN2PTEmZHI9MCZkcz0xJmVyPSZsPTIwMjAxMTA0MTQxMDU1MDEwMjA0MDU5MDkzMzcwNjU0ODMmbHI9Jm1pbWVfdHlwZT12aWRlb19tcDQmcXM9MCZyYz1Nek41Ylhob2FUWndlRE16T0Rjek0wQXBQR1E3T2prNk9EeGtOelk4Tm1WblBHY3RaMjF2Yldzd2J6WmZMUzB1TFRCemN5MHZYbDgyTFRaZUx6UTBZR0F0TVRNNll3JTNEJTNEJnZsPSZ2cj0=","url_expire":1604474021,"user_video_proxy":1,"socket_buffer":5025780,"preload_size":327680,"preload_interval":45,"preload_min_step":5,"preload_max_step":10,"spade_a":"","file_hash":"c5b886f88915a907c7869a43e218144b","file_id":"96d4b03c9c3747a29a5970697b8aa290","p2p_verify_url":"aHR0cDovL3Y2LXR0Lml4aWd1YS5jb20vZDIyNWQ0N2NlZDRiOGU2OGRjM2M2YjM1ODEzMDhkMTcvNWZhMjU0YTUvdmlkZW8vdG9zL2NuL3Rvcy1jbi12ZS00L2UyNjFjMzZhY2ZmZTQwYjViNTM1ZDViMTZjZmEyZTIzLw==","encrypt":false},"video_2":{"definition":"480p","quality":"normal","vtype":"mp4","vwidth":848,"vheight":480,"bitrate":294853,"logo_type":"xigua","codec_type":"h265","size":6149030,"main_url":"aHR0cDovL3Y2LXR0Lml4aWd1YS5jb20vNWU1NWQ5Y2ZmZmE4ZjEwNzQ2Njg4OTFkNTBkNDIwMGEvNWZhMjU0YTUvdmlkZW8vdG9zL2NuL3Rvcy1jbi12ZS00LzNmYmZiNGQ1YmNjZjRlMThiMDJmYmZkYWYxNmViYjdjLz9hPTM1JmJyPTg2MSZidD0yODcmY3I9MCZjcz0mY3Y9MSZkcj0wJmRzPTImZXI9Jmw9MjAyMDExMDQxNDEwNTUwMTAyMDQwNTkwOTMzNzA2NTQ4MyZscj0mbWltZV90eXBlPXZpZGVvX21wNCZxcz0wJnJjPU16TjViWGhvYVRad2VETXpPRGN6TTBBcFpEZzRaVGxuT0dVMk4ybGtORHMxYVdjdFoyMXZiV3N3YnpaZkxTMHVMVEJ6YzJNeU5ETmhOUzh5TldBeE5tRmpYMkU2WXclM0QlM0Qmdmw9JnZyPQ==","backup_url_1":"aHR0cDovL3YyOS10dC5peGlndWEuY29tL2FkZWFjNzAyNWZmMzU4YTAyNTNjN2JjOWMzYzMwN2ZmLzVmYTI1NGE1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC8zZmJmYjRkNWJjY2Y0ZTE4YjAyZmJmZGFmMTZlYmI3Yy8/YT0zNSZicj04NjEmYnQ9Mjg3JmNyPTAmY3M9JmN2PTEmZHI9MCZkcz0yJmVyPSZsPTIwMjAxMTA0MTQxMDU1MDEwMjA0MDU5MDkzMzcwNjU0ODMmbHI9Jm1pbWVfdHlwZT12aWRlb19tcDQmcXM9MCZyYz1Nek41Ylhob2FUWndlRE16T0Rjek0wQXBaRGc0WlRsbk9HVTJOMmxrTkRzMWFXY3RaMjF2Yldzd2J6WmZMUzB1TFRCemMyTXlORE5oTlM4eU5XQXhObUZqWDJFNll3JTNEJTNEJnZsPSZ2cj0=","main_http_url":"aHR0cDovL3Y2LXR0Lml4aWd1YS5jb20vNWU1NWQ5Y2ZmZmE4ZjEwNzQ2Njg4OTFkNTBkNDIwMGEvNWZhMjU0YTUvdmlkZW8vdG9zL2NuL3Rvcy1jbi12ZS00LzNmYmZiNGQ1YmNjZjRlMThiMDJmYmZkYWYxNmViYjdjLz9hPTM1JmJyPTg2MSZidD0yODcmY3I9MCZjcz0mY3Y9MSZkcj0wJmRzPTImZXI9Jmw9MjAyMDExMDQxNDEwNTUwMTAyMDQwNTkwOTMzNzA2NTQ4MyZscj0mbWltZV90eXBlPXZpZGVvX21wNCZxcz0wJnJjPU16TjViWGhvYVRad2VETXpPRGN6TTBBcFpEZzRaVGxuT0dVMk4ybGtORHMxYVdjdFoyMXZiV3N3YnpaZkxTMHVMVEJ6YzJNeU5ETmhOUzh5TldBeE5tRmpYMkU2WXclM0QlM0Qmdmw9JnZyPQ==","backup_http_url":"aHR0cDovL3YyOS10dC5peGlndWEuY29tL2FkZWFjNzAyNWZmMzU4YTAyNTNjN2JjOWMzYzMwN2ZmLzVmYTI1NGE1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC8zZmJmYjRkNWJjY2Y0ZTE4YjAyZmJmZGFmMTZlYmI3Yy8/YT0zNSZicj04NjEmYnQ9Mjg3JmNyPTAmY3M9JmN2PTEmZHI9MCZkcz0yJmVyPSZsPTIwMjAxMTA0MTQxMDU1MDEwMjA0MDU5MDkzMzcwNjU0ODMmbHI9Jm1pbWVfdHlwZT12aWRlb19tcDQmcXM9MCZyYz1Nek41Ylhob2FUWndlRE16T0Rjek0wQXBaRGc0WlRsbk9HVTJOMmxrTkRzMWFXY3RaMjF2Yldzd2J6WmZMUzB1TFRCemMyTXlORE5oTlM4eU5XQXhObUZqWDJFNll3JTNEJTNEJnZsPSZ2cj0=","url_expire":1604474021,"user_video_proxy":1,"socket_buffer":6634080,"preload_size":327680,"preload_interval":45,"preload_min_step":5,"preload_max_step":10,"spade_a":"","file_hash":"2a4062cf7af4d3b2bda9f1c55c22d778","file_id":"fd2b8f1da9f44c38b552d86db65755af","p2p_verify_url":"aHR0cDovL3Y2LXR0Lml4aWd1YS5jb20vMDQyYTdkYzAzZDIyMGZhZjZiYjgwMTA5ZWNkYzExNjYvNWZhMjU0YTUvdmlkZW8vdG9zL2NuL3Rvcy1jbi12ZS00LzI5MDAwYWI5MjAzYjQxNmNhOTRiYzhjMzVlOWJhMTY2Lw==","encrypt":false},"video_3":{"definition":"720p","quality":"normal","vtype":"mp4","vwidth":1270,"vheight":720,"bitrate":602055,"logo_type":"xigua","codec_type":"h265","size":12555255,"main_url":"aHR0cDovL3Y2LXR0Lml4aWd1YS5jb20vZjU0OGFlZmJkODNkNTEwZGUwN2JhOWNlNGIwMDI4MjYvNWZhMjU0YTUvdmlkZW8vdG9zL2NuL3Rvcy1jbi12ZS00L2ZjM2U4MGNlNTZmZjQ0MjJhMjUxYzZlNDk1NTc0ZWY1Lz9hPTM1JmJyPTE3NjEmYnQ9NTg3JmNyPTAmY3M9JmN2PTEmZHI9MCZkcz0zJmVyPSZsPTIwMjAxMTA0MTQxMDU1MDEwMjA0MDU5MDkzMzcwNjU0ODMmbHI9Jm1pbWVfdHlwZT12aWRlb19tcDQmcXM9MCZyYz1Nek41Ylhob2FUWndlRE16T0Rjek0wQXBhVG8zUERSbVptVTFOMlExTTJZNU9HY3RaMjF2Yldzd2J6WmZMUzB1TFRCemMyTmVNakJlWVdGaVlWNHVYeTgyWVY4Nll3JTNEJTNEJnZsPSZ2cj0=","backup_url_1":"aHR0cDovL3YyOS10dC5peGlndWEuY29tLzg4MzE2ZTljYzllYzY3NTg4MmNmOWE3YjRhYmQyNGE2LzVmYTI1NGE1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC9mYzNlODBjZTU2ZmY0NDIyYTI1MWM2ZTQ5NTU3NGVmNS8/YT0zNSZicj0xNzYxJmJ0PTU4NyZjcj0wJmNzPSZjdj0xJmRyPTAmZHM9MyZlcj0mbD0yMDIwMTEwNDE0MTA1NTAxMDIwNDA1OTA5MzM3MDY1NDgzJmxyPSZtaW1lX3R5cGU9dmlkZW9fbXA0JnFzPTAmcmM9TXpONWJYaG9hVFp3ZURNek9EY3pNMEFwYVRvM1BEUm1abVUxTjJRMU0yWTVPR2N0WjIxdmJXc3dielpmTFMwdUxUQnpjMk5lTWpCZVlXRmlZVjR1WHk4MllWODZZdyUzRCUzRCZ2bD0mdnI9","main_http_url":"aHR0cDovL3Y2LXR0Lml4aWd1YS5jb20vZjU0OGFlZmJkODNkNTEwZGUwN2JhOWNlNGIwMDI4MjYvNWZhMjU0YTUvdmlkZW8vdG9zL2NuL3Rvcy1jbi12ZS00L2ZjM2U4MGNlNTZmZjQ0MjJhMjUxYzZlNDk1NTc0ZWY1Lz9hPTM1JmJyPTE3NjEmYnQ9NTg3JmNyPTAmY3M9JmN2PTEmZHI9MCZkcz0zJmVyPSZsPTIwMjAxMTA0MTQxMDU1MDEwMjA0MDU5MDkzMzcwNjU0ODMmbHI9Jm1pbWVfdHlwZT12aWRlb19tcDQmcXM9MCZyYz1Nek41Ylhob2FUWndlRE16T0Rjek0wQXBhVG8zUERSbVptVTFOMlExTTJZNU9HY3RaMjF2Yldzd2J6WmZMUzB1TFRCemMyTmVNakJlWVdGaVlWNHVYeTgyWVY4Nll3JTNEJTNEJnZsPSZ2cj0=","backup_http_url":"aHR0cDovL3YyOS10dC5peGlndWEuY29tLzg4MzE2ZTljYzllYzY3NTg4MmNmOWE3YjRhYmQyNGE2LzVmYTI1NGE1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC9mYzNlODBjZTU2ZmY0NDIyYTI1MWM2ZTQ5NTU3NGVmNS8/YT0zNSZicj0xNzYxJmJ0PTU4NyZjcj0wJmNzPSZjdj0xJmRyPTAmZHM9MyZlcj0mbD0yMDIwMTEwNDE0MTA1NTAxMDIwNDA1OTA5MzM3MDY1NDgzJmxyPSZtaW1lX3R5cGU9dmlkZW9fbXA0JnFzPTAmcmM9TXpONWJYaG9hVFp3ZURNek9EY3pNMEFwYVRvM1BEUm1abVUxTjJRMU0yWTVPR2N0WjIxdmJXc3dielpmTFMwdUxUQnpjMk5lTWpCZVlXRmlZVjR1WHk4MllWODZZdyUzRCUzRCZ2bD0mdnI9","url_expire":1604474021,"user_video_proxy":1,"socket_buffer":13546080,"preload_size":327680,"preload_interval":45,"preload_min_step":5,"preload_max_step":10,"spade_a":"","file_hash":"907acde4331039f846725db6fe5740fd","file_id":"5b6dc9022ba14a2dbecdcd1a93457aff","p2p_verify_url":"aHR0cDovL3Y2LXR0Lml4aWd1YS5jb20vZmZjZjk3MmE3M2FiODUxMTZjZjJmYTc4Y2YwNjlmZjIvNWZhMjU0YTUvdmlkZW8vdG9zL2NuL3Rvcy1jbi12ZS00LzFiZDNjMDM0MTBlNzRhZGI5OWExMTE0YThmZDFmNzkxLw==","encrypt":false},"video_4":{"definition":"1080p","quality":"normal","vtype":"mp4","vwidth":1906,"vheight":1080,"bitrate":1933701,"logo_type":"xigua","codec_type":"h265","size":40325404,"main_url":"aHR0cDovL3Y2LXR0Lml4aWd1YS5jb20vMTQ4ODM0YmVjYzdjZmIxMjliMDk1N2Q0NDMwZTBmMWIvNWZhMjU0YTUvdmlkZW8vdG9zL2NuL3Rvcy1jbi12ZS00L2FjNDI4Y2M2MWZjODQxMzNiYzBkMmJhNmM3MDgwYmI5Lz9hPTM1JmJyPTU2NjQmYnQ9MTg4OCZjcj0wJmNzPSZjdj0xJmRyPTAmZHM9NCZlcj0mbD0yMDIwMTEwNDE0MTA1NTAxMDIwNDA1OTA5MzM3MDY1NDgzJmxyPSZtaW1lX3R5cGU9dmlkZW9fbXA0JnFzPTAmcmM9TXpONWJYaG9hVFp3ZURNek9EY3pNMEFwTzJSbE96czZPVHhuTnpnN05HUTNOR2N0WjIxdmJXc3dielpmTFMwdUxUQnpjelEyTW1FeU1HSXpOR00yTUdBek5UWTZZdyUzRCUzRCZ2bD0mdnI9","backup_url_1":"aHR0cDovL3YyOS10dC5peGlndWEuY29tL2I4MDU0NjRhMTRjOTQ0MzU0Y2U0ZWVjZmFhMTBlMjM3LzVmYTI1NGE1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC9hYzQyOGNjNjFmYzg0MTMzYmMwZDJiYTZjNzA4MGJiOS8/YT0zNSZicj01NjY0JmJ0PTE4ODgmY3I9MCZjcz0mY3Y9MSZkcj0wJmRzPTQmZXI9Jmw9MjAyMDExMDQxNDEwNTUwMTAyMDQwNTkwOTMzNzA2NTQ4MyZscj0mbWltZV90eXBlPXZpZGVvX21wNCZxcz0wJnJjPU16TjViWGhvYVRad2VETXpPRGN6TTBBcE8yUmxPenM2T1R4bk56ZzdOR1EzTkdjdFoyMXZiV3N3YnpaZkxTMHVMVEJ6Y3pRMk1tRXlNR0l6TkdNMk1HQXpOVFk2WXclM0QlM0Qmdmw9JnZyPQ==","main_http_url":"aHR0cDovL3Y2LXR0Lml4aWd1YS5jb20vMTQ4ODM0YmVjYzdjZmIxMjliMDk1N2Q0NDMwZTBmMWIvNWZhMjU0YTUvdmlkZW8vdG9zL2NuL3Rvcy1jbi12ZS00L2FjNDI4Y2M2MWZjODQxMzNiYzBkMmJhNmM3MDgwYmI5Lz9hPTM1JmJyPTU2NjQmYnQ9MTg4OCZjcj0wJmNzPSZjdj0xJmRyPTAmZHM9NCZlcj0mbD0yMDIwMTEwNDE0MTA1NTAxMDIwNDA1OTA5MzM3MDY1NDgzJmxyPSZtaW1lX3R5cGU9dmlkZW9fbXA0JnFzPTAmcmM9TXpONWJYaG9hVFp3ZURNek9EY3pNMEFwTzJSbE96czZPVHhuTnpnN05HUTNOR2N0WjIxdmJXc3dielpmTFMwdUxUQnpjelEyTW1FeU1HSXpOR00yTUdBek5UWTZZdyUzRCUzRCZ2bD0mdnI9","backup_http_url":"aHR0cDovL3YyOS10dC5peGlndWEuY29tL2I4MDU0NjRhMTRjOTQ0MzU0Y2U0ZWVjZmFhMTBlMjM3LzVmYTI1NGE1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC9hYzQyOGNjNjFmYzg0MTMzYmMwZDJiYTZjNzA4MGJiOS8/YT0zNSZicj01NjY0JmJ0PTE4ODgmY3I9MCZjcz0mY3Y9MSZkcj0wJmRzPTQmZXI9Jmw9MjAyMDExMDQxNDEwNTUwMTAyMDQwNTkwOTMzNzA2NTQ4MyZscj0mbWltZV90eXBlPXZpZGVvX21wNCZxcz0wJnJjPU16TjViWGhvYVRad2VETXpPRGN6TTBBcE8yUmxPenM2T1R4bk56ZzdOR1EzTkdjdFoyMXZiV3N3YnpaZkxTMHVMVEJ6Y3pRMk1tRXlNR0l6TkdNMk1HQXpOVFk2WXclM0QlM0Qmdmw9JnZyPQ==","url_expire":1604474021,"user_video_proxy":1,"socket_buffer":43508160,"preload_size":327680,"preload_interval":45,"preload_min_step":5,"preload_max_step":10,"spade_a":"","file_hash":"017d7664078c701b9041f7ae1a3ab784","file_id":"1948a61c83594fd7966e73858db5a987","p2p_verify_url":"aHR0cDovL3Y2LXR0Lml4aWd1YS5jb20vNzQyNzEwOWM0N2I3NmZiMTY4YjI1ZGMwYjI2MGJlODUvNWZhMjU0YTUvdmlkZW8vdG9zL2NuL3Rvcy1jbi12ZS00LzdmZTNkMDY0ODgyNDRmMjc5MWRmMWE0YmU2ZmE1MWU0Lw==","encrypt":false}}}
             * video_proportion_article : 1.7666666666666666
             * video_style : 12
             * video_user_like : 0
             * xi_related : false
             */



            private String article_url;

            private int comment_count;
            private int composition;

            private String display_url;

            private boolean has_video;

            private int publish_time;
            private String media_name;

            private int read_count;

            private int share_count;
            private ShareInfoBean share_info;

            private String share_url;

            private String source;

            private String title;


            public String getArticle_url() {
                return article_url;
            }

            public void setArticle_url(String article_url) {
                this.article_url = article_url;
            }

            public int getPublish_time() {
                return publish_time;
            }

            public void setPublish_time(int publish_time) {
                this.publish_time = publish_time;
            }

            public int getComment_count() {
                return comment_count;
            }

            public void setComment_count(int comment_count) {
                this.comment_count = comment_count;
            }

            public int getComposition() {
                return composition;
            }

            public void setComposition(int composition) {
                this.composition = composition;
            }



            public String getDisplay_url() {
                return display_url;
            }

            public void setDisplay_url(String display_url) {
                this.display_url = display_url;
            }
            public boolean isHas_video() {
                return has_video;
            }

            public void setHas_video(boolean has_video) {
                this.has_video = has_video;
            }



            public String getMedia_name() {
                return media_name;
            }

            public void setMedia_name(String media_name) {
                this.media_name = media_name;
            }



            public int getRead_count() {
                return read_count;
            }

            public void setRead_count(int read_count) {
                this.read_count = read_count;
            }





            public int getShare_count() {
                return share_count;
            }

            public void setShare_count(int share_count) {
                this.share_count = share_count;
            }

            public ShareInfoBean getShare_info() {
                return share_info;
            }

            public void setShare_info(ShareInfoBean share_info) {
                this.share_info = share_info;
            }



            public String getShare_url() {
                return share_url;
            }

            public void setShare_url(String share_url) {
                this.share_url = share_url;
            }






            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }





            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }


            public static class ShareInfoBean {
                /**
                 * cover_image : null
                 * description : null
                 * hidden_url : null
                 * on_suppress : 0
                 * share_control : {"image":"false","video":"false"}
                 * share_type : {"pyq":3,"qq":3,"qzone":3,"wx":3}
                 * share_url : https://m.toutiaoimg.cn/a6886969624714281476/?app=news_article_liteu0026is_hit_share_recommend=0
                 * title : 抗美援朝我们共投入240万兵力，但你知道五次战役分别投入多少吗
                 * token_type : 1
                 * video_url :
                 * weixin_cover_image : {"height":966,"uri":"large/tos-cn-i-0000/1d1b6f92-158c-11eb-9c05-00163e144030","url":"http://p1-tt.byteimg.com/large/tos-cn-i-0000/1d1b6f92-158c-11eb-9c05-00163e144030","url_list":[{"url":"http://p1-tt.byteimg.com/large/tos-cn-i-0000/1d1b6f92-158c-11eb-9c05-00163e144030"},{"url":"http://p3-tt.byteimg.com/large/tos-cn-i-0000/1d1b6f92-158c-11eb-9c05-00163e144030"},{"url":"http://p3-tt.byteimg.com/large/tos-cn-i-0000/1d1b6f92-158c-11eb-9c05-00163e144030"}],"width":1125}
                 */


                private String share_url;
                private String title;





                public String getShare_url() {
                    return share_url;
                }

                public void setShare_url(String share_url) {
                    this.share_url = share_url;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

            }

        }
    }
    public PostInfo getdata(String tag){
        postInfo=new PostInfo();
        if(this.data==null){
            return null;
        }
        postInfo.setCount(this.data.size()+"");
        ArrayList<PostInfo.InfoBean> postinfobeanlist=new ArrayList<>();
        for (DataBean b:data
        ) {
            if(b.getContent()==null){
                continue;
            }
            PostInfo.InfoBean bean=new PostInfo.InfoBean();
            bean.setCreateTime(b.getContent().getPublish_time()+"");
            bean.setItemAuthor(b.getContent().getSource());

            bean.setItemDomain(tag);
            if(b.getContent().isHas_video()){
                bean.setItemType("2");
            }else {
                bean.setItemType("1");
            }
            bean.setItemTitle(b.getContent().getTitle());
            bean.setItemSource("今日头条");
            bean.setItemUrl(b.getContent().getArticle_url());
            bean.setItemComment(b.getContent().getComment_count()+"");
            bean.setItemRead(b.getContent().getRead_count()+"");
            postinfobeanlist.add(bean);
        }
        postInfo.setInfo(postinfobeanlist);
        return postInfo;
    }
}
