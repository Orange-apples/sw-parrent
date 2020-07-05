package com.galaxy.scw.service;

import com.galaxy.scw.entity.ScwRole;
import java.util.List;

/**
 * (ScwRole)表服务接口
 *
 * @author makejava
 * @since 2020-07-04 23:14:47
 */
public interface ScwRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ScwRole queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ScwRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param scwRole 实例对象
     * @return 实例对象
     */
    ScwRole insert(ScwRole scwRole);

    /**
     * 修改数据
     *
     * @param scwRole 实例对象
     * @return 实例对象
     */
    ScwRole update(ScwRole scwRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}