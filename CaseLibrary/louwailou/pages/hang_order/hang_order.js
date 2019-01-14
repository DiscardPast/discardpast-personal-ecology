// pages/recommend_client/recommend_client.js
var that = this;
var clientName;
var clientPhone;
var clientGender;
var clientInterestingHouse;
var clientStaffCode;
var clientTip;

Page({

  /**
   * 页面的初始数据
   */
  data: {

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

  },
  getClientName: function(e) {
    console.log(e)
    clientName = e.detail.value
  },
  getClientPhone: function(e) {

    clientPhone = e.detail.value

  },
  getClientGender: function(e) {

    clientGender = e.detail.value

  },
  getClientInterestingHouse: function(e) {

    clientHouse = e.detail.value

  },
  getClientStaffCode: function(e) {

    clientStaffCode = e.detail.value

  },
  getClientTip: function(e) {

    clientTip = e.detail.value

  },

  submit: function() {
    wx.request({
      url: 'http://localhost:8080/staff/id',
      method: 'get',
      data: {
        staffId: 112
      },
      success(res) {
        console.log(res)
        wx.request({
          url: 'http://localhost:8080/client/add', // 仅为示例，并非真实的接口地址
          method: 'post',
          data: {
            clientName: clientName,
            clientPhone: clientPhone,
            clientGender: clientGender,
            clientHouse: null,
            clientStaffCode: clientStaffCode,
            clientTips: clientTip,
            staff: res.data,
            staffValidityStart: new Date(),
            staffValidityStop: new Date(),
            clientStatus: 0
          },
          header: {
            'content-type': 'application/json'
          },
          success(res) {
            console.log(res.data)
          }
        })
      }
    })
  }
})