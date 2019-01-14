// pages/component/search_box/search_box.js
Component({

  options: {
    addGlobalClass: true,
  },
  /**
   * 组件的属性列表
   */
  properties: {
    searchValue: String
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
    onLoad: function (e) {
      this.data.searchValue
    },
    searchButton: function () {
      wx.navigateTo({
        url: '../program_list/program_list',
      })
    },
    getSearchValue: function (e) {
      wx.setStorage({
        key: 'searchValue',
        data: e.detail.value
      })
    }
  }
})