// pages/components/comment_input/comment_input.js
var commentText;

Component({
  options: {
    addGlobalClass: true,
  },
  /**
   * 组件的属性列表
   */
  properties: {

  },

  /**
   * 组件的初始数据
   */
  data: {
  },

  /**
   * 组件的方法列表
   */
  methods: {
    
    getCommentText:function(e) {
      commentText = e.detail.value;
    },
    
    publishComment:function(){
      wx.getStorage({
        key: 'houseId',
        success: function(res) {
          console.log(res)
          wx.request({
            url: 'https://www.cslouwailou.com/api/house/id', // 仅为示例，并非真实的接口地址
            header: {
              'content-type': 'application/json' // 默认值
            },
            data: {
              houseId: res.data
            },
            success(ress) {
              console.log( "<<=========house==========>>",ress.data)
              wx.getStorage({
                key: 'userKey',
                success: function(resss) {
                  console.log(resss)
                  wx.request({
                    url: 'https://www.cslouwailou.com/api/user/userKey',
                    method: 'get',
                    data: {
                      userKey: resss.data
                    },
                    success(ressss){
                      console.log("<<=========user==========>>", ressss.data)
                      wx.request({
                        url: 'https://www.cslouwailou.com/api/house/add/comment',
                        method: 'post',
                        data: {
                          user: ressss.data,
                          house: ress.data,
                          commentText: commentText
                        },
                        success(resssss){
                          console.log(resssss.data)
                        }
                      })
                    }
                  })
                },
              })
            }
          })
        },
      })
    }
  }
})
