// pages/components/program_list_filter/program_list_filter.js
Component({
  options: {
    addGlobalClass: true,

  },
  /**
   * 组件的属性列表
   */
  properties: {
    listData:Array
  },

  /**
   * 组件的初始数据
   */
  data: {
    items: [
      { name: 'USA', value: '美国' },
      { name: 'CHN', value: '中国', checked: 'true' },
      { name: 'BRA', value: '巴西' },
      { name: 'JPN', value: '日本' },
      { name: 'ENG', value: '英国' },
      { name: 'TUR', value: '法国' },
      { name: 'JPN', value: '日本' },
      { name: 'ENG', value: '英国' },
      { name: 'TUR', value: '法国' },
      { name: 'JPN', value: '日本' },
      { name: 'ENG', value: '英国' },
      { name: 'TUR', value: '法国' },
    ],
    isCancleChoose:true
  },

  /**
   * 组件的方法列表
   */
  methods: {
    onLoad: function () {
      this.data.listData
    },
    cancleChoose:function() {
      this.setData({
        isCancleChoose:false
      })
    }
  }
})
