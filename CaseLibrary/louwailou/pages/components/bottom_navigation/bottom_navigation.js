// pages/component/buttom_navigation/buttom_navigation.js
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
    toHome: function(e) {
      wx.reLaunch({
        url: '../../pages/index/index'
      })
    },
    toPersonalCenter: function(e) {
      wx.navigateTo({
        url: '../../pages/personal_center/personal_center',
      })
    },
    toProgramList: function(e) {
      wx.navigateTo({
        url: '../../pages/program_list/program_list',
      })
    }
  }
})