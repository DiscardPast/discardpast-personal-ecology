// pages/reserve/reserve.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    buttonslist: [
      '未开始', '进行中', '已结束'
    ],
    testList: [{
      'serviceAvatar': 'https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/code.jpg?x-oss-process=style/yasuo',
        'serviceName': '客服一',
        'servicePhone': '123456741258'
      },
      {
        'serviceAvatar': 'https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/code.jpg?x-oss-process=style/yasuo',
        'serviceName': '客服二',
        'servicePhone': '123456741258'
      },
      {
        'serviceAvatar': 'https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/code.jpg?x-oss-process=style/yasuo',
        'serviceName': '客服三',
        'servicePhone': '123456741258'
      }, {
        'serviceAvatar': 'https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/code.jpg?x-oss-process=style/yasuo',
        'serviceName': '客服四',
        'servicePhone': '123456741258'
      }, {
        'serviceAvatar': 'https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/code.jpg?x-oss-process=style/yasuo',
        'serviceName': '客服五',
        'servicePhone': '123456741258'
      }
    ]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {
    wx.showLoading({
      title: '加载中...',
    })
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