package com.discardpast.louwailou.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.discardpast.louwailou.base.domain.DataEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @apiNote 房屋信息表(House)实体类
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_house")
@ApiModel(value = "House",description = "房屋信息表")
public class House extends DataEntity {

    /** 所属项目id */
    @TableField(value="project_id")
    @ApiModelProperty(name="projectId",value = "所属项目id")
    private Long projectId;

    /** 房屋面积 */
    @TableField(value="area")
    @ApiModelProperty(name="area",value = "房屋面积")
    private String area;

    /** 房屋价格 */
    @TableField(value="price")
    @ApiModelProperty(name="price",value = "房屋价格")
    private Long price;

    /** 房屋类型(1公寓 2住宅 3商铺) */
    @TableField(value="types")
    @ApiModelProperty(name="types",value = "房屋类型(1公寓 2住宅 3商铺)")
    private Integer types;

    /** 房屋结构 */
    @TableField(value="structure")
    @ApiModelProperty(name="structure",value = "房屋结构")
    private Integer structure;

    /** 房屋地址 */
    @TableField(value="address")
    @ApiModelProperty(name="address",value = "房屋地址")
    private String address;

    /** 开盘时间 */
    @TableField(value="open_time")
    @ApiModelProperty(name="openTime",value = "开盘时间")
    private Date openTime;

    /** 房屋所在区域 */
    @TableField(value="beat")
    @ApiModelProperty(name="beat",value = "房屋所在区域")
    private String beat;

    /** 房屋标题 */
    @TableField(value="title")
    @ApiModelProperty(name="title",value = "房屋标题")
    private String title;

    /** 房屋信息 */
    @TableField(value="content")
    @ApiModelProperty(name="content",value = "房屋信息")
    private String content;

    /** 房屋赏金 */
    @TableField(value="bouns")
    @ApiModelProperty(name="bouns",value = "房屋赏金")
    private Long bouns;

    /** 房屋标识(临地铁...等等) */
    @TableField(value="tips")
    @ApiModelProperty(name="tips",value = "房屋标识(临地铁...等等)")
    private String tips;


}
