// pages/components/filter_item/filter_item.js
Component({
  options: {
    addGlobalClass: true,
  },
  /**
   * 组件的属性列表
   */
  properties: {
    testList: Array,
    testTitle: String
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
      this.data.testTitle
    },
  }
})