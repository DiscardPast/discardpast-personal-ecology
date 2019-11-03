package com.discardpast.louwailou.service.impl;

import com.discardpast.louwailou.domain.ProjectTrend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discardpast.louwailou.service.ProjectTrendService;
import com.discardpast.louwailou.mapper.ProjectTrendMapper;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 项目动态信息表(ProjectTrend)服务实现类
 * @since 2019-10-15 12:41:26
 */
@Service
public class ProjectTrendServiceImpl implements ProjectTrendService {

    @Autowired
    private ProjectTrendMapper projectTrendMapper;

    @Override
    public ProjectTrend queryById(Long id) {
        return this.projectTrendMapper.selectById(id);
    }

    @Override
    public List<ProjectTrend> queryProjectTrendListByProjectId(Long projectId) {
        return this.projectTrendMapper.selectProjectTrendsByProjectId();
    }

    @Override
    public Integer addProjectTrend(ProjectTrend projectTrend) {
        return this.projectTrendMapper.insert(projectTrend);
    }

    @Override
    public Integer updateProjectTrend(ProjectTrend projectTrend) {
        return this.projectTrendMapper.updateById(projectTrend);
    }

    @Override
    public Integer deleteProjectTrendById(Long id) {
        return this.projectTrendMapper.deleteById(id);
    }
}
