package com.galaxy.scw.dao;

import com.galaxy.scw.entity.ScwAccount;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ScwAccount)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-04 23:14:24
 */
public interface ScwAccountDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ScwAccount queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ScwAccount> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param scwAccount 实例对象
     * @return 对象列表
     */
    List<ScwAccount> queryAll(ScwAccount scwAccount);

    /**
     * 新增数据
     *
     * @param scwAccount 实例对象
     * @return 影响行数
     */
    int insert(ScwAccount scwAccount);

    /**
     * 修改数据
     *
     * @param scwAccount 实例对象
     * @return 影响行数
     */
    int update(ScwAccount scwAccount);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    List<ScwAccount> list();
}