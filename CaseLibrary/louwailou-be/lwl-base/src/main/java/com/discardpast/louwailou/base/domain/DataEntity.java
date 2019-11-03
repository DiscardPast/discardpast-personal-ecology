package com.discardpast.louwailou.base.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * 基类
 *
 * @author discardpast@yeah.net
 * @since 2019/10/03 18:47
 */
@Data
public class DataEntity implements Serializable {

    private static final long serialVersionUID = -9028858322088766666L;

    /**
     * 自增id
     */
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(name = "id", value = "自增id")
    private Long id;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(name = "createTime", value = "创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @ApiModelProperty(name = "updateTime", value = "更新时间")
    private Date updateTime;

    /**
     * 删除标识
     */
    @TableField(value = "deleted")
    @TableLogic
    @ApiModelProperty(name = "deleted", value = "删除标识")
    private Boolean deleted;

    /**
     * 在列表中根据id查找对象
     */
    public static <T extends DataEntity> T queryById(List<T> list, Long id) {
        if (id != null && list != null && list.size() > 0) {
            for (T t : list) {
                if (t.getId() != null && t.getId().longValue() == id) {
                    return t;
                }
            }
        }
        return null;
    }

    /**
     * 获取Id列表
     */
    public static <T extends DataEntity> List<Long> getIds(List<T> baseEntities) {
        List<Long> ids = new LinkedList<>();
        if (baseEntities != null) {
            for (DataEntity baseEntity : baseEntities) {
                ids.add(baseEntity.getId());
            }
        }
        return ids;
    }

}