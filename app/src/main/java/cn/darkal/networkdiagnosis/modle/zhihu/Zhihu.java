package cn.darkal.networkdiagnosis.modle.zhihu;

import java.util.ArrayList;
import java.util.List;

import cn.darkal.networkdiagnosis.Utils.DateUtil;
import cn.darkal.networkdiagnosis.modle.PostInfo;
import cn.darkal.networkdiagnosis.modle.PostInfoTopic;
import cn.darkal.networkdiagnosis.modle.yidian.KeJi;

public class Zhihu {


    /**
     * data : [{"id":"6_1606102141.483","type":"feed","offset":6,"verb":"TOPIC_ACKNOWLEDGED_ANSWER","created_time":1606102141,"updated_time":1606102141,"target":{"id":1514487387,"type":"answer","url":"https://api.zhihu.com/answers/1514487387","author":{"id":"cc04e2ce707843d9e7605cc6280ca4fe","type":"people","url":"https://api.zhihu.com/people/cc04e2ce707843d9e7605cc6280ca4fe","user_type":"people","url_token":"yao-hou-72","name":"妖猴","headline":"学习圣经中 - 微信:semangray","avatar_url":"https://pic3.zhimg.com/50/v2-1d6c4c18a3318ced8a67b72a724496d2_m.jpg","is_org":false,"gender":1,"badge":[],"followers_count":17605,"is_following":false,"is_followed":false},"created_time":1602220788,"updated_time":1603925611,"voteup_count":463,"thanks_count":398,"comment_count":177,"is_copyable":true,"question":{"id":419315300,"type":"question","url":"https://api.zhihu.com/questions/419315300","author":{"id":"29bc9b8e2c420737ce67a7e458582880","type":"people","url":"https://api.zhihu.com/people/29bc9b8e2c420737ce67a7e458582880","user_type":"people","url_token":"xiao-jun-cherish","name":"小君cherish","headline":"护肤方法，护肤好物推荐，化妆","avatar_url":"https://pic2.zhimg.com/50/v2-4ff7b12e8cfbfb9e9faf6dc7318d5c0d_m.jpg","is_org":false,"gender":0,"badge":[],"followers_count":16,"is_following":false,"is_followed":false},"title":"做亚马逊的选品思路是什么呢？","created":1599185049,"answer_count":35,"follower_count":284,"comment_count":0,"bound_topic_ids":[45,198642,198796],"is_following":false,"excerpt":"","question_type":"normal"},"thumbnail":"https://pic1.zhimg.com/50/v2-5768b2e5897171578470acb61c90a04a_bh.jpg","excerpt":"亚马逊的运营模式不一样，选品思路也不一样。 比如，我是做亚马逊arbitrage的，arbitrage的选品相对比较简单，但也有一些基本原则。 我总结了了一些，称之为\u201c鬼十则\u201d，下面就介绍一下吧！ 鬼十则一：越大牌，越好卖！ 做arbitrage，尽可能卖那些让你卖的大品牌！品牌就是流量和产品的保证。 跟精品模式不同，精品模式都是自己做的产品，说白了，根本没有品牌，所以需要自己推广，打广告等等。 而我做的arbitrage，卖的是品牌产\u2026","excerpt_new":"亚马逊的运营模式不一样，选品思路也不一样。 比如，我是做亚马逊arbitrage的，arbitrage的选品相对比较简单，但也有一些基本原则。 我总结了了一些，称之为\u201c鬼十则\u201d，下面就介绍一下吧！ 鬼十则一：越大牌，越好卖！ 做arbitrage，尽可能卖那些让你卖的大品牌！品牌就是流量和产品的保证。 跟精品模式不同，精品模式都是自己做的产品，说白了，根本没有品牌，所以需要自己推广，打广告等等。 而我做的arbitrage，卖的是品牌产\u2026","preview_type":"default","preview_text":"","visited_count":27588},"brief":"{\"source\": \"TS\", \"type\": \"answer\", \"id\": 1514487387}","uninterest_reasons":[{"reason_id":3,"reason_type":"topic","object_token":"19550355","object_type":"topic","reason_text":"亚马逊 (Amazon.com)"},{"reason_id":3,"reason_type":"topic","object_token":"20137108","object_type":"topic","reason_text":"亚马逊运营"},{"reason_id":3,"reason_type":"topic","object_token":"20137569","object_type":"topic","reason_text":"亚马逊教程"},{"reason_id":2,"reason_type":"creator","object_token":"cc04e2ce707843d9e7605cc6280ca4fe","object_type":"people","reason_text":"妖猴创作的内容"}],"attached_info":"Cu0CCNeUhae8i4K3JxAEGgkzMDU0MzUzODYg9OX/+wUozwMwsQFABkoNCgRVUkNGEgEwGAAgAFIadXNlcl9yZWNfaXRlbWNmX2FkZF9hbnN3ZXJaCDU1NDU5MTAxcgoxNTE0NDg3Mzg3eHCCAURodHRwczovL3BpYzEuemhpbWcuY29tLzUwL3YyLTU3NjhiMmU1ODk3MTcxNTc4NDcwYWNiNjFjOTBhMDRhX2JoLmpwZ4oBCTQxOTMxNTMwMKoBCXJlY29tbWVuZPIBNQgAEjFydzoxLjA7aXNvOjAuMDtiaTowLjA7Y3I6MC4wO3J1bGVzOkN1cnJlbmN5UmFua2Vy8gEFCAsSATHyAQoIDBIGTm9ybWFs8gEoCAoSJDZmMWVjMDNkLTFlMDQtNGMzNi1iYTljLTQ4ZWU0NjNiMzcwOYgCwpOXmd8ukgIgY2MwNGUyY2U3MDc4NDNkOWU3NjA1Y2M2MjgwY2E0ZmWaAgA=","actors":[{"id":"19550228","type":"topic","url":"https://www.zhihu.com/topic/19550228/hot","avatar_url":"https://pic4.zhimg.com/50/e82bab09c_s.jpg","name":"随便看看","excerpt":"","introduction":""}],"count":1,"show_actor_time":false,"action_text":"随便看看","action_text_tpl":"{}","action_card":false},{"id":"7_1606102141.38","type":"feed","offset":7,"verb":"TOPIC_ACKNOWLEDGED_ARTICLE","created_time":1606102141,"updated_time":1606102141,"target":{"id":291461380,"type":"article","url":"https://api.zhihu.com/articles/291461380","author":{"id":"2acae2cffe877999659203132913e435","type":"people","url":"https://api.zhihu.com/people/2acae2cffe877999659203132913e435","user_type":"organization","url_token":"jian-dan-xin-li-uni","name":"简单心理Uni","headline":"学心理咨询，到简单心理Uni","avatar_url":"https://pic1.zhimg.com/50/v2-91704e9803b3fe6c51d665e58bd2c9aa_m.jpg","is_org":true,"gender":0,"badge":[{"type":"identity","description":"已认证的官方帐号"},{"type":"best_answerer","description":"优秀回答者","topics":[],"topic_names":["心理学","儿童心理"]}],"followers_count":192609,"is_following":false,"is_followed":false},"title":"\u201c终其一生，你不会因为优秀而被爱\u201d｜4步走出\u201c证明自己\u201d死循环","excerpt_title":"","image_url":"https://pic3.zhimg.com/50/v2-48cb218c574e9b4bb2b5db9a1788f661_hd.jpg","comment_permission":"all","created":1605265013,"updated":1605265013,"voteup_count":653,"voting":0,"comment_count":48,"linkbox":{"pic":"","title":"","url":"","category":""},"excerpt":"我们总是在不断证明自己。证明自己比别人更聪明，证明自己比别人更成功，证明自己比别人更有能力。我们希望在证明自己的过程中，获得快乐和满足。然而我们得到了吗？ 西西弗斯被众神惩罚，日复一日地将巨石推上山顶，而每当快到达山顶时，巨石又滚落山底。\u2026","excerpt_new":"我们总是在不断证明自己。证明自己比别人更聪明，证明自己比别人更成功，证明自己比别人更有能力。我们希望在证明自己的过程中，获得快乐和满足。然而我们得到了吗？ 西西弗斯被众神惩罚，日复一日地将巨石推上山顶，而每当快到达山顶时，巨石又滚落山底。\u2026","preview_type":"default","preview_text":"","column":{"id":"jdxl-uni","type":"column","url":"https://api.zhihu.com/columns/jdxl-uni","author":{"id":"0","type":"people","url":"","user_type":"people","url_token":"","name":"匿名用户","headline":"","avatar_url":"https://pic4.zhimg.com/aadd7b895_m.jpg"},"title":"简单心理Uni","image_url":"https://pic1.zhimg.com/v2-3c7db57c64c6baf67cda06d104f7478d_b.jpg","comment_permission":"public","intro":"有态度的心理咨询学习社群","updated":1591495442,"is_following":false},"visited_count":29373},"brief":"{\"source\": \"TS\", \"type\": \"article\", \"id\": 291461380}","uninterest_reasons":[{"reason_id":3,"reason_type":"topic","object_token":"19565970","object_type":"topic","reason_text":"自我"},{"reason_id":3,"reason_type":"topic","object_token":"19551432","object_type":"topic","reason_text":"心理学"},{"reason_id":3,"reason_type":"topic","object_token":"19557120","object_type":"topic","reason_text":"幸福"},{"reason_id":2,"reason_type":"creator","object_token":"2acae2cffe877999659203132913e435","object_type":"people","reason_text":"简单心理Uni 创作的内容"}],"attached_info":"CpcDCNeUhae8i4K3JxAHGgkxNTI4OTg3NDkg9cy5/QUojQUwMEAHSg8KA1RCRhIENDA0MBgAIABSInRhZ19iYXNlZF9mb2xsb3dfdG9waWNfYWRkX2FydGljbGVaBTQ4MTMycgkyOTE0NjEzODB4FIIBUGh0dHBzOi8vcGljNC56aGltZy5jb20vdjItNDhjYjIxOGM1NzRlOWI0YmIyYjVkYjlhMTc4OGY2NjFfci5qcGc/c291cmNlPTE3MmFlMThiigEIamR4bC11bmmqAQlyZWNvbW1lbmTyAU8IABJLcnc6My4wO2lzbzoxLjA7Ymk6MC4wO2NyOjAuMDtydWxlczpIaWdoSW50ZXJhY3RpdmVXZWlnaHRSdWxlLEN1cnJlbmN5UmFua2Vy8gEFCAsSATHyAQoIDBIGTm9ybWFs8gEoCAoSJGY3ZDBjOGQyLWM1ZDgtNGEwYy1hMDlkLTllY2RlODkxZTgyOIgCwpOXmd8ukgIgMmFjYWUyY2ZmZTg3Nzk5OTY1OTIwMzEzMjkxM2U0MzWaAgA=","actors":[{"id":"19557120","type":"topic","url":"https://api.zhihu.com/topics/19557120","avatar_url":"https://pic2.zhimg.com/50/v2-c8a6eec6fc70501f4c96ad31534eff68_s.jpg","name":"幸福","excerpt":"","introduction":""}],"show_actor_time":false,"action_text":"幸福","action_text_tpl":"{}","action_card":false},{"id":"8_1606102141.434","type":"feed","offset":8,"verb":"TOPIC_ACKNOWLEDGED_ARTICLE","created_time":1606102141,"updated_time":1606102141,"target":{"id":260963679,"type":"article","url":"https://api.zhihu.com/articles/260963679","author":{"id":"7c4413da31b08c26b427511050c44bd4","type":"people","url":"https://api.zhihu.com/people/7c4413da31b08c26b427511050c44bd4","user_type":"people","url_token":"liu-yu-bo-51-99","name":"流老师","headline":"关注我  每天一篇惊奇案件","avatar_url":"https://pic2.zhimg.com/50/v2-690ab5749d2390586a54fd46cfdbf546_m.jpg","is_org":false,"gender":1,"badge":[],"followers_count":2993,"is_following":false,"is_followed":false},"title":"香港纸盒藏尸案，少女被割掉双乳","excerpt_title":"","image_url":"https://pic4.zhimg.com/50/v2-ca74d59d2cb99b5b9fcd6bf96a0b9c72_hd.jpg","comment_permission":"all","created":1601530327,"updated":1601530406,"voteup_count":1634,"voting":0,"comment_count":340,"linkbox":{"pic":"","title":"","url":"","category":""},"excerpt":"今天给大家讲的是香港纸盒藏尸案，花季少女被割掉双乳并烧掉阴毛。 1974年12月，一个16岁的少女骑着电车来到跑马地，她曾打电话给一位男性同学，约对方来跑马地玩。但是男同学到了约定的时间来到跑马地后却不见少女的踪影。一天清晨，一位清洁员在黄泥涌道\u2026","excerpt_new":"今天给大家讲的是香港纸盒藏尸案，花季少女被割掉双乳并烧掉阴毛。 1974年12月，一个16岁的少女骑着电车来到跑马地，她曾打电话给一位男性同学，约对方来跑马地玩。但是男同学到了约定的时间来到跑马地后却不见少女的踪影。一天清晨，一位清洁员在黄泥涌道\u2026","preview_type":"default","preview_text":"","column":{"id":"c_1282640074065260544","type":"column","url":"https://api.zhihu.com/columns/c_1282640074065260544","author":{"id":"0","type":"people","url":"","user_type":"people","url_token":"","name":"匿名用户","headline":"","avatar_url":"https://pic4.zhimg.com/aadd7b895_m.jpg"},"title":"离奇案件解析","image_url":"https://pic3.zhimg.com/4b70deef7_b.jpg","comment_permission":"private","intro":"解说离奇案件，带给你不一样的观感","updated":1598585224,"is_following":false},"visited_count":913275},"brief":"{\"source\": \"TS\", \"type\": \"article\", \"id\": 260963679}","uninterest_reasons":[{"reason_id":3,"reason_type":"topic","object_token":"19602871","object_type":"topic","reason_text":"案件"},{"reason_id":2,"reason_type":"creator","object_token":"7c4413da31b08c26b427511050c44bd4","object_type":"people","reason_text":"流老师创作的内容"}],"attached_info":"CpkDCNeUhae8i4K3JxAHGgkxNDYxMjI1MTkg19PV+wUo4gww1AJACEoNCgRGUkZSEgEwGAAgAFISZmVlZHJlX2FkZF9hcnRpY2xlWgcxMjk1NDA4cgkyNjA5NjM2Nzl4AYIBUGh0dHBzOi8vcGljMS56aGltZy5jb20vdjItY2E3NGQ1OWQyY2I5OWI1YjlmY2Q2YmY5NmEwYjljNzJfci5qcGc/c291cmNlPTE3MmFlMThiigEVY18xMjgyNjQwMDc0MDY1MjYwNTQ0qgEJcmVjb21tZW5k8gFTCAAST3J3OjM3LjA7aXNvOjIuMDtiaTowLjA7Y3I6MC4wO3J1bGVzOkdvb2RTdHVmZlJlY29tbWVuZFdlaWdodFJ1bGUsQ3VycmVuY3lSYW5rZXLyAQUICxIBMfIBCggMEgZFY29tSFfyASgIChIkMmQ5NmVlOWQtMzc3Ni00ZWI0LWFkZjUtMjBmNWRiNjVkOWY4iALCk5eZ3y6SAiA3YzQ0MTNkYTMxYjA4YzI2YjQyNzUxMTA1MGM0NGJkNJoCAA==","actors":[{"id":"19602871","type":"topic","url":"https://api.zhihu.com/topics/19602871","avatar_url":"https://pic2.zhimg.com/50/v2-fcc67a1c53e99b6b64cc5b6f63abcfe8_s.jpg","name":"案件","excerpt":"","introduction":""}],"show_actor_time":false,"action_text":"案件","action_text_tpl":"{}","action_card":false},{"id":"9_1606102141.935","type":"feed","offset":9,"verb":"TOPIC_ACKNOWLEDGED_ANSWER","created_time":1606102141,"updated_time":1606102141,"target":{"id":1530645828,"type":"answer","url":"https://api.zhihu.com/answers/1530645828","author":{"id":"4ab4027bba1951283d3185a040bcec34","type":"people","url":"https://api.zhihu.com/people/4ab4027bba1951283d3185a040bcec34","user_type":"people","url_token":"shang-hai-jia-ju-chu-ju-ding-zhi-74","name":"玉缘","headline":"因玉结缘，和田玉，一手货，保熟更保真","avatar_url":"https://pic2.zhimg.com/50/v2-2a90f12cf758116e8e241ed978da9a62_m.jpg","is_org":false,"gender":1,"badge":[{"type":"identity","description":"上海赫庚网络科技有限公司 法定代表人"}],"followers_count":1171480,"is_following":false,"is_followed":false},"created_time":1603019370,"updated_time":1603019387,"voteup_count":419,"thanks_count":242,"comment_count":33,"is_copyable":true,"question":{"id":55566620,"type":"question","url":"https://api.zhihu.com/questions/55566620","author":{"id":"0","type":"people","url":"","user_type":"people","url_token":"","name":"匿名用户","headline":"","avatar_url":"https://pic4.zhimg.com/aadd7b895_m.jpg"},"title":"未来利润最高的不起眼暴利赚钱行业是什么？","created":1486544359,"answer_count":108,"follower_count":3252,"comment_count":0,"bound_topic_ids":[112,2476,2548,68370,138833],"is_following":false,"excerpt":"","question_type":"normal"},"thumbnail":"","excerpt":"一年几千万，几百万的生意，我知道的几乎都是灰产。但是一年几十万的正规生意知道挺多的。 牙科诊所。 一颗牙1万，一口牙，25万，利润高不高？为了干这个，一个哥们，本来都毕业在社会上混几年了，现在重新考试去湖北一个学校念书，争取毕业以后做牙医。 而且这玩意还是刚需，毕竟牙齿问题，到了一定年龄是肯定会出现问题的。 干牙科诊所的很多都是扎堆的。村子里一个富了，带动一个村子富了。 再说一个，前天跟一个哥们吃饭。他\u2026","excerpt_new":"一年几千万，几百万的生意，我知道的几乎都是灰产。但是一年几十万的正规生意知道挺多的。 牙科诊所。 一颗牙1万，一口牙，25万，利润高不高？为了干这个，一个哥们，本来都毕业在社会上混几年了，现在重新考试去湖北一个学校念书，争取毕业以后做牙医。 而且这玩意还是刚需，毕竟牙齿问题，到了一定年龄是肯定会出现问题的。 干牙科诊所的很多都是扎堆的。村子里一个富了，带动一个村子富了。 再说一个，前天跟一个哥们吃饭。他\u2026","preview_type":"default","preview_text":"","visited_count":85871},"brief":"{\"source\": \"TS\", \"type\": \"answer\", \"id\": 1530645828}","uninterest_reasons":[{"reason_id":3,"reason_type":"topic","object_token":"19754845","object_type":"topic","reason_text":"副业"},{"reason_id":3,"reason_type":"topic","object_token":"19960492","object_type":"topic","reason_text":"非常规赚钱方式"},{"reason_id":3,"reason_type":"topic","object_token":"19557593","object_type":"topic","reason_text":"互联网创业"},{"reason_id":3,"reason_type":"topic","object_token":"19557815","object_type":"topic","reason_text":"赚钱"},{"reason_id":2,"reason_type":"creator","object_token":"4ab4027bba1951283d3185a040bcec34","object_type":"people","reason_text":"玉缘创作的内容"}],"attached_info":"CugCCNeUhae8i4K3JxAEGgkzMDgzNzMyMTAg6sSw/AUoowMwIUAJShAKA1RCTBIFMjQ3NjAYACAAUh50YWdfYmFzZWRfbG9uZ190ZXJtX2FkZF9hbnN3ZXJaCDE0NDQ2NjM2cgoxNTMwNjQ1ODI4eBGKAQg1NTU2NjYyMKoBCXJlY29tbWVuZPIBcggAEm5ydzoxLjA7aXNvOi0yLjA7Ymk6MC4wO2NyOjAuMDtydWxlczpDdXJyZW5jeVJhbmtlcixUYWdvcmVGaXJzdExldmVsSXNvbGF0aW9uUnVsZSxUYWdvcmVGaXJzdExldmVsSXNvbGF0aW9uUnVsZfIBBQgLEgEx8gEKCAwSBk5vcm1hbPIBKAgKEiQwYWY1ZmY5MS04NDg0LTRkYTQtYTc4Ni1iMWYxMTA4NDEyMTGIAsKTl5nfLpICIDRhYjQwMjdiYmExOTUxMjgzZDMxODVhMDQwYmNlYzM0mgIA","actors":[{"id":"19550560","type":"topic","url":"https://api.zhihu.com/topics/19550560","avatar_url":"https://pic4.zhimg.com/50/b75f995419ff775ff71fca685d7825af_s.jpg","name":"创业","excerpt":"","introduction":""}],"show_actor_time":false,"action_text":"创业","action_text_tpl":"{}","action_card":false},{"id":"10_1606102141.432","type":"feed","offset":10,"verb":"TOPIC_ACKNOWLEDGED_ARTICLE","created_time":1606102141,"updated_time":1606102141,"target":{"id":293954712,"type":"article","url":"https://api.zhihu.com/articles/293954712","author":{"id":"96c2135eabf986c6dd01cb49f28ac784","type":"people","url":"https://api.zhihu.com/people/96c2135eabf986c6dd01cb49f28ac784","user_type":"people","url_token":"si-ji-dao-66","name":"谋略那些事","headline":"公众号：谋略那些事，另类解读《资治通鉴》，有电子版可领取","avatar_url":"https://pic4.zhimg.com/50/v2-3150de97982e3cb5e8e09b434dd895a3_m.jpg","is_org":false,"gender":0,"badge":[],"followers_count":54551,"is_following":false,"is_followed":false},"title":"资治通鉴：不耍心机，普通人如何脱颖而出？记住这3点！","excerpt_title":"","image_url":"https://pic4.zhimg.com/50/v2-661520995cb86490e7e90f0484ec8948_hd.jpg","comment_permission":"all","created":1605361402,"updated":1605361402,"voteup_count":250,"voting":0,"comment_count":12,"linkbox":{"pic":"","title":"","url":"","category":""},"excerpt":"《资治通鉴》第19卷 汉纪十一 元狩二年（庚申、公元前121年） 【原文】（可跳过直接解析）休屠王太子日与母阏氏、弟伦俱没入官，输黄门养马。久之，帝游宴，见马，后宫满侧，日等数十人牵马过殿下，莫不窃视，至日独不敢。日长八尺二寸，容貌甚严，马又肥好\u2026","excerpt_new":"《资治通鉴》第19卷 汉纪十一 元狩二年（庚申、公元前121年） 【原文】（可跳过直接解析）休屠王太子日与母阏氏、弟伦俱没入官，输黄门养马。久之，帝游宴，见马，后宫满侧，日等数十人牵马过殿下，莫不窃视，至日独不敢。日长八尺二寸，容貌甚严，马又肥好\u2026","preview_type":"default","preview_text":"","column":{"id":"c_1309254802497863680","type":"column","url":"https://api.zhihu.com/columns/c_1309254802497863680","author":{"id":"0","type":"people","url":"","user_type":"people","url_token":"","name":"匿名用户","headline":"","avatar_url":"https://pic4.zhimg.com/aadd7b895_m.jpg"},"title":"解读《资治通鉴》汉武昭宣篇","image_url":"https://pic3.zhimg.com/4b70deef7_b.jpg","comment_permission":"private","intro":"读《资治通鉴》精人性、战职场、舞权力、争上游！","updated":1604930670,"is_following":false},"visited_count":18381},"brief":"{\"source\": \"TS\", \"type\": \"article\", \"id\": 293954712}","uninterest_reasons":[{"reason_id":3,"reason_type":"topic","object_token":"19661143","object_type":"topic","reason_text":"资治通鉴（书籍）"},{"reason_id":3,"reason_type":"topic","object_token":"19557876","object_type":"topic","reason_text":"职场"},{"reason_id":3,"reason_type":"topic","object_token":"19563676","object_type":"topic","reason_text":"情商"},{"reason_id":2,"reason_type":"creator","object_token":"96c2135eabf986c6dd01cb49f28ac784","object_type":"people","reason_text":"谋略那些事创作的内容"}],"attached_info":"CoIDCNeUhae8i4K3JxAHGgkxNTM0NTI2OTcg+r2//QUo+gEwDEAKSgwKA1VSVBIBMBgAIABSGnVzZXJfcmVjX3RvcGljX2FkZF9hcnRpY2xlWggxMjM5NzQ1OHIJMjkzOTU0NzEyeG+CAVBodHRwczovL3BpYzEuemhpbWcuY29tL3YyLTY2MTUyMDk5NWNiODY0OTBlN2U5MGYwNDg0ZWM4OTQ4X3IuanBnP3NvdXJjZT0xNzJhZTE4YooBFWNfMTMwOTI1NDgwMjQ5Nzg2MzY4MKoBCXJlY29tbWVuZPIBNQgAEjFydzoxLjA7aXNvOjEuMDtiaTowLjA7Y3I6MC4wO3J1bGVzOkN1cnJlbmN5UmFua2Vy8gEFCAsSATHyAQoIDBIGTm9ybWFs8gEoCAoSJDRmZTdkYTFkLTQxMTItNDA4Mi1iZjQ1LTBkY2E2NGFhYjI4NIgCwpOXmd8ukgIgOTZjMjEzNWVhYmY5ODZjNmRkMDFjYjQ5ZjI4YWM3ODSaAgA=","actors":[{"id":"19557876","type":"topic","url":"https://api.zhihu.com/topics/19557876","avatar_url":"https://pic1.zhimg.com/50/386dc566a_s.jpg","name":"职场","excerpt":"","introduction":""}],"show_actor_time":false,"action_text":"职场","action_text_tpl":"{}","action_card":false},{"id":"11_1606102141.482","type":"feed","offset":11,"verb":"TOPIC_ACKNOWLEDGED_ANSWER","created_time":1606102141,"updated_time":1606102141,"target":{"id":1525766934,"type":"answer","url":"https://api.zhihu.com/answers/1525766934","author":{"id":"0442e545a51b0c4a685bd5b40c948241","type":"people","url":"https://api.zhihu.com/people/0442e545a51b0c4a685bd5b40c948241","user_type":"people","url_token":"gao-chong-61-11","name":"墨子连山","headline":"回答是什么？为什么？如何做？转载需要确认，侵权均已举报。","avatar_url":"https://pic2.zhimg.com/50/v2-f04d65ed0008119f42f578e3957a23a2_m.jpg","is_org":false,"gender":1,"badge":[{"type":"identity","description":"车多多 COO"}],"followers_count":56071,"is_following":false,"is_followed":false},"created_time":1602763441,"updated_time":1603076799,"voteup_count":917,"thanks_count":168,"comment_count":394,"is_copyable":true,"question":{"id":37032452,"type":"question","url":"https://api.zhihu.com/questions/37032452","author":{"id":"98e3591edd66d70c8291bff6e1f67abf","type":"people","url":"https://api.zhihu.com/people/98e3591edd66d70c8291bff6e1f67abf","user_type":"people","url_token":"qi-mu-yi-41","name":"齐慕益","headline":"验证码000http://jq.qq.com/?_wv=1027&amp;k=ed4k7s","avatar_url":"https://pic4.zhimg.com/50/c24098ed46aeb0bd24001d7d21f92303_m.jpg","is_org":false,"gender":0,"badge":[],"followers_count":0,"is_following":false,"is_followed":false},"title":"普通中国人为什么很难发财？","created":1446209501,"answer_count":857,"follower_count":10356,"comment_count":41,"bound_topic_ids":[922,1740,5930,12230,18567],"is_following":false,"excerpt":"","question_type":"normal"},"thumbnail":"","excerpt":"不是很难，而是几乎不可能。 为什么是几乎呢？ 因为确实还有少数人靠拆迁、买彩票发财了。 为什么这么难？ 你以为我是想说内卷吗？ 不是，我想说的问题比内卷更令人绝望。 不可能发财的原因，是因为他们不创造价值，或者说只创造低价值。 中国现在已经是成熟市场了，你只要创造价值，就必然会获得相应的价格。 例如，你能为公司创造1000万的收入，把公司付出的成本和平台自身价值刨除，剩下100万，就是你的价值，那么你的年薪就\u2026","excerpt_new":"不是很难，而是几乎不可能。 为什么是几乎呢？ 因为确实还有少数人靠拆迁、买彩票发财了。 为什么这么难？ 你以为我是想说内卷吗？ 不是，我想说的问题比内卷更令人绝望。 不可能发财的原因，是因为他们不创造价值，或者说只创造低价值。 中国现在已经是成熟市场了，你只要创造价值，就必然会获得相应的价格。 例如，你能为公司创造1000万的收入，把公司付出的成本和平台自身价值刨除，剩下100万，就是你的价值，那么你的年薪就\u2026","preview_type":"default","preview_text":"","visited_count":156834},"brief":"{\"source\": \"TS\", \"type\": \"answer\", \"id\": 1525766934}","uninterest_reasons":[{"reason_id":3,"reason_type":"topic","object_token":"19567962","object_type":"topic","reason_text":"博弈论"},{"reason_id":3,"reason_type":"topic","object_token":"19555457","object_type":"topic","reason_text":"商业"},{"reason_id":3,"reason_type":"topic","object_token":"19586942","object_type":"topic","reason_text":"中国"},{"reason_id":3,"reason_type":"topic","object_token":"19605779","object_type":"topic","reason_text":"微观经济学"},{"reason_id":2,"reason_type":"creator","object_token":"0442e545a51b0c4a685bd5b40c948241","object_type":"people","reason_text":"墨子连山创作的内容"}],"attached_info":"CtsCCNeUhae8i4K3JxAEGgkzMDc0ODYwODYgsfWg/AUolQcwigNAC0oRCgNUQkYSBjE4NTY3MBgAIABKEAoDVEJMEgUxNzQwMBgAIABSIXRhZ19iYXNlZF9mb2xsb3dfdG9waWNfYWRkX2Fuc3dlcloHNzAxOTk2NXIKMTUyNTc2NjkzNHgUigEIMzcwMzI0NTKqAQlyZWNvbW1lbmTyAU8IABJLcnc6Ni4wO2lzbzoxLjA7Ymk6MC4wO2NyOjAuMDtydWxlczpIaWdoSW50ZXJhY3RpdmVXZWlnaHRSdWxlLEN1cnJlbmN5UmFua2Vy8gEFCAsSATHyAQoIDBIGTm9ybWFs8gEoCAoSJDdjNGQ1OWZmLWE1MzctNDI3My1hOWFkLTkwOTllYmI4NjQ4ZogCwpOXmd8ukgIgMDQ0MmU1NDVhNTFiMGM0YTY4NWJkNWI0MGM5NDgyNDGaAgA=","actors":[{"id":"19552981","type":"topic","url":"https://api.zhihu.com/topics/19552981","avatar_url":"https://pic4.zhimg.com/50/v2-b761e41f19531e4899892e9197de40dd_s.jpg","name":"经济","excerpt":"","introduction":""}],"show_actor_time":false,"action_text":"经济","action_text_tpl":"{}","action_card":false}]
     * paging : {"previous":"https://api.zhihu.com/topstory/recommend?session_token=3cfd6bb3ef396f2067dd76a72125e771&page_number=2&limit=6&action=pull&ad_interval=-1&before_id=11","next":"https://api.zhihu.com/topstory/recommend?session_token=3cfd6bb3ef396f2067dd76a72125e771&page_number=2&limit=6&action=down&after_id=11&ad_interval=-1","is_end":false}
     * fresh_text : 关注动态已更新
     */

    private PagingBean paging;
    private String fresh_text;
    private List<DataBean> data;
    private PostInfoTopic postInfo;

    public PagingBean getPaging() {
        return paging;
    }

    public void setPaging(PagingBean paging) {
        this.paging = paging;
    }

    public String getFresh_text() {
        return fresh_text;
    }

    public void setFresh_text(String fresh_text) {
        this.fresh_text = fresh_text;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class PagingBean {
        /**
         * previous : https://api.zhihu.com/topstory/recommend?session_token=3cfd6bb3ef396f2067dd76a72125e771&page_number=2&limit=6&action=pull&ad_interval=-1&before_id=11
         * next : https://api.zhihu.com/topstory/recommend?session_token=3cfd6bb3ef396f2067dd76a72125e771&page_number=2&limit=6&action=down&after_id=11&ad_interval=-1
         * is_end : false
         */

        private String previous;
        private String next;
        private boolean is_end;

        public String getPrevious() {
            return previous;
        }

        public void setPrevious(String previous) {
            this.previous = previous;
        }

        public String getNext() {
            return next;
        }

        public void setNext(String next) {
            this.next = next;
        }

        public boolean isIs_end() {
            return is_end;
        }

        public void setIs_end(boolean is_end) {
            this.is_end = is_end;
        }
    }

    public static class DataBean {
        /**
         * id : 6_1606102141.483
         * type : feed
         * offset : 6
         * verb : TOPIC_ACKNOWLEDGED_ANSWER
         * created_time : 1606102141
         * updated_time : 1606102141
         * target : {"id":1514487387,"type":"answer","url":"https://api.zhihu.com/answers/1514487387","author":{"id":"cc04e2ce707843d9e7605cc6280ca4fe","type":"people","url":"https://api.zhihu.com/people/cc04e2ce707843d9e7605cc6280ca4fe","user_type":"people","url_token":"yao-hou-72","name":"妖猴","headline":"学习圣经中 - 微信:semangray","avatar_url":"https://pic3.zhimg.com/50/v2-1d6c4c18a3318ced8a67b72a724496d2_m.jpg","is_org":false,"gender":1,"badge":[],"followers_count":17605,"is_following":false,"is_followed":false},"created_time":1602220788,"updated_time":1603925611,"voteup_count":463,"thanks_count":398,"comment_count":177,"is_copyable":true,"question":{"id":419315300,"type":"question","url":"https://api.zhihu.com/questions/419315300","author":{"id":"29bc9b8e2c420737ce67a7e458582880","type":"people","url":"https://api.zhihu.com/people/29bc9b8e2c420737ce67a7e458582880","user_type":"people","url_token":"xiao-jun-cherish","name":"小君cherish","headline":"护肤方法，护肤好物推荐，化妆","avatar_url":"https://pic2.zhimg.com/50/v2-4ff7b12e8cfbfb9e9faf6dc7318d5c0d_m.jpg","is_org":false,"gender":0,"badge":[],"followers_count":16,"is_following":false,"is_followed":false},"title":"做亚马逊的选品思路是什么呢？","created":1599185049,"answer_count":35,"follower_count":284,"comment_count":0,"bound_topic_ids":[45,198642,198796],"is_following":false,"excerpt":"","question_type":"normal"},"thumbnail":"https://pic1.zhimg.com/50/v2-5768b2e5897171578470acb61c90a04a_bh.jpg","excerpt":"亚马逊的运营模式不一样，选品思路也不一样。 比如，我是做亚马逊arbitrage的，arbitrage的选品相对比较简单，但也有一些基本原则。 我总结了了一些，称之为\u201c鬼十则\u201d，下面就介绍一下吧！ 鬼十则一：越大牌，越好卖！ 做arbitrage，尽可能卖那些让你卖的大品牌！品牌就是流量和产品的保证。 跟精品模式不同，精品模式都是自己做的产品，说白了，根本没有品牌，所以需要自己推广，打广告等等。 而我做的arbitrage，卖的是品牌产\u2026","excerpt_new":"亚马逊的运营模式不一样，选品思路也不一样。 比如，我是做亚马逊arbitrage的，arbitrage的选品相对比较简单，但也有一些基本原则。 我总结了了一些，称之为\u201c鬼十则\u201d，下面就介绍一下吧！ 鬼十则一：越大牌，越好卖！ 做arbitrage，尽可能卖那些让你卖的大品牌！品牌就是流量和产品的保证。 跟精品模式不同，精品模式都是自己做的产品，说白了，根本没有品牌，所以需要自己推广，打广告等等。 而我做的arbitrage，卖的是品牌产\u2026","preview_type":"default","preview_text":"","visited_count":27588}
         * brief : {"source": "TS", "type": "answer", "id": 1514487387}
         * uninterest_reasons : [{"reason_id":3,"reason_type":"topic","object_token":"19550355","object_type":"topic","reason_text":"亚马逊 (Amazon.com)"},{"reason_id":3,"reason_type":"topic","object_token":"20137108","object_type":"topic","reason_text":"亚马逊运营"},{"reason_id":3,"reason_type":"topic","object_token":"20137569","object_type":"topic","reason_text":"亚马逊教程"},{"reason_id":2,"reason_type":"creator","object_token":"cc04e2ce707843d9e7605cc6280ca4fe","object_type":"people","reason_text":"妖猴创作的内容"}]
         * attached_info : Cu0CCNeUhae8i4K3JxAEGgkzMDU0MzUzODYg9OX/+wUozwMwsQFABkoNCgRVUkNGEgEwGAAgAFIadXNlcl9yZWNfaXRlbWNmX2FkZF9hbnN3ZXJaCDU1NDU5MTAxcgoxNTE0NDg3Mzg3eHCCAURodHRwczovL3BpYzEuemhpbWcuY29tLzUwL3YyLTU3NjhiMmU1ODk3MTcxNTc4NDcwYWNiNjFjOTBhMDRhX2JoLmpwZ4oBCTQxOTMxNTMwMKoBCXJlY29tbWVuZPIBNQgAEjFydzoxLjA7aXNvOjAuMDtiaTowLjA7Y3I6MC4wO3J1bGVzOkN1cnJlbmN5UmFua2Vy8gEFCAsSATHyAQoIDBIGTm9ybWFs8gEoCAoSJDZmMWVjMDNkLTFlMDQtNGMzNi1iYTljLTQ4ZWU0NjNiMzcwOYgCwpOXmd8ukgIgY2MwNGUyY2U3MDc4NDNkOWU3NjA1Y2M2MjgwY2E0ZmWaAgA=
         * actors : [{"id":"19550228","type":"topic","url":"https://www.zhihu.com/topic/19550228/hot","avatar_url":"https://pic4.zhimg.com/50/e82bab09c_s.jpg","name":"随便看看","excerpt":"","introduction":""}]
         * count : 1
         * show_actor_time : false
         * action_text : 随便看看
         * action_text_tpl : {}
         * action_card : false
         */

        private String id;
        private String type;
        private int offset;
        private String verb;
        private int created_time;
        private int updated_time;
        private TargetBean target;
        private String brief;
        private String attached_info;
        private int count;
        private boolean show_actor_time;
        private String action_text;
        private String action_text_tpl;
        private boolean action_card;
        private List<UninterestReasonsBean> uninterest_reasons;
        private List<ActorsBean> actors;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public String getVerb() {
            return verb;
        }

        public void setVerb(String verb) {
            this.verb = verb;
        }

        public int getCreated_time() {
            return created_time;
        }

        public void setCreated_time(int created_time) {
            this.created_time = created_time;
        }

        public int getUpdated_time() {
            return updated_time;
        }

        public void setUpdated_time(int updated_time) {
            this.updated_time = updated_time;
        }

        public TargetBean getTarget() {
            return target;
        }

        public void setTarget(TargetBean target) {
            this.target = target;
        }

        public String getBrief() {
            return brief;
        }

        public void setBrief(String brief) {
            this.brief = brief;
        }

        public String getAttached_info() {
            return attached_info;
        }

        public void setAttached_info(String attached_info) {
            this.attached_info = attached_info;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public boolean isShow_actor_time() {
            return show_actor_time;
        }

        public void setShow_actor_time(boolean show_actor_time) {
            this.show_actor_time = show_actor_time;
        }

        public String getAction_text() {
            return action_text;
        }

        public void setAction_text(String action_text) {
            this.action_text = action_text;
        }

        public String getAction_text_tpl() {
            return action_text_tpl;
        }

        public void setAction_text_tpl(String action_text_tpl) {
            this.action_text_tpl = action_text_tpl;
        }

        public boolean isAction_card() {
            return action_card;
        }

        public void setAction_card(boolean action_card) {
            this.action_card = action_card;
        }

        public List<UninterestReasonsBean> getUninterest_reasons() {
            return uninterest_reasons;
        }

        public void setUninterest_reasons(List<UninterestReasonsBean> uninterest_reasons) {
            this.uninterest_reasons = uninterest_reasons;
        }

        public List<ActorsBean> getActors() {
            return actors;
        }

        public void setActors(List<ActorsBean> actors) {
            this.actors = actors;
        }

        public static class TargetBean {
            /**
             * id : 1514487387
             * type : answer
             * url : https://api.zhihu.com/answers/1514487387
             * author : {"id":"cc04e2ce707843d9e7605cc6280ca4fe","type":"people","url":"https://api.zhihu.com/people/cc04e2ce707843d9e7605cc6280ca4fe","user_type":"people","url_token":"yao-hou-72","name":"妖猴","headline":"学习圣经中 - 微信:semangray","avatar_url":"https://pic3.zhimg.com/50/v2-1d6c4c18a3318ced8a67b72a724496d2_m.jpg","is_org":false,"gender":1,"badge":[],"followers_count":17605,"is_following":false,"is_followed":false}
             * created_time : 1602220788
             * updated_time : 1603925611
             * voteup_count : 463
             * thanks_count : 398
             * comment_count : 177
             * is_copyable : true
             * question : {"id":419315300,"type":"question","url":"https://api.zhihu.com/questions/419315300","author":{"id":"29bc9b8e2c420737ce67a7e458582880","type":"people","url":"https://api.zhihu.com/people/29bc9b8e2c420737ce67a7e458582880","user_type":"people","url_token":"xiao-jun-cherish","name":"小君cherish","headline":"护肤方法，护肤好物推荐，化妆","avatar_url":"https://pic2.zhimg.com/50/v2-4ff7b12e8cfbfb9e9faf6dc7318d5c0d_m.jpg","is_org":false,"gender":0,"badge":[],"followers_count":16,"is_following":false,"is_followed":false},"title":"做亚马逊的选品思路是什么呢？","created":1599185049,"answer_count":35,"follower_count":284,"comment_count":0,"bound_topic_ids":[45,198642,198796],"is_following":false,"excerpt":"","question_type":"normal"}
             * thumbnail : https://pic1.zhimg.com/50/v2-5768b2e5897171578470acb61c90a04a_bh.jpg
             * excerpt : 亚马逊的运营模式不一样，选品思路也不一样。 比如，我是做亚马逊arbitrage的，arbitrage的选品相对比较简单，但也有一些基本原则。 我总结了了一些，称之为“鬼十则”，下面就介绍一下吧！ 鬼十则一：越大牌，越好卖！ 做arbitrage，尽可能卖那些让你卖的大品牌！品牌就是流量和产品的保证。 跟精品模式不同，精品模式都是自己做的产品，说白了，根本没有品牌，所以需要自己推广，打广告等等。 而我做的arbitrage，卖的是品牌产…
             * excerpt_new : 亚马逊的运营模式不一样，选品思路也不一样。 比如，我是做亚马逊arbitrage的，arbitrage的选品相对比较简单，但也有一些基本原则。 我总结了了一些，称之为“鬼十则”，下面就介绍一下吧！ 鬼十则一：越大牌，越好卖！ 做arbitrage，尽可能卖那些让你卖的大品牌！品牌就是流量和产品的保证。 跟精品模式不同，精品模式都是自己做的产品，说白了，根本没有品牌，所以需要自己推广，打广告等等。 而我做的arbitrage，卖的是品牌产…
             * preview_type : default
             * preview_text :
             * visited_count : 27588
             */

            private int id;
            private String type;
            private String url;
            private AuthorBean author;
            private int created_time;
            private int updated_time;
            private int voteup_count;
            private int thanks_count;
            private int comment_count;
            private boolean is_copyable;
            private QuestionBean question;
            private String thumbnail;
            private String excerpt;
            private String excerpt_new;
            private String preview_type;
            private String preview_text;
            private int visited_count;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

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

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public int getCreated_time() {
                return created_time;
            }

            public void setCreated_time(int created_time) {
                this.created_time = created_time;
            }

            public int getUpdated_time() {
                return updated_time;
            }

            public void setUpdated_time(int updated_time) {
                this.updated_time = updated_time;
            }

            public int getVoteup_count() {
                return voteup_count;
            }

            public void setVoteup_count(int voteup_count) {
                this.voteup_count = voteup_count;
            }

            public int getThanks_count() {
                return thanks_count;
            }

            public void setThanks_count(int thanks_count) {
                this.thanks_count = thanks_count;
            }

            public int getComment_count() {
                return comment_count;
            }

            public void setComment_count(int comment_count) {
                this.comment_count = comment_count;
            }

            public boolean isIs_copyable() {
                return is_copyable;
            }

            public void setIs_copyable(boolean is_copyable) {
                this.is_copyable = is_copyable;
            }

            public QuestionBean getQuestion() {
                return question;
            }

            public void setQuestion(QuestionBean question) {
                this.question = question;
            }

            public String getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }

            public String getExcerpt() {
                return excerpt;
            }

            public void setExcerpt(String excerpt) {
                this.excerpt = excerpt;
            }

            public String getExcerpt_new() {
                return excerpt_new;
            }

            public void setExcerpt_new(String excerpt_new) {
                this.excerpt_new = excerpt_new;
            }

            public String getPreview_type() {
                return preview_type;
            }

            public void setPreview_type(String preview_type) {
                this.preview_type = preview_type;
            }

            public String getPreview_text() {
                return preview_text;
            }

            public void setPreview_text(String preview_text) {
                this.preview_text = preview_text;
            }

            public int getVisited_count() {
                return visited_count;
            }

            public void setVisited_count(int visited_count) {
                this.visited_count = visited_count;
            }

            public static class AuthorBean {
                /**
                 * id : cc04e2ce707843d9e7605cc6280ca4fe
                 * type : people
                 * url : https://api.zhihu.com/people/cc04e2ce707843d9e7605cc6280ca4fe
                 * user_type : people
                 * url_token : yao-hou-72
                 * name : 妖猴
                 * headline : 学习圣经中 - 微信:semangray
                 * avatar_url : https://pic3.zhimg.com/50/v2-1d6c4c18a3318ced8a67b72a724496d2_m.jpg
                 * is_org : false
                 * gender : 1
                 * badge : []
                 * followers_count : 17605
                 * is_following : false
                 * is_followed : false
                 */

                private String id;
                private String type;
                private String url;
                private String user_type;
                private String url_token;
                private String name;
                private String headline;
                private String avatar_url;
                private boolean is_org;
                private int gender;
                private int followers_count;
                private boolean is_following;
                private boolean is_followed;
                private List<?> badge;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

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

                public String getUser_type() {
                    return user_type;
                }

                public void setUser_type(String user_type) {
                    this.user_type = user_type;
                }

                public String getUrl_token() {
                    return url_token;
                }

                public void setUrl_token(String url_token) {
                    this.url_token = url_token;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getHeadline() {
                    return headline;
                }

                public void setHeadline(String headline) {
                    this.headline = headline;
                }

                public String getAvatar_url() {
                    return avatar_url;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public boolean isIs_org() {
                    return is_org;
                }

                public void setIs_org(boolean is_org) {
                    this.is_org = is_org;
                }

                public int getGender() {
                    return gender;
                }

                public void setGender(int gender) {
                    this.gender = gender;
                }

                public int getFollowers_count() {
                    return followers_count;
                }

                public void setFollowers_count(int followers_count) {
                    this.followers_count = followers_count;
                }

                public boolean isIs_following() {
                    return is_following;
                }

                public void setIs_following(boolean is_following) {
                    this.is_following = is_following;
                }

                public boolean isIs_followed() {
                    return is_followed;
                }

                public void setIs_followed(boolean is_followed) {
                    this.is_followed = is_followed;
                }

                public List<?> getBadge() {
                    return badge;
                }

                public void setBadge(List<?> badge) {
                    this.badge = badge;
                }
            }

            public static class QuestionBean {
                /**
                 * id : 419315300
                 * type : question
                 * url : https://api.zhihu.com/questions/419315300
                 * author : {"id":"29bc9b8e2c420737ce67a7e458582880","type":"people","url":"https://api.zhihu.com/people/29bc9b8e2c420737ce67a7e458582880","user_type":"people","url_token":"xiao-jun-cherish","name":"小君cherish","headline":"护肤方法，护肤好物推荐，化妆","avatar_url":"https://pic2.zhimg.com/50/v2-4ff7b12e8cfbfb9e9faf6dc7318d5c0d_m.jpg","is_org":false,"gender":0,"badge":[],"followers_count":16,"is_following":false,"is_followed":false}
                 * title : 做亚马逊的选品思路是什么呢？
                 * created : 1599185049
                 * answer_count : 35
                 * follower_count : 284
                 * comment_count : 0
                 * bound_topic_ids : [45,198642,198796]
                 * is_following : false
                 * excerpt :
                 * question_type : normal
                 */

                private int id;
                private String type;
                private String url;
                private AuthorBeanX author;
                private String title;
                private int created;
                private int answer_count;
                private int follower_count;
                private int comment_count;
                private boolean is_following;
                private String excerpt;
                private String question_type;
                private List<Integer> bound_topic_ids;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

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

                public AuthorBeanX getAuthor() {
                    return author;
                }

                public void setAuthor(AuthorBeanX author) {
                    this.author = author;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getCreated() {
                    return created;
                }

                public void setCreated(int created) {
                    this.created = created;
                }

                public int getAnswer_count() {
                    return answer_count;
                }

                public void setAnswer_count(int answer_count) {
                    this.answer_count = answer_count;
                }

                public int getFollower_count() {
                    return follower_count;
                }

                public void setFollower_count(int follower_count) {
                    this.follower_count = follower_count;
                }

                public int getComment_count() {
                    return comment_count;
                }

                public void setComment_count(int comment_count) {
                    this.comment_count = comment_count;
                }

                public boolean isIs_following() {
                    return is_following;
                }

                public void setIs_following(boolean is_following) {
                    this.is_following = is_following;
                }

                public String getExcerpt() {
                    return excerpt;
                }

                public void setExcerpt(String excerpt) {
                    this.excerpt = excerpt;
                }

                public String getQuestion_type() {
                    return question_type;
                }

                public void setQuestion_type(String question_type) {
                    this.question_type = question_type;
                }

                public List<Integer> getBound_topic_ids() {
                    return bound_topic_ids;
                }

                public void setBound_topic_ids(List<Integer> bound_topic_ids) {
                    this.bound_topic_ids = bound_topic_ids;
                }

                public static class AuthorBeanX {
                    /**
                     * id : 29bc9b8e2c420737ce67a7e458582880
                     * type : people
                     * url : https://api.zhihu.com/people/29bc9b8e2c420737ce67a7e458582880
                     * user_type : people
                     * url_token : xiao-jun-cherish
                     * name : 小君cherish
                     * headline : 护肤方法，护肤好物推荐，化妆
                     * avatar_url : https://pic2.zhimg.com/50/v2-4ff7b12e8cfbfb9e9faf6dc7318d5c0d_m.jpg
                     * is_org : false
                     * gender : 0
                     * badge : []
                     * followers_count : 16
                     * is_following : false
                     * is_followed : false
                     */

                    private String id;
                    private String type;
                    private String url;
                    private String user_type;
                    private String url_token;
                    private String name;
                    private String headline;
                    private String avatar_url;
                    private boolean is_org;
                    private int gender;
                    private int followers_count;
                    private boolean is_following;
                    private boolean is_followed;
                    private List<?> badge;

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

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

                    public String getUser_type() {
                        return user_type;
                    }

                    public void setUser_type(String user_type) {
                        this.user_type = user_type;
                    }

                    public String getUrl_token() {
                        return url_token;
                    }

                    public void setUrl_token(String url_token) {
                        this.url_token = url_token;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getHeadline() {
                        return headline;
                    }

                    public void setHeadline(String headline) {
                        this.headline = headline;
                    }

                    public String getAvatar_url() {
                        return avatar_url;
                    }

                    public void setAvatar_url(String avatar_url) {
                        this.avatar_url = avatar_url;
                    }

                    public boolean isIs_org() {
                        return is_org;
                    }

                    public void setIs_org(boolean is_org) {
                        this.is_org = is_org;
                    }

                    public int getGender() {
                        return gender;
                    }

                    public void setGender(int gender) {
                        this.gender = gender;
                    }

                    public int getFollowers_count() {
                        return followers_count;
                    }

                    public void setFollowers_count(int followers_count) {
                        this.followers_count = followers_count;
                    }

                    public boolean isIs_following() {
                        return is_following;
                    }

                    public void setIs_following(boolean is_following) {
                        this.is_following = is_following;
                    }

                    public boolean isIs_followed() {
                        return is_followed;
                    }

                    public void setIs_followed(boolean is_followed) {
                        this.is_followed = is_followed;
                    }

                    public List<?> getBadge() {
                        return badge;
                    }

                    public void setBadge(List<?> badge) {
                        this.badge = badge;
                    }
                }
            }
        }

        public static class UninterestReasonsBean {
            /**
             * reason_id : 3
             * reason_type : topic
             * object_token : 19550355
             * object_type : topic
             * reason_text : 亚马逊 (Amazon.com)
             */

            private int reason_id;
            private String reason_type;
            private String object_token;
            private String object_type;
            private String reason_text;

            public int getReason_id() {
                return reason_id;
            }

            public void setReason_id(int reason_id) {
                this.reason_id = reason_id;
            }

            public String getReason_type() {
                return reason_type;
            }

            public void setReason_type(String reason_type) {
                this.reason_type = reason_type;
            }

            public String getObject_token() {
                return object_token;
            }

            public void setObject_token(String object_token) {
                this.object_token = object_token;
            }

            public String getObject_type() {
                return object_type;
            }

            public void setObject_type(String object_type) {
                this.object_type = object_type;
            }

            public String getReason_text() {
                return reason_text;
            }

            public void setReason_text(String reason_text) {
                this.reason_text = reason_text;
            }
        }

        public static class ActorsBean {
            /**
             * id : 19550228
             * type : topic
             * url : https://www.zhihu.com/topic/19550228/hot
             * avatar_url : https://pic4.zhimg.com/50/e82bab09c_s.jpg
             * name : 随便看看
             * excerpt :
             * introduction :
             */

            private String id;
            private String type;
            private String url;
            private String avatar_url;
            private String name;
            private String excerpt;
            private String introduction;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

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

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getExcerpt() {
                return excerpt;
            }

            public void setExcerpt(String excerpt) {
                this.excerpt = excerpt;
            }

            public String getIntroduction() {
                return introduction;
            }

            public void setIntroduction(String introduction) {
                this.introduction = introduction;
            }
        }
    }

    public PostInfoTopic getdata(){
        postInfo=new PostInfoTopic();
        if(this.data==null){
            return null;
        }
        postInfo.setCount(this.data.size()+"");
        ArrayList<PostInfoTopic.InfoBean> postinfobeanlist=new ArrayList<>();
        for (DataBean b:data
        ) {

            if(b.getTarget()==null||b.getTarget().getQuestion()==null){
                continue;
            }
            PostInfoTopic.InfoBean bean=new PostInfoTopic.InfoBean();
            bean.setCreateTime(DateUtil.timeStamp2Date(b.getCreated_time()+"","yyyy-MM-dd HH:mm:ss"));
            bean.setItemAuthor(b.getTarget().getAuthor().getName());

            bean.setItemDomain(b.getAction_text());
            bean.setItemType("1");
            bean.setItemTitle(b.getTarget().getQuestion().getTitle());
            bean.setItemSource("知乎");
            bean.setItemUrl("https://www.zhihu.com/question/"+b.getTarget().getQuestion().getId());
            bean.setItemComment(b.getTarget().getComment_count()+"");
            bean.setItemRead((b.getTarget().getVisited_count()+""));
            bean.setTopicDiscussionNum((b.getTarget().getQuestion().getAnswer_count()+""));
            bean.setTopicFollowerNum((b.getTarget().getAuthor().getFollowers_count()+""));
            postinfobeanlist.add(bean);
        }
        postInfo.setInfo(postinfobeanlist);
        return postInfo;
    }
}
