// pages/components/program_details_bottom_navigation/program_details_bottom_navigation.js
Component({
  options: {
    addGlobalClass: true,
  },
  /**
   * 组件的属性列表
   */
  properties: {},

  /**
   * 组件的初始数据
   */
  data: {

  },

  /**
   * 组件的方法列表
   */
  methods: {
    callPhone: function() {
      wx.makePhoneCall({
        phoneNumber: '1340000' // 仅为示例，并非真实的电话号码
      })
    },
    toCustomerService: function () {
      wx.navigateTo({
        url: '../../../../customer_service/customer_service',
      })
    },
    addUserInterestingHouse: function() {
      wx.getStorage({
        key: 'houseId',
        success: function(resh) {
          wx.getStorage({
            key: 'userKey',
            fail: function(){
              wx.showToast({
                title: '请登录',
                icon: 'none',
                duration: 1000,
                success(e){
                  setTimeout(function(){
                    wx.navigateTo({
                      url: '../../pages/personal_center/personal_center',
                    })
                  },1000)
                }
              })

            },
            success: function(res) {
              
              wx.request({
                url: 'https://www.cslouwailou.com/api/house/id', // 仅为示例，并非真实的接口地址
                header: {
                  'content-type': 'application/json' // 默认值
                },
                data: {
                  houseId: resh.data
                },
                success(rest) {
                  console.log(rest.data)
                  wx.request({
                    url: 'https://www.cslouwailou.com/api/user/add/interesting?userKey=' + res.data,
                    method: 'post',
                    data: rest.data,
                    success(result) {
                      console.log(result)
                      wx.showToast({
                        title: '关注成功',
                        duration: 1000,
                        icon: 'success'
                      })
                    }
                  })
                }
              })
            },
          })
        },
      })
    }
  }
})