package com.galaxy.scw.service;

import com.galaxy.scw.entity.ScwProject;
import java.util.List;

/**
 * (ScwProject)表服务接口
 *
 * @author makejava
 * @since 2020-07-04 23:15:57
 */
public interface ScwProjectService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ScwProject queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ScwProject> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param scwProject 实例对象
     * @return 实例对象
     */
    ScwProject insert(ScwProject scwProject);

    /**
     * 修改数据
     *
     * @param scwProject 实例对象
     * @return 实例对象
     */
    ScwProject update(ScwProject scwProject);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}