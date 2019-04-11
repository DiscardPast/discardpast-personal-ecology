// pages/personal_center/personal_center.js
var userAvatar;
var userNickName;

Page({
  /**
   * 页面的初始数据
   */
  data: {
    testList: [{
        'icon': '../../../../../../../icons/personal_center_icons/post_list.png',
        'text': '积分商城',
        'link': 'toIntegrateShop'
      },
      {
        'icon': '../../../../../../../icons/personal_center_icons/my_collect.png',
        'text': '我的关注',
        'link': 'toMyAttention'
      },

      {
        'icon': '../../../../../../../icons/personal_center_icons/date.png',
        'text': '带看预约',
        'link': 'toReserve'
      },
      {
        'icon': '../../../../../../../icons/personal_center_icons/post_suggestion.png',
        'text': '意见反馈',
        'link': 'toFeedback'
      },
      {
        'icon': '../../../../../../../icons/personal_center_icons/service.png',
        'text': '在线客服',
        'link': 'toRecommendClient'
      },
    ],
    isRegister: false,
    isUser: true
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {
    wx.showLoading({
      title: '加载中...',
    })
    var onloadthis = this;
    wx.getStorage({
      key: 'isRegister',
      success: function(res) {
        onloadthis.setData({
          isRegister: true
        })
        wx.getStorage({
          key: 'isUser',
          success: function(res) {
            wx.hideLoading()
            console.log(res.data)
            if (!res.data) {
              onloadthis.setData({
                testList: [{
                    'icon': '../../../../../../../icons/personal_center_icons/my_cus.png',
                    'text': '推荐客户',
                    'link': 'toRecommendClient'
                  },
                  {
                    'icon': '../../../../../../../icons/personal_center_icons/integral.png',
                    'text': '我的客户',
                    'link': 'toClientList'
                  },
                  {
                    'icon': '../../../../../../../icons/personal_center_icons/invalid_cus.png',
                    'text': '客户状态',
                    'link': 'toClientList'
                  },
                  {
                    'icon': '../../../../../../../icons/personal_center_icons/hang_order.png',
                    'text': '挂单',
                    'link': 'toHangOrder'
                  },
                  {
                    'icon': '../../../../../../../icons/personal_center_icons/commission.png',
                    'text': '我的佣金',
                    'link': 'toConsultantBonus'

                  },
                  {
                    'icon': '../../../../../../../icons/personal_center_icons/date.png',
                    'text': '带看预约',
                    'link': 'toReserve'
                  },
                  {
                    'icon': '../../../../../../../icons/personal_center_icons/my_collect.png',
                    'text': '我的关注',
                    'link': 'toMyAttention'
                  },
                  {
                    'icon': '../../../../../../../icons/personal_center_icons/post_suggestion.png',
                    'text': '意见反馈',
                    'link': 'toFeedback'
                  },
                  {
                    'icon': '../../../../../../../icons/personal_center_icons/service.png',
                    'text': '在线客服',
                    'link': 'toCustomerService'
                  }
                ]
              })
            }
          },
        })
      },
    })
  },
  bindGetUserInfo(e) {
    var that = this;
    wx.login({
      success(res) {
        if (res.code) {
          wx.request({
            url: 'https://www.cslouwailou.com/api/openid/getopenidkey?code=' + res.code,
            method: 'post',
            data: {
              code: res.code
            },
            success(result) {
              console.log(result)
              wx.setStorage({
                  key: 'userKey',
                  data: result.data.openid,
                }),
                wx.getSetting({
                  success(res) {
                    if (res.authSetting['scope.userInfo']) {
                      // 已经授权，可以直接调用 getUserInfo 获取头像昵称
                      wx.getUserInfo({
                        success(resuserinfo) {
                          wx.request({
                            url: 'https://www.cslouwailou.com/api/user/add',
                            method: 'post',
                            data: {
                              userType: 0,
                              userAvatar: resuserinfo.userInfo.avatarUrl,
                              userNickName: resuserinfo.userInfo.nickName,
                              userKey: result.data.openid,
                              userIntegral: 0,
                            },
                            success: function(ress) {
                              that.setData({
                                isUser: ress.data.userType == 'USER'
                              })
                              wx.setStorage({
                                key: 'isUser',
                                data: ress.data.userType == 'USER',

                              })
                              wx.setStorage({
                                key: 'userIntegral',
                                data: ress.data.userIntegral
                              })
                              that.setData({
                                isRegister: true
                              })
                              wx.setStorage({
                                key: 'isRegister',
                                data: true
                              })
                              that.onLoad();
                            },
                            complete: function(resf) {
                              wx.hideLoading()
                              console.log(resf.data.status)
                              if (resf.data.status == 500) {
                                wx.request({
                                  url: 'https://www.cslouwailou.com/api/user/userKey?userKey=' + result.data.openid,
                                  method: 'get',
                                  success(resfs) {
                                    that.setData({
                                      isUser: resfs.data.userType == 'USER'
                                    })
                                    wx.setStorage({
                                      key: 'isUser',
                                      data: resfs.data.userType == 'USER'
                                    })
                                    wx.setStorage({
                                      key: 'userIntegral',
                                      data: resfs.data.userIntegral
                                    })
                                    that.setData({
                                      isRegister: true
                                    })
                                    wx.setStorage({
                                      key: 'isRegister',
                                      data: true
                                    })
                                    that.onLoad();
                                  }
                                })
                              }
                            }
                          })
                        }
                      })
                    }
                  }
                })
            }
          })
        } else {
          console.log('登录失败！' + res.errMsg)
        }
      }
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
  onShow: function() {},

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