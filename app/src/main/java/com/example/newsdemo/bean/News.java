package com.example.newsdemo.bean;

import java.util.List;

/**
 * @author cky
 * date 2019-11-04
 */
public class News {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"5e22a39e7d222ed8c0b2dcaf25f68431","title":"街拍：面带微笑的美女，一条粉红色连衣裙，尽显完美好身材","date":"2019-11-04 10:24","category":"头条","author_name":"坚持娱乐是一种态度","url":"http://mini.eastday.com/mobile/191104102451310.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20191104/2019110410_928203fd258c4a63a912e2bc6aa8f94e_5131_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20191104/2019110410_ff14413a56fd4dfdb71679b302fb25a9_9247_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20191104/2019110410_1f627089f5294f0ba1a2513d32a6ffea_0495_cover_mwpm_03200403.jpg"},{"uniquekey":"86fb2b24f68aaf315fb8a8b165de248a","title":"发现一种女外套，也叫\u201c冬暖外套\u201d，适合90后女人穿，美到田间","date":"2019-11-04 10:21","category":"头条","author_name":"黄昏晨曦","url":"http://mini.eastday.com/mobile/191104102104482.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20191104/20191104102104_151bad8a9713600d001a2236fac094f8_14_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20191104/20191104102104_151bad8a9713600d001a2236fac094f8_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20191104/20191104102104_151bad8a9713600d001a2236fac094f8_13_mwpm_03200403.jpg"},{"uniquekey":"240ae3d92194c6f3cc77dcd3dbf411ba","title":"江苏如东县爱心人士到岳西捐资助学","date":"2019-11-04 10:17","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/191104101739394.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191104/20191104101739_f4911fc416ef086808b50152b3af6edb_1_mwpm_03200403.jpg"},{"uniquekey":"d8273e6c50b6407d40cd0c19c171b120","title":"英国提前大选，不如说是实为二次\u201c脱欧公投\u201d？","date":"2019-11-04 10:17","category":"头条","author_name":"纵相新闻","url":"http://mini.eastday.com/mobile/191104101732310.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20191104/2019110410_df3e4d0fe4d94f6fb375c3e910a7eb41_9285_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20191104/2019110410_3f2f58136bdd4da3ae99b1c942975616_6550_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20191104/2019110410_b424ca90ad2f4981af994f6af1ffb07a_8850_cover_mwpm_03200403.jpg"},{"uniquekey":"cfd48096cc0e1dd83defa1de6882b1e4","title":"被捧上天的华为P30Pro为什么如今无人问津？原因其实很简单","date":"2019-11-04 10:17","category":"头条","author_name":"叽歪数码VVV","url":"http://mini.eastday.com/mobile/191104101710014.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191104/2019110410_9e51680b4aef4349afeba196eef39069_5593_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20191104/2019110410_b2fc711db40847caa1f837b5b093e1b2_9186_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20191104/2019110410_94c9e746d47649c1a28a9addfddc3165_5056_mwpm_03200403.jpg"},{"uniquekey":"1246619f019cb09a9760aa3d297c366d","title":"推荐经济实惠的几道家常菜，香而不腻，简单易做，上桌抢着吃","date":"2019-11-04 10:15","category":"头条","author_name":"家常美食","url":"http://mini.eastday.com/mobile/191104101541359.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20191104/20191104101541_404d4bcf867976c8eaf68c935351088f_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20191104/20191104101541_404d4bcf867976c8eaf68c935351088f_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20191104/20191104101541_404d4bcf867976c8eaf68c935351088f_1_mwpm_03200403.jpg"},{"uniquekey":"c3faac9d30b3a67e8582af255ad20d77","title":"搞笑gif动图： 姑娘累了吗？我可以借你一个肩膀！！","date":"2019-11-04 10:14","category":"头条","author_name":"搞笑大圈妹","url":"http://mini.eastday.com/mobile/191104101458599.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20191104/20191104101458_5597def8aebb2acd6344134554fac9e6_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20191104/20191104101458_5597def8aebb2acd6344134554fac9e6_16_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20191104/20191104101458_5597def8aebb2acd6344134554fac9e6_14_mwpm_03200403.jpg"},{"uniquekey":"6301fae92dccceb7f91843cddeb7a1f2","title":"搞笑GIF：这女生她跑起来我都追不上","date":"2019-11-04 10:14","category":"头条","author_name":"搞笑38度","url":"http://mini.eastday.com/mobile/191104101455277.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20191104/20191104101455_cd36ff4af38fcb2207c19d264e9c6d17_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20191104/20191104101455_cd36ff4af38fcb2207c19d264e9c6d17_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20191104/20191104101455_cd36ff4af38fcb2207c19d264e9c6d17_7_mwpm_03200403.jpg"},{"uniquekey":"03f935bb156de7bdf1d8bc8e4117e0bd","title":"杨幂\u201c带货女王\u201d从不浪得虚名！不爱大牌爱平价，穿啥火啥","date":"2019-11-04 10:08","category":"头条","author_name":"Daisy的时尚笔记","url":"http://mini.eastday.com/mobile/191104100814827.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20191104/20191104100814_c64967a1bc4cf6fca17ae1179223288f_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20191104/20191104100814_c64967a1bc4cf6fca17ae1179223288f_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20191104/20191104100814_c64967a1bc4cf6fca17ae1179223288f_6_mwpm_03200403.jpg"},{"uniquekey":"44d2f46a1cdacb120721f61c62e13346","title":"首轮20支队伍全部亮相，一队表现抢眼，一队差强人意","date":"2019-11-04 10:07","category":"头条","author_name":"体育全民星探","url":"http://mini.eastday.com/mobile/191104100732847.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191104/20191104100732_828fb1f5f3f54d5d8858d8e8bf0194f6_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20191104/20191104100732_828fb1f5f3f54d5d8858d8e8bf0194f6_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20191104/20191104100732_828fb1f5f3f54d5d8858d8e8bf0194f6_5_mwpm_03200403.jpg"},{"uniquekey":"6068f7f60bbceba2c3967ff36fe34d0f","title":"原创 施瓦辛格连姆尼森成龙\u2026\u2026都是不服老的老炮啊！","date":"2019-11-04 10:05","category":"头条","author_name":"杨不易","url":"http://mini.eastday.com/mobile/191104100554694.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20191104/20191104100554_888c65117302793641355b7d0910072d_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20191104/20191104100554_888c65117302793641355b7d0910072d_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20191104/20191104100554_888c65117302793641355b7d0910072d_3_mwpm_03200403.jpg"},{"uniquekey":"9990b2b80be3f7f04b6813c147a83a5d","title":"数千万失能老人如何照料？中国多举措缓解养护难题","date":"2019-11-04 10:03","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/191104100304325.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20191104/20191104100304_e442c4e99e55900a690b6cfa6251bc9b_1_mwpm_03200403.jpg"},{"uniquekey":"2391c806bc9b4d35d51f6e59015b7d20","title":"幽默笑话：总习惯在手把的地方下嘴，自信能躲过不少传染源","date":"2019-11-04 10:02","category":"头条","author_name":"搞笑38度","url":"http://mini.eastday.com/mobile/191104100253108.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20191104/20191104100253_ff61252e65febd653589fd8fe78ca00f_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20191104/20191104100253_ff61252e65febd653589fd8fe78ca00f_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20191104/20191104100253_ff61252e65febd653589fd8fe78ca00f_4_mwpm_03200403.jpg"},{"uniquekey":"c5387abae7250e071a438551c9201cd2","title":"很酷的大过滤器能解释黑暗森林，为什么不能回答费米悖论？","date":"2019-11-04 09:58","category":"头条","author_name":"航空小卫士","url":"http://mini.eastday.com/mobile/191104095848600.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20191104/20191104095848_03cadfb46ba2bc9fa73e219d58605e60_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20191104/20191104095848_03cadfb46ba2bc9fa73e219d58605e60_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20191104/20191104095848_03cadfb46ba2bc9fa73e219d58605e60_2_mwpm_03200403.jpg"},{"uniquekey":"d9de278376a15127ed8424ac13913404","title":"直升机和无人机都用上了 日本福岛仍有36袋核污染物未找到","date":"2019-11-04 09:54","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/191104095405123.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191104/20191104095405_38ebea33f13946d6da78ada187c083fe_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20191104/20191104095405_38ebea33f13946d6da78ada187c083fe_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20191104/20191104095405_38ebea33f13946d6da78ada187c083fe_1_mwpm_03200403.jpg"},{"uniquekey":"61a14f9c9536766293ce77f4fb073761","title":"上海16个区垃圾分类综合测评均\u201c优秀\u201d 查查你家街道成绩如何","date":"2019-11-04 09:53","category":"头条","author_name":"东方网","url":"http://mini.eastday.com/mobile/191104095349502.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20191104/20191104095349_80876336f28f7590bf0d8051e2c6a36d_1_mwpm_03200403.jpg"},{"uniquekey":"4533684f2e756c0a6a6c85bbae4d906e","title":"原创 品质生活成追求，社交电商强助攻，便携小家电发展迅速","date":"2019-11-04 09:53","category":"头条","author_name":"钉科技","url":"http://mini.eastday.com/mobile/191104095300504.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20191104/20191104095300_cf3cbca1b75e6543e8423201f3eb4332_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20191104/20191104095300_cf3cbca1b75e6543e8423201f3eb4332_1_mwpm_03200403.jpg"},{"uniquekey":"ea42d84ec2f57b8e0b366465bceb3732","title":"中国燃气 ( 0384.HK ) 高开近 3% 多地上调天然气价格","date":"2019-11-04 09:52","category":"头条","author_name":"ZAKER网","url":"http://mini.eastday.com/mobile/191104095237682.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20191104/20191104095237_dd902d011e96d142dbcf142a3b3a4e82_1_mwpm_03200403.jpg"},{"uniquekey":"f74054e0844047ba9765f1a8f3e260f2","title":"做地暖重庆暖气片前防水面的水应该怎么处理？","date":"2019-11-04 09:52","category":"头条","author_name":"好逸家暖通","url":"http://mini.eastday.com/mobile/191104095230627.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20191104/20191104095230_1f0984de9d08ef606dcc5d12c69858dd_1_mwpm_03200403.jpg"},{"uniquekey":"8bd1bb4ce3cd7f5e2656e774454a52b7","title":"赚钱无数的三属相，11月喜鹊枝上叫，钞票堆满仓","date":"2019-11-04 09:52","category":"头条","author_name":"生肖我很懂","url":"http://mini.eastday.com/mobile/191104095229360.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20191104/20191104095229_da2c2df4d749f9286c62887e1b27aff4_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20191104/20191104095229_da2c2df4d749f9286c62887e1b27aff4_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20191104/20191104095229_da2c2df4d749f9286c62887e1b27aff4_2_mwpm_03200403.jpg"},{"uniquekey":"8e836b06e0dfe75c33fb062977cd66fa","title":"寻古探源的宝贵史料 甲骨文有了新\u201c活\u201d法","date":"2019-11-04 09:51","category":"头条","author_name":"人民日报","url":"http://mini.eastday.com/mobile/191104095108206.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20191104/20191104095108_59b39d0440fcd84a45ef8c296fd8996a_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20191104/20191104095108_59b39d0440fcd84a45ef8c296fd8996a_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20191104/20191104095108_59b39d0440fcd84a45ef8c296fd8996a_2_mwpm_03200403.jpg"},{"uniquekey":"19dabd48ddd24be07af0287bd2db7adc","title":"麦当劳宣布解雇CEO 因其与公司员工保持不当关系","date":"2019-11-04 09:50","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/191104095057582.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191104/20191104095057_5705a0360d24ded3903ac33ae1b75b20_1_mwpm_03200403.jpg"},{"uniquekey":"759ceac3b0c2afb0d246a9123445de91","title":"卧室背景非得挂画？不挂画照样好看10.8","date":"2019-11-04 09:50","category":"头条","author_name":"西安装修报价咨询","url":"http://mini.eastday.com/mobile/191104095037773.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191104/20191104095037_0d633a17e60f88811946c854bf923c72_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20191104/20191104095037_0d633a17e60f88811946c854bf923c72_17_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20191104/20191104095037_0d633a17e60f88811946c854bf923c72_19_mwpm_03200403.jpg"},{"uniquekey":"9ffe28a8a32f1ef41d9fab662b8d62f2","title":"狂赢29分！黑马打垮1.47亿最贵军团，巴特勒教做领袖太狠了","date":"2019-11-04 09:49","category":"头条","author_name":"李喜林篮球绝杀","url":"http://mini.eastday.com/mobile/191104094933016.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20191104/2019110409_afe436188e8b41268369df99d5fd2e3c_8285_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20191104/2019110409_cc377bb180ed42689dca1a7901707fdf_8298_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20191104/2019110409_10a8d574a5aa496fade9f2a1178b3e33_2300_mwpm_03200403.jpg"},{"uniquekey":"5c5319bee3bc7c651f68b3fd0b858d3f","title":"哈登29分巴特勒18+7+9 火箭客场惨负热火","date":"2019-11-04 09:44","category":"头条","author_name":"北青网","url":"http://mini.eastday.com/mobile/191104094400215.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191104/20191104094400_259f1053809192db4ec5a0d8b6eafc1f_1_mwpm_03200403.jpg"},{"uniquekey":"e73d605fde517d4b173d8efc8c306a37","title":"重庆渝北一对夫妻同一地点相隔5分钟先后被查","date":"2019-11-04 09:43","category":"头条","author_name":"北青网","url":"http://mini.eastday.com/mobile/191104094359852.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20191104/20191104094359_25fa5fecde39dc62e3230ec2b07f9b75_1_mwpm_03200403.jpg"},{"uniquekey":"277e72811cf1a4904bd4cbeb88366540","title":"中国首家基于 AI 的微生态制药公司未知君完成过亿人民币 B 轮融资","date":"2019-11-04 09:42","category":"头条","author_name":"投中网","url":"http://mini.eastday.com/mobile/191104094241593.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20191104/20191104094241_2f9f7d0527a1ce3af57fa6e92307775f_1_mwpm_03200403.jpg"},{"uniquekey":"c99739ba8cea7a2ca391330a379d7f79","title":"盘点历史上那些不可思议的UFO目击事件, 你听说过几个?","date":"2019-11-04 09:42","category":"头条","author_name":"维权骑士品牌馆l情感","url":"http://mini.eastday.com/mobile/191104094210301.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20191104/20191104094210_bd801440c0d2db07f1e530b52eeb6f6e_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20191104/20191104094210_55de5445e9d9350b7e70c90ee4d66723_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20191104/20191104094210_bb9dece29d6ae1aee2e172e7ca7e28b0_2_mwpm_03200403.jpg"},{"uniquekey":"ab3e387be26ceba8de2c8ee61022deee","title":"专业的人是怎么跑步的呢？","date":"2019-11-04 09:39","category":"头条","author_name":"海宝海宝","url":"http://mini.eastday.com/mobile/191104093935440.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20191104/20191104093935_5a7cca096445bb9c910a491c004eefc2_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20191104/20191104093935_5a7cca096445bb9c910a491c004eefc2_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20191104/20191104093935_5a7cca096445bb9c910a491c004eefc2_1_mwpm_03200403.jpg"},{"uniquekey":"1bdf83e2aeddff54bbb6df59f47787e4","title":"126㎡轻奢美式3室2厅，打造一见倾心的优雅风范","date":"2019-11-04 09:39","category":"头条","author_name":"合肥博进空间设计","url":"http://mini.eastday.com/mobile/191104093919846.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20191104/20191104093919_b2038ccd6e0450c0bf7ba9341e698811_18_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20191104/20191104093919_b2038ccd6e0450c0bf7ba9341e698811_19_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20191104/20191104093919_b2038ccd6e0450c0bf7ba9341e698811_16_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"5e22a39e7d222ed8c0b2dcaf25f68431","title":"街拍：面带微笑的美女，一条粉红色连衣裙，尽显完美好身材","date":"2019-11-04 10:24","category":"头条","author_name":"坚持娱乐是一种态度","url":"http://mini.eastday.com/mobile/191104102451310.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20191104/2019110410_928203fd258c4a63a912e2bc6aa8f94e_5131_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20191104/2019110410_ff14413a56fd4dfdb71679b302fb25a9_9247_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20191104/2019110410_1f627089f5294f0ba1a2513d32a6ffea_0495_cover_mwpm_03200403.jpg"},{"uniquekey":"86fb2b24f68aaf315fb8a8b165de248a","title":"发现一种女外套，也叫\u201c冬暖外套\u201d，适合90后女人穿，美到田间","date":"2019-11-04 10:21","category":"头条","author_name":"黄昏晨曦","url":"http://mini.eastday.com/mobile/191104102104482.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20191104/20191104102104_151bad8a9713600d001a2236fac094f8_14_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20191104/20191104102104_151bad8a9713600d001a2236fac094f8_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20191104/20191104102104_151bad8a9713600d001a2236fac094f8_13_mwpm_03200403.jpg"},{"uniquekey":"240ae3d92194c6f3cc77dcd3dbf411ba","title":"江苏如东县爱心人士到岳西捐资助学","date":"2019-11-04 10:17","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/191104101739394.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191104/20191104101739_f4911fc416ef086808b50152b3af6edb_1_mwpm_03200403.jpg"},{"uniquekey":"d8273e6c50b6407d40cd0c19c171b120","title":"英国提前大选，不如说是实为二次\u201c脱欧公投\u201d？","date":"2019-11-04 10:17","category":"头条","author_name":"纵相新闻","url":"http://mini.eastday.com/mobile/191104101732310.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20191104/2019110410_df3e4d0fe4d94f6fb375c3e910a7eb41_9285_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20191104/2019110410_3f2f58136bdd4da3ae99b1c942975616_6550_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20191104/2019110410_b424ca90ad2f4981af994f6af1ffb07a_8850_cover_mwpm_03200403.jpg"},{"uniquekey":"cfd48096cc0e1dd83defa1de6882b1e4","title":"被捧上天的华为P30Pro为什么如今无人问津？原因其实很简单","date":"2019-11-04 10:17","category":"头条","author_name":"叽歪数码VVV","url":"http://mini.eastday.com/mobile/191104101710014.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191104/2019110410_9e51680b4aef4349afeba196eef39069_5593_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20191104/2019110410_b2fc711db40847caa1f837b5b093e1b2_9186_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20191104/2019110410_94c9e746d47649c1a28a9addfddc3165_5056_mwpm_03200403.jpg"},{"uniquekey":"1246619f019cb09a9760aa3d297c366d","title":"推荐经济实惠的几道家常菜，香而不腻，简单易做，上桌抢着吃","date":"2019-11-04 10:15","category":"头条","author_name":"家常美食","url":"http://mini.eastday.com/mobile/191104101541359.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20191104/20191104101541_404d4bcf867976c8eaf68c935351088f_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20191104/20191104101541_404d4bcf867976c8eaf68c935351088f_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20191104/20191104101541_404d4bcf867976c8eaf68c935351088f_1_mwpm_03200403.jpg"},{"uniquekey":"c3faac9d30b3a67e8582af255ad20d77","title":"搞笑gif动图： 姑娘累了吗？我可以借你一个肩膀！！","date":"2019-11-04 10:14","category":"头条","author_name":"搞笑大圈妹","url":"http://mini.eastday.com/mobile/191104101458599.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20191104/20191104101458_5597def8aebb2acd6344134554fac9e6_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20191104/20191104101458_5597def8aebb2acd6344134554fac9e6_16_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20191104/20191104101458_5597def8aebb2acd6344134554fac9e6_14_mwpm_03200403.jpg"},{"uniquekey":"6301fae92dccceb7f91843cddeb7a1f2","title":"搞笑GIF：这女生她跑起来我都追不上","date":"2019-11-04 10:14","category":"头条","author_name":"搞笑38度","url":"http://mini.eastday.com/mobile/191104101455277.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20191104/20191104101455_cd36ff4af38fcb2207c19d264e9c6d17_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20191104/20191104101455_cd36ff4af38fcb2207c19d264e9c6d17_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20191104/20191104101455_cd36ff4af38fcb2207c19d264e9c6d17_7_mwpm_03200403.jpg"},{"uniquekey":"03f935bb156de7bdf1d8bc8e4117e0bd","title":"杨幂\u201c带货女王\u201d从不浪得虚名！不爱大牌爱平价，穿啥火啥","date":"2019-11-04 10:08","category":"头条","author_name":"Daisy的时尚笔记","url":"http://mini.eastday.com/mobile/191104100814827.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20191104/20191104100814_c64967a1bc4cf6fca17ae1179223288f_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20191104/20191104100814_c64967a1bc4cf6fca17ae1179223288f_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20191104/20191104100814_c64967a1bc4cf6fca17ae1179223288f_6_mwpm_03200403.jpg"},{"uniquekey":"44d2f46a1cdacb120721f61c62e13346","title":"首轮20支队伍全部亮相，一队表现抢眼，一队差强人意","date":"2019-11-04 10:07","category":"头条","author_name":"体育全民星探","url":"http://mini.eastday.com/mobile/191104100732847.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191104/20191104100732_828fb1f5f3f54d5d8858d8e8bf0194f6_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20191104/20191104100732_828fb1f5f3f54d5d8858d8e8bf0194f6_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20191104/20191104100732_828fb1f5f3f54d5d8858d8e8bf0194f6_5_mwpm_03200403.jpg"},{"uniquekey":"6068f7f60bbceba2c3967ff36fe34d0f","title":"原创 施瓦辛格连姆尼森成龙\u2026\u2026都是不服老的老炮啊！","date":"2019-11-04 10:05","category":"头条","author_name":"杨不易","url":"http://mini.eastday.com/mobile/191104100554694.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20191104/20191104100554_888c65117302793641355b7d0910072d_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20191104/20191104100554_888c65117302793641355b7d0910072d_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20191104/20191104100554_888c65117302793641355b7d0910072d_3_mwpm_03200403.jpg"},{"uniquekey":"9990b2b80be3f7f04b6813c147a83a5d","title":"数千万失能老人如何照料？中国多举措缓解养护难题","date":"2019-11-04 10:03","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/191104100304325.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20191104/20191104100304_e442c4e99e55900a690b6cfa6251bc9b_1_mwpm_03200403.jpg"},{"uniquekey":"2391c806bc9b4d35d51f6e59015b7d20","title":"幽默笑话：总习惯在手把的地方下嘴，自信能躲过不少传染源","date":"2019-11-04 10:02","category":"头条","author_name":"搞笑38度","url":"http://mini.eastday.com/mobile/191104100253108.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20191104/20191104100253_ff61252e65febd653589fd8fe78ca00f_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20191104/20191104100253_ff61252e65febd653589fd8fe78ca00f_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20191104/20191104100253_ff61252e65febd653589fd8fe78ca00f_4_mwpm_03200403.jpg"},{"uniquekey":"c5387abae7250e071a438551c9201cd2","title":"很酷的大过滤器能解释黑暗森林，为什么不能回答费米悖论？","date":"2019-11-04 09:58","category":"头条","author_name":"航空小卫士","url":"http://mini.eastday.com/mobile/191104095848600.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20191104/20191104095848_03cadfb46ba2bc9fa73e219d58605e60_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20191104/20191104095848_03cadfb46ba2bc9fa73e219d58605e60_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20191104/20191104095848_03cadfb46ba2bc9fa73e219d58605e60_2_mwpm_03200403.jpg"},{"uniquekey":"d9de278376a15127ed8424ac13913404","title":"直升机和无人机都用上了 日本福岛仍有36袋核污染物未找到","date":"2019-11-04 09:54","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/191104095405123.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191104/20191104095405_38ebea33f13946d6da78ada187c083fe_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20191104/20191104095405_38ebea33f13946d6da78ada187c083fe_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20191104/20191104095405_38ebea33f13946d6da78ada187c083fe_1_mwpm_03200403.jpg"},{"uniquekey":"61a14f9c9536766293ce77f4fb073761","title":"上海16个区垃圾分类综合测评均\u201c优秀\u201d 查查你家街道成绩如何","date":"2019-11-04 09:53","category":"头条","author_name":"东方网","url":"http://mini.eastday.com/mobile/191104095349502.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20191104/20191104095349_80876336f28f7590bf0d8051e2c6a36d_1_mwpm_03200403.jpg"},{"uniquekey":"4533684f2e756c0a6a6c85bbae4d906e","title":"原创 品质生活成追求，社交电商强助攻，便携小家电发展迅速","date":"2019-11-04 09:53","category":"头条","author_name":"钉科技","url":"http://mini.eastday.com/mobile/191104095300504.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20191104/20191104095300_cf3cbca1b75e6543e8423201f3eb4332_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20191104/20191104095300_cf3cbca1b75e6543e8423201f3eb4332_1_mwpm_03200403.jpg"},{"uniquekey":"ea42d84ec2f57b8e0b366465bceb3732","title":"中国燃气 ( 0384.HK ) 高开近 3% 多地上调天然气价格","date":"2019-11-04 09:52","category":"头条","author_name":"ZAKER网","url":"http://mini.eastday.com/mobile/191104095237682.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20191104/20191104095237_dd902d011e96d142dbcf142a3b3a4e82_1_mwpm_03200403.jpg"},{"uniquekey":"f74054e0844047ba9765f1a8f3e260f2","title":"做地暖重庆暖气片前防水面的水应该怎么处理？","date":"2019-11-04 09:52","category":"头条","author_name":"好逸家暖通","url":"http://mini.eastday.com/mobile/191104095230627.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20191104/20191104095230_1f0984de9d08ef606dcc5d12c69858dd_1_mwpm_03200403.jpg"},{"uniquekey":"8bd1bb4ce3cd7f5e2656e774454a52b7","title":"赚钱无数的三属相，11月喜鹊枝上叫，钞票堆满仓","date":"2019-11-04 09:52","category":"头条","author_name":"生肖我很懂","url":"http://mini.eastday.com/mobile/191104095229360.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20191104/20191104095229_da2c2df4d749f9286c62887e1b27aff4_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20191104/20191104095229_da2c2df4d749f9286c62887e1b27aff4_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20191104/20191104095229_da2c2df4d749f9286c62887e1b27aff4_2_mwpm_03200403.jpg"},{"uniquekey":"8e836b06e0dfe75c33fb062977cd66fa","title":"寻古探源的宝贵史料 甲骨文有了新\u201c活\u201d法","date":"2019-11-04 09:51","category":"头条","author_name":"人民日报","url":"http://mini.eastday.com/mobile/191104095108206.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20191104/20191104095108_59b39d0440fcd84a45ef8c296fd8996a_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20191104/20191104095108_59b39d0440fcd84a45ef8c296fd8996a_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20191104/20191104095108_59b39d0440fcd84a45ef8c296fd8996a_2_mwpm_03200403.jpg"},{"uniquekey":"19dabd48ddd24be07af0287bd2db7adc","title":"麦当劳宣布解雇CEO 因其与公司员工保持不当关系","date":"2019-11-04 09:50","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/191104095057582.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191104/20191104095057_5705a0360d24ded3903ac33ae1b75b20_1_mwpm_03200403.jpg"},{"uniquekey":"759ceac3b0c2afb0d246a9123445de91","title":"卧室背景非得挂画？不挂画照样好看10.8","date":"2019-11-04 09:50","category":"头条","author_name":"西安装修报价咨询","url":"http://mini.eastday.com/mobile/191104095037773.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191104/20191104095037_0d633a17e60f88811946c854bf923c72_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20191104/20191104095037_0d633a17e60f88811946c854bf923c72_17_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20191104/20191104095037_0d633a17e60f88811946c854bf923c72_19_mwpm_03200403.jpg"},{"uniquekey":"9ffe28a8a32f1ef41d9fab662b8d62f2","title":"狂赢29分！黑马打垮1.47亿最贵军团，巴特勒教做领袖太狠了","date":"2019-11-04 09:49","category":"头条","author_name":"李喜林篮球绝杀","url":"http://mini.eastday.com/mobile/191104094933016.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20191104/2019110409_afe436188e8b41268369df99d5fd2e3c_8285_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20191104/2019110409_cc377bb180ed42689dca1a7901707fdf_8298_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20191104/2019110409_10a8d574a5aa496fade9f2a1178b3e33_2300_mwpm_03200403.jpg"},{"uniquekey":"5c5319bee3bc7c651f68b3fd0b858d3f","title":"哈登29分巴特勒18+7+9 火箭客场惨负热火","date":"2019-11-04 09:44","category":"头条","author_name":"北青网","url":"http://mini.eastday.com/mobile/191104094400215.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191104/20191104094400_259f1053809192db4ec5a0d8b6eafc1f_1_mwpm_03200403.jpg"},{"uniquekey":"e73d605fde517d4b173d8efc8c306a37","title":"重庆渝北一对夫妻同一地点相隔5分钟先后被查","date":"2019-11-04 09:43","category":"头条","author_name":"北青网","url":"http://mini.eastday.com/mobile/191104094359852.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20191104/20191104094359_25fa5fecde39dc62e3230ec2b07f9b75_1_mwpm_03200403.jpg"},{"uniquekey":"277e72811cf1a4904bd4cbeb88366540","title":"中国首家基于 AI 的微生态制药公司未知君完成过亿人民币 B 轮融资","date":"2019-11-04 09:42","category":"头条","author_name":"投中网","url":"http://mini.eastday.com/mobile/191104094241593.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20191104/20191104094241_2f9f7d0527a1ce3af57fa6e92307775f_1_mwpm_03200403.jpg"},{"uniquekey":"c99739ba8cea7a2ca391330a379d7f79","title":"盘点历史上那些不可思议的UFO目击事件, 你听说过几个?","date":"2019-11-04 09:42","category":"头条","author_name":"维权骑士品牌馆l情感","url":"http://mini.eastday.com/mobile/191104094210301.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20191104/20191104094210_bd801440c0d2db07f1e530b52eeb6f6e_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20191104/20191104094210_55de5445e9d9350b7e70c90ee4d66723_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20191104/20191104094210_bb9dece29d6ae1aee2e172e7ca7e28b0_2_mwpm_03200403.jpg"},{"uniquekey":"ab3e387be26ceba8de2c8ee61022deee","title":"专业的人是怎么跑步的呢？","date":"2019-11-04 09:39","category":"头条","author_name":"海宝海宝","url":"http://mini.eastday.com/mobile/191104093935440.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20191104/20191104093935_5a7cca096445bb9c910a491c004eefc2_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20191104/20191104093935_5a7cca096445bb9c910a491c004eefc2_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20191104/20191104093935_5a7cca096445bb9c910a491c004eefc2_1_mwpm_03200403.jpg"},{"uniquekey":"1bdf83e2aeddff54bbb6df59f47787e4","title":"126㎡轻奢美式3室2厅，打造一见倾心的优雅风范","date":"2019-11-04 09:39","category":"头条","author_name":"合肥博进空间设计","url":"http://mini.eastday.com/mobile/191104093919846.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20191104/20191104093919_b2038ccd6e0450c0bf7ba9341e698811_18_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20191104/20191104093919_b2038ccd6e0450c0bf7ba9341e698811_19_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20191104/20191104093919_b2038ccd6e0450c0bf7ba9341e698811_16_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 5e22a39e7d222ed8c0b2dcaf25f68431
             * title : 街拍：面带微笑的美女，一条粉红色连衣裙，尽显完美好身材
             * date : 2019-11-04 10:24
             * category : 头条
             * author_name : 坚持娱乐是一种态度
             * url : http://mini.eastday.com/mobile/191104102451310.html
             * thumbnail_pic_s : http://06imgmini.eastday.com/mobile/20191104/2019110410_928203fd258c4a63a912e2bc6aa8f94e_5131_cover_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://06imgmini.eastday.com/mobile/20191104/2019110410_ff14413a56fd4dfdb71679b302fb25a9_9247_cover_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://06imgmini.eastday.com/mobile/20191104/2019110410_1f627089f5294f0ba1a2513d32a6ffea_0495_cover_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public DataBean() {
            }

            public DataBean(String title, String author_name, String thumbnail_pic_s) {
                this.title = title;
                this.author_name = author_name;
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }

            @Override
            public String toString() {
                return "DataBean{" +
                        "uniquekey='" + uniquekey + '\'' +
                        ", title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", author_name='" + author_name + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                        ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                        ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                        '}';
            }
        }
    }
}
