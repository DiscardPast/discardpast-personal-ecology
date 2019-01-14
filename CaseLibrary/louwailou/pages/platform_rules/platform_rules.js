// pages/activity/activity.js
var WxParse = require('../../wxParse/wxParse.js');

Page({

  /**
   * 页面的初始数据
   */
  data: {},

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {
    var that = this;
    wx.showLoading({
      title: '加载中...',
    })
    /**
     * html解析示例
     */
    var article = `<p style="text-indent:28px">
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">2018</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">年施坦威钢琴（<span>Steinway &amp; Sons</span>）成立<span>165</span>周年。一个多世纪以来施坦威为全球的音乐爱好者带来了无与伦比的音乐体验。<span>165</span>年的荣耀与传承，<span>165</span>年的开拓与创新。<span>&nbsp;</span></span>
</p>
<p style="text-indent:28px">
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">2018</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">年恰逢施坦威艺术生活馆（长沙店）开业一周年，借此机会发起<strong><span>2018</span>湖南省首次“用音乐传递爱·施坦威<span>165</span>周年大型公益音乐庆典活动”</strong><span>2018</span>年<span>11</span>月<span>9</span>日将在长沙音乐厅湘江大厅举办一场规模空前的全省首次<span>165</span>人同台大型公益音乐会，届时将邀请<span>5</span>位世界级艺术家、<span>20</span>位专业钢琴教师及<span>140</span>位优秀的琴童，<span>165</span>人同台献奏。希望更多音乐爱好者参与这次大型公益音乐庆典活动，在这里实现五彩斑斓的<strong>音乐梦想！</strong></span>
</p>
<p style="text-indent:14px">
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">&nbsp;</span>
</p>
<p style="text-indent:107px">
    <strong><span style="font-size:21px;font-family:&#39;微软雅黑&#39;,sans-serif">&nbsp;</span></strong><strong><span style="font-family:&#39;微软雅黑&#39;,sans-serif">用音乐传递爱·施坦威<span>165</span>周年大型公益音乐庆典活动</span></strong>
</p>
<p style="text-align:center">
    <strong><span style="font-size:21px;font-family:&#39;微软雅黑&#39;,sans-serif">琴童选拔章程</span></strong>
</p>
<p style="text-align:center">
    <strong><span style="font-size:21px;font-family:&#39;微软雅黑&#39;,sans-serif">&nbsp;</span></strong>
</p>
<p>
    <span style="font-size:12px;font-family:&#39;微软雅黑&#39;,sans-serif">本次选拔包括参演全程公益不收取任何费用，并且免费提供排练、艺术指导、上台、媒体直播、录播、音乐会现场录像资料等资源</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">&nbsp;</span>
</p>
<p>
    <span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">选拔分组</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">幼儿组：<span>4-6</span>周岁<span>&nbsp; </span>（<span>2012</span>年<span>12</span>月<span>31</span>日<span>-2015</span>年<span>12</span>月<span>30</span>日前出生）</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">A</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">组：<span>7-9</span>周岁<span>&nbsp;&nbsp; </span>（<span>2008</span>年<span>12</span>月<span>31</span>日－<span>2011</span>年<span>12</span>月<span>30</span>日出生）</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">B</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">组<span>10-12</span>周岁<span>&nbsp; </span>（<span>2005</span>年<span>12</span>月<span>31</span>日－<span>2008</span>年<span>12</span>月<span>30</span>日出生）</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">C</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">组<span>13-16</span>周岁<span>&nbsp; </span>（<span>2001</span>年<span>12</span>月<span>31</span>日－<span>2005</span>年<span>12</span>月<span>30</span>日出生）</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">&nbsp;</span>
</p>
<p>
    <span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">选拔曲目要求</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">：</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">每一组要求一致，一首车尔尼<span>OP.599</span>中级以上练习曲，一首自选乐曲<span>(</span>两首曲目录制成<span>3</span>分钟之内的视频上传至报名网页内<span>)</span></span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">&nbsp;</span>
</p>
<p>
    <span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">报名</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">：</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">1.</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">时间：<span>2018</span>年<span>8</span>月<span>16</span>日——<span>9</span>月<span>27</span>日</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">2.</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">通过关注公众号：长沙施坦威钢琴艺术生活馆——点击报名菜单——进入报名网页报名（填写资料并上传<span>3</span>分钟演奏视频）</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">3.</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">施坦威艺术生活馆可以免费提供录制场地与钢琴（<span>20</span>分钟），需家长自备录音设备，（需要提前电话预约）</span><strong></strong>
</p>
<p>
    <span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">&nbsp;</span>
</p>
<p>
    <span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">选拔及排练：</span>
</p>
<p>
    <span style="font-size:16px;font-family:&#39;微软雅黑&#39;,sans-serif">①初选方式： 网络视频预选</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">参加选拔者上传曲目要求的演奏视频至报名网页，由李成伟老师与<span>20</span>位参演的钢琴教师观看选手的参演视频选出最优秀的<span>300</span>名琴童</span>
</p>
<p>
    <span style="font-size:16px;font-family:&#39;微软雅黑&#39;,sans-serif">②复选方式：</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">线下选拔</span>
</p>
<p style="text-indent:32px">
    <span style="font-size:16px;font-family:&#39;微软雅黑&#39;,sans-serif">2018</span><span style="font-size:16px;font-family:&#39;微软雅黑&#39;,sans-serif">年<span>9</span>月<span>28</span>日公布复选名单</span>
</p>
<p>
    <span style="font-size:16px;font-family:&#39;微软雅黑&#39;,sans-serif">③复选时间：<span>2018</span>年<span>9</span>月<span>29</span>日、<span>30</span>日</span>
</p>
<p style="text-indent:14px">
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">300</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">位琴童来到施坦威艺术生活馆（长沙店）线下选拔，角逐<span>140</span>位参演名额</span>
</p>
<p>
    <span style="font-size:16px;font-family:&#39;微软雅黑&#39;,sans-serif">④复选地点：施坦威艺术生活馆（长沙店）施坦威音乐厅</span>
</p>
<p>
    <span style="font-size:16px;font-family:&#39;微软雅黑&#39;,sans-serif">⑤复选结果公布：<span>9</span>月<span>30</span>日晚上公布最后<span>140</span>名上台表演琴童名单（</span><span style=";font-family:&#39;微软雅黑&#39;,sans-serif">名单将在新闻媒体、施坦威钢琴艺术生活馆公众号以及联合主办方等其他合作机构同时对外公布）</span>
</p>
<p>
    <span style="font-size:16px;font-family:&#39;微软雅黑&#39;,sans-serif">⑥音乐会排练：</span>
</p>
<p style="text-indent:16px">
    <span style="font-size:16px;font-family:&#39;微软雅黑&#39;,sans-serif">学生四手联弹分组排练时间：<span> 10</span>月<span>6</span>日<span>-10</span>月<span>31</span>日（届时通知分组情况和具体时间）</span>
</p>
<p style="text-indent:16px">
    <span style="font-size:16px;font-family:&#39;微软雅黑&#39;,sans-serif">教师四手联弹分组排练时间：<span> 11</span>月初</span>
</p>
<p style="text-align: justify;line-height: 25px">
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">⑦彩排时间：<span> 11</span>月<span>9</span>日 上午<span>9</span>点</span>
</p>
<p style="text-align: justify;text-indent: 14px;line-height: 25px">
    <span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">服装要求 男生：深色西装，黑色皮鞋，女生：颜色不限的礼服裙</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">&nbsp;</span>
</p>
<p>
    <span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">奖项设置</span>
</p>
<p style=";text-indent:0">
    <span style="font-family: &#39;微软雅黑&#39;,sans-serif">1.<span style="font-variant-numeric: normal;font-variant-east-asian: normal;font-stretch: normal;font-size: 9px;line-height: normal;font-family: &#39;Times New Roman&#39;">&nbsp;&nbsp; </span></span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">所有参加选拔者赠送<span>3000</span>元钢琴代金券（电子券形式）</span>
</p>
<p style=";text-indent:0">
    <span style="font-family: &#39;微软雅黑&#39;,sans-serif">2.<span style="font-variant-numeric: normal;font-variant-east-asian: normal;font-stretch: normal;font-size: 9px;line-height: normal;font-family: &#39;Times New Roman&#39;">&nbsp;&nbsp; </span></span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">所有报名参赛的的琴童，成为施坦威“小演奏家”俱乐部会员。（俱乐部会员享有免费参加我馆举办的音乐活动的机会）</span>
</p>
<p style=";text-indent:0">
    <span style="font-family: &#39;微软雅黑&#39;,sans-serif">3.<span style="font-variant-numeric: normal;font-variant-east-asian: normal;font-stretch: normal;font-size: 9px;line-height: normal;font-family: &#39;Times New Roman&#39;">&nbsp;&nbsp; </span></span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">所有参演选手将赠送<span>5000</span>元钢琴代金券</span>
</p>
<p style=";text-indent:0">
    <span style="font-family: &#39;微软雅黑&#39;,sans-serif">4.<span style="font-variant-numeric: normal;font-variant-east-asian: normal;font-stretch: normal;font-size: 9px;line-height: normal;font-family: &#39;Times New Roman&#39;">&nbsp;&nbsp; </span></span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">从排练、参演中选出若干名表现最好的小演员给予<span>2000</span>元现金奖励以及<span>10000</span>元钢琴代金券</span>
</p>
<p style=";text-indent:0">
    <span style="font-family: &#39;微软雅黑&#39;,sans-serif">5.<span style="font-variant-numeric: normal;font-variant-east-asian: normal;font-stretch: normal;font-size: 9px;line-height: normal;font-family: &#39;Times New Roman&#39;">&nbsp;&nbsp; </span></span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">所有参演选手将颁发施坦威<span>165</span>周年庆典音乐会的纪念证书与施坦威<span>165</span>周年纪念徽章</span>
</p>
<p style=";text-indent:0">
    <span style="font-family: &#39;微软雅黑&#39;,sans-serif">6.<span style="font-variant-numeric: normal;font-variant-east-asian: normal;font-stretch: normal;font-size: 9px;line-height: normal;font-family: &#39;Times New Roman&#39;">&nbsp;&nbsp; </span></span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">音乐会录制视频与现场精美照片</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">&nbsp;</span>
</p>
<p>
    <span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">参选须知：</span>
</p>
<p style="text-align: justify;line-height: 25px">
    <span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">1.</span><span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">参选者必须于选拔前<span>30</span>分钟到达选拔场地<span>,</span>无需全天等候选拔。</span>
</p>
<p style="text-align: justify;line-height: 25px">
    <span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">2.</span><span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">参选者必须出示带有身份证明文件，以便工作人员核对。</span>
</p>
<p style="text-align: justify;line-height: 25px">
    <span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">3.</span><span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">参选者必须背谱演奏。<span>&nbsp;</span></span>
</p>
<p style="text-align: justify;line-height: 25px">
    <span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">4.</span><span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">评选结果以评委会评审结果为最后决定。</span>
</p>
<p style="text-align: justify;line-height: 25px">
    <span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">5.</span><span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">评委会根据现场情况有权中断参选者的演奏，但不影响选拔成绩。</span>
</p>
<p style="text-align: justify;line-height: 25px">
    <span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">6.</span><span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">参选者如多次缺席排练影响节目演出，组委会有权替换或取消其参演资格。</span>
</p>
<p style="text-align: justify;line-height: 25px">
    <span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">7.</span><span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">所有参选者均被视为同意并自愿遵守本届参演选拔章程。</span>
</p>
<p style="text-align: justify;line-height: 25px">
    <span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">8. </span><span style="font-size:14px;font-family:&#39;微软雅黑&#39;,sans-serif">本章程的最终解释权归施坦威艺术生活馆所有。</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">&nbsp;</span>
</p>
<p>
    <strong><span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">演出时间：<span>2018</span>年<span>11</span>月<span>9</span>日 晚</span></strong>
</p>
<p>
    <strong><span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">演出地点：长沙音乐厅 湘江大厅</span></strong>
</p>
<p>
    <strong><span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">钢琴配置</span></strong><span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">：<span>5</span>台施坦威及其家族系列三角钢琴</span>
</p>
<p>
    <span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 14</span><span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">台施坦威及其家族系列立式钢琴</span>
</p>
<p>
    <strong><span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">演出人员</span></strong><span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">：</span>
</p>
<p style="text-indent:19px">
    <span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">5</span><span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">位世界级钢琴演奏家：郑慧（中国香港）、<span>Adam Gyogry</span>亚当乔治（匈牙利）、<span>Caterina </span>·<span>Grewe</span>凯特莉娜·格蕾维（德国）、<span>Gerard Aimontche</span>杰拉德·艾曼奇（俄罗斯）、李成伟 （中国）</span>
</p>
<p style="text-indent:19px">
    <span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">20</span><span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">位优秀钢琴教师</span>
</p>
<p style="text-indent:19px">
    <span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">140</span><span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">名优秀琴童</span>
</p>
<p style="text-indent:19px">
    <span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">165</span><span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">人同台献演</span>
</p>
<p>
    <span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">琴童需要练习曲目</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">：</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif;color:#C00000">每位琴童只需练习其中的一首曲目，所有曲目都以四手联弹的形式表演，曲目声部分组由评委组于选拔结束后统一安排</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">1</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">勃拉姆斯 匈牙利舞曲一号</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">2</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">勃拉姆斯 匈牙利舞曲五号</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">3</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">奥芬巴哈 康康舞曲</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">4</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">舒伯特 军队进行曲</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">5</span><span style="font-family:&#39;微软雅黑&#39;,sans-serif">拉德茨基进行曲</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">演出形式：如下图：</span>
</p>
<p>
</p>
<p>
    <span style="font-size:19px;font-family:&#39;微软雅黑&#39;,sans-serif">组织机构：</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">指导单位：湖南省教育学会、第二课堂杂志社</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">主办单位：施坦威艺术生活馆（长沙中盈广场店）</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">联合主办单位：芒果<span>V</span>基金、新华社湖南新闻信息中心、湖南中盈万嘉置业有限公司、湖南凤凰教育集团、长沙君悦酒店、湖南新华传媒有限公司</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">承办单位：湖南省寰亚盛世文化传播有限公司</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">协办机构：合乐教育集团</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">美音国际钢琴联盟</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">哆唻咪钢琴艺术中心</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">琴雅钢琴艺术中心</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">卡诺尔钢琴馆</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">听雨琴行艺术中心</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">多泽钢琴工作室</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">玛其国际音乐学校</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">西贝音乐教育</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">小白帆钢琴艺术中心</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">靠谱钢琴艺术中心</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">雅艺音乐</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">璞域艺术工作室</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">艺雅钢琴</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">易依钢琴工作室</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">音书园钢琴教育中心</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">指艺百川艺术中心</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">燕乐艺术学校</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">郑黎明钢琴工作室</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">晓耳朵音乐素养馆 </span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">艺帆音乐教育</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">美辰艺术</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">你好钢琴</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">合拍钢琴艺术中心</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">艾米钢琴艺术教育</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">笙歌音乐</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">佳音艺校</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">大音艺术</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">三音音乐教育</span>
</p>
<p>
    <span style="font-family:&#39;微软雅黑&#39;,sans-serif">&nbsp;</span>
</p>
<p>
    <br/>
</p>
`;
    WxParse.wxParse('article', 'html', article, that, 5);
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function() {
    wx.hideLoading()
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function() {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function() {

  }
})