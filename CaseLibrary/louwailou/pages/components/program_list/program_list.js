// components/component-tag-name.js
Component({
  options: {
    addGlobalClass: true,
    
  },
  /**
   * 组件的属性列表
   */
  properties: {
    testList: Array,
    isUser: Boolean
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
    onLoad: function() {
      this.data.testList
      this.data.isUser
    },
    toProgramDetails: function(e) {
      wx.setStorage({
        key: 'houseId',
        data: e.currentTarget.dataset.id
      })
      wx.navigateTo({
        url: '../../pages/program_details/program_details'
      })
    }
  }
})