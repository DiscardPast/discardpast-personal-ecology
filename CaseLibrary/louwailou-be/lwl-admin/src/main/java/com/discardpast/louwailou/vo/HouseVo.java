package com.discardpast.louwailou.vo;

import lombok.Data;
import java.util.Date;
import java.util.List;

/**
 * 房屋信息vo
 *
 * @author discardpast@yeah.net
 */
@Data
public class HouseVo {

    /** 房屋面积 */
    private String area;

    /** 房屋价格 */
    private Long price;

    /** 房屋类型(1公寓 2住宅 3商铺) */
    private Integer types;

    /** 房屋结构 */
    private Integer structure;

    /** 房屋地址 */
    private String address;

    /** 开盘时间 */
    private Date openTime;

    /** 房屋所在区域 */
    private String beat;

    /** 房屋标题 */
    private String title;

    /** 房屋置业顾问所见标题 */
    private String consultantTitle;

    /** 房屋信息 */
    private String content;

    /** 房屋赏金 */
    private Long bouns;

    /** 房屋标识(临地铁...等等) */
    private String tips;

    /** 房屋图片地址列表 */
    private List<String> imageUrlList;

    /** 房屋户型 */
    private List<HouseApartmentVo> houseApartmentVoList;

    /** 房屋所属项目信息 */
    private ProjectVo projectVo;

    /** 房屋所有评论信息*/
    private List<HouseCommentVo> houseCommentVoList;
}
