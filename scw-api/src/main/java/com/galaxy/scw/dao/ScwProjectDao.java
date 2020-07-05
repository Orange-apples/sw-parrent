package com.galaxy.scw.dao;

import com.galaxy.scw.entity.ScwProject;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ScwProject)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-04 23:15:57
 */
public interface ScwProjectDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ScwProject queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ScwProject> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param scwProject 实例对象
     * @return 对象列表
     */
    List<ScwProject> queryAll(ScwProject scwProject);

    /**
     * 新增数据
     *
     * @param scwProject 实例对象
     * @return 影响行数
     */
    int insert(ScwProject scwProject);

    /**
     * 修改数据
     *
     * @param scwProject 实例对象
     * @return 影响行数
     */
    int update(ScwProject scwProject);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}