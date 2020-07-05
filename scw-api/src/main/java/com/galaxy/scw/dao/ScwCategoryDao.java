package com.galaxy.scw.dao;

import com.galaxy.scw.entity.ScwCategory;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ScwCategory)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-04 23:15:33
 */
public interface ScwCategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ScwCategory queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ScwCategory> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param scwCategory 实例对象
     * @return 对象列表
     */
    List<ScwCategory> queryAll(ScwCategory scwCategory);

    /**
     * 新增数据
     *
     * @param scwCategory 实例对象
     * @return 影响行数
     */
    int insert(ScwCategory scwCategory);

    /**
     * 修改数据
     *
     * @param scwCategory 实例对象
     * @return 影响行数
     */
    int update(ScwCategory scwCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}