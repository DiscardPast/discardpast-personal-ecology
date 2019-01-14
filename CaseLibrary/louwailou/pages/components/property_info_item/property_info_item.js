// pages/components/property_info_item/property_info_item.js
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
    listDataTitle:[
      '开发商',
      '区域',
      '销售状态',
      '产权年限',
      '物业类别',
      '容积率',
      '绿化率',
      '楼栋总户数',
      '物业公司',
      '物业费',
      '装修状况',
      '交房时间',
      '车位'
    ]
  },

  /**
   * 组件的方法列表
   */
  methods: {
    onLoad: function () {
      this.data.listData
    }
  }
})
