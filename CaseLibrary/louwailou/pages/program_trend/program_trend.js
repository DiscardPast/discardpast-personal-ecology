// pages/program_trend/program_trend.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    testList:[],
    tipList:[]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this;
        wx.showLoading({
      title: '加载中...',
    })
    wx.getStorage({
      key: 'houseId',
      success: function (res) {
        wx.request({
          url: 'https://www.discardpast.top/api/house/id', // 仅为示例，并非真实的接口地址
          header: {
            'content-type': 'application/json' // 默认值
          },
          data: {
            houseId: res.data
          },
          success(res) {
            console.log(res.data.programDynamic.programDynamicItemList)
            that.setData({
              testList: res.data.programDynamic.programDynamicItemList,
              tipList: res.data.programDynamic.programDynamicTipList
            })
          }
        })
      },
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
wx.hideLoading()
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})