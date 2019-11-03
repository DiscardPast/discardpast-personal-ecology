package com.discardpast.louwailou.mapper;

import com.discardpast.louwailou.domain.Project;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author discardpast@yeah.net
 * @apiNote 项目信息表(Project)表数据库访问层
 * @since  2019-10-15 12:41:26
 */
@Mapper
public interface ProjectMapper extends BaseMapper<Project> {


    /**
     * 通过UserId查询项目信息表
     *
     * @param userId
     * @return
     */
     List<Project> selectProjectByUserId(Long userId);

}
