
Page({
  data: {
    testList: [],
    isUser: true
  },
  //事件处理函数
  bindViewTap: function() {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  toProgramList: function () {
    wx.navigateTo({
      url: '../program_list/program_list',
    })
  },
  toRecommendClient: function() {
    wx.navigateTo({
      url: '../recommend_client/recommend_client'
    })
  },
  toRegister: function() {
    wx.navigateTo({
      url: '../register/register'
    })
  },
  toSubmitDemand: function() {
    wx.navigateTo({
      url: '../submit_demand/submit_demand'
    })
  },
  toPlatformRules: function() {
    wx.navigateTo({
      url: '../platform_rules/platform_rules'
    })
  },
  onLoad: function() {
    wx.showLoading({
      title: '加载中...',
    })
    var that = this;
    wx.request({
      url: 'https://www.cslouwailou.com/api/house/list', // 仅为示例，并非真实的接口地址
      method: 'get',
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        wx.hideLoading()
        console.log(res.data)
        that.setData({
          testList: res.data
        })
      }
    })
    wx.getStorage({
      key: 'isUser',
      success: function(res) {
        that.setData({
          isUser: res.data
        })
      },
    })
  },
  onShow:function() {
    this.onLoad();
  },
    onReady: function () {
    wx.hideLoading()
  },
})