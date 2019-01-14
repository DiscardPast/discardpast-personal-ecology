// pages/component/hot_program_item/hot_program_item.js
Component({
  options: {
    addGlobalClass: true,
  },
  /**
   * 组件的属性列表
   */
  properties: {
    testList: Array
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
    onLoad: function () {
      this.data.testList
    }, 
    toCommodityDetails: function (e) {
      wx.setStorage({
        key: 'houseId',
        data: e.currentTarget.dataset.id
      })
      wx.navigateTo({
        url: '../../pages/commodity_details/commodity_details?commodityId=' + e.currentTarget.dataset.commodityid
      })
    }
  }
})
