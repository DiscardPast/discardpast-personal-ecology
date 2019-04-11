// pages/program_details/program_details.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    testList: [],
    isUser: true,
    houseType: [],
    backList: [],
    isClickSearchBoxButton: false,
    toView:'',
    toIndex: '',
    isChecked: true
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {
    var that = this;
    wx.showLoading({
      title: '加载中...',
    })
    wx.getStorage({
      key: 'isUser',
      success: function(res) {
        console.log(res.data)
        that.setData({
          isUser: res.data
        })
      },
    })
    wx.setStorage({
      key: 'isClickSearchBoxButton',
      data: false,
    })
    wx.getStorage({
      key: 'houseId',
      success: function(res) {
        wx.request({
          url: 'https://www.cslouwailou.com/api/house/id', // 仅为示例，并非真实的接口地址
          header: {
            'content-type': 'application/json' // 默认值
          },
          data: {
            houseId: res.data
          },
          success(res) {
            console.log(res.data.houseTypeList.houseTypeList[0].houseTypeList)
            that.setData({
              testList: res.data,
              houseType: res.data.houseTypeList.houseTypeList[0].houseTypeList
            })
          }
        })
      },
    })
    wx.request({
      url: 'https://www.cslouwailou.com//house/list', // 仅为示例，并非真实的接口地址
      header: {
        'content-type': 'application/json' // 默认值
      },
      data: {
        houseId: 30
      },
      success(res) {
        console.log(res.data)
        that.setData({
          backList: res.data
        })
      }
    })
    wx.getStorage({
      key: 'toIndex',
      success: function (res) {
        that.setData({
          toIndex: res.data
        })
      },
    })
    wx.getStorage({
      key: 'toView',
      success: function(res) {
        that.setData({
          toView: res.data
        })
      },
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
  toComment: function(e) {
    wx.navigateTo({
      url: '../comment/comment'
    })
  },
  toProgramTrend: function(e) {
    wx.navigateTo({
      url: '../program_trend/program_trend'
    })
  },
  clickHouseTypeItem: function(e) {
    console.log("idx:",e)
    var that = this;
    that.setData({
      houseType: e.currentTarget.dataset.housetype
    })
  },
  toPropertyInfo: function(e){
    wx.navigateTo({
      url: '../property_info/property_info'
    })
  },
  
})