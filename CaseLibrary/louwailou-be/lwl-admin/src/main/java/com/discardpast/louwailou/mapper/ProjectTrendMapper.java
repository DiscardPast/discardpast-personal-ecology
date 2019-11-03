package com.discardpast.louwailou.mapper;

import com.discardpast.louwailou.domain.ProjectTrend;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author discardpast@yeah.net
 * @apiNote 项目动态信息表(ProjectTrend)表数据库访问层
 * @since  2019-10-15 12:41:26
 */
@Mapper
public interface ProjectTrendMapper extends BaseMapper<ProjectTrend> {


    /**
     * 通过UserId查询项目动态信息表
     *
     * @param projectId
     * @return
     */
     List<ProjectTrend> selectProjectTrendsByProjectId(Long projectId);

}
