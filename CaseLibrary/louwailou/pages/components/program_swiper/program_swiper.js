// pages/component/program_swiper/program_swiper.js
Component({
  options: {
    addGlobalClass: true,
  },
  /**
   * 组件的属性列表
   */
  properties: {
    imgUrls:Array
  },

  /**
   * 组件的初始数据
   */
  data: {
    indicatorDots: true,
    autoplay: true,
    circular: true,
    interval: 5000,
    duration: 1000,
    initialTime: 1.5,
    autoPlay: true,
    muted: false
  },

  /**
   * 组件的方法列表
   */
  methods: {
    onLoad: function () {
      this.data.imgUrls
    },
  }
})