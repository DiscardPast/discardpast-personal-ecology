// pages/comment/comment.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    testList: [
      {
        'testTitle': '排序',
        'testList': ['默认排序','价格由高到低','价格由低到高']
      },
      {
        'testTitle': '户型',
        'testList': ['一室','二室','三室','四室','五室','五室以上']
      },
      {
        'testTitle': '面积',
        'testList': ['50m²以下', '50-70m²', '70-90m²', '90-110m²', '110-130m²', '130-150m²', '150-200m²', '200m²以上']
      },
      {
        'testTitle': '类型',
        'testList': ['住宅', '别墅', '商铺']
      },
      {
        'testTitle': '特色',
        'testList': [1,2,3,4,5,6]
      },
      {
        'testTitle': '售卖状态',
        'testList': ['在售', '未开盘', '售罄']
      },
      {
        'testTitle': '开盘时间',
        'testList': ['近期开盘', '未来一个月', '未来三个月','未来半年','过去一个月','过去三个月']
      },
      {
        'testTitle': '环线',
        'testList': ['一环内', '一至二环', '二至三环']
      }
    ],
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    wx.showLoading({
      title: '加载中...',
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