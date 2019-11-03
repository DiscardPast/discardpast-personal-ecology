package com.discardpast.louwailou.vo;

import lombok.Data;
import java.util.List;

/**
 * 房屋户型vo
 *
 * @author discardpast@yeah.net
 */

@Data
public class HouseApartmentVo {

    /** 房屋标题 */
    private String title;

    /** 户型图片 */
    private List<String> imageUrlList;

    /** 户型描述 */
    private String text;

}
