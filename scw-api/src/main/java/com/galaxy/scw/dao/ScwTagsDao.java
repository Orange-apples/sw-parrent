package com.galaxy.scw.dao;

import com.galaxy.scw.entity.ScwTags;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ScwTags)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-04 23:16:07
 */
public interface ScwTagsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ScwTags queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ScwTags> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param scwTags 实例对象
     * @return 对象列表
     */
    List<ScwTags> queryAll(ScwTags scwTags);

    /**
     * 新增数据
     *
     * @param scwTags 实例对象
     * @return 影响行数
     */
    int insert(ScwTags scwTags);

    /**
     * 修改数据
     *
     * @param scwTags 实例对象
     * @return 影响行数
     */
    int update(ScwTags scwTags);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}