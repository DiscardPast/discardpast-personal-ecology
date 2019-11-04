package com.discardpast.louwailou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discardpast.louwailou.service.ProjectService;
import com.discardpast.louwailou.mapper.ProjectMapper;
import com.discardpast.louwailou.domain.Project;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 项目信息表(Project)服务实现类
 * @since 2019-10-15 12:41:26
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public Project queryById(Long id) {
        return this.projectMapper.selectById(id);
    }

    @Override
    public List<Project> queryProjectList() {
        return this.projectMapper.selectList(new QueryWrapper<Project>().eq("deleted",0));
    }

    @Override
    public List<Project> queryProjectByHouseId(Long userId) {
        return this.projectMapper.selectProjectByUserId(userId);
    }

    @Override
    public Integer addProject(Project project) {
        return this.projectMapper.insert(project);
    }

    @Override
    public Integer updateProject(Project project) {
        return this.projectMapper.updateById(project);
    }

    @Override
    public Integer deleteProjectById(Long id) {
        return this.projectMapper.deleteById(id);
    }
}
