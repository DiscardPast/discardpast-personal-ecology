package com.discardpast.louwailou.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.discardpast.louwailou.base.domain.DataEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @apiNote 项目动态信息表(ProjectTrend)实体类
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_project_trend")
@ApiModel(value = "ProjectTrend",description = "项目动态信息表")
public class ProjectTrend extends DataEntity {

    /** 项目id */
    @TableField(value="project_id")
    @ApiModelProperty(name="projectId",value = "项目id")
    private String projectId;

    /** 标签 */
    @TableField(value="tip")
    @ApiModelProperty(name="tip",value = "标签")
    private String tip;

    /** 标题 */
    @TableField(value="title")
    @ApiModelProperty(name="title",value = "标题")
    private String title;

    /** 内容 */
    @TableField(value="content")
    @ApiModelProperty(name="content",value = "内容")
    private String content;


}
