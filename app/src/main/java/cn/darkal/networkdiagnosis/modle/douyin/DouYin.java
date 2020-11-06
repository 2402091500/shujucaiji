package cn.darkal.networkdiagnosis.modle.douyin;

import java.util.ArrayList;
import java.util.List;

import cn.darkal.networkdiagnosis.modle.PostInfo;
import cn.darkal.networkdiagnosis.modle.tiantian.TT_Yule;

public class DouYin {

    /**
     * aweme_list : [{"anchors":null,"author":{"accept_private_policy":false,"account_region":"","ad_cover_url":null,"apple_account":0,"authority_status":0,"avatar_168x168":{"height":720,"uri":"168x168/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_168x168.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_168x168.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_168x168.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_168x168.jpeg?from=2563711402"],"width":720},"avatar_300x300":{"height":720,"uri":"300x300/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_300x300.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_300x300.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_300x300.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_300x300.jpeg?from=2563711402"],"width":720},"avatar_larger":{"height":720,"uri":"1080x1080/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.jpeg?from=2563711402"],"width":720},"avatar_medium":{"height":720,"uri":"720x720/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.jpeg?from=2563711402"],"width":720},"avatar_thumb":{"height":720,"uri":"100x100/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.jpeg?from=2563711402"],"width":720},"avatar_uri":"tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","aweme_count":0,"bind_phone":"","birthday":"1997-01-01","cha_list":null,"comment_filter_status":0,"comment_setting":0,"commerce_user_level":0,"constellation":2,"cover_url":[{"height":720,"uri":"c8510002be9a3a61aad2","url_list":["https://p26-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"],"width":720}],"create_time":0,"custom_verify":"","cv_level":"","download_prompt_ts":0,"download_setting":-1,"duet_setting":3,"enterprise_verify_reason":"","favoriting_count":0,"fb_expire_time":0,"follow_status":0,"follower_count":0,"follower_status":0,"followers_detail":null,"following_count":0,"gender":2,"geofencing":null,"google_account":"","has_email":false,"has_facebook_token":false,"has_insights":false,"has_orders":false,"has_twitter_token":false,"has_unread_story":false,"has_youtube_token":false,"hide_location":false,"hide_search":false,"ins_id":"","is_ad_fake":false,"is_binded_weibo":false,"is_block":false,"is_discipline_member":false,"is_gov_media_vip":false,"is_phone_binded":false,"is_star":false,"is_verified":true,"item_list":null,"language":"zh-Hans","live_agreement":0,"live_agreement_time":0,"live_commerce":false,"live_verify":0,"location":"","need_recommend":0,"neiguang_shield":0,"new_story_cover":null,"nickname":"富哥剪辑","platform_sync_info":null,"prevent_download":false,"react_setting":0,"reflow_page_gid":0,"reflow_page_uid":0,"region":"CN","relative_users":null,"room_id":0,"school_name":"","school_poi_id":"","school_type":0,"sec_uid":"MS4wLjABAAAAEJ3R3913q0RGJKjI7TawVHugUSh6lEe0K5ysuJTH39I","secret":0,"share_info":{"share_desc":"","share_qrcode_url":{"height":720,"uri":"75a400194d43b16d8958","url_list":["https://p9-dy.byteimg.com/obj/75a400194d43b16d8958?from=2563711402","https://p6-dy-ipv6.byteimg.com/obj/75a400194d43b16d8958?from=2563711402","https://p29-dy.byteimg.com/obj/75a400194d43b16d8958?from=2563711402"],"width":720},"share_title":"","share_title_myself":"","share_title_other":"","share_url":"","share_weibo_desc":""},"share_qrcode_uri":"75a400194d43b16d8958","shield_comment_notice":0,"shield_digg_notice":0,"shield_follow_notice":0,"short_id":"667540735","show_image_bubble":false,"signature":"⚠️看故事，品人生。                                                                                                                 \n⚠️抖音影视宣发合作\n⚠️一部手机轻松学习影视剪辑。                                               ⚠️学习影视教学VX：Lxy30001314。 收徒中\u2026\n⚠️中国·重庆","special_lock":1,"status":1,"story_count":0,"story_open":false,"sync_to_toutiao":0,"total_favorited":0,"tw_expire_time":0,"twitter_id":"","twitter_name":"","type_label":null,"uid":"93953372365","unique_id":"","unique_id_modify_time":1602741234,"user_canceled":false,"user_mode":0,"user_period":0,"user_rate":1,"verification_type":1,"verify_info":"","video_icon":{"height":720,"uri":"","url_list":null,"width":720},"weibo_name":"","weibo_schema":"","weibo_url":"","weibo_verify":"","with_commerce_entry":false,"with_dou_entry":false,"with_fusion_shop_entry":true,"with_shop_entry":false,"youtube_channel_id":"","youtube_channel_title":"","youtube_expire_time":0},"author_user_id":93953372365,"aweme_control":{"can_comment":true,"can_forward":true,"can_share":true,"can_show_comment":true},"aweme_id":"6883369550809779459","aweme_type":0,"bodydance_score":0,"cha_list":null,"challenge_position":null,"city":"500000","cmt_swt":false,"collect_stat":0,"comment_list":null,"commerce_config_data":null,"create_time":1602659369,"desc":"为了梦想勇敢迈出那一部","desc_language":"zh","distance":"","distribute_type":2,"duration":106045,"enable_top_view":true,"follow_up_type":0,"geofencing":null,"geofencing_regions":null,"group_id":"6883369550809779459","hybrid_label":null,"image_infos":null,"interaction_stickers":null,"is_ads":false,"is_fantasy":false,"is_hash_tag":1,"is_horizontal":false,"is_pgcshow":false,"is_relieve":false,"is_story":0,"is_top":0,"is_vr":false,"item_comment_settings":0,"item_duet":1,"item_react":1,"label_top":{"height":720,"uri":"c150000f34767e2cb56","url_list":["https://p29-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p26-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p6-dy-ipv6.byteimg.com/obj/c150000f34767e2cb56?from=2563711402"],"width":720},"label_top_text":null,"long_video":null,"misc_info":"{\"ocr_location\":\"{\\\"x_max\\\":0.7240624999999999,\\\"x_min\\\":0.27273437500000003,\\\"y_max\\\":0.10541666666666667,\\\"y_min\\\":0}\"}","mix_info":{"cover_url":{"height":720,"uri":"tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7","url_list":["https://p6-dy-ipv6.byteimg.com/obj/tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7?from=2563711402","https://p26-dy.byteimg.com/obj/tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7?from=2563711402"],"width":720},"desc":"","extra":"{\"audit_locktime\":1602313759,\"ban_fields\":[],\"first_reviewed\":1,\"is_quality_mix\":0,\"next_info\":{\"cover\":\"tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7\",\"desc\":\"\",\"name\":\"感动落泪的情感\"},\"origin_challenge_content\":\"爱情\"}","mix_id":"6875036611659171848","mix_name":"感动落泪的情感","share_info":{"share_desc":"在抖音，记录美好生活","share_title":"这么有趣的合集，不能只有我一个人知道吧","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/mix/detail/6875036611659171848/?schema_type=24&object_id=6875036611659171848","share_weibo_desc":"这么有趣的合集，不能只有我一个人知道吧"},"statis":{"collect_vv":0,"current_episode":47,"play_vv":0,"updated_to_episode":57},"status":{"is_collected":0,"status":2}},"music":{"album":"","author":"富哥剪辑","author_deleted":false,"author_position":null,"avatar_large":{"height":720,"uri":"1080x1080/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.jpeg?from=2563711402"],"width":720},"avatar_medium":{"height":720,"uri":"720x720/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.jpeg?from=2563711402"],"width":720},"avatar_thumb":{"height":720,"uri":"100x100/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.jpeg?from=2563711402"],"width":720},"binded_challenge_id":0,"collect_stat":0,"cover_hd":{"height":720,"uri":"1080x1080/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.jpeg?from=2563711402"],"width":720},"cover_large":{"height":720,"uri":"1080x1080/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.jpeg?from=2563711402"],"width":720},"cover_medium":{"height":720,"uri":"720x720/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.jpeg?from=2563711402"],"width":720},"cover_thumb":{"height":720,"uri":"100x100/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.jpeg?from=2563711402"],"width":720},"duration":106,"end_time":0,"external_song_info":null,"extra":"{\"reviewed\":0,\"review_unshelve_reason\":0,\"beats\":{},\"hotsoon_review_time\":-1,\"has_edited\":0,\"douyin_beats_info\":{},\"schedule_search_time\":0,\"music_label_id\":null,\"aggregate_exempt_conf\":[]}","id":6883369629134179086,"id_str":"6883369629134179086","is_author_artist":false,"is_del_video":false,"is_original":false,"is_pgc":false,"is_restricted":false,"is_video_self_see":false,"mid":"6883369629134179086","mute_share":false,"offline_desc":"","owner_handle":"667540735","owner_id":"93953372365","owner_nickname":"富哥剪辑","play_url":{"height":720,"uri":"https://p9-dy.byteimg.com/obj/ies-music/6883369590966274830.mp3","url_list":["https://p9-dy.byteimg.com/obj/ies-music/6883369590966274830.mp3","https://p1-dy.byteimg.com/obj/ies-music/6883369590966274830.mp3"],"width":720},"position":null,"prevent_download":false,"prevent_item_download_status":0,"preview_end_time":0,"preview_start_time":0,"redirect":false,"schema_url":"","sec_uid":"MS4wLjABAAAAEJ3R3913q0RGJKjI7TawVHugUSh6lEe0K5ysuJTH39I","source_platform":23,"start_time":0,"status":1,"title":"@富哥剪辑创作的原声","unshelve_countries":null,"user_count":0},"nickname_position":null,"open_platform_info":{"icon":"https://sf1-dycdn-tos.pstatp.com/obj/douyin-web-image/b22313de3911b1169d1064198d589bc1","link":"https://lv.ulikecam.com/act/lv-feed?aweme_item_id=6883369550809779459&from=singlemessage&hide_nav_bar=1&should_full_screen=true","name":"剪映-视频制作"},"open_platform_name":"剪映-视频制作","origin_comment_ids":null,"position":null,"prevent_download":false,"promotions":null,"rate":12,"raw_ad_data":null,"region":"CN","risk_infos":{"content":"","risk_sink":false,"type":0,"vote":false,"warn":false},"share_info":{"bool_persist":0,"share_desc":"在抖音，记录美好生活","share_link_desc":"为了梦想勇敢迈出那一部  %s 复制此链接，打开抖音，直接观看视频！","share_quote":"","share_signature_desc":"","share_signature_url":"","share_title":"为了梦想勇敢迈出那一部","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/video/6883369550809779459/?region=CN&mid=6883369629134179086&u_code=i0kji679&titleType=title&did=71471896106&iid=3993023441537288","share_weibo_desc":"#在抖音，记录美好生活#为了梦想勇敢迈出那一部"},"share_url":"https://www.iesdouyin.com/share/video/6883369550809779459/?region=CN&mid=6883369629134179086&u_code=i0kji679&titleType=title&did=71471896106&iid=3993023441537288","sort_label":"_","statistics":{"aweme_id":"6883369550809779459","comment_count":375,"digg_count":5316,"download_count":145,"forward_count":30,"lose_comment_count":0,"lose_count":0,"play_count":0,"share_count":138,"whatsapp_share_count":0},"status":{"allow_comment":true,"allow_share":true,"aweme_id":"6883369550809779459","download_status":0,"in_reviewing":false,"is_delete":false,"is_private":false,"is_prohibited":false,"private_status":0,"reviewed":1,"self_see":false,"with_fusion_goods":false,"with_goods":false},"text_extra":[],"uniqid_position":null,"user_digged":0,"user_profile_init_info":{"head_model_score":0.08498203754425049},"video":{"big_thumbs":[{"duration":106.041667,"fext":"jpg","img_num":106,"img_url":"http://p3-tt.bytecdn.cn/obj/tos-cn-p-0015/a112b1026651493fb40cb1ac75d4dc92_1602659377","img_x_len":10,"img_x_size":240,"img_y_len":11,"img_y_size":136,"interval":10,"uri":"tos-cn-p-0015/a112b1026651493fb40cb1ac75d4dc92_1602659377"}],"bit_rate":[{"bit_rate":1632768,"gear_name":"adapt_lowest_720","is_h265":1,"play_addr":{"data_size":21643369,"file_cs":"c:0-112145-aa72","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_720p_1632768","url_list":["http://v26-dy.ixigua.com/50c60b94c80b4ebef2730d64eeb33cac/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/b99c2c13640a871b5ddf95c442f2be48/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":21643369,"file_cs":"c:0-112145-aa72","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_720p_1632768","url_list":["http://v26-dy.ixigua.com/50c60b94c80b4ebef2730d64eeb33cac/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/b99c2c13640a871b5ddf95c442f2be48/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"quality_type":15},{"bit_rate":1544275,"gear_name":"adapt_540","is_h265":1,"play_addr":{"data_size":20470331,"file_cs":"c:0-112149-aede","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_540p_1544275","url_list":["http://v26-dy.ixigua.com/1de20f6d7e6f9b0dcdc2e4266f607be9/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/97de9a2d59ef128e67a0ae1b934b8946/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":20470331,"file_cs":"c:0-112149-aede","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_540p_1544275","url_list":["http://v26-dy.ixigua.com/1de20f6d7e6f9b0dcdc2e4266f607be9/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/97de9a2d59ef128e67a0ae1b934b8946/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"quality_type":28}],"cdn_url_expired":0,"cover":{"height":720,"uri":"large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375","url_list":["http://p3-dy-ipv6.byteimg.com/large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375.webp?from=2563711402_large","http://p1-dy-ipv6.byteimg.com/large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375.webp?from=2563711402_large","http://p29-dy.byteimg.com/large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375.webp?from=2563711402_large","http://p3-dy-ipv6.byteimg.com/large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375.jpeg?from=2563711402_large"],"width":720},"download_addr":{"data_size":39956726,"height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_list":["http://v26-dy.ixigua.com/f102959f66503fc33fc56ed2fb770d1a/5f87f26c/video/tos/cn/tos-cn-ve-15/92128c091c1948e7a1f6db665a7ae4ff/?a=1128&br=8586&bt=2862&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApODQ4ODszOzs5N2hnNTs2OWdrMWlrNl80NTBfLS0wLTBzczAwYy5fYl4tYTYxYDBeXjA6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/8eadfb2231cd58be9871f4e53434ea1c/5f87f26c/video/tos/cn/tos-cn-ve-15/92128c091c1948e7a1f6db665a7ae4ff/?a=1128&br=8586&bt=2862&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApODQ4ODszOzs5N2hnNTs2OWdrMWlrNl80NTBfLS0wLTBzczAwYy5fYl4tYTYxYDBeXjA6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"download_suffix_logo_addr":{"data_size":39956726,"height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_list":["http://v26-dy.ixigua.com/f102959f66503fc33fc56ed2fb770d1a/5f87f26c/video/tos/cn/tos-cn-ve-15/92128c091c1948e7a1f6db665a7ae4ff/?a=1128&br=8586&bt=2862&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApODQ4ODszOzs5N2hnNTs2OWdrMWlrNl80NTBfLS0wLTBzczAwYy5fYl4tYTYxYDBeXjA6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/8eadfb2231cd58be9871f4e53434ea1c/5f87f26c/video/tos/cn/tos-cn-ve-15/92128c091c1948e7a1f6db665a7ae4ff/?a=1128&br=8586&bt=2862&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApODQ4ODszOzs5N2hnNTs2OWdrMWlrNl80NTBfLS0wLTBzczAwYy5fYl4tYTYxYDBeXjA6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"duration":106045,"dynamic_cover":{"height":720,"uri":"tos-cn-p-0015/6ec1deec2c1049fcbea82bf623b091eb_1602659371","url_list":["https://p6-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/6ec1deec2c1049fcbea82bf623b091eb_1602659371?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/6ec1deec2c1049fcbea82bf623b091eb_1602659371?from=2563711402_large","https://p29-dy.byteimg.com/obj/tos-cn-p-0015/6ec1deec2c1049fcbea82bf623b091eb_1602659371?from=2563711402_large"],"width":720},"has_download_suffix_logo_addr":true,"has_watermark":true,"height":576,"is_h265":0,"is_long_video":1,"origin_cover":{"height":720,"uri":"tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370","url_list":["https://p26-dy.byteimg.com/tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370~tplv-dy-360p.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370~tplv-dy-360p.webp?from=2563711402","https://p29-dy.byteimg.com/tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370~tplv-dy-360p.webp?from=2563711402","https://p26-dy.byteimg.com/tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370~tplv-dy-360p.jpeg?from=2563711402"],"width":720},"play_addr":{"data_size":28245593,"file_cs":"c:0-109963-4a7a","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_h264_540p_2130838","url_list":["http://v26-dy.ixigua.com/4e5be394a9686c3c33dae460a7e0f45f/5f87f26c/video/tos/cn/tos-cn-ve-15/4dd37aaa38864040af024fb5642053a2/?a=1128&br=6240&bt=2080&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApZTs4NDtlaWVlNzZpNDZoNGdrMWlrNl80NTBfLS0wLTBzcy8xYmNjYi0yLzYwX2IyMTQ6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/aac7f1a555ae694a483f0723f76bf0c3/5f87f26c/video/tos/cn/tos-cn-ve-15/4dd37aaa38864040af024fb5642053a2/?a=1128&br=6240&bt=2080&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApZTs4NDtlaWVlNzZpNDZoNGdrMWlrNl80NTBfLS0wLTBzcy8xYmNjYi0yLzYwX2IyMTQ6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":20470331,"file_cs":"c:0-112149-aede","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_540p_1544275","url_list":["http://v26-dy.ixigua.com/1de20f6d7e6f9b0dcdc2e4266f607be9/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/97de9a2d59ef128e67a0ae1b934b8946/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_h264":{"data_size":28245593,"file_cs":"c:0-109963-4a7a","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_h264_540p_2130838","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"play_addr_lowbr":{"data_size":28245593,"file_cs":"c:0-109963-4a7a","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_h264_540p_2130838","url_list":["http://v26-dy.ixigua.com/4e5be394a9686c3c33dae460a7e0f45f/5f87f26c/video/tos/cn/tos-cn-ve-15/4dd37aaa38864040af024fb5642053a2/?a=1128&br=6240&bt=2080&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApZTs4NDtlaWVlNzZpNDZoNGdrMWlrNl80NTBfLS0wLTBzcy8xYmNjYi0yLzYwX2IyMTQ6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/aac7f1a555ae694a483f0723f76bf0c3/5f87f26c/video/tos/cn/tos-cn-ve-15/4dd37aaa38864040af024fb5642053a2/?a=1128&br=6240&bt=2080&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApZTs4NDtlaWVlNzZpNDZoNGdrMWlrNl80NTBfLS0wLTBzcy8xYmNjYi0yLzYwX2IyMTQ6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"ratio":"540p","video_model":"","width":1024},"video_control":{"allow_download":true,"allow_duet":false,"allow_dynamic_wallpaper":false,"allow_music":true,"allow_react":false,"draft_progress_bar":1,"prevent_download_type":0,"share_type":1,"show_progress_bar":1,"timer_status":1},"video_labels":null,"video_text":null,"vr_type":0,"with_promotional_music":false,"xigua_task":{"is_xigua_task":false}},{"anchors":null,"author":{"accept_private_policy":false,"account_region":"","ad_cover_url":null,"apple_account":0,"authority_status":0,"avatar_168x168":{"height":720,"uri":"168x168/2f4dc00007b8fe5756141","url_list":["https://p26-dy.byteimg.com/img/2f4dc00007b8fe5756141~c5_168x168.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/2f4dc00007b8fe5756141~c5_168x168.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/2f4dc00007b8fe5756141~c5_168x168.webp?from=2563711402","https://p26-dy.byteimg.com/img/2f4dc00007b8fe5756141~c5_168x168.jpeg?from=2563711402"],"width":720},"avatar_300x300":{"height":720,"uri":"300x300/2f4dc00007b8fe5756141","url_list":["https://p9-dy.byteimg.com/img/2f4dc00007b8fe5756141~c5_300x300.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/2f4dc00007b8fe5756141~c5_300x300.webp?from=2563711402","https://p29-dy.byteimg.com/img/2f4dc00007b8fe5756141~c5_300x300.webp?from=2563711402","https://p9-dy.byteimg.com/img/2f4dc00007b8fe5756141~c5_300x300.jpeg?from=2563711402"],"width":720},"avatar_larger":{"height":720,"uri":"1080x1080/2f4dc00007b8fe5756141","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/2f4dc00007b8fe5756141.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/2f4dc00007b8fe5756141.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/2f4dc00007b8fe5756141.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/2f4dc00007b8fe5756141.jpeg?from=2563711402"],"width":720},"avatar_medium":{"height":720,"uri":"720x720/2f4dc00007b8fe5756141","url_list":["https://p6-dy-ipv6.byteimg.com/aweme/720x720/2f4dc00007b8fe5756141.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/2f4dc00007b8fe5756141.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/720x720/2f4dc00007b8fe5756141.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/2f4dc00007b8fe5756141.jpeg?from=2563711402"],"width":720},"avatar_thumb":{"height":720,"uri":"100x100/2f4dc00007b8fe5756141","url_list":["https://p29-dy.byteimg.com/aweme/100x100/2f4dc00007b8fe5756141.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/100x100/2f4dc00007b8fe5756141.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/100x100/2f4dc00007b8fe5756141.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/100x100/2f4dc00007b8fe5756141.jpeg?from=2563711402"],"width":720},"avatar_uri":"2f4dc00007b8fe5756141","aweme_count":0,"bind_phone":"","birthday":"","cha_list":null,"comment_filter_status":0,"comment_setting":0,"commerce_user_level":0,"constellation":0,"cover_url":[{"height":720,"uri":"c8510002be9a3a61aad2","url_list":["https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p26-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"],"width":720}],"create_time":0,"custom_verify":"","cv_level":"","download_prompt_ts":0,"download_setting":-1,"duet_setting":0,"enterprise_verify_reason":"","favoriting_count":0,"fb_expire_time":0,"follow_status":0,"follower_count":0,"follower_status":0,"followers_detail":null,"following_count":0,"gender":0,"geofencing":null,"google_account":"","has_email":false,"has_facebook_token":false,"has_insights":false,"has_orders":false,"has_twitter_token":false,"has_unread_story":false,"has_youtube_token":false,"hide_location":false,"hide_search":false,"ins_id":"","is_ad_fake":false,"is_binded_weibo":false,"is_block":false,"is_discipline_member":false,"is_gov_media_vip":false,"is_phone_binded":false,"is_star":false,"is_verified":true,"item_list":null,"language":"zh-Hans","live_agreement":0,"live_agreement_time":0,"live_commerce":false,"live_verify":0,"location":"","need_recommend":0,"neiguang_shield":0,"new_story_cover":null,"nickname":"忠诚人标哥","platform_sync_info":null,"prevent_download":false,"react_setting":0,"reflow_page_gid":0,"reflow_page_uid":0,"region":"CN","relative_users":null,"room_id":0,"school_name":"","school_poi_id":"","school_type":0,"sec_uid":"MS4wLjABAAAALA79wQ8Mg8XNFY62_-wf0-D734Devvpg0zk5TCeWSO0","secret":0,"share_info":{"share_desc":"","share_qrcode_url":{"height":720,"uri":"2e61c0001c020811f74b8","url_list":["https://p3-dy-ipv6.byteimg.com/obj/2e61c0001c020811f74b8?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/2e61c0001c020811f74b8?from=2563711402","https://p6-dy-ipv6.byteimg.com/obj/2e61c0001c020811f74b8?from=2563711402"],"width":720},"share_title":"","share_title_myself":"","share_title_other":"","share_url":"","share_weibo_desc":""},"share_qrcode_uri":"2e61c0001c020811f74b8","shield_comment_notice":0,"shield_digg_notice":0,"shield_follow_notice":0,"short_id":"2975298092","show_image_bubble":false,"signature":"本人是地地道道道的农村人，标哥","special_lock":1,"status":1,"story_count":0,"story_open":false,"sync_to_toutiao":0,"total_favorited":0,"tw_expire_time":0,"twitter_id":"","twitter_name":"","type_label":null,"uid":"681346973834220","unique_id":"dysmllo6c5ll","unique_id_modify_time":1602741234,"user_canceled":false,"user_mode":0,"user_period":0,"user_rate":1,"verification_type":1,"verify_info":"","video_icon":{"height":720,"uri":"","url_list":null,"width":720},"weibo_name":"","weibo_schema":"","weibo_url":"","weibo_verify":"","with_commerce_entry":false,"with_dou_entry":false,"with_fusion_shop_entry":false,"with_shop_entry":false,"youtube_channel_id":"","youtube_channel_title":"","youtube_expire_time":0},"author_user_id":681346973834220,"aweme_control":{"can_comment":true,"can_forward":true,"can_share":true,"can_show_comment":true},"aweme_id":"6883632109148261639","aweme_type":0,"bodydance_score":0,"cha_list":null,"challenge_position":null,"city":"520600","cmt_swt":false,"collect_stat":0,"comment_list":null,"commerce_config_data":null,"create_time":1602720502,"desc":"昨天才挖点红苕来你就来吃，看我怎样收适你","desc_language":"zh","distance":"","distribute_type":1,"duration":14954,"enable_top_view":true,"follow_up_type":0,"geofencing":null,"geofencing_regions":null,"group_id":"6883632109148261639","hybrid_label":null,"image_infos":null,"interaction_stickers":null,"is_ads":false,"is_fantasy":false,"is_hash_tag":1,"is_horizontal":false,"is_pgcshow":false,"is_relieve":false,"is_story":0,"is_top":0,"is_vr":false,"item_comment_settings":0,"item_duet":0,"item_react":0,"label_top":{"height":720,"uri":"c150000f34767e2cb56","url_list":["https://p3-dy-ipv6.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p9-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p6-dy-ipv6.byteimg.com/obj/c150000f34767e2cb56?from=2563711402"],"width":720},"label_top_text":null,"long_video":null,"misc_info":"{}","music":{"album":"","author":"军仔 .《激情演绎》","author_deleted":false,"author_position":null,"avatar_large":{"height":720,"uri":"1080x1080/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_1080x1080.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_1080x1080.jpeg?from=2563711402"],"width":720},"avatar_medium":{"height":720,"uri":"720x720/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_720x720.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_720x720.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_720x720.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_720x720.jpeg?from=2563711402"],"width":720},"avatar_thumb":{"height":720,"uri":"100x100/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913","url_list":["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_100x100.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_100x100.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_100x100.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_100x100.jpeg?from=2563711402"],"width":720},"binded_challenge_id":0,"collect_stat":0,"cover_hd":{"height":720,"uri":"1080x1080/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_1080x1080.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_1080x1080.jpeg?from=2563711402"],"width":720},"cover_large":{"height":720,"uri":"1080x1080/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_1080x1080.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_1080x1080.jpeg?from=2563711402"],"width":720},"cover_medium":{"height":720,"uri":"720x720/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_720x720.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_720x720.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_720x720.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_720x720.jpeg?from=2563711402"],"width":720},"cover_thumb":{"height":720,"uri":"100x100/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913","url_list":["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_100x100.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_100x100.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_100x100.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/75cfd908e1fa7b866095beb0a45ac913~c5_100x100.jpeg?from=2563711402"],"width":720},"duration":15,"end_time":0,"external_song_info":null,"extra":"{\"douyin_beats_info\":{},\"schedule_search_time\":0,\"has_edited\":0,\"reviewed\":1,\"review_unshelve_reason\":0,\"beats\":{\"beats_tracker\":\"https://p9-dy.byteimg.com/obj/ies-music/strong_beat/v3/1680127412563980\",\"energy_trace\":\"https://p9-dy.byteimg.com/obj/ies-music/strong_beat/v3/1680127408364548\",\"audio_effect_onset\":\"https://p1-dy.byteimg.com/obj/ies-music/strong_beat/v3/1680127408405516\",\"merged_beats\":\"https://p9-dy.byteimg.com/obj/ies-music/strong_beat/v3/1680127412603908\"},\"hotsoon_review_time\":-1,\"music_label_id\":null,\"aggregate_exempt_conf\":[]}","id":6881543675483474696,"id_str":"6881543675483474696","is_author_artist":false,"is_del_video":false,"is_original":false,"is_pgc":false,"is_restricted":false,"is_video_self_see":false,"mid":"6881543675483474696","mute_share":false,"offline_desc":"","owner_handle":"146266871","owner_id":"78908635947","owner_nickname":"军仔 .《激情演绎》","play_url":{"height":720,"uri":"https://p9-dy.byteimg.com/obj/ies-music/6881543676642347790.mp3","url_list":["https://p9-dy.byteimg.com/obj/ies-music/6881543676642347790.mp3","https://p1-dy.byteimg.com/obj/ies-music/6881543676642347790.mp3"],"width":720},"position":null,"prevent_download":false,"prevent_item_download_status":0,"preview_end_time":0,"preview_start_time":0,"redirect":false,"schema_url":"","sec_uid":"MS4wLjABAAAA-8P_5kIbXukH_H9uY4hZu7A52YgGFYRk7WCvqUB0c10","source_platform":23,"start_time":0,"status":1,"strong_beat_url":{"height":720,"uri":"https://p9-dy.byteimg.com/obj/ies-music/strong_beat/1680089941098499","url_list":["https://p9-dy.byteimg.com/obj/ies-music/strong_beat/1680089941098499","https://p1-dy.byteimg.com/obj/ies-music/strong_beat/1680089941098499"],"width":720},"title":"@军仔 .《激情演绎》创作的原声","unshelve_countries":null,"user_count":0},"nickname_position":null,"origin_comment_ids":null,"position":null,"prevent_download":false,"promotions":null,"rate":12,"raw_ad_data":null,"region":"CN","risk_infos":{"content":"","risk_sink":false,"type":0,"vote":false,"warn":false},"share_info":{"bool_persist":0,"share_desc":"在抖音，记录美好生活","share_link_desc":"昨天才挖点红苕来你就来吃，看我怎样收适你  %s 复制此链接，打开抖音，直接观看视频！","share_quote":"","share_signature_desc":"","share_signature_url":"","share_title":"昨天才挖点红苕来你就来吃，看我怎样收适你","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/video/6883632109148261639/?region=CN&mid=6881543675483474696&u_code=i0kji679&titleType=title&did=71471896106&iid=3993023441537288","share_weibo_desc":"#在抖音，记录美好生活#昨天才挖点红苕来你就来吃，看我怎样收适你"},"share_url":"https://www.iesdouyin.com/share/video/6883632109148261639/?region=CN&mid=6881543675483474696&u_code=i0kji679&titleType=title&did=71471896106&iid=3993023441537288","sort_label":"_","statistics":{"aweme_id":"6883632109148261639","comment_count":948,"digg_count":32483,"download_count":1076,"forward_count":57,"lose_comment_count":0,"lose_count":0,"play_count":0,"share_count":277,"whatsapp_share_count":0},"status":{"allow_comment":true,"allow_share":true,"aweme_id":"6883632109148261639","download_status":0,"in_reviewing":false,"is_delete":false,"is_private":false,"is_prohibited":false,"private_status":0,"reviewed":1,"self_see":false,"with_fusion_goods":false,"with_goods":false},"text_extra":[],"uniqid_position":null,"user_digged":0,"user_profile_init_info":{"head_model_score":0.0256195068359375},"video":{"big_thumbs":null,"bit_rate":[{"bit_rate":2159636,"gear_name":"adapt_lowest_720","is_h265":1,"play_addr":{"data_size":4036900,"file_cs":"c:0-17816-3ce7","height":720,"uri":"v0300fb30000bu3p4q9q3b4is62e1um0","url_key":"v0300fb30000bu3p4q9q3b4is62e1um0_bytevc1_720p_2159636","url_list":["http://v26-dy.ixigua.com/bd4228dae4beeb60966577543ece607f/5f87f210/video/tos/cn/tos-cn-ve-15/e57609f07aff4af6ba5455c707f65357/?a=1128&br=6327&bt=2109&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=M3hoOWxldHRzeDMzNmkzM0ApZDU6ZDtkOWU8N2k7PDs8ZmdqLi9wMTA2MTBfLS1fLTBzc15fM19fNmAxXl8yLjQwMzE6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/5bf2a3d381edfa0252988764d81be2b6/5f87f210/video/tos/cn/tos-cn-ve-15/e57609f07aff4af6ba5455c707f65357/?a=1128&br=6327&bt=2109&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=M3hoOWxldHRzeDMzNmkzM0ApZDU6ZDtkOWU8N2k7PDs8ZmdqLi9wMTA2MTBfLS1fLTBzc15fM19fNmAxXl8yLjQwMzE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":4036900,"file_cs":"c:0-17816-3ce7","height":720,"uri":"v0300fb30000bu3p4q9q3b4is62e1um0","url_key":"v0300fb30000bu3p4q9q3b4is62e1um0_bytevc1_720p_2159636","url_list":["http://v26-dy.ixigua.com/bd4228dae4beeb60966577543ece607f/5f87f210/video/tos/cn/tos-cn-ve-15/e57609f07aff4af6ba5455c707f65357/?a=1128&br=6327&bt=2109&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=M3hoOWxldHRzeDMzNmkzM0ApZDU6ZDtkOWU8N2k7PDs8ZmdqLi9wMTA2MTBfLS1fLTBzc15fM19fNmAxXl8yLjQwMzE6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/5bf2a3d381edfa0252988764d81be2b6/5f87f210/video/tos/cn/tos-cn-ve-15/e57609f07aff4af6ba5455c707f65357/?a=1128&br=6327&bt=2109&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=M3hoOWxldHRzeDMzNmkzM0ApZDU6ZDtkOWU8N2k7PDs8ZmdqLi9wMTA2MTBfLS1fLTBzc15fM19fNmAxXl8yLjQwMzE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"quality_type":15},{"bit_rate":2001067,"gear_name":"adapt_540","is_h265":1,"play_addr":{"data_size":3740496,"file_cs":"c:0-17816-de9e","height":720,"uri":"v0300fb30000bu3p4q9q3b4is62e1um0","url_key":"v0300fb30000bu3p4q9q3b4is62e1um0_bytevc1_540p_2001067","url_list":["http://v26-dy.ixigua.com/99c3f1b9830b25f738ebfa7006799da8/5f87f210/video/tos/cn/tos-cn-ve-15/a40728500dd54ad1b43f6ce6bd337108/?a=1128&br=7816&bt=1954&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=M3hoOWxldHRzeDMzNmkzM0ApaTQ0PDc2OzszN2RnODQ8OmdqLi9wMTA2MTBfLS1fLTBzc14wYTUtMS81MmMyMV9eXi86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/f1f5dbc9cf887355b9f64c4337fb9719/5f87f210/video/tos/cn/tos-cn-ve-15/a40728500dd54ad1b43f6ce6bd337108/?a=1128&br=7816&bt=1954&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=M3hoOWxldHRzeDMzNmkzM0ApaTQ0PDc2OzszN2RnODQ8OmdqLi9wMTA2MTBfLS1fLTBzc14wYTUtMS81MmMyMV9eXi86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":3740496,"file_cs":"c:0-17816-de9e","height":720,"uri":"v0300fb30000bu3p4q9q3b4is62e1um0","url_key":"v0300fb30000bu3p4q9q3b4is62e1um0_bytevc1_540p_2001067","url_list":["http://v26-dy.ixigua.com/99c3f1b9830b25f738ebfa7006799da8/5f87f210/video/tos/cn/tos-cn-ve-15/a40728500dd54ad1b43f6ce6bd337108/?a=1128&br=7816&bt=1954&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=M3hoOWxldHRzeDMzNmkzM0ApaTQ0PDc2OzszN2RnODQ8OmdqLi9wMTA2MTBfLS1fLTBzc14wYTUtMS81MmMyMV9eXi86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/f1f5dbc9cf887355b9f64c4337fb9719/5f87f210/video/tos/cn/tos-cn-ve-15/a40728500dd54ad1b43f6ce6bd337108/?a=1128&br=7816&bt=1954&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=M3hoOWxldHRzeDMzNmkzM0ApaTQ0PDc2OzszN2RnODQ8OmdqLi9wMTA2MTBfLS1fLTBzc14wYTUtMS81MmMyMV9eXi86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"quality_type":28}],"cdn_url_expired":0,"cover":{"height":720,"uri":"large/tos-cn-p-0015/1198345846e0432b80c4bc43796324d8","url_list":["http://p29-dy.byteimg.com/large/tos-cn-p-0015/1198345846e0432b80c4bc43796324d8.webp?from=2563711402_large","http://p1-dy-ipv6.byteimg.com/large/tos-cn-p-0015/1198345846e0432b80c4bc43796324d8.webp?from=2563711402_large","http://p3-dy-ipv6.byteimg.com/large/tos-cn-p-0015/1198345846e0432b80c4bc43796324d8.webp?from=2563711402_large","http://p29-dy.byteimg.com/large/tos-cn-p-0015/1198345846e0432b80c4bc43796324d8.jpeg?from=2563711402_large"],"width":720},"download_addr":{"data_size":6812098,"height":720,"uri":"v0300fb30000bu3p4q9q3b4is62e1um0","url_list":["http://v26-dy.ixigua.com/24cfd0ab5803c7beca4d2cb6094916eb/5f87f210/video/tos/cn/tos-cn-ve-15/b0d8606fdab744d0b5a5d85cd0f3042d/?a=1128&br=8883&bt=2961&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M3hoOWxldHRzeDMzNmkzM0ApZ2Q3ZGY4NDxkNzZkMzQ4OWdqLi9wMTA2MTBfLS1fLTBzc2EyYjI2NC01NWIxMDMxMy86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/5a66668c5b3f4e95a3969a4b4c27ca60/5f87f210/video/tos/cn/tos-cn-ve-15/b0d8606fdab744d0b5a5d85cd0f3042d/?a=1128&br=8883&bt=2961&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M3hoOWxldHRzeDMzNmkzM0ApZ2Q3ZGY4NDxkNzZkMzQ4OWdqLi9wMTA2MTBfLS1fLTBzc2EyYjI2NC01NWIxMDMxMy86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"download_suffix_logo_addr":{"data_size":6812098,"height":720,"uri":"v0300fb30000bu3p4q9q3b4is62e1um0","url_list":["http://v26-dy.ixigua.com/24cfd0ab5803c7beca4d2cb6094916eb/5f87f210/video/tos/cn/tos-cn-ve-15/b0d8606fdab744d0b5a5d85cd0f3042d/?a=1128&br=8883&bt=2961&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M3hoOWxldHRzeDMzNmkzM0ApZ2Q3ZGY4NDxkNzZkMzQ4OWdqLi9wMTA2MTBfLS1fLTBzc2EyYjI2NC01NWIxMDMxMy86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/5a66668c5b3f4e95a3969a4b4c27ca60/5f87f210/video/tos/cn/tos-cn-ve-15/b0d8606fdab744d0b5a5d85cd0f3042d/?a=1128&br=8883&bt=2961&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M3hoOWxldHRzeDMzNmkzM0ApZ2Q3ZGY4NDxkNzZkMzQ4OWdqLi9wMTA2MTBfLS1fLTBzc2EyYjI2NC01NWIxMDMxMy86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"duration":14954,"dynamic_cover":{"height":720,"uri":"tos-cn-p-0015/bcf2d732d424499da011d375b68c515b_1602720504","url_list":["https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/bcf2d732d424499da011d375b68c515b_1602720504?from=2563711402_large","https://p6-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/bcf2d732d424499da011d375b68c515b_1602720504?from=2563711402_large","https://p1-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/bcf2d732d424499da011d375b68c515b_1602720504?from=2563711402_large"],"width":720},"has_download_suffix_logo_addr":true,"has_watermark":true,"height":1024,"is_h265":0,"origin_cover":{"height":720,"uri":"tos-cn-p-0015/fc3bae3f0c2f45f9bc4ac5cadd1827b8_1602720503","url_list":["https://p29-dy.byteimg.com/tos-cn-p-0015/fc3bae3f0c2f45f9bc4ac5cadd1827b8_1602720503~tplv-dy-360p.webp?from=2563711402","https://p26-dy.byteimg.com/tos-cn-p-0015/fc3bae3f0c2f45f9bc4ac5cadd1827b8_1602720503~tplv-dy-360p.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/tos-cn-p-0015/fc3bae3f0c2f45f9bc4ac5cadd1827b8_1602720503~tplv-dy-360p.webp?from=2563711402","https://p29-dy.byteimg.com/tos-cn-p-0015/fc3bae3f0c2f45f9bc4ac5cadd1827b8_1602720503~tplv-dy-360p.jpeg?from=2563711402"],"width":720},"play_addr":{"data_size":5204767,"file_cs":"c:0-17695-a123","height":720,"uri":"v0300fb30000bu3p4q9q3b4is62e1um0","url_key":"v0300fb30000bu3p4q9q3b4is62e1um0_h264_540p_2784414","url_list":["http://v26-dy.ixigua.com/80d81612d486ef9c3c4d1c6a565f7d40/5f87f210/video/tos/cn/tos-cn-ve-15/fa163add24e2475880406a0cd40865bb/?a=1128&br=8157&bt=2719&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M3hoOWxldHRzeDMzNmkzM0ApNWg2OTQ6NWQ2N2gzOztkZmdqLi9wMTA2MTBfLS1fLTBzc2I2YGMtYWEtNl8tLTAvYl86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/ab1658d8273ca3e26e0ee34afd3e04e9/5f87f210/video/tos/cn/tos-cn-ve-15/fa163add24e2475880406a0cd40865bb/?a=1128&br=8157&bt=2719&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M3hoOWxldHRzeDMzNmkzM0ApNWg2OTQ6NWQ2N2gzOztkZmdqLi9wMTA2MTBfLS1fLTBzc2I2YGMtYWEtNl8tLTAvYl86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":3740496,"file_cs":"c:0-17816-de9e","height":720,"uri":"v0300fb30000bu3p4q9q3b4is62e1um0","url_key":"v0300fb30000bu3p4q9q3b4is62e1um0_bytevc1_540p_2001067","url_list":["http://v26-dy.ixigua.com/99c3f1b9830b25f738ebfa7006799da8/5f87f210/video/tos/cn/tos-cn-ve-15/a40728500dd54ad1b43f6ce6bd337108/?a=1128&br=7816&bt=1954&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=M3hoOWxldHRzeDMzNmkzM0ApaTQ0PDc2OzszN2RnODQ8OmdqLi9wMTA2MTBfLS1fLTBzc14wYTUtMS81MmMyMV9eXi86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/f1f5dbc9cf887355b9f64c4337fb9719/5f87f210/video/tos/cn/tos-cn-ve-15/a40728500dd54ad1b43f6ce6bd337108/?a=1128&br=7816&bt=1954&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=M3hoOWxldHRzeDMzNmkzM0ApaTQ0PDc2OzszN2RnODQ8OmdqLi9wMTA2MTBfLS1fLTBzc14wYTUtMS81MmMyMV9eXi86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_h264":{"data_size":5204767,"file_cs":"c:0-17695-a123","height":720,"uri":"v0300fb30000bu3p4q9q3b4is62e1um0","url_key":"v0300fb30000bu3p4q9q3b4is62e1um0_h264_540p_2784414","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"play_addr_lowbr":{"data_size":5204767,"file_cs":"c:0-17695-a123","height":720,"uri":"v0300fb30000bu3p4q9q3b4is62e1um0","url_key":"v0300fb30000bu3p4q9q3b4is62e1um0_h264_540p_2784414","url_list":["http://v26-dy.ixigua.com/80d81612d486ef9c3c4d1c6a565f7d40/5f87f210/video/tos/cn/tos-cn-ve-15/fa163add24e2475880406a0cd40865bb/?a=1128&br=8157&bt=2719&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M3hoOWxldHRzeDMzNmkzM0ApNWg2OTQ6NWQ2N2gzOztkZmdqLi9wMTA2MTBfLS1fLTBzc2I2YGMtYWEtNl8tLTAvYl86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/ab1658d8273ca3e26e0ee34afd3e04e9/5f87f210/video/tos/cn/tos-cn-ve-15/fa163add24e2475880406a0cd40865bb/?a=1128&br=8157&bt=2719&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M3hoOWxldHRzeDMzNmkzM0ApNWg2OTQ6NWQ2N2gzOztkZmdqLi9wMTA2MTBfLS1fLTBzc2I2YGMtYWEtNl8tLTAvYl86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fb30000bu3p4q9q3b4is62e1um0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"ratio":"540p","width":576},"video_control":{"allow_download":true,"allow_duet":true,"allow_dynamic_wallpaper":true,"allow_music":true,"allow_react":true,"draft_progress_bar":0,"prevent_download_type":0,"share_type":1,"show_progress_bar":0,"timer_status":1},"video_labels":null,"video_text":null,"vr_type":0,"with_promotional_music":false,"xigua_task":{"is_xigua_task":false}},{"anchors":null,"author":{"accept_private_policy":false,"account_region":"","ad_cover_url":null,"apple_account":0,"authority_status":0,"avatar_168x168":{"height":720,"uri":"http://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d","url_list":["http://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d"],"width":720},"avatar_300x300":{"height":720,"uri":"http://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d","url_list":["http://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d"],"width":720},"avatar_larger":{"height":720,"uri":"http://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d","url_list":["https://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d"],"width":720},"avatar_medium":{"height":720,"uri":"http://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d","url_list":["https://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d"],"width":720},"avatar_thumb":{"height":720,"uri":"http://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d","url_list":["https://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d"],"width":720},"avatar_uri":"http://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d","aweme_count":0,"bind_phone":"","birthday":"1988-01-01","cha_list":null,"comment_filter_status":0,"comment_setting":0,"commerce_user_level":0,"constellation":10,"cover_url":[{"height":720,"uri":"c8510002be9a3a61aad2","url_list":["https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p26-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"],"width":720}],"create_time":0,"custom_verify":"","cv_level":"","download_prompt_ts":0,"download_setting":-1,"duet_setting":0,"enterprise_verify_reason":"","favoriting_count":0,"fb_expire_time":0,"follow_status":0,"follower_count":0,"follower_status":0,"followers_detail":null,"following_count":0,"gender":1,"geofencing":null,"google_account":"","has_email":false,"has_facebook_token":false,"has_insights":false,"has_orders":false,"has_twitter_token":false,"has_unread_story":false,"has_youtube_token":false,"hide_location":false,"hide_search":false,"ins_id":"","is_ad_fake":false,"is_binded_weibo":false,"is_block":false,"is_discipline_member":false,"is_gov_media_vip":false,"is_phone_binded":false,"is_star":false,"is_verified":true,"item_list":null,"language":"zh-Hans","live_agreement":0,"live_agreement_time":0,"live_commerce":false,"live_verify":0,"location":"","need_recommend":0,"neiguang_shield":0,"new_story_cover":null,"nickname":"☁Peng_☁","platform_sync_info":null,"prevent_download":false,"react_setting":0,"reflow_page_gid":0,"reflow_page_uid":0,"region":"CN","relative_users":null,"room_id":0,"school_name":"","school_poi_id":"","school_type":0,"sec_uid":"MS4wLjABAAAAQhfZx-3r5UprPaSICKBHKOtpioxbhKs6FmDHI3agaSg","secret":0,"share_info":{"share_desc":"","share_qrcode_url":{"height":720,"uri":"216a003b92135ce280f4","url_list":["https://p26-dy.byteimg.com/obj/216a003b92135ce280f4?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/216a003b92135ce280f4?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/216a003b92135ce280f4?from=2563711402"],"width":720},"share_title":"","share_title_myself":"","share_title_other":"","share_url":"","share_weibo_desc":""},"share_qrcode_uri":"216a003b92135ce280f4","shield_comment_notice":0,"shield_digg_notice":0,"shield_follow_notice":0,"short_id":"8051083","show_image_bubble":false,"signature":"每天早点睡 没事少玩点手机 对手机不好...\n支线任务 戒烟 主线任务 健身","special_lock":1,"status":1,"story_count":0,"story_open":false,"sync_to_toutiao":0,"total_favorited":0,"tw_expire_time":0,"twitter_id":"","twitter_name":"","type_label":null,"uid":"59000603508","unique_id":"","unique_id_modify_time":1602741234,"user_canceled":false,"user_mode":0,"user_period":0,"user_rate":1,"verification_type":1,"verify_info":"","video_icon":{"height":720,"uri":"","url_list":null,"width":720},"weibo_name":"","weibo_schema":"","weibo_url":"","weibo_verify":"","with_commerce_entry":false,"with_dou_entry":false,"with_fusion_shop_entry":false,"with_shop_entry":false,"youtube_channel_id":"","youtube_channel_title":"","youtube_expire_time":0},"author_user_id":59000603508,"aweme_control":{"can_comment":true,"can_forward":true,"can_share":true,"can_show_comment":true},"aweme_id":"6876309553395305728","aweme_type":0,"bodydance_score":0,"cha_list":[{"author":{"ad_cover_url":null,"cha_list":null,"cover_url":null,"followers_detail":null,"geofencing":null,"item_list":null,"new_story_cover":null,"platform_sync_info":null,"relative_users":null,"type_label":null},"cha_attrs":null,"cha_name":"戒烟","cid":"1564481312768001","collect_stat":0,"connect_music":null,"desc":"","is_challenge":0,"is_commerce":false,"is_pgcshow":false,"schema":"aweme://aweme/challenge/detail?cid=1564481312768001","share_info":{"bool_persist":0,"share_desc":"在抖音，记录美好生活","share_quote":"","share_signature_desc":"","share_signature_url":"","share_title":"我在抖音参加#戒烟 ","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/challenge/1564481312768001/?u_code=i0kji679","share_weibo_desc":"我在抖音参加#戒烟 "},"sub_type":0,"type":0,"user_count":0,"view_count":0}],"challenge_position":null,"city":"610400","cmt_swt":false,"collect_stat":0,"comment_list":null,"commerce_config_data":null,"create_time":1601015583,"desc":"#戒烟 太高估自己意志力了 有那么一刻 觉得自己...#戒烟难","desc_language":"zh","descendants":{"notify_msg":"头条","platforms":["toutiao"]},"distance":"","distribute_type":1,"duration":27520,"enable_top_view":true,"follow_up_type":0,"geofencing":null,"geofencing_regions":null,"group_id":"6876309553395305728","hybrid_label":null,"image_infos":null,"interaction_stickers":null,"is_ads":false,"is_fantasy":false,"is_hash_tag":1,"is_horizontal":false,"is_pgcshow":false,"is_relieve":false,"is_story":0,"is_top":0,"is_vr":false,"item_comment_settings":0,"item_duet":0,"item_react":0,"label_top":{"height":720,"uri":"c150000f34767e2cb56","url_list":["https://p9-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/c150000f34767e2cb56?from=2563711402"],"width":720},"label_top_text":null,"long_video":null,"misc_info":"{\"ocr_location\":\"{\\\"x_max\\\":0.9110833333333334,\\\"x_min\\\":0.08255555555555555,\\\"y_max\\\":0.5417500000000001,\\\"y_min\\\":0.456359375}\"}","music":{"album":"","author":"☁Peng_☁","author_deleted":false,"author_position":null,"avatar_large":{"height":720,"uri":"http://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d","url_list":["https://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d"],"width":720},"avatar_medium":{"height":720,"uri":"http://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d","url_list":["https://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d"],"width":720},"avatar_thumb":{"height":720,"uri":"http://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d","url_list":["https://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d"],"width":720},"binded_challenge_id":0,"collect_stat":0,"cover_hd":{"height":720,"uri":"http://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d","url_list":["https://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d"],"width":720},"cover_large":{"height":720,"uri":"http://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d","url_list":["https://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d"],"width":720},"cover_medium":{"height":720,"uri":"http://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d","url_list":["https://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d"],"width":720},"cover_thumb":{"height":720,"uri":"http://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d","url_list":["https://p3.pstatp.com/thumb/1a6c001e4a434fa6fe5d"],"width":720},"duration":27,"end_time":0,"external_song_info":null,"extra":"{\"reviewed\":1,\"douyin_beats_info\":{},\"hotsoon_review_time\":-1,\"aggregate_exempt_conf\":[],\"has_edited\":0,\"beats\":{},\"schedule_search_time\":0,\"music_label_id\":null,\"review_unshelve_reason\":0}","id":6876309582898350856,"id_str":"6876309582898350856","is_author_artist":false,"is_del_video":false,"is_original":false,"is_pgc":false,"is_restricted":false,"is_video_self_see":false,"mid":"6876309582898350856","mute_share":false,"offline_desc":"","owner_handle":"8051083","owner_id":"59000603508","owner_nickname":"☁Peng_☁","play_url":{"height":720,"uri":"https://p9-dy.byteimg.com/obj/ies-music/6876309543460424461.mp3","url_list":["https://p9-dy.byteimg.com/obj/ies-music/6876309543460424461.mp3","https://p1-dy.byteimg.com/obj/ies-music/6876309543460424461.mp3"],"width":720},"position":null,"prevent_download":false,"prevent_item_download_status":0,"preview_end_time":0,"preview_start_time":0,"redirect":false,"schema_url":"","sec_uid":"MS4wLjABAAAAQhfZx-3r5UprPaSICKBHKOtpioxbhKs6FmDHI3agaSg","source_platform":23,"start_time":0,"status":1,"strong_beat_url":{"height":720,"uri":"https://p1-dy.byteimg.com/obj/ies-music/strong_beat/1678821743666189","url_list":["https://p1-dy.byteimg.com/obj/ies-music/strong_beat/1678821743666189","https://p9-dy.byteimg.com/obj/ies-music/strong_beat/1678821743666189"],"width":720},"title":"@☁Peng_☁创作的原声","unshelve_countries":null,"user_count":0},"nickname_position":null,"origin_comment_ids":null,"position":null,"prevent_download":false,"promotions":null,"rate":12,"raw_ad_data":null,"region":"CN","risk_infos":{"content":"","risk_sink":false,"type":0,"vote":false,"warn":false},"share_info":{"bool_persist":0,"share_desc":"在抖音，记录美好生活","share_link_desc":"#戒烟 太高估自己意志力了 有那么一刻 觉得自己...#戒烟难  %s 复制此链接，打开抖音，直接观看视频！","share_quote":"","share_signature_desc":"","share_signature_url":"","share_title":"#戒烟 太高估自己意志力了 有那么一刻 觉得自己...#戒烟难","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/video/6876309553395305728/?region=CN&mid=6876309582898350856&u_code=i0kji679&titleType=title&did=71471896106&iid=3993023441537288","share_weibo_desc":"#在抖音，记录美好生活##戒烟 太高估自己意志力了 有那么一刻 觉得自己...#戒烟难"},"share_url":"https://www.iesdouyin.com/share/video/6876309553395305728/?region=CN&mid=6876309582898350856&u_code=i0kji679&titleType=title&did=71471896106&iid=3993023441537288","sort_label":"_","statistics":{"aweme_id":"6876309553395305728","comment_count":22477,"digg_count":713455,"download_count":2898,"forward_count":92,"lose_comment_count":0,"lose_count":0,"play_count":0,"share_count":1802,"whatsapp_share_count":0},"status":{"allow_comment":true,"allow_share":true,"aweme_id":"6876309553395305728","download_status":0,"in_reviewing":false,"is_delete":false,"is_private":false,"is_prohibited":false,"private_status":0,"reviewed":1,"self_see":false,"with_fusion_goods":false,"with_goods":false},"text_extra":[{"end":3,"hashtag_id":"1564481312768001","hashtag_name":"戒烟","is_commerce":false,"start":0,"type":1},{"end":31,"hashtag_id":"1597705762918407","hashtag_name":"戒烟难","is_commerce":false,"start":27,"type":1}],"uniqid_position":null,"user_digged":0,"user_profile_init_info":{"head_model_score":0.08409231901168823},"video":{"big_thumbs":null,"bit_rate":[{"bit_rate":1625004,"gear_name":"adapt_lowest_720","is_h265":1,"play_addr":{"data_size":5590014,"file_cs":"c:0-39041-fb40","height":720,"uri":"v0200fea0000btmott7jftlnjeqlggig","url_key":"v0200fea0000btmott7jftlnjeqlggig_bytevc1_720p_1625004","url_list":["http://v26-dy.ixigua.com/3f8f0e024ff9ad4c4736bae835baf38c/5f87f21d/video/tos/cn/tos-cn-ve-15/f04306eac4fa4a0cafacb94380210533/?a=1128&br=4758&bt=1586&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=ampvaHF3bXdydzMzZGkzM0ApNjlpNWRpNjs2NzxoNDk3NmdmZG5naWM0cWpfLS1iLS9zczUwYF5iYjEzX2E1NjM2NWM6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/6a1dda09f41dba20968fc5da3ce5f6eb/5f87f21d/video/tos/cn/tos-cn-ve-15/f04306eac4fa4a0cafacb94380210533/?a=1128&br=4758&bt=1586&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=ampvaHF3bXdydzMzZGkzM0ApNjlpNWRpNjs2NzxoNDk3NmdmZG5naWM0cWpfLS1iLS9zczUwYF5iYjEzX2E1NjM2NWM6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":5590014,"file_cs":"c:0-39041-fb40","height":720,"uri":"v0200fea0000btmott7jftlnjeqlggig","url_key":"v0200fea0000btmott7jftlnjeqlggig_bytevc1_720p_1625004","url_list":["http://v26-dy.ixigua.com/3f8f0e024ff9ad4c4736bae835baf38c/5f87f21d/video/tos/cn/tos-cn-ve-15/f04306eac4fa4a0cafacb94380210533/?a=1128&br=4758&bt=1586&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=ampvaHF3bXdydzMzZGkzM0ApNjlpNWRpNjs2NzxoNDk3NmdmZG5naWM0cWpfLS1iLS9zczUwYF5iYjEzX2E1NjM2NWM6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/6a1dda09f41dba20968fc5da3ce5f6eb/5f87f21d/video/tos/cn/tos-cn-ve-15/f04306eac4fa4a0cafacb94380210533/?a=1128&br=4758&bt=1586&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=ampvaHF3bXdydzMzZGkzM0ApNjlpNWRpNjs2NzxoNDk3NmdmZG5naWM0cWpfLS1iLS9zczUwYF5iYjEzX2E1NjM2NWM6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"quality_type":15},{"bit_rate":1370199,"gear_name":"adapt_540","is_h265":1,"play_addr":{"data_size":4713486,"file_cs":"c:0-39045-7a76","height":720,"uri":"v0200fea0000btmott7jftlnjeqlggig","url_key":"v0200fea0000btmott7jftlnjeqlggig_bytevc1_540p_1370199","url_list":["http://v26-dy.ixigua.com/6dffdd1be49422af2f4af0818f41ef8e/5f87f21d/video/tos/cn/tos-cn-ve-15/05e70ec6cd5b4f2f9be85878e1c8df7b/?a=1128&br=5352&bt=1338&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=ampvaHF3bXdydzMzZGkzM0ApZ2g4NDU6NTs5N2c2OWYzZmdmZG5naWM0cWpfLS1iLS9zczZjXzZjMDAwNl9fLzReXmE6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/a3c82fd588c55c1cda725c9c5b50968e/5f87f21d/video/tos/cn/tos-cn-ve-15/05e70ec6cd5b4f2f9be85878e1c8df7b/?a=1128&br=5352&bt=1338&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=ampvaHF3bXdydzMzZGkzM0ApZ2g4NDU6NTs5N2c2OWYzZmdmZG5naWM0cWpfLS1iLS9zczZjXzZjMDAwNl9fLzReXmE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":4713486,"file_cs":"c:0-39045-7a76","height":720,"uri":"v0200fea0000btmott7jftlnjeqlggig","url_key":"v0200fea0000btmott7jftlnjeqlggig_bytevc1_540p_1370199","url_list":["http://v26-dy.ixigua.com/6dffdd1be49422af2f4af0818f41ef8e/5f87f21d/video/tos/cn/tos-cn-ve-15/05e70ec6cd5b4f2f9be85878e1c8df7b/?a=1128&br=5352&bt=1338&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=ampvaHF3bXdydzMzZGkzM0ApZ2g4NDU6NTs5N2c2OWYzZmdmZG5naWM0cWpfLS1iLS9zczZjXzZjMDAwNl9fLzReXmE6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/a3c82fd588c55c1cda725c9c5b50968e/5f87f21d/video/tos/cn/tos-cn-ve-15/05e70ec6cd5b4f2f9be85878e1c8df7b/?a=1128&br=5352&bt=1338&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=ampvaHF3bXdydzMzZGkzM0ApZ2g4NDU6NTs5N2c2OWYzZmdmZG5naWM0cWpfLS1iLS9zczZjXzZjMDAwNl9fLzReXmE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"quality_type":28}],"cdn_url_expired":0,"cover":{"height":720,"uri":"large/tos-cn-p-0015/5de694fc22bd4a70b913d543bfe20d75","url_list":["http://p26-dy.byteimg.com/large/tos-cn-p-0015/5de694fc22bd4a70b913d543bfe20d75.webp?from=2563711402_large","http://p3-dy-ipv6.byteimg.com/large/tos-cn-p-0015/5de694fc22bd4a70b913d543bfe20d75.webp?from=2563711402_large","http://p9-dy.byteimg.com/large/tos-cn-p-0015/5de694fc22bd4a70b913d543bfe20d75.webp?from=2563711402_large","http://p26-dy.byteimg.com/large/tos-cn-p-0015/5de694fc22bd4a70b913d543bfe20d75.jpeg?from=2563711402_large"],"width":720},"download_addr":{"data_size":10803373,"height":720,"uri":"v0200fea0000btmott7jftlnjeqlggig","url_list":["http://v26-dy.ixigua.com/00732000e7cf3c035fef857f70911af4/5f87f21d/video/tos/cn/tos-cn-ve-15/457c8540b6e14043b7955279669dcad4/?a=1128&br=8292&bt=2764&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=ampvaHF3bXdydzMzZGkzM0ApOmg7aDY7NztnNzo2NzpmNGdmZG5naWM0cWpfLS1iLS9zczRfMGJiNTMyLWFiM14zYjM6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/4611536f2f41daa34a828e082b4fdecd/5f87f21d/video/tos/cn/tos-cn-ve-15/457c8540b6e14043b7955279669dcad4/?a=1128&br=8292&bt=2764&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=ampvaHF3bXdydzMzZGkzM0ApOmg7aDY7NztnNzo2NzpmNGdmZG5naWM0cWpfLS1iLS9zczRfMGJiNTMyLWFiM14zYjM6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"download_suffix_logo_addr":{"data_size":10803373,"height":720,"uri":"v0200fea0000btmott7jftlnjeqlggig","url_list":["http://v26-dy.ixigua.com/00732000e7cf3c035fef857f70911af4/5f87f21d/video/tos/cn/tos-cn-ve-15/457c8540b6e14043b7955279669dcad4/?a=1128&br=8292&bt=2764&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=ampvaHF3bXdydzMzZGkzM0ApOmg7aDY7NztnNzo2NzpmNGdmZG5naWM0cWpfLS1iLS9zczRfMGJiNTMyLWFiM14zYjM6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/4611536f2f41daa34a828e082b4fdecd/5f87f21d/video/tos/cn/tos-cn-ve-15/457c8540b6e14043b7955279669dcad4/?a=1128&br=8292&bt=2764&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=ampvaHF3bXdydzMzZGkzM0ApOmg7aDY7NztnNzo2NzpmNGdmZG5naWM0cWpfLS1iLS9zczRfMGJiNTMyLWFiM14zYjM6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"duration":27520,"dynamic_cover":{"height":720,"uri":"tos-cn-p-0015/09d7dc1abee8461b9951b70a232e30ed_1601015584","url_list":["https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/09d7dc1abee8461b9951b70a232e30ed_1601015584?from=2563711402_large","https://p6-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/09d7dc1abee8461b9951b70a232e30ed_1601015584?from=2563711402_large","https://p26-dy.byteimg.com/obj/tos-cn-p-0015/09d7dc1abee8461b9951b70a232e30ed_1601015584?from=2563711402_large"],"width":720},"has_download_suffix_logo_addr":true,"has_watermark":true,"height":1024,"is_h265":0,"origin_cover":{"height":720,"uri":"tos-cn-p-0015/33bd51cd3ec745258589e57bcfd1a182_1601015584","url_list":["https://p26-dy.byteimg.com/tos-cn-p-0015/33bd51cd3ec745258589e57bcfd1a182_1601015584~tplv-dy-360p.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/tos-cn-p-0015/33bd51cd3ec745258589e57bcfd1a182_1601015584~tplv-dy-360p.webp?from=2563711402","https://p9-dy.byteimg.com/tos-cn-p-0015/33bd51cd3ec745258589e57bcfd1a182_1601015584~tplv-dy-360p.webp?from=2563711402","https://p26-dy.byteimg.com/tos-cn-p-0015/33bd51cd3ec745258589e57bcfd1a182_1601015584~tplv-dy-360p.jpeg?from=2563711402"],"width":720},"play_addr":{"data_size":7503106,"file_cs":"c:0-38535-7dca","height":720,"uri":"v0200fea0000btmott7jftlnjeqlggig","url_key":"v0200fea0000btmott7jftlnjeqlggig_h264_540p_2181531","url_list":["http://v26-dy.ixigua.com/ff817d59b4a85bab9564711f35fc1f53/5f87f21d/video/tos/cn/tos-cn-ve-15/7444cf6c13d045abbe29dbbdb10c3f10/?a=1128&br=6390&bt=2130&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=ampvaHF3bXdydzMzZGkzM0ApNjs3Zjg8O2VnNzRlZztmOWdmZG5naWM0cWpfLS1iLS9zc2AvYTQ2Xl8yYV8xYzM2MjY6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/37b00972e2fbec140db10fe23858dd19/5f87f21d/video/tos/cn/tos-cn-ve-15/7444cf6c13d045abbe29dbbdb10c3f10/?a=1128&br=6390&bt=2130&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=ampvaHF3bXdydzMzZGkzM0ApNjs3Zjg8O2VnNzRlZztmOWdmZG5naWM0cWpfLS1iLS9zc2AvYTQ2Xl8yYV8xYzM2MjY6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":4713486,"file_cs":"c:0-39045-7a76","height":720,"uri":"v0200fea0000btmott7jftlnjeqlggig","url_key":"v0200fea0000btmott7jftlnjeqlggig_bytevc1_540p_1370199","url_list":["http://v26-dy.ixigua.com/6dffdd1be49422af2f4af0818f41ef8e/5f87f21d/video/tos/cn/tos-cn-ve-15/05e70ec6cd5b4f2f9be85878e1c8df7b/?a=1128&br=5352&bt=1338&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=ampvaHF3bXdydzMzZGkzM0ApZ2g4NDU6NTs5N2c2OWYzZmdmZG5naWM0cWpfLS1iLS9zczZjXzZjMDAwNl9fLzReXmE6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/a3c82fd588c55c1cda725c9c5b50968e/5f87f21d/video/tos/cn/tos-cn-ve-15/05e70ec6cd5b4f2f9be85878e1c8df7b/?a=1128&br=5352&bt=1338&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=ampvaHF3bXdydzMzZGkzM0ApZ2g4NDU6NTs5N2c2OWYzZmdmZG5naWM0cWpfLS1iLS9zczZjXzZjMDAwNl9fLzReXmE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_h264":{"data_size":7503106,"file_cs":"c:0-38535-7dca","height":720,"uri":"v0200fea0000btmott7jftlnjeqlggig","url_key":"v0200fea0000btmott7jftlnjeqlggig_h264_540p_2181531","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"play_addr_lowbr":{"data_size":7503106,"file_cs":"c:0-38535-7dca","height":720,"uri":"v0200fea0000btmott7jftlnjeqlggig","url_key":"v0200fea0000btmott7jftlnjeqlggig_h264_540p_2181531","url_list":["http://v26-dy.ixigua.com/ff817d59b4a85bab9564711f35fc1f53/5f87f21d/video/tos/cn/tos-cn-ve-15/7444cf6c13d045abbe29dbbdb10c3f10/?a=1128&br=6390&bt=2130&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=ampvaHF3bXdydzMzZGkzM0ApNjs3Zjg8O2VnNzRlZztmOWdmZG5naWM0cWpfLS1iLS9zc2AvYTQ2Xl8yYV8xYzM2MjY6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/37b00972e2fbec140db10fe23858dd19/5f87f21d/video/tos/cn/tos-cn-ve-15/7444cf6c13d045abbe29dbbdb10c3f10/?a=1128&br=6390&bt=2130&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=ampvaHF3bXdydzMzZGkzM0ApNjs3Zjg8O2VnNzRlZztmOWdmZG5naWM0cWpfLS1iLS9zc2AvYTQ2Xl8yYV8xYzM2MjY6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200fea0000btmott7jftlnjeqlggig&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"ratio":"540p","width":576},"video_control":{"allow_download":true,"allow_duet":true,"allow_dynamic_wallpaper":true,"allow_music":true,"allow_react":true,"draft_progress_bar":0,"prevent_download_type":0,"share_type":1,"show_progress_bar":0,"timer_status":1},"video_labels":null,"video_text":null,"vr_type":0,"with_promotional_music":false,"xigua_task":{"is_xigua_task":false}},{"anchors":null,"author":{"ad_cover_url":null,"avatar_168x168":{"height":720,"uri":"web.business.image/202003145d0dd378fcd2c7904d48917d","url_list":["http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad"],"width":720},"avatar_300x300":{"height":720,"uri":"web.business.image/202003145d0dd378fcd2c7904d48917d","url_list":["http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad"],"width":720},"avatar_larger":{"uri":"web.business.image/202003145d0dd378fcd2c7904d48917d","url_list":["http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad"]},"avatar_medium":{"height":720,"uri":"web.business.image/202003145d0dd378fcd2c7904d48917d","url_list":["http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad"],"width":720},"avatar_thumb":{"height":720,"uri":"web.business.image/202003145d0dd378fcd2c7904d48917d","url_list":["http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad"],"width":720},"cha_list":null,"comment_filter_status":0,"comment_setting":0,"commerce_user_level":0,"cover_url":[{"height":720,"uri":"c8510002be9a3a61aad2","url_list":["https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085","https://p26-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085"],"width":720}],"custom_verify":"","download_setting":-1,"duet_setting":0,"enterprise_verify_reason":"","follow_status":0,"followers_detail":null,"geofencing":null,"hide_location":false,"is_ad_fake":true,"is_block":false,"is_gov_media_vip":false,"is_star":false,"is_verified":true,"item_list":null,"language":"","location":"","new_story_cover":null,"nickname":"新生植发","platform_sync_info":null,"prevent_download":false,"region":"CN","relative_users":null,"room_id":0,"sec_uid":"MS4wLjABAAAAwq70QPVrfOSqcFh6juep1O1CDBFV2Ec1A8eeRUWgWA0C-DzacD3Pci0zJmgSnmyA","secret":0,"short_id":"3878460804","signature":"","type_label":null,"uid":"2462529482663976","unique_id":"dyghr351os1j","verification_type":0,"video_icon":{"height":720,"uri":"","url_list":null,"width":720},"with_commerce_entry":false},"author_user_id":2462529482663976,"aweme_control":{"can_comment":true,"can_forward":true,"can_share":true,"can_show_comment":true},"aweme_id":"6882963188636323076","aweme_type":0,"cha_list":null,"challenge_position":null,"cmt_swt":false,"collect_stat":0,"comment_list":null,"commerce_config_data":null,"commerce_info":{"avoid_global_pendant":true},"create_time":1602564758,"desc":"想植发又怕贵？广州发友们福利来了！免费咨询1元试种方案！","desc_language":"un","distance":"","distribute_type":1,"duration":23383,"enable_top_view":false,"geofencing":null,"geofencing_regions":null,"group_id":"6882963188636323076","hybrid_label":null,"image_infos":null,"interaction_stickers":null,"is_ads":true,"is_fantasy":false,"is_hash_tag":1,"is_relieve":false,"is_top":0,"is_vr":false,"item_comment_settings":0,"item_duet":2,"item_react":2,"label_top_text":null,"long_video":null,"music":{"author":"新生植发","author_deleted":false,"author_position":null,"avatar_large":{"height":720,"uri":"web.business.image/202003145d0dd378fcd2c7904d48917d","url_list":["http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad"],"width":720},"avatar_medium":{"height":720,"uri":"web.business.image/202003145d0dd378fcd2c7904d48917d","url_list":["http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad"],"width":720},"avatar_thumb":{"height":720,"uri":"web.business.image/202003145d0dd378fcd2c7904d48917d","url_list":["http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad"],"width":720},"collect_stat":0,"cover_hd":{"height":720,"uri":"web.business.image/202003145d0dd378fcd2c7904d48917d","url_list":["http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad"],"width":720},"cover_large":{"height":720,"uri":"web.business.image/202003145d0dd378fcd2c7904d48917d","url_list":["http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad"],"width":720},"cover_medium":{"height":720,"uri":"web.business.image/202003145d0dd378fcd2c7904d48917d","url_list":["http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad"],"width":720},"cover_thumb":{"height":720,"uri":"web.business.image/202003145d0dd378fcd2c7904d48917d","url_list":["http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad"],"width":720},"duration":23,"end_time":0,"external_song_info":null,"extra":"{\"reviewed\":0,\"beats\":{},\"douyin_beats_info\":{},\"schedule_search_time\":0,\"has_edited\":0}","id":6882963209658501901,"id_str":"6882963209658501901","is_del_video":false,"is_original":false,"is_video_self_see":false,"mid":"6882963209658501901","mute_share":false,"offline_desc":"","owner_handle":"dyghr351os1j","owner_id":"2462529482663976","owner_nickname":"新生植发","play_url":{"height":720,"uri":"http://p9-dy.byteimg.com/obj/ies-music/6882963216580021000.mp3","url_list":["http://p9-dy.byteimg.com/obj/ies-music/6882963216580021000.mp3","http://p1-dy.byteimg.com/obj/ies-music/6882963216580021000.mp3"],"width":720},"position":null,"prevent_download":false,"preview_end_time":0,"preview_start_time":0,"sec_uid":"MS4wLjABAAAAwq70QPVrfOSqcFh6juep1O1CDBFV2Ec1A8eeRUWgWA0C-DzacD3Pci0zJmgSnmyA","source_platform":23,"start_time":0,"status":1,"title":"@新生植发创作的原声","unshelve_countries":null},"nickname_position":null,"origin_comment_ids":null,"position":null,"prevent_download":false,"promotions":null,"rate":10,"raw_ad_data":{"action_extra":"{\"dynamic_creative_request\":\"{\\\"rit\\\":40001,\\\"age\\\":18,\\\"city_name\\\":\\\"广州\\\",\\\"key_words\\\":null,\\\"creatives\\\":null,\\\"provinceID\\\":44,\\\"ac\\\":1,\\\"carrier\\\":2,\\\"gender\\\":1,\\\"platform\\\":1,\\\"dcWords\\\":null,\\\"district_name\\\":\\\"天河\\\",\\\"dynamic_title\\\":null,\\\"dpaLexicons\\\":null,\\\"query\\\":\\\"\\\",\\\"community_name\\\":null,\\\"use_default_keyword\\\":null,\\\"Base\\\":null}\",\"lat\":2311973,\"lon\":11340078,\"tpl_id\":0}","ad_id":1680398755690503,"ad_tag_position":2,"animation_type":3,"avatar_url":"http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","button_style":1,"button_text":"查看详情","click_track_url_list":{"uri":"","url_list":[]},"comment_area":{"avatar_icon":{"uri":"web.business.image/202003145d0dd378fcd2c7904d48917d","url_list":["http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202003145d0dd378fcd2c7904d48917d?from=ad"]},"button_text":"查看详情","comment_info":"想植发又怕贵？广州发友们福利来了！免费咨询1元试种方案！","comment_nickname":"新生植发","comment_time":1602553134,"show_button_number":10,"source":"新生植发","title":"想植发又怕贵？广州发友们福利来了！免费咨询1元试种方案！"},"comment_area_switch":true,"comment_extra":"{\"ad_id\":1680398755690503,\"advertiser_id\":1680143954311181,\"creative_id\":1680399448432702,\"first_industry_id\":1905,\"second_industry_id\":190501,\"third_industry_id\":19050101}","creative_id":1680399448432702,"disable_show_ad_link":true,"dislike":{"dislike_url":"https://aweme.snssdk.com/falcon/fe_douyin_ad_react/pages/ad_push?hide_nav_bar=1&enter_type=normal_ad","label_clickable":true,"name":"为什么看到此广告"},"effective_play_time":0,"group_id":6882963188636323076,"is_ack_action":1,"is_preview":false,"is_real_author":false,"label":{"color":"#14FFFFFF","color_text":"#7FFFFFFF","text":"广告","type":4},"learn_more_bg_color":"#E6A52E","log_extra":"{\"ad_price\":\"X4fj8gAOhuBfh-PyAA6G4Gq2B407SdIFHrn1VA\",\"bdid\":\"0c1b53208cba71115fe72d92b92b5465b21f05a13ec4c414348a39cdfc81ce8b\",\"card_id\":0,\"clickid\":\"EL7A0eGHiv4CGIv17-fkASCqrLqgigIwDDjBuAJCIjIwMjAxMDE1MTM1MzUzMDEwMDE0MDQ1MDgwMEQ1QURFNTlIwbgC\",\"component_ids\":[8,9,10,12],\"convert_component_suspend\":0,\"convert_id\":0,\"dc\":1,\"dc_words\":\"广州\",\"external_action\":2,\"hyrule_atype\":[],\"is_pack_v2\":true,\"orit\":40001,\"placement\":\"unknown\",\"req_id\":\"202010151353530100140450800D5ADE59\",\"rit\":40001,\"style_id\":4916,\"style_ids\":[4916]}","native_card_type":2,"report_enable":true,"show_button_color_seconds":7,"show_button_seconds":5,"show_mask_times":1,"show_special_avatar_style":1,"source":"新生植发","title":"想植发又怕贵？广州发友们福利来了！免费咨询1元试种方案！","track_url_list":{"uri":"","url_list":[]},"type":"web","use_ordinary_web":true,"video_transpose":0,"web_title":"新生植发","web_url":"https://www.chengzijianzhan.com/tetris/page/6882740129313603598/?clickid=EL7A0eGHiv4CGIv17-fkASCqrLqgigIwDDjBuAJCIjIwMjAxMDE1MTM1MzUzMDEwMDE0MDQ1MDgwMEQ1QURFNTlIwbgC&ad_id=1680398755690503&cid=1680399448432702&req_id=202010151353530100140450800D5ADE59"},"region":"","share_info":{"bool_persist":0,"share_desc":"在抖音，记录美好生活","share_link_desc":"想植发又怕贵？本地发友们福利来了！免费咨询1元试种方案！ %s 复制此链接，打开【抖音短视频】，直接观看视频！","share_quote":"","share_title":"想植发又怕贵？本地发友们福利来了！免费咨询1元试种方案！","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/video/6882963188636323076/?region=CN&mid=6882963209658501901&u_code=i0kji679&titleType=title","share_weibo_desc":"#在抖音，记录美好生活#想植发又怕贵？本地发友们福利来了！免费咨询1元试种方案！"},"share_url":"https://www.iesdouyin.com/share/video/6882963188636323076/?region=CN&mid=6882963209658501901&u_code=i0kji679&titleType=title","statistics":{"aweme_id":"6882963188636323076","comment_count":1,"digg_count":81,"download_count":0,"forward_count":0,"lose_comment_count":0,"lose_count":0,"play_count":0,"share_count":0},"status":{"allow_comment":true,"allow_share":true,"aweme_id":"6882963188636323076","download_status":0,"in_reviewing":false,"is_delete":false,"is_private":false,"is_prohibited":false,"private_status":0,"reviewed":1,"self_see":false,"with_fusion_goods":false,"with_goods":false},"text_extra":[],"uniqid_position":null,"user_digged":0,"video":{"big_thumbs":null,"bit_rate":[{"bit_rate":395008,"gear_name":"adapt_lowest_720","is_bytevc1":1,"is_h265":1,"play_addr":{"data_size":1154561,"file_cs":"c:0-21540-39a8","height":720,"uri":"v02033900000btpd6ltolucga95qij20","url_key":"v02033900000btpd6ltolucga95qij20_bytevc1_720p_395008","url_list":["http://v5-dy-d.ixigua.com/2c2d29b730757c27e499de5209628c78/5f87f219/video/tos/cn/tos-cn-ve-51/8967560df0af4ef2b60c82f764a18c6d/?a=1128&br=1155&bt=385&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=M210PGp4cm9ndzMzMzYzM0ApPDxkaTc8OTs4NzhnaWk2PGcvZjJeYGlxM21fLS02MC9zc14wLmJfLzQtMl9eYWA0M186Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/20578046805a83caba0a993081edcb70/5f87f219/video/tos/cn/tos-cn-ve-51/8967560df0af4ef2b60c82f764a18c6d/?a=1128&br=1155&bt=385&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=M210PGp4cm9ndzMzMzYzM0ApPDxkaTc8OTs4NzhnaWk2PGcvZjJeYGlxM21fLS02MC9zc14wLmJfLzQtMl9eYWA0M186Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033900000btpd6ltolucga95qij20&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033900000btpd6ltolucga95qij20&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":1154561,"file_cs":"c:0-21540-39a8","height":720,"uri":"v02033900000btpd6ltolucga95qij20","url_key":"v02033900000btpd6ltolucga95qij20_bytevc1_720p_395008","url_list":["http://v5-dy-d.ixigua.com/2c2d29b730757c27e499de5209628c78/5f87f219/video/tos/cn/tos-cn-ve-51/8967560df0af4ef2b60c82f764a18c6d/?a=1128&br=1155&bt=385&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=M210PGp4cm9ndzMzMzYzM0ApPDxkaTc8OTs4NzhnaWk2PGcvZjJeYGlxM21fLS02MC9zc14wLmJfLzQtMl9eYWA0M186Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/20578046805a83caba0a993081edcb70/5f87f219/video/tos/cn/tos-cn-ve-51/8967560df0af4ef2b60c82f764a18c6d/?a=1128&br=1155&bt=385&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=M210PGp4cm9ndzMzMzYzM0ApPDxkaTc8OTs4NzhnaWk2PGcvZjJeYGlxM21fLS02MC9zc14wLmJfLzQtMl9eYWA0M186Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033900000btpd6ltolucga95qij20&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033900000btpd6ltolucga95qij20&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"quality_type":15}],"cdn_url_expired":0,"cover":{"height":720,"uri":"large/34b6c00056356f3e3a546","url_list":["http://p6-dy-ipv6.byteimg.com/large/34b6c00056356f3e3a546.jpeg?from=2502468085_large","http://p9-dy.byteimg.com/large/34b6c00056356f3e3a546.jpeg?from=2502468085_large","http://p3-dy-ipv6.byteimg.com/large/34b6c00056356f3e3a546.jpeg?from=2502468085_large"],"width":720},"download_addr":{"data_size":1533656,"height":720,"uri":"v02033900000btpd6ltolucga95qij20","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033900000btpd6ltolucga95qij20&line=0&ratio=720p&watermark=0&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033900000btpd6ltolucga95qij20&line=1&ratio=720p&watermark=0&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"duration":23383,"dynamic_cover":{"height":720,"uri":"large/34b6c00056356f3e3a546","url_list":["http://p6-dy-ipv6.byteimg.com/large/34b6c00056356f3e3a546.jpeg?from=2502468085_large","http://p9-dy.byteimg.com/large/34b6c00056356f3e3a546.jpeg?from=2502468085_large","http://p3-dy-ipv6.byteimg.com/large/34b6c00056356f3e3a546.jpeg?from=2502468085_large"],"width":720},"has_watermark":false,"height":1280,"is_bytevc1":0,"is_h265":0,"origin_cover":{"height":720,"uri":"large/34b6c00056356f3e3a546","url_list":["http://p29-dy.byteimg.com/large/34b6c00056356f3e3a546.jpeg?from=2502468085_large","http://p9-dy.byteimg.com/large/34b6c00056356f3e3a546.jpeg?from=2502468085_large","http://p3-dy-ipv6.byteimg.com/large/34b6c00056356f3e3a546.jpeg?from=2502468085_large"],"width":720},"play_addr":{"data_size":1533656,"height":720,"uri":"v02033900000btpd6ltolucga95qij20","url_key":"v02033900000btpd6ltolucga95qij20_h264_720p_524708","url_list":["http://v5-dy-d.ixigua.com/d37fdc0892ac77197560ce3b65de0b7b/5f87f219/video/tos/cn/tos-cn-ve-51/2be48719a99e4600a4af53024dbdf67b/?a=1128&br=1536&bt=512&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M210PGp4cm9ndzMzMzYzM0ApNWU6Njg6ZTw2NzVoM2U7OGcvZjJeYGlxM21fLS02MC9zc2JhXy82YzViXjNjYi9jXjU6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/66820723f7012cfb8f2889982cbff506/5f87f219/video/tos/cn/tos-cn-ve-51/2be48719a99e4600a4af53024dbdf67b/?a=1128&br=1536&bt=512&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M210PGp4cm9ndzMzMzYzM0ApNWU6Njg6ZTw2NzVoM2U7OGcvZjJeYGlxM21fLS02MC9zc2JhXy82YzViXjNjYi9jXjU6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033900000btpd6ltolucga95qij20&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033900000btpd6ltolucga95qij20&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":1154561,"file_cs":"c:0-21540-39a8","height":720,"uri":"v02033900000btpd6ltolucga95qij20","url_key":"v02033900000btpd6ltolucga95qij20_bytevc1_720p_395008","url_list":["http://v5-dy-d.ixigua.com/2c2d29b730757c27e499de5209628c78/5f87f219/video/tos/cn/tos-cn-ve-51/8967560df0af4ef2b60c82f764a18c6d/?a=1128&br=1155&bt=385&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=M210PGp4cm9ndzMzMzYzM0ApPDxkaTc8OTs4NzhnaWk2PGcvZjJeYGlxM21fLS02MC9zc14wLmJfLzQtMl9eYWA0M186Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/20578046805a83caba0a993081edcb70/5f87f219/video/tos/cn/tos-cn-ve-51/8967560df0af4ef2b60c82f764a18c6d/?a=1128&br=1155&bt=385&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=M210PGp4cm9ndzMzMzYzM0ApPDxkaTc8OTs4NzhnaWk2PGcvZjJeYGlxM21fLS02MC9zc14wLmJfLzQtMl9eYWA0M186Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033900000btpd6ltolucga95qij20&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033900000btpd6ltolucga95qij20&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"play_addr_h264":{"data_size":1533656,"height":720,"uri":"v02033900000btpd6ltolucga95qij20","url_key":"v02033900000btpd6ltolucga95qij20_h264_720p_524708","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033900000btpd6ltolucga95qij20&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033900000btpd6ltolucga95qij20&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"play_addr_lowbr":{"data_size":1533656,"height":720,"uri":"v02033900000btpd6ltolucga95qij20","url_key":"v02033900000btpd6ltolucga95qij20_h264_720p_524708","url_list":["http://v5-dy-d.ixigua.com/d37fdc0892ac77197560ce3b65de0b7b/5f87f219/video/tos/cn/tos-cn-ve-51/2be48719a99e4600a4af53024dbdf67b/?a=1128&br=1536&bt=512&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M210PGp4cm9ndzMzMzYzM0ApNWU6Njg6ZTw2NzVoM2U7OGcvZjJeYGlxM21fLS02MC9zc2JhXy82YzViXjNjYi9jXjU6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/66820723f7012cfb8f2889982cbff506/5f87f219/video/tos/cn/tos-cn-ve-51/2be48719a99e4600a4af53024dbdf67b/?a=1128&br=1536&bt=512&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M210PGp4cm9ndzMzMzYzM0ApNWU6Njg6ZTw2NzVoM2U7OGcvZjJeYGlxM21fLS02MC9zc2JhXy82YzViXjNjYi9jXjU6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033900000btpd6ltolucga95qij20&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033900000btpd6ltolucga95qij20&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"ratio":"720p","width":720},"video_control":{"allow_download":true,"allow_duet":true,"allow_dynamic_wallpaper":true,"allow_react":true,"draft_progress_bar":0,"prevent_download_type":0,"share_type":1,"show_progress_bar":0,"timer_status":1},"video_labels":null,"video_text":null,"vr_type":0,"with_promotional_music":false},{"anchors":null,"author":{"accept_private_policy":false,"account_region":"","ad_cover_url":null,"apple_account":0,"authority_status":0,"avatar_168x168":{"height":720,"uri":"168x168/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_168x168.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_168x168.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_168x168.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_168x168.jpeg?from=2563711402"],"width":720},"avatar_300x300":{"height":720,"uri":"300x300/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b","url_list":["https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_300x300.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_300x300.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_300x300.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_300x300.jpeg?from=2563711402"],"width":720},"avatar_larger":{"height":720,"uri":"1080x1080/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_1080x1080.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_1080x1080.jpeg?from=2563711402"],"width":720},"avatar_medium":{"height":720,"uri":"720x720/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_720x720.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_720x720.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_720x720.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_720x720.jpeg?from=2563711402"],"width":720},"avatar_thumb":{"height":720,"uri":"100x100/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b","url_list":["https://p9-dy.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_100x100.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_100x100.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_100x100.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b~c5_100x100.jpeg?from=2563711402"],"width":720},"avatar_uri":"tos-cn-avt-0015/35e5c83835b11aee5f3480993a09718b","aweme_count":0,"bind_phone":"","birthday":"","cha_list":null,"comment_filter_status":0,"comment_setting":0,"commerce_user_level":0,"constellation":10,"cover_url":[{"height":720,"uri":"c8510002be9a3a61aad2","url_list":["https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"],"width":720}],"create_time":0,"custom_verify":"","cv_level":"","download_prompt_ts":0,"download_setting":-1,"duet_setting":0,"enterprise_verify_reason":"","favoriting_count":0,"fb_expire_time":0,"follow_status":0,"follower_count":0,"follower_status":0,"followers_detail":null,"following_count":0,"gender":1,"geofencing":null,"google_account":"","has_email":false,"has_facebook_token":false,"has_insights":false,"has_orders":false,"has_twitter_token":false,"has_unread_story":false,"has_youtube_token":false,"hide_location":false,"hide_search":false,"ins_id":"","is_ad_fake":false,"is_binded_weibo":false,"is_block":false,"is_discipline_member":false,"is_gov_media_vip":false,"is_phone_binded":false,"is_star":false,"is_verified":true,"item_list":null,"language":"zh-Hans","live_agreement":0,"live_agreement_time":0,"live_commerce":false,"live_verify":0,"location":"","need_recommend":0,"neiguang_shield":0,"new_story_cover":null,"nickname":"顏","platform_sync_info":null,"prevent_download":false,"react_setting":0,"reflow_page_gid":0,"reflow_page_uid":0,"region":"CN","relative_users":null,"room_id":0,"school_name":"","school_poi_id":"","school_type":0,"sec_uid":"MS4wLjABAAAA7dAac6obx3jA1NUcwOpITT5XcFRmuVstLoJ27WD0lEA","secret":0,"share_info":{"share_desc":"","share_qrcode_url":{"height":720,"uri":"30f5e000098e8f04e0590","url_list":["https://p3-dy-ipv6.byteimg.com/obj/30f5e000098e8f04e0590?from=2563711402","https://p6-dy-ipv6.byteimg.com/obj/30f5e000098e8f04e0590?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/30f5e000098e8f04e0590?from=2563711402"],"width":720},"share_title":"","share_title_myself":"","share_title_other":"","share_url":"","share_weibo_desc":""},"share_qrcode_uri":"30f5e000098e8f04e0590","shield_comment_notice":0,"shield_digg_notice":0,"shield_follow_notice":0,"short_id":"3553594898","show_image_bubble":false,"signature":"xxs一个，六年级。A9小佬，1000粉露脸","special_lock":1,"status":1,"story_count":0,"story_open":false,"sync_to_toutiao":0,"total_favorited":0,"tw_expire_time":0,"twitter_id":"","twitter_name":"","type_label":null,"uid":"75524510345","unique_id":"yky090119","unique_id_modify_time":1602741234,"user_canceled":false,"user_mode":0,"user_period":0,"user_rate":1,"verification_type":1,"verify_info":"","video_icon":{"height":720,"uri":"","url_list":null,"width":720},"weibo_name":"","weibo_schema":"","weibo_url":"","weibo_verify":"","with_commerce_entry":false,"with_dou_entry":false,"with_fusion_shop_entry":false,"with_shop_entry":false,"youtube_channel_id":"","youtube_channel_title":"","youtube_expire_time":0},"author_user_id":75524510345,"aweme_control":{"can_comment":true,"can_forward":true,"can_share":true,"can_show_comment":true},"aweme_id":"6881068171239886095","aweme_type":0,"bodydance_score":0,"cha_list":null,"challenge_position":null,"city":"350500","cmt_swt":false,"collect_stat":0,"comment_list":null,"commerce_config_data":null,"create_time":1602123537,"desc":"巨星的成功之路","desc_language":"zh","distance":"","distribute_type":1,"duration":13629,"enable_top_view":true,"follow_up_type":0,"geofencing":null,"geofencing_regions":null,"group_id":"6881068171239886095","hybrid_label":null,"image_infos":null,"interaction_stickers":null,"is_ads":false,"is_fantasy":false,"is_hash_tag":1,"is_horizontal":false,"is_pgcshow":false,"is_relieve":false,"is_story":0,"is_top":0,"is_vr":false,"item_comment_settings":0,"item_duet":0,"item_react":0,"label_top":{"height":720,"uri":"c150000f34767e2cb56","url_list":["https://p29-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p6-dy-ipv6.byteimg.com/obj/c150000f34767e2cb56?from=2563711402"],"width":720},"label_top_text":null,"long_video":null,"misc_info":"{\"ocr_location\":\"{\\\"x_max\\\":0.8856388888888889,\\\"x_min\\\":0.15183333333333332,\\\"y_max\\\":0.8488076923076923,\\\"y_min\\\":0.46092307692307694}\"}","music":{"album":"","author":"全球宝藏音乐","author_deleted":false,"author_position":null,"avatar_large":{"height":720,"uri":"1080x1080/2e4760008ca02de5bcde2","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/2e4760008ca02de5bcde2.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/1080x1080/2e4760008ca02de5bcde2.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/2e4760008ca02de5bcde2.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/2e4760008ca02de5bcde2.jpeg?from=2563711402"],"width":720},"avatar_medium":{"height":720,"uri":"720x720/2e4760008ca02de5bcde2","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/2e4760008ca02de5bcde2.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/2e4760008ca02de5bcde2.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/2e4760008ca02de5bcde2.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/2e4760008ca02de5bcde2.jpeg?from=2563711402"],"width":720},"avatar_thumb":{"height":720,"uri":"100x100/2e4760008ca02de5bcde2","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/100x100/2e4760008ca02de5bcde2.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/100x100/2e4760008ca02de5bcde2.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/100x100/2e4760008ca02de5bcde2.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/2e4760008ca02de5bcde2.jpeg?from=2563711402"],"width":720},"binded_challenge_id":0,"collect_stat":0,"cover_hd":{"height":720,"uri":"1080x1080/2e4760008ca02de5bcde2","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/2e4760008ca02de5bcde2.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/1080x1080/2e4760008ca02de5bcde2.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/2e4760008ca02de5bcde2.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/2e4760008ca02de5bcde2.jpeg?from=2563711402"],"width":720},"cover_large":{"height":720,"uri":"1080x1080/2e4760008ca02de5bcde2","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/2e4760008ca02de5bcde2.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/1080x1080/2e4760008ca02de5bcde2.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/2e4760008ca02de5bcde2.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/2e4760008ca02de5bcde2.jpeg?from=2563711402"],"width":720},"cover_medium":{"height":720,"uri":"720x720/2e4760008ca02de5bcde2","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/2e4760008ca02de5bcde2.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/2e4760008ca02de5bcde2.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/2e4760008ca02de5bcde2.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/2e4760008ca02de5bcde2.jpeg?from=2563711402"],"width":720},"cover_thumb":{"height":720,"uri":"100x100/2e4760008ca02de5bcde2","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/100x100/2e4760008ca02de5bcde2.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/100x100/2e4760008ca02de5bcde2.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/100x100/2e4760008ca02de5bcde2.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/2e4760008ca02de5bcde2.jpeg?from=2563711402"],"width":720},"duration":13,"end_time":0,"external_song_info":null,"extra":"{\"reviewed\":1,\"hotsoon_review_time\":-1,\"aggregate_exempt_conf\":[],\"has_edited\":0,\"beats\":{\"audio_effect_onset\":\"https://p1-dy.byteimg.com/obj/ies-music/strong_beat/v3/1679169147233300\",\"merged_beats\":\"https://p9-dy.byteimg.com/obj/ies-music/strong_beat/v3/1679169152066563\",\"beats_tracker\":\"https://p9-dy.byteimg.com/obj/ies-music/strong_beat/v3/1679169152038923\",\"energy_trace\":\"https://p9-dy.byteimg.com/obj/ies-music/strong_beat/v3/1679169147206659\"},\"douyin_beats_info\":{},\"schedule_search_time\":0,\"music_label_id\":null,\"review_unshelve_reason\":0}","id":6872341535280302861,"id_str":"6872341535280302861","is_author_artist":false,"is_del_video":false,"is_original":false,"is_pgc":false,"is_restricted":false,"is_video_self_see":false,"mid":"6872341535280302861","mute_share":false,"offline_desc":"","owner_handle":"xhlm_YL","owner_id":"1349851846031399","owner_nickname":"全球宝藏音乐","play_url":{"height":720,"uri":"https://p9-dy.byteimg.com/obj/ies-music/6872341514107407111.mp3","url_list":["https://p9-dy.byteimg.com/obj/ies-music/6872341514107407111.mp3","https://p1-dy.byteimg.com/obj/ies-music/6872341514107407111.mp3"],"width":720},"position":null,"prevent_download":false,"prevent_item_download_status":0,"preview_end_time":0,"preview_start_time":0,"redirect":false,"schema_url":"","sec_uid":"MS4wLjABAAAAF21q6g8YQllepGkO8gp792yXrZDUIvI2c1VsFoKf5FaxWOgf5sydrPKpk5JBIkg-","source_platform":23,"start_time":0,"status":1,"strong_beat_url":{"height":720,"uri":"https://p9-dy.byteimg.com/obj/ies-music/strong_beat/1677839578653710","url_list":["https://p9-dy.byteimg.com/obj/ies-music/strong_beat/1677839578653710","https://p1-dy.byteimg.com/obj/ies-music/strong_beat/1677839578653710"],"width":720},"title":"@全球宝藏音乐创作的原声","unshelve_countries":null,"user_count":0},"nickname_position":null,"origin_comment_ids":null,"position":null,"prevent_download":false,"promotions":null,"rate":12,"raw_ad_data":null,"region":"CN","risk_infos":{"content":"","risk_sink":false,"type":0,"vote":false,"warn":false},"share_info":{"bool_persist":0,"share_desc":"在抖音，记录美好生活","share_link_desc":"巨星的成功之路  %s 复制此链接，打开抖音，直接观看视频！","share_quote":"","share_signature_desc":"","share_signature_url":"","share_title":"巨星的成功之路","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/video/6881068171239886095/?region=CN&mid=6872341535280302861&u_code=i0kji679&titleType=title&did=71471896106&iid=3993023441537288","share_weibo_desc":"#在抖音，记录美好生活#巨星的成功之路"},"share_url":"https://www.iesdouyin.com/share/video/6881068171239886095/?region=CN&mid=6872341535280302861&u_code=i0kji679&titleType=title&did=71471896106&iid=3993023441537288","sort_label":"_","statistics":{"aweme_id":"6881068171239886095","comment_count":2114,"digg_count":93998,"download_count":1642,"forward_count":5,"lose_comment_count":0,"lose_count":0,"play_count":0,"share_count":926,"whatsapp_share_count":0},"status":{"allow_comment":true,"allow_share":true,"aweme_id":"6881068171239886095","download_status":0,"in_reviewing":false,"is_delete":false,"is_private":false,"is_prohibited":false,"private_status":0,"reviewed":1,"self_see":false,"with_fusion_goods":false,"with_goods":false},"text_extra":[],"uniqid_position":null,"user_digged":0,"user_profile_init_info":{"head_model_score":0.08758544921875},"video":{"big_thumbs":null,"bit_rate":[{"bit_rate":1215918,"gear_name":"adapt_lowest_720","is_h265":1,"play_addr":{"data_size":2071470,"file_cs":"c:0-16324-69e1","height":720,"uri":"v0300fa90000btv7e13vntn0ib0pucrg","url_key":"v0300fa90000btv7e13vntn0ib0pucrg_bytevc1_720p_1215918","url_list":["http://v26-dy.ixigua.com/da3d1dc2059c785f81ee3631bbba8600/5f87f20f/video/tos/cn/tos-cn-ve-15/9459b06225644376a79b7913ef09e987/?a=1128&br=3561&bt=1187&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=amZzZTN3eTQ6dzMzPGkzM0ApaDRkZmVoZDs4NzM6ZTQ6aGdvci1ma2swYnNfLS1eLTBzczMuMTVgMF5fYF5hMTZhYDU6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/6494b16bd704ef6f270e1af747477c08/5f87f20f/video/tos/cn/tos-cn-ve-15/9459b06225644376a79b7913ef09e987/?a=1128&br=3561&bt=1187&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=amZzZTN3eTQ6dzMzPGkzM0ApaDRkZmVoZDs4NzM6ZTQ6aGdvci1ma2swYnNfLS1eLTBzczMuMTVgMF5fYF5hMTZhYDU6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":2071470,"file_cs":"c:0-16324-69e1","height":720,"uri":"v0300fa90000btv7e13vntn0ib0pucrg","url_key":"v0300fa90000btv7e13vntn0ib0pucrg_bytevc1_720p_1215918","url_list":["http://v26-dy.ixigua.com/da3d1dc2059c785f81ee3631bbba8600/5f87f20f/video/tos/cn/tos-cn-ve-15/9459b06225644376a79b7913ef09e987/?a=1128&br=3561&bt=1187&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=amZzZTN3eTQ6dzMzPGkzM0ApaDRkZmVoZDs4NzM6ZTQ6aGdvci1ma2swYnNfLS1eLTBzczMuMTVgMF5fYF5hMTZhYDU6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/6494b16bd704ef6f270e1af747477c08/5f87f20f/video/tos/cn/tos-cn-ve-15/9459b06225644376a79b7913ef09e987/?a=1128&br=3561&bt=1187&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=amZzZTN3eTQ6dzMzPGkzM0ApaDRkZmVoZDs4NzM6ZTQ6aGdvci1ma2swYnNfLS1eLTBzczMuMTVgMF5fYF5hMTZhYDU6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"quality_type":15},{"bit_rate":1036408,"gear_name":"adapt_540","is_h265":1,"play_addr":{"data_size":1765652,"file_cs":"c:0-16325-2a43","height":720,"uri":"v0300fa90000btv7e13vntn0ib0pucrg","url_key":"v0300fa90000btv7e13vntn0ib0pucrg_bytevc1_540p_1036408","url_list":["http://v26-dy.ixigua.com/44c15af423ae71f2a1188aee85c293a9/5f87f20f/video/tos/cn/tos-cn-ve-15/3f85cc5725a2407f9de87418c606eff8/?a=1128&br=4048&bt=1012&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=amZzZTN3eTQ6dzMzPGkzM0ApM2k7OWY0PGRlN2loaWU6OWdvci1ma2swYnNfLS1eLTBzc2IwMjEtLy82NTJfXzFgXmM6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/3a63791395bddc33d515da439461280b/5f87f20f/video/tos/cn/tos-cn-ve-15/3f85cc5725a2407f9de87418c606eff8/?a=1128&br=4048&bt=1012&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=amZzZTN3eTQ6dzMzPGkzM0ApM2k7OWY0PGRlN2loaWU6OWdvci1ma2swYnNfLS1eLTBzc2IwMjEtLy82NTJfXzFgXmM6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":1765652,"file_cs":"c:0-16325-2a43","height":720,"uri":"v0300fa90000btv7e13vntn0ib0pucrg","url_key":"v0300fa90000btv7e13vntn0ib0pucrg_bytevc1_540p_1036408","url_list":["http://v26-dy.ixigua.com/44c15af423ae71f2a1188aee85c293a9/5f87f20f/video/tos/cn/tos-cn-ve-15/3f85cc5725a2407f9de87418c606eff8/?a=1128&br=4048&bt=1012&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=amZzZTN3eTQ6dzMzPGkzM0ApM2k7OWY0PGRlN2loaWU6OWdvci1ma2swYnNfLS1eLTBzc2IwMjEtLy82NTJfXzFgXmM6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/3a63791395bddc33d515da439461280b/5f87f20f/video/tos/cn/tos-cn-ve-15/3f85cc5725a2407f9de87418c606eff8/?a=1128&br=4048&bt=1012&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=amZzZTN3eTQ6dzMzPGkzM0ApM2k7OWY0PGRlN2loaWU6OWdvci1ma2swYnNfLS1eLTBzc2IwMjEtLy82NTJfXzFgXmM6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"quality_type":28}],"cdn_url_expired":0,"cover":{"height":720,"uri":"large/tos-cn-p-0015/4cfc5e2fb495460eb094412178db62ca","url_list":["http://p9-dy.byteimg.com/large/tos-cn-p-0015/4cfc5e2fb495460eb094412178db62ca.webp?from=2563711402_large","http://p1-dy-ipv6.byteimg.com/large/tos-cn-p-0015/4cfc5e2fb495460eb094412178db62ca.webp?from=2563711402_large","http://p3-dy-ipv6.byteimg.com/large/tos-cn-p-0015/4cfc5e2fb495460eb094412178db62ca.webp?from=2563711402_large","http://p9-dy.byteimg.com/large/tos-cn-p-0015/4cfc5e2fb495460eb094412178db62ca.jpeg?from=2563711402_large"],"width":720},"download_addr":{"data_size":4193210,"height":720,"uri":"v0300fa90000btv7e13vntn0ib0pucrg","url_list":["http://v26-dy.ixigua.com/2e10336a1161856f4c10cec7acee3486/5f87f20f/video/tos/cn/tos-cn-ve-15/bae3b4297a53495bbd115510409b9919/?a=1128&br=5898&bt=1966&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=amZzZTN3eTQ6dzMzPGkzM0ApNTg2OzM2aDs6N2Q4OmY1Omdvci1ma2swYnNfLS1eLTBzc2IwYS00LmBhXzEtNTNgYjA6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/cafba119776c26f1e1a011ce2679a034/5f87f20f/video/tos/cn/tos-cn-ve-15/bae3b4297a53495bbd115510409b9919/?a=1128&br=5898&bt=1966&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=amZzZTN3eTQ6dzMzPGkzM0ApNTg2OzM2aDs6N2Q4OmY1Omdvci1ma2swYnNfLS1eLTBzc2IwYS00LmBhXzEtNTNgYjA6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"download_suffix_logo_addr":{"data_size":4193210,"height":720,"uri":"v0300fa90000btv7e13vntn0ib0pucrg","url_list":["http://v26-dy.ixigua.com/2e10336a1161856f4c10cec7acee3486/5f87f20f/video/tos/cn/tos-cn-ve-15/bae3b4297a53495bbd115510409b9919/?a=1128&br=5898&bt=1966&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=amZzZTN3eTQ6dzMzPGkzM0ApNTg2OzM2aDs6N2Q4OmY1Omdvci1ma2swYnNfLS1eLTBzc2IwYS00LmBhXzEtNTNgYjA6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/cafba119776c26f1e1a011ce2679a034/5f87f20f/video/tos/cn/tos-cn-ve-15/bae3b4297a53495bbd115510409b9919/?a=1128&br=5898&bt=1966&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=amZzZTN3eTQ6dzMzPGkzM0ApNTg2OzM2aDs6N2Q4OmY1Omdvci1ma2swYnNfLS1eLTBzc2IwYS00LmBhXzEtNTNgYjA6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"duration":13629,"dynamic_cover":{"height":720,"uri":"tos-cn-p-0015/920232bd794c4b68a7da79f423e05a9b_1602123539","url_list":["https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/920232bd794c4b68a7da79f423e05a9b_1602123539?from=2563711402_large","https://p1-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/920232bd794c4b68a7da79f423e05a9b_1602123539?from=2563711402_large","https://p6-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/920232bd794c4b68a7da79f423e05a9b_1602123539?from=2563711402_large"],"width":720},"has_download_suffix_logo_addr":true,"has_watermark":true,"height":830,"is_h265":0,"origin_cover":{"height":720,"uri":"tos-cn-p-0015/9f15de7cd3124bb1aa2942be7a23a18c_1602123538","url_list":["https://p26-dy.byteimg.com/tos-cn-p-0015/9f15de7cd3124bb1aa2942be7a23a18c_1602123538~tplv-dy-360p.webp?from=2563711402","https://p29-dy.byteimg.com/tos-cn-p-0015/9f15de7cd3124bb1aa2942be7a23a18c_1602123538~tplv-dy-360p.webp?from=2563711402","https://p9-dy.byteimg.com/tos-cn-p-0015/9f15de7cd3124bb1aa2942be7a23a18c_1602123538~tplv-dy-360p.webp?from=2563711402","https://p26-dy.byteimg.com/tos-cn-p-0015/9f15de7cd3124bb1aa2942be7a23a18c_1602123538~tplv-dy-360p.jpeg?from=2563711402"],"width":720},"play_addr":{"data_size":2930313,"file_cs":"c:0-15993-eaf6","height":720,"uri":"v0300fa90000btv7e13vntn0ib0pucrg","url_key":"v0300fa90000btv7e13vntn0ib0pucrg_h264_540p_1720045","url_list":["http://v26-dy.ixigua.com/374a183102a8203f936a2fc8399112d7/5f87f20f/video/tos/cn/tos-cn-ve-15/c6f7f6089e1841cbb5112e55f13d406e/?a=1128&br=5037&bt=1679&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=amZzZTN3eTQ6dzMzPGkzM0ApaWQzZTRmMzs6NzQ0N2loOWdvci1ma2swYnNfLS1eLTBzczAuNGBhLjJjYi4vX2I2LS46Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/6815defc646b4ce83e86338b77556c22/5f87f20f/video/tos/cn/tos-cn-ve-15/c6f7f6089e1841cbb5112e55f13d406e/?a=1128&br=5037&bt=1679&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=amZzZTN3eTQ6dzMzPGkzM0ApaWQzZTRmMzs6NzQ0N2loOWdvci1ma2swYnNfLS1eLTBzczAuNGBhLjJjYi4vX2I2LS46Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":1765652,"file_cs":"c:0-16325-2a43","height":720,"uri":"v0300fa90000btv7e13vntn0ib0pucrg","url_key":"v0300fa90000btv7e13vntn0ib0pucrg_bytevc1_540p_1036408","url_list":["http://v26-dy.ixigua.com/44c15af423ae71f2a1188aee85c293a9/5f87f20f/video/tos/cn/tos-cn-ve-15/3f85cc5725a2407f9de87418c606eff8/?a=1128&br=4048&bt=1012&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=amZzZTN3eTQ6dzMzPGkzM0ApM2k7OWY0PGRlN2loaWU6OWdvci1ma2swYnNfLS1eLTBzc2IwMjEtLy82NTJfXzFgXmM6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/3a63791395bddc33d515da439461280b/5f87f20f/video/tos/cn/tos-cn-ve-15/3f85cc5725a2407f9de87418c606eff8/?a=1128&br=4048&bt=1012&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=amZzZTN3eTQ6dzMzPGkzM0ApM2k7OWY0PGRlN2loaWU6OWdvci1ma2swYnNfLS1eLTBzc2IwMjEtLy82NTJfXzFgXmM6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_h264":{"data_size":2930313,"file_cs":"c:0-15993-eaf6","height":720,"uri":"v0300fa90000btv7e13vntn0ib0pucrg","url_key":"v0300fa90000btv7e13vntn0ib0pucrg_h264_540p_1720045","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"play_addr_lowbr":{"data_size":2930313,"file_cs":"c:0-15993-eaf6","height":720,"uri":"v0300fa90000btv7e13vntn0ib0pucrg","url_key":"v0300fa90000btv7e13vntn0ib0pucrg_h264_540p_1720045","url_list":["http://v26-dy.ixigua.com/374a183102a8203f936a2fc8399112d7/5f87f20f/video/tos/cn/tos-cn-ve-15/c6f7f6089e1841cbb5112e55f13d406e/?a=1128&br=5037&bt=1679&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=amZzZTN3eTQ6dzMzPGkzM0ApaWQzZTRmMzs6NzQ0N2loOWdvci1ma2swYnNfLS1eLTBzczAuNGBhLjJjYi4vX2I2LS46Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/6815defc646b4ce83e86338b77556c22/5f87f20f/video/tos/cn/tos-cn-ve-15/c6f7f6089e1841cbb5112e55f13d406e/?a=1128&br=5037&bt=1679&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=amZzZTN3eTQ6dzMzPGkzM0ApaWQzZTRmMzs6NzQ0N2loOWdvci1ma2swYnNfLS1eLTBzczAuNGBhLjJjYi4vX2I2LS46Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300fa90000btv7e13vntn0ib0pucrg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"ratio":"540p","width":576},"video_control":{"allow_download":true,"allow_duet":true,"allow_dynamic_wallpaper":true,"allow_music":true,"allow_react":true,"draft_progress_bar":0,"prevent_download_type":0,"share_type":1,"show_progress_bar":0,"timer_status":1},"video_labels":null,"video_text":null,"vr_type":0,"with_promotional_music":false,"xigua_task":{"is_xigua_task":false}},{"anchors":null,"author":{"accept_private_policy":false,"account_region":"","ad_cover_url":null,"apple_account":0,"authority_status":0,"avatar_168x168":{"height":720,"uri":"168x168/8d81000c8cf3f3076929","url_list":["https://p3-dy-ipv6.byteimg.com/img/8d81000c8cf3f3076929~c5_168x168.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/8d81000c8cf3f3076929~c5_168x168.webp?from=2563711402","https://p29-dy.byteimg.com/img/8d81000c8cf3f3076929~c5_168x168.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/8d81000c8cf3f3076929~c5_168x168.jpeg?from=2563711402"],"width":720},"avatar_300x300":{"height":720,"uri":"300x300/8d81000c8cf3f3076929","url_list":["https://p26-dy.byteimg.com/img/8d81000c8cf3f3076929~c5_300x300.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/8d81000c8cf3f3076929~c5_300x300.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/8d81000c8cf3f3076929~c5_300x300.webp?from=2563711402","https://p26-dy.byteimg.com/img/8d81000c8cf3f3076929~c5_300x300.jpeg?from=2563711402"],"width":720},"avatar_larger":{"height":720,"uri":"1080x1080/8d81000c8cf3f3076929","url_list":["https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/8d81000c8cf3f3076929.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/1080x1080/8d81000c8cf3f3076929.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/8d81000c8cf3f3076929.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/8d81000c8cf3f3076929.jpeg?from=2563711402"],"width":720},"avatar_medium":{"height":720,"uri":"720x720/8d81000c8cf3f3076929","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/8d81000c8cf3f3076929.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/8d81000c8cf3f3076929.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/8d81000c8cf3f3076929.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/8d81000c8cf3f3076929.jpeg?from=2563711402"],"width":720},"avatar_thumb":{"height":720,"uri":"100x100/8d81000c8cf3f3076929","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/100x100/8d81000c8cf3f3076929.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/100x100/8d81000c8cf3f3076929.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/100x100/8d81000c8cf3f3076929.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/8d81000c8cf3f3076929.jpeg?from=2563711402"],"width":720},"avatar_uri":"8d81000c8cf3f3076929","aweme_count":0,"bind_phone":"","birthday":"1984-01-01","cha_list":null,"comment_filter_status":0,"comment_setting":0,"commerce_user_level":0,"constellation":7,"cover_url":[{"height":720,"uri":"c8510002be9a3a61aad2","url_list":["https://p26-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"],"width":720}],"create_time":0,"custom_verify":"","cv_level":"","download_prompt_ts":0,"download_setting":-1,"duet_setting":0,"enterprise_verify_reason":"","favoriting_count":0,"fb_expire_time":0,"follow_status":0,"follower_count":0,"follower_status":0,"followers_detail":null,"following_count":0,"gender":2,"geofencing":null,"google_account":"","has_email":false,"has_facebook_token":false,"has_insights":false,"has_orders":false,"has_twitter_token":false,"has_unread_story":false,"has_youtube_token":false,"hide_location":false,"hide_search":false,"ins_id":"","is_ad_fake":false,"is_binded_weibo":false,"is_block":false,"is_discipline_member":false,"is_gov_media_vip":false,"is_phone_binded":false,"is_star":false,"is_verified":true,"item_list":null,"language":"zh-Hans","live_agreement":0,"live_agreement_time":0,"live_commerce":false,"live_verify":0,"location":"","need_recommend":0,"neiguang_shield":0,"new_story_cover":null,"nickname":"梅子老师","platform_sync_info":null,"prevent_download":false,"react_setting":0,"reflow_page_gid":0,"reflow_page_uid":0,"region":"CN","relative_users":null,"room_id":0,"school_name":"","school_poi_id":"","school_type":0,"sec_uid":"MS4wLjABAAAA0JZLxa2W-XafU8KJ5jTbnDNbuHmQb68TDNT85d_9lvk","secret":0,"share_info":{"share_desc":"","share_qrcode_url":{"height":720,"uri":"8d7d001e37fabda8e882","url_list":["https://p29-dy.byteimg.com/obj/8d7d001e37fabda8e882?from=2563711402","https://p9-dy.byteimg.com/obj/8d7d001e37fabda8e882?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/8d7d001e37fabda8e882?from=2563711402"],"width":720},"share_title":"","share_title_myself":"","share_title_other":"","share_url":"","share_weibo_desc":""},"share_qrcode_uri":"8d7d001e37fabda8e882","shield_comment_notice":0,"shield_digg_notice":0,"shield_follow_notice":0,"short_id":"1048752900","show_image_bubble":false,"signature":"梅子老师，因小时候生病，失去双手掌双脚掌，大学毕业后考取教师职业，婚姻的不幸，让她独自带着儿子女儿，依旧努力地生活着。再大的困苦，也抹不掉她的笑容。\n喜欢她的视频，欢迎关注、转发！\n每晚8点30到9点30，直播间传递正能量！","special_lock":1,"status":1,"story_count":0,"story_open":false,"sync_to_toutiao":0,"total_favorited":0,"tw_expire_time":0,"twitter_id":"","twitter_name":"","type_label":null,"uid":"99248181253","unique_id":"","unique_id_modify_time":1602741234,"user_canceled":false,"user_mode":0,"user_period":0,"user_rate":1,"verification_type":1,"verify_info":"","video_icon":{"height":720,"uri":"","url_list":null,"width":720},"weibo_name":"","weibo_schema":"","weibo_url":"","weibo_verify":"","with_commerce_entry":false,"with_dou_entry":false,"with_fusion_shop_entry":true,"with_shop_entry":false,"youtube_channel_id":"","youtube_channel_title":"","youtube_expire_time":0},"author_user_id":99248181253,"aweme_control":{"can_comment":true,"can_forward":true,"can_share":true,"can_show_comment":true},"aweme_id":"6883618819705720079","aweme_type":0,"bodydance_score":0,"cha_list":null,"challenge_position":null,"city":"510500","cmt_swt":false,"collect_stat":0,"comment_list":null,"commerce_config_data":null,"create_time":1602717415,"desc":"这么努力，是因为自己与众不同！无双手、双脚成就了自立自强、乐观向上的自己。每一次用心，都是生活的态度。感恩关注","desc_language":"zh","descendants":{"notify_msg":"头条","platforms":["toutiao"]},"distance":"","distribute_type":1,"duration":13967,"enable_top_view":true,"follow_up_type":0,"geofencing":null,"geofencing_regions":null,"group_id":"6883618819705720079","hybrid_label":null,"image_infos":null,"interaction_stickers":null,"is_ads":false,"is_fantasy":false,"is_hash_tag":1,"is_horizontal":false,"is_pgcshow":false,"is_relieve":false,"is_story":0,"is_top":0,"is_vr":false,"item_comment_settings":0,"item_duet":0,"item_react":0,"label_top":{"height":720,"uri":"c150000f34767e2cb56","url_list":["https://p29-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p26-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/c150000f34767e2cb56?from=2563711402"],"width":720},"label_top_text":null,"long_video":null,"misc_info":"{}","music":{"album":"","author":"金萨克斯之家","author_deleted":false,"author_position":null,"avatar_large":{"height":720,"uri":"1080x1080/835e0003204b9960ede3","url_list":["https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/835e0003204b9960ede3.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/835e0003204b9960ede3.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/835e0003204b9960ede3.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/835e0003204b9960ede3.jpeg?from=2563711402"],"width":720},"avatar_medium":{"height":720,"uri":"720x720/835e0003204b9960ede3","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/835e0003204b9960ede3.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/835e0003204b9960ede3.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/720x720/835e0003204b9960ede3.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/835e0003204b9960ede3.jpeg?from=2563711402"],"width":720},"avatar_thumb":{"height":720,"uri":"100x100/835e0003204b9960ede3","url_list":["https://p6-dy-ipv6.byteimg.com/aweme/100x100/835e0003204b9960ede3.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/100x100/835e0003204b9960ede3.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/100x100/835e0003204b9960ede3.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/100x100/835e0003204b9960ede3.jpeg?from=2563711402"],"width":720},"binded_challenge_id":0,"collect_stat":0,"cover_hd":{"height":720,"uri":"douyin-web-image/acfeedaf1ba112954343a778448a4a1d","url_list":["https://p26-dy.byteimg.com/aweme/1080x1080/douyin-web-image/acfeedaf1ba112954343a778448a4a1d.webp","https://p29-dy.byteimg.com/aweme/1080x1080/douyin-web-image/acfeedaf1ba112954343a778448a4a1d.webp","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/douyin-web-image/acfeedaf1ba112954343a778448a4a1d.webp"],"width":720},"cover_large":{"height":720,"uri":"douyin-web-image/acfeedaf1ba112954343a778448a4a1d","url_list":["https://p26-dy.byteimg.com/aweme/720x720/douyin-web-image/acfeedaf1ba112954343a778448a4a1d.webp","https://p29-dy.byteimg.com/aweme/720x720/douyin-web-image/acfeedaf1ba112954343a778448a4a1d.webp","https://p3-dy-ipv6.byteimg.com/aweme/720x720/douyin-web-image/acfeedaf1ba112954343a778448a4a1d.webp"],"width":720},"cover_medium":{"height":720,"uri":"douyin-web-image/acfeedaf1ba112954343a778448a4a1d","url_list":["https://p26-dy.byteimg.com/aweme/200x200/douyin-web-image/acfeedaf1ba112954343a778448a4a1d.webp","https://p29-dy.byteimg.com/aweme/200x200/douyin-web-image/acfeedaf1ba112954343a778448a4a1d.webp","https://p3-dy-ipv6.byteimg.com/aweme/200x200/douyin-web-image/acfeedaf1ba112954343a778448a4a1d.webp"],"width":720},"cover_thumb":{"height":720,"uri":"douyin-web-image/acfeedaf1ba112954343a778448a4a1d","url_list":["https://p26-dy.byteimg.com/aweme/100x100/douyin-web-image/acfeedaf1ba112954343a778448a4a1d.webp","https://p29-dy.byteimg.com/aweme/100x100/douyin-web-image/acfeedaf1ba112954343a778448a4a1d.webp","https://p3-dy-ipv6.byteimg.com/aweme/100x100/douyin-web-image/acfeedaf1ba112954343a778448a4a1d.webp"],"width":720},"duration":200,"end_time":0,"external_song_info":null,"extra":"{\"has_edited\":0,\"reviewed\":1,\"review_unshelve_reason\":0,\"beats\":{\"audio_effect_onset\":\"https://p1-dy.byteimg.com/obj/ies-music/strong_beat/v3/1640489682011144\",\"beats_tracker\":\"https://p9-dy.byteimg.com/obj/ies-music/strong_beat/v3/1640489694925828\",\"energy_trace\":\"https://p9-dy.byteimg.com/obj/ies-music/strong_beat/v3/1640489681994766\",\"merged_beats\":\"https://p1-dy.byteimg.com/obj/ies-music/strong_beat/v3/1640489694947336\"},\"douyin_beats_info\":{},\"hotsoon_review_time\":1602726786,\"schedule_search_time\":0,\"music_label_id\":1112,\"aggregate_exempt_conf\":[]}","id":6599906708586236679,"id_str":"6599906708586236679","is_author_artist":true,"is_del_video":false,"is_original":true,"is_pgc":true,"is_restricted":false,"is_video_self_see":false,"mid":"6599906708586236679","mute_share":false,"offline_desc":"","owner_handle":"","owner_id":"98011032536","owner_nickname":"","play_url":{"height":720,"uri":"https://p9-dy.byteimg.com/obj/iesmusic-cn-local/v1/iesmsc-sg-local/v1/m/be260005b327be2d7645","url_list":["https://p9-dy.byteimg.com/obj/iesmusic-cn-local/v1/iesmsc-sg-local/v1/m/be260005b327be2d7645","https://p1-dy.byteimg.com/obj/iesmusic-cn-local/v1/iesmsc-sg-local/v1/m/be260005b327be2d7645"],"width":720},"position":null,"prevent_download":false,"prevent_item_download_status":0,"preview_end_time":0,"preview_start_time":0,"redirect":false,"schema_url":"","sec_uid":"MS4wLjABAAAAznBHuMO31ikAr0kuxMYlzYkmNJbAe8Pt4blkA4D2XlU","source_platform":25,"start_time":0,"status":1,"strong_beat_url":{"height":720,"uri":"https://p9-dy.byteimg.com/obj/ies-music/strong_beat/1617201923397640","url_list":["https://p9-dy.byteimg.com/obj/ies-music/strong_beat/1617201923397640","https://p1-dy.byteimg.com/obj/ies-music/strong_beat/1617201923397640"],"width":720},"title":"萨克斯-《星语心愿》次中音降B调","unshelve_countries":null,"user_count":0},"nickname_position":null,"origin_comment_ids":null,"position":null,"prevent_download":false,"promotions":null,"rate":12,"raw_ad_data":null,"region":"CN","risk_infos":{"content":"","risk_sink":false,"type":0,"vote":false,"warn":false},"share_info":{"bool_persist":0,"share_desc":"在抖音，记录美好生活","share_link_desc":"这么努力，是因为自己与众不同！无双手、双脚成就了自立自强、乐观向上的自己。每一次用心，都是生活的态度。感恩关注  %s 复制此链接，打开抖音，直接观看视频！","share_quote":"","share_signature_desc":"","share_signature_url":"","share_title":"这么努力，是因为自己与众不同！无双手、双脚成就了自立自强、乐观向上的自己。每一次用心，都是生活的态度。感恩关注","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/video/6883618819705720079/?region=CN&mid=6599906708586236679&u_code=i0kji679&titleType=title&did=71471896106&iid=3993023441537288","share_weibo_desc":"#在抖音，记录美好生活#这么努力，是因为自己与众不同！无双手、双脚成就了自立自强、乐观向上的自己。每一次用心，都是生活的态度。感恩关注"},"share_url":"https://www.iesdouyin.com/share/video/6883618819705720079/?region=CN&mid=6599906708586236679&u_code=i0kji679&titleType=title&did=71471896106&iid=3993023441537288","sort_label":"_","statistics":{"aweme_id":"6883618819705720079","comment_count":10542,"digg_count":266492,"download_count":2081,"forward_count":160,"lose_comment_count":0,"lose_count":0,"play_count":0,"share_count":1367,"whatsapp_share_count":0},"status":{"allow_comment":true,"allow_share":true,"aweme_id":"6883618819705720079","download_status":0,"in_reviewing":false,"is_delete":false,"is_private":false,"is_prohibited":false,"private_status":0,"reviewed":1,"self_see":false,"with_fusion_goods":false,"with_goods":false},"text_extra":[],"uniqid_position":null,"user_digged":0,"user_profile_init_info":{"head_model_score":0.0631958544254303},"video":{"big_thumbs":null,"bit_rate":[{"bit_rate":666796,"gear_name":"adapt_lowest_720","is_h265":1,"play_addr":{"data_size":1164144,"file_cs":"c:0-16727-c0bf","height":720,"uri":"v0d00f110000bu3obd4e165hreend85g","url_key":"v0d00f110000bu3obd4e165hreend85g_bytevc1_720p_666796","url_list":["http://v26-dy.ixigua.com/4a2b6be775719c5d21f0b987ebc90de9/5f87f20f/video/tos/cn/tos-cn-ve-15/073894aa6593406b9e4c2f8ed44a5593/?a=1128&br=1953&bt=651&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=ajtxaGs5aGdyeDMzNGkzM0ApNTg5OGk6Ojw3NzMzOzNoZWcyYWJvMi4xXzBfLS0uLWFzcy5jNi9eMGEvLl9gYmIyMGM6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/e347a425ce9ab95f7fc0684a60a8e8f2/5f87f20f/video/tos/cn/tos-cn-ve-15/073894aa6593406b9e4c2f8ed44a5593/?a=1128&br=1953&bt=651&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=ajtxaGs5aGdyeDMzNGkzM0ApNTg5OGk6Ojw3NzMzOzNoZWcyYWJvMi4xXzBfLS0uLWFzcy5jNi9eMGEvLl9gYmIyMGM6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":1164144,"file_cs":"c:0-16727-c0bf","height":720,"uri":"v0d00f110000bu3obd4e165hreend85g","url_key":"v0d00f110000bu3obd4e165hreend85g_bytevc1_720p_666796","url_list":["http://v26-dy.ixigua.com/4a2b6be775719c5d21f0b987ebc90de9/5f87f20f/video/tos/cn/tos-cn-ve-15/073894aa6593406b9e4c2f8ed44a5593/?a=1128&br=1953&bt=651&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=ajtxaGs5aGdyeDMzNGkzM0ApNTg5OGk6Ojw3NzMzOzNoZWcyYWJvMi4xXzBfLS0uLWFzcy5jNi9eMGEvLl9gYmIyMGM6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/e347a425ce9ab95f7fc0684a60a8e8f2/5f87f20f/video/tos/cn/tos-cn-ve-15/073894aa6593406b9e4c2f8ed44a5593/?a=1128&br=1953&bt=651&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=ajtxaGs5aGdyeDMzNGkzM0ApNTg5OGk6Ojw3NzMzOzNoZWcyYWJvMi4xXzBfLS0uLWFzcy5jNi9eMGEvLl9gYmIyMGM6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"quality_type":15},{"bit_rate":658555,"gear_name":"adapt_540","is_h265":1,"play_addr":{"data_size":1149755,"file_cs":"c:0-16727-7ac7","height":720,"uri":"v0d00f110000bu3obd4e165hreend85g","url_key":"v0d00f110000bu3obd4e165hreend85g_bytevc1_540p_658555","url_list":["http://v26-dy.ixigua.com/68ba405deeac9d8893e10b8738902b0f/5f87f20f/video/tos/cn/tos-cn-ve-15/efe15c4892e24aeca1fa9aae85d7e942/?a=1128&br=2572&bt=643&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=ajtxaGs5aGdyeDMzNGkzM0ApaWlpNjs4Ozw5NzdlOWdpZWcyYWJvMi4xXzBfLS0uLWFzczA2LTAvY2NhXjQtMjNgNF86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/2e3f39bab2663c2078336bf55b5d49b9/5f87f20f/video/tos/cn/tos-cn-ve-15/efe15c4892e24aeca1fa9aae85d7e942/?a=1128&br=2572&bt=643&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=ajtxaGs5aGdyeDMzNGkzM0ApaWlpNjs4Ozw5NzdlOWdpZWcyYWJvMi4xXzBfLS0uLWFzczA2LTAvY2NhXjQtMjNgNF86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":1149755,"file_cs":"c:0-16727-7ac7","height":720,"uri":"v0d00f110000bu3obd4e165hreend85g","url_key":"v0d00f110000bu3obd4e165hreend85g_bytevc1_540p_658555","url_list":["http://v26-dy.ixigua.com/68ba405deeac9d8893e10b8738902b0f/5f87f20f/video/tos/cn/tos-cn-ve-15/efe15c4892e24aeca1fa9aae85d7e942/?a=1128&br=2572&bt=643&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=ajtxaGs5aGdyeDMzNGkzM0ApaWlpNjs4Ozw5NzdlOWdpZWcyYWJvMi4xXzBfLS0uLWFzczA2LTAvY2NhXjQtMjNgNF86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/2e3f39bab2663c2078336bf55b5d49b9/5f87f20f/video/tos/cn/tos-cn-ve-15/efe15c4892e24aeca1fa9aae85d7e942/?a=1128&br=2572&bt=643&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=ajtxaGs5aGdyeDMzNGkzM0ApaWlpNjs4Ozw5NzdlOWdpZWcyYWJvMi4xXzBfLS0uLWFzczA2LTAvY2NhXjQtMjNgNF86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"quality_type":28}],"cdn_url_expired":0,"cover":{"height":720,"uri":"large/tos-cn-p-0015/d96e8a6d832b4ea4990c8dcfc2ed2073","url_list":["http://p9-dy.byteimg.com/large/tos-cn-p-0015/d96e8a6d832b4ea4990c8dcfc2ed2073.webp?from=2563711402_large","http://p3-dy-ipv6.byteimg.com/large/tos-cn-p-0015/d96e8a6d832b4ea4990c8dcfc2ed2073.webp?from=2563711402_large","http://p29-dy.byteimg.com/large/tos-cn-p-0015/d96e8a6d832b4ea4990c8dcfc2ed2073.webp?from=2563711402_large","http://p9-dy.byteimg.com/large/tos-cn-p-0015/d96e8a6d832b4ea4990c8dcfc2ed2073.jpeg?from=2563711402_large"],"width":720},"download_addr":{"data_size":3115128,"height":720,"uri":"v0d00f110000bu3obd4e165hreend85g","url_list":["http://v26-dy.ixigua.com/67a061d6b994daa304ab47a2ecc115c4/5f87f20f/video/tos/cn/tos-cn-ve-15/e8aef24b38084951bf31787b501e8e38/?a=1128&br=4281&bt=1427&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=ajtxaGs5aGdyeDMzNGkzM0ApODVlM2Q2Nzs2NzozODw7M2cyYWJvMi4xXzBfLS0uLWFzc2E2XmIwNjZiL15gNi4vMzA6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/0bb3a55910b112eb9dc78b69861ca5e0/5f87f20f/video/tos/cn/tos-cn-ve-15/e8aef24b38084951bf31787b501e8e38/?a=1128&br=4281&bt=1427&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=ajtxaGs5aGdyeDMzNGkzM0ApODVlM2Q2Nzs2NzozODw7M2cyYWJvMi4xXzBfLS0uLWFzc2E2XmIwNjZiL15gNi4vMzA6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=0&ratio=720p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=1&ratio=720p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"download_suffix_logo_addr":{"data_size":3115128,"height":720,"uri":"v0d00f110000bu3obd4e165hreend85g","url_list":["http://v26-dy.ixigua.com/67a061d6b994daa304ab47a2ecc115c4/5f87f20f/video/tos/cn/tos-cn-ve-15/e8aef24b38084951bf31787b501e8e38/?a=1128&br=4281&bt=1427&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=ajtxaGs5aGdyeDMzNGkzM0ApODVlM2Q2Nzs2NzozODw7M2cyYWJvMi4xXzBfLS0uLWFzc2E2XmIwNjZiL15gNi4vMzA6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/0bb3a55910b112eb9dc78b69861ca5e0/5f87f20f/video/tos/cn/tos-cn-ve-15/e8aef24b38084951bf31787b501e8e38/?a=1128&br=4281&bt=1427&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=ajtxaGs5aGdyeDMzNGkzM0ApODVlM2Q2Nzs2NzozODw7M2cyYWJvMi4xXzBfLS0uLWFzc2E2XmIwNjZiL15gNi4vMzA6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=0&ratio=720p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=1&ratio=720p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"duration":13967,"dynamic_cover":{"height":720,"uri":"tos-cn-p-0015/9a557b7b250a4f0b87642a9b384cd1f5_1602717416","url_list":["https://p29-dy.byteimg.com/obj/tos-cn-p-0015/9a557b7b250a4f0b87642a9b384cd1f5_1602717416?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/9a557b7b250a4f0b87642a9b384cd1f5_1602717416?from=2563711402_large","https://p6-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/9a557b7b250a4f0b87642a9b384cd1f5_1602717416?from=2563711402_large"],"width":720},"has_download_suffix_logo_addr":true,"has_watermark":true,"height":1024,"is_h265":0,"origin_cover":{"height":720,"uri":"tos-cn-p-0015/b6e91abf414e4c029d5f10ea470a7cfa_1602717416","url_list":["https://p29-dy.byteimg.com/tos-cn-p-0015/b6e91abf414e4c029d5f10ea470a7cfa_1602717416~tplv-dy-360p.webp?from=2563711402","https://p26-dy.byteimg.com/tos-cn-p-0015/b6e91abf414e4c029d5f10ea470a7cfa_1602717416~tplv-dy-360p.webp?from=2563711402","https://p9-dy.byteimg.com/tos-cn-p-0015/b6e91abf414e4c029d5f10ea470a7cfa_1602717416~tplv-dy-360p.webp?from=2563711402","https://p29-dy.byteimg.com/tos-cn-p-0015/b6e91abf414e4c029d5f10ea470a7cfa_1602717416~tplv-dy-360p.jpeg?from=2563711402"],"width":720},"play_addr":{"data_size":1954554,"file_cs":"c:0-16623-8139","height":720,"uri":"v0d00f110000bu3obd4e165hreend85g","url_key":"v0d00f110000bu3obd4e165hreend85g_h264_540p_1116888","url_list":["http://v26-dy.ixigua.com/88e1b2a2c156ca8d154a44f2313dc7e6/5f87f20f/video/tos/cn/tos-cn-ve-15/ee7bef78dbfb4f6c9f20f26435589860/?a=1128&br=3270&bt=1090&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=ajtxaGs5aGdyeDMzNGkzM0ApN2Q2aDM4NmU7NzVoNzw6PGcyYWJvMi4xXzBfLS0uLWFzc2NjXjIwY2BgNC42YC0wNC06Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/c79e07aa0a57e27de4eff8d23ebc5f01/5f87f20f/video/tos/cn/tos-cn-ve-15/ee7bef78dbfb4f6c9f20f26435589860/?a=1128&br=3270&bt=1090&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=ajtxaGs5aGdyeDMzNGkzM0ApN2Q2aDM4NmU7NzVoNzw6PGcyYWJvMi4xXzBfLS0uLWFzc2NjXjIwY2BgNC42YC0wNC06Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":1375408,"file_cs":"c:0-16891-8119","height":720,"uri":"v0d00f110000bu3obd4e165hreend85g","url_key":"v0d00f110000bu3obd4e165hreend85g_bytevc1_720p_787804","url_list":["http://v26-dy.ixigua.com/ca79e7e872ba86493d05d8e29b27fb76/5f87f20f/video/tos/cn/tos-cn-ve-15/0a08453cc124440f825b9e455f208b09/?a=1128&br=3076&bt=769&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=ajtxaGs5aGdyeDMzNGkzM0ApZGdlZjk7ZDtkNzU8aTs4PGcyYWJvMi4xXzBfLS0uLWFzc2NfLV4wLTNgYjQuMi42NWA6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/2a56f02e7d7c7e2791da656f532def00/5f87f20f/video/tos/cn/tos-cn-ve-15/0a08453cc124440f825b9e455f208b09/?a=1128&br=3076&bt=769&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=ajtxaGs5aGdyeDMzNGkzM0ApZGdlZjk7ZDtkNzU8aTs4PGcyYWJvMi4xXzBfLS0uLWFzc2NfLV4wLTNgYjQuMi42NWA6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt720=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt720=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_h264":{"data_size":1954554,"file_cs":"c:0-16623-8139","height":720,"uri":"v0d00f110000bu3obd4e165hreend85g","url_key":"v0d00f110000bu3obd4e165hreend85g_h264_540p_1116888","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"play_addr_lowbr":{"data_size":1954554,"file_cs":"c:0-16623-8139","height":720,"uri":"v0d00f110000bu3obd4e165hreend85g","url_key":"v0d00f110000bu3obd4e165hreend85g_h264_540p_1116888","url_list":["http://v26-dy.ixigua.com/88e1b2a2c156ca8d154a44f2313dc7e6/5f87f20f/video/tos/cn/tos-cn-ve-15/ee7bef78dbfb4f6c9f20f26435589860/?a=1128&br=3270&bt=1090&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=ajtxaGs5aGdyeDMzNGkzM0ApN2Q2aDM4NmU7NzVoNzw6PGcyYWJvMi4xXzBfLS0uLWFzc2NjXjIwY2BgNC42YC0wNC06Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/c79e07aa0a57e27de4eff8d23ebc5f01/5f87f20f/video/tos/cn/tos-cn-ve-15/ee7bef78dbfb4f6c9f20f26435589860/?a=1128&br=3270&bt=1090&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=ajtxaGs5aGdyeDMzNGkzM0ApN2Q2aDM4NmU7NzVoNzw6PGcyYWJvMi4xXzBfLS0uLWFzc2NjXjIwY2BgNC42YC0wNC06Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0d00f110000bu3obd4e165hreend85g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"ratio":"540p","width":576},"video_control":{"allow_download":true,"allow_duet":true,"allow_dynamic_wallpaper":true,"allow_music":true,"allow_react":true,"draft_progress_bar":0,"prevent_download_type":0,"share_type":1,"show_progress_bar":0,"timer_status":1},"video_labels":null,"video_text":null,"vr_type":0,"with_promotional_music":false,"xigua_task":{"is_xigua_task":false}},{"anchors":null,"author":{"accept_private_policy":false,"account_region":"","ad_cover_url":null,"apple_account":0,"authority_status":0,"avatar_168x168":{"height":720,"uri":"168x168/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3","url_list":["https://p9-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_168x168.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_168x168.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_168x168.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_168x168.jpeg?from=2563711402"],"width":720},"avatar_300x300":{"height":720,"uri":"300x300/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3","url_list":["https://p26-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_300x300.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_300x300.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_300x300.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_300x300.jpeg?from=2563711402"],"width":720},"avatar_larger":{"height":720,"uri":"1080x1080/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3","url_list":["https://p29-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_1080x1080.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_1080x1080.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_1080x1080.jpeg?from=2563711402"],"width":720},"avatar_medium":{"height":720,"uri":"720x720/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3","url_list":["https://p9-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_720x720.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_720x720.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_720x720.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_720x720.jpeg?from=2563711402"],"width":720},"avatar_thumb":{"height":720,"uri":"100x100/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3","url_list":["https://p9-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_100x100.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_100x100.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_100x100.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_100x100.jpeg?from=2563711402"],"width":720},"avatar_uri":"tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3","aweme_count":0,"bind_phone":"","birthday":"","cha_list":null,"comment_filter_status":0,"comment_setting":0,"commerce_user_level":1,"constellation":0,"cover_url":[{"height":720,"uri":"c8510002be9a3a61aad2","url_list":["https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p26-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"],"width":720}],"create_time":0,"custom_verify":"","cv_level":"","download_prompt_ts":0,"download_setting":-1,"duet_setting":0,"enterprise_verify_reason":"武汉市洪山区三木禾造型理发店","favoriting_count":0,"fb_expire_time":0,"follow_status":0,"follower_count":0,"follower_status":0,"followers_detail":null,"following_count":0,"gender":0,"geofencing":null,"google_account":"","has_email":false,"has_facebook_token":false,"has_insights":false,"has_orders":false,"has_twitter_token":false,"has_unread_story":false,"has_youtube_token":false,"hide_location":false,"hide_search":false,"ins_id":"","is_ad_fake":false,"is_binded_weibo":false,"is_block":false,"is_discipline_member":false,"is_gov_media_vip":false,"is_phone_binded":false,"is_star":false,"is_verified":true,"item_list":null,"language":"zh-Hans","live_agreement":0,"live_agreement_time":0,"live_commerce":false,"live_verify":0,"location":"","need_recommend":0,"neiguang_shield":0,"new_story_cover":null,"nickname":"爱上影视剪辑","platform_sync_info":null,"prevent_download":false,"react_setting":0,"reflow_page_gid":0,"reflow_page_uid":0,"region":"CN","relative_users":null,"room_id":0,"school_name":"","school_poi_id":"","school_type":0,"sec_uid":"MS4wLjABAAAAriUG1VkgEUs5uXbNQbn0xkdA4FTHQc7B0ZNhQRf5BS8","secret":0,"share_info":{"share_desc":"","share_qrcode_url":{"height":720,"uri":"318590009f0ed14540557","url_list":["https://p6-dy-ipv6.byteimg.com/obj/318590009f0ed14540557?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/318590009f0ed14540557?from=2563711402","https://p26-dy.byteimg.com/obj/318590009f0ed14540557?from=2563711402"],"width":720},"share_title":"","share_title_myself":"","share_title_other":"","share_url":"","share_weibo_desc":""},"share_qrcode_uri":"318590009f0ed14540557","shield_comment_notice":0,"shield_digg_notice":0,"shield_follow_notice":0,"short_id":"3671515195","show_image_bubble":false,"signature":"👥她正在关注你\n★高清观感剪辑\n★记录生活♥记录美好♥\n★在影视中发现小美好(^_^)\n🎬☆许你一点美好难忘🙈💕","special_lock":1,"status":1,"story_count":0,"story_open":false,"sync_to_toutiao":0,"total_favorited":0,"tw_expire_time":0,"twitter_id":"","twitter_name":"","type_label":null,"uid":"105742806390","unique_id":"dygg7788","unique_id_modify_time":1602741234,"user_canceled":false,"user_mode":0,"user_period":0,"user_rate":1,"verification_type":1,"verify_info":"","video_icon":{"height":720,"uri":"","url_list":null,"width":720},"weibo_name":"","weibo_schema":"","weibo_url":"","weibo_verify":"","with_commerce_entry":false,"with_dou_entry":false,"with_fusion_shop_entry":true,"with_shop_entry":false,"youtube_channel_id":"","youtube_channel_title":"","youtube_expire_time":0},"author_user_id":105742806390,"aweme_control":{"can_comment":true,"can_forward":true,"can_share":true,"can_show_comment":true},"aweme_id":"6883294765023005955","aweme_type":0,"bodydance_score":0,"cha_list":[{"author":{"ad_cover_url":null,"cha_list":null,"cover_url":null,"followers_detail":null,"geofencing":null,"item_list":null,"new_story_cover":null,"platform_sync_info":null,"relative_users":null,"type_label":null},"cha_attrs":null,"cha_name":"行尸之惧第五季","cid":"1677896133188621","collect_stat":0,"connect_music":null,"desc":"","is_challenge":0,"is_commerce":false,"is_pgcshow":false,"schema":"aweme://aweme/challenge/detail?cid=1677896133188621","share_info":{"bool_persist":0,"share_desc":"在抖音，记录美好生活","share_quote":"","share_signature_desc":"","share_signature_url":"","share_title":"我在抖音参加#行尸之惧第五季 ","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/challenge/1677896133188621/?u_code=i0kji679","share_weibo_desc":"我在抖音参加#行尸之惧第五季 "},"sub_type":0,"type":1,"user_count":0,"view_count":0}],"challenge_position":null,"city":"429004","cmt_swt":false,"collect_stat":0,"comment_list":null,"commerce_config_data":null,"create_time":1602641980,"desc":"这个代入感太强了 #行尸之惧第五季  #我的观影视报告","desc_language":"zh","distance":"","distribute_type":2,"duration":111172,"enable_top_view":true,"follow_up_type":0,"geofencing":null,"geofencing_regions":null,"group_id":"6883294765023005955","hybrid_label":null,"image_infos":null,"interaction_stickers":null,"is_ads":false,"is_fantasy":false,"is_hash_tag":1,"is_horizontal":false,"is_pgcshow":false,"is_relieve":false,"is_story":0,"is_top":0,"is_vr":false,"item_comment_settings":0,"item_duet":0,"item_react":0,"label_top":{"height":720,"uri":"c150000f34767e2cb56","url_list":["https://p3-dy-ipv6.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p6-dy-ipv6.byteimg.com/obj/c150000f34767e2cb56?from=2563711402"],"width":720},"label_top_text":null,"long_video":null,"misc_info":"{}","mix_info":{"cover_url":{"height":720,"uri":"tos-cn-i-0813/7c499d88ad2d460b80d21498db27108c","url_list":["https://p6-dy-ipv6.byteimg.com/obj/tos-cn-i-0813/7c499d88ad2d460b80d21498db27108c?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/tos-cn-i-0813/7c499d88ad2d460b80d21498db27108c?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-i-0813/7c499d88ad2d460b80d21498db27108c?from=2563711402"],"width":720},"desc":"好看的丧尸系列","extra":"{\"audit_locktime\":1602696038,\"ban_fields\":[],\"first_reviewed\":1,\"is_quality_mix\":0,\"next_info\":{\"cover\":\"tos-cn-i-0813/7c499d88ad2d460b80d21498db27108c\",\"desc\":\"好看的丧尸系列\",\"name\":\"行尸之惧更新中\"}}","mix_id":"6882935951782316043","mix_name":"行尸之惧更新中","share_info":{"share_desc":"在抖音，记录美好生活","share_title":"这么有趣的合集，不能只有我一个人知道吧","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/mix/detail/6882935951782316043/?schema_type=24&object_id=6882935951782316043","share_weibo_desc":"这么有趣的合集，不能只有我一个人知道吧"},"statis":{"collect_vv":0,"current_episode":4,"play_vv":0,"updated_to_episode":5},"status":{"is_collected":0,"status":2}},"music":{"album":"","author":"爱上影视剪辑","author_deleted":false,"author_position":null,"avatar_large":{"height":720,"uri":"1080x1080/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_1080x1080.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_1080x1080.jpeg?from=2563711402"],"width":720},"avatar_medium":{"height":720,"uri":"720x720/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_720x720.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_720x720.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_720x720.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_720x720.jpeg?from=2563711402"],"width":720},"avatar_thumb":{"height":720,"uri":"100x100/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3","url_list":["https://p9-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_100x100.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_100x100.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_100x100.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_100x100.jpeg?from=2563711402"],"width":720},"binded_challenge_id":0,"collect_stat":0,"cover_hd":{"height":720,"uri":"1080x1080/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_1080x1080.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_1080x1080.jpeg?from=2563711402"],"width":720},"cover_large":{"height":720,"uri":"1080x1080/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_1080x1080.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_1080x1080.jpeg?from=2563711402"],"width":720},"cover_medium":{"height":720,"uri":"720x720/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_720x720.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_720x720.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_720x720.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_720x720.jpeg?from=2563711402"],"width":720},"cover_thumb":{"height":720,"uri":"100x100/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3","url_list":["https://p9-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_100x100.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_100x100.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_100x100.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-i-0813/db36cca56907462a9a5c722f30e3c9d3~c5_100x100.jpeg?from=2563711402"],"width":720},"duration":111,"end_time":0,"external_song_info":null,"extra":"{\"schedule_search_time\":0,\"hotsoon_review_time\":-1,\"aggregate_exempt_conf\":[],\"douyin_beats_info\":{},\"reviewed\":0,\"review_unshelve_reason\":0,\"beats\":{},\"music_label_id\":null,\"has_edited\":0}","id":6883294925757106957,"id_str":"6883294925757106957","is_author_artist":false,"is_del_video":false,"is_original":false,"is_pgc":false,"is_restricted":false,"is_video_self_see":false,"mid":"6883294925757106957","mute_share":false,"offline_desc":"","owner_handle":"dygg7788","owner_id":"105742806390","owner_nickname":"爱上影视剪辑","play_url":{"height":720,"uri":"https://p1-dy.byteimg.com/obj/ies-music/6883294914625440520.mp3","url_list":["https://p1-dy.byteimg.com/obj/ies-music/6883294914625440520.mp3","https://p9-dy.byteimg.com/obj/ies-music/6883294914625440520.mp3"],"width":720},"position":null,"prevent_download":false,"prevent_item_download_status":0,"preview_end_time":0,"preview_start_time":0,"redirect":false,"schema_url":"","sec_uid":"MS4wLjABAAAAriUG1VkgEUs5uXbNQbn0xkdA4FTHQc7B0ZNhQRf5BS8","source_platform":23,"start_time":0,"status":1,"title":"@爱上影视剪辑创作的原声","unshelve_countries":null,"user_count":0},"nickname_position":null,"origin_comment_ids":null,"position":null,"prevent_download":true,"promotions":null,"rate":12,"raw_ad_data":null,"region":"","risk_infos":{"content":"","risk_sink":false,"type":0,"vote":false,"warn":false},"share_info":{"bool_persist":0,"share_desc":"在抖音，记录美好生活","share_link_desc":"这个代入感太强了 #行尸之惧第五季  #我的观影视报告  %s 复制此链接，打开抖音，直接观看视频！","share_quote":"","share_signature_desc":"","share_signature_url":"","share_title":"这个代入感太强了 #行尸之惧第五季  #我的观影视报告","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/video/6883294765023005955/?region=CN&mid=6883294925757106957&u_code=i0kji679&titleType=title&did=71471896106&iid=3993023441537288","share_weibo_desc":"#在抖音，记录美好生活#这个代入感太强了 #行尸之惧第五季  #我的观影视报告"},"share_url":"https://www.iesdouyin.com/share/video/6883294765023005955/?region=CN&mid=6883294925757106957&u_code=i0kji679&titleType=title&did=71471896106&iid=3993023441537288","sort_label":"vdc","statistics":{"aweme_id":"6883294765023005955","comment_count":33,"digg_count":732,"download_count":0,"forward_count":1,"lose_comment_count":0,"lose_count":0,"play_count":0,"share_count":8,"whatsapp_share_count":0},"status":{"allow_comment":true,"allow_share":true,"aweme_id":"6883294765023005955","download_status":0,"in_reviewing":false,"is_delete":false,"is_private":false,"is_prohibited":false,"private_status":0,"reviewed":0,"self_see":false,"with_fusion_goods":false,"with_goods":false},"text_extra":[{"end":17,"hashtag_id":"1677896133188621","hashtag_name":"行尸之惧第五季","is_commerce":false,"start":9,"type":1},{"end":27,"hashtag_id":"1643026562973710","hashtag_name":"我的观影视报告","is_commerce":false,"start":19,"type":1}],"uniqid_position":null,"user_digged":0,"user_profile_init_info":{"head_model_score":0.12042731046676636},"video":{"big_thumbs":[{"duration":111.111,"fext":"jpg","img_num":111,"img_url":"http://p3-tt.bytecdn.cn/obj/tos-cn-p-0015/874562d8ed6e415ba081711b1cc10150_1602641991","img_x_len":10,"img_x_size":240,"img_y_len":12,"img_y_size":136,"interval":10,"uri":"tos-cn-p-0015/874562d8ed6e415ba081711b1cc10150_1602641991"}],"bit_rate":[{"bit_rate":2070078,"gear_name":"adapt_lowest_720","is_h265":1,"play_addr":{"data_size":28766849,"file_cs":"c:0-87137-4295","height":720,"uri":"v0200f660000bu35uc6h0e8tq6moj2t0","url_key":"v0200f660000bu35uc6h0e8tq6moj2t0_bytevc1_720p_2070078","url_list":["http://v26-dy.ixigua.com/0224601b1ffd560d1f3b2c87c6cc05f9/5f87f271/video/tos/cn/tos-cn-ve-15/ef436cb3485948fea5c8f4eca7ea63e6/?a=1128&br=6063&bt=2021&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=MzVyOXdoa2Y4eDMzOWkzM0ApNzk4N2VpZWRoN2Q2Zjk7aWdxZ2puNS0zcjBfLS0zLS9zczIzYC00YjRjNGMvYzNeLjY6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/9e21ab6430c9d8e943902bb4682ada49/5f87f271/video/tos/cn/tos-cn-ve-15/ef436cb3485948fea5c8f4eca7ea63e6/?a=1128&br=6063&bt=2021&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=MzVyOXdoa2Y4eDMzOWkzM0ApNzk4N2VpZWRoN2Q2Zjk7aWdxZ2puNS0zcjBfLS0zLS9zczIzYC00YjRjNGMvYzNeLjY6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":28766849,"file_cs":"c:0-87137-4295","height":720,"uri":"v0200f660000bu35uc6h0e8tq6moj2t0","url_key":"v0200f660000bu35uc6h0e8tq6moj2t0_bytevc1_720p_2070078","url_list":["http://v26-dy.ixigua.com/0224601b1ffd560d1f3b2c87c6cc05f9/5f87f271/video/tos/cn/tos-cn-ve-15/ef436cb3485948fea5c8f4eca7ea63e6/?a=1128&br=6063&bt=2021&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=MzVyOXdoa2Y4eDMzOWkzM0ApNzk4N2VpZWRoN2Q2Zjk7aWdxZ2puNS0zcjBfLS0zLS9zczIzYC00YjRjNGMvYzNeLjY6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/9e21ab6430c9d8e943902bb4682ada49/5f87f271/video/tos/cn/tos-cn-ve-15/ef436cb3485948fea5c8f4eca7ea63e6/?a=1128&br=6063&bt=2021&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=MzVyOXdoa2Y4eDMzOWkzM0ApNzk4N2VpZWRoN2Q2Zjk7aWdxZ2puNS0zcjBfLS0zLS9zczIzYC00YjRjNGMvYzNeLjY6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"quality_type":15},{"bit_rate":1681696,"gear_name":"adapt_540","is_h265":1,"play_addr":{"data_size":23369698,"file_cs":"c:0-87129-32b6","height":720,"uri":"v0200f660000bu35uc6h0e8tq6moj2t0","url_key":"v0200f660000bu35uc6h0e8tq6moj2t0_bytevc1_540p_1681696","url_list":["http://v26-dy.ixigua.com/2a177cc06f7f4406b9f89f19cde1b020/5f87f271/video/tos/cn/tos-cn-ve-15/ecfa8c80791c4fc894f40d781f13c8c6/?a=1128&br=6568&bt=1642&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=MzVyOXdoa2Y4eDMzOWkzM0ApPGY0aWU5aGU7NzY1Zjs3OWdxZ2puNS0zcjBfLS0zLS9zczJhYzUzMDA0YTVeYzEyMjQ6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/8cb542e6eac43b2b3a9c2ab94234b81e/5f87f271/video/tos/cn/tos-cn-ve-15/ecfa8c80791c4fc894f40d781f13c8c6/?a=1128&br=6568&bt=1642&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=MzVyOXdoa2Y4eDMzOWkzM0ApPGY0aWU5aGU7NzY1Zjs3OWdxZ2puNS0zcjBfLS0zLS9zczJhYzUzMDA0YTVeYzEyMjQ6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":23369698,"file_cs":"c:0-87129-32b6","height":720,"uri":"v0200f660000bu35uc6h0e8tq6moj2t0","url_key":"v0200f660000bu35uc6h0e8tq6moj2t0_bytevc1_540p_1681696","url_list":["http://v26-dy.ixigua.com/2a177cc06f7f4406b9f89f19cde1b020/5f87f271/video/tos/cn/tos-cn-ve-15/ecfa8c80791c4fc894f40d781f13c8c6/?a=1128&br=6568&bt=1642&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=MzVyOXdoa2Y4eDMzOWkzM0ApPGY0aWU5aGU7NzY1Zjs3OWdxZ2puNS0zcjBfLS0zLS9zczJhYzUzMDA0YTVeYzEyMjQ6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/8cb542e6eac43b2b3a9c2ab94234b81e/5f87f271/video/tos/cn/tos-cn-ve-15/ecfa8c80791c4fc894f40d781f13c8c6/?a=1128&br=6568&bt=1642&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=MzVyOXdoa2Y4eDMzOWkzM0ApPGY0aWU5aGU7NzY1Zjs3OWdxZ2puNS0zcjBfLS0zLS9zczJhYzUzMDA0YTVeYzEyMjQ6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"quality_type":28}],"cdn_url_expired":0,"cover":{"height":720,"uri":"large/tos-cn-i-0813/c0f65bc6205646d0841e598d765d6e27","url_list":["http://p6-dy-ipv6.byteimg.com/large/tos-cn-i-0813/c0f65bc6205646d0841e598d765d6e27.webp?from=2563711402_large","http://p9-dy.byteimg.com/large/tos-cn-i-0813/c0f65bc6205646d0841e598d765d6e27.webp?from=2563711402_large","http://p29-dy.byteimg.com/large/tos-cn-i-0813/c0f65bc6205646d0841e598d765d6e27.webp?from=2563711402_large","http://p6-dy-ipv6.byteimg.com/large/tos-cn-i-0813/c0f65bc6205646d0841e598d765d6e27.jpeg?from=2563711402_large"],"width":720},"download_addr":{"data_size":42739314,"height":720,"uri":"v0200f660000bu35uc6h0e8tq6moj2t0","url_list":["http://v26-dy.ixigua.com/92e6d7aea09da55547d24379c4dc127f/5f87f271/video/tos/cn/tos-cn-ve-15/db916a136944438c8e1275e5e5a53d51/?a=1128&br=8772&bt=2924&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=MzVyOXdoa2Y4eDMzOWkzM0ApO2hnZ2Y7PDw0N2k7Nzk2O2dxZ2puNS0zcjBfLS0zLS9zczAyNV5fNjQzLzJhLmFhYDI6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/3a7ed85e51bf03beaf45878e194f8091/5f87f271/video/tos/cn/tos-cn-ve-15/db916a136944438c8e1275e5e5a53d51/?a=1128&br=8772&bt=2924&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=MzVyOXdoa2Y4eDMzOWkzM0ApO2hnZ2Y7PDw0N2k7Nzk2O2dxZ2puNS0zcjBfLS0zLS9zczAyNV5fNjQzLzJhLmFhYDI6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"download_suffix_logo_addr":{"data_size":42739314,"height":720,"uri":"v0200f660000bu35uc6h0e8tq6moj2t0","url_list":["http://v26-dy.ixigua.com/92e6d7aea09da55547d24379c4dc127f/5f87f271/video/tos/cn/tos-cn-ve-15/db916a136944438c8e1275e5e5a53d51/?a=1128&br=8772&bt=2924&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=MzVyOXdoa2Y4eDMzOWkzM0ApO2hnZ2Y7PDw0N2k7Nzk2O2dxZ2puNS0zcjBfLS0zLS9zczAyNV5fNjQzLzJhLmFhYDI6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/3a7ed85e51bf03beaf45878e194f8091/5f87f271/video/tos/cn/tos-cn-ve-15/db916a136944438c8e1275e5e5a53d51/?a=1128&br=8772&bt=2924&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=MzVyOXdoa2Y4eDMzOWkzM0ApO2hnZ2Y7PDw0N2k7Nzk2O2dxZ2puNS0zcjBfLS0zLS9zczAyNV5fNjQzLzJhLmFhYDI6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"duration":111172,"dynamic_cover":{"height":720,"uri":"tos-cn-i-0813/c0f65bc6205646d0841e598d765d6e27","url_list":["https://p9-dy.byteimg.com/obj/tos-cn-i-0813/c0f65bc6205646d0841e598d765d6e27?from=2563711402_large","https://p1-dy-ipv6.byteimg.com/obj/tos-cn-i-0813/c0f65bc6205646d0841e598d765d6e27?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-i-0813/c0f65bc6205646d0841e598d765d6e27?from=2563711402_large"],"width":720},"has_download_suffix_logo_addr":true,"has_watermark":true,"height":576,"is_h265":0,"is_long_video":1,"origin_cover":{"height":720,"uri":"tos-cn-p-0015/57873c13d3544b6f94628423d78b962c_1602641982","url_list":["https://p3-dy-ipv6.byteimg.com/tos-cn-p-0015/57873c13d3544b6f94628423d78b962c_1602641982~tplv-dy-360p.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/tos-cn-p-0015/57873c13d3544b6f94628423d78b962c_1602641982~tplv-dy-360p.webp?from=2563711402","https://p29-dy.byteimg.com/tos-cn-p-0015/57873c13d3544b6f94628423d78b962c_1602641982~tplv-dy-360p.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/tos-cn-p-0015/57873c13d3544b6f94628423d78b962c_1602641982~tplv-dy-360p.jpeg?from=2563711402"],"width":720},"play_addr":{"data_size":32524832,"file_cs":"c:0-86726-030d","height":720,"uri":"v0200f660000bu35uc6h0e8tq6moj2t0","url_key":"v0200f660000bu35uc6h0e8tq6moj2t0_h264_540p_2340505","url_list":["http://v26-dy.ixigua.com/729fd8d90a21890dcd9f5182c1857b0c/5f87f271/video/tos/cn/tos-cn-ve-15/cf09486f4048498cb792c060b6fbcbcc/?a=1128&br=6855&bt=2285&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=MzVyOXdoa2Y4eDMzOWkzM0ApOjtlM2dmNztmN2k6aDdnOWdxZ2puNS0zcjBfLS0zLS9zc15gLV8yMTZfMjQzXzBeNF46Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/3ac8f1fdf382bf66f34e59e05158e97e/5f87f271/video/tos/cn/tos-cn-ve-15/cf09486f4048498cb792c060b6fbcbcc/?a=1128&br=6855&bt=2285&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=MzVyOXdoa2Y4eDMzOWkzM0ApOjtlM2dmNztmN2k6aDdnOWdxZ2puNS0zcjBfLS0zLS9zc15gLV8yMTZfMjQzXzBeNF46Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":23369698,"file_cs":"c:0-87129-32b6","height":720,"uri":"v0200f660000bu35uc6h0e8tq6moj2t0","url_key":"v0200f660000bu35uc6h0e8tq6moj2t0_bytevc1_540p_1681696","url_list":["http://v26-dy.ixigua.com/2a177cc06f7f4406b9f89f19cde1b020/5f87f271/video/tos/cn/tos-cn-ve-15/ecfa8c80791c4fc894f40d781f13c8c6/?a=1128&br=6568&bt=1642&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=MzVyOXdoa2Y4eDMzOWkzM0ApPGY0aWU5aGU7NzY1Zjs3OWdxZ2puNS0zcjBfLS0zLS9zczJhYzUzMDA0YTVeYzEyMjQ6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/8cb542e6eac43b2b3a9c2ab94234b81e/5f87f271/video/tos/cn/tos-cn-ve-15/ecfa8c80791c4fc894f40d781f13c8c6/?a=1128&br=6568&bt=1642&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=MzVyOXdoa2Y4eDMzOWkzM0ApPGY0aWU5aGU7NzY1Zjs3OWdxZ2puNS0zcjBfLS0zLS9zczJhYzUzMDA0YTVeYzEyMjQ6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_h264":{"data_size":32524832,"file_cs":"c:0-86726-030d","height":720,"uri":"v0200f660000bu35uc6h0e8tq6moj2t0","url_key":"v0200f660000bu35uc6h0e8tq6moj2t0_h264_540p_2340505","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"play_addr_lowbr":{"data_size":32524832,"file_cs":"c:0-86726-030d","height":720,"uri":"v0200f660000bu35uc6h0e8tq6moj2t0","url_key":"v0200f660000bu35uc6h0e8tq6moj2t0_h264_540p_2340505","url_list":["http://v26-dy.ixigua.com/729fd8d90a21890dcd9f5182c1857b0c/5f87f271/video/tos/cn/tos-cn-ve-15/cf09486f4048498cb792c060b6fbcbcc/?a=1128&br=6855&bt=2285&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=MzVyOXdoa2Y4eDMzOWkzM0ApOjtlM2dmNztmN2k6aDdnOWdxZ2puNS0zcjBfLS0zLS9zc15gLV8yMTZfMjQzXzBeNF46Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/3ac8f1fdf382bf66f34e59e05158e97e/5f87f271/video/tos/cn/tos-cn-ve-15/cf09486f4048498cb792c060b6fbcbcc/?a=1128&br=6855&bt=2285&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=MzVyOXdoa2Y4eDMzOWkzM0ApOjtlM2dmNztmN2k6aDdnOWdxZ2puNS0zcjBfLS0zLS9zc15gLV8yMTZfMjQzXzBeNF46Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0200f660000bu35uc6h0e8tq6moj2t0&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"ratio":"540p","video_model":"","width":1024},"video_control":{"allow_download":false,"allow_duet":false,"allow_dynamic_wallpaper":false,"allow_music":true,"allow_react":false,"draft_progress_bar":1,"prevent_download_type":3,"share_type":0,"show_progress_bar":1,"timer_status":1},"video_labels":null,"video_text":null,"vr_type":0,"with_promotional_music":false,"xigua_task":{"is_xigua_task":false}}]
     * disable_adjust_for_cache : true
     * enable_re_rank : false
     * extra : {"fatal_item_ids":null,"now":1602741234000}
     * has_more : 1
     * home_model : 1
     * log_pb : {"impr_id":"202010151353530100140450800D5ADE59"}
     * max_cursor : 0
     * min_cursor : 0
     * preload_ads : [{"anchors":null,"author":{"ad_cover_url":null,"avatar_168x168":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_168x168.webp?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_168x168.webp?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_168x168.webp?from=4010531038"],"width":720},"avatar_300x300":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_300x300.webp?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_300x300.webp?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_300x300.webp?from=4010531038"],"width":720},"avatar_medium":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038"],"width":720},"avatar_thumb":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038"],"width":720},"cha_list":null,"comment_filter_status":0,"comment_setting":0,"commerce_user_level":0,"cover_url":[{"height":720,"uri":"c8510002be9a3a61aad2","url_list":["https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085","https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085"],"width":720}],"custom_verify":"","download_setting":-1,"duet_setting":0,"enterprise_verify_reason":"","follow_status":0,"followers_detail":null,"geofencing":null,"hide_location":false,"is_ad_fake":false,"is_block":false,"is_gov_media_vip":false,"is_star":false,"is_verified":true,"item_list":null,"language":"zh-Hans","location":"","new_story_cover":null,"nickname":"脆脆鲨","platform_sync_info":null,"prevent_download":false,"region":"CN","relative_users":null,"room_id":0,"sec_uid":"MS4wLjABAAAA2-lXjqiZoKA8kGGSrbxBCHkgjdgX24pe_Bam8TGkXzg","secret":0,"short_id":"2259668398","signature":"香浓酥脆每一刻，随食\u201c抖\u201d出小快乐","type_label":null,"uid":"215125970401869","unique_id":"dyv1om6bqv5h","verification_type":0,"video_icon":{"height":720,"uri":"","url_list":null,"width":720},"with_commerce_entry":false},"author_user_id":215125970401869,"aweme_control":{"can_comment":true,"can_forward":true,"can_share":true,"can_show_comment":true},"aweme_id":"6883670241025576205","aweme_type":0,"cha_list":[{"author":{"ad_cover_url":null,"cha_list":null,"cover_url":null,"followers_detail":null,"geofencing":null,"item_list":null,"new_story_cover":null,"platform_sync_info":null,"relative_users":null,"type_label":null},"cha_attrs":null,"cha_name":"脆脆高能鲨出重围","cid":"1680436442081304","collect_stat":0,"connect_music":null,"desc":"","is_challenge":0,"is_commerce":false,"schema":"aweme://aweme/challenge/detail?cid=1680436442081304","type":0,"user_count":0,"view_count":0}],"challenge_position":null,"cmt_swt":false,"collect_stat":0,"comment_list":null,"commerce_config_data":null,"commerce_info":{"avoid_global_pendant":true},"create_time":1602729375,"desc":"#脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！","desc_language":"un","distance":"","distribute_type":1,"duration":55620,"geofencing":null,"geofencing_regions":null,"group_id":"6883670241025576205","hybrid_label":null,"image_infos":null,"interaction_stickers":null,"is_ads":true,"is_fantasy":false,"is_hash_tag":1,"is_relieve":false,"is_top":0,"is_vr":false,"item_comment_settings":0,"item_duet":2,"item_react":2,"label_top_text":null,"long_video":null,"music":{"author":"脆脆鲨","author_deleted":false,"author_position":null,"avatar_large":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038"],"width":720},"avatar_medium":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038"],"width":720},"avatar_thumb":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038"],"width":720},"collect_stat":0,"cover_hd":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038"],"width":720},"cover_large":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038"],"width":720},"cover_medium":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038"],"width":720},"cover_thumb":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038"],"width":720},"duration":55,"end_time":0,"external_song_info":null,"extra":"{\"has_edited\":0,\"reviewed\":0,\"beats\":{},\"douyin_beats_info\":{},\"schedule_search_time\":0}","id":6883670264656202504,"id_str":"6883670264656202504","is_del_video":false,"is_original":false,"is_video_self_see":false,"mid":"6883670264656202504","mute_share":false,"offline_desc":"","owner_handle":"dyv1om6bqv5h","owner_id":"215125970401869","owner_nickname":"脆脆鲨","play_url":{"height":720,"uri":"http://p9-dy.byteimg.com/obj/ies-music/6883670237451930381.mp3","url_list":["http://p9-dy.byteimg.com/obj/ies-music/6883670237451930381.mp3","http://p1-dy.byteimg.com/obj/ies-music/6883670237451930381.mp3"],"width":720},"position":null,"prevent_download":false,"preview_end_time":0,"preview_start_time":0,"sec_uid":"MS4wLjABAAAA2-lXjqiZoKA8kGGSrbxBCHkgjdgX24pe_Bam8TGkXzg","source_platform":23,"start_time":0,"status":1,"title":"@脆脆鲨创作的原声","unshelve_countries":null},"nickname_position":null,"origin_comment_ids":null,"position":null,"prevent_download":false,"promotions":null,"rate":10,"raw_ad_data":{"ad_id":1680495230957580,"ad_tag_position":2,"animation_type":1,"avatar_url":"http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad","button_style":1,"button_text":"查看详情","click_track_url_list":{"uri":"","url_list":["https://e.cn.miaozhen.com/r/k=2198229&p=7gcaa&rt=2&pro=s&tr=202010151353530100140450800D5ADE59&ns=113.65.209.51&mo=0&m1a=edf462a213db8c0d2a151ccac360e7a4&m2=7fd8959419a37b887d0ffd34b461cd2d&m5=__IDFA__&m6a=__MAC__&ls=23.1x113.4x100.0&vv=1&o="]},"comment_area":{"avatar_icon":{"uri":"web.business.image/202010145d0d45ffb5b847a84e14bf0c","url_list":["http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad","http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad"]},"button_text":"查看详情","comment_info":"#脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！","comment_nickname":"脆脆鲨鲨刻能新上市","comment_time":1603036800,"show_button_number":10,"source":"脆脆鲨鲨刻能新上市","title":"#脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！"},"comment_area_switch":true,"creative_id":1680495387887629,"disable_show_ad_link":true,"dislike":{"dislike_url":"https://aweme.snssdk.com/falcon/fe_douyin_ad_react/pages/ad_push?hide_nav_bar=1&enter_type=normal_ad","label_clickable":true,"name":"为什么看到此广告"},"effective_play_time":5,"effective_play_track_url_list":{"uri":"","url_list":["https://g.cn.miaozhen.com/x/k=2198229&p=7gcab&rt=2&pro=s&tr=202010151353530100140450800D5ADE59&ns=113.65.209.51&mo=0&m1a=edf462a213db8c0d2a151ccac360e7a4&m2=7fd8959419a37b887d0ffd34b461cd2d&m5=__IDFA__&m6a=__MAC__&ls=23.1x113.4x100.0&vv=1&o="]},"group_id":6883670241025576205,"is_preview":false,"is_real_author":true,"label":{"color":"#14FFFFFF","color_text":"#7FFFFFFF","text":"广告","type":4},"learn_more_bg_color":"#E67D2E","log_extra":"{\"ad_id\":1680495230957580,\"awesome_splash_ad_id\":1680439311212573,\"bdid\":\"2fd0c894386ea37230e015c2dd3271a8878c6c90f61edaa712781b7fb6434241\",\"card_id\":0,\"city_id_brand\":440100,\"clickid\":\"EI2QkZXtjP4CGIv17-fkASCqrLqgigIwDDiHuQJCIjIwMjAxMDE1MTM1MzUzMDEwMDE0MDQ1MDgwMEQ1QURFNTlIwbgC\",\"component_ids\":[8,9,13,38],\"convert_component_suspend\":0,\"convert_id\":0,\"first_splash_show\":1,\"hyrule_atype\":[],\"is_pack_v2\":true,\"orit\":40001,\"placement\":\"unknown\",\"req_id\":\"202010151353530100140450800D5ADE59\",\"rit\":40071,\"style_id\":4916,\"style_ids\":[4916],\"vid\":\"2079428,2074568,2064649,2081276,2041701,2041459,1864404,2069662,1967211,1702641,2070764,2059243,1999155,1363731,2092715,2062059,2093658,1630376,1721662,1863628,2063942,1502561,1915686,1686911,2054037,1872498,2027856,1759136,1559151,2096444,2090536,2052595,2062498,1919713,1973593,1371807,1999048,2086383,2028546,2034339,1649432,1711118,1962348,1877132,1914588,1931512,1802606,2025882,2066364,1938274,2092417,1921551,2016804,946599,1548386,2050186,2027582,1933509,1856457,2092195,2049970,1847189,2040780,2071677,1922032,2063387,2070881,2076365,1854881,1769935,1954115,2090902,2093760,1287775,1996411,1788822,2021604,2064701,2000602,2008178,2018110,1957537,2023863,2052902,1927617,2094615,2023838,1858797,2088124,1987817,2048550,2018926,372442,1999041,1586303,1803849,2034508,2086488,2068621,2094079,1409057,2063908,2067123,2094908,1477639,2095792,2085127,1973466,2026313,2014223,1733176,2057867,2068693,1781885,2055606,2037300,2061818,2088045,2084493,2090256,2096049,930218,1918567,2046182,2082475,2072686,2057475,1437737,1756367,2045135,2095700,2093055,1993503,2000177,2087540,2078193,1766311,1878449,1316532,2091517,1935100,2093673,1737179,692246,2090887,1675203,2044708,2083838,2021605,2047962,2070478,2091788,2056525,2095801,2091927,1689196,2071632,1634350,2072814,2047011,1936545,1749597,2088469,2057733,1745311,2062715,1684045,1748501,2039491,2090772,1980930,2084199,2048617,1861459,2086266,1992558,2086194,1771997,1668718,2080462,1997876,1442946,2094992,1477989,2066329,1974358,2071124,2090171,1929739,2085714,2000632,2078630,1978885,1983665,1878838,2093641,2087284,1961262,1890594,1998351,2095632,1965398,2051212,2074195,1350814,2085477,1952286,1960178,1943882,1898634,2092921,2079151,2091242,2033160,1988991,2092012,1776768,2042434,1709892,1287465,2080498,2085742,2079981,1475013,1540878,2090104,1908320,2053237,2095288,2092020,2093098,1934496,1965093,2031019,1966493,2093228,2079819,2048628,2083576,2086431,2088594,2095698,1527915,1271269,1910043,2037655,2021040,1569140,2040028,2085732,1317390,2045492,2046513,1732302,1284629,2073272,2079286,2043248,2082042,1304704,1919592,1922933,2085501,1662487,1851215,1887734,2092581,1383003,1880555,1725914,2078595,1657760,2096370,1858015,1589053,2086239,2095283,1771198,2082555,1871664,1990026,2035361,2070465,1507330,2078510,2088585,2074398,2023880,1856670,2093131,1278726,2051829,1902568,1921096,2037087,1793443,2089586,2075114,1993411,2090709,2023025,2007076,2080265,1778383,2007337,1771808,2092216,1980052,2072392,1978032,2049621,2073894,1737464,1865396,2081975,2085543,1960528,2094847,2094897,2076230,2090738,2070134,1471649,2047164,2096209,2064909,1961981,1966142,2056262,1978083,2062386,1901648,2089428,1566627,1716918,2079588,2009486,2084360,2038247,1447419,2086078,1741207,2007565,2050607,1683123,1995036,2056756,2081111,1965624,2063746,1329106,2087008,2067369,2094981,2082996,1938812,2090649,2095731,2049730,2014042,1856698,2062848,1960098,1630402,1997199,1563866,2046484,2047176,2056486,1553292,2066097,2078548,2048549,1852086,2092463,2020692,2094891,2087366,2028317,2088196,1909913,2076736,1551584,2064014,1710080,1937601,1333775,2066696,1856545,1648176,2095255,2063672,1745643,2058525,2034060,2081927,1880623,2071181,2045489,2085667,2019195,1894146,2064668,1974198,2038604,2032352,1498261,2065976,1550413,2045824,2087242,2045179,2087291,1368035,2068060,2079679,2045544,1952297,2045877,2046550,2092618,1527621,2096386,2063571,2062385,2046488,2062052,2047049,2047031,2045496,2053655,2086241,2080527\"}","report_enable":true,"show_button_seconds":6,"show_mask_times":2,"source":"脆脆鲨鲨刻能新上市","splash_info":{"awesome_splash_id":"1680439311212573","enable_splash_open":true,"end_time":1603123200,"hot_show_type":1,"predownload_text":"已预加载","preload_size":810,"skip_info":{"background_color":"#34000000","countdown_unit":"","text":"跳过广告","text_color":"#FFFFFFFF"},"splash_show_time":3000},"title":"#脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！","track_url_list":{"uri":"","url_list":["https://g.cn.miaozhen.com/x/k=2198229&p=7gcaa&rt=2&pro=s&tr=202010151353530100140450800D5ADE59&ns=113.65.209.51&mo=0&m1a=edf462a213db8c0d2a151ccac360e7a4&m2=7fd8959419a37b887d0ffd34b461cd2d&m5=__IDFA__&m6a=__MAC__&ls=23.1x113.4x100.0&vv=1&o="]},"type":"web","use_ordinary_web":true,"video_transpose":0,"web_title":"脆脆鲨鲨刻能新上市","web_url":"https://3.cn/100rwUP-a"},"region":"","share_info":{"bool_persist":0,"share_desc":"在抖音，记录美好生活","share_link_desc":"#脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！ %s 复制此链接，打开【抖音短视频】，直接观看视频！","share_quote":"","share_title":"#脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/video/6883670241025576205/?region=CN&mid=6883670264656202504&u_code=i0kji679&titleType=title","share_weibo_desc":"#在抖音，记录美好生活##脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！"},"share_url":"https://www.iesdouyin.com/share/video/6883670241025576205/?region=CN&mid=6883670264656202504&u_code=i0kji679&titleType=title","statistics":{"aweme_id":"6883670241025576205","comment_count":0,"digg_count":0,"download_count":0,"forward_count":0,"lose_comment_count":0,"lose_count":0,"play_count":0,"share_count":0},"status":{"allow_comment":true,"allow_share":true,"aweme_id":"6883670241025576205","download_status":0,"in_reviewing":false,"is_delete":false,"is_private":false,"is_prohibited":false,"private_status":0,"reviewed":1,"self_see":false,"with_fusion_goods":false,"with_goods":false},"text_extra":[{"end":9,"hashtag_id":"1680436442081304","hashtag_name":"脆脆高能鲨出重围","is_commerce":false,"start":0,"type":1}],"uniqid_position":null,"user_digged":0,"video":{"big_thumbs":null,"bit_rate":[{"bit_rate":811715,"gear_name":"normal_540","is_bytevc1":0,"is_h265":0,"play_addr":{"data_size":5643451,"file_hash":"715b935324e0ee954dfbdcd56f2ad4f9","height":720,"uri":"v020336b0000bu3r87l6q7dhb8c2gl80","url_key":"v020336b0000bu3r87l6q7dhb8c2gl80_h264_540p_811715","url_list":["http://v5-dy-d.ixigua.com/f1172afbd9f3ea78ec1e92cd23227f28/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/dff5c7c62026e7c2dbaadbce10441614/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"quality_type":20}],"cdn_url_expired":0,"cover":{"height":720,"uri":"large/34a2c000b11da8188ff22","url_list":["http://p26-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p9-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p6-dy-ipv6.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large"],"width":720},"download_addr":{"data_size":5643451,"height":720,"uri":"v020336b0000bu3r87l6q7dhb8c2gl80","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&watermark=0&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&watermark=0&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&source=PackSourceEnum_FEED"],"width":720},"duration":55620,"dynamic_cover":{"height":720,"uri":"large/34a2c000b11da8188ff22","url_list":["http://p26-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p9-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p6-dy-ipv6.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large"],"width":720},"has_watermark":false,"height":960,"is_bytevc1":0,"is_h265":0,"origin_cover":{"height":720,"uri":"large/34a2c000b11da8188ff22","url_list":["http://p3-dy-ipv6.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p29-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p26-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large"],"width":720},"play_addr":{"data_size":5643451,"file_hash":"715b935324e0ee954dfbdcd56f2ad4f9","height":720,"uri":"v020336b0000bu3r87l6q7dhb8c2gl80","url_key":"v020336b0000bu3r87l6q7dhb8c2gl80_h264_540p_811715","url_list":["http://v5-dy-d.ixigua.com/f1172afbd9f3ea78ec1e92cd23227f28/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/dff5c7c62026e7c2dbaadbce10441614/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_lowbr":{"data_size":5643451,"file_hash":"715b935324e0ee954dfbdcd56f2ad4f9","height":720,"uri":"v020336b0000bu3r87l6q7dhb8c2gl80","url_key":"v020336b0000bu3r87l6q7dhb8c2gl80_h264_540p_811715","url_list":["http://v5-dy-d.ixigua.com/f1172afbd9f3ea78ec1e92cd23227f28/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/dff5c7c62026e7c2dbaadbce10441614/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"ratio":"540p","width":540},"video_control":{"allow_download":true,"allow_duet":true,"allow_dynamic_wallpaper":true,"allow_react":true,"draft_progress_bar":0,"prevent_download_type":0,"share_type":1,"show_progress_bar":1,"timer_status":1},"video_labels":null,"video_text":null,"vr_type":0,"with_promotional_music":false},{"ad_aweme_source":1,"anchors":null,"author":{"ad_cover_url":null,"avatar_168x168":{"height":720,"uri":"30ef60009ad7ef4cf1aab","url_list":["https://p3-dy-ipv6.byteimg.com/img/30ef60009ad7ef4cf1aab~c5_168x168.webp?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/30ef60009ad7ef4cf1aab~c5_168x168.webp?from=4010531038","https://p9-dy.byteimg.com/img/30ef60009ad7ef4cf1aab~c5_168x168.webp?from=4010531038"],"width":720},"avatar_300x300":{"height":720,"uri":"30ef60009ad7ef4cf1aab","url_list":["https://p3-dy-ipv6.byteimg.com/img/30ef60009ad7ef4cf1aab~c5_300x300.webp?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/30ef60009ad7ef4cf1aab~c5_300x300.webp?from=4010531038","https://p29-dy.byteimg.com/img/30ef60009ad7ef4cf1aab~c5_300x300.webp?from=4010531038"],"width":720},"avatar_medium":{"height":720,"uri":"30ef60009ad7ef4cf1aab","url_list":["https://p29-dy.byteimg.com/aweme/720x720/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/aweme/720x720/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/aweme/720x720/30ef60009ad7ef4cf1aab.jpeg?from=4010531038"],"width":720},"avatar_thumb":{"height":720,"uri":"30ef60009ad7ef4cf1aab","url_list":["https://p9-dy.byteimg.com/aweme/100x100/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/aweme/100x100/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p26-dy.byteimg.com/aweme/100x100/30ef60009ad7ef4cf1aab.jpeg?from=4010531038"],"width":720},"cha_list":null,"comment_filter_status":0,"comment_setting":0,"commerce_user_level":1,"cover_url":[{"height":720,"uri":"c8510002be9a3a61aad2","url_list":["https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085","https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085","https://p26-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085"],"width":720}],"custom_verify":"","download_setting":-1,"duet_setting":0,"enterprise_verify_reason":"小船出海教育科技（北京）有限公司","follow_status":0,"followers_detail":null,"geofencing":null,"hide_location":false,"is_ad_fake":false,"is_block":false,"is_gov_media_vip":false,"is_star":false,"is_verified":true,"item_list":null,"language":"zh-Hans","location":"","new_story_cover":null,"nickname":"作业帮直播课","platform_sync_info":null,"prevent_download":false,"region":"CN","relative_users":null,"room_id":0,"sec_uid":"MS4wLjABAAAABP8aCpHCq0Nyjny9vBMr_Ce78wef6RqtwI5EUm74guWV97ms9MggdL3kQGPJqjD4","secret":0,"short_id":"2788636813","signature":"名师有大招，解题更高效！","type_label":null,"uid":"4217337053714268","unique_id":"dyv28nsqcpq7","verification_type":0,"video_icon":{"height":720,"uri":"","url_list":null,"width":720},"with_commerce_entry":false},"author_user_id":4217337053714268,"aweme_control":{"can_comment":true,"can_forward":true,"can_share":true,"can_show_comment":true},"aweme_id":"6878581616382446862","aweme_type":0,"cha_list":null,"challenge_position":null,"cmt_swt":false,"collect_stat":0,"comment_list":null,"commerce_config_data":null,"commerce_info":{"avoid_global_pendant":true},"create_time":1601544590,"desc":"直播课上作业帮，好成绩有人帮。\n名师有大招，解题更高效。","desc_language":"un","distance":"","distribute_type":1,"duration":30047,"geofencing":null,"geofencing_regions":null,"group_id":"6878581616382446862","hybrid_label":null,"image_infos":null,"interaction_stickers":null,"is_ads":true,"is_fantasy":false,"is_hash_tag":1,"is_relieve":false,"is_top":0,"is_vr":false,"item_comment_settings":0,"item_duet":2,"item_react":2,"label_top_text":null,"long_video":null,"music":{"author":"作业帮直播课","author_deleted":false,"author_position":null,"avatar_large":{"height":720,"uri":"30ef60009ad7ef4cf1aab","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p26-dy.byteimg.com/aweme/1080x1080/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p29-dy.byteimg.com/aweme/1080x1080/30ef60009ad7ef4cf1aab.jpeg?from=4010531038"],"width":720},"avatar_medium":{"height":720,"uri":"30ef60009ad7ef4cf1aab","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/aweme/720x720/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p9-dy.byteimg.com/aweme/720x720/30ef60009ad7ef4cf1aab.jpeg?from=4010531038"],"width":720},"avatar_thumb":{"height":720,"uri":"30ef60009ad7ef4cf1aab","url_list":["https://p26-dy.byteimg.com/aweme/100x100/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p9-dy.byteimg.com/aweme/100x100/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/aweme/100x100/30ef60009ad7ef4cf1aab.jpeg?from=4010531038"],"width":720},"collect_stat":0,"cover_hd":{"height":720,"uri":"30ef60009ad7ef4cf1aab","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p26-dy.byteimg.com/aweme/1080x1080/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p29-dy.byteimg.com/aweme/1080x1080/30ef60009ad7ef4cf1aab.jpeg?from=4010531038"],"width":720},"cover_large":{"height":720,"uri":"30ef60009ad7ef4cf1aab","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p26-dy.byteimg.com/aweme/1080x1080/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p29-dy.byteimg.com/aweme/1080x1080/30ef60009ad7ef4cf1aab.jpeg?from=4010531038"],"width":720},"cover_medium":{"height":720,"uri":"30ef60009ad7ef4cf1aab","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/aweme/720x720/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p9-dy.byteimg.com/aweme/720x720/30ef60009ad7ef4cf1aab.jpeg?from=4010531038"],"width":720},"cover_thumb":{"height":720,"uri":"30ef60009ad7ef4cf1aab","url_list":["https://p26-dy.byteimg.com/aweme/100x100/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p9-dy.byteimg.com/aweme/100x100/30ef60009ad7ef4cf1aab.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/aweme/100x100/30ef60009ad7ef4cf1aab.jpeg?from=4010531038"],"width":720},"duration":30,"end_time":0,"external_song_info":null,"extra":"{\"reviewed\":0,\"beats\":{\"audio_effect_onset\":\"http://p9-dy.byteimg.com/obj/ies-music/strong_beat/v3/1680409492652043\",\"merged_beats\":\"http://p9-dy.byteimg.com/obj/ies-music/strong_beat/v3/1680409498771459\",\"beats_tracker\":\"http://p9-dy.byteimg.com/obj/ies-music/strong_beat/v3/1680409498716171\",\"energy_trace\":\"http://p9-dy.byteimg.com/obj/ies-music/strong_beat/v3/1680409492626435\"},\"douyin_beats_info\":{},\"schedule_search_time\":0,\"has_edited\":0}","id":6878581664902122247,"id_str":"6878581664902122247","is_del_video":false,"is_original":false,"is_video_self_see":false,"mid":"6878581664902122247","mute_share":false,"offline_desc":"","owner_handle":"dyv28nsqcpq7","owner_id":"4217337053714268","owner_nickname":"作业帮直播课","play_url":{"height":720,"uri":"http://p9-dy.byteimg.com/obj/ies-music/6878581637912431368.mp3","url_list":["http://p9-dy.byteimg.com/obj/ies-music/6878581637912431368.mp3","http://p1-dy.byteimg.com/obj/ies-music/6878581637912431368.mp3"],"width":720},"position":null,"prevent_download":false,"preview_end_time":0,"preview_start_time":0,"sec_uid":"MS4wLjABAAAABP8aCpHCq0Nyjny9vBMr_Ce78wef6RqtwI5EUm74guWV97ms9MggdL3kQGPJqjD4","source_platform":23,"start_time":0,"status":1,"title":"@作业帮直播课创作的原声","unshelve_countries":null},"nickname_position":null,"origin_comment_ids":null,"position":null,"prevent_download":false,"promotions":null,"rate":12,"raw_ad_data":{"ad_id":1679340582388755,"ad_tag_position":2,"animation_type":1,"avatar_url":"http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202010015d0ddef1a9ef24bd476e869f?from=ad","button_style":1,"button_text":"查看详情","click_track_url_list":{"uri":"","url_list":["https://e.cn.miaozhen.com/r/k=2197481&p=7gLmd&rt=2&pro=s&bd=c5f05f46ff22250ae8936f50fad1430c0c0ec28e41f6a9cc02f544b0116fc831&tr=202010151353530100140450800D5ADE59&ns=113.65.209.51&ro=sm&ls=23.1x113.4x100.0&vv=1&vo=38f2855ad&vr=2&o="]},"comment_area":{"avatar_icon":{"uri":"web.business.image/202010015d0ddef1a9ef24bd476e869f","url_list":["http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202010015d0ddef1a9ef24bd476e869f?from=ad","http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202010015d0ddef1a9ef24bd476e869f?from=ad","http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202010015d0ddef1a9ef24bd476e869f?from=ad"]},"button_text":"查看详情","comment_info":"直播课上作业帮，好成绩有人帮。\n名师有大招，解题更高效。","comment_nickname":"直播课上作业帮","comment_time":1602691200,"show_button_number":10,"source":"直播课上作业帮","title":"直播课上作业帮，好成绩有人帮。\n名师有大招，解题更高效。"},"comment_area_switch":true,"creative_id":1679340014029870,"disable_show_ad_link":true,"dislike":{"dislike_url":"https://aweme.snssdk.com/falcon/fe_douyin_ad_react/pages/ad_push?hide_nav_bar=1&enter_type=normal_ad","label_clickable":true,"name":"为什么看到此广告"},"effective_play_time":0,"group_id":6878581616382446862,"is_preview":false,"is_real_author":true,"label":{"color":"#14FFFFFF","color_text":"#7FFFFFFF","text":"广告","type":4},"learn_more_bg_color":"#00CC1B","log_extra":"{\"ad_id\":1679340582388755,\"awesome_splash_ad_id\":1679318605884471,\"bdid\":\"c5f05f46ff22250ae8936f50fad1430c0c0ec28e41f6a9cc02f544b0116fc831\",\"card_id\":0,\"city_id_brand\":440100,\"clickid\":\"EK6Y-Yed6_0CGIv17-fkASCqrLqgigIwDDiHuQJCIjIwMjAxMDE1MTM1MzUzMDEwMDE0MDQ1MDgwMEQ1QURFNTlIwbgC\",\"component_ids\":[8,9,13,38],\"convert_component_suspend\":0,\"convert_id\":0,\"first_splash_show\":0,\"hyrule_atype\":[],\"is_pack_v2\":true,\"orit\":40001,\"placement\":\"unknown\",\"req_id\":\"202010151353530100140450800D5ADE59\",\"rit\":40071,\"style_id\":4916,\"style_ids\":[4916],\"vid\":\"2079428,2074568,2064649,2081276,2041701,2041459,1864404,2069662,1967211,1702641,2070764,2059243,1999155,1363731,2092715,2062059,2093658,1630376,1721662,1863628,2063942,1502561,1915686,1686911,2054037,1872498,2027856,1759136,1559151,2096444,2090536,2052595,2062498,1919713,1973593,1371807,1999048,2086383,2028546,2034339,1649432,1711118,1962348,1877132,1914588,1931512,1802606,2025882,2066364,1938274,2092417,1921551,2016804,946599,1548386,2050186,2027582,1933509,1856457,2092195,2049970,1847189,2040780,2071677,1922032,2063387,2070881,2076365,1854881,1769935,1954115,2090902,2093760,1287775,1996411,1788822,2021604,2064701,2000602,2008178,2018110,1957537,2023863,2052902,1927617,2094615,2023838,1858797,2088124,1987817,2048550,2018926,372442,1999041,1586303,1803849,2034508,2086488,2068621,2094079,1409057,2063908,2067123,2094908,1477639,2095792,2085127,1973466,2026313,2014223,1733176,2057867,2068693,1781885,2055606,2037300,2061818,2088045,2084493,2090256,2096049,930218,1918567,2046182,2082475,2072686,2057475,1437737,1756367,2045135,2095700,2093055,1993503,2000177,2087540,2078193,1766311,1878449,1316532,2091517,1935100,2093673,1737179,692246,2090887,1675203,2044708,2083838,2021605,2047962,2070478,2091788,2056525,2095801,2091927,1689196,2071632,1634350,2072814,2047011,1936545,1749597,2088469,2057733,1745311,2062715,1684045,1748501,2039491,2090772,1980930,2084199,2048617,1861459,2086266,1992558,2086194,1771997,1668718,2080462,1997876,1442946,2094992,1477989,2066329,1974358,2071124,2090171,1929739,2085714,2000632,2078630,1978885,1983665,1878838,2093641,2087284,1961262,1890594,1998351,2095632,1965398,2051212,2074195,1350814,2085477,1952286,1960178,1943882,1898634,2092921,2079151,2091242,2033160,1988991,2092012,1776768,2042434,1709892,1287465,2080498,2085742,2079981,1475013,1540878,2090104,1908320,2053237,2095288,2092020,2093098,1934496,1965093,2031019,1966493,2093228,2079819,2048628,2083576,2086431,2088594,2095698,1527915,1271269,1910043,2037655,2021040,1569140,2040028,2085732,1317390,2045492,2046513,1732302,1284629,2073272,2079286,2043248,2082042,1304704,1919592,1922933,2085501,1662487,1851215,1887734,2092581,1383003,1880555,1725914,2078595,1657760,2096370,1858015,1589053,2086239,2095283,1771198,2082555,1871664,1990026,2035361,2070465,1507330,2078510,2088585,2074398,2023880,1856670,2093131,1278726,2051829,1902568,1921096,2037087,1793443,2089586,2075114,1993411,2090709,2023025,2007076,2080265,1778383,2007337,1771808,2092216,1980052,2072392,1978032,2049621,2073894,1737464,1865396,2081975,2085543,1960528,2094847,2094897,2076230,2090738,2070134,1471649,2047164,2096209,2064909,1961981,1966142,2056262,1978083,2062386,1901648,2089428,1566627,1716918,2079588,2009486,2084360,2038247,1447419,2086078,1741207,2007565,2050607,1683123,1995036,2056756,2081111,1965624,2063746,1329106,2087008,2067369,2094981,2082996,1938812,2090649,2095731,2049730,2014042,1856698,2062848,1960098,1630402,1997199,1563866,2046484,2047176,2056486,1553292,2066097,2078548,2048549,1852086,2092463,2020692,2094891,2087366,2028317,2088196,1909913,2076736,1551584,2064014,1710080,1937601,1333775,2066696,1856545,1648176,2095255,2063672,1745643,2058525,2034060,2081927,1880623,2071181,2045489,2085667,2019195,1894146,2064668,1974198,2038604,2032352,1498261,2065976,1550413,2045824,2087242,2045179,2087291,1368035,2068060,2079679,2045544,1952297,2045877,2046550,2092618,1527621,2096386,2063571,2062385,2046488,2062052,2047049,2047031,2045496,2053655,2086241,2080527\"}","report_enable":true,"show_button_seconds":6,"show_mask_times":2,"source":"直播课上作业帮","splash_info":{"awesome_splash_id":"1679318605884471","enable_splash_open":true,"end_time":1602777600,"hot_show_type":1,"predownload_text":"已预加载","preload_size":810,"skip_info":{"background_color":"#34000000","countdown_unit":"","text":"跳过广告","text_color":"#FFFFFFFF"},"splash_show_time":3000},"title":"直播课上作业帮，好成绩有人帮。\n名师有大招，解题更高效。","track_url_list":{"uri":"","url_list":["https://g.cn.miaozhen.com/x/k=2197481&p=7gLmd&rt=2&pro=s&bd=c5f05f46ff22250ae8936f50fad1430c0c0ec28e41f6a9cc02f544b0116fc831&tr=202010151353530100140450800D5ADE59&ns=113.65.209.51&ls=23.1x113.4x100.0&vv=1&o="]},"type":"web","use_ordinary_web":true,"video_transpose":0,"web_title":"直播课上作业帮","web_url":"https://www.zuoyebang.com/static/hy/cornucopia/81h0qxq2.html?lastfrom=ykpptg_pptg_dy_sxxcgdx30zxn_01"},"region":"","share_info":{"bool_persist":0,"share_desc":"在抖音，记录美好生活","share_link_desc":"直播课上作业帮，好成绩有人帮。\n名师有大招，解题更高效。 %s 复制此链接，打开【抖音短视频】，直接观看视频！","share_quote":"","share_title":"直播课上作业帮，好成绩有人帮。\n名师有大招，解题更高效。","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/video/6878581616382446862/?region=CN&mid=6878581664902122247&u_code=i0kji679&titleType=title","share_weibo_desc":"#在抖音，记录美好生活#直播课上作业帮，好成绩有人帮。\n名师有大招，解题更高效。"},"share_url":"https://www.iesdouyin.com/share/video/6878581616382446862/?region=CN&mid=6878581664902122247&u_code=i0kji679&titleType=title","statistics":{"aweme_id":"6878581616382446862","comment_count":1504,"digg_count":35906,"download_count":807,"forward_count":0,"lose_comment_count":0,"lose_count":0,"play_count":0,"share_count":965},"status":{"allow_comment":true,"allow_share":true,"aweme_id":"6878581616382446862","download_status":0,"in_reviewing":false,"is_delete":false,"is_private":false,"is_prohibited":false,"private_status":0,"reviewed":1,"self_see":false,"with_fusion_goods":false,"with_goods":false},"text_extra":[],"uniqid_position":null,"user_digged":0,"video":{"big_thumbs":null,"bit_rate":[{"bit_rate":384798,"gear_name":"adapt_540","is_bytevc1":1,"is_h265":1,"play_addr":{"data_size":1445255,"file_cs":"c:0-26669-bb25","file_hash":"a07000222a7019c90cd07e1565959f11","height":720,"uri":"v02033400000btqprdt4mkgrfo530idg","url_key":"v02033400000btqprdt4mkgrfo530idg_bytevc1_540p_384798","url_list":["http://v5-dy-d.ixigua.com/3176637a0c35411d4f364d8d5285b3d3/5f87f220/video/tos/cn/tos-cn-ve-51/8c4b08a122674f82a48b9e903995336e/?a=1128&br=1500&bt=375&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=amw2cnVuN2dzdzMzMzYzM0ApNjlmZWQ5ZTs0NzU7ZjVpZ2dhLTJjZGpxb25fLS0xMC9zc2BfLl4tXi0zMzBeYzZiMDE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/54831ea6a26408e0b31e53f8b50cce16/5f87f220/video/tos/cn/tos-cn-ve-51/8c4b08a122674f82a48b9e903995336e/?a=1128&br=1500&bt=375&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=amw2cnVuN2dzdzMzMzYzM0ApNjlmZWQ5ZTs0NzU7ZjVpZ2dhLTJjZGpxb25fLS0xMC9zc2BfLl4tXi0zMzBeYzZiMDE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033400000btqprdt4mkgrfo530idg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033400000btqprdt4mkgrfo530idg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":1445255,"file_cs":"c:0-26669-bb25","file_hash":"a07000222a7019c90cd07e1565959f11","height":720,"uri":"v02033400000btqprdt4mkgrfo530idg","url_key":"v02033400000btqprdt4mkgrfo530idg_bytevc1_540p_384798","url_list":["http://v5-dy-d.ixigua.com/3176637a0c35411d4f364d8d5285b3d3/5f87f220/video/tos/cn/tos-cn-ve-51/8c4b08a122674f82a48b9e903995336e/?a=1128&br=1500&bt=375&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=amw2cnVuN2dzdzMzMzYzM0ApNjlmZWQ5ZTs0NzU7ZjVpZ2dhLTJjZGpxb25fLS0xMC9zc2BfLl4tXi0zMzBeYzZiMDE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/54831ea6a26408e0b31e53f8b50cce16/5f87f220/video/tos/cn/tos-cn-ve-51/8c4b08a122674f82a48b9e903995336e/?a=1128&br=1500&bt=375&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=amw2cnVuN2dzdzMzMzYzM0ApNjlmZWQ5ZTs0NzU7ZjVpZ2dhLTJjZGpxb25fLS0xMC9zc2BfLl4tXi0zMzBeYzZiMDE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033400000btqprdt4mkgrfo530idg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033400000btqprdt4mkgrfo530idg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"quality_type":28}],"cdn_url_expired":0,"cover":{"height":720,"uri":"large/34e52001045fea8a2db18","url_list":["http://p26-dy.byteimg.com/large/34e52001045fea8a2db18.jpeg?from=2502468085_large","http://p9-dy.byteimg.com/large/34e52001045fea8a2db18.jpeg?from=2502468085_large","http://p6-dy-ipv6.byteimg.com/large/34e52001045fea8a2db18.jpeg?from=2502468085_large"],"width":720},"download_addr":{"data_size":2074819,"height":720,"uri":"v02033400000btqprdt4mkgrfo530idg","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033400000btqprdt4mkgrfo530idg&line=0&ratio=540p&watermark=0&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033400000btqprdt4mkgrfo530idg&line=1&ratio=540p&watermark=0&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"duration":30047,"dynamic_cover":{"height":720,"uri":"large/34e52001045fea8a2db18","url_list":["http://p26-dy.byteimg.com/large/34e52001045fea8a2db18.jpeg?from=2502468085_large","http://p9-dy.byteimg.com/large/34e52001045fea8a2db18.jpeg?from=2502468085_large","http://p6-dy-ipv6.byteimg.com/large/34e52001045fea8a2db18.jpeg?from=2502468085_large"],"width":720},"has_watermark":false,"height":960,"is_bytevc1":0,"is_h265":0,"origin_cover":{"height":720,"uri":"large/34e52001045fea8a2db18","url_list":["http://p29-dy.byteimg.com/large/34e52001045fea8a2db18.jpeg?from=2502468085_large","http://p26-dy.byteimg.com/large/34e52001045fea8a2db18.jpeg?from=2502468085_large","http://p3-dy-ipv6.byteimg.com/large/34e52001045fea8a2db18.jpeg?from=2502468085_large"],"width":720},"play_addr":{"data_size":2074819,"file_hash":"32b653788b805699c34ef7c39ab9074a","height":720,"uri":"v02033400000btqprdt4mkgrfo530idg","url_key":"v02033400000btqprdt4mkgrfo530idg_h264_540p_552419","url_list":["http://v5-dy-d.ixigua.com/f431823306dd8e65a5a2428d7dfb7d70/5f87f220/video/tos/cn/tos-cn-ve-51/dc5d3c7fea3c473790ac7a8f5dba8c38/?a=1128&br=1617&bt=539&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=amw2cnVuN2dzdzMzMzYzM0ApODw3MzM6OjtkN2U5OjxnOmdhLTJjZGpxb25fLS0xMC9zczIwMS8tY2JiYzIzLmAtNWE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/efb9f3d03022b91941c8bae94ba04979/5f87f220/video/tos/cn/tos-cn-ve-51/dc5d3c7fea3c473790ac7a8f5dba8c38/?a=1128&br=1617&bt=539&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=amw2cnVuN2dzdzMzMzYzM0ApODw3MzM6OjtkN2U5OjxnOmdhLTJjZGpxb25fLS0xMC9zczIwMS8tY2JiYzIzLmAtNWE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033400000btqprdt4mkgrfo530idg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033400000btqprdt4mkgrfo530idg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":1445255,"file_cs":"c:0-26669-bb25","file_hash":"a07000222a7019c90cd07e1565959f11","height":720,"uri":"v02033400000btqprdt4mkgrfo530idg","url_key":"v02033400000btqprdt4mkgrfo530idg_bytevc1_540p_384798","url_list":["http://v5-dy-d.ixigua.com/3176637a0c35411d4f364d8d5285b3d3/5f87f220/video/tos/cn/tos-cn-ve-51/8c4b08a122674f82a48b9e903995336e/?a=1128&br=1500&bt=375&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=amw2cnVuN2dzdzMzMzYzM0ApNjlmZWQ5ZTs0NzU7ZjVpZ2dhLTJjZGpxb25fLS0xMC9zc2BfLl4tXi0zMzBeYzZiMDE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/54831ea6a26408e0b31e53f8b50cce16/5f87f220/video/tos/cn/tos-cn-ve-51/8c4b08a122674f82a48b9e903995336e/?a=1128&br=1500&bt=375&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=amw2cnVuN2dzdzMzMzYzM0ApNjlmZWQ5ZTs0NzU7ZjVpZ2dhLTJjZGpxb25fLS0xMC9zc2BfLl4tXi0zMzBeYzZiMDE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033400000btqprdt4mkgrfo530idg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033400000btqprdt4mkgrfo530idg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_h264":{"data_size":2074819,"height":720,"uri":"v02033400000btqprdt4mkgrfo530idg","url_key":"v02033400000btqprdt4mkgrfo530idg_h264_540p_552419","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033400000btqprdt4mkgrfo530idg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033400000btqprdt4mkgrfo530idg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"play_addr_lowbr":{"data_size":2074819,"file_hash":"32b653788b805699c34ef7c39ab9074a","height":720,"uri":"v02033400000btqprdt4mkgrfo530idg","url_key":"v02033400000btqprdt4mkgrfo530idg_h264_540p_552419","url_list":["http://v5-dy-d.ixigua.com/f431823306dd8e65a5a2428d7dfb7d70/5f87f220/video/tos/cn/tos-cn-ve-51/dc5d3c7fea3c473790ac7a8f5dba8c38/?a=1128&br=1617&bt=539&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=amw2cnVuN2dzdzMzMzYzM0ApODw3MzM6OjtkN2U5OjxnOmdhLTJjZGpxb25fLS0xMC9zczIwMS8tY2JiYzIzLmAtNWE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/efb9f3d03022b91941c8bae94ba04979/5f87f220/video/tos/cn/tos-cn-ve-51/dc5d3c7fea3c473790ac7a8f5dba8c38/?a=1128&br=1617&bt=539&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=amw2cnVuN2dzdzMzMzYzM0ApODw3MzM6OjtkN2U5OjxnOmdhLTJjZGpxb25fLS0xMC9zczIwMS8tY2JiYzIzLmAtNWE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033400000btqprdt4mkgrfo530idg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033400000btqprdt4mkgrfo530idg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"ratio":"540p","width":540},"video_control":{"allow_download":true,"allow_duet":true,"allow_dynamic_wallpaper":true,"allow_react":true,"draft_progress_bar":0,"prevent_download_type":0,"share_type":1,"show_progress_bar":1,"timer_status":1},"video_labels":null,"video_text":null,"vr_type":0,"with_promotional_music":false},{"ad_aweme_source":1,"anchors":null,"author":{"ad_cover_url":null,"avatar_168x168":{"height":720,"uri":"tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973","url_list":["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_168x168.webp?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_168x168.webp?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_168x168.webp?from=4010531038"],"width":720},"avatar_300x300":{"height":720,"uri":"tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973","url_list":["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_300x300.webp?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_300x300.webp?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_300x300.webp?from=4010531038"],"width":720},"avatar_medium":{"height":720,"uri":"tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973","url_list":["https://p9-dy.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_720x720.jpeg?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_720x720.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_720x720.jpeg?from=4010531038"],"width":720},"avatar_thumb":{"height":720,"uri":"tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973","url_list":["https://p26-dy.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_100x100.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_100x100.jpeg?from=4010531038","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_100x100.jpeg?from=4010531038"],"width":720},"cha_list":null,"comment_filter_status":0,"comment_setting":0,"commerce_user_level":1,"cover_url":[{"height":720,"uri":"c8510002be9a3a61aad2","url_list":["https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085","https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085","https://p6-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085"],"width":720}],"custom_verify":"","download_setting":-1,"duet_setting":0,"enterprise_verify_reason":"抖音美好奇妙夜官方账号","follow_status":0,"followers_detail":null,"geofencing":null,"hide_location":false,"is_ad_fake":false,"is_block":false,"is_gov_media_vip":false,"is_star":false,"is_verified":true,"item_list":null,"language":"zh-Hans","location":"","new_story_cover":null,"nickname":"抖音美好奇妙夜","platform_sync_info":null,"prevent_download":false,"region":"CN","relative_users":null,"room_id":0,"sec_uid":"MS4wLjABAAAAE7NqYnPDSxDc-jQWO3wfJNruGzTOVHLpceZUOLN4f74","secret":0,"short_id":"1530453486","signature":"2020抖音美好奇妙夜10月16日震撼来袭！世界有你更美好，让我们一起期待美好降临吧！","type_label":null,"uid":"101531655586","unique_id":"","verification_type":0,"video_icon":{"height":720,"uri":"","url_list":null,"width":720},"with_commerce_entry":false},"author_user_id":101531655586,"aweme_control":{"can_comment":true,"can_forward":true,"can_share":true,"can_show_comment":true},"aweme_id":"6880835009763118350","aweme_type":0,"cha_list":[{"author":{"ad_cover_url":null,"cha_list":null,"cover_url":null,"followers_detail":null,"geofencing":null,"item_list":null,"new_story_cover":null,"platform_sync_info":null,"relative_users":null,"type_label":null},"cha_attrs":null,"cha_name":"抖音美好奇妙夜1016","cid":"1678442384457736","collect_stat":0,"connect_music":null,"desc":"","is_challenge":0,"is_commerce":false,"schema":"aweme://aweme/challenge/detail?cid=1678442384457736","type":0,"user_count":0,"view_count":0}],"challenge_position":null,"cmt_swt":false,"collect_stat":0,"comment_list":null,"commerce_config_data":null,"commerce_info":{"avoid_global_pendant":true},"create_time":1602069251,"desc":"每一个热爱生活的你都拥有奇妙的舞台。10.16晚8点，上浙江卫视看 #抖音美好奇妙夜1016 ，更多惊喜等着你","desc_language":"un","distance":"","distribute_type":1,"duration":30020,"geofencing":null,"geofencing_regions":null,"group_id":"6880835009763118350","hybrid_label":null,"image_infos":null,"interaction_stickers":null,"is_ads":true,"is_fantasy":false,"is_hash_tag":1,"is_relieve":false,"is_top":0,"is_vr":false,"item_comment_settings":0,"item_duet":2,"item_react":2,"label_top_text":null,"long_video":null,"music":{"author":"抖音美好奇妙夜","author_deleted":false,"author_position":null,"avatar_large":{"height":720,"uri":"tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_1080x1080.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_1080x1080.jpeg?from=4010531038"],"width":720},"avatar_medium":{"height":720,"uri":"tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973","url_list":["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_720x720.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_720x720.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_720x720.jpeg?from=4010531038"],"width":720},"avatar_thumb":{"height":720,"uri":"tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973","url_list":["https://p26-dy.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_100x100.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_100x100.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_100x100.jpeg?from=4010531038"],"width":720},"collect_stat":0,"cover_hd":{"height":720,"uri":"tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_1080x1080.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_1080x1080.jpeg?from=4010531038"],"width":720},"cover_large":{"height":720,"uri":"tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_1080x1080.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_1080x1080.jpeg?from=4010531038"],"width":720},"cover_medium":{"height":720,"uri":"tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973","url_list":["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_720x720.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_720x720.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_720x720.jpeg?from=4010531038"],"width":720},"cover_thumb":{"height":720,"uri":"tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973","url_list":["https://p26-dy.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_100x100.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_100x100.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/a6fc8d4b9228bca2797fe725cd298973~c5_100x100.jpeg?from=4010531038"],"width":720},"duration":30,"end_time":0,"external_song_info":null,"extra":"{\"has_edited\":0,\"reviewed\":0,\"beats\":{\"audio_effect_onset\":\"http://p9-dy.byteimg.com/obj/ies-music/strong_beat/v3/1680045942821892\",\"merged_beats\":\"http://p9-dy.byteimg.com/obj/ies-music/strong_beat/v3/1680045948815364\",\"beats_tracker\":\"http://p9-dy.byteimg.com/obj/ies-music/strong_beat/v3/1680045948779531\",\"energy_trace\":\"http://p1-dy.byteimg.com/obj/ies-music/strong_beat/v3/1680045942791179\"},\"douyin_beats_info\":{},\"schedule_search_time\":0}","id":6880835058628430600,"id_str":"6880835058628430600","is_del_video":false,"is_original":false,"is_video_self_see":false,"mid":"6880835058628430600","mute_share":false,"offline_desc":"","owner_handle":"1530453486","owner_id":"101531655586","owner_nickname":"抖音美好奇妙夜","play_url":{"height":720,"uri":"http://p1-dy.byteimg.com/obj/ies-music/6880835027933154061.mp3","url_list":["http://p1-dy.byteimg.com/obj/ies-music/6880835027933154061.mp3","http://p9-dy.byteimg.com/obj/ies-music/6880835027933154061.mp3"],"width":720},"position":null,"prevent_download":false,"preview_end_time":0,"preview_start_time":0,"sec_uid":"MS4wLjABAAAAE7NqYnPDSxDc-jQWO3wfJNruGzTOVHLpceZUOLN4f74","source_platform":23,"start_time":0,"status":1,"title":"@抖音美好奇妙夜创作的原声","unshelve_countries":null},"nickname_position":null,"origin_comment_ids":null,"position":null,"prevent_download":false,"promotions":null,"rate":12,"raw_ad_data":{"ad_id":1680343159978039,"ad_tag_position":2,"animation_type":1,"avatar_url":"http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202010125d0d9d3c86e5e1e846e38ba8?from=ad","button_style":1,"button_text":"查看详情","click_track_url_list":{"uri":"","url_list":[]},"comment_area":{"avatar_icon":{"uri":"web.business.image/202010125d0d9d3c86e5e1e846e38ba8","url_list":["http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202010125d0d9d3c86e5e1e846e38ba8?from=ad","http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202010125d0d9d3c86e5e1e846e38ba8?from=ad","http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202010125d0d9d3c86e5e1e846e38ba8?from=ad"]},"button_text":"查看详情","comment_info":"每一个热爱生活的你都拥有奇妙的舞台。10.16晚8点，上浙江卫视看 #抖音美好奇妙夜1016 ，更多惊喜等着你","comment_nickname":"抖音美好奇妙夜","comment_time":1602691200,"show_button_number":10,"source":"抖音美好奇妙夜","title":"每一个热爱生活的你都拥有奇妙的舞台。10.16晚8点，上浙江卫视看 #抖音美好奇妙夜1016 ，更多惊喜等着你"},"comment_area_switch":true,"creative_id":1680343977168941,"disable_show_ad_link":true,"dislike":{"dislike_url":"https://aweme.snssdk.com/falcon/fe_douyin_ad_react/pages/ad_push?hide_nav_bar=1&enter_type=normal_ad","label_clickable":true,"name":"为什么看到此广告"},"effective_play_time":0,"group_id":6880835009763118350,"is_preview":false,"is_real_author":true,"label":{"color":"#14FFFFFF","color_text":"#7FFFFFFF","text":"广告","type":4},"learn_more_bg_color":"#8A2EE6","log_extra":"{\"ad_id\":1680343159978039,\"awesome_splash_ad_id\":1680332423347224,\"bdid\":\"6194f0885a2c0744ba11ae4ccf3ef6a2db3136071d83436c754feb0e90739278\",\"card_id\":0,\"city_id_brand\":440100,\"clickid\":\"EK2g8I65iP4CGIv17-fkASCqrLqgigIwDDiHuQJCIjIwMjAxMDE1MTM1MzUzMDEwMDE0MDQ1MDgwMEQ1QURFNTlIwbgC\",\"component_ids\":[8,9,13,38],\"convert_component_suspend\":0,\"convert_id\":0,\"first_splash_show\":0,\"hyrule_atype\":[],\"is_pack_v2\":true,\"orit\":40001,\"placement\":\"unknown\",\"req_id\":\"202010151353530100140450800D5ADE59\",\"rit\":40071,\"style_id\":4916,\"style_ids\":[4916],\"vid\":\"2079428,2074568,2064649,2081276,2041701,2041459,1864404,2069662,1967211,1702641,2070764,2059243,1999155,1363731,2092715,2062059,2093658,1630376,1721662,1863628,2063942,1502561,1915686,1686911,2054037,1872498,2027856,1759136,1559151,2096444,2090536,2052595,2062498,1919713,1973593,1371807,1999048,2086383,2028546,2034339,1649432,1711118,1962348,1877132,1914588,1931512,1802606,2025882,2066364,1938274,2092417,1921551,2016804,946599,1548386,2050186,2027582,1933509,1856457,2092195,2049970,1847189,2040780,2071677,1922032,2063387,2070881,2076365,1854881,1769935,1954115,2090902,2093760,1287775,1996411,1788822,2021604,2064701,2000602,2008178,2018110,1957537,2023863,2052902,1927617,2094615,2023838,1858797,2088124,1987817,2048550,2018926,372442,1999041,1586303,1803849,2034508,2086488,2068621,2094079,1409057,2063908,2067123,2094908,1477639,2095792,2085127,1973466,2026313,2014223,1733176,2057867,2068693,1781885,2055606,2037300,2061818,2088045,2084493,2090256,2096049,930218,1918567,2046182,2082475,2072686,2057475,1437737,1756367,2045135,2095700,2093055,1993503,2000177,2087540,2078193,1766311,1878449,1316532,2091517,1935100,2093673,1737179,692246,2090887,1675203,2044708,2083838,2021605,2047962,2070478,2091788,2056525,2095801,2091927,1689196,2071632,1634350,2072814,2047011,1936545,1749597,2088469,2057733,1745311,2062715,1684045,1748501,2039491,2090772,1980930,2084199,2048617,1861459,2086266,1992558,2086194,1771997,1668718,2080462,1997876,1442946,2094992,1477989,2066329,1974358,2071124,2090171,1929739,2085714,2000632,2078630,1978885,1983665,1878838,2093641,2087284,1961262,1890594,1998351,2095632,1965398,2051212,2074195,1350814,2085477,1952286,1960178,1943882,1898634,2092921,2079151,2091242,2033160,1988991,2092012,1776768,2042434,1709892,1287465,2080498,2085742,2079981,1475013,1540878,2090104,1908320,2053237,2095288,2092020,2093098,1934496,1965093,2031019,1966493,2093228,2079819,2048628,2083576,2086431,2088594,2095698,1527915,1271269,1910043,2037655,2021040,1569140,2040028,2085732,1317390,2045492,2046513,1732302,1284629,2073272,2079286,2043248,2082042,1304704,1919592,1922933,2085501,1662487,1851215,1887734,2092581,1383003,1880555,1725914,2078595,1657760,2096370,1858015,1589053,2086239,2095283,1771198,2082555,1871664,1990026,2035361,2070465,1507330,2078510,2088585,2074398,2023880,1856670,2093131,1278726,2051829,1902568,1921096,2037087,1793443,2089586,2075114,1993411,2090709,2023025,2007076,2080265,1778383,2007337,1771808,2092216,1980052,2072392,1978032,2049621,2073894,1737464,1865396,2081975,2085543,1960528,2094847,2094897,2076230,2090738,2070134,1471649,2047164,2096209,2064909,1961981,1966142,2056262,1978083,2062386,1901648,2089428,1566627,1716918,2079588,2009486,2084360,2038247,1447419,2086078,1741207,2007565,2050607,1683123,1995036,2056756,2081111,1965624,2063746,1329106,2087008,2067369,2094981,2082996,1938812,2090649,2095731,2049730,2014042,1856698,2062848,1960098,1630402,1997199,1563866,2046484,2047176,2056486,1553292,2066097,2078548,2048549,1852086,2092463,2020692,2094891,2087366,2028317,2088196,1909913,2076736,1551584,2064014,1710080,1937601,1333775,2066696,1856545,1648176,2095255,2063672,1745643,2058525,2034060,2081927,1880623,2071181,2045489,2085667,2019195,1894146,2064668,1974198,2038604,2032352,1498261,2065976,1550413,2045824,2087242,2045179,2087291,1368035,2068060,2079679,2045544,1952297,2045877,2046550,2092618,1527621,2096386,2063571,2062385,2046488,2062052,2047049,2047031,2045496,2053655,2086241,2080527\"}","report_enable":true,"show_button_seconds":6,"show_mask_times":2,"source":"抖音美好奇妙夜","splash_info":{"awesome_splash_id":"1680332423347224","enable_splash_open":true,"end_time":1602777600,"hot_show_type":1,"predownload_text":"已预加载","preload_size":810,"skip_info":{"background_color":"#34000000","countdown_unit":"","text":"跳过广告","text_color":"#FFFFFFFF"},"splash_show_time":3000},"title":"每一个热爱生活的你都拥有奇妙的舞台。10.16晚8点，上浙江卫视看 #抖音美好奇妙夜1016 ，更多惊喜等着你","track_url_list":{"uri":"","url_list":[]},"type":"web","use_ordinary_web":true,"video_transpose":0,"web_title":"抖音美好奇妙夜","web_url":"https://s3.bytecdn.cn/ies/venus/webcast_activity/douyin/d2020/main_h5/index.html?__live_platform__=webcast&schema_type=11&is_full_screen=true&hide_nav_bar=1&enter_from_merge=top_view&web_bg_color=%23ff1d1754&hide_status_bar=1"},"region":"","share_info":{"bool_persist":0,"share_desc":"在抖音，记录美好生活","share_link_desc":"每一个热爱生活的你都拥有奇妙的舞台。10.16晚8点，上浙江卫视看 #抖音美好奇妙夜1016 ，更多惊喜等着你 %s 复制此链接，打开【抖音短视频】，直接观看视频！","share_quote":"","share_title":"每一个热爱生活的你都拥有奇妙的舞台。10.16晚8点，上浙江卫视看 #抖音美好奇妙夜1016 ，更多惊喜等着你","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/video/6880835009763118350/?region=CN&mid=6880835058628430600&u_code=i0kji679&titleType=title","share_weibo_desc":"#在抖音，记录美好生活#每一个热爱生活的你都拥有奇妙的舞台。10.16晚8点，上浙江卫视看 #抖音美好奇妙夜1016 ，更多惊喜等着你"},"share_url":"https://www.iesdouyin.com/share/video/6880835009763118350/?region=CN&mid=6880835058628430600&u_code=i0kji679&titleType=title","statistics":{"aweme_id":"6880835009763118350","comment_count":1112,"digg_count":48686,"download_count":706,"forward_count":0,"lose_comment_count":0,"lose_count":0,"play_count":0,"share_count":1040},"status":{"allow_comment":true,"allow_share":true,"aweme_id":"6880835009763118350","download_status":0,"in_reviewing":false,"is_delete":false,"is_private":false,"is_prohibited":false,"private_status":0,"reviewed":1,"self_see":false,"with_fusion_goods":false,"with_goods":false},"text_extra":[{"end":46,"hashtag_id":"1678442384457736","hashtag_name":"抖音美好奇妙夜1016","is_commerce":false,"start":34,"type":1}],"uniqid_position":null,"user_digged":0,"video":{"big_thumbs":null,"bit_rate":[{"bit_rate":783180,"gear_name":"adapt_lowest_720","is_bytevc1":1,"is_h265":1,"play_addr":{"data_size":2938884,"file_cs":"c:0-26685-0240","file_hash":"c22a1f596f5db2fc1b42f0f342c62ac4","height":720,"uri":"v02033de0000btuq46lghc84bdg5js80","url_key":"v02033de0000btuq46lghc84bdg5js80_bytevc1_720p_783180","url_list":["http://v5-dy-d.ixigua.com/b7e32bfa001667a8fea38a55c9ad5620/5f87f220/video/tos/cn/tos-cn-ve-51/09c4991a68be483a8919423abef7d873/?a=1128&br=2292&bt=764&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=M3Y4Zzdmajl0dzMzaDYzM0ApPGRnPGQzNGVlN2ZkNGQ4aWc1Z2RfNWVpMXJfLS1hMC9zczQwYDUxLmIzLl42L2E0NV46Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/1ef28b5eb579a3665c6b09c509e9fdd4/5f87f220/video/tos/cn/tos-cn-ve-51/09c4991a68be483a8919423abef7d873/?a=1128&br=2292&bt=764&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=M3Y4Zzdmajl0dzMzaDYzM0ApPGRnPGQzNGVlN2ZkNGQ4aWc1Z2RfNWVpMXJfLS1hMC9zczQwYDUxLmIzLl42L2E0NV46Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033de0000btuq46lghc84bdg5js80&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033de0000btuq46lghc84bdg5js80&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":2938884,"file_cs":"c:0-26685-0240","file_hash":"c22a1f596f5db2fc1b42f0f342c62ac4","height":720,"uri":"v02033de0000btuq46lghc84bdg5js80","url_key":"v02033de0000btuq46lghc84bdg5js80_bytevc1_720p_783180","url_list":["http://v5-dy-d.ixigua.com/b7e32bfa001667a8fea38a55c9ad5620/5f87f220/video/tos/cn/tos-cn-ve-51/09c4991a68be483a8919423abef7d873/?a=1128&br=2292&bt=764&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=M3Y4Zzdmajl0dzMzaDYzM0ApPGRnPGQzNGVlN2ZkNGQ4aWc1Z2RfNWVpMXJfLS1hMC9zczQwYDUxLmIzLl42L2E0NV46Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/1ef28b5eb579a3665c6b09c509e9fdd4/5f87f220/video/tos/cn/tos-cn-ve-51/09c4991a68be483a8919423abef7d873/?a=1128&br=2292&bt=764&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=M3Y4Zzdmajl0dzMzaDYzM0ApPGRnPGQzNGVlN2ZkNGQ4aWc1Z2RfNWVpMXJfLS1hMC9zczQwYDUxLmIzLl42L2E0NV46Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033de0000btuq46lghc84bdg5js80&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033de0000btuq46lghc84bdg5js80&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"quality_type":15}],"cdn_url_expired":0,"cover":{"height":720,"uri":"large/34169000f79578f740da7","url_list":["http://p29-dy.byteimg.com/large/34169000f79578f740da7.jpeg?from=2502468085_large","http://p26-dy.byteimg.com/large/34169000f79578f740da7.jpeg?from=2502468085_large","http://p9-dy.byteimg.com/large/34169000f79578f740da7.jpeg?from=2502468085_large"],"width":720},"download_addr":{"data_size":8929855,"height":720,"uri":"v02033de0000btuq46lghc84bdg5js80","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033de0000btuq46lghc84bdg5js80&line=0&ratio=720p&watermark=0&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033de0000btuq46lghc84bdg5js80&line=1&ratio=720p&watermark=0&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&source=PackSourceEnum_FEED"],"width":720},"duration":30020,"dynamic_cover":{"height":720,"uri":"large/34169000f79578f740da7","url_list":["http://p29-dy.byteimg.com/large/34169000f79578f740da7.jpeg?from=2502468085_large","http://p26-dy.byteimg.com/large/34169000f79578f740da7.jpeg?from=2502468085_large","http://p9-dy.byteimg.com/large/34169000f79578f740da7.jpeg?from=2502468085_large"],"width":720},"has_watermark":false,"height":1280,"is_bytevc1":0,"is_h265":0,"origin_cover":{"height":720,"uri":"large/34169000f79578f740da7","url_list":["http://p6-dy-ipv6.byteimg.com/large/34169000f79578f740da7.jpeg?from=2502468085_large","http://p9-dy.byteimg.com/large/34169000f79578f740da7.jpeg?from=2502468085_large","http://p3-dy-ipv6.byteimg.com/large/34169000f79578f740da7.jpeg?from=2502468085_large"],"width":720},"play_addr":{"data_size":8929855,"file_hash":"4b1becdf6c41e400252c4118e900659c","height":720,"uri":"v02033de0000btuq46lghc84bdg5js80","url_key":"v02033de0000btuq46lghc84bdg5js80_h264_720p_2379708","url_list":["http://v5-dy-d.ixigua.com/f9cc3cea35acc7c34a3eb61ed1e1300e/5f87f220/video/tos/cn/tos-cn-ve-51/c4fea30fb9e54e05abfc59762332e808/?a=1128&br=6969&bt=2323&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M3Y4Zzdmajl0dzMzaDYzM0ApNjY1Njk2OjwzNzk1OmhoNGc1Z2RfNWVpMXJfLS1hMC9zcy01Yy5jXjAyLmM0MjZfMy86Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/b57a0f9afdea506addf3fc7e46e51c5b/5f87f220/video/tos/cn/tos-cn-ve-51/c4fea30fb9e54e05abfc59762332e808/?a=1128&br=6969&bt=2323&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M3Y4Zzdmajl0dzMzaDYzM0ApNjY1Njk2OjwzNzk1OmhoNGc1Z2RfNWVpMXJfLS1hMC9zcy01Yy5jXjAyLmM0MjZfMy86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033de0000btuq46lghc84bdg5js80&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033de0000btuq46lghc84bdg5js80&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":4935215,"file_cs":"c:0-26685-8aa7","file_hash":"3497894d34f8a1b193f7d20530e498e2","height":720,"uri":"v02033de0000btuq46lghc84bdg5js80","url_key":"v02033de0000btuq46lghc84bdg5js80_bytevc1_720p_1315180","url_list":["http://v5-dy-d.ixigua.com/759e1d860b91dc551f418d59c9641ed4/5f87f220/video/tos/cn/tos-cn-ve-51/2b1b48ff3d8149779be7a6c3dea38c9b/?a=1128&br=3852&bt=1284&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M3Y4Zzdmajl0dzMzaDYzM0ApZ2g6ZmVkODw8N2Q7NzVoNWc1Z2RfNWVpMXJfLS1hMC9zcy9eYl9gNWEvNWFgMTQuLTQ6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/dc85d9f0267eef049f023a2ff584955e/5f87f220/video/tos/cn/tos-cn-ve-51/2b1b48ff3d8149779be7a6c3dea38c9b/?a=1128&br=3852&bt=1284&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M3Y4Zzdmajl0dzMzaDYzM0ApZ2g6ZmVkODw8N2Q7NzVoNWc1Z2RfNWVpMXJfLS1hMC9zcy9eYl9gNWEvNWFgMTQuLTQ6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033de0000btuq46lghc84bdg5js80&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033de0000btuq46lghc84bdg5js80&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_h264":{"data_size":8929855,"height":720,"uri":"v02033de0000btuq46lghc84bdg5js80","url_key":"v02033de0000btuq46lghc84bdg5js80_h264_720p_2379708","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033de0000btuq46lghc84bdg5js80&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033de0000btuq46lghc84bdg5js80&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_lowbr":{"data_size":8929855,"file_hash":"4b1becdf6c41e400252c4118e900659c","height":720,"uri":"v02033de0000btuq46lghc84bdg5js80","url_key":"v02033de0000btuq46lghc84bdg5js80_h264_720p_2379708","url_list":["http://v5-dy-d.ixigua.com/f9cc3cea35acc7c34a3eb61ed1e1300e/5f87f220/video/tos/cn/tos-cn-ve-51/c4fea30fb9e54e05abfc59762332e808/?a=1128&br=6969&bt=2323&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M3Y4Zzdmajl0dzMzaDYzM0ApNjY1Njk2OjwzNzk1OmhoNGc1Z2RfNWVpMXJfLS1hMC9zcy01Yy5jXjAyLmM0MjZfMy86Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/b57a0f9afdea506addf3fc7e46e51c5b/5f87f220/video/tos/cn/tos-cn-ve-51/c4fea30fb9e54e05abfc59762332e808/?a=1128&br=6969&bt=2323&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M3Y4Zzdmajl0dzMzaDYzM0ApNjY1Njk2OjwzNzk1OmhoNGc1Z2RfNWVpMXJfLS1hMC9zcy01Yy5jXjAyLmM0MjZfMy86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v02033de0000btuq46lghc84bdg5js80&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v02033de0000btuq46lghc84bdg5js80&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"ratio":"720p","width":720},"video_control":{"allow_download":true,"allow_duet":true,"allow_dynamic_wallpaper":true,"allow_react":true,"draft_progress_bar":0,"prevent_download_type":0,"share_type":1,"show_progress_bar":1,"timer_status":1},"video_labels":null,"video_text":null,"vr_type":0,"with_promotional_music":false}]
     * preload_awemes : null
     * refresh_clear : 1
     * status_code : 0
     */


    private List<AwemeListBean> aweme_list;

    private PostInfo postInfo;






    public static class AwemeListBean {
        /**
         * anchors : null
         * author : {"accept_private_policy":false,"account_region":"","ad_cover_url":null,"apple_account":0,"authority_status":0,"avatar_168x168":{"height":720,"uri":"168x168/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_168x168.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_168x168.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_168x168.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_168x168.jpeg?from=2563711402"],"width":720},"avatar_300x300":{"height":720,"uri":"300x300/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_300x300.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_300x300.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_300x300.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_300x300.jpeg?from=2563711402"],"width":720},"avatar_larger":{"height":720,"uri":"1080x1080/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.jpeg?from=2563711402"],"width":720},"avatar_medium":{"height":720,"uri":"720x720/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.jpeg?from=2563711402"],"width":720},"avatar_thumb":{"height":720,"uri":"100x100/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.jpeg?from=2563711402"],"width":720},"avatar_uri":"tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","aweme_count":0,"bind_phone":"","birthday":"1997-01-01","cha_list":null,"comment_filter_status":0,"comment_setting":0,"commerce_user_level":0,"constellation":2,"cover_url":[{"height":720,"uri":"c8510002be9a3a61aad2","url_list":["https://p26-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"],"width":720}],"create_time":0,"custom_verify":"","cv_level":"","download_prompt_ts":0,"download_setting":-1,"duet_setting":3,"enterprise_verify_reason":"","favoriting_count":0,"fb_expire_time":0,"follow_status":0,"follower_count":0,"follower_status":0,"followers_detail":null,"following_count":0,"gender":2,"geofencing":null,"google_account":"","has_email":false,"has_facebook_token":false,"has_insights":false,"has_orders":false,"has_twitter_token":false,"has_unread_story":false,"has_youtube_token":false,"hide_location":false,"hide_search":false,"ins_id":"","is_ad_fake":false,"is_binded_weibo":false,"is_block":false,"is_discipline_member":false,"is_gov_media_vip":false,"is_phone_binded":false,"is_star":false,"is_verified":true,"item_list":null,"language":"zh-Hans","live_agreement":0,"live_agreement_time":0,"live_commerce":false,"live_verify":0,"location":"","need_recommend":0,"neiguang_shield":0,"new_story_cover":null,"nickname":"富哥剪辑","platform_sync_info":null,"prevent_download":false,"react_setting":0,"reflow_page_gid":0,"reflow_page_uid":0,"region":"CN","relative_users":null,"room_id":0,"school_name":"","school_poi_id":"","school_type":0,"sec_uid":"MS4wLjABAAAAEJ3R3913q0RGJKjI7TawVHugUSh6lEe0K5ysuJTH39I","secret":0,"share_info":{"share_desc":"","share_qrcode_url":{"height":720,"uri":"75a400194d43b16d8958","url_list":["https://p9-dy.byteimg.com/obj/75a400194d43b16d8958?from=2563711402","https://p6-dy-ipv6.byteimg.com/obj/75a400194d43b16d8958?from=2563711402","https://p29-dy.byteimg.com/obj/75a400194d43b16d8958?from=2563711402"],"width":720},"share_title":"","share_title_myself":"","share_title_other":"","share_url":"","share_weibo_desc":""},"share_qrcode_uri":"75a400194d43b16d8958","shield_comment_notice":0,"shield_digg_notice":0,"shield_follow_notice":0,"short_id":"667540735","show_image_bubble":false,"signature":"⚠️看故事，品人生。                                                                                                                 \n⚠️抖音影视宣发合作\n⚠️一部手机轻松学习影视剪辑。                                               ⚠️学习影视教学VX：Lxy30001314。 收徒中\u2026\n⚠️中国·重庆","special_lock":1,"status":1,"story_count":0,"story_open":false,"sync_to_toutiao":0,"total_favorited":0,"tw_expire_time":0,"twitter_id":"","twitter_name":"","type_label":null,"uid":"93953372365","unique_id":"","unique_id_modify_time":1602741234,"user_canceled":false,"user_mode":0,"user_period":0,"user_rate":1,"verification_type":1,"verify_info":"","video_icon":{"height":720,"uri":"","url_list":null,"width":720},"weibo_name":"","weibo_schema":"","weibo_url":"","weibo_verify":"","with_commerce_entry":false,"with_dou_entry":false,"with_fusion_shop_entry":true,"with_shop_entry":false,"youtube_channel_id":"","youtube_channel_title":"","youtube_expire_time":0}
         * author_user_id : 93953372365
         * aweme_control : {"can_comment":true,"can_forward":true,"can_share":true,"can_show_comment":true}
         * aweme_id : 6883369550809779459
         * aweme_type : 0
         * bodydance_score : 0
         * cha_list : null
         * challenge_position : null
         * city : 500000
         * cmt_swt : false
         * collect_stat : 0
         * comment_list : null
         * commerce_config_data : null
         * create_time : 1602659369
         * desc : 为了梦想勇敢迈出那一部
         * desc_language : zh
         * distance :
         * distribute_type : 2
         * duration : 106045
         * enable_top_view : true
         * follow_up_type : 0
         * geofencing : null
         * geofencing_regions : null
         * group_id : 6883369550809779459
         * hybrid_label : null
         * image_infos : null
         * interaction_stickers : null
         * is_ads : false
         * is_fantasy : false
         * is_hash_tag : 1
         * is_horizontal : false
         * is_pgcshow : false
         * is_relieve : false
         * is_story : 0
         * is_top : 0
         * is_vr : false
         * item_comment_settings : 0
         * item_duet : 1
         * item_react : 1
         * label_top : {"height":720,"uri":"c150000f34767e2cb56","url_list":["https://p29-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p26-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p6-dy-ipv6.byteimg.com/obj/c150000f34767e2cb56?from=2563711402"],"width":720}
         * label_top_text : null
         * long_video : null
         * misc_info : {"ocr_location":"{\"x_max\":0.7240624999999999,\"x_min\":0.27273437500000003,\"y_max\":0.10541666666666667,\"y_min\":0}"}
         * mix_info : {"cover_url":{"height":720,"uri":"tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7","url_list":["https://p6-dy-ipv6.byteimg.com/obj/tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7?from=2563711402","https://p26-dy.byteimg.com/obj/tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7?from=2563711402"],"width":720},"desc":"","extra":"{\"audit_locktime\":1602313759,\"ban_fields\":[],\"first_reviewed\":1,\"is_quality_mix\":0,\"next_info\":{\"cover\":\"tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7\",\"desc\":\"\",\"name\":\"感动落泪的情感\"},\"origin_challenge_content\":\"爱情\"}","mix_id":"6875036611659171848","mix_name":"感动落泪的情感","share_info":{"share_desc":"在抖音，记录美好生活","share_title":"这么有趣的合集，不能只有我一个人知道吧","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/mix/detail/6875036611659171848/?schema_type=24&object_id=6875036611659171848","share_weibo_desc":"这么有趣的合集，不能只有我一个人知道吧"},"statis":{"collect_vv":0,"current_episode":47,"play_vv":0,"updated_to_episode":57},"status":{"is_collected":0,"status":2}}
         * music : {"album":"","author":"富哥剪辑","author_deleted":false,"author_position":null,"avatar_large":{"height":720,"uri":"1080x1080/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.jpeg?from=2563711402"],"width":720},"avatar_medium":{"height":720,"uri":"720x720/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.jpeg?from=2563711402"],"width":720},"avatar_thumb":{"height":720,"uri":"100x100/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.jpeg?from=2563711402"],"width":720},"binded_challenge_id":0,"collect_stat":0,"cover_hd":{"height":720,"uri":"1080x1080/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.jpeg?from=2563711402"],"width":720},"cover_large":{"height":720,"uri":"1080x1080/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.jpeg?from=2563711402"],"width":720},"cover_medium":{"height":720,"uri":"720x720/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.jpeg?from=2563711402"],"width":720},"cover_thumb":{"height":720,"uri":"100x100/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.jpeg?from=2563711402"],"width":720},"duration":106,"end_time":0,"external_song_info":null,"extra":"{\"reviewed\":0,\"review_unshelve_reason\":0,\"beats\":{},\"hotsoon_review_time\":-1,\"has_edited\":0,\"douyin_beats_info\":{},\"schedule_search_time\":0,\"music_label_id\":null,\"aggregate_exempt_conf\":[]}","id":6883369629134179086,"id_str":"6883369629134179086","is_author_artist":false,"is_del_video":false,"is_original":false,"is_pgc":false,"is_restricted":false,"is_video_self_see":false,"mid":"6883369629134179086","mute_share":false,"offline_desc":"","owner_handle":"667540735","owner_id":"93953372365","owner_nickname":"富哥剪辑","play_url":{"height":720,"uri":"https://p9-dy.byteimg.com/obj/ies-music/6883369590966274830.mp3","url_list":["https://p9-dy.byteimg.com/obj/ies-music/6883369590966274830.mp3","https://p1-dy.byteimg.com/obj/ies-music/6883369590966274830.mp3"],"width":720},"position":null,"prevent_download":false,"prevent_item_download_status":0,"preview_end_time":0,"preview_start_time":0,"redirect":false,"schema_url":"","sec_uid":"MS4wLjABAAAAEJ3R3913q0RGJKjI7TawVHugUSh6lEe0K5ysuJTH39I","source_platform":23,"start_time":0,"status":1,"title":"@富哥剪辑创作的原声","unshelve_countries":null,"user_count":0}
         * nickname_position : null
         * open_platform_info : {"icon":"https://sf1-dycdn-tos.pstatp.com/obj/douyin-web-image/b22313de3911b1169d1064198d589bc1","link":"https://lv.ulikecam.com/act/lv-feed?aweme_item_id=6883369550809779459&from=singlemessage&hide_nav_bar=1&should_full_screen=true","name":"剪映-视频制作"}
         * open_platform_name : 剪映-视频制作
         * origin_comment_ids : null
         * position : null
         * prevent_download : false
         * promotions : null
         * rate : 12
         * raw_ad_data : null
         * region : CN
         * risk_infos : {"content":"","risk_sink":false,"type":0,"vote":false,"warn":false}
         * share_info : {"bool_persist":0,"share_desc":"在抖音，记录美好生活","share_link_desc":"为了梦想勇敢迈出那一部  %s 复制此链接，打开抖音，直接观看视频！","share_quote":"","share_signature_desc":"","share_signature_url":"","share_title":"为了梦想勇敢迈出那一部","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/video/6883369550809779459/?region=CN&mid=6883369629134179086&u_code=i0kji679&titleType=title&did=71471896106&iid=3993023441537288","share_weibo_desc":"#在抖音，记录美好生活#为了梦想勇敢迈出那一部"}
         * share_url : https://www.iesdouyin.com/share/video/6883369550809779459/?region=CN&mid=6883369629134179086&u_code=i0kji679&titleType=title&did=71471896106&iid=3993023441537288
         * sort_label : _
         * statistics : {"aweme_id":"6883369550809779459","comment_count":375,"digg_count":5316,"download_count":145,"forward_count":30,"lose_comment_count":0,"lose_count":0,"play_count":0,"share_count":138,"whatsapp_share_count":0}
         * status : {"allow_comment":true,"allow_share":true,"aweme_id":"6883369550809779459","download_status":0,"in_reviewing":false,"is_delete":false,"is_private":false,"is_prohibited":false,"private_status":0,"reviewed":1,"self_see":false,"with_fusion_goods":false,"with_goods":false}
         * text_extra : []
         * uniqid_position : null
         * user_digged : 0
         * user_profile_init_info : {"head_model_score":0.08498203754425049}
         * video : {"big_thumbs":[{"duration":106.041667,"fext":"jpg","img_num":106,"img_url":"http://p3-tt.bytecdn.cn/obj/tos-cn-p-0015/a112b1026651493fb40cb1ac75d4dc92_1602659377","img_x_len":10,"img_x_size":240,"img_y_len":11,"img_y_size":136,"interval":10,"uri":"tos-cn-p-0015/a112b1026651493fb40cb1ac75d4dc92_1602659377"}],"bit_rate":[{"bit_rate":1632768,"gear_name":"adapt_lowest_720","is_h265":1,"play_addr":{"data_size":21643369,"file_cs":"c:0-112145-aa72","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_720p_1632768","url_list":["http://v26-dy.ixigua.com/50c60b94c80b4ebef2730d64eeb33cac/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/b99c2c13640a871b5ddf95c442f2be48/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":21643369,"file_cs":"c:0-112145-aa72","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_720p_1632768","url_list":["http://v26-dy.ixigua.com/50c60b94c80b4ebef2730d64eeb33cac/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/b99c2c13640a871b5ddf95c442f2be48/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"quality_type":15},{"bit_rate":1544275,"gear_name":"adapt_540","is_h265":1,"play_addr":{"data_size":20470331,"file_cs":"c:0-112149-aede","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_540p_1544275","url_list":["http://v26-dy.ixigua.com/1de20f6d7e6f9b0dcdc2e4266f607be9/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/97de9a2d59ef128e67a0ae1b934b8946/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":20470331,"file_cs":"c:0-112149-aede","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_540p_1544275","url_list":["http://v26-dy.ixigua.com/1de20f6d7e6f9b0dcdc2e4266f607be9/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/97de9a2d59ef128e67a0ae1b934b8946/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"quality_type":28}],"cdn_url_expired":0,"cover":{"height":720,"uri":"large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375","url_list":["http://p3-dy-ipv6.byteimg.com/large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375.webp?from=2563711402_large","http://p1-dy-ipv6.byteimg.com/large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375.webp?from=2563711402_large","http://p29-dy.byteimg.com/large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375.webp?from=2563711402_large","http://p3-dy-ipv6.byteimg.com/large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375.jpeg?from=2563711402_large"],"width":720},"download_addr":{"data_size":39956726,"height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_list":["http://v26-dy.ixigua.com/f102959f66503fc33fc56ed2fb770d1a/5f87f26c/video/tos/cn/tos-cn-ve-15/92128c091c1948e7a1f6db665a7ae4ff/?a=1128&br=8586&bt=2862&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApODQ4ODszOzs5N2hnNTs2OWdrMWlrNl80NTBfLS0wLTBzczAwYy5fYl4tYTYxYDBeXjA6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/8eadfb2231cd58be9871f4e53434ea1c/5f87f26c/video/tos/cn/tos-cn-ve-15/92128c091c1948e7a1f6db665a7ae4ff/?a=1128&br=8586&bt=2862&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApODQ4ODszOzs5N2hnNTs2OWdrMWlrNl80NTBfLS0wLTBzczAwYy5fYl4tYTYxYDBeXjA6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"download_suffix_logo_addr":{"data_size":39956726,"height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_list":["http://v26-dy.ixigua.com/f102959f66503fc33fc56ed2fb770d1a/5f87f26c/video/tos/cn/tos-cn-ve-15/92128c091c1948e7a1f6db665a7ae4ff/?a=1128&br=8586&bt=2862&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApODQ4ODszOzs5N2hnNTs2OWdrMWlrNl80NTBfLS0wLTBzczAwYy5fYl4tYTYxYDBeXjA6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/8eadfb2231cd58be9871f4e53434ea1c/5f87f26c/video/tos/cn/tos-cn-ve-15/92128c091c1948e7a1f6db665a7ae4ff/?a=1128&br=8586&bt=2862&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApODQ4ODszOzs5N2hnNTs2OWdrMWlrNl80NTBfLS0wLTBzczAwYy5fYl4tYTYxYDBeXjA6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"duration":106045,"dynamic_cover":{"height":720,"uri":"tos-cn-p-0015/6ec1deec2c1049fcbea82bf623b091eb_1602659371","url_list":["https://p6-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/6ec1deec2c1049fcbea82bf623b091eb_1602659371?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/6ec1deec2c1049fcbea82bf623b091eb_1602659371?from=2563711402_large","https://p29-dy.byteimg.com/obj/tos-cn-p-0015/6ec1deec2c1049fcbea82bf623b091eb_1602659371?from=2563711402_large"],"width":720},"has_download_suffix_logo_addr":true,"has_watermark":true,"height":576,"is_h265":0,"is_long_video":1,"origin_cover":{"height":720,"uri":"tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370","url_list":["https://p26-dy.byteimg.com/tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370~tplv-dy-360p.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370~tplv-dy-360p.webp?from=2563711402","https://p29-dy.byteimg.com/tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370~tplv-dy-360p.webp?from=2563711402","https://p26-dy.byteimg.com/tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370~tplv-dy-360p.jpeg?from=2563711402"],"width":720},"play_addr":{"data_size":28245593,"file_cs":"c:0-109963-4a7a","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_h264_540p_2130838","url_list":["http://v26-dy.ixigua.com/4e5be394a9686c3c33dae460a7e0f45f/5f87f26c/video/tos/cn/tos-cn-ve-15/4dd37aaa38864040af024fb5642053a2/?a=1128&br=6240&bt=2080&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApZTs4NDtlaWVlNzZpNDZoNGdrMWlrNl80NTBfLS0wLTBzcy8xYmNjYi0yLzYwX2IyMTQ6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/aac7f1a555ae694a483f0723f76bf0c3/5f87f26c/video/tos/cn/tos-cn-ve-15/4dd37aaa38864040af024fb5642053a2/?a=1128&br=6240&bt=2080&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApZTs4NDtlaWVlNzZpNDZoNGdrMWlrNl80NTBfLS0wLTBzcy8xYmNjYi0yLzYwX2IyMTQ6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":20470331,"file_cs":"c:0-112149-aede","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_540p_1544275","url_list":["http://v26-dy.ixigua.com/1de20f6d7e6f9b0dcdc2e4266f607be9/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/97de9a2d59ef128e67a0ae1b934b8946/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_h264":{"data_size":28245593,"file_cs":"c:0-109963-4a7a","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_h264_540p_2130838","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED"],"width":720},"play_addr_lowbr":{"data_size":28245593,"file_cs":"c:0-109963-4a7a","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_h264_540p_2130838","url_list":["http://v26-dy.ixigua.com/4e5be394a9686c3c33dae460a7e0f45f/5f87f26c/video/tos/cn/tos-cn-ve-15/4dd37aaa38864040af024fb5642053a2/?a=1128&br=6240&bt=2080&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApZTs4NDtlaWVlNzZpNDZoNGdrMWlrNl80NTBfLS0wLTBzcy8xYmNjYi0yLzYwX2IyMTQ6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/aac7f1a555ae694a483f0723f76bf0c3/5f87f26c/video/tos/cn/tos-cn-ve-15/4dd37aaa38864040af024fb5642053a2/?a=1128&br=6240&bt=2080&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApZTs4NDtlaWVlNzZpNDZoNGdrMWlrNl80NTBfLS0wLTBzcy8xYmNjYi0yLzYwX2IyMTQ6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"ratio":"540p","video_model":"","width":1024}
         * video_control : {"allow_download":true,"allow_duet":false,"allow_dynamic_wallpaper":false,"allow_music":true,"allow_react":false,"draft_progress_bar":1,"prevent_download_type":0,"share_type":1,"show_progress_bar":1,"timer_status":1}
         * video_labels : null
         * video_text : null
         * vr_type : 0
         * with_promotional_music : false
         * xigua_task : {"is_xigua_task":false}
         * descendants : {"notify_msg":"头条","platforms":["toutiao"]}
         * commerce_info : {"avoid_global_pendant":true}
         */

        private Object anchors;
        private AuthorBean author;
        private long author_user_id;
        private AwemeControlBean aweme_control;
        private String aweme_id;
        private int aweme_type;
        private int bodydance_score;
        private Object cha_list;
        private Object challenge_position;
        private String city;
        private boolean cmt_swt;
        private int collect_stat;
        private Object comment_list;
        private Object commerce_config_data;
        private int create_time;
        private String desc;
        private String desc_language;
        private String distance;
        private int distribute_type;
        private int duration;
        private boolean enable_top_view;
        private int follow_up_type;
        private Object geofencing;
        private Object geofencing_regions;
        private String group_id;
        private Object hybrid_label;
        private Object image_infos;
        private Object interaction_stickers;
        private boolean is_ads;
        private boolean is_fantasy;
        private int is_hash_tag;
        private boolean is_horizontal;
        private boolean is_pgcshow;
        private boolean is_relieve;
        private int is_story;
        private int is_top;
        private boolean is_vr;
        private int item_comment_settings;
        private int item_duet;
        private int item_react;
        private LabelTopBean label_top;
        private Object label_top_text;
        private Object long_video;
        private String misc_info;
        private MixInfoBean mix_info;
//        private MusicBean music;
        private Object nickname_position;
        private OpenPlatformInfoBean open_platform_info;
        private String open_platform_name;
        private Object origin_comment_ids;
        private Object position;
        private boolean prevent_download;
        private Object promotions;
        private int rate;
        private Object raw_ad_data;
        private String region;
        private RiskInfosBean risk_infos;
        private ShareInfoBeanXX share_info;
        private String share_url;
        private String sort_label;
        private StatisticsBean statistics;
        private StatusBeanX status;
        private Object uniqid_position;
        private int user_digged;
        private UserProfileInitInfoBean user_profile_init_info;
        private VideoBean video;
        private VideoControlBean video_control;
        private Object video_labels;
        private Object video_text;
        private int vr_type;
        private boolean with_promotional_music;
        private XiguaTaskBean xigua_task;
        private DescendantsBean descendants;
        private CommerceInfoBean commerce_info;
        private List<?> text_extra;

        public Object getAnchors() {
            return anchors;
        }

        public void setAnchors(Object anchors) {
            this.anchors = anchors;
        }

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public long getAuthor_user_id() {
            return author_user_id;
        }

        public void setAuthor_user_id(long author_user_id) {
            this.author_user_id = author_user_id;
        }

        public AwemeControlBean getAweme_control() {
            return aweme_control;
        }

        public void setAweme_control(AwemeControlBean aweme_control) {
            this.aweme_control = aweme_control;
        }

        public String getAweme_id() {
            return aweme_id;
        }

        public void setAweme_id(String aweme_id) {
            this.aweme_id = aweme_id;
        }

        public int getAweme_type() {
            return aweme_type;
        }

        public void setAweme_type(int aweme_type) {
            this.aweme_type = aweme_type;
        }

        public int getBodydance_score() {
            return bodydance_score;
        }

        public void setBodydance_score(int bodydance_score) {
            this.bodydance_score = bodydance_score;
        }

        public Object getCha_list() {
            return cha_list;
        }

        public void setCha_list(Object cha_list) {
            this.cha_list = cha_list;
        }

        public Object getChallenge_position() {
            return challenge_position;
        }

        public void setChallenge_position(Object challenge_position) {
            this.challenge_position = challenge_position;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public boolean isCmt_swt() {
            return cmt_swt;
        }

        public void setCmt_swt(boolean cmt_swt) {
            this.cmt_swt = cmt_swt;
        }

        public int getCollect_stat() {
            return collect_stat;
        }

        public void setCollect_stat(int collect_stat) {
            this.collect_stat = collect_stat;
        }

        public Object getComment_list() {
            return comment_list;
        }

        public void setComment_list(Object comment_list) {
            this.comment_list = comment_list;
        }

        public Object getCommerce_config_data() {
            return commerce_config_data;
        }

        public void setCommerce_config_data(Object commerce_config_data) {
            this.commerce_config_data = commerce_config_data;
        }

        public int getCreate_time() {
            return create_time;
        }

        public void setCreate_time(int create_time) {
            this.create_time = create_time;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc_language() {
            return desc_language;
        }

        public void setDesc_language(String desc_language) {
            this.desc_language = desc_language;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public int getDistribute_type() {
            return distribute_type;
        }

        public void setDistribute_type(int distribute_type) {
            this.distribute_type = distribute_type;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public boolean isEnable_top_view() {
            return enable_top_view;
        }

        public void setEnable_top_view(boolean enable_top_view) {
            this.enable_top_view = enable_top_view;
        }

        public int getFollow_up_type() {
            return follow_up_type;
        }

        public void setFollow_up_type(int follow_up_type) {
            this.follow_up_type = follow_up_type;
        }

        public Object getGeofencing() {
            return geofencing;
        }

        public void setGeofencing(Object geofencing) {
            this.geofencing = geofencing;
        }

        public Object getGeofencing_regions() {
            return geofencing_regions;
        }

        public void setGeofencing_regions(Object geofencing_regions) {
            this.geofencing_regions = geofencing_regions;
        }

        public String getGroup_id() {
            return group_id;
        }

        public void setGroup_id(String group_id) {
            this.group_id = group_id;
        }

        public Object getHybrid_label() {
            return hybrid_label;
        }

        public void setHybrid_label(Object hybrid_label) {
            this.hybrid_label = hybrid_label;
        }

        public Object getImage_infos() {
            return image_infos;
        }

        public void setImage_infos(Object image_infos) {
            this.image_infos = image_infos;
        }

        public Object getInteraction_stickers() {
            return interaction_stickers;
        }

        public void setInteraction_stickers(Object interaction_stickers) {
            this.interaction_stickers = interaction_stickers;
        }

        public boolean isIs_ads() {
            return is_ads;
        }

        public void setIs_ads(boolean is_ads) {
            this.is_ads = is_ads;
        }

        public boolean isIs_fantasy() {
            return is_fantasy;
        }

        public void setIs_fantasy(boolean is_fantasy) {
            this.is_fantasy = is_fantasy;
        }

        public int getIs_hash_tag() {
            return is_hash_tag;
        }

        public void setIs_hash_tag(int is_hash_tag) {
            this.is_hash_tag = is_hash_tag;
        }

        public boolean isIs_horizontal() {
            return is_horizontal;
        }

        public void setIs_horizontal(boolean is_horizontal) {
            this.is_horizontal = is_horizontal;
        }

        public boolean isIs_pgcshow() {
            return is_pgcshow;
        }

        public void setIs_pgcshow(boolean is_pgcshow) {
            this.is_pgcshow = is_pgcshow;
        }

        public boolean isIs_relieve() {
            return is_relieve;
        }

        public void setIs_relieve(boolean is_relieve) {
            this.is_relieve = is_relieve;
        }

        public int getIs_story() {
            return is_story;
        }

        public void setIs_story(int is_story) {
            this.is_story = is_story;
        }

        public int getIs_top() {
            return is_top;
        }

        public void setIs_top(int is_top) {
            this.is_top = is_top;
        }

        public boolean isIs_vr() {
            return is_vr;
        }

        public void setIs_vr(boolean is_vr) {
            this.is_vr = is_vr;
        }

        public int getItem_comment_settings() {
            return item_comment_settings;
        }

        public void setItem_comment_settings(int item_comment_settings) {
            this.item_comment_settings = item_comment_settings;
        }

        public int getItem_duet() {
            return item_duet;
        }

        public void setItem_duet(int item_duet) {
            this.item_duet = item_duet;
        }

        public int getItem_react() {
            return item_react;
        }

        public void setItem_react(int item_react) {
            this.item_react = item_react;
        }

        public LabelTopBean getLabel_top() {
            return label_top;
        }

        public void setLabel_top(LabelTopBean label_top) {
            this.label_top = label_top;
        }

        public Object getLabel_top_text() {
            return label_top_text;
        }

        public void setLabel_top_text(Object label_top_text) {
            this.label_top_text = label_top_text;
        }

        public Object getLong_video() {
            return long_video;
        }

        public void setLong_video(Object long_video) {
            this.long_video = long_video;
        }

        public String getMisc_info() {
            return misc_info;
        }

        public void setMisc_info(String misc_info) {
            this.misc_info = misc_info;
        }

        public MixInfoBean getMix_info() {
            return mix_info;
        }

        public void setMix_info(MixInfoBean mix_info) {
            this.mix_info = mix_info;
        }

//        public MusicBean getMusic() {
//            return music;
//        }
//
//        public void setMusic(MusicBean music) {
//            this.music = music;
//        }

        public Object getNickname_position() {
            return nickname_position;
        }

        public void setNickname_position(Object nickname_position) {
            this.nickname_position = nickname_position;
        }

        public OpenPlatformInfoBean getOpen_platform_info() {
            return open_platform_info;
        }

        public void setOpen_platform_info(OpenPlatformInfoBean open_platform_info) {
            this.open_platform_info = open_platform_info;
        }

        public String getOpen_platform_name() {
            return open_platform_name;
        }

        public void setOpen_platform_name(String open_platform_name) {
            this.open_platform_name = open_platform_name;
        }

        public Object getOrigin_comment_ids() {
            return origin_comment_ids;
        }

        public void setOrigin_comment_ids(Object origin_comment_ids) {
            this.origin_comment_ids = origin_comment_ids;
        }

        public Object getPosition() {
            return position;
        }

        public void setPosition(Object position) {
            this.position = position;
        }

        public boolean isPrevent_download() {
            return prevent_download;
        }

        public void setPrevent_download(boolean prevent_download) {
            this.prevent_download = prevent_download;
        }

        public Object getPromotions() {
            return promotions;
        }

        public void setPromotions(Object promotions) {
            this.promotions = promotions;
        }

        public int getRate() {
            return rate;
        }

        public void setRate(int rate) {
            this.rate = rate;
        }

        public Object getRaw_ad_data() {
            return raw_ad_data;
        }

        public void setRaw_ad_data(Object raw_ad_data) {
            this.raw_ad_data = raw_ad_data;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public RiskInfosBean getRisk_infos() {
            return risk_infos;
        }

        public void setRisk_infos(RiskInfosBean risk_infos) {
            this.risk_infos = risk_infos;
        }

        public ShareInfoBeanXX getShare_info() {
            return share_info;
        }

        public void setShare_info(ShareInfoBeanXX share_info) {
            this.share_info = share_info;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public String getSort_label() {
            return sort_label;
        }

        public void setSort_label(String sort_label) {
            this.sort_label = sort_label;
        }

        public StatisticsBean getStatistics() {
            return statistics;
        }

        public void setStatistics(StatisticsBean statistics) {
            this.statistics = statistics;
        }

        public StatusBeanX getStatus() {
            return status;
        }

        public void setStatus(StatusBeanX status) {
            this.status = status;
        }

        public Object getUniqid_position() {
            return uniqid_position;
        }

        public void setUniqid_position(Object uniqid_position) {
            this.uniqid_position = uniqid_position;
        }

        public int getUser_digged() {
            return user_digged;
        }

        public void setUser_digged(int user_digged) {
            this.user_digged = user_digged;
        }

        public UserProfileInitInfoBean getUser_profile_init_info() {
            return user_profile_init_info;
        }

        public void setUser_profile_init_info(UserProfileInitInfoBean user_profile_init_info) {
            this.user_profile_init_info = user_profile_init_info;
        }

        public VideoBean getVideo() {
            return video;
        }

        public void setVideo(VideoBean video) {
            this.video = video;
        }

        public VideoControlBean getVideo_control() {
            return video_control;
        }

        public void setVideo_control(VideoControlBean video_control) {
            this.video_control = video_control;
        }

        public Object getVideo_labels() {
            return video_labels;
        }

        public void setVideo_labels(Object video_labels) {
            this.video_labels = video_labels;
        }

        public Object getVideo_text() {
            return video_text;
        }

        public void setVideo_text(Object video_text) {
            this.video_text = video_text;
        }

        public int getVr_type() {
            return vr_type;
        }

        public void setVr_type(int vr_type) {
            this.vr_type = vr_type;
        }

        public boolean isWith_promotional_music() {
            return with_promotional_music;
        }

        public void setWith_promotional_music(boolean with_promotional_music) {
            this.with_promotional_music = with_promotional_music;
        }

        public XiguaTaskBean getXigua_task() {
            return xigua_task;
        }

        public void setXigua_task(XiguaTaskBean xigua_task) {
            this.xigua_task = xigua_task;
        }

        public DescendantsBean getDescendants() {
            return descendants;
        }

        public void setDescendants(DescendantsBean descendants) {
            this.descendants = descendants;
        }

        public CommerceInfoBean getCommerce_info() {
            return commerce_info;
        }

        public void setCommerce_info(CommerceInfoBean commerce_info) {
            this.commerce_info = commerce_info;
        }

        public List<?> getText_extra() {
            return text_extra;
        }

        public void setText_extra(List<?> text_extra) {
            this.text_extra = text_extra;
        }

        public static class AuthorBean {
            /**
             * accept_private_policy : false
             * account_region :
             * ad_cover_url : null
             * apple_account : 0
             * authority_status : 0
             * avatar_168x168 : {"height":720,"uri":"168x168/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_168x168.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_168x168.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_168x168.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_168x168.jpeg?from=2563711402"],"width":720}
             * avatar_300x300 : {"height":720,"uri":"300x300/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_300x300.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_300x300.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_300x300.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_300x300.jpeg?from=2563711402"],"width":720}
             * avatar_larger : {"height":720,"uri":"1080x1080/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.jpeg?from=2563711402"],"width":720}
             * avatar_medium : {"height":720,"uri":"720x720/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.jpeg?from=2563711402"],"width":720}
             * avatar_thumb : {"height":720,"uri":"100x100/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.jpeg?from=2563711402"],"width":720}
             * avatar_uri : tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465
             * aweme_count : 0
             * bind_phone :
             * birthday : 1997-01-01
             * cha_list : null
             * comment_filter_status : 0
             * comment_setting : 0
             * commerce_user_level : 0
             * constellation : 2
             * cover_url : [{"height":720,"uri":"c8510002be9a3a61aad2","url_list":["https://p26-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"],"width":720}]
             * create_time : 0
             * custom_verify :
             * cv_level :
             * download_prompt_ts : 0
             * download_setting : -1
             * duet_setting : 3
             * enterprise_verify_reason :
             * favoriting_count : 0
             * fb_expire_time : 0
             * follow_status : 0
             * follower_count : 0
             * follower_status : 0
             * followers_detail : null
             * following_count : 0
             * gender : 2
             * geofencing : null
             * google_account :
             * has_email : false
             * has_facebook_token : false
             * has_insights : false
             * has_orders : false
             * has_twitter_token : false
             * has_unread_story : false
             * has_youtube_token : false
             * hide_location : false
             * hide_search : false
             * ins_id :
             * is_ad_fake : false
             * is_binded_weibo : false
             * is_block : false
             * is_discipline_member : false
             * is_gov_media_vip : false
             * is_phone_binded : false
             * is_star : false
             * is_verified : true
             * item_list : null
             * language : zh-Hans
             * live_agreement : 0
             * live_agreement_time : 0
             * live_commerce : false
             * live_verify : 0
             * location :
             * need_recommend : 0
             * neiguang_shield : 0
             * new_story_cover : null
             * nickname : 富哥剪辑
             * platform_sync_info : null
             * prevent_download : false
             * react_setting : 0
             * reflow_page_gid : 0
             * reflow_page_uid : 0
             * region : CN
             * relative_users : null
             * room_id : 0
             * school_name :
             * school_poi_id :
             * school_type : 0
             * sec_uid : MS4wLjABAAAAEJ3R3913q0RGJKjI7TawVHugUSh6lEe0K5ysuJTH39I
             * secret : 0
             * share_info : {"share_desc":"","share_qrcode_url":{"height":720,"uri":"75a400194d43b16d8958","url_list":["https://p9-dy.byteimg.com/obj/75a400194d43b16d8958?from=2563711402","https://p6-dy-ipv6.byteimg.com/obj/75a400194d43b16d8958?from=2563711402","https://p29-dy.byteimg.com/obj/75a400194d43b16d8958?from=2563711402"],"width":720},"share_title":"","share_title_myself":"","share_title_other":"","share_url":"","share_weibo_desc":""}
             * share_qrcode_uri : 75a400194d43b16d8958
             * shield_comment_notice : 0
             * shield_digg_notice : 0
             * shield_follow_notice : 0
             * short_id : 667540735
             * show_image_bubble : false
             * signature : ⚠️看故事，品人生。
             ⚠️抖音影视宣发合作
             ⚠️一部手机轻松学习影视剪辑。                                               ⚠️学习影视教学VX：Lxy30001314。 收徒中…
             ⚠️中国·重庆
             * special_lock : 1
             * status : 1
             * story_count : 0
             * story_open : false
             * sync_to_toutiao : 0
             * total_favorited : 0
             * tw_expire_time : 0
             * twitter_id :
             * twitter_name :
             * type_label : null
             * uid : 93953372365
             * unique_id :
             * unique_id_modify_time : 1602741234
             * user_canceled : false
             * user_mode : 0
             * user_period : 0
             * user_rate : 1
             * verification_type : 1
             * verify_info :
             * video_icon : {"height":720,"uri":"","url_list":null,"width":720}
             * weibo_name :
             * weibo_schema :
             * weibo_url :
             * weibo_verify :
             * with_commerce_entry : false
             * with_dou_entry : false
             * with_fusion_shop_entry : true
             * with_shop_entry : false
             * youtube_channel_id :
             * youtube_channel_title :
             * youtube_expire_time : 0
             */

            private boolean accept_private_policy;
            private String account_region;
            private Object ad_cover_url;
            private int apple_account;
            private int authority_status;
            private Avatar168x168Bean avatar_168x168;
            private Avatar300x300Bean avatar_300x300;
            private AvatarLargerBean avatar_larger;
            private AvatarMediumBean avatar_medium;
            private AvatarThumbBean avatar_thumb;
            private String avatar_uri;
            private int aweme_count;
            private String bind_phone;
            private String birthday;
            private Object cha_list;
            private int comment_filter_status;
            private int comment_setting;
            private int commerce_user_level;
            private int constellation;
            private int create_time;
            private String custom_verify;
            private String cv_level;
            private int download_prompt_ts;
            private int download_setting;
            private int duet_setting;
            private String enterprise_verify_reason;
            private int favoriting_count;
            private int fb_expire_time;
            private int follow_status;
            private int follower_count;
            private int follower_status;
            private Object followers_detail;
            private int following_count;
            private int gender;
            private Object geofencing;
            private String google_account;
            private boolean has_email;
            private boolean has_facebook_token;
            private boolean has_insights;
            private boolean has_orders;
            private boolean has_twitter_token;
            private boolean has_unread_story;
            private boolean has_youtube_token;
            private boolean hide_location;
            private boolean hide_search;
            private String ins_id;
            private boolean is_ad_fake;
            private boolean is_binded_weibo;
            private boolean is_block;
            private boolean is_discipline_member;
            private boolean is_gov_media_vip;
            private boolean is_phone_binded;
            private boolean is_star;
            private boolean is_verified;
            private Object item_list;
            private String language;
            private int live_agreement;
            private int live_agreement_time;
            private boolean live_commerce;
            private int live_verify;
            private String location;
            private int need_recommend;
            private int neiguang_shield;
            private Object new_story_cover;
            private String nickname;
            private Object platform_sync_info;
            private boolean prevent_download;
            private int react_setting;
            private int reflow_page_gid;
            private int reflow_page_uid;
            private String region;
            private Object relative_users;
//            private int room_id;
            private String school_name;
            private String school_poi_id;
            private int school_type;
            private String sec_uid;
            private int secret;
            private ShareInfoBean share_info;
            private String share_qrcode_uri;
            private int shield_comment_notice;
            private int shield_digg_notice;
            private int shield_follow_notice;
            private String short_id;
            private boolean show_image_bubble;
            private String signature;
            private int special_lock;
            private int status;
            private int story_count;
            private boolean story_open;
            private int sync_to_toutiao;
            private int total_favorited;
            private int tw_expire_time;
            private String twitter_id;
            private String twitter_name;
            private Object type_label;
            private String uid;
            private String unique_id;
            private int unique_id_modify_time;
            private boolean user_canceled;
            private int user_mode;
            private int user_period;
            private int user_rate;
            private int verification_type;
            private String verify_info;
            private VideoIconBean video_icon;
            private String weibo_name;
            private String weibo_schema;
            private String weibo_url;
            private String weibo_verify;
            private boolean with_commerce_entry;
            private boolean with_dou_entry;
            private boolean with_fusion_shop_entry;
            private boolean with_shop_entry;
            private String youtube_channel_id;
            private String youtube_channel_title;
            private int youtube_expire_time;
            private List<CoverUrlBean> cover_url;

            public boolean isAccept_private_policy() {
                return accept_private_policy;
            }

            public void setAccept_private_policy(boolean accept_private_policy) {
                this.accept_private_policy = accept_private_policy;
            }

            public String getAccount_region() {
                return account_region;
            }

            public void setAccount_region(String account_region) {
                this.account_region = account_region;
            }

            public Object getAd_cover_url() {
                return ad_cover_url;
            }

            public void setAd_cover_url(Object ad_cover_url) {
                this.ad_cover_url = ad_cover_url;
            }

            public int getApple_account() {
                return apple_account;
            }

            public void setApple_account(int apple_account) {
                this.apple_account = apple_account;
            }

            public int getAuthority_status() {
                return authority_status;
            }

            public void setAuthority_status(int authority_status) {
                this.authority_status = authority_status;
            }

            public Avatar168x168Bean getAvatar_168x168() {
                return avatar_168x168;
            }

            public void setAvatar_168x168(Avatar168x168Bean avatar_168x168) {
                this.avatar_168x168 = avatar_168x168;
            }

            public Avatar300x300Bean getAvatar_300x300() {
                return avatar_300x300;
            }

            public void setAvatar_300x300(Avatar300x300Bean avatar_300x300) {
                this.avatar_300x300 = avatar_300x300;
            }

            public AvatarLargerBean getAvatar_larger() {
                return avatar_larger;
            }

            public void setAvatar_larger(AvatarLargerBean avatar_larger) {
                this.avatar_larger = avatar_larger;
            }

            public AvatarMediumBean getAvatar_medium() {
                return avatar_medium;
            }

            public void setAvatar_medium(AvatarMediumBean avatar_medium) {
                this.avatar_medium = avatar_medium;
            }

            public AvatarThumbBean getAvatar_thumb() {
                return avatar_thumb;
            }

            public void setAvatar_thumb(AvatarThumbBean avatar_thumb) {
                this.avatar_thumb = avatar_thumb;
            }

            public String getAvatar_uri() {
                return avatar_uri;
            }

            public void setAvatar_uri(String avatar_uri) {
                this.avatar_uri = avatar_uri;
            }

            public int getAweme_count() {
                return aweme_count;
            }

            public void setAweme_count(int aweme_count) {
                this.aweme_count = aweme_count;
            }

            public String getBind_phone() {
                return bind_phone;
            }

            public void setBind_phone(String bind_phone) {
                this.bind_phone = bind_phone;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public Object getCha_list() {
                return cha_list;
            }

            public void setCha_list(Object cha_list) {
                this.cha_list = cha_list;
            }

            public int getComment_filter_status() {
                return comment_filter_status;
            }

            public void setComment_filter_status(int comment_filter_status) {
                this.comment_filter_status = comment_filter_status;
            }

            public int getComment_setting() {
                return comment_setting;
            }

            public void setComment_setting(int comment_setting) {
                this.comment_setting = comment_setting;
            }

            public int getCommerce_user_level() {
                return commerce_user_level;
            }

            public void setCommerce_user_level(int commerce_user_level) {
                this.commerce_user_level = commerce_user_level;
            }

            public int getConstellation() {
                return constellation;
            }

            public void setConstellation(int constellation) {
                this.constellation = constellation;
            }

            public int getCreate_time() {
                return create_time;
            }

            public void setCreate_time(int create_time) {
                this.create_time = create_time;
            }

            public String getCustom_verify() {
                return custom_verify;
            }

            public void setCustom_verify(String custom_verify) {
                this.custom_verify = custom_verify;
            }

            public String getCv_level() {
                return cv_level;
            }

            public void setCv_level(String cv_level) {
                this.cv_level = cv_level;
            }

            public int getDownload_prompt_ts() {
                return download_prompt_ts;
            }

            public void setDownload_prompt_ts(int download_prompt_ts) {
                this.download_prompt_ts = download_prompt_ts;
            }

            public int getDownload_setting() {
                return download_setting;
            }

            public void setDownload_setting(int download_setting) {
                this.download_setting = download_setting;
            }

            public int getDuet_setting() {
                return duet_setting;
            }

            public void setDuet_setting(int duet_setting) {
                this.duet_setting = duet_setting;
            }

            public String getEnterprise_verify_reason() {
                return enterprise_verify_reason;
            }

            public void setEnterprise_verify_reason(String enterprise_verify_reason) {
                this.enterprise_verify_reason = enterprise_verify_reason;
            }

            public int getFavoriting_count() {
                return favoriting_count;
            }

            public void setFavoriting_count(int favoriting_count) {
                this.favoriting_count = favoriting_count;
            }

            public int getFb_expire_time() {
                return fb_expire_time;
            }

            public void setFb_expire_time(int fb_expire_time) {
                this.fb_expire_time = fb_expire_time;
            }

            public int getFollow_status() {
                return follow_status;
            }

            public void setFollow_status(int follow_status) {
                this.follow_status = follow_status;
            }

            public int getFollower_count() {
                return follower_count;
            }

            public void setFollower_count(int follower_count) {
                this.follower_count = follower_count;
            }

            public int getFollower_status() {
                return follower_status;
            }

            public void setFollower_status(int follower_status) {
                this.follower_status = follower_status;
            }

            public Object getFollowers_detail() {
                return followers_detail;
            }

            public void setFollowers_detail(Object followers_detail) {
                this.followers_detail = followers_detail;
            }

            public int getFollowing_count() {
                return following_count;
            }

            public void setFollowing_count(int following_count) {
                this.following_count = following_count;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public Object getGeofencing() {
                return geofencing;
            }

            public void setGeofencing(Object geofencing) {
                this.geofencing = geofencing;
            }

            public String getGoogle_account() {
                return google_account;
            }

            public void setGoogle_account(String google_account) {
                this.google_account = google_account;
            }

            public boolean isHas_email() {
                return has_email;
            }

            public void setHas_email(boolean has_email) {
                this.has_email = has_email;
            }

            public boolean isHas_facebook_token() {
                return has_facebook_token;
            }

            public void setHas_facebook_token(boolean has_facebook_token) {
                this.has_facebook_token = has_facebook_token;
            }

            public boolean isHas_insights() {
                return has_insights;
            }

            public void setHas_insights(boolean has_insights) {
                this.has_insights = has_insights;
            }

            public boolean isHas_orders() {
                return has_orders;
            }

            public void setHas_orders(boolean has_orders) {
                this.has_orders = has_orders;
            }

            public boolean isHas_twitter_token() {
                return has_twitter_token;
            }

            public void setHas_twitter_token(boolean has_twitter_token) {
                this.has_twitter_token = has_twitter_token;
            }

            public boolean isHas_unread_story() {
                return has_unread_story;
            }

            public void setHas_unread_story(boolean has_unread_story) {
                this.has_unread_story = has_unread_story;
            }

            public boolean isHas_youtube_token() {
                return has_youtube_token;
            }

            public void setHas_youtube_token(boolean has_youtube_token) {
                this.has_youtube_token = has_youtube_token;
            }

            public boolean isHide_location() {
                return hide_location;
            }

            public void setHide_location(boolean hide_location) {
                this.hide_location = hide_location;
            }

            public boolean isHide_search() {
                return hide_search;
            }

            public void setHide_search(boolean hide_search) {
                this.hide_search = hide_search;
            }

            public String getIns_id() {
                return ins_id;
            }

            public void setIns_id(String ins_id) {
                this.ins_id = ins_id;
            }

            public boolean isIs_ad_fake() {
                return is_ad_fake;
            }

            public void setIs_ad_fake(boolean is_ad_fake) {
                this.is_ad_fake = is_ad_fake;
            }

            public boolean isIs_binded_weibo() {
                return is_binded_weibo;
            }

            public void setIs_binded_weibo(boolean is_binded_weibo) {
                this.is_binded_weibo = is_binded_weibo;
            }

            public boolean isIs_block() {
                return is_block;
            }

            public void setIs_block(boolean is_block) {
                this.is_block = is_block;
            }

            public boolean isIs_discipline_member() {
                return is_discipline_member;
            }

            public void setIs_discipline_member(boolean is_discipline_member) {
                this.is_discipline_member = is_discipline_member;
            }

            public boolean isIs_gov_media_vip() {
                return is_gov_media_vip;
            }

            public void setIs_gov_media_vip(boolean is_gov_media_vip) {
                this.is_gov_media_vip = is_gov_media_vip;
            }

            public boolean isIs_phone_binded() {
                return is_phone_binded;
            }

            public void setIs_phone_binded(boolean is_phone_binded) {
                this.is_phone_binded = is_phone_binded;
            }

            public boolean isIs_star() {
                return is_star;
            }

            public void setIs_star(boolean is_star) {
                this.is_star = is_star;
            }

            public boolean isIs_verified() {
                return is_verified;
            }

            public void setIs_verified(boolean is_verified) {
                this.is_verified = is_verified;
            }

            public Object getItem_list() {
                return item_list;
            }

            public void setItem_list(Object item_list) {
                this.item_list = item_list;
            }

            public String getLanguage() {
                return language;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public int getLive_agreement() {
                return live_agreement;
            }

            public void setLive_agreement(int live_agreement) {
                this.live_agreement = live_agreement;
            }

            public int getLive_agreement_time() {
                return live_agreement_time;
            }

            public void setLive_agreement_time(int live_agreement_time) {
                this.live_agreement_time = live_agreement_time;
            }

            public boolean isLive_commerce() {
                return live_commerce;
            }

            public void setLive_commerce(boolean live_commerce) {
                this.live_commerce = live_commerce;
            }

            public int getLive_verify() {
                return live_verify;
            }

            public void setLive_verify(int live_verify) {
                this.live_verify = live_verify;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public int getNeed_recommend() {
                return need_recommend;
            }

            public void setNeed_recommend(int need_recommend) {
                this.need_recommend = need_recommend;
            }

            public int getNeiguang_shield() {
                return neiguang_shield;
            }

            public void setNeiguang_shield(int neiguang_shield) {
                this.neiguang_shield = neiguang_shield;
            }

            public Object getNew_story_cover() {
                return new_story_cover;
            }

            public void setNew_story_cover(Object new_story_cover) {
                this.new_story_cover = new_story_cover;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public Object getPlatform_sync_info() {
                return platform_sync_info;
            }

            public void setPlatform_sync_info(Object platform_sync_info) {
                this.platform_sync_info = platform_sync_info;
            }

            public boolean isPrevent_download() {
                return prevent_download;
            }

            public void setPrevent_download(boolean prevent_download) {
                this.prevent_download = prevent_download;
            }

            public int getReact_setting() {
                return react_setting;
            }

            public void setReact_setting(int react_setting) {
                this.react_setting = react_setting;
            }

            public int getReflow_page_gid() {
                return reflow_page_gid;
            }

            public void setReflow_page_gid(int reflow_page_gid) {
                this.reflow_page_gid = reflow_page_gid;
            }

            public int getReflow_page_uid() {
                return reflow_page_uid;
            }

            public void setReflow_page_uid(int reflow_page_uid) {
                this.reflow_page_uid = reflow_page_uid;
            }

            public String getRegion() {
                return region;
            }

            public void setRegion(String region) {
                this.region = region;
            }

            public Object getRelative_users() {
                return relative_users;
            }

            public void setRelative_users(Object relative_users) {
                this.relative_users = relative_users;
            }

//            public int getRoom_id() {
//                return room_id;
//            }
//
//            public void setRoom_id(int room_id) {
//                this.room_id = room_id;
//            }

            public String getSchool_name() {
                return school_name;
            }

            public void setSchool_name(String school_name) {
                this.school_name = school_name;
            }

            public String getSchool_poi_id() {
                return school_poi_id;
            }

            public void setSchool_poi_id(String school_poi_id) {
                this.school_poi_id = school_poi_id;
            }

            public int getSchool_type() {
                return school_type;
            }

            public void setSchool_type(int school_type) {
                this.school_type = school_type;
            }

            public String getSec_uid() {
                return sec_uid;
            }

            public void setSec_uid(String sec_uid) {
                this.sec_uid = sec_uid;
            }

            public int getSecret() {
                return secret;
            }

            public void setSecret(int secret) {
                this.secret = secret;
            }

            public ShareInfoBean getShare_info() {
                return share_info;
            }

            public void setShare_info(ShareInfoBean share_info) {
                this.share_info = share_info;
            }

            public String getShare_qrcode_uri() {
                return share_qrcode_uri;
            }

            public void setShare_qrcode_uri(String share_qrcode_uri) {
                this.share_qrcode_uri = share_qrcode_uri;
            }

            public int getShield_comment_notice() {
                return shield_comment_notice;
            }

            public void setShield_comment_notice(int shield_comment_notice) {
                this.shield_comment_notice = shield_comment_notice;
            }

            public int getShield_digg_notice() {
                return shield_digg_notice;
            }

            public void setShield_digg_notice(int shield_digg_notice) {
                this.shield_digg_notice = shield_digg_notice;
            }

            public int getShield_follow_notice() {
                return shield_follow_notice;
            }

            public void setShield_follow_notice(int shield_follow_notice) {
                this.shield_follow_notice = shield_follow_notice;
            }

            public String getShort_id() {
                return short_id;
            }

            public void setShort_id(String short_id) {
                this.short_id = short_id;
            }

            public boolean isShow_image_bubble() {
                return show_image_bubble;
            }

            public void setShow_image_bubble(boolean show_image_bubble) {
                this.show_image_bubble = show_image_bubble;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public int getSpecial_lock() {
                return special_lock;
            }

            public void setSpecial_lock(int special_lock) {
                this.special_lock = special_lock;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getStory_count() {
                return story_count;
            }

            public void setStory_count(int story_count) {
                this.story_count = story_count;
            }

            public boolean isStory_open() {
                return story_open;
            }

            public void setStory_open(boolean story_open) {
                this.story_open = story_open;
            }

            public int getSync_to_toutiao() {
                return sync_to_toutiao;
            }

            public void setSync_to_toutiao(int sync_to_toutiao) {
                this.sync_to_toutiao = sync_to_toutiao;
            }

            public int getTotal_favorited() {
                return total_favorited;
            }

            public void setTotal_favorited(int total_favorited) {
                this.total_favorited = total_favorited;
            }

            public int getTw_expire_time() {
                return tw_expire_time;
            }

            public void setTw_expire_time(int tw_expire_time) {
                this.tw_expire_time = tw_expire_time;
            }

            public String getTwitter_id() {
                return twitter_id;
            }

            public void setTwitter_id(String twitter_id) {
                this.twitter_id = twitter_id;
            }

            public String getTwitter_name() {
                return twitter_name;
            }

            public void setTwitter_name(String twitter_name) {
                this.twitter_name = twitter_name;
            }

            public Object getType_label() {
                return type_label;
            }

            public void setType_label(Object type_label) {
                this.type_label = type_label;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getUnique_id() {
                return unique_id;
            }

            public void setUnique_id(String unique_id) {
                this.unique_id = unique_id;
            }

            public int getUnique_id_modify_time() {
                return unique_id_modify_time;
            }

            public void setUnique_id_modify_time(int unique_id_modify_time) {
                this.unique_id_modify_time = unique_id_modify_time;
            }

            public boolean isUser_canceled() {
                return user_canceled;
            }

            public void setUser_canceled(boolean user_canceled) {
                this.user_canceled = user_canceled;
            }

            public int getUser_mode() {
                return user_mode;
            }

            public void setUser_mode(int user_mode) {
                this.user_mode = user_mode;
            }

            public int getUser_period() {
                return user_period;
            }

            public void setUser_period(int user_period) {
                this.user_period = user_period;
            }

            public int getUser_rate() {
                return user_rate;
            }

            public void setUser_rate(int user_rate) {
                this.user_rate = user_rate;
            }

            public int getVerification_type() {
                return verification_type;
            }

            public void setVerification_type(int verification_type) {
                this.verification_type = verification_type;
            }

            public String getVerify_info() {
                return verify_info;
            }

            public void setVerify_info(String verify_info) {
                this.verify_info = verify_info;
            }

            public VideoIconBean getVideo_icon() {
                return video_icon;
            }

            public void setVideo_icon(VideoIconBean video_icon) {
                this.video_icon = video_icon;
            }

            public String getWeibo_name() {
                return weibo_name;
            }

            public void setWeibo_name(String weibo_name) {
                this.weibo_name = weibo_name;
            }

            public String getWeibo_schema() {
                return weibo_schema;
            }

            public void setWeibo_schema(String weibo_schema) {
                this.weibo_schema = weibo_schema;
            }

            public String getWeibo_url() {
                return weibo_url;
            }

            public void setWeibo_url(String weibo_url) {
                this.weibo_url = weibo_url;
            }

            public String getWeibo_verify() {
                return weibo_verify;
            }

            public void setWeibo_verify(String weibo_verify) {
                this.weibo_verify = weibo_verify;
            }

            public boolean isWith_commerce_entry() {
                return with_commerce_entry;
            }

            public void setWith_commerce_entry(boolean with_commerce_entry) {
                this.with_commerce_entry = with_commerce_entry;
            }

            public boolean isWith_dou_entry() {
                return with_dou_entry;
            }

            public void setWith_dou_entry(boolean with_dou_entry) {
                this.with_dou_entry = with_dou_entry;
            }

            public boolean isWith_fusion_shop_entry() {
                return with_fusion_shop_entry;
            }

            public void setWith_fusion_shop_entry(boolean with_fusion_shop_entry) {
                this.with_fusion_shop_entry = with_fusion_shop_entry;
            }

            public boolean isWith_shop_entry() {
                return with_shop_entry;
            }

            public void setWith_shop_entry(boolean with_shop_entry) {
                this.with_shop_entry = with_shop_entry;
            }

            public String getYoutube_channel_id() {
                return youtube_channel_id;
            }

            public void setYoutube_channel_id(String youtube_channel_id) {
                this.youtube_channel_id = youtube_channel_id;
            }

            public String getYoutube_channel_title() {
                return youtube_channel_title;
            }

            public void setYoutube_channel_title(String youtube_channel_title) {
                this.youtube_channel_title = youtube_channel_title;
            }

            public int getYoutube_expire_time() {
                return youtube_expire_time;
            }

            public void setYoutube_expire_time(int youtube_expire_time) {
                this.youtube_expire_time = youtube_expire_time;
            }

            public List<CoverUrlBean> getCover_url() {
                return cover_url;
            }

            public void setCover_url(List<CoverUrlBean> cover_url) {
                this.cover_url = cover_url;
            }

            public static class Avatar168x168Bean {
                /**
                 * height : 720
                 * uri : 168x168/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465
                 * url_list : ["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_168x168.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_168x168.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_168x168.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_168x168.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class Avatar300x300Bean {
                /**
                 * height : 720
                 * uri : 300x300/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465
                 * url_list : ["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_300x300.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_300x300.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_300x300.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_300x300.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class AvatarLargerBean {
                /**
                 * height : 720
                 * uri : 1080x1080/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465
                 * url_list : ["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class AvatarMediumBean {
                /**
                 * height : 720
                 * uri : 720x720/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465
                 * url_list : ["https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class AvatarThumbBean {
                /**
                 * height : 720
                 * uri : 100x100/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465
                 * url_list : ["https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class ShareInfoBean {
                /**
                 * share_desc :
                 * share_qrcode_url : {"height":720,"uri":"75a400194d43b16d8958","url_list":["https://p9-dy.byteimg.com/obj/75a400194d43b16d8958?from=2563711402","https://p6-dy-ipv6.byteimg.com/obj/75a400194d43b16d8958?from=2563711402","https://p29-dy.byteimg.com/obj/75a400194d43b16d8958?from=2563711402"],"width":720}
                 * share_title :
                 * share_title_myself :
                 * share_title_other :
                 * share_url :
                 * share_weibo_desc :
                 */

                private String share_desc;
                private ShareQrcodeUrlBean share_qrcode_url;
                private String share_title;
                private String share_title_myself;
                private String share_title_other;
                private String share_url;
                private String share_weibo_desc;

                public String getShare_desc() {
                    return share_desc;
                }

                public void setShare_desc(String share_desc) {
                    this.share_desc = share_desc;
                }

                public ShareQrcodeUrlBean getShare_qrcode_url() {
                    return share_qrcode_url;
                }

                public void setShare_qrcode_url(ShareQrcodeUrlBean share_qrcode_url) {
                    this.share_qrcode_url = share_qrcode_url;
                }

                public String getShare_title() {
                    return share_title;
                }

                public void setShare_title(String share_title) {
                    this.share_title = share_title;
                }

                public String getShare_title_myself() {
                    return share_title_myself;
                }

                public void setShare_title_myself(String share_title_myself) {
                    this.share_title_myself = share_title_myself;
                }

                public String getShare_title_other() {
                    return share_title_other;
                }

                public void setShare_title_other(String share_title_other) {
                    this.share_title_other = share_title_other;
                }

                public String getShare_url() {
                    return share_url;
                }

                public void setShare_url(String share_url) {
                    this.share_url = share_url;
                }

                public String getShare_weibo_desc() {
                    return share_weibo_desc;
                }

                public void setShare_weibo_desc(String share_weibo_desc) {
                    this.share_weibo_desc = share_weibo_desc;
                }

                public static class ShareQrcodeUrlBean {
                    /**
                     * height : 720
                     * uri : 75a400194d43b16d8958
                     * url_list : ["https://p9-dy.byteimg.com/obj/75a400194d43b16d8958?from=2563711402","https://p6-dy-ipv6.byteimg.com/obj/75a400194d43b16d8958?from=2563711402","https://p29-dy.byteimg.com/obj/75a400194d43b16d8958?from=2563711402"]
                     * width : 720
                     */

                    private int height;
                    private String uri;
                    private int width;
                    private List<String> url_list;

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }
            }

            public static class VideoIconBean {
                /**
                 * height : 720
                 * uri :
                 * url_list : null
                 * width : 720
                 */

                private int height;
                private String uri;
                private Object url_list;
                private int width;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public Object getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(Object url_list) {
                    this.url_list = url_list;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }
            }

            public static class CoverUrlBean {
                /**
                 * height : 720
                 * uri : c8510002be9a3a61aad2
                 * url_list : ["https://p26-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }
        }

        public static class AwemeControlBean {
            /**
             * can_comment : true
             * can_forward : true
             * can_share : true
             * can_show_comment : true
             */

            private boolean can_comment;
            private boolean can_forward;
            private boolean can_share;
            private boolean can_show_comment;

            public boolean isCan_comment() {
                return can_comment;
            }

            public void setCan_comment(boolean can_comment) {
                this.can_comment = can_comment;
            }

            public boolean isCan_forward() {
                return can_forward;
            }

            public void setCan_forward(boolean can_forward) {
                this.can_forward = can_forward;
            }

            public boolean isCan_share() {
                return can_share;
            }

            public void setCan_share(boolean can_share) {
                this.can_share = can_share;
            }

            public boolean isCan_show_comment() {
                return can_show_comment;
            }

            public void setCan_show_comment(boolean can_show_comment) {
                this.can_show_comment = can_show_comment;
            }
        }

        public static class LabelTopBean {
            /**
             * height : 720
             * uri : c150000f34767e2cb56
             * url_list : ["https://p29-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p26-dy.byteimg.com/obj/c150000f34767e2cb56?from=2563711402","https://p6-dy-ipv6.byteimg.com/obj/c150000f34767e2cb56?from=2563711402"]
             * width : 720
             */

            private int height;
            private String uri;
            private int width;
            private List<String> url_list;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<String> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<String> url_list) {
                this.url_list = url_list;
            }
        }

        public static class MixInfoBean {
            /**
             * cover_url : {"height":720,"uri":"tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7","url_list":["https://p6-dy-ipv6.byteimg.com/obj/tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7?from=2563711402","https://p26-dy.byteimg.com/obj/tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7?from=2563711402"],"width":720}
             * desc :
             * extra : {"audit_locktime":1602313759,"ban_fields":[],"first_reviewed":1,"is_quality_mix":0,"next_info":{"cover":"tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7","desc":"","name":"感动落泪的情感"},"origin_challenge_content":"爱情"}
             * mix_id : 6875036611659171848
             * mix_name : 感动落泪的情感
             * share_info : {"share_desc":"在抖音，记录美好生活","share_title":"这么有趣的合集，不能只有我一个人知道吧","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/mix/detail/6875036611659171848/?schema_type=24&object_id=6875036611659171848","share_weibo_desc":"这么有趣的合集，不能只有我一个人知道吧"}
             * statis : {"collect_vv":0,"current_episode":47,"play_vv":0,"updated_to_episode":57}
             * status : {"is_collected":0,"status":2}
             */

            private CoverUrlBeanX cover_url;
            private String desc;
            private String extra;
            private String mix_id;
            private String mix_name;
            private ShareInfoBeanX share_info;
            private StatisBean statis;
            private StatusBean status;

            public CoverUrlBeanX getCover_url() {
                return cover_url;
            }

            public void setCover_url(CoverUrlBeanX cover_url) {
                this.cover_url = cover_url;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getExtra() {
                return extra;
            }

            public void setExtra(String extra) {
                this.extra = extra;
            }

            public String getMix_id() {
                return mix_id;
            }

            public void setMix_id(String mix_id) {
                this.mix_id = mix_id;
            }

            public String getMix_name() {
                return mix_name;
            }

            public void setMix_name(String mix_name) {
                this.mix_name = mix_name;
            }

            public ShareInfoBeanX getShare_info() {
                return share_info;
            }

            public void setShare_info(ShareInfoBeanX share_info) {
                this.share_info = share_info;
            }

            public StatisBean getStatis() {
                return statis;
            }

            public void setStatis(StatisBean statis) {
                this.statis = statis;
            }

            public StatusBean getStatus() {
                return status;
            }

            public void setStatus(StatusBean status) {
                this.status = status;
            }

            public static class CoverUrlBeanX {
                /**
                 * height : 720
                 * uri : tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7
                 * url_list : ["https://p6-dy-ipv6.byteimg.com/obj/tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7?from=2563711402","https://p26-dy.byteimg.com/obj/tos-cn-i-0813/296d004fe53a4d9b91b5a5691029bcb7?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class ShareInfoBeanX {
                /**
                 * share_desc : 在抖音，记录美好生活
                 * share_title : 这么有趣的合集，不能只有我一个人知道吧
                 * share_title_myself :
                 * share_title_other :
                 * share_url : https://www.iesdouyin.com/share/mix/detail/6875036611659171848/?schema_type=24&object_id=6875036611659171848
                 * share_weibo_desc : 这么有趣的合集，不能只有我一个人知道吧
                 */

                private String share_desc;
                private String share_title;
                private String share_title_myself;
                private String share_title_other;
                private String share_url;
                private String share_weibo_desc;

                public String getShare_desc() {
                    return share_desc;
                }

                public void setShare_desc(String share_desc) {
                    this.share_desc = share_desc;
                }

                public String getShare_title() {
                    return share_title;
                }

                public void setShare_title(String share_title) {
                    this.share_title = share_title;
                }

                public String getShare_title_myself() {
                    return share_title_myself;
                }

                public void setShare_title_myself(String share_title_myself) {
                    this.share_title_myself = share_title_myself;
                }

                public String getShare_title_other() {
                    return share_title_other;
                }

                public void setShare_title_other(String share_title_other) {
                    this.share_title_other = share_title_other;
                }

                public String getShare_url() {
                    return share_url;
                }

                public void setShare_url(String share_url) {
                    this.share_url = share_url;
                }

                public String getShare_weibo_desc() {
                    return share_weibo_desc;
                }

                public void setShare_weibo_desc(String share_weibo_desc) {
                    this.share_weibo_desc = share_weibo_desc;
                }
            }

            public static class StatisBean {
                /**
                 * collect_vv : 0
                 * current_episode : 47
                 * play_vv : 0
                 * updated_to_episode : 57
                 */

                private int collect_vv;
                private int current_episode;
                private int play_vv;
                private int updated_to_episode;

                public int getCollect_vv() {
                    return collect_vv;
                }

                public void setCollect_vv(int collect_vv) {
                    this.collect_vv = collect_vv;
                }

                public int getCurrent_episode() {
                    return current_episode;
                }

                public void setCurrent_episode(int current_episode) {
                    this.current_episode = current_episode;
                }

                public int getPlay_vv() {
                    return play_vv;
                }

                public void setPlay_vv(int play_vv) {
                    this.play_vv = play_vv;
                }

                public int getUpdated_to_episode() {
                    return updated_to_episode;
                }

                public void setUpdated_to_episode(int updated_to_episode) {
                    this.updated_to_episode = updated_to_episode;
                }
            }

            public static class StatusBean {
                /**
                 * is_collected : 0
                 * status : 2
                 */

                private int is_collected;
                private int status;

                public int getIs_collected() {
                    return is_collected;
                }

                public void setIs_collected(int is_collected) {
                    this.is_collected = is_collected;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }
            }
        }

        public static class MusicBean {
            /**
             * album :
             * author : 富哥剪辑
             * author_deleted : false
             * author_position : null
             * avatar_large : {"height":720,"uri":"1080x1080/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.jpeg?from=2563711402"],"width":720}
             * avatar_medium : {"height":720,"uri":"720x720/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.jpeg?from=2563711402"],"width":720}
             * avatar_thumb : {"height":720,"uri":"100x100/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.jpeg?from=2563711402"],"width":720}
             * binded_challenge_id : 0
             * collect_stat : 0
             * cover_hd : {"height":720,"uri":"1080x1080/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.jpeg?from=2563711402"],"width":720}
             * cover_large : {"height":720,"uri":"1080x1080/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.jpeg?from=2563711402"],"width":720}
             * cover_medium : {"height":720,"uri":"720x720/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.jpeg?from=2563711402"],"width":720}
             * cover_thumb : {"height":720,"uri":"100x100/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465","url_list":["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.jpeg?from=2563711402"],"width":720}
             * duration : 106
             * end_time : 0
             * external_song_info : null
             * extra : {"reviewed":0,"review_unshelve_reason":0,"beats":{},"hotsoon_review_time":-1,"has_edited":0,"douyin_beats_info":{},"schedule_search_time":0,"music_label_id":null,"aggregate_exempt_conf":[]}
             * id : 6883369629134179086
             * id_str : 6883369629134179086
             * is_author_artist : false
             * is_del_video : false
             * is_original : false
             * is_pgc : false
             * is_restricted : false
             * is_video_self_see : false
             * mid : 6883369629134179086
             * mute_share : false
             * offline_desc :
             * owner_handle : 667540735
             * owner_id : 93953372365
             * owner_nickname : 富哥剪辑
             * play_url : {"height":720,"uri":"https://p9-dy.byteimg.com/obj/ies-music/6883369590966274830.mp3","url_list":["https://p9-dy.byteimg.com/obj/ies-music/6883369590966274830.mp3","https://p1-dy.byteimg.com/obj/ies-music/6883369590966274830.mp3"],"width":720}
             * position : null
             * prevent_download : false
             * prevent_item_download_status : 0
             * preview_end_time : 0
             * preview_start_time : 0
             * redirect : false
             * schema_url :
             * sec_uid : MS4wLjABAAAAEJ3R3913q0RGJKjI7TawVHugUSh6lEe0K5ysuJTH39I
             * source_platform : 23
             * start_time : 0
             * status : 1
             * title : @富哥剪辑创作的原声
             * unshelve_countries : null
             * user_count : 0
             */

            private String album;
            private String author;
            private boolean author_deleted;
            private Object author_position;
            private AvatarLargeBean avatar_large;
            private AvatarMediumBeanX avatar_medium;
            private AvatarThumbBeanX avatar_thumb;
            private int binded_challenge_id;
            private int collect_stat;
            private CoverHdBean cover_hd;
            private CoverLargeBean cover_large;
            private CoverMediumBean cover_medium;
            private CoverThumbBean cover_thumb;
            private int duration;
            private int end_time;
            private Object external_song_info;
            private String extra;
            private long id;
            private String id_str;
            private boolean is_author_artist;
            private boolean is_del_video;
            private boolean is_original;
            private boolean is_pgc;
            private boolean is_restricted;
            private boolean is_video_self_see;
            private String mid;
            private boolean mute_share;
            private String offline_desc;
            private String owner_handle;
            private String owner_id;
            private String owner_nickname;
            private PlayUrlBean play_url;
            private Object position;
            private boolean prevent_download;
            private int prevent_item_download_status;
            private int preview_end_time;
            private int preview_start_time;
            private boolean redirect;
            private String schema_url;
            private String sec_uid;
            private int source_platform;
            private int start_time;
            private int status;
            private String title;
            private Object unshelve_countries;
            private int user_count;

            public String getAlbum() {
                return album;
            }

            public void setAlbum(String album) {
                this.album = album;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isAuthor_deleted() {
                return author_deleted;
            }

            public void setAuthor_deleted(boolean author_deleted) {
                this.author_deleted = author_deleted;
            }

            public Object getAuthor_position() {
                return author_position;
            }

            public void setAuthor_position(Object author_position) {
                this.author_position = author_position;
            }

            public AvatarLargeBean getAvatar_large() {
                return avatar_large;
            }

            public void setAvatar_large(AvatarLargeBean avatar_large) {
                this.avatar_large = avatar_large;
            }

            public AvatarMediumBeanX getAvatar_medium() {
                return avatar_medium;
            }

            public void setAvatar_medium(AvatarMediumBeanX avatar_medium) {
                this.avatar_medium = avatar_medium;
            }

            public AvatarThumbBeanX getAvatar_thumb() {
                return avatar_thumb;
            }

            public void setAvatar_thumb(AvatarThumbBeanX avatar_thumb) {
                this.avatar_thumb = avatar_thumb;
            }

            public int getBinded_challenge_id() {
                return binded_challenge_id;
            }

            public void setBinded_challenge_id(int binded_challenge_id) {
                this.binded_challenge_id = binded_challenge_id;
            }

            public int getCollect_stat() {
                return collect_stat;
            }

            public void setCollect_stat(int collect_stat) {
                this.collect_stat = collect_stat;
            }

            public CoverHdBean getCover_hd() {
                return cover_hd;
            }

            public void setCover_hd(CoverHdBean cover_hd) {
                this.cover_hd = cover_hd;
            }

            public CoverLargeBean getCover_large() {
                return cover_large;
            }

            public void setCover_large(CoverLargeBean cover_large) {
                this.cover_large = cover_large;
            }

            public CoverMediumBean getCover_medium() {
                return cover_medium;
            }

            public void setCover_medium(CoverMediumBean cover_medium) {
                this.cover_medium = cover_medium;
            }

            public CoverThumbBean getCover_thumb() {
                return cover_thumb;
            }

            public void setCover_thumb(CoverThumbBean cover_thumb) {
                this.cover_thumb = cover_thumb;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getEnd_time() {
                return end_time;
            }

            public void setEnd_time(int end_time) {
                this.end_time = end_time;
            }

            public Object getExternal_song_info() {
                return external_song_info;
            }

            public void setExternal_song_info(Object external_song_info) {
                this.external_song_info = external_song_info;
            }

            public String getExtra() {
                return extra;
            }

            public void setExtra(String extra) {
                this.extra = extra;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public String getId_str() {
                return id_str;
            }

            public void setId_str(String id_str) {
                this.id_str = id_str;
            }

            public boolean isIs_author_artist() {
                return is_author_artist;
            }

            public void setIs_author_artist(boolean is_author_artist) {
                this.is_author_artist = is_author_artist;
            }

            public boolean isIs_del_video() {
                return is_del_video;
            }

            public void setIs_del_video(boolean is_del_video) {
                this.is_del_video = is_del_video;
            }

            public boolean isIs_original() {
                return is_original;
            }

            public void setIs_original(boolean is_original) {
                this.is_original = is_original;
            }

            public boolean isIs_pgc() {
                return is_pgc;
            }

            public void setIs_pgc(boolean is_pgc) {
                this.is_pgc = is_pgc;
            }

            public boolean isIs_restricted() {
                return is_restricted;
            }

            public void setIs_restricted(boolean is_restricted) {
                this.is_restricted = is_restricted;
            }

            public boolean isIs_video_self_see() {
                return is_video_self_see;
            }

            public void setIs_video_self_see(boolean is_video_self_see) {
                this.is_video_self_see = is_video_self_see;
            }

            public String getMid() {
                return mid;
            }

            public void setMid(String mid) {
                this.mid = mid;
            }

            public boolean isMute_share() {
                return mute_share;
            }

            public void setMute_share(boolean mute_share) {
                this.mute_share = mute_share;
            }

            public String getOffline_desc() {
                return offline_desc;
            }

            public void setOffline_desc(String offline_desc) {
                this.offline_desc = offline_desc;
            }

            public String getOwner_handle() {
                return owner_handle;
            }

            public void setOwner_handle(String owner_handle) {
                this.owner_handle = owner_handle;
            }

            public String getOwner_id() {
                return owner_id;
            }

            public void setOwner_id(String owner_id) {
                this.owner_id = owner_id;
            }

            public String getOwner_nickname() {
                return owner_nickname;
            }

            public void setOwner_nickname(String owner_nickname) {
                this.owner_nickname = owner_nickname;
            }

            public PlayUrlBean getPlay_url() {
                return play_url;
            }

            public void setPlay_url(PlayUrlBean play_url) {
                this.play_url = play_url;
            }

            public Object getPosition() {
                return position;
            }

            public void setPosition(Object position) {
                this.position = position;
            }

            public boolean isPrevent_download() {
                return prevent_download;
            }

            public void setPrevent_download(boolean prevent_download) {
                this.prevent_download = prevent_download;
            }

            public int getPrevent_item_download_status() {
                return prevent_item_download_status;
            }

            public void setPrevent_item_download_status(int prevent_item_download_status) {
                this.prevent_item_download_status = prevent_item_download_status;
            }

            public int getPreview_end_time() {
                return preview_end_time;
            }

            public void setPreview_end_time(int preview_end_time) {
                this.preview_end_time = preview_end_time;
            }

            public int getPreview_start_time() {
                return preview_start_time;
            }

            public void setPreview_start_time(int preview_start_time) {
                this.preview_start_time = preview_start_time;
            }

            public boolean isRedirect() {
                return redirect;
            }

            public void setRedirect(boolean redirect) {
                this.redirect = redirect;
            }

            public String getSchema_url() {
                return schema_url;
            }

            public void setSchema_url(String schema_url) {
                this.schema_url = schema_url;
            }

            public String getSec_uid() {
                return sec_uid;
            }

            public void setSec_uid(String sec_uid) {
                this.sec_uid = sec_uid;
            }

            public int getSource_platform() {
                return source_platform;
            }

            public void setSource_platform(int source_platform) {
                this.source_platform = source_platform;
            }

            public int getStart_time() {
                return start_time;
            }

            public void setStart_time(int start_time) {
                this.start_time = start_time;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public Object getUnshelve_countries() {
                return unshelve_countries;
            }

            public void setUnshelve_countries(Object unshelve_countries) {
                this.unshelve_countries = unshelve_countries;
            }

            public int getUser_count() {
                return user_count;
            }

            public void setUser_count(int user_count) {
                this.user_count = user_count;
            }

            public static class AvatarLargeBean {
                /**
                 * height : 720
                 * uri : 1080x1080/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465
                 * url_list : ["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class AvatarMediumBeanX {
                /**
                 * height : 720
                 * uri : 720x720/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465
                 * url_list : ["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class AvatarThumbBeanX {
                /**
                 * height : 720
                 * uri : 100x100/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465
                 * url_list : ["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverHdBean {
                /**
                 * height : 720
                 * uri : 1080x1080/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465
                 * url_list : ["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverLargeBean {
                /**
                 * height : 720
                 * uri : 1080x1080/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465
                 * url_list : ["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_1080x1080.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverMediumBean {
                /**
                 * height : 720
                 * uri : 720x720/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465
                 * url_list : ["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_720x720.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverThumbBean {
                /**
                 * height : 720
                 * uri : 100x100/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465
                 * url_list : ["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.webp?from=2563711402","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5f87b786669b01a9bc5e6bda3b7c0465~c5_100x100.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class PlayUrlBean {
                /**
                 * height : 720
                 * uri : https://p9-dy.byteimg.com/obj/ies-music/6883369590966274830.mp3
                 * url_list : ["https://p9-dy.byteimg.com/obj/ies-music/6883369590966274830.mp3","https://p1-dy.byteimg.com/obj/ies-music/6883369590966274830.mp3"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }
        }

        public static class OpenPlatformInfoBean {
            /**
             * icon : https://sf1-dycdn-tos.pstatp.com/obj/douyin-web-image/b22313de3911b1169d1064198d589bc1
             * link : https://lv.ulikecam.com/act/lv-feed?aweme_item_id=6883369550809779459&from=singlemessage&hide_nav_bar=1&should_full_screen=true
             * name : 剪映-视频制作
             */

            private String icon;
            private String link;
            private String name;

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class RiskInfosBean {
            /**
             * content :
             * risk_sink : false
             * type : 0
             * vote : false
             * warn : false
             */

            private String content;
            private boolean risk_sink;
            private int type;
            private boolean vote;
            private boolean warn;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public boolean isRisk_sink() {
                return risk_sink;
            }

            public void setRisk_sink(boolean risk_sink) {
                this.risk_sink = risk_sink;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public boolean isVote() {
                return vote;
            }

            public void setVote(boolean vote) {
                this.vote = vote;
            }

            public boolean isWarn() {
                return warn;
            }

            public void setWarn(boolean warn) {
                this.warn = warn;
            }
        }

        public static class ShareInfoBeanXX {
            /**
             * bool_persist : 0
             * share_desc : 在抖音，记录美好生活
             * share_link_desc : 为了梦想勇敢迈出那一部  %s 复制此链接，打开抖音，直接观看视频！
             * share_quote :
             * share_signature_desc :
             * share_signature_url :
             * share_title : 为了梦想勇敢迈出那一部
             * share_title_myself :
             * share_title_other :
             * share_url : https://www.iesdouyin.com/share/video/6883369550809779459/?region=CN&mid=6883369629134179086&u_code=i0kji679&titleType=title&did=71471896106&iid=3993023441537288
             * share_weibo_desc : #在抖音，记录美好生活#为了梦想勇敢迈出那一部
             */

            private int bool_persist;
            private String share_desc;
            private String share_link_desc;
            private String share_quote;
            private String share_signature_desc;
            private String share_signature_url;
            private String share_title;
            private String share_title_myself;
            private String share_title_other;
            private String share_url;
            private String share_weibo_desc;

            public int getBool_persist() {
                return bool_persist;
            }

            public void setBool_persist(int bool_persist) {
                this.bool_persist = bool_persist;
            }

            public String getShare_desc() {
                return share_desc;
            }

            public void setShare_desc(String share_desc) {
                this.share_desc = share_desc;
            }

            public String getShare_link_desc() {
                return share_link_desc;
            }

            public void setShare_link_desc(String share_link_desc) {
                this.share_link_desc = share_link_desc;
            }

            public String getShare_quote() {
                return share_quote;
            }

            public void setShare_quote(String share_quote) {
                this.share_quote = share_quote;
            }

            public String getShare_signature_desc() {
                return share_signature_desc;
            }

            public void setShare_signature_desc(String share_signature_desc) {
                this.share_signature_desc = share_signature_desc;
            }

            public String getShare_signature_url() {
                return share_signature_url;
            }

            public void setShare_signature_url(String share_signature_url) {
                this.share_signature_url = share_signature_url;
            }

            public String getShare_title() {
                return share_title;
            }

            public void setShare_title(String share_title) {
                this.share_title = share_title;
            }

            public String getShare_title_myself() {
                return share_title_myself;
            }

            public void setShare_title_myself(String share_title_myself) {
                this.share_title_myself = share_title_myself;
            }

            public String getShare_title_other() {
                return share_title_other;
            }

            public void setShare_title_other(String share_title_other) {
                this.share_title_other = share_title_other;
            }

            public String getShare_url() {
                return share_url;
            }

            public void setShare_url(String share_url) {
                this.share_url = share_url;
            }

            public String getShare_weibo_desc() {
                return share_weibo_desc;
            }

            public void setShare_weibo_desc(String share_weibo_desc) {
                this.share_weibo_desc = share_weibo_desc;
            }
        }

        public static class StatisticsBean {
            /**
             * aweme_id : 6883369550809779459
             * comment_count : 375
             * digg_count : 5316
             * download_count : 145
             * forward_count : 30
             * lose_comment_count : 0
             * lose_count : 0
             * play_count : 0
             * share_count : 138
             * whatsapp_share_count : 0
             */

            private String aweme_id;
            private int comment_count;
            private int digg_count;
            private int download_count;
            private int forward_count;
            private int lose_comment_count;
            private int lose_count;
            private int play_count;
            private int share_count;
            private int whatsapp_share_count;

            public String getAweme_id() {
                return aweme_id;
            }

            public void setAweme_id(String aweme_id) {
                this.aweme_id = aweme_id;
            }

            public int getComment_count() {
                return comment_count;
            }

            public void setComment_count(int comment_count) {
                this.comment_count = comment_count;
            }

            public int getDigg_count() {
                return digg_count;
            }

            public void setDigg_count(int digg_count) {
                this.digg_count = digg_count;
            }

            public int getDownload_count() {
                return download_count;
            }

            public void setDownload_count(int download_count) {
                this.download_count = download_count;
            }

            public int getForward_count() {
                return forward_count;
            }

            public void setForward_count(int forward_count) {
                this.forward_count = forward_count;
            }

            public int getLose_comment_count() {
                return lose_comment_count;
            }

            public void setLose_comment_count(int lose_comment_count) {
                this.lose_comment_count = lose_comment_count;
            }

            public int getLose_count() {
                return lose_count;
            }

            public void setLose_count(int lose_count) {
                this.lose_count = lose_count;
            }

            public int getPlay_count() {
                return play_count;
            }

            public void setPlay_count(int play_count) {
                this.play_count = play_count;
            }

            public int getShare_count() {
                return share_count;
            }

            public void setShare_count(int share_count) {
                this.share_count = share_count;
            }

            public int getWhatsapp_share_count() {
                return whatsapp_share_count;
            }

            public void setWhatsapp_share_count(int whatsapp_share_count) {
                this.whatsapp_share_count = whatsapp_share_count;
            }
        }

        public static class StatusBeanX {
            /**
             * allow_comment : true
             * allow_share : true
             * aweme_id : 6883369550809779459
             * download_status : 0
             * in_reviewing : false
             * is_delete : false
             * is_private : false
             * is_prohibited : false
             * private_status : 0
             * reviewed : 1
             * self_see : false
             * with_fusion_goods : false
             * with_goods : false
             */

            private boolean allow_comment;
            private boolean allow_share;
            private String aweme_id;
            private int download_status;
            private boolean in_reviewing;
            private boolean is_delete;
            private boolean is_private;
            private boolean is_prohibited;
            private int private_status;
            private int reviewed;
            private boolean self_see;
            private boolean with_fusion_goods;
            private boolean with_goods;

            public boolean isAllow_comment() {
                return allow_comment;
            }

            public void setAllow_comment(boolean allow_comment) {
                this.allow_comment = allow_comment;
            }

            public boolean isAllow_share() {
                return allow_share;
            }

            public void setAllow_share(boolean allow_share) {
                this.allow_share = allow_share;
            }

            public String getAweme_id() {
                return aweme_id;
            }

            public void setAweme_id(String aweme_id) {
                this.aweme_id = aweme_id;
            }

            public int getDownload_status() {
                return download_status;
            }

            public void setDownload_status(int download_status) {
                this.download_status = download_status;
            }

            public boolean isIn_reviewing() {
                return in_reviewing;
            }

            public void setIn_reviewing(boolean in_reviewing) {
                this.in_reviewing = in_reviewing;
            }

            public boolean isIs_delete() {
                return is_delete;
            }

            public void setIs_delete(boolean is_delete) {
                this.is_delete = is_delete;
            }

            public boolean isIs_private() {
                return is_private;
            }

            public void setIs_private(boolean is_private) {
                this.is_private = is_private;
            }

            public boolean isIs_prohibited() {
                return is_prohibited;
            }

            public void setIs_prohibited(boolean is_prohibited) {
                this.is_prohibited = is_prohibited;
            }

            public int getPrivate_status() {
                return private_status;
            }

            public void setPrivate_status(int private_status) {
                this.private_status = private_status;
            }

            public int getReviewed() {
                return reviewed;
            }

            public void setReviewed(int reviewed) {
                this.reviewed = reviewed;
            }

            public boolean isSelf_see() {
                return self_see;
            }

            public void setSelf_see(boolean self_see) {
                this.self_see = self_see;
            }

            public boolean isWith_fusion_goods() {
                return with_fusion_goods;
            }

            public void setWith_fusion_goods(boolean with_fusion_goods) {
                this.with_fusion_goods = with_fusion_goods;
            }

            public boolean isWith_goods() {
                return with_goods;
            }

            public void setWith_goods(boolean with_goods) {
                this.with_goods = with_goods;
            }
        }

        public static class UserProfileInitInfoBean {
            /**
             * head_model_score : 0.08498203754425049
             */

            private double head_model_score;

            public double getHead_model_score() {
                return head_model_score;
            }

            public void setHead_model_score(double head_model_score) {
                this.head_model_score = head_model_score;
            }
        }

        public static class VideoBean {
            /**
             * big_thumbs : [{"duration":106.041667,"fext":"jpg","img_num":106,"img_url":"http://p3-tt.bytecdn.cn/obj/tos-cn-p-0015/a112b1026651493fb40cb1ac75d4dc92_1602659377","img_x_len":10,"img_x_size":240,"img_y_len":11,"img_y_size":136,"interval":10,"uri":"tos-cn-p-0015/a112b1026651493fb40cb1ac75d4dc92_1602659377"}]
             * bit_rate : [{"bit_rate":1632768,"gear_name":"adapt_lowest_720","is_h265":1,"play_addr":{"data_size":21643369,"file_cs":"c:0-112145-aa72","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_720p_1632768","url_list":["http://v26-dy.ixigua.com/50c60b94c80b4ebef2730d64eeb33cac/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/b99c2c13640a871b5ddf95c442f2be48/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":21643369,"file_cs":"c:0-112145-aa72","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_720p_1632768","url_list":["http://v26-dy.ixigua.com/50c60b94c80b4ebef2730d64eeb33cac/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/b99c2c13640a871b5ddf95c442f2be48/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720},"quality_type":15},{"bit_rate":1544275,"gear_name":"adapt_540","is_h265":1,"play_addr":{"data_size":20470331,"file_cs":"c:0-112149-aede","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_540p_1544275","url_list":["http://v26-dy.ixigua.com/1de20f6d7e6f9b0dcdc2e4266f607be9/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/97de9a2d59ef128e67a0ae1b934b8946/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_265":{"data_size":20470331,"file_cs":"c:0-112149-aede","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_540p_1544275","url_list":["http://v26-dy.ixigua.com/1de20f6d7e6f9b0dcdc2e4266f607be9/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/97de9a2d59ef128e67a0ae1b934b8946/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720},"quality_type":28}]
             * cdn_url_expired : 0
             * cover : {"height":720,"uri":"large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375","url_list":["http://p3-dy-ipv6.byteimg.com/large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375.webp?from=2563711402_large","http://p1-dy-ipv6.byteimg.com/large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375.webp?from=2563711402_large","http://p29-dy.byteimg.com/large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375.webp?from=2563711402_large","http://p3-dy-ipv6.byteimg.com/large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375.jpeg?from=2563711402_large"],"width":720}
             * download_addr : {"data_size":39956726,"height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_list":["http://v26-dy.ixigua.com/f102959f66503fc33fc56ed2fb770d1a/5f87f26c/video/tos/cn/tos-cn-ve-15/92128c091c1948e7a1f6db665a7ae4ff/?a=1128&br=8586&bt=2862&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApODQ4ODszOzs5N2hnNTs2OWdrMWlrNl80NTBfLS0wLTBzczAwYy5fYl4tYTYxYDBeXjA6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/8eadfb2231cd58be9871f4e53434ea1c/5f87f26c/video/tos/cn/tos-cn-ve-15/92128c091c1948e7a1f6db665a7ae4ff/?a=1128&br=8586&bt=2862&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApODQ4ODszOzs5N2hnNTs2OWdrMWlrNl80NTBfLS0wLTBzczAwYy5fYl4tYTYxYDBeXjA6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"],"width":720}
             * download_suffix_logo_addr : {"data_size":39956726,"height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_list":["http://v26-dy.ixigua.com/f102959f66503fc33fc56ed2fb770d1a/5f87f26c/video/tos/cn/tos-cn-ve-15/92128c091c1948e7a1f6db665a7ae4ff/?a=1128&br=8586&bt=2862&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApODQ4ODszOzs5N2hnNTs2OWdrMWlrNl80NTBfLS0wLTBzczAwYy5fYl4tYTYxYDBeXjA6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/8eadfb2231cd58be9871f4e53434ea1c/5f87f26c/video/tos/cn/tos-cn-ve-15/92128c091c1948e7a1f6db665a7ae4ff/?a=1128&br=8586&bt=2862&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApODQ4ODszOzs5N2hnNTs2OWdrMWlrNl80NTBfLS0wLTBzczAwYy5fYl4tYTYxYDBeXjA6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"],"width":720}
             * duration : 106045
             * dynamic_cover : {"height":720,"uri":"tos-cn-p-0015/6ec1deec2c1049fcbea82bf623b091eb_1602659371","url_list":["https://p6-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/6ec1deec2c1049fcbea82bf623b091eb_1602659371?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/6ec1deec2c1049fcbea82bf623b091eb_1602659371?from=2563711402_large","https://p29-dy.byteimg.com/obj/tos-cn-p-0015/6ec1deec2c1049fcbea82bf623b091eb_1602659371?from=2563711402_large"],"width":720}
             * has_download_suffix_logo_addr : true
             * has_watermark : true
             * height : 576
             * is_h265 : 0
             * is_long_video : 1
             * origin_cover : {"height":720,"uri":"tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370","url_list":["https://p26-dy.byteimg.com/tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370~tplv-dy-360p.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370~tplv-dy-360p.webp?from=2563711402","https://p29-dy.byteimg.com/tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370~tplv-dy-360p.webp?from=2563711402","https://p26-dy.byteimg.com/tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370~tplv-dy-360p.jpeg?from=2563711402"],"width":720}
             * play_addr : {"data_size":28245593,"file_cs":"c:0-109963-4a7a","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_h264_540p_2130838","url_list":["http://v26-dy.ixigua.com/4e5be394a9686c3c33dae460a7e0f45f/5f87f26c/video/tos/cn/tos-cn-ve-15/4dd37aaa38864040af024fb5642053a2/?a=1128&br=6240&bt=2080&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApZTs4NDtlaWVlNzZpNDZoNGdrMWlrNl80NTBfLS0wLTBzcy8xYmNjYi0yLzYwX2IyMTQ6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/aac7f1a555ae694a483f0723f76bf0c3/5f87f26c/video/tos/cn/tos-cn-ve-15/4dd37aaa38864040af024fb5642053a2/?a=1128&br=6240&bt=2080&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApZTs4NDtlaWVlNzZpNDZoNGdrMWlrNl80NTBfLS0wLTBzcy8xYmNjYi0yLzYwX2IyMTQ6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720}
             * play_addr_265 : {"data_size":20470331,"file_cs":"c:0-112149-aede","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_540p_1544275","url_list":["http://v26-dy.ixigua.com/1de20f6d7e6f9b0dcdc2e4266f607be9/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/97de9a2d59ef128e67a0ae1b934b8946/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"],"width":720}
             * play_addr_h264 : {"data_size":28245593,"file_cs":"c:0-109963-4a7a","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_h264_540p_2130838","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED"],"width":720}
             * play_addr_lowbr : {"data_size":28245593,"file_cs":"c:0-109963-4a7a","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_h264_540p_2130838","url_list":["http://v26-dy.ixigua.com/4e5be394a9686c3c33dae460a7e0f45f/5f87f26c/video/tos/cn/tos-cn-ve-15/4dd37aaa38864040af024fb5642053a2/?a=1128&br=6240&bt=2080&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApZTs4NDtlaWVlNzZpNDZoNGdrMWlrNl80NTBfLS0wLTBzcy8xYmNjYi0yLzYwX2IyMTQ6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/aac7f1a555ae694a483f0723f76bf0c3/5f87f26c/video/tos/cn/tos-cn-ve-15/4dd37aaa38864040af024fb5642053a2/?a=1128&br=6240&bt=2080&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApZTs4NDtlaWVlNzZpNDZoNGdrMWlrNl80NTBfLS0wLTBzcy8xYmNjYi0yLzYwX2IyMTQ6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720}
             * ratio : 540p
             * video_model :
             * width : 1024
             */

            private int cdn_url_expired;
            private CoverBean cover;
            private DownloadAddrBean download_addr;
            private DownloadSuffixLogoAddrBean download_suffix_logo_addr;
            private int duration;
            private DynamicCoverBean dynamic_cover;
            private boolean has_download_suffix_logo_addr;
            private boolean has_watermark;
            private int height;
            private int is_h265;
            private int is_long_video;
            private OriginCoverBean origin_cover;
            private PlayAddrBean play_addr;
            private PlayAddr265Bean play_addr_265;
            private PlayAddrH264Bean play_addr_h264;
            private PlayAddrLowbrBean play_addr_lowbr;
            private String ratio;
            private String video_model;
            private int width;
            private List<BigThumbsBean> big_thumbs;
            private List<BitRateBean> bit_rate;

            public int getCdn_url_expired() {
                return cdn_url_expired;
            }

            public void setCdn_url_expired(int cdn_url_expired) {
                this.cdn_url_expired = cdn_url_expired;
            }

            public CoverBean getCover() {
                return cover;
            }

            public void setCover(CoverBean cover) {
                this.cover = cover;
            }

            public DownloadAddrBean getDownload_addr() {
                return download_addr;
            }

            public void setDownload_addr(DownloadAddrBean download_addr) {
                this.download_addr = download_addr;
            }

            public DownloadSuffixLogoAddrBean getDownload_suffix_logo_addr() {
                return download_suffix_logo_addr;
            }

            public void setDownload_suffix_logo_addr(DownloadSuffixLogoAddrBean download_suffix_logo_addr) {
                this.download_suffix_logo_addr = download_suffix_logo_addr;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public DynamicCoverBean getDynamic_cover() {
                return dynamic_cover;
            }

            public void setDynamic_cover(DynamicCoverBean dynamic_cover) {
                this.dynamic_cover = dynamic_cover;
            }

            public boolean isHas_download_suffix_logo_addr() {
                return has_download_suffix_logo_addr;
            }

            public void setHas_download_suffix_logo_addr(boolean has_download_suffix_logo_addr) {
                this.has_download_suffix_logo_addr = has_download_suffix_logo_addr;
            }

            public boolean isHas_watermark() {
                return has_watermark;
            }

            public void setHas_watermark(boolean has_watermark) {
                this.has_watermark = has_watermark;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getIs_h265() {
                return is_h265;
            }

            public void setIs_h265(int is_h265) {
                this.is_h265 = is_h265;
            }

            public int getIs_long_video() {
                return is_long_video;
            }

            public void setIs_long_video(int is_long_video) {
                this.is_long_video = is_long_video;
            }

            public OriginCoverBean getOrigin_cover() {
                return origin_cover;
            }

            public void setOrigin_cover(OriginCoverBean origin_cover) {
                this.origin_cover = origin_cover;
            }

            public PlayAddrBean getPlay_addr() {
                return play_addr;
            }

            public void setPlay_addr(PlayAddrBean play_addr) {
                this.play_addr = play_addr;
            }

            public PlayAddr265Bean getPlay_addr_265() {
                return play_addr_265;
            }

            public void setPlay_addr_265(PlayAddr265Bean play_addr_265) {
                this.play_addr_265 = play_addr_265;
            }

            public PlayAddrH264Bean getPlay_addr_h264() {
                return play_addr_h264;
            }

            public void setPlay_addr_h264(PlayAddrH264Bean play_addr_h264) {
                this.play_addr_h264 = play_addr_h264;
            }

            public PlayAddrLowbrBean getPlay_addr_lowbr() {
                return play_addr_lowbr;
            }

            public void setPlay_addr_lowbr(PlayAddrLowbrBean play_addr_lowbr) {
                this.play_addr_lowbr = play_addr_lowbr;
            }

            public String getRatio() {
                return ratio;
            }

            public void setRatio(String ratio) {
                this.ratio = ratio;
            }

            public String getVideo_model() {
                return video_model;
            }

            public void setVideo_model(String video_model) {
                this.video_model = video_model;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<BigThumbsBean> getBig_thumbs() {
                return big_thumbs;
            }

            public void setBig_thumbs(List<BigThumbsBean> big_thumbs) {
                this.big_thumbs = big_thumbs;
            }

            public List<BitRateBean> getBit_rate() {
                return bit_rate;
            }

            public void setBit_rate(List<BitRateBean> bit_rate) {
                this.bit_rate = bit_rate;
            }

            public static class CoverBean {
                /**
                 * height : 720
                 * uri : large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375
                 * url_list : ["http://p3-dy-ipv6.byteimg.com/large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375.webp?from=2563711402_large","http://p1-dy-ipv6.byteimg.com/large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375.webp?from=2563711402_large","http://p29-dy.byteimg.com/large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375.webp?from=2563711402_large","http://p3-dy-ipv6.byteimg.com/large/tos-cn-p-0015/09338f129ac44911854f9473cf5b3f33_1602659375.jpeg?from=2563711402_large"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class DownloadAddrBean {
                /**
                 * data_size : 39956726
                 * height : 720
                 * uri : v0300f350000bu3a857kbo9fnrlv4fng
                 * url_list : ["http://v26-dy.ixigua.com/f102959f66503fc33fc56ed2fb770d1a/5f87f26c/video/tos/cn/tos-cn-ve-15/92128c091c1948e7a1f6db665a7ae4ff/?a=1128&br=8586&bt=2862&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApODQ4ODszOzs5N2hnNTs2OWdrMWlrNl80NTBfLS0wLTBzczAwYy5fYl4tYTYxYDBeXjA6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/8eadfb2231cd58be9871f4e53434ea1c/5f87f26c/video/tos/cn/tos-cn-ve-15/92128c091c1948e7a1f6db665a7ae4ff/?a=1128&br=8586&bt=2862&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApODQ4ODszOzs5N2hnNTs2OWdrMWlrNl80NTBfLS0wLTBzczAwYy5fYl4tYTYxYDBeXjA6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"]
                 * width : 720
                 */

                private int data_size;
                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getData_size() {
                    return data_size;
                }

                public void setData_size(int data_size) {
                    this.data_size = data_size;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class DownloadSuffixLogoAddrBean {
                /**
                 * data_size : 39956726
                 * height : 720
                 * uri : v0300f350000bu3a857kbo9fnrlv4fng
                 * url_list : ["http://v26-dy.ixigua.com/f102959f66503fc33fc56ed2fb770d1a/5f87f26c/video/tos/cn/tos-cn-ve-15/92128c091c1948e7a1f6db665a7ae4ff/?a=1128&br=8586&bt=2862&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApODQ4ODszOzs5N2hnNTs2OWdrMWlrNl80NTBfLS0wLTBzczAwYy5fYl4tYTYxYDBeXjA6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/8eadfb2231cd58be9871f4e53434ea1c/5f87f26c/video/tos/cn/tos-cn-ve-15/92128c091c1948e7a1f6db665a7ae4ff/?a=1128&br=8586&bt=2862&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApODQ4ODszOzs5N2hnNTs2OWdrMWlrNl80NTBfLS0wLTBzczAwYy5fYl4tYTYxYDBeXjA6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_FEED"]
                 * width : 720
                 */

                private int data_size;
                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getData_size() {
                    return data_size;
                }

                public void setData_size(int data_size) {
                    this.data_size = data_size;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class DynamicCoverBean {
                /**
                 * height : 720
                 * uri : tos-cn-p-0015/6ec1deec2c1049fcbea82bf623b091eb_1602659371
                 * url_list : ["https://p6-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/6ec1deec2c1049fcbea82bf623b091eb_1602659371?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/6ec1deec2c1049fcbea82bf623b091eb_1602659371?from=2563711402_large","https://p29-dy.byteimg.com/obj/tos-cn-p-0015/6ec1deec2c1049fcbea82bf623b091eb_1602659371?from=2563711402_large"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class OriginCoverBean {
                /**
                 * height : 720
                 * uri : tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370
                 * url_list : ["https://p26-dy.byteimg.com/tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370~tplv-dy-360p.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370~tplv-dy-360p.webp?from=2563711402","https://p29-dy.byteimg.com/tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370~tplv-dy-360p.webp?from=2563711402","https://p26-dy.byteimg.com/tos-cn-p-0015/417613da3a6e4bb28842e25f22d28723_1602659370~tplv-dy-360p.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class PlayAddrBean {
                /**
                 * data_size : 28245593
                 * file_cs : c:0-109963-4a7a
                 * height : 720
                 * uri : v0300f350000bu3a857kbo9fnrlv4fng
                 * url_key : v0300f350000bu3a857kbo9fnrlv4fng_h264_540p_2130838
                 * url_list : ["http://v26-dy.ixigua.com/4e5be394a9686c3c33dae460a7e0f45f/5f87f26c/video/tos/cn/tos-cn-ve-15/4dd37aaa38864040af024fb5642053a2/?a=1128&br=6240&bt=2080&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApZTs4NDtlaWVlNzZpNDZoNGdrMWlrNl80NTBfLS0wLTBzcy8xYmNjYi0yLzYwX2IyMTQ6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/aac7f1a555ae694a483f0723f76bf0c3/5f87f26c/video/tos/cn/tos-cn-ve-15/4dd37aaa38864040af024fb5642053a2/?a=1128&br=6240&bt=2080&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApZTs4NDtlaWVlNzZpNDZoNGdrMWlrNl80NTBfLS0wLTBzcy8xYmNjYi0yLzYwX2IyMTQ6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"]
                 * width : 720
                 */

                private int data_size;
                private String file_cs;
                private int height;
                private String uri;
                private String url_key;
                private int width;
                private List<String> url_list;

                public int getData_size() {
                    return data_size;
                }

                public void setData_size(int data_size) {
                    this.data_size = data_size;
                }

                public String getFile_cs() {
                    return file_cs;
                }

                public void setFile_cs(String file_cs) {
                    this.file_cs = file_cs;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public String getUrl_key() {
                    return url_key;
                }

                public void setUrl_key(String url_key) {
                    this.url_key = url_key;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class PlayAddr265Bean {
                /**
                 * data_size : 20470331
                 * file_cs : c:0-112149-aede
                 * height : 720
                 * uri : v0300f350000bu3a857kbo9fnrlv4fng
                 * url_key : v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_540p_1544275
                 * url_list : ["http://v26-dy.ixigua.com/1de20f6d7e6f9b0dcdc2e4266f607be9/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/97de9a2d59ef128e67a0ae1b934b8946/5f87f26c/video/tos/cn/tos-cn-ve-15/d8e84040f75e48e5b51accfc150d5827/?a=1128&br=6032&bt=1508&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=11&rc=aml5dWlybjhkeDMzOGkzM0ApaGg6ZDY4Z2U5Nzo8Zjc2Z2drMWlrNl80NTBfLS0wLTBzcy1hMl4uXzVjLTZjYC8yMzY6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_FEED"]
                 * width : 720
                 */

                private int data_size;
                private String file_cs;
                private int height;
                private String uri;
                private String url_key;
                private int width;
                private List<String> url_list;

                public int getData_size() {
                    return data_size;
                }

                public void setData_size(int data_size) {
                    this.data_size = data_size;
                }

                public String getFile_cs() {
                    return file_cs;
                }

                public void setFile_cs(String file_cs) {
                    this.file_cs = file_cs;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public String getUrl_key() {
                    return url_key;
                }

                public void setUrl_key(String url_key) {
                    this.url_key = url_key;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class PlayAddrH264Bean {
                /**
                 * data_size : 28245593
                 * file_cs : c:0-109963-4a7a
                 * height : 720
                 * uri : v0300f350000bu3a857kbo9fnrlv4fng
                 * url_key : v0300f350000bu3a857kbo9fnrlv4fng_h264_540p_2130838
                 * url_list : ["https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_FEED"]
                 * width : 720
                 */

                private int data_size;
                private String file_cs;
                private int height;
                private String uri;
                private String url_key;
                private int width;
                private List<String> url_list;

                public int getData_size() {
                    return data_size;
                }

                public void setData_size(int data_size) {
                    this.data_size = data_size;
                }

                public String getFile_cs() {
                    return file_cs;
                }

                public void setFile_cs(String file_cs) {
                    this.file_cs = file_cs;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public String getUrl_key() {
                    return url_key;
                }

                public void setUrl_key(String url_key) {
                    this.url_key = url_key;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class PlayAddrLowbrBean {
                /**
                 * data_size : 28245593
                 * file_cs : c:0-109963-4a7a
                 * height : 720
                 * uri : v0300f350000bu3a857kbo9fnrlv4fng
                 * url_key : v0300f350000bu3a857kbo9fnrlv4fng_h264_540p_2130838
                 * url_list : ["http://v26-dy.ixigua.com/4e5be394a9686c3c33dae460a7e0f45f/5f87f26c/video/tos/cn/tos-cn-ve-15/4dd37aaa38864040af024fb5642053a2/?a=1128&br=6240&bt=2080&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApZTs4NDtlaWVlNzZpNDZoNGdrMWlrNl80NTBfLS0wLTBzcy8xYmNjYi0yLzYwX2IyMTQ6Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/aac7f1a555ae694a483f0723f76bf0c3/5f87f26c/video/tos/cn/tos-cn-ve-15/4dd37aaa38864040af024fb5642053a2/?a=1128&br=6240&bt=2080&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=aml5dWlybjhkeDMzOGkzM0ApZTs4NDtlaWVlNzZpNDZoNGdrMWlrNl80NTBfLS0wLTBzcy8xYmNjYi0yLzYwX2IyMTQ6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"]
                 * width : 720
                 */

                private int data_size;
                private String file_cs;
                private int height;
                private String uri;
                private String url_key;
                private int width;
                private List<String> url_list;

                public int getData_size() {
                    return data_size;
                }

                public void setData_size(int data_size) {
                    this.data_size = data_size;
                }

                public String getFile_cs() {
                    return file_cs;
                }

                public void setFile_cs(String file_cs) {
                    this.file_cs = file_cs;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public String getUrl_key() {
                    return url_key;
                }

                public void setUrl_key(String url_key) {
                    this.url_key = url_key;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class BigThumbsBean {
                /**
                 * duration : 106.041667
                 * fext : jpg
                 * img_num : 106
                 * img_url : http://p3-tt.bytecdn.cn/obj/tos-cn-p-0015/a112b1026651493fb40cb1ac75d4dc92_1602659377
                 * img_x_len : 10
                 * img_x_size : 240
                 * img_y_len : 11
                 * img_y_size : 136
                 * interval : 10
                 * uri : tos-cn-p-0015/a112b1026651493fb40cb1ac75d4dc92_1602659377
                 */

                private double duration;
                private String fext;
                private int img_num;
                private String img_url;
                private int img_x_len;
                private int img_x_size;
                private int img_y_len;
                private int img_y_size;
                private int interval;
                private String uri;

                public double getDuration() {
                    return duration;
                }

                public void setDuration(double duration) {
                    this.duration = duration;
                }

                public String getFext() {
                    return fext;
                }

                public void setFext(String fext) {
                    this.fext = fext;
                }

                public int getImg_num() {
                    return img_num;
                }

                public void setImg_num(int img_num) {
                    this.img_num = img_num;
                }

                public String getImg_url() {
                    return img_url;
                }

                public void setImg_url(String img_url) {
                    this.img_url = img_url;
                }

                public int getImg_x_len() {
                    return img_x_len;
                }

                public void setImg_x_len(int img_x_len) {
                    this.img_x_len = img_x_len;
                }

                public int getImg_x_size() {
                    return img_x_size;
                }

                public void setImg_x_size(int img_x_size) {
                    this.img_x_size = img_x_size;
                }

                public int getImg_y_len() {
                    return img_y_len;
                }

                public void setImg_y_len(int img_y_len) {
                    this.img_y_len = img_y_len;
                }

                public int getImg_y_size() {
                    return img_y_size;
                }

                public void setImg_y_size(int img_y_size) {
                    this.img_y_size = img_y_size;
                }

                public int getInterval() {
                    return interval;
                }

                public void setInterval(int interval) {
                    this.interval = interval;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }
            }

            public static class BitRateBean {
                /**
                 * bit_rate : 1632768
                 * gear_name : adapt_lowest_720
                 * is_h265 : 1
                 * play_addr : {"data_size":21643369,"file_cs":"c:0-112145-aa72","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_720p_1632768","url_list":["http://v26-dy.ixigua.com/50c60b94c80b4ebef2730d64eeb33cac/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/b99c2c13640a871b5ddf95c442f2be48/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720}
                 * play_addr_265 : {"data_size":21643369,"file_cs":"c:0-112145-aa72","height":720,"uri":"v0300f350000bu3a857kbo9fnrlv4fng","url_key":"v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_720p_1632768","url_list":["http://v26-dy.ixigua.com/50c60b94c80b4ebef2730d64eeb33cac/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/b99c2c13640a871b5ddf95c442f2be48/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"],"width":720}
                 * quality_type : 15
                 */

                private int bit_rate;
                private String gear_name;
                private int is_h265;
                private PlayAddrBeanX play_addr;
                private PlayAddr265BeanX play_addr_265;
                private int quality_type;

                public int getBit_rate() {
                    return bit_rate;
                }

                public void setBit_rate(int bit_rate) {
                    this.bit_rate = bit_rate;
                }

                public String getGear_name() {
                    return gear_name;
                }

                public void setGear_name(String gear_name) {
                    this.gear_name = gear_name;
                }

                public int getIs_h265() {
                    return is_h265;
                }

                public void setIs_h265(int is_h265) {
                    this.is_h265 = is_h265;
                }

                public PlayAddrBeanX getPlay_addr() {
                    return play_addr;
                }

                public void setPlay_addr(PlayAddrBeanX play_addr) {
                    this.play_addr = play_addr;
                }

                public PlayAddr265BeanX getPlay_addr_265() {
                    return play_addr_265;
                }

                public void setPlay_addr_265(PlayAddr265BeanX play_addr_265) {
                    this.play_addr_265 = play_addr_265;
                }

                public int getQuality_type() {
                    return quality_type;
                }

                public void setQuality_type(int quality_type) {
                    this.quality_type = quality_type;
                }

                public static class PlayAddrBeanX {
                    /**
                     * data_size : 21643369
                     * file_cs : c:0-112145-aa72
                     * height : 720
                     * uri : v0300f350000bu3a857kbo9fnrlv4fng
                     * url_key : v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_720p_1632768
                     * url_list : ["http://v26-dy.ixigua.com/50c60b94c80b4ebef2730d64eeb33cac/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/b99c2c13640a871b5ddf95c442f2be48/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"]
                     * width : 720
                     */

                    private int data_size;
                    private String file_cs;
                    private int height;
                    private String uri;
                    private String url_key;
                    private int width;
                    private List<String> url_list;

                    public int getData_size() {
                        return data_size;
                    }

                    public void setData_size(int data_size) {
                        this.data_size = data_size;
                    }

                    public String getFile_cs() {
                        return file_cs;
                    }

                    public void setFile_cs(String file_cs) {
                        this.file_cs = file_cs;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public String getUrl_key() {
                        return url_key;
                    }

                    public void setUrl_key(String url_key) {
                        this.url_key = url_key;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }

                public static class PlayAddr265BeanX {
                    /**
                     * data_size : 21643369
                     * file_cs : c:0-112145-aa72
                     * height : 720
                     * uri : v0300f350000bu3a857kbo9fnrlv4fng
                     * url_key : v0300f350000bu3a857kbo9fnrlv4fng_bytevc1_720p_1632768
                     * url_list : ["http://v26-dy.ixigua.com/50c60b94c80b4ebef2730d64eeb33cac/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","http://v5-dy-d.ixigua.com/b99c2c13640a871b5ddf95c442f2be48/5f87f26c/video/tos/cn/tos-cn-ve-15/f24d463af16e4f3a9ce330b4d7dd6d21/?a=1128&br=4782&bt=1594&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=15&rc=aml5dWlybjhkeDMzOGkzM0ApOmczOWc4NWVkNzk3ZDU7OGdrMWlrNl80NTBfLS0wLTBzc2MvLS4xYzIuYWBhY2MvLy86Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v0300f350000bu3a857kbo9fnrlv4fng&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_FEED"]
                     * width : 720
                     */

                    private int data_size;
                    private String file_cs;
                    private int height;
                    private String uri;
                    private String url_key;
                    private int width;
                    private List<String> url_list;

                    public int getData_size() {
                        return data_size;
                    }

                    public void setData_size(int data_size) {
                        this.data_size = data_size;
                    }

                    public String getFile_cs() {
                        return file_cs;
                    }

                    public void setFile_cs(String file_cs) {
                        this.file_cs = file_cs;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public String getUrl_key() {
                        return url_key;
                    }

                    public void setUrl_key(String url_key) {
                        this.url_key = url_key;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }
            }
        }

        public static class VideoControlBean {
            /**
             * allow_download : true
             * allow_duet : false
             * allow_dynamic_wallpaper : false
             * allow_music : true
             * allow_react : false
             * draft_progress_bar : 1
             * prevent_download_type : 0
             * share_type : 1
             * show_progress_bar : 1
             * timer_status : 1
             */

            private boolean allow_download;
            private boolean allow_duet;
            private boolean allow_dynamic_wallpaper;
            private boolean allow_music;
            private boolean allow_react;
            private int draft_progress_bar;
            private int prevent_download_type;
            private int share_type;
            private int show_progress_bar;
            private int timer_status;

            public boolean isAllow_download() {
                return allow_download;
            }

            public void setAllow_download(boolean allow_download) {
                this.allow_download = allow_download;
            }

            public boolean isAllow_duet() {
                return allow_duet;
            }

            public void setAllow_duet(boolean allow_duet) {
                this.allow_duet = allow_duet;
            }

            public boolean isAllow_dynamic_wallpaper() {
                return allow_dynamic_wallpaper;
            }

            public void setAllow_dynamic_wallpaper(boolean allow_dynamic_wallpaper) {
                this.allow_dynamic_wallpaper = allow_dynamic_wallpaper;
            }

            public boolean isAllow_music() {
                return allow_music;
            }

            public void setAllow_music(boolean allow_music) {
                this.allow_music = allow_music;
            }

            public boolean isAllow_react() {
                return allow_react;
            }

            public void setAllow_react(boolean allow_react) {
                this.allow_react = allow_react;
            }

            public int getDraft_progress_bar() {
                return draft_progress_bar;
            }

            public void setDraft_progress_bar(int draft_progress_bar) {
                this.draft_progress_bar = draft_progress_bar;
            }

            public int getPrevent_download_type() {
                return prevent_download_type;
            }

            public void setPrevent_download_type(int prevent_download_type) {
                this.prevent_download_type = prevent_download_type;
            }

            public int getShare_type() {
                return share_type;
            }

            public void setShare_type(int share_type) {
                this.share_type = share_type;
            }

            public int getShow_progress_bar() {
                return show_progress_bar;
            }

            public void setShow_progress_bar(int show_progress_bar) {
                this.show_progress_bar = show_progress_bar;
            }

            public int getTimer_status() {
                return timer_status;
            }

            public void setTimer_status(int timer_status) {
                this.timer_status = timer_status;
            }
        }

        public static class XiguaTaskBean {
            /**
             * is_xigua_task : false
             */

            private boolean is_xigua_task;

            public boolean isIs_xigua_task() {
                return is_xigua_task;
            }

            public void setIs_xigua_task(boolean is_xigua_task) {
                this.is_xigua_task = is_xigua_task;
            }
        }

        public static class DescendantsBean {
            /**
             * notify_msg : 头条
             * platforms : ["toutiao"]
             */

            private String notify_msg;
            private List<String> platforms;

            public String getNotify_msg() {
                return notify_msg;
            }

            public void setNotify_msg(String notify_msg) {
                this.notify_msg = notify_msg;
            }

            public List<String> getPlatforms() {
                return platforms;
            }

            public void setPlatforms(List<String> platforms) {
                this.platforms = platforms;
            }
        }

        public static class CommerceInfoBean {
            /**
             * avoid_global_pendant : true
             */

            private boolean avoid_global_pendant;

            public boolean isAvoid_global_pendant() {
                return avoid_global_pendant;
            }

            public void setAvoid_global_pendant(boolean avoid_global_pendant) {
                this.avoid_global_pendant = avoid_global_pendant;
            }
        }
    }

    public static class PreloadAdsBean {
        /**
         * anchors : null
         * author : {"ad_cover_url":null,"avatar_168x168":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_168x168.webp?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_168x168.webp?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_168x168.webp?from=4010531038"],"width":720},"avatar_300x300":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_300x300.webp?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_300x300.webp?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_300x300.webp?from=4010531038"],"width":720},"avatar_medium":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038"],"width":720},"avatar_thumb":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038"],"width":720},"cha_list":null,"comment_filter_status":0,"comment_setting":0,"commerce_user_level":0,"cover_url":[{"height":720,"uri":"c8510002be9a3a61aad2","url_list":["https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085","https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085"],"width":720}],"custom_verify":"","download_setting":-1,"duet_setting":0,"enterprise_verify_reason":"","follow_status":0,"followers_detail":null,"geofencing":null,"hide_location":false,"is_ad_fake":false,"is_block":false,"is_gov_media_vip":false,"is_star":false,"is_verified":true,"item_list":null,"language":"zh-Hans","location":"","new_story_cover":null,"nickname":"脆脆鲨","platform_sync_info":null,"prevent_download":false,"region":"CN","relative_users":null,"room_id":0,"sec_uid":"MS4wLjABAAAA2-lXjqiZoKA8kGGSrbxBCHkgjdgX24pe_Bam8TGkXzg","secret":0,"short_id":"2259668398","signature":"香浓酥脆每一刻，随食\u201c抖\u201d出小快乐","type_label":null,"uid":"215125970401869","unique_id":"dyv1om6bqv5h","verification_type":0,"video_icon":{"height":720,"uri":"","url_list":null,"width":720},"with_commerce_entry":false}
         * author_user_id : 215125970401869
         * aweme_control : {"can_comment":true,"can_forward":true,"can_share":true,"can_show_comment":true}
         * aweme_id : 6883670241025576205
         * aweme_type : 0
         * cha_list : [{"author":{"ad_cover_url":null,"cha_list":null,"cover_url":null,"followers_detail":null,"geofencing":null,"item_list":null,"new_story_cover":null,"platform_sync_info":null,"relative_users":null,"type_label":null},"cha_attrs":null,"cha_name":"脆脆高能鲨出重围","cid":"1680436442081304","collect_stat":0,"connect_music":null,"desc":"","is_challenge":0,"is_commerce":false,"schema":"aweme://aweme/challenge/detail?cid=1680436442081304","type":0,"user_count":0,"view_count":0}]
         * challenge_position : null
         * cmt_swt : false
         * collect_stat : 0
         * comment_list : null
         * commerce_config_data : null
         * commerce_info : {"avoid_global_pendant":true}
         * create_time : 1602729375
         * desc : #脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！
         * desc_language : un
         * distance :
         * distribute_type : 1
         * duration : 55620
         * geofencing : null
         * geofencing_regions : null
         * group_id : 6883670241025576205
         * hybrid_label : null
         * image_infos : null
         * interaction_stickers : null
         * is_ads : true
         * is_fantasy : false
         * is_hash_tag : 1
         * is_relieve : false
         * is_top : 0
         * is_vr : false
         * item_comment_settings : 0
         * item_duet : 2
         * item_react : 2
         * label_top_text : null
         * long_video : null
         * music : {"author":"脆脆鲨","author_deleted":false,"author_position":null,"avatar_large":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038"],"width":720},"avatar_medium":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038"],"width":720},"avatar_thumb":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038"],"width":720},"collect_stat":0,"cover_hd":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038"],"width":720},"cover_large":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038"],"width":720},"cover_medium":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038"],"width":720},"cover_thumb":{"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038"],"width":720},"duration":55,"end_time":0,"external_song_info":null,"extra":"{\"has_edited\":0,\"reviewed\":0,\"beats\":{},\"douyin_beats_info\":{},\"schedule_search_time\":0}","id":6883670264656202504,"id_str":"6883670264656202504","is_del_video":false,"is_original":false,"is_video_self_see":false,"mid":"6883670264656202504","mute_share":false,"offline_desc":"","owner_handle":"dyv1om6bqv5h","owner_id":"215125970401869","owner_nickname":"脆脆鲨","play_url":{"height":720,"uri":"http://p9-dy.byteimg.com/obj/ies-music/6883670237451930381.mp3","url_list":["http://p9-dy.byteimg.com/obj/ies-music/6883670237451930381.mp3","http://p1-dy.byteimg.com/obj/ies-music/6883670237451930381.mp3"],"width":720},"position":null,"prevent_download":false,"preview_end_time":0,"preview_start_time":0,"sec_uid":"MS4wLjABAAAA2-lXjqiZoKA8kGGSrbxBCHkgjdgX24pe_Bam8TGkXzg","source_platform":23,"start_time":0,"status":1,"title":"@脆脆鲨创作的原声","unshelve_countries":null}
         * nickname_position : null
         * origin_comment_ids : null
         * position : null
         * prevent_download : false
         * promotions : null
         * rate : 10
         * raw_ad_data : {"ad_id":1680495230957580,"ad_tag_position":2,"animation_type":1,"avatar_url":"http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad","button_style":1,"button_text":"查看详情","click_track_url_list":{"uri":"","url_list":["https://e.cn.miaozhen.com/r/k=2198229&p=7gcaa&rt=2&pro=s&tr=202010151353530100140450800D5ADE59&ns=113.65.209.51&mo=0&m1a=edf462a213db8c0d2a151ccac360e7a4&m2=7fd8959419a37b887d0ffd34b461cd2d&m5=__IDFA__&m6a=__MAC__&ls=23.1x113.4x100.0&vv=1&o="]},"comment_area":{"avatar_icon":{"uri":"web.business.image/202010145d0d45ffb5b847a84e14bf0c","url_list":["http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad","http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad"]},"button_text":"查看详情","comment_info":"#脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！","comment_nickname":"脆脆鲨鲨刻能新上市","comment_time":1603036800,"show_button_number":10,"source":"脆脆鲨鲨刻能新上市","title":"#脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！"},"comment_area_switch":true,"creative_id":1680495387887629,"disable_show_ad_link":true,"dislike":{"dislike_url":"https://aweme.snssdk.com/falcon/fe_douyin_ad_react/pages/ad_push?hide_nav_bar=1&enter_type=normal_ad","label_clickable":true,"name":"为什么看到此广告"},"effective_play_time":5,"effective_play_track_url_list":{"uri":"","url_list":["https://g.cn.miaozhen.com/x/k=2198229&p=7gcab&rt=2&pro=s&tr=202010151353530100140450800D5ADE59&ns=113.65.209.51&mo=0&m1a=edf462a213db8c0d2a151ccac360e7a4&m2=7fd8959419a37b887d0ffd34b461cd2d&m5=__IDFA__&m6a=__MAC__&ls=23.1x113.4x100.0&vv=1&o="]},"group_id":6883670241025576205,"is_preview":false,"is_real_author":true,"label":{"color":"#14FFFFFF","color_text":"#7FFFFFFF","text":"广告","type":4},"learn_more_bg_color":"#E67D2E","log_extra":"{\"ad_id\":1680495230957580,\"awesome_splash_ad_id\":1680439311212573,\"bdid\":\"2fd0c894386ea37230e015c2dd3271a8878c6c90f61edaa712781b7fb6434241\",\"card_id\":0,\"city_id_brand\":440100,\"clickid\":\"EI2QkZXtjP4CGIv17-fkASCqrLqgigIwDDiHuQJCIjIwMjAxMDE1MTM1MzUzMDEwMDE0MDQ1MDgwMEQ1QURFNTlIwbgC\",\"component_ids\":[8,9,13,38],\"convert_component_suspend\":0,\"convert_id\":0,\"first_splash_show\":1,\"hyrule_atype\":[],\"is_pack_v2\":true,\"orit\":40001,\"placement\":\"unknown\",\"req_id\":\"202010151353530100140450800D5ADE59\",\"rit\":40071,\"style_id\":4916,\"style_ids\":[4916],\"vid\":\"2079428,2074568,2064649,2081276,2041701,2041459,1864404,2069662,1967211,1702641,2070764,2059243,1999155,1363731,2092715,2062059,2093658,1630376,1721662,1863628,2063942,1502561,1915686,1686911,2054037,1872498,2027856,1759136,1559151,2096444,2090536,2052595,2062498,1919713,1973593,1371807,1999048,2086383,2028546,2034339,1649432,1711118,1962348,1877132,1914588,1931512,1802606,2025882,2066364,1938274,2092417,1921551,2016804,946599,1548386,2050186,2027582,1933509,1856457,2092195,2049970,1847189,2040780,2071677,1922032,2063387,2070881,2076365,1854881,1769935,1954115,2090902,2093760,1287775,1996411,1788822,2021604,2064701,2000602,2008178,2018110,1957537,2023863,2052902,1927617,2094615,2023838,1858797,2088124,1987817,2048550,2018926,372442,1999041,1586303,1803849,2034508,2086488,2068621,2094079,1409057,2063908,2067123,2094908,1477639,2095792,2085127,1973466,2026313,2014223,1733176,2057867,2068693,1781885,2055606,2037300,2061818,2088045,2084493,2090256,2096049,930218,1918567,2046182,2082475,2072686,2057475,1437737,1756367,2045135,2095700,2093055,1993503,2000177,2087540,2078193,1766311,1878449,1316532,2091517,1935100,2093673,1737179,692246,2090887,1675203,2044708,2083838,2021605,2047962,2070478,2091788,2056525,2095801,2091927,1689196,2071632,1634350,2072814,2047011,1936545,1749597,2088469,2057733,1745311,2062715,1684045,1748501,2039491,2090772,1980930,2084199,2048617,1861459,2086266,1992558,2086194,1771997,1668718,2080462,1997876,1442946,2094992,1477989,2066329,1974358,2071124,2090171,1929739,2085714,2000632,2078630,1978885,1983665,1878838,2093641,2087284,1961262,1890594,1998351,2095632,1965398,2051212,2074195,1350814,2085477,1952286,1960178,1943882,1898634,2092921,2079151,2091242,2033160,1988991,2092012,1776768,2042434,1709892,1287465,2080498,2085742,2079981,1475013,1540878,2090104,1908320,2053237,2095288,2092020,2093098,1934496,1965093,2031019,1966493,2093228,2079819,2048628,2083576,2086431,2088594,2095698,1527915,1271269,1910043,2037655,2021040,1569140,2040028,2085732,1317390,2045492,2046513,1732302,1284629,2073272,2079286,2043248,2082042,1304704,1919592,1922933,2085501,1662487,1851215,1887734,2092581,1383003,1880555,1725914,2078595,1657760,2096370,1858015,1589053,2086239,2095283,1771198,2082555,1871664,1990026,2035361,2070465,1507330,2078510,2088585,2074398,2023880,1856670,2093131,1278726,2051829,1902568,1921096,2037087,1793443,2089586,2075114,1993411,2090709,2023025,2007076,2080265,1778383,2007337,1771808,2092216,1980052,2072392,1978032,2049621,2073894,1737464,1865396,2081975,2085543,1960528,2094847,2094897,2076230,2090738,2070134,1471649,2047164,2096209,2064909,1961981,1966142,2056262,1978083,2062386,1901648,2089428,1566627,1716918,2079588,2009486,2084360,2038247,1447419,2086078,1741207,2007565,2050607,1683123,1995036,2056756,2081111,1965624,2063746,1329106,2087008,2067369,2094981,2082996,1938812,2090649,2095731,2049730,2014042,1856698,2062848,1960098,1630402,1997199,1563866,2046484,2047176,2056486,1553292,2066097,2078548,2048549,1852086,2092463,2020692,2094891,2087366,2028317,2088196,1909913,2076736,1551584,2064014,1710080,1937601,1333775,2066696,1856545,1648176,2095255,2063672,1745643,2058525,2034060,2081927,1880623,2071181,2045489,2085667,2019195,1894146,2064668,1974198,2038604,2032352,1498261,2065976,1550413,2045824,2087242,2045179,2087291,1368035,2068060,2079679,2045544,1952297,2045877,2046550,2092618,1527621,2096386,2063571,2062385,2046488,2062052,2047049,2047031,2045496,2053655,2086241,2080527\"}","report_enable":true,"show_button_seconds":6,"show_mask_times":2,"source":"脆脆鲨鲨刻能新上市","splash_info":{"awesome_splash_id":"1680439311212573","enable_splash_open":true,"end_time":1603123200,"hot_show_type":1,"predownload_text":"已预加载","preload_size":810,"skip_info":{"background_color":"#34000000","countdown_unit":"","text":"跳过广告","text_color":"#FFFFFFFF"},"splash_show_time":3000},"title":"#脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！","track_url_list":{"uri":"","url_list":["https://g.cn.miaozhen.com/x/k=2198229&p=7gcaa&rt=2&pro=s&tr=202010151353530100140450800D5ADE59&ns=113.65.209.51&mo=0&m1a=edf462a213db8c0d2a151ccac360e7a4&m2=7fd8959419a37b887d0ffd34b461cd2d&m5=__IDFA__&m6a=__MAC__&ls=23.1x113.4x100.0&vv=1&o="]},"type":"web","use_ordinary_web":true,"video_transpose":0,"web_title":"脆脆鲨鲨刻能新上市","web_url":"https://3.cn/100rwUP-a"}
         * region :
         * share_info : {"bool_persist":0,"share_desc":"在抖音，记录美好生活","share_link_desc":"#脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！ %s 复制此链接，打开【抖音短视频】，直接观看视频！","share_quote":"","share_title":"#脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/video/6883670241025576205/?region=CN&mid=6883670264656202504&u_code=i0kji679&titleType=title","share_weibo_desc":"#在抖音，记录美好生活##脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！"}
         * share_url : https://www.iesdouyin.com/share/video/6883670241025576205/?region=CN&mid=6883670264656202504&u_code=i0kji679&titleType=title
         * statistics : {"aweme_id":"6883670241025576205","comment_count":0,"digg_count":0,"download_count":0,"forward_count":0,"lose_comment_count":0,"lose_count":0,"play_count":0,"share_count":0}
         * status : {"allow_comment":true,"allow_share":true,"aweme_id":"6883670241025576205","download_status":0,"in_reviewing":false,"is_delete":false,"is_private":false,"is_prohibited":false,"private_status":0,"reviewed":1,"self_see":false,"with_fusion_goods":false,"with_goods":false}
         * text_extra : [{"end":9,"hashtag_id":"1680436442081304","hashtag_name":"脆脆高能鲨出重围","is_commerce":false,"start":0,"type":1}]
         * uniqid_position : null
         * user_digged : 0
         * video : {"big_thumbs":null,"bit_rate":[{"bit_rate":811715,"gear_name":"normal_540","is_bytevc1":0,"is_h265":0,"play_addr":{"data_size":5643451,"file_hash":"715b935324e0ee954dfbdcd56f2ad4f9","height":720,"uri":"v020336b0000bu3r87l6q7dhb8c2gl80","url_key":"v020336b0000bu3r87l6q7dhb8c2gl80_h264_540p_811715","url_list":["http://v5-dy-d.ixigua.com/f1172afbd9f3ea78ec1e92cd23227f28/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/dff5c7c62026e7c2dbaadbce10441614/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"quality_type":20}],"cdn_url_expired":0,"cover":{"height":720,"uri":"large/34a2c000b11da8188ff22","url_list":["http://p26-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p9-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p6-dy-ipv6.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large"],"width":720},"download_addr":{"data_size":5643451,"height":720,"uri":"v020336b0000bu3r87l6q7dhb8c2gl80","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&watermark=0&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&watermark=0&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&source=PackSourceEnum_FEED"],"width":720},"duration":55620,"dynamic_cover":{"height":720,"uri":"large/34a2c000b11da8188ff22","url_list":["http://p26-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p9-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p6-dy-ipv6.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large"],"width":720},"has_watermark":false,"height":960,"is_bytevc1":0,"is_h265":0,"origin_cover":{"height":720,"uri":"large/34a2c000b11da8188ff22","url_list":["http://p3-dy-ipv6.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p29-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p26-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large"],"width":720},"play_addr":{"data_size":5643451,"file_hash":"715b935324e0ee954dfbdcd56f2ad4f9","height":720,"uri":"v020336b0000bu3r87l6q7dhb8c2gl80","url_key":"v020336b0000bu3r87l6q7dhb8c2gl80_h264_540p_811715","url_list":["http://v5-dy-d.ixigua.com/f1172afbd9f3ea78ec1e92cd23227f28/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/dff5c7c62026e7c2dbaadbce10441614/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"play_addr_lowbr":{"data_size":5643451,"file_hash":"715b935324e0ee954dfbdcd56f2ad4f9","height":720,"uri":"v020336b0000bu3r87l6q7dhb8c2gl80","url_key":"v020336b0000bu3r87l6q7dhb8c2gl80_h264_540p_811715","url_list":["http://v5-dy-d.ixigua.com/f1172afbd9f3ea78ec1e92cd23227f28/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/dff5c7c62026e7c2dbaadbce10441614/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"ratio":"540p","width":540}
         * video_control : {"allow_download":true,"allow_duet":true,"allow_dynamic_wallpaper":true,"allow_react":true,"draft_progress_bar":0,"prevent_download_type":0,"share_type":1,"show_progress_bar":1,"timer_status":1}
         * video_labels : null
         * video_text : null
         * vr_type : 0
         * with_promotional_music : false
         * ad_aweme_source : 1
         */

        private Object anchors;
        private AuthorBeanX author;
        private long author_user_id;
        private AwemeControlBeanX aweme_control;
        private String aweme_id;
        private int aweme_type;
        private Object challenge_position;
        private boolean cmt_swt;
        private int collect_stat;
        private Object comment_list;
        private Object commerce_config_data;
        private CommerceInfoBeanX commerce_info;
        private int create_time;
        private String desc;
        private String desc_language;
        private String distance;
        private int distribute_type;
        private int duration;
        private Object geofencing;
        private Object geofencing_regions;
        private String group_id;
        private Object hybrid_label;
        private Object image_infos;
        private Object interaction_stickers;
        private boolean is_ads;
        private boolean is_fantasy;
        private int is_hash_tag;
        private boolean is_relieve;
        private int is_top;
        private boolean is_vr;
        private int item_comment_settings;
        private int item_duet;
        private int item_react;
        private Object label_top_text;
        private Object long_video;
        private MusicBeanX music;
        private Object nickname_position;
        private Object origin_comment_ids;
        private Object position;
        private boolean prevent_download;
        private Object promotions;
        private int rate;
        private RawAdDataBean raw_ad_data;
        private String region;
        private ShareInfoBeanXXX share_info;
        private String share_url;
        private StatisticsBeanX statistics;
        private StatusBeanXX status;
        private Object uniqid_position;
        private int user_digged;
        private VideoBeanX video;
        private VideoControlBeanX video_control;
        private Object video_labels;
        private Object video_text;
        private int vr_type;
        private boolean with_promotional_music;
        private int ad_aweme_source;
        private List<ChaListBean> cha_list;
        private List<TextExtraBean> text_extra;

        public Object getAnchors() {
            return anchors;
        }

        public void setAnchors(Object anchors) {
            this.anchors = anchors;
        }

        public AuthorBeanX getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBeanX author) {
            this.author = author;
        }

        public long getAuthor_user_id() {
            return author_user_id;
        }

        public void setAuthor_user_id(long author_user_id) {
            this.author_user_id = author_user_id;
        }

        public AwemeControlBeanX getAweme_control() {
            return aweme_control;
        }

        public void setAweme_control(AwemeControlBeanX aweme_control) {
            this.aweme_control = aweme_control;
        }

        public String getAweme_id() {
            return aweme_id;
        }

        public void setAweme_id(String aweme_id) {
            this.aweme_id = aweme_id;
        }

        public int getAweme_type() {
            return aweme_type;
        }

        public void setAweme_type(int aweme_type) {
            this.aweme_type = aweme_type;
        }

        public Object getChallenge_position() {
            return challenge_position;
        }

        public void setChallenge_position(Object challenge_position) {
            this.challenge_position = challenge_position;
        }

        public boolean isCmt_swt() {
            return cmt_swt;
        }

        public void setCmt_swt(boolean cmt_swt) {
            this.cmt_swt = cmt_swt;
        }

        public int getCollect_stat() {
            return collect_stat;
        }

        public void setCollect_stat(int collect_stat) {
            this.collect_stat = collect_stat;
        }

        public Object getComment_list() {
            return comment_list;
        }

        public void setComment_list(Object comment_list) {
            this.comment_list = comment_list;
        }

        public Object getCommerce_config_data() {
            return commerce_config_data;
        }

        public void setCommerce_config_data(Object commerce_config_data) {
            this.commerce_config_data = commerce_config_data;
        }

        public CommerceInfoBeanX getCommerce_info() {
            return commerce_info;
        }

        public void setCommerce_info(CommerceInfoBeanX commerce_info) {
            this.commerce_info = commerce_info;
        }

        public int getCreate_time() {
            return create_time;
        }

        public void setCreate_time(int create_time) {
            this.create_time = create_time;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc_language() {
            return desc_language;
        }

        public void setDesc_language(String desc_language) {
            this.desc_language = desc_language;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public int getDistribute_type() {
            return distribute_type;
        }

        public void setDistribute_type(int distribute_type) {
            this.distribute_type = distribute_type;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public Object getGeofencing() {
            return geofencing;
        }

        public void setGeofencing(Object geofencing) {
            this.geofencing = geofencing;
        }

        public Object getGeofencing_regions() {
            return geofencing_regions;
        }

        public void setGeofencing_regions(Object geofencing_regions) {
            this.geofencing_regions = geofencing_regions;
        }

        public String getGroup_id() {
            return group_id;
        }

        public void setGroup_id(String group_id) {
            this.group_id = group_id;
        }

        public Object getHybrid_label() {
            return hybrid_label;
        }

        public void setHybrid_label(Object hybrid_label) {
            this.hybrid_label = hybrid_label;
        }

        public Object getImage_infos() {
            return image_infos;
        }

        public void setImage_infos(Object image_infos) {
            this.image_infos = image_infos;
        }

        public Object getInteraction_stickers() {
            return interaction_stickers;
        }

        public void setInteraction_stickers(Object interaction_stickers) {
            this.interaction_stickers = interaction_stickers;
        }

        public boolean isIs_ads() {
            return is_ads;
        }

        public void setIs_ads(boolean is_ads) {
            this.is_ads = is_ads;
        }

        public boolean isIs_fantasy() {
            return is_fantasy;
        }

        public void setIs_fantasy(boolean is_fantasy) {
            this.is_fantasy = is_fantasy;
        }

        public int getIs_hash_tag() {
            return is_hash_tag;
        }

        public void setIs_hash_tag(int is_hash_tag) {
            this.is_hash_tag = is_hash_tag;
        }

        public boolean isIs_relieve() {
            return is_relieve;
        }

        public void setIs_relieve(boolean is_relieve) {
            this.is_relieve = is_relieve;
        }

        public int getIs_top() {
            return is_top;
        }

        public void setIs_top(int is_top) {
            this.is_top = is_top;
        }

        public boolean isIs_vr() {
            return is_vr;
        }

        public void setIs_vr(boolean is_vr) {
            this.is_vr = is_vr;
        }

        public int getItem_comment_settings() {
            return item_comment_settings;
        }

        public void setItem_comment_settings(int item_comment_settings) {
            this.item_comment_settings = item_comment_settings;
        }

        public int getItem_duet() {
            return item_duet;
        }

        public void setItem_duet(int item_duet) {
            this.item_duet = item_duet;
        }

        public int getItem_react() {
            return item_react;
        }

        public void setItem_react(int item_react) {
            this.item_react = item_react;
        }

        public Object getLabel_top_text() {
            return label_top_text;
        }

        public void setLabel_top_text(Object label_top_text) {
            this.label_top_text = label_top_text;
        }

        public Object getLong_video() {
            return long_video;
        }

        public void setLong_video(Object long_video) {
            this.long_video = long_video;
        }

        public MusicBeanX getMusic() {
            return music;
        }

        public void setMusic(MusicBeanX music) {
            this.music = music;
        }

        public Object getNickname_position() {
            return nickname_position;
        }

        public void setNickname_position(Object nickname_position) {
            this.nickname_position = nickname_position;
        }

        public Object getOrigin_comment_ids() {
            return origin_comment_ids;
        }

        public void setOrigin_comment_ids(Object origin_comment_ids) {
            this.origin_comment_ids = origin_comment_ids;
        }

        public Object getPosition() {
            return position;
        }

        public void setPosition(Object position) {
            this.position = position;
        }

        public boolean isPrevent_download() {
            return prevent_download;
        }

        public void setPrevent_download(boolean prevent_download) {
            this.prevent_download = prevent_download;
        }

        public Object getPromotions() {
            return promotions;
        }

        public void setPromotions(Object promotions) {
            this.promotions = promotions;
        }

        public int getRate() {
            return rate;
        }

        public void setRate(int rate) {
            this.rate = rate;
        }

        public RawAdDataBean getRaw_ad_data() {
            return raw_ad_data;
        }

        public void setRaw_ad_data(RawAdDataBean raw_ad_data) {
            this.raw_ad_data = raw_ad_data;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public ShareInfoBeanXXX getShare_info() {
            return share_info;
        }

        public void setShare_info(ShareInfoBeanXXX share_info) {
            this.share_info = share_info;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public StatisticsBeanX getStatistics() {
            return statistics;
        }

        public void setStatistics(StatisticsBeanX statistics) {
            this.statistics = statistics;
        }

        public StatusBeanXX getStatus() {
            return status;
        }

        public void setStatus(StatusBeanXX status) {
            this.status = status;
        }

        public Object getUniqid_position() {
            return uniqid_position;
        }

        public void setUniqid_position(Object uniqid_position) {
            this.uniqid_position = uniqid_position;
        }

        public int getUser_digged() {
            return user_digged;
        }

        public void setUser_digged(int user_digged) {
            this.user_digged = user_digged;
        }

        public VideoBeanX getVideo() {
            return video;
        }

        public void setVideo(VideoBeanX video) {
            this.video = video;
        }

        public VideoControlBeanX getVideo_control() {
            return video_control;
        }

        public void setVideo_control(VideoControlBeanX video_control) {
            this.video_control = video_control;
        }

        public Object getVideo_labels() {
            return video_labels;
        }

        public void setVideo_labels(Object video_labels) {
            this.video_labels = video_labels;
        }

        public Object getVideo_text() {
            return video_text;
        }

        public void setVideo_text(Object video_text) {
            this.video_text = video_text;
        }

        public int getVr_type() {
            return vr_type;
        }

        public void setVr_type(int vr_type) {
            this.vr_type = vr_type;
        }

        public boolean isWith_promotional_music() {
            return with_promotional_music;
        }

        public void setWith_promotional_music(boolean with_promotional_music) {
            this.with_promotional_music = with_promotional_music;
        }

        public int getAd_aweme_source() {
            return ad_aweme_source;
        }

        public void setAd_aweme_source(int ad_aweme_source) {
            this.ad_aweme_source = ad_aweme_source;
        }

        public List<ChaListBean> getCha_list() {
            return cha_list;
        }

        public void setCha_list(List<ChaListBean> cha_list) {
            this.cha_list = cha_list;
        }

        public List<TextExtraBean> getText_extra() {
            return text_extra;
        }

        public void setText_extra(List<TextExtraBean> text_extra) {
            this.text_extra = text_extra;
        }

        public static class AuthorBeanX {
            /**
             * ad_cover_url : null
             * avatar_168x168 : {"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_168x168.webp?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_168x168.webp?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_168x168.webp?from=4010531038"],"width":720}
             * avatar_300x300 : {"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_300x300.webp?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_300x300.webp?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_300x300.webp?from=4010531038"],"width":720}
             * avatar_medium : {"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038"],"width":720}
             * avatar_thumb : {"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038"],"width":720}
             * cha_list : null
             * comment_filter_status : 0
             * comment_setting : 0
             * commerce_user_level : 0
             * cover_url : [{"height":720,"uri":"c8510002be9a3a61aad2","url_list":["https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085","https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085"],"width":720}]
             * custom_verify :
             * download_setting : -1
             * duet_setting : 0
             * enterprise_verify_reason :
             * follow_status : 0
             * followers_detail : null
             * geofencing : null
             * hide_location : false
             * is_ad_fake : false
             * is_block : false
             * is_gov_media_vip : false
             * is_star : false
             * is_verified : true
             * item_list : null
             * language : zh-Hans
             * location :
             * new_story_cover : null
             * nickname : 脆脆鲨
             * platform_sync_info : null
             * prevent_download : false
             * region : CN
             * relative_users : null
             * room_id : 0
             * sec_uid : MS4wLjABAAAA2-lXjqiZoKA8kGGSrbxBCHkgjdgX24pe_Bam8TGkXzg
             * secret : 0
             * short_id : 2259668398
             * signature : 香浓酥脆每一刻，随食“抖”出小快乐
             * type_label : null
             * uid : 215125970401869
             * unique_id : dyv1om6bqv5h
             * verification_type : 0
             * video_icon : {"height":720,"uri":"","url_list":null,"width":720}
             * with_commerce_entry : false
             */

            private Object ad_cover_url;
            private Avatar168x168BeanX avatar_168x168;
            private Avatar300x300BeanX avatar_300x300;
            private AvatarMediumBeanXX avatar_medium;
            private AvatarThumbBeanXX avatar_thumb;
            private Object cha_list;
            private int comment_filter_status;
            private int comment_setting;
            private int commerce_user_level;
            private String custom_verify;
            private int download_setting;
            private int duet_setting;
            private String enterprise_verify_reason;
            private int follow_status;
            private Object followers_detail;
            private Object geofencing;
            private boolean hide_location;
            private boolean is_ad_fake;
            private boolean is_block;
            private boolean is_gov_media_vip;
            private boolean is_star;
            private boolean is_verified;
            private Object item_list;
            private String language;
            private String location;
            private Object new_story_cover;
            private String nickname;
            private Object platform_sync_info;
            private boolean prevent_download;
            private String region;
            private Object relative_users;
            private int room_id;
            private String sec_uid;
            private int secret;
            private String short_id;
            private String signature;
            private Object type_label;
            private String uid;
            private String unique_id;
            private int verification_type;
            private VideoIconBeanX video_icon;
            private boolean with_commerce_entry;
            private List<CoverUrlBeanXX> cover_url;

            public Object getAd_cover_url() {
                return ad_cover_url;
            }

            public void setAd_cover_url(Object ad_cover_url) {
                this.ad_cover_url = ad_cover_url;
            }

            public Avatar168x168BeanX getAvatar_168x168() {
                return avatar_168x168;
            }

            public void setAvatar_168x168(Avatar168x168BeanX avatar_168x168) {
                this.avatar_168x168 = avatar_168x168;
            }

            public Avatar300x300BeanX getAvatar_300x300() {
                return avatar_300x300;
            }

            public void setAvatar_300x300(Avatar300x300BeanX avatar_300x300) {
                this.avatar_300x300 = avatar_300x300;
            }

            public AvatarMediumBeanXX getAvatar_medium() {
                return avatar_medium;
            }

            public void setAvatar_medium(AvatarMediumBeanXX avatar_medium) {
                this.avatar_medium = avatar_medium;
            }

            public AvatarThumbBeanXX getAvatar_thumb() {
                return avatar_thumb;
            }

            public void setAvatar_thumb(AvatarThumbBeanXX avatar_thumb) {
                this.avatar_thumb = avatar_thumb;
            }

            public Object getCha_list() {
                return cha_list;
            }

            public void setCha_list(Object cha_list) {
                this.cha_list = cha_list;
            }

            public int getComment_filter_status() {
                return comment_filter_status;
            }

            public void setComment_filter_status(int comment_filter_status) {
                this.comment_filter_status = comment_filter_status;
            }

            public int getComment_setting() {
                return comment_setting;
            }

            public void setComment_setting(int comment_setting) {
                this.comment_setting = comment_setting;
            }

            public int getCommerce_user_level() {
                return commerce_user_level;
            }

            public void setCommerce_user_level(int commerce_user_level) {
                this.commerce_user_level = commerce_user_level;
            }

            public String getCustom_verify() {
                return custom_verify;
            }

            public void setCustom_verify(String custom_verify) {
                this.custom_verify = custom_verify;
            }

            public int getDownload_setting() {
                return download_setting;
            }

            public void setDownload_setting(int download_setting) {
                this.download_setting = download_setting;
            }

            public int getDuet_setting() {
                return duet_setting;
            }

            public void setDuet_setting(int duet_setting) {
                this.duet_setting = duet_setting;
            }

            public String getEnterprise_verify_reason() {
                return enterprise_verify_reason;
            }

            public void setEnterprise_verify_reason(String enterprise_verify_reason) {
                this.enterprise_verify_reason = enterprise_verify_reason;
            }

            public int getFollow_status() {
                return follow_status;
            }

            public void setFollow_status(int follow_status) {
                this.follow_status = follow_status;
            }

            public Object getFollowers_detail() {
                return followers_detail;
            }

            public void setFollowers_detail(Object followers_detail) {
                this.followers_detail = followers_detail;
            }

            public Object getGeofencing() {
                return geofencing;
            }

            public void setGeofencing(Object geofencing) {
                this.geofencing = geofencing;
            }

            public boolean isHide_location() {
                return hide_location;
            }

            public void setHide_location(boolean hide_location) {
                this.hide_location = hide_location;
            }

            public boolean isIs_ad_fake() {
                return is_ad_fake;
            }

            public void setIs_ad_fake(boolean is_ad_fake) {
                this.is_ad_fake = is_ad_fake;
            }

            public boolean isIs_block() {
                return is_block;
            }

            public void setIs_block(boolean is_block) {
                this.is_block = is_block;
            }

            public boolean isIs_gov_media_vip() {
                return is_gov_media_vip;
            }

            public void setIs_gov_media_vip(boolean is_gov_media_vip) {
                this.is_gov_media_vip = is_gov_media_vip;
            }

            public boolean isIs_star() {
                return is_star;
            }

            public void setIs_star(boolean is_star) {
                this.is_star = is_star;
            }

            public boolean isIs_verified() {
                return is_verified;
            }

            public void setIs_verified(boolean is_verified) {
                this.is_verified = is_verified;
            }

            public Object getItem_list() {
                return item_list;
            }

            public void setItem_list(Object item_list) {
                this.item_list = item_list;
            }

            public String getLanguage() {
                return language;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public Object getNew_story_cover() {
                return new_story_cover;
            }

            public void setNew_story_cover(Object new_story_cover) {
                this.new_story_cover = new_story_cover;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public Object getPlatform_sync_info() {
                return platform_sync_info;
            }

            public void setPlatform_sync_info(Object platform_sync_info) {
                this.platform_sync_info = platform_sync_info;
            }

            public boolean isPrevent_download() {
                return prevent_download;
            }

            public void setPrevent_download(boolean prevent_download) {
                this.prevent_download = prevent_download;
            }

            public String getRegion() {
                return region;
            }

            public void setRegion(String region) {
                this.region = region;
            }

            public Object getRelative_users() {
                return relative_users;
            }

            public void setRelative_users(Object relative_users) {
                this.relative_users = relative_users;
            }

            public int getRoom_id() {
                return room_id;
            }

            public void setRoom_id(int room_id) {
                this.room_id = room_id;
            }

            public String getSec_uid() {
                return sec_uid;
            }

            public void setSec_uid(String sec_uid) {
                this.sec_uid = sec_uid;
            }

            public int getSecret() {
                return secret;
            }

            public void setSecret(int secret) {
                this.secret = secret;
            }

            public String getShort_id() {
                return short_id;
            }

            public void setShort_id(String short_id) {
                this.short_id = short_id;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public Object getType_label() {
                return type_label;
            }

            public void setType_label(Object type_label) {
                this.type_label = type_label;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getUnique_id() {
                return unique_id;
            }

            public void setUnique_id(String unique_id) {
                this.unique_id = unique_id;
            }

            public int getVerification_type() {
                return verification_type;
            }

            public void setVerification_type(int verification_type) {
                this.verification_type = verification_type;
            }

            public VideoIconBeanX getVideo_icon() {
                return video_icon;
            }

            public void setVideo_icon(VideoIconBeanX video_icon) {
                this.video_icon = video_icon;
            }

            public boolean isWith_commerce_entry() {
                return with_commerce_entry;
            }

            public void setWith_commerce_entry(boolean with_commerce_entry) {
                this.with_commerce_entry = with_commerce_entry;
            }

            public List<CoverUrlBeanXX> getCover_url() {
                return cover_url;
            }

            public void setCover_url(List<CoverUrlBeanXX> cover_url) {
                this.cover_url = cover_url;
            }

            public static class Avatar168x168BeanX {
                /**
                 * height : 720
                 * uri : tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac
                 * url_list : ["https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_168x168.webp?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_168x168.webp?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_168x168.webp?from=4010531038"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class Avatar300x300BeanX {
                /**
                 * height : 720
                 * uri : tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac
                 * url_list : ["https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_300x300.webp?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_300x300.webp?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_300x300.webp?from=4010531038"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class AvatarMediumBeanXX {
                /**
                 * height : 720
                 * uri : tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac
                 * url_list : ["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class AvatarThumbBeanXX {
                /**
                 * height : 720
                 * uri : tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac
                 * url_list : ["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class VideoIconBeanX {
                /**
                 * height : 720
                 * uri :
                 * url_list : null
                 * width : 720
                 */

                private int height;
                private String uri;
                private Object url_list;
                private int width;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public Object getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(Object url_list) {
                    this.url_list = url_list;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }
            }

            public static class CoverUrlBeanXX {
                /**
                 * height : 720
                 * uri : c8510002be9a3a61aad2
                 * url_list : ["https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085","https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2502468085"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }
        }

        public static class AwemeControlBeanX {
            /**
             * can_comment : true
             * can_forward : true
             * can_share : true
             * can_show_comment : true
             */

            private boolean can_comment;
            private boolean can_forward;
            private boolean can_share;
            private boolean can_show_comment;

            public boolean isCan_comment() {
                return can_comment;
            }

            public void setCan_comment(boolean can_comment) {
                this.can_comment = can_comment;
            }

            public boolean isCan_forward() {
                return can_forward;
            }

            public void setCan_forward(boolean can_forward) {
                this.can_forward = can_forward;
            }

            public boolean isCan_share() {
                return can_share;
            }

            public void setCan_share(boolean can_share) {
                this.can_share = can_share;
            }

            public boolean isCan_show_comment() {
                return can_show_comment;
            }

            public void setCan_show_comment(boolean can_show_comment) {
                this.can_show_comment = can_show_comment;
            }
        }

        public static class CommerceInfoBeanX {
            /**
             * avoid_global_pendant : true
             */

            private boolean avoid_global_pendant;

            public boolean isAvoid_global_pendant() {
                return avoid_global_pendant;
            }

            public void setAvoid_global_pendant(boolean avoid_global_pendant) {
                this.avoid_global_pendant = avoid_global_pendant;
            }
        }

        public static class MusicBeanX {
            /**
             * author : 脆脆鲨
             * author_deleted : false
             * author_position : null
             * avatar_large : {"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038"],"width":720}
             * avatar_medium : {"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038"],"width":720}
             * avatar_thumb : {"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038"],"width":720}
             * collect_stat : 0
             * cover_hd : {"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038"],"width":720}
             * cover_large : {"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038"],"width":720}
             * cover_medium : {"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038"],"width":720}
             * cover_thumb : {"height":720,"uri":"tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038"],"width":720}
             * duration : 55
             * end_time : 0
             * external_song_info : null
             * extra : {"has_edited":0,"reviewed":0,"beats":{},"douyin_beats_info":{},"schedule_search_time":0}
             * id : 6883670264656202504
             * id_str : 6883670264656202504
             * is_del_video : false
             * is_original : false
             * is_video_self_see : false
             * mid : 6883670264656202504
             * mute_share : false
             * offline_desc :
             * owner_handle : dyv1om6bqv5h
             * owner_id : 215125970401869
             * owner_nickname : 脆脆鲨
             * play_url : {"height":720,"uri":"http://p9-dy.byteimg.com/obj/ies-music/6883670237451930381.mp3","url_list":["http://p9-dy.byteimg.com/obj/ies-music/6883670237451930381.mp3","http://p1-dy.byteimg.com/obj/ies-music/6883670237451930381.mp3"],"width":720}
             * position : null
             * prevent_download : false
             * preview_end_time : 0
             * preview_start_time : 0
             * sec_uid : MS4wLjABAAAA2-lXjqiZoKA8kGGSrbxBCHkgjdgX24pe_Bam8TGkXzg
             * source_platform : 23
             * start_time : 0
             * status : 1
             * title : @脆脆鲨创作的原声
             * unshelve_countries : null
             */

            private String author;
            private boolean author_deleted;
            private Object author_position;
            private AvatarLargeBeanX avatar_large;
            private AvatarMediumBeanXXX avatar_medium;
            private AvatarThumbBeanXXX avatar_thumb;
            private int collect_stat;
            private CoverHdBeanX cover_hd;
            private CoverLargeBeanX cover_large;
            private CoverMediumBeanX cover_medium;
            private CoverThumbBeanX cover_thumb;
            private int duration;
            private int end_time;
            private Object external_song_info;
            private String extra;
            private long id;
            private String id_str;
            private boolean is_del_video;
            private boolean is_original;
            private boolean is_video_self_see;
            private String mid;
            private boolean mute_share;
            private String offline_desc;
            private String owner_handle;
            private String owner_id;
            private String owner_nickname;
            private PlayUrlBeanX play_url;
            private Object position;
            private boolean prevent_download;
            private int preview_end_time;
            private int preview_start_time;
            private String sec_uid;
            private int source_platform;
            private int start_time;
            private int status;
            private String title;
            private Object unshelve_countries;

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isAuthor_deleted() {
                return author_deleted;
            }

            public void setAuthor_deleted(boolean author_deleted) {
                this.author_deleted = author_deleted;
            }

            public Object getAuthor_position() {
                return author_position;
            }

            public void setAuthor_position(Object author_position) {
                this.author_position = author_position;
            }

            public AvatarLargeBeanX getAvatar_large() {
                return avatar_large;
            }

            public void setAvatar_large(AvatarLargeBeanX avatar_large) {
                this.avatar_large = avatar_large;
            }

            public AvatarMediumBeanXXX getAvatar_medium() {
                return avatar_medium;
            }

            public void setAvatar_medium(AvatarMediumBeanXXX avatar_medium) {
                this.avatar_medium = avatar_medium;
            }

            public AvatarThumbBeanXXX getAvatar_thumb() {
                return avatar_thumb;
            }

            public void setAvatar_thumb(AvatarThumbBeanXXX avatar_thumb) {
                this.avatar_thumb = avatar_thumb;
            }

            public int getCollect_stat() {
                return collect_stat;
            }

            public void setCollect_stat(int collect_stat) {
                this.collect_stat = collect_stat;
            }

            public CoverHdBeanX getCover_hd() {
                return cover_hd;
            }

            public void setCover_hd(CoverHdBeanX cover_hd) {
                this.cover_hd = cover_hd;
            }

            public CoverLargeBeanX getCover_large() {
                return cover_large;
            }

            public void setCover_large(CoverLargeBeanX cover_large) {
                this.cover_large = cover_large;
            }

            public CoverMediumBeanX getCover_medium() {
                return cover_medium;
            }

            public void setCover_medium(CoverMediumBeanX cover_medium) {
                this.cover_medium = cover_medium;
            }

            public CoverThumbBeanX getCover_thumb() {
                return cover_thumb;
            }

            public void setCover_thumb(CoverThumbBeanX cover_thumb) {
                this.cover_thumb = cover_thumb;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getEnd_time() {
                return end_time;
            }

            public void setEnd_time(int end_time) {
                this.end_time = end_time;
            }

            public Object getExternal_song_info() {
                return external_song_info;
            }

            public void setExternal_song_info(Object external_song_info) {
                this.external_song_info = external_song_info;
            }

            public String getExtra() {
                return extra;
            }

            public void setExtra(String extra) {
                this.extra = extra;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public String getId_str() {
                return id_str;
            }

            public void setId_str(String id_str) {
                this.id_str = id_str;
            }

            public boolean isIs_del_video() {
                return is_del_video;
            }

            public void setIs_del_video(boolean is_del_video) {
                this.is_del_video = is_del_video;
            }

            public boolean isIs_original() {
                return is_original;
            }

            public void setIs_original(boolean is_original) {
                this.is_original = is_original;
            }

            public boolean isIs_video_self_see() {
                return is_video_self_see;
            }

            public void setIs_video_self_see(boolean is_video_self_see) {
                this.is_video_self_see = is_video_self_see;
            }

            public String getMid() {
                return mid;
            }

            public void setMid(String mid) {
                this.mid = mid;
            }

            public boolean isMute_share() {
                return mute_share;
            }

            public void setMute_share(boolean mute_share) {
                this.mute_share = mute_share;
            }

            public String getOffline_desc() {
                return offline_desc;
            }

            public void setOffline_desc(String offline_desc) {
                this.offline_desc = offline_desc;
            }

            public String getOwner_handle() {
                return owner_handle;
            }

            public void setOwner_handle(String owner_handle) {
                this.owner_handle = owner_handle;
            }

            public String getOwner_id() {
                return owner_id;
            }

            public void setOwner_id(String owner_id) {
                this.owner_id = owner_id;
            }

            public String getOwner_nickname() {
                return owner_nickname;
            }

            public void setOwner_nickname(String owner_nickname) {
                this.owner_nickname = owner_nickname;
            }

            public PlayUrlBeanX getPlay_url() {
                return play_url;
            }

            public void setPlay_url(PlayUrlBeanX play_url) {
                this.play_url = play_url;
            }

            public Object getPosition() {
                return position;
            }

            public void setPosition(Object position) {
                this.position = position;
            }

            public boolean isPrevent_download() {
                return prevent_download;
            }

            public void setPrevent_download(boolean prevent_download) {
                this.prevent_download = prevent_download;
            }

            public int getPreview_end_time() {
                return preview_end_time;
            }

            public void setPreview_end_time(int preview_end_time) {
                this.preview_end_time = preview_end_time;
            }

            public int getPreview_start_time() {
                return preview_start_time;
            }

            public void setPreview_start_time(int preview_start_time) {
                this.preview_start_time = preview_start_time;
            }

            public String getSec_uid() {
                return sec_uid;
            }

            public void setSec_uid(String sec_uid) {
                this.sec_uid = sec_uid;
            }

            public int getSource_platform() {
                return source_platform;
            }

            public void setSource_platform(int source_platform) {
                this.source_platform = source_platform;
            }

            public int getStart_time() {
                return start_time;
            }

            public void setStart_time(int start_time) {
                this.start_time = start_time;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public Object getUnshelve_countries() {
                return unshelve_countries;
            }

            public void setUnshelve_countries(Object unshelve_countries) {
                this.unshelve_countries = unshelve_countries;
            }

            public static class AvatarLargeBeanX {
                /**
                 * height : 720
                 * uri : tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac
                 * url_list : ["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class AvatarMediumBeanXXX {
                /**
                 * height : 720
                 * uri : tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac
                 * url_list : ["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class AvatarThumbBeanXXX {
                /**
                 * height : 720
                 * uri : tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac
                 * url_list : ["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverHdBeanX {
                /**
                 * height : 720
                 * uri : tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac
                 * url_list : ["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverLargeBeanX {
                /**
                 * height : 720
                 * uri : tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac
                 * url_list : ["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_1080x1080.jpeg?from=4010531038"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverMediumBeanX {
                /**
                 * height : 720
                 * uri : tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac
                 * url_list : ["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_720x720.jpeg?from=4010531038"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CoverThumbBeanX {
                /**
                 * height : 720
                 * uri : tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac
                 * url_list : ["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/5e9fffd223cc893ad992cfe92513fdac~c5_100x100.jpeg?from=4010531038"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class PlayUrlBeanX {
                /**
                 * height : 720
                 * uri : http://p9-dy.byteimg.com/obj/ies-music/6883670237451930381.mp3
                 * url_list : ["http://p9-dy.byteimg.com/obj/ies-music/6883670237451930381.mp3","http://p1-dy.byteimg.com/obj/ies-music/6883670237451930381.mp3"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }
        }

        public static class RawAdDataBean {
            /**
             * ad_id : 1680495230957580
             * ad_tag_position : 2
             * animation_type : 1
             * avatar_url : http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad
             * button_style : 1
             * button_text : 查看详情
             * click_track_url_list : {"uri":"","url_list":["https://e.cn.miaozhen.com/r/k=2198229&p=7gcaa&rt=2&pro=s&tr=202010151353530100140450800D5ADE59&ns=113.65.209.51&mo=0&m1a=edf462a213db8c0d2a151ccac360e7a4&m2=7fd8959419a37b887d0ffd34b461cd2d&m5=__IDFA__&m6a=__MAC__&ls=23.1x113.4x100.0&vv=1&o="]}
             * comment_area : {"avatar_icon":{"uri":"web.business.image/202010145d0d45ffb5b847a84e14bf0c","url_list":["http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad","http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad"]},"button_text":"查看详情","comment_info":"#脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！","comment_nickname":"脆脆鲨鲨刻能新上市","comment_time":1603036800,"show_button_number":10,"source":"脆脆鲨鲨刻能新上市","title":"#脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！"}
             * comment_area_switch : true
             * creative_id : 1680495387887629
             * disable_show_ad_link : true
             * dislike : {"dislike_url":"https://aweme.snssdk.com/falcon/fe_douyin_ad_react/pages/ad_push?hide_nav_bar=1&enter_type=normal_ad","label_clickable":true,"name":"为什么看到此广告"}
             * effective_play_time : 5
             * effective_play_track_url_list : {"uri":"","url_list":["https://g.cn.miaozhen.com/x/k=2198229&p=7gcab&rt=2&pro=s&tr=202010151353530100140450800D5ADE59&ns=113.65.209.51&mo=0&m1a=edf462a213db8c0d2a151ccac360e7a4&m2=7fd8959419a37b887d0ffd34b461cd2d&m5=__IDFA__&m6a=__MAC__&ls=23.1x113.4x100.0&vv=1&o="]}
             * group_id : 6883670241025576205
             * is_preview : false
             * is_real_author : true
             * label : {"color":"#14FFFFFF","color_text":"#7FFFFFFF","text":"广告","type":4}
             * learn_more_bg_color : #E67D2E
             * log_extra : {"ad_id":1680495230957580,"awesome_splash_ad_id":1680439311212573,"bdid":"2fd0c894386ea37230e015c2dd3271a8878c6c90f61edaa712781b7fb6434241","card_id":0,"city_id_brand":440100,"clickid":"EI2QkZXtjP4CGIv17-fkASCqrLqgigIwDDiHuQJCIjIwMjAxMDE1MTM1MzUzMDEwMDE0MDQ1MDgwMEQ1QURFNTlIwbgC","component_ids":[8,9,13,38],"convert_component_suspend":0,"convert_id":0,"first_splash_show":1,"hyrule_atype":[],"is_pack_v2":true,"orit":40001,"placement":"unknown","req_id":"202010151353530100140450800D5ADE59","rit":40071,"style_id":4916,"style_ids":[4916],"vid":"2079428,2074568,2064649,2081276,2041701,2041459,1864404,2069662,1967211,1702641,2070764,2059243,1999155,1363731,2092715,2062059,2093658,1630376,1721662,1863628,2063942,1502561,1915686,1686911,2054037,1872498,2027856,1759136,1559151,2096444,2090536,2052595,2062498,1919713,1973593,1371807,1999048,2086383,2028546,2034339,1649432,1711118,1962348,1877132,1914588,1931512,1802606,2025882,2066364,1938274,2092417,1921551,2016804,946599,1548386,2050186,2027582,1933509,1856457,2092195,2049970,1847189,2040780,2071677,1922032,2063387,2070881,2076365,1854881,1769935,1954115,2090902,2093760,1287775,1996411,1788822,2021604,2064701,2000602,2008178,2018110,1957537,2023863,2052902,1927617,2094615,2023838,1858797,2088124,1987817,2048550,2018926,372442,1999041,1586303,1803849,2034508,2086488,2068621,2094079,1409057,2063908,2067123,2094908,1477639,2095792,2085127,1973466,2026313,2014223,1733176,2057867,2068693,1781885,2055606,2037300,2061818,2088045,2084493,2090256,2096049,930218,1918567,2046182,2082475,2072686,2057475,1437737,1756367,2045135,2095700,2093055,1993503,2000177,2087540,2078193,1766311,1878449,1316532,2091517,1935100,2093673,1737179,692246,2090887,1675203,2044708,2083838,2021605,2047962,2070478,2091788,2056525,2095801,2091927,1689196,2071632,1634350,2072814,2047011,1936545,1749597,2088469,2057733,1745311,2062715,1684045,1748501,2039491,2090772,1980930,2084199,2048617,1861459,2086266,1992558,2086194,1771997,1668718,2080462,1997876,1442946,2094992,1477989,2066329,1974358,2071124,2090171,1929739,2085714,2000632,2078630,1978885,1983665,1878838,2093641,2087284,1961262,1890594,1998351,2095632,1965398,2051212,2074195,1350814,2085477,1952286,1960178,1943882,1898634,2092921,2079151,2091242,2033160,1988991,2092012,1776768,2042434,1709892,1287465,2080498,2085742,2079981,1475013,1540878,2090104,1908320,2053237,2095288,2092020,2093098,1934496,1965093,2031019,1966493,2093228,2079819,2048628,2083576,2086431,2088594,2095698,1527915,1271269,1910043,2037655,2021040,1569140,2040028,2085732,1317390,2045492,2046513,1732302,1284629,2073272,2079286,2043248,2082042,1304704,1919592,1922933,2085501,1662487,1851215,1887734,2092581,1383003,1880555,1725914,2078595,1657760,2096370,1858015,1589053,2086239,2095283,1771198,2082555,1871664,1990026,2035361,2070465,1507330,2078510,2088585,2074398,2023880,1856670,2093131,1278726,2051829,1902568,1921096,2037087,1793443,2089586,2075114,1993411,2090709,2023025,2007076,2080265,1778383,2007337,1771808,2092216,1980052,2072392,1978032,2049621,2073894,1737464,1865396,2081975,2085543,1960528,2094847,2094897,2076230,2090738,2070134,1471649,2047164,2096209,2064909,1961981,1966142,2056262,1978083,2062386,1901648,2089428,1566627,1716918,2079588,2009486,2084360,2038247,1447419,2086078,1741207,2007565,2050607,1683123,1995036,2056756,2081111,1965624,2063746,1329106,2087008,2067369,2094981,2082996,1938812,2090649,2095731,2049730,2014042,1856698,2062848,1960098,1630402,1997199,1563866,2046484,2047176,2056486,1553292,2066097,2078548,2048549,1852086,2092463,2020692,2094891,2087366,2028317,2088196,1909913,2076736,1551584,2064014,1710080,1937601,1333775,2066696,1856545,1648176,2095255,2063672,1745643,2058525,2034060,2081927,1880623,2071181,2045489,2085667,2019195,1894146,2064668,1974198,2038604,2032352,1498261,2065976,1550413,2045824,2087242,2045179,2087291,1368035,2068060,2079679,2045544,1952297,2045877,2046550,2092618,1527621,2096386,2063571,2062385,2046488,2062052,2047049,2047031,2045496,2053655,2086241,2080527"}
             * report_enable : true
             * show_button_seconds : 6
             * show_mask_times : 2
             * source : 脆脆鲨鲨刻能新上市
             * splash_info : {"awesome_splash_id":"1680439311212573","enable_splash_open":true,"end_time":1603123200,"hot_show_type":1,"predownload_text":"已预加载","preload_size":810,"skip_info":{"background_color":"#34000000","countdown_unit":"","text":"跳过广告","text_color":"#FFFFFFFF"},"splash_show_time":3000}
             * title : #脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！
             * track_url_list : {"uri":"","url_list":["https://g.cn.miaozhen.com/x/k=2198229&p=7gcaa&rt=2&pro=s&tr=202010151353530100140450800D5ADE59&ns=113.65.209.51&mo=0&m1a=edf462a213db8c0d2a151ccac360e7a4&m2=7fd8959419a37b887d0ffd34b461cd2d&m5=__IDFA__&m6a=__MAC__&ls=23.1x113.4x100.0&vv=1&o="]}
             * type : web
             * use_ordinary_web : true
             * video_transpose : 0
             * web_title : 脆脆鲨鲨刻能新上市
             * web_url : https://3.cn/100rwUP-a
             */

            private long ad_id;
            private int ad_tag_position;
            private int animation_type;
            private String avatar_url;
            private int button_style;
            private String button_text;
            private ClickTrackUrlListBean click_track_url_list;
            private CommentAreaBean comment_area;
            private boolean comment_area_switch;
            private long creative_id;
            private boolean disable_show_ad_link;
            private DislikeBean dislike;
            private int effective_play_time;
            private EffectivePlayTrackUrlListBean effective_play_track_url_list;
            private long group_id;
            private boolean is_preview;
            private boolean is_real_author;
            private LabelBean label;
            private String learn_more_bg_color;
            private String log_extra;
            private boolean report_enable;
            private int show_button_seconds;
            private int show_mask_times;
            private String source;
            private SplashInfoBean splash_info;
            private String title;
            private TrackUrlListBean track_url_list;
            private String type;
            private boolean use_ordinary_web;
            private int video_transpose;
            private String web_title;
            private String web_url;

            public long getAd_id() {
                return ad_id;
            }

            public void setAd_id(long ad_id) {
                this.ad_id = ad_id;
            }

            public int getAd_tag_position() {
                return ad_tag_position;
            }

            public void setAd_tag_position(int ad_tag_position) {
                this.ad_tag_position = ad_tag_position;
            }

            public int getAnimation_type() {
                return animation_type;
            }

            public void setAnimation_type(int animation_type) {
                this.animation_type = animation_type;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public int getButton_style() {
                return button_style;
            }

            public void setButton_style(int button_style) {
                this.button_style = button_style;
            }

            public String getButton_text() {
                return button_text;
            }

            public void setButton_text(String button_text) {
                this.button_text = button_text;
            }

            public ClickTrackUrlListBean getClick_track_url_list() {
                return click_track_url_list;
            }

            public void setClick_track_url_list(ClickTrackUrlListBean click_track_url_list) {
                this.click_track_url_list = click_track_url_list;
            }

            public CommentAreaBean getComment_area() {
                return comment_area;
            }

            public void setComment_area(CommentAreaBean comment_area) {
                this.comment_area = comment_area;
            }

            public boolean isComment_area_switch() {
                return comment_area_switch;
            }

            public void setComment_area_switch(boolean comment_area_switch) {
                this.comment_area_switch = comment_area_switch;
            }

            public long getCreative_id() {
                return creative_id;
            }

            public void setCreative_id(long creative_id) {
                this.creative_id = creative_id;
            }

            public boolean isDisable_show_ad_link() {
                return disable_show_ad_link;
            }

            public void setDisable_show_ad_link(boolean disable_show_ad_link) {
                this.disable_show_ad_link = disable_show_ad_link;
            }

            public DislikeBean getDislike() {
                return dislike;
            }

            public void setDislike(DislikeBean dislike) {
                this.dislike = dislike;
            }

            public int getEffective_play_time() {
                return effective_play_time;
            }

            public void setEffective_play_time(int effective_play_time) {
                this.effective_play_time = effective_play_time;
            }

            public EffectivePlayTrackUrlListBean getEffective_play_track_url_list() {
                return effective_play_track_url_list;
            }

            public void setEffective_play_track_url_list(EffectivePlayTrackUrlListBean effective_play_track_url_list) {
                this.effective_play_track_url_list = effective_play_track_url_list;
            }

            public long getGroup_id() {
                return group_id;
            }

            public void setGroup_id(long group_id) {
                this.group_id = group_id;
            }

            public boolean isIs_preview() {
                return is_preview;
            }

            public void setIs_preview(boolean is_preview) {
                this.is_preview = is_preview;
            }

            public boolean isIs_real_author() {
                return is_real_author;
            }

            public void setIs_real_author(boolean is_real_author) {
                this.is_real_author = is_real_author;
            }

            public LabelBean getLabel() {
                return label;
            }

            public void setLabel(LabelBean label) {
                this.label = label;
            }

            public String getLearn_more_bg_color() {
                return learn_more_bg_color;
            }

            public void setLearn_more_bg_color(String learn_more_bg_color) {
                this.learn_more_bg_color = learn_more_bg_color;
            }

            public String getLog_extra() {
                return log_extra;
            }

            public void setLog_extra(String log_extra) {
                this.log_extra = log_extra;
            }

            public boolean isReport_enable() {
                return report_enable;
            }

            public void setReport_enable(boolean report_enable) {
                this.report_enable = report_enable;
            }

            public int getShow_button_seconds() {
                return show_button_seconds;
            }

            public void setShow_button_seconds(int show_button_seconds) {
                this.show_button_seconds = show_button_seconds;
            }

            public int getShow_mask_times() {
                return show_mask_times;
            }

            public void setShow_mask_times(int show_mask_times) {
                this.show_mask_times = show_mask_times;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public SplashInfoBean getSplash_info() {
                return splash_info;
            }

            public void setSplash_info(SplashInfoBean splash_info) {
                this.splash_info = splash_info;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public TrackUrlListBean getTrack_url_list() {
                return track_url_list;
            }

            public void setTrack_url_list(TrackUrlListBean track_url_list) {
                this.track_url_list = track_url_list;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public boolean isUse_ordinary_web() {
                return use_ordinary_web;
            }

            public void setUse_ordinary_web(boolean use_ordinary_web) {
                this.use_ordinary_web = use_ordinary_web;
            }

            public int getVideo_transpose() {
                return video_transpose;
            }

            public void setVideo_transpose(int video_transpose) {
                this.video_transpose = video_transpose;
            }

            public String getWeb_title() {
                return web_title;
            }

            public void setWeb_title(String web_title) {
                this.web_title = web_title;
            }

            public String getWeb_url() {
                return web_url;
            }

            public void setWeb_url(String web_url) {
                this.web_url = web_url;
            }

            public static class ClickTrackUrlListBean {
                /**
                 * uri :
                 * url_list : ["https://e.cn.miaozhen.com/r/k=2198229&p=7gcaa&rt=2&pro=s&tr=202010151353530100140450800D5ADE59&ns=113.65.209.51&mo=0&m1a=edf462a213db8c0d2a151ccac360e7a4&m2=7fd8959419a37b887d0ffd34b461cd2d&m5=__IDFA__&m6a=__MAC__&ls=23.1x113.4x100.0&vv=1&o="]
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class CommentAreaBean {
                /**
                 * avatar_icon : {"uri":"web.business.image/202010145d0d45ffb5b847a84e14bf0c","url_list":["http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad","http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad"]}
                 * button_text : 查看详情
                 * comment_info : #脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！
                 * comment_nickname : 脆脆鲨鲨刻能新上市
                 * comment_time : 1603036800
                 * show_button_number : 10
                 * source : 脆脆鲨鲨刻能新上市
                 * title : #脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！
                 */

                private AvatarIconBean avatar_icon;
                private String button_text;
                private String comment_info;
                private String comment_nickname;
                private int comment_time;
                private int show_button_number;
                private String source;
                private String title;

                public AvatarIconBean getAvatar_icon() {
                    return avatar_icon;
                }

                public void setAvatar_icon(AvatarIconBean avatar_icon) {
                    this.avatar_icon = avatar_icon;
                }

                public String getButton_text() {
                    return button_text;
                }

                public void setButton_text(String button_text) {
                    this.button_text = button_text;
                }

                public String getComment_info() {
                    return comment_info;
                }

                public void setComment_info(String comment_info) {
                    this.comment_info = comment_info;
                }

                public String getComment_nickname() {
                    return comment_nickname;
                }

                public void setComment_nickname(String comment_nickname) {
                    this.comment_nickname = comment_nickname;
                }

                public int getComment_time() {
                    return comment_time;
                }

                public void setComment_time(int comment_time) {
                    this.comment_time = comment_time;
                }

                public int getShow_button_number() {
                    return show_button_number;
                }

                public void setShow_button_number(int show_button_number) {
                    this.show_button_number = show_button_number;
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

                public static class AvatarIconBean {
                    /**
                     * uri : web.business.image/202010145d0d45ffb5b847a84e14bf0c
                     * url_list : ["http://sf1-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad","http://sf3-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad","http://sf6-ttcdn-tos.pstatp.com/obj/web.business.image/202010145d0d45ffb5b847a84e14bf0c?from=ad"]
                     */

                    private String uri;
                    private List<String> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }
            }

            public static class DislikeBean {
                /**
                 * dislike_url : https://aweme.snssdk.com/falcon/fe_douyin_ad_react/pages/ad_push?hide_nav_bar=1&enter_type=normal_ad
                 * label_clickable : true
                 * name : 为什么看到此广告
                 */

                private String dislike_url;
                private boolean label_clickable;
                private String name;

                public String getDislike_url() {
                    return dislike_url;
                }

                public void setDislike_url(String dislike_url) {
                    this.dislike_url = dislike_url;
                }

                public boolean isLabel_clickable() {
                    return label_clickable;
                }

                public void setLabel_clickable(boolean label_clickable) {
                    this.label_clickable = label_clickable;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class EffectivePlayTrackUrlListBean {
                /**
                 * uri :
                 * url_list : ["https://g.cn.miaozhen.com/x/k=2198229&p=7gcab&rt=2&pro=s&tr=202010151353530100140450800D5ADE59&ns=113.65.209.51&mo=0&m1a=edf462a213db8c0d2a151ccac360e7a4&m2=7fd8959419a37b887d0ffd34b461cd2d&m5=__IDFA__&m6a=__MAC__&ls=23.1x113.4x100.0&vv=1&o="]
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class LabelBean {
                /**
                 * color : #14FFFFFF
                 * color_text : #7FFFFFFF
                 * text : 广告
                 * type : 4
                 */

                private String color;
                private String color_text;
                private String text;
                private int type;

                public String getColor() {
                    return color;
                }

                public void setColor(String color) {
                    this.color = color;
                }

                public String getColor_text() {
                    return color_text;
                }

                public void setColor_text(String color_text) {
                    this.color_text = color_text;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
            }

            public static class SplashInfoBean {
                /**
                 * awesome_splash_id : 1680439311212573
                 * enable_splash_open : true
                 * end_time : 1603123200
                 * hot_show_type : 1
                 * predownload_text : 已预加载
                 * preload_size : 810
                 * skip_info : {"background_color":"#34000000","countdown_unit":"","text":"跳过广告","text_color":"#FFFFFFFF"}
                 * splash_show_time : 3000
                 */

                private String awesome_splash_id;
                private boolean enable_splash_open;
                private int end_time;
                private int hot_show_type;
                private String predownload_text;
                private int preload_size;
                private SkipInfoBean skip_info;
                private int splash_show_time;

                public String getAwesome_splash_id() {
                    return awesome_splash_id;
                }

                public void setAwesome_splash_id(String awesome_splash_id) {
                    this.awesome_splash_id = awesome_splash_id;
                }

                public boolean isEnable_splash_open() {
                    return enable_splash_open;
                }

                public void setEnable_splash_open(boolean enable_splash_open) {
                    this.enable_splash_open = enable_splash_open;
                }

                public int getEnd_time() {
                    return end_time;
                }

                public void setEnd_time(int end_time) {
                    this.end_time = end_time;
                }

                public int getHot_show_type() {
                    return hot_show_type;
                }

                public void setHot_show_type(int hot_show_type) {
                    this.hot_show_type = hot_show_type;
                }

                public String getPredownload_text() {
                    return predownload_text;
                }

                public void setPredownload_text(String predownload_text) {
                    this.predownload_text = predownload_text;
                }

                public int getPreload_size() {
                    return preload_size;
                }

                public void setPreload_size(int preload_size) {
                    this.preload_size = preload_size;
                }

                public SkipInfoBean getSkip_info() {
                    return skip_info;
                }

                public void setSkip_info(SkipInfoBean skip_info) {
                    this.skip_info = skip_info;
                }

                public int getSplash_show_time() {
                    return splash_show_time;
                }

                public void setSplash_show_time(int splash_show_time) {
                    this.splash_show_time = splash_show_time;
                }

                public static class SkipInfoBean {
                    /**
                     * background_color : #34000000
                     * countdown_unit :
                     * text : 跳过广告
                     * text_color : #FFFFFFFF
                     */

                    private String background_color;
                    private String countdown_unit;
                    private String text;
                    private String text_color;

                    public String getBackground_color() {
                        return background_color;
                    }

                    public void setBackground_color(String background_color) {
                        this.background_color = background_color;
                    }

                    public String getCountdown_unit() {
                        return countdown_unit;
                    }

                    public void setCountdown_unit(String countdown_unit) {
                        this.countdown_unit = countdown_unit;
                    }

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public String getText_color() {
                        return text_color;
                    }

                    public void setText_color(String text_color) {
                        this.text_color = text_color;
                    }
                }
            }

            public static class TrackUrlListBean {
                /**
                 * uri :
                 * url_list : ["https://g.cn.miaozhen.com/x/k=2198229&p=7gcaa&rt=2&pro=s&tr=202010151353530100140450800D5ADE59&ns=113.65.209.51&mo=0&m1a=edf462a213db8c0d2a151ccac360e7a4&m2=7fd8959419a37b887d0ffd34b461cd2d&m5=__IDFA__&m6a=__MAC__&ls=23.1x113.4x100.0&vv=1&o="]
                 */

                private String uri;
                private List<String> url_list;

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }
        }

        public static class ShareInfoBeanXXX {
            /**
             * bool_persist : 0
             * share_desc : 在抖音，记录美好生活
             * share_link_desc : #脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！ %s 复制此链接，打开【抖音短视频】，直接观看视频！
             * share_quote :
             * share_title : #脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！
             * share_title_myself :
             * share_title_other :
             * share_url : https://www.iesdouyin.com/share/video/6883670241025576205/?region=CN&mid=6883670264656202504&u_code=i0kji679&titleType=title
             * share_weibo_desc : #在抖音，记录美好生活##脆脆高能鲨出重围 惊了惊了！黄明昊心动之选大曝光，不是圆的是长的！
             */

            private int bool_persist;
            private String share_desc;
            private String share_link_desc;
            private String share_quote;
            private String share_title;
            private String share_title_myself;
            private String share_title_other;
            private String share_url;
            private String share_weibo_desc;

            public int getBool_persist() {
                return bool_persist;
            }

            public void setBool_persist(int bool_persist) {
                this.bool_persist = bool_persist;
            }

            public String getShare_desc() {
                return share_desc;
            }

            public void setShare_desc(String share_desc) {
                this.share_desc = share_desc;
            }

            public String getShare_link_desc() {
                return share_link_desc;
            }

            public void setShare_link_desc(String share_link_desc) {
                this.share_link_desc = share_link_desc;
            }

            public String getShare_quote() {
                return share_quote;
            }

            public void setShare_quote(String share_quote) {
                this.share_quote = share_quote;
            }

            public String getShare_title() {
                return share_title;
            }

            public void setShare_title(String share_title) {
                this.share_title = share_title;
            }

            public String getShare_title_myself() {
                return share_title_myself;
            }

            public void setShare_title_myself(String share_title_myself) {
                this.share_title_myself = share_title_myself;
            }

            public String getShare_title_other() {
                return share_title_other;
            }

            public void setShare_title_other(String share_title_other) {
                this.share_title_other = share_title_other;
            }

            public String getShare_url() {
                return share_url;
            }

            public void setShare_url(String share_url) {
                this.share_url = share_url;
            }

            public String getShare_weibo_desc() {
                return share_weibo_desc;
            }

            public void setShare_weibo_desc(String share_weibo_desc) {
                this.share_weibo_desc = share_weibo_desc;
            }
        }

        public static class StatisticsBeanX {
            /**
             * aweme_id : 6883670241025576205
             * comment_count : 0
             * digg_count : 0
             * download_count : 0
             * forward_count : 0
             * lose_comment_count : 0
             * lose_count : 0
             * play_count : 0
             * share_count : 0
             */

            private String aweme_id;
            private int comment_count;
            private int digg_count;
            private int download_count;
            private int forward_count;
            private int lose_comment_count;
            private int lose_count;
            private int play_count;
            private int share_count;

            public String getAweme_id() {
                return aweme_id;
            }

            public void setAweme_id(String aweme_id) {
                this.aweme_id = aweme_id;
            }

            public int getComment_count() {
                return comment_count;
            }

            public void setComment_count(int comment_count) {
                this.comment_count = comment_count;
            }

            public int getDigg_count() {
                return digg_count;
            }

            public void setDigg_count(int digg_count) {
                this.digg_count = digg_count;
            }

            public int getDownload_count() {
                return download_count;
            }

            public void setDownload_count(int download_count) {
                this.download_count = download_count;
            }

            public int getForward_count() {
                return forward_count;
            }

            public void setForward_count(int forward_count) {
                this.forward_count = forward_count;
            }

            public int getLose_comment_count() {
                return lose_comment_count;
            }

            public void setLose_comment_count(int lose_comment_count) {
                this.lose_comment_count = lose_comment_count;
            }

            public int getLose_count() {
                return lose_count;
            }

            public void setLose_count(int lose_count) {
                this.lose_count = lose_count;
            }

            public int getPlay_count() {
                return play_count;
            }

            public void setPlay_count(int play_count) {
                this.play_count = play_count;
            }

            public int getShare_count() {
                return share_count;
            }

            public void setShare_count(int share_count) {
                this.share_count = share_count;
            }
        }

        public static class StatusBeanXX {
            /**
             * allow_comment : true
             * allow_share : true
             * aweme_id : 6883670241025576205
             * download_status : 0
             * in_reviewing : false
             * is_delete : false
             * is_private : false
             * is_prohibited : false
             * private_status : 0
             * reviewed : 1
             * self_see : false
             * with_fusion_goods : false
             * with_goods : false
             */

            private boolean allow_comment;
            private boolean allow_share;
            private String aweme_id;
            private int download_status;
            private boolean in_reviewing;
            private boolean is_delete;
            private boolean is_private;
            private boolean is_prohibited;
            private int private_status;
            private int reviewed;
            private boolean self_see;
            private boolean with_fusion_goods;
            private boolean with_goods;

            public boolean isAllow_comment() {
                return allow_comment;
            }

            public void setAllow_comment(boolean allow_comment) {
                this.allow_comment = allow_comment;
            }

            public boolean isAllow_share() {
                return allow_share;
            }

            public void setAllow_share(boolean allow_share) {
                this.allow_share = allow_share;
            }

            public String getAweme_id() {
                return aweme_id;
            }

            public void setAweme_id(String aweme_id) {
                this.aweme_id = aweme_id;
            }

            public int getDownload_status() {
                return download_status;
            }

            public void setDownload_status(int download_status) {
                this.download_status = download_status;
            }

            public boolean isIn_reviewing() {
                return in_reviewing;
            }

            public void setIn_reviewing(boolean in_reviewing) {
                this.in_reviewing = in_reviewing;
            }

            public boolean isIs_delete() {
                return is_delete;
            }

            public void setIs_delete(boolean is_delete) {
                this.is_delete = is_delete;
            }

            public boolean isIs_private() {
                return is_private;
            }

            public void setIs_private(boolean is_private) {
                this.is_private = is_private;
            }

            public boolean isIs_prohibited() {
                return is_prohibited;
            }

            public void setIs_prohibited(boolean is_prohibited) {
                this.is_prohibited = is_prohibited;
            }

            public int getPrivate_status() {
                return private_status;
            }

            public void setPrivate_status(int private_status) {
                this.private_status = private_status;
            }

            public int getReviewed() {
                return reviewed;
            }

            public void setReviewed(int reviewed) {
                this.reviewed = reviewed;
            }

            public boolean isSelf_see() {
                return self_see;
            }

            public void setSelf_see(boolean self_see) {
                this.self_see = self_see;
            }

            public boolean isWith_fusion_goods() {
                return with_fusion_goods;
            }

            public void setWith_fusion_goods(boolean with_fusion_goods) {
                this.with_fusion_goods = with_fusion_goods;
            }

            public boolean isWith_goods() {
                return with_goods;
            }

            public void setWith_goods(boolean with_goods) {
                this.with_goods = with_goods;
            }
        }

        public static class VideoBeanX {
            /**
             * big_thumbs : null
             * bit_rate : [{"bit_rate":811715,"gear_name":"normal_540","is_bytevc1":0,"is_h265":0,"play_addr":{"data_size":5643451,"file_hash":"715b935324e0ee954dfbdcd56f2ad4f9","height":720,"uri":"v020336b0000bu3r87l6q7dhb8c2gl80","url_key":"v020336b0000bu3r87l6q7dhb8c2gl80_h264_540p_811715","url_list":["http://v5-dy-d.ixigua.com/f1172afbd9f3ea78ec1e92cd23227f28/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/dff5c7c62026e7c2dbaadbce10441614/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720},"quality_type":20}]
             * cdn_url_expired : 0
             * cover : {"height":720,"uri":"large/34a2c000b11da8188ff22","url_list":["http://p26-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p9-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p6-dy-ipv6.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large"],"width":720}
             * download_addr : {"data_size":5643451,"height":720,"uri":"v020336b0000bu3r87l6q7dhb8c2gl80","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&watermark=0&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&watermark=0&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&source=PackSourceEnum_FEED"],"width":720}
             * duration : 55620
             * dynamic_cover : {"height":720,"uri":"large/34a2c000b11da8188ff22","url_list":["http://p26-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p9-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p6-dy-ipv6.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large"],"width":720}
             * has_watermark : false
             * height : 960
             * is_bytevc1 : 0
             * is_h265 : 0
             * origin_cover : {"height":720,"uri":"large/34a2c000b11da8188ff22","url_list":["http://p3-dy-ipv6.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p29-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p26-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large"],"width":720}
             * play_addr : {"data_size":5643451,"file_hash":"715b935324e0ee954dfbdcd56f2ad4f9","height":720,"uri":"v020336b0000bu3r87l6q7dhb8c2gl80","url_key":"v020336b0000bu3r87l6q7dhb8c2gl80_h264_540p_811715","url_list":["http://v5-dy-d.ixigua.com/f1172afbd9f3ea78ec1e92cd23227f28/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/dff5c7c62026e7c2dbaadbce10441614/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720}
             * play_addr_lowbr : {"data_size":5643451,"file_hash":"715b935324e0ee954dfbdcd56f2ad4f9","height":720,"uri":"v020336b0000bu3r87l6q7dhb8c2gl80","url_key":"v020336b0000bu3r87l6q7dhb8c2gl80_h264_540p_811715","url_list":["http://v5-dy-d.ixigua.com/f1172afbd9f3ea78ec1e92cd23227f28/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/dff5c7c62026e7c2dbaadbce10441614/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720}
             * ratio : 540p
             * width : 540
             */

            private Object big_thumbs;
            private int cdn_url_expired;
            private CoverBeanX cover;
            private DownloadAddrBeanX download_addr;
            private int duration;
            private DynamicCoverBeanX dynamic_cover;
            private boolean has_watermark;
            private int height;
            private int is_bytevc1;
            private int is_h265;
            private OriginCoverBeanX origin_cover;
            private PlayAddrBeanXX play_addr;
            private PlayAddrLowbrBeanX play_addr_lowbr;
            private String ratio;
            private int width;
            private List<BitRateBeanX> bit_rate;

            public Object getBig_thumbs() {
                return big_thumbs;
            }

            public void setBig_thumbs(Object big_thumbs) {
                this.big_thumbs = big_thumbs;
            }

            public int getCdn_url_expired() {
                return cdn_url_expired;
            }

            public void setCdn_url_expired(int cdn_url_expired) {
                this.cdn_url_expired = cdn_url_expired;
            }

            public CoverBeanX getCover() {
                return cover;
            }

            public void setCover(CoverBeanX cover) {
                this.cover = cover;
            }

            public DownloadAddrBeanX getDownload_addr() {
                return download_addr;
            }

            public void setDownload_addr(DownloadAddrBeanX download_addr) {
                this.download_addr = download_addr;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public DynamicCoverBeanX getDynamic_cover() {
                return dynamic_cover;
            }

            public void setDynamic_cover(DynamicCoverBeanX dynamic_cover) {
                this.dynamic_cover = dynamic_cover;
            }

            public boolean isHas_watermark() {
                return has_watermark;
            }

            public void setHas_watermark(boolean has_watermark) {
                this.has_watermark = has_watermark;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getIs_bytevc1() {
                return is_bytevc1;
            }

            public void setIs_bytevc1(int is_bytevc1) {
                this.is_bytevc1 = is_bytevc1;
            }

            public int getIs_h265() {
                return is_h265;
            }

            public void setIs_h265(int is_h265) {
                this.is_h265 = is_h265;
            }

            public OriginCoverBeanX getOrigin_cover() {
                return origin_cover;
            }

            public void setOrigin_cover(OriginCoverBeanX origin_cover) {
                this.origin_cover = origin_cover;
            }

            public PlayAddrBeanXX getPlay_addr() {
                return play_addr;
            }

            public void setPlay_addr(PlayAddrBeanXX play_addr) {
                this.play_addr = play_addr;
            }

            public PlayAddrLowbrBeanX getPlay_addr_lowbr() {
                return play_addr_lowbr;
            }

            public void setPlay_addr_lowbr(PlayAddrLowbrBeanX play_addr_lowbr) {
                this.play_addr_lowbr = play_addr_lowbr;
            }

            public String getRatio() {
                return ratio;
            }

            public void setRatio(String ratio) {
                this.ratio = ratio;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<BitRateBeanX> getBit_rate() {
                return bit_rate;
            }

            public void setBit_rate(List<BitRateBeanX> bit_rate) {
                this.bit_rate = bit_rate;
            }

            public static class CoverBeanX {
                /**
                 * height : 720
                 * uri : large/34a2c000b11da8188ff22
                 * url_list : ["http://p26-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p9-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p6-dy-ipv6.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class DownloadAddrBeanX {
                /**
                 * data_size : 5643451
                 * height : 720
                 * uri : v020336b0000bu3r87l6q7dhb8c2gl80
                 * url_list : ["https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&watermark=0&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&watermark=0&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme&source=PackSourceEnum_FEED"]
                 * width : 720
                 */

                private int data_size;
                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getData_size() {
                    return data_size;
                }

                public void setData_size(int data_size) {
                    this.data_size = data_size;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class DynamicCoverBeanX {
                /**
                 * height : 720
                 * uri : large/34a2c000b11da8188ff22
                 * url_list : ["http://p26-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p9-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p6-dy-ipv6.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class OriginCoverBeanX {
                /**
                 * height : 720
                 * uri : large/34a2c000b11da8188ff22
                 * url_list : ["http://p3-dy-ipv6.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p29-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large","http://p26-dy.byteimg.com/large/34a2c000b11da8188ff22.jpeg?from=2502468085_large"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class PlayAddrBeanXX {
                /**
                 * data_size : 5643451
                 * file_hash : 715b935324e0ee954dfbdcd56f2ad4f9
                 * height : 720
                 * uri : v020336b0000bu3r87l6q7dhb8c2gl80
                 * url_key : v020336b0000bu3r87l6q7dhb8c2gl80_h264_540p_811715
                 * url_list : ["http://v5-dy-d.ixigua.com/f1172afbd9f3ea78ec1e92cd23227f28/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/dff5c7c62026e7c2dbaadbce10441614/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"]
                 * width : 720
                 */

                private int data_size;
                private String file_hash;
                private int height;
                private String uri;
                private String url_key;
                private int width;
                private List<String> url_list;

                public int getData_size() {
                    return data_size;
                }

                public void setData_size(int data_size) {
                    this.data_size = data_size;
                }

                public String getFile_hash() {
                    return file_hash;
                }

                public void setFile_hash(String file_hash) {
                    this.file_hash = file_hash;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public String getUrl_key() {
                    return url_key;
                }

                public void setUrl_key(String url_key) {
                    this.url_key = url_key;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class PlayAddrLowbrBeanX {
                /**
                 * data_size : 5643451
                 * file_hash : 715b935324e0ee954dfbdcd56f2ad4f9
                 * height : 720
                 * uri : v020336b0000bu3r87l6q7dhb8c2gl80
                 * url_key : v020336b0000bu3r87l6q7dhb8c2gl80_h264_540p_811715
                 * url_list : ["http://v5-dy-d.ixigua.com/f1172afbd9f3ea78ec1e92cd23227f28/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/dff5c7c62026e7c2dbaadbce10441614/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"]
                 * width : 720
                 */

                private int data_size;
                private String file_hash;
                private int height;
                private String uri;
                private String url_key;
                private int width;
                private List<String> url_list;

                public int getData_size() {
                    return data_size;
                }

                public void setData_size(int data_size) {
                    this.data_size = data_size;
                }

                public String getFile_hash() {
                    return file_hash;
                }

                public void setFile_hash(String file_hash) {
                    this.file_hash = file_hash;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public String getUrl_key() {
                    return url_key;
                }

                public void setUrl_key(String url_key) {
                    this.url_key = url_key;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<String> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<String> url_list) {
                    this.url_list = url_list;
                }
            }

            public static class BitRateBeanX {
                /**
                 * bit_rate : 811715
                 * gear_name : normal_540
                 * is_bytevc1 : 0
                 * is_h265 : 0
                 * play_addr : {"data_size":5643451,"file_hash":"715b935324e0ee954dfbdcd56f2ad4f9","height":720,"uri":"v020336b0000bu3r87l6q7dhb8c2gl80","url_key":"v020336b0000bu3r87l6q7dhb8c2gl80_h264_540p_811715","url_list":["http://v5-dy-d.ixigua.com/f1172afbd9f3ea78ec1e92cd23227f28/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/dff5c7c62026e7c2dbaadbce10441614/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"],"width":720}
                 * quality_type : 20
                 */

                private int bit_rate;
                private String gear_name;
                private int is_bytevc1;
                private int is_h265;
                private PlayAddrBeanXXX play_addr;
                private int quality_type;

                public int getBit_rate() {
                    return bit_rate;
                }

                public void setBit_rate(int bit_rate) {
                    this.bit_rate = bit_rate;
                }

                public String getGear_name() {
                    return gear_name;
                }

                public void setGear_name(String gear_name) {
                    this.gear_name = gear_name;
                }

                public int getIs_bytevc1() {
                    return is_bytevc1;
                }

                public void setIs_bytevc1(int is_bytevc1) {
                    this.is_bytevc1 = is_bytevc1;
                }

                public int getIs_h265() {
                    return is_h265;
                }

                public void setIs_h265(int is_h265) {
                    this.is_h265 = is_h265;
                }

                public PlayAddrBeanXXX getPlay_addr() {
                    return play_addr;
                }

                public void setPlay_addr(PlayAddrBeanXXX play_addr) {
                    this.play_addr = play_addr;
                }

                public int getQuality_type() {
                    return quality_type;
                }

                public void setQuality_type(int quality_type) {
                    this.quality_type = quality_type;
                }

                public static class PlayAddrBeanXXX {
                    /**
                     * data_size : 5643451
                     * file_hash : 715b935324e0ee954dfbdcd56f2ad4f9
                     * height : 720
                     * uri : v020336b0000bu3r87l6q7dhb8c2gl80
                     * url_key : v020336b0000bu3r87l6q7dhb8c2gl80_h264_540p_811715
                     * url_list : ["http://v5-dy-d.ixigua.com/f1172afbd9f3ea78ec1e92cd23227f28/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","http://v95-dy-a.ixigua.com/dff5c7c62026e7c2dbaadbce10441614/5f87f239/video/tos/cn/tos-cn-ve-51/1ce451d29c39484fbc94e0d72b03a926/?a=1128&br=2376&bt=792&cr=3&cs=0&dr=0&ds=6&er=&l=202010151353530100140450800D5ADE59&lr=all&mime_type=video_mp4&qs=0&rc=M281O2s6OTp1eDMzZTYzM0ApPDU6NTlmaGVlNzwzaDlmM2c1ZGBfYW5pNTBfLS0zMC9zczI0NGIvMjA0Ly8tMWJeNDE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED","https://api.amemv.com/aweme/v1/play/?video_id=v020336b0000bu3r87l6q7dhb8c2gl80&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_FEED"]
                     * width : 720
                     */

                    private int data_size;
                    private String file_hash;
                    private int height;
                    private String uri;
                    private String url_key;
                    private int width;
                    private List<String> url_list;

                    public int getData_size() {
                        return data_size;
                    }

                    public void setData_size(int data_size) {
                        this.data_size = data_size;
                    }

                    public String getFile_hash() {
                        return file_hash;
                    }

                    public void setFile_hash(String file_hash) {
                        this.file_hash = file_hash;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public String getUrl_key() {
                        return url_key;
                    }

                    public void setUrl_key(String url_key) {
                        this.url_key = url_key;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public List<String> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<String> url_list) {
                        this.url_list = url_list;
                    }
                }
            }
        }

        public static class VideoControlBeanX {
            /**
             * allow_download : true
             * allow_duet : true
             * allow_dynamic_wallpaper : true
             * allow_react : true
             * draft_progress_bar : 0
             * prevent_download_type : 0
             * share_type : 1
             * show_progress_bar : 1
             * timer_status : 1
             */

            private boolean allow_download;
            private boolean allow_duet;
            private boolean allow_dynamic_wallpaper;
            private boolean allow_react;
            private int draft_progress_bar;
            private int prevent_download_type;
            private int share_type;
            private int show_progress_bar;
            private int timer_status;

            public boolean isAllow_download() {
                return allow_download;
            }

            public void setAllow_download(boolean allow_download) {
                this.allow_download = allow_download;
            }

            public boolean isAllow_duet() {
                return allow_duet;
            }

            public void setAllow_duet(boolean allow_duet) {
                this.allow_duet = allow_duet;
            }

            public boolean isAllow_dynamic_wallpaper() {
                return allow_dynamic_wallpaper;
            }

            public void setAllow_dynamic_wallpaper(boolean allow_dynamic_wallpaper) {
                this.allow_dynamic_wallpaper = allow_dynamic_wallpaper;
            }

            public boolean isAllow_react() {
                return allow_react;
            }

            public void setAllow_react(boolean allow_react) {
                this.allow_react = allow_react;
            }

            public int getDraft_progress_bar() {
                return draft_progress_bar;
            }

            public void setDraft_progress_bar(int draft_progress_bar) {
                this.draft_progress_bar = draft_progress_bar;
            }

            public int getPrevent_download_type() {
                return prevent_download_type;
            }

            public void setPrevent_download_type(int prevent_download_type) {
                this.prevent_download_type = prevent_download_type;
            }

            public int getShare_type() {
                return share_type;
            }

            public void setShare_type(int share_type) {
                this.share_type = share_type;
            }

            public int getShow_progress_bar() {
                return show_progress_bar;
            }

            public void setShow_progress_bar(int show_progress_bar) {
                this.show_progress_bar = show_progress_bar;
            }

            public int getTimer_status() {
                return timer_status;
            }

            public void setTimer_status(int timer_status) {
                this.timer_status = timer_status;
            }
        }

        public static class ChaListBean {
            /**
             * author : {"ad_cover_url":null,"cha_list":null,"cover_url":null,"followers_detail":null,"geofencing":null,"item_list":null,"new_story_cover":null,"platform_sync_info":null,"relative_users":null,"type_label":null}
             * cha_attrs : null
             * cha_name : 脆脆高能鲨出重围
             * cid : 1680436442081304
             * collect_stat : 0
             * connect_music : null
             * desc :
             * is_challenge : 0
             * is_commerce : false
             * schema : aweme://aweme/challenge/detail?cid=1680436442081304
             * type : 0
             * user_count : 0
             * view_count : 0
             */

            private AuthorBeanXX author;
            private Object cha_attrs;
            private String cha_name;
            private String cid;
            private int collect_stat;
            private Object connect_music;
            private String desc;
            private int is_challenge;
            private boolean is_commerce;
            private String schema;
            private int type;
            private int user_count;
            private int view_count;

            public AuthorBeanXX getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBeanXX author) {
                this.author = author;
            }

            public Object getCha_attrs() {
                return cha_attrs;
            }

            public void setCha_attrs(Object cha_attrs) {
                this.cha_attrs = cha_attrs;
            }

            public String getCha_name() {
                return cha_name;
            }

            public void setCha_name(String cha_name) {
                this.cha_name = cha_name;
            }

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public int getCollect_stat() {
                return collect_stat;
            }

            public void setCollect_stat(int collect_stat) {
                this.collect_stat = collect_stat;
            }

            public Object getConnect_music() {
                return connect_music;
            }

            public void setConnect_music(Object connect_music) {
                this.connect_music = connect_music;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public int getIs_challenge() {
                return is_challenge;
            }

            public void setIs_challenge(int is_challenge) {
                this.is_challenge = is_challenge;
            }

            public boolean isIs_commerce() {
                return is_commerce;
            }

            public void setIs_commerce(boolean is_commerce) {
                this.is_commerce = is_commerce;
            }

            public String getSchema() {
                return schema;
            }

            public void setSchema(String schema) {
                this.schema = schema;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUser_count() {
                return user_count;
            }

            public void setUser_count(int user_count) {
                this.user_count = user_count;
            }

            public int getView_count() {
                return view_count;
            }

            public void setView_count(int view_count) {
                this.view_count = view_count;
            }

            public static class AuthorBeanXX {
                /**
                 * ad_cover_url : null
                 * cha_list : null
                 * cover_url : null
                 * followers_detail : null
                 * geofencing : null
                 * item_list : null
                 * new_story_cover : null
                 * platform_sync_info : null
                 * relative_users : null
                 * type_label : null
                 */

                private Object ad_cover_url;
                private Object cha_list;
                private Object cover_url;
                private Object followers_detail;
                private Object geofencing;
                private Object item_list;
                private Object new_story_cover;
                private Object platform_sync_info;
                private Object relative_users;
                private Object type_label;

                public Object getAd_cover_url() {
                    return ad_cover_url;
                }

                public void setAd_cover_url(Object ad_cover_url) {
                    this.ad_cover_url = ad_cover_url;
                }

                public Object getCha_list() {
                    return cha_list;
                }

                public void setCha_list(Object cha_list) {
                    this.cha_list = cha_list;
                }

                public Object getCover_url() {
                    return cover_url;
                }

                public void setCover_url(Object cover_url) {
                    this.cover_url = cover_url;
                }

                public Object getFollowers_detail() {
                    return followers_detail;
                }

                public void setFollowers_detail(Object followers_detail) {
                    this.followers_detail = followers_detail;
                }

                public Object getGeofencing() {
                    return geofencing;
                }

                public void setGeofencing(Object geofencing) {
                    this.geofencing = geofencing;
                }

                public Object getItem_list() {
                    return item_list;
                }

                public void setItem_list(Object item_list) {
                    this.item_list = item_list;
                }

                public Object getNew_story_cover() {
                    return new_story_cover;
                }

                public void setNew_story_cover(Object new_story_cover) {
                    this.new_story_cover = new_story_cover;
                }

                public Object getPlatform_sync_info() {
                    return platform_sync_info;
                }

                public void setPlatform_sync_info(Object platform_sync_info) {
                    this.platform_sync_info = platform_sync_info;
                }

                public Object getRelative_users() {
                    return relative_users;
                }

                public void setRelative_users(Object relative_users) {
                    this.relative_users = relative_users;
                }

                public Object getType_label() {
                    return type_label;
                }

                public void setType_label(Object type_label) {
                    this.type_label = type_label;
                }
            }
        }

        public static class TextExtraBean {
            /**
             * end : 9
             * hashtag_id : 1680436442081304
             * hashtag_name : 脆脆高能鲨出重围
             * is_commerce : false
             * start : 0
             * type : 1
             */

            private int end;
            private String hashtag_id;
            private String hashtag_name;
            private boolean is_commerce;
            private int start;
            private int type;

            public int getEnd() {
                return end;
            }

            public void setEnd(int end) {
                this.end = end;
            }

            public String getHashtag_id() {
                return hashtag_id;
            }

            public void setHashtag_id(String hashtag_id) {
                this.hashtag_id = hashtag_id;
            }

            public String getHashtag_name() {
                return hashtag_name;
            }

            public void setHashtag_name(String hashtag_name) {
                this.hashtag_name = hashtag_name;
            }

            public boolean isIs_commerce() {
                return is_commerce;
            }

            public void setIs_commerce(boolean is_commerce) {
                this.is_commerce = is_commerce;
            }

            public int getStart() {
                return start;
            }

            public void setStart(int start) {
                this.start = start;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }

    public PostInfo getdata(String tag){
        postInfo=new PostInfo();
        if(this.aweme_list==null){
            return null;
        }
        postInfo.setCount(this.aweme_list.size()+"");
        ArrayList<PostInfo.InfoBean> postinfobeanlist=new ArrayList<>();
        for (DouYin.AwemeListBean b:aweme_list
        ) {
            PostInfo.InfoBean bean=new PostInfo.InfoBean();
            bean.setCreateTime(b.getCreate_time()+"");
            bean.setItemAuthor(b.getAuthor().getNickname());
            bean.setItemDomain(tag);
            bean.setItemType("2");
            bean.setItemTitle(b.getDesc());
            bean.setItemSource("抖音");
            bean.setItemUrl(b.getShare_url());
            bean.setItemComment(b.getStatistics().getComment_count()+"");
            bean.setItemRead(b.getStatistics().getPlay_count()+"");
            postinfobeanlist.add(bean);
        }
        postInfo.setInfo(postinfobeanlist);
        return postInfo;
    }
}
