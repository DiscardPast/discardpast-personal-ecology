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
  getName: function(e) {
    clientName = e.detail.value
  },
  getPhone: function(e) {
    clientPhone = e.detail.value
  },
  getGender: function(e) {
    clientGender = e.detail.value
  },
  getInterestingHouse: function(e) {
    clientInterestingHouse = e.detail.value
  },
  getStaffCode: function(e) {
    clientStaffCode = e.detail.value
  },
  getTips: function(e) {
    clientTip = e.detail.value
  },
  submit: function() {
    wx.getStorage({
      key: 'userKey',
      fail: function (resc){
        wx.showToast({
          title: '请登录',
          icon: 'none',
          duration: 1000,
          success(e) {
            setTimeout(function () {
              wx.navigateTo({
                url: '../../pages/personal_center/personal_center',
              })
            }, 1000)
          }
        })
      },
      success: function(res) {
        console.log(res.data)
        wx.request({
          url: 'https://www.cslouwailou.com/api/client/add?staffCode=' + clientStaffCode + "&userKey=" + res.data,
          method: 'post',
          header: {
            'content-type': 'application/json'
          },
          data: {
            "clientName": clientName,
            "clientPhone": clientPhone,
            "clientGender": clientGender,
            "clientHouse": null,
            "clientStaffCode": clientStaffCode,
            "clientTips": clientTip
          },
          success(resc) {
              wx.showToast({
                title: '推荐成功',
                icon: 'success',
                duration: 1000,
                success() {
                  setTimeout(function () {
                    wx.navigateTo({
                      url: '../client_list/client_list',
                    })
                  }, 1000)
                }
              })
            }
        })
      },
    })

  }
})