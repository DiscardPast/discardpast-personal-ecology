// pages/component/personal_center/user_center_item/user_center_item.js
Component({
  options: {
    addGlobalClass: true,
  },
  /**
   * 组件的属性列表
   */
  properties: {
    testList: Object
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
    toHangOrder: function () {
      wx.navigateTo({
        url: '../../../../hang_order/hang_order',
      })
    },
    toRecommendClient: function () {
      wx.navigateTo({
        url: '../../../../recommend_client/recommend_client',
      })
    },
    toConsultantBonus: function () {
      wx.navigateTo({
        url: '../../../../consultant_bonus/consultant_bonus',
      })
    },
    toReserve: function () {
      wx.navigateTo({
        url: '../../../../reserve/reserve',
      })
    },
    toClientList: function () {
      wx.navigateTo({
        url: '../../../../client_list/client_list',
      })
    },
    toClientList: function () {
      wx.navigateTo({
        url: '../../../../client_list/client_list',
      })
    },
    toMyAttention: function () {
      wx.navigateTo({
        url: '../../../../interest/interest',
      })
    },
    toFeedback: function () {
      wx.navigateTo({
        url: '../../../../feedback/feedback',
      })
    },
    toIntegrateShop: function () {
      wx.navigateTo({
        url: '../../../../integrate_shop/integrate_shop',
      })
    },
    toCustomerService: function () {
      wx.navigateTo({
        url: '../../../../customer_service/customer_service',
      })
    },
  }
})