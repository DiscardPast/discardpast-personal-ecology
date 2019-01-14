// pages/components/filter_submit/filter_submit.js
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
    Cancel:function(e) {
      wx.navigateBack({
        url: '../program_list/program_list'
      })
    },
    Determine: function (e) {
      wx.navigateBack({
        url: '../program_list/program_list'
      })
    }
  }
})
