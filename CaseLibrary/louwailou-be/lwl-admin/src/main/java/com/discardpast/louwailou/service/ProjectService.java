package com.discardpast.louwailou.service;

import com.discardpast.louwailou.domain.Project;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 项目信息表(Project)服务接口
 * @since 2019-10-15 12:41:26
 */
@Service
public interface ProjectService {

    /**
     * 通过id查询一条项目信息表数据
     * @param id
     * @return
     */
     Project queryById(Long id);

    /**
     * 查询所有用户数据
     *
     * @return
     */
     List<Project> queryProjectList();

    /**
     * 通过UserId查询一条项目信息表数据
     *
     * @param userId
     * @return
     */
     List<Project> queryProjectByHouseId(Long userId);


    /**
     * 插入一条项目信息表数据
     * @param project
     * @return
     */
     Integer addProject(Project project);

    /**
     * 更新一条项目信息表数据
     * @param project
     * @return
     */
     Integer updateProject(Project project);

    /**
     * 移除一条项目信息表数据
     * @param id
     * @return
     */
     Integer deleteProjectById(Long id);
}
