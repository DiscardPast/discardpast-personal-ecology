// pages/component/index_search_box/index_search_box.js
var programType = 'APARTMENT';
var searchValue;

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
    isApartMent: true,
    isHouse: false,
    isShop: false,
  },

  /**
   * 组件的方法列表
   */
  methods: {
    ClickApartment: function () {
      this.setData({
        isApartMent: true,
        isHouse: false,
        isShop: false
      })
      programType = 'APARTMENT';
    },
    ClickShop: function () {
      this.setData({
        isApartMent: false,
        isHouse: false,
        isShop: true
      })
      programType = 'SHOP';
    },
    ClickHouse: function () {
      this.setData({
        isApartMent: false,
        isHouse: true,
        isShop: false
      })
      programType = 'RESIDENCE';
    },
    toProgramList: function () {
      console.log(programType)
      console.log(searchValue)
      wx.setStorage({
        key: 'programType',
        data: programType
      })
      wx.setStorage({
        key: 'searchValue',
        data: searchValue
      })
      wx.navigateTo({
        url: '../program_list/program_list',
      })
    },
    getInputValue: function(e) {
      searchValue = e.detail.value;
    }
  }
})
