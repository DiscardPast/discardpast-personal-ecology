// pages/component/button_list/button_list.js
Component({
  options: {
    addGlobalClass: true,
  },
  /**
   * 组件的属性列表
   */
  properties: {
    buttonslist:Array
  },

  /**
   * 组件的初始数据
   */
  data: {
    index: 0,
    key: 0
  },

  /**
   * 组件的方法列表
   */
  methods: {
    onLoad: function () {
      this.data.buttonslist
    },
    clickButton:function(e){
      console.log(e);
      var curIdx = e.currentTarget.dataset.index;
      this.setData({
        key: curIdx
      })
    }
  }
})
