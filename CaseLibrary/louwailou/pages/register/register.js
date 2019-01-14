// pages/register/register.js
var uploadImage = require('../../utils/upload/uploadFile.js');
var util = require('../../utils/upload/util.js');
var userName;
var userPhone;
var code;
var staffCode;
var idCardFront;
var idCardBack;

Page({

  /**
   * 页面的初始数据
   */
  data: {
    isConsultant:false,
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
        if(!res.data)
        {
          that.setData(
            {
              isConsultant: true
            }
          )
        }
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
  //选择照片 
  upLoadImageIdCardFront: function() {
    wx.chooseImage({
      count: 6,
      // 默认最多一次选择9张图
      sizeType: ['original', 'compressed'], // 可以指定是原图还是压缩图，默认二者都有
      sourceType: ['album', 'camera'], // 可以指定来源是相册还是相机，默认二者都有
      success: function(res) {
        // 返回选定照片的本地文件路径列表，tempFilePath可以作为img标签的src属性显示图片
        var tempFilePaths = res.tempFilePaths;
        var nowTime = util.formatTime(new Date());

        //支持多图上传
        for (var i = 0; i < res.tempFilePaths.length; i++) {
          //显示消息提示框
          wx.showLoading({
            title: '上传中' + (i + 1) + '/' + res.tempFilePaths.length,
            mask: true
          })

          //上传图片
          //你的域名下的/mifanimg文件下的/当前年月日文件下的/图片.png
          //图片路径可自行修改
          uploadImage(res.tempFilePaths[i], 'videoImage/' + nowTime + '/',
            function(result) {
              idCardFront = result;
              wx.showToast({
                title: '上传成功！',
              })
              console.log("======上传成功图片地址为videoCoverPath：", idCardFront);
              wx.hideLoading();
            },
            function(result) {
              console.log("======上传失败======", result);
              wx.hideLoading()
            }
          )
        }
      }
    })
  },
  upLoadImageIdCardBack: function() {
    wx.chooseImage({
      count: 6,
      // 默认最多一次选择9张图
      sizeType: ['original', 'compressed'], // 可以指定是原图还是压缩图，默认二者都有
      sourceType: ['album', 'camera'], // 可以指定来源是相册还是相机，默认二者都有
      success: function(res) {
        // 返回选定照片的本地文件路径列表，tempFilePath可以作为img标签的src属性显示图片
        var tempFilePaths = res.tempFilePaths;
        var nowTime = util.formatTime(new Date());

        //支持多图上传
        for (var i = 0; i < res.tempFilePaths.length; i++) {
          //显示消息提示框
          wx.showLoading({
            title: '上传中' + (i + 1) + '/' + res.tempFilePaths.length,
            mask: true
          })

          //上传图片
          //你的域名下的/mifanimg文件下的/当前年月日文件下的/图片.png
          //图片路径可自行修改
          uploadImage(res.tempFilePaths[i], 'videoImage/' + nowTime + '/',
            function(result) {
              idCardBack = result;
              wx.showToast({
                title: '上传成功！',
              })
              console.log("======上传成功图片地址为videoCoverPath：", idCardBack);
              wx.hideLoading();
            },
            function(result) {
              console.log("======上传失败======", result);
              wx.hideLoading()
            }
          )
        }
      }
    })
  },
  getName: function(e) {
    userName = e.detail.value;
  },
  getPhone: function(e) {
    userPhone = e.detail.value;
  },
  getCode: function(e) {
    code = e.detail.value;
  },
  getStaffCode: function(e) {
    staffCode = e.detail.value;
  },
  submit: function(e) {
    console.log(e)
    wx.getStorage({
      key: 'userKey',
      fail: function(resc) {
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
        wx.request({
          url: 'https://www.discardpast.top/api/user/userKey?userKey=' + res.data,
          method: 'get',
          header: {
            'content-type': 'application/json' // 默认值
          },
          success(resfs) {
            wx.request({
              url: 'https://www.discardpast.top/api/user/consultant?userKey=' + resfs.data.userKey,
              method: 'post',
              data: {
                userName: userName,
                userPhone: userPhone,
                staffCode: staffCode,
                phoneCode: code,
                idCardPositive: idCardFront,
                idCardBack: idCardBack
              },
              header: {
                'content-type': 'application/json' // 默认值
              },
              success(res) {
                console.log(res.data)
                wx.setStorage({
                  key: 'isUser',
                  data: res.data.userType == 'USER'
                })
                wx.setStorage({
                  key: 'userIntegral',
                  data: res.data.userIntegral
                })
                wx.setStorage({
                  key: 'isRegister',
                  data: true
                })
                wx.showToast({
                  title: '申请成功',
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
              }
            })
          }
        })
      },
    })
  }
})