package com.galaxy.scw.dao;

import com.galaxy.scw.entity.ScwRole;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ScwRole)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-04 23:14:47
 */
public interface ScwRoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ScwRole queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ScwRole> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param scwRole 实例对象
     * @return 对象列表
     */
    List<ScwRole> queryAll(ScwRole scwRole);

    /**
     * 新增数据
     *
     * @param scwRole 实例对象
     * @return 影响行数
     */
    int insert(ScwRole scwRole);

    /**
     * 修改数据
     *
     * @param scwRole 实例对象
     * @return 影响行数
     */
    int update(ScwRole scwRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}