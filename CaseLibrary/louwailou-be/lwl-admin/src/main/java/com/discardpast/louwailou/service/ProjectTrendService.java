package com.discardpast.louwailou.service;

import com.discardpast.louwailou.domain.ProjectTrend;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 项目动态信息表(ProjectTrend)服务接口
 * @since 2019-10-15 12:41:26
 */
@Service
public interface ProjectTrendService {

    /**
     * 通过id查询一条项目动态信息表数据
     * @param id
     * @return
     */
     ProjectTrend queryById(Long id);

    /**
     * 通过UserId查询一条项目动态信息表数据
     *
     * @param projectId
     * @return
     */
     List<ProjectTrend> queryProjectTrendListByProjectId(Long projectId);


    /**
     * 插入一条项目动态信息表数据
     * @param projectTrend
     * @return
     */
     Integer addProjectTrend(ProjectTrend projectTrend);

    /**
     * 更新一条项目动态信息表数据
     * @param projectTrend
     * @return
     */
     Integer updateProjectTrend(ProjectTrend projectTrend);

    /**
     * 移除一条项目动态信息表数据
     * @param id
     * @return
     */
     Integer deleteProjectTrendById(Long id);
}
