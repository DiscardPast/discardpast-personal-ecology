// pages/program_list/program_list.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    testList: [],
    searchValue: '',
    isOpenAreaFilter: false,
    isScrollValue: true,
    areaFilterList: [{
        "typeName": "城区",
        "typeList": [{
            "typeAreaName": "null",
            "typeAreaList": {
              "typeAreaListItemName": "不限"
            }
          },
          {
            "typeAreaName": "市内城区",
            "typeAreaList": [{
              "typeAreaListItemName": "望城",
              "price": 0.7,
              "areaList": [{
                  "areaItemTitle": "不限"
                },
                {
                  "areaItemTitle": "望城区"
                },
                {
                  "areaItemTitle": "金星北"
                },
                {
                  "areaItemTitle": "雷锋镇"
                },
                {
                  "areaItemTitle": "青竹湖"
                }
              ]
            }, {
              "typeAreaListItemName": "宁乡",
              "price": 0.7,
              "areaList": [{
                  "areaItemTitle": "不限"
                },
                {
                  "areaItemTitle": "望城区"
                },
                {
                  "areaItemTitle": "金星北"
                },
                {
                  "areaItemTitle": "雷锋镇"
                },
                {
                  "areaItemTitle": "青竹湖"
                }
              ]
            }, {
              "typeAreaListItemName": "浏阳",
              "price": 0.7,
              "areaList": [{
                  "areaItemTitle": "不限"
                },
                {
                  "areaItemTitle": "望城区"
                },
                {
                  "areaItemTitle": "金星北"
                },
                {
                  "areaItemTitle": "雷锋镇"
                },
                {
                  "areaItemTitle": "青竹湖"
                }
              ]
            }, {
              "typeAreaListItemName": "长沙县",
              "price": 0.7,
              "areaList": [{
                  "areaItemTitle": "不限"
                },
                {
                  "areaItemTitle": "望城区"
                },
                {
                  "areaItemTitle": "金星北"
                },
                {
                  "areaItemTitle": "雷锋镇"
                },
                {
                  "areaItemTitle": "青竹湖"
                }
              ]
            }, {
              "typeAreaListItemName": "雨花",
              "price": 0.7,
              "areaList": [{
                  "areaItemTitle": "不限"
                },
                {
                  "areaItemTitle": "望城区"
                },
                {
                  "areaItemTitle": "金星北"
                },
                {
                  "areaItemTitle": "雷锋镇"
                },
                {
                  "areaItemTitle": "青竹湖"
                }
              ]
            }, {
              "typeAreaListItemName": "岳麓",
              "price": 0.7,
              "areaList": [{
                  "areaItemTitle": "不限"
                },
                {
                  "areaItemTitle": "望城区"
                },
                {
                  "areaItemTitle": "金星北"
                },
                {
                  "areaItemTitle": "雷锋镇"
                },
                {
                  "areaItemTitle": "青竹湖"
                }
              ]
            }, {
              "typeAreaListItemName": "天心",
              "price": 0.7,
              "areaList": [{
                  "areaItemTitle": "不限"
                },
                {
                  "areaItemTitle": "望城区"
                },
                {
                  "areaItemTitle": "金星北"
                },
                {
                  "areaItemTitle": "雷锋镇"
                },
                {
                  "areaItemTitle": "青竹湖"
                }
              ]
            }, {
              "typeAreaListItemName": "开福",
              "price": 0.7,
              "areaList": [{
                  "areaItemTitle": "不限"
                },
                {
                  "areaItemTitle": "望城区"
                },
                {
                  "areaItemTitle": "金星北"
                },
                {
                  "areaItemTitle": "雷锋镇"
                },
                {
                  "areaItemTitle": "青竹湖"
                }
              ]
            }, {
              "typeAreaListItemName": "芙蓉",
              "price": 0.7,
              "areaList": [{
                  "areaItemTitle": "不限"
                },
                {
                  "areaItemTitle": "望城区"
                },
                {
                  "areaItemTitle": "金星北"
                },
                {
                  "areaItemTitle": "雷锋镇"
                },
                {
                  "areaItemTitle": "青竹湖"
                }
              ]
            }]
          },
          {
            "typeAreaName": "城市周边",
            "typeAreaList": {
              "typeAreaListItemName": "湘潭"
            }
          }
        ]
      }

    ],

    listData: []
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
      key: 'programType',
      success: function(resp) {
        wx.getStorage({
          key: 'searchValue',
          success: function(ress) {
            if (ress.data == undefined) {
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
            } else {
              wx.request({
                url: 'https://www.cslouwailou.com/api/house/list/title',
                method: 'get',
                header: {
                  'content-type': 'application/json' // 默认值
                },
                data: {
                  programType: resp.data,
                  searchValueUserTitle: ress.data,
                  searchValueConsultantTitle: ress.data,
                  searchValueHouseContent: ress.data
                },
                success: function(resss) {
                  console.log('99999999999999', resss.data)
                  that.setData({
                    testList: resss.data,
                    searchValue: ress.data
                  })
                  if (resss.data.length == 0) {
                    wx.showToast({
                      icon: "none",
                      title: "没有数据"
                    })
                  }
                }
              })
              console.log(ress.data == undefined)
            }
          }
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

  },

  toFilter: function(e) {
    wx.navigateTo({
      url: '../filter/filter'
    })
  },

  openAreaFilter: function() {
    var that = this;
    wx.request({
      url: 'https://www.cslouwailou.com/api/p/one',
      method: 'get',
      success(res) {
        console.log(res.data.programAreaFilterTypeList.programAreaFilterTypeItems)
        that.setData({
          listData: res.data.programAreaFilterTypeList.programAreaFilterTypeItems
        })
        console.log(res.data)
      }
    })
    this.setData({
      isOpenAreaFilter: true,
      isScrollValue: false
    })
  }
})