package com.galaxy.scw.service;

import com.galaxy.scw.entity.ScwPrivilege;
import java.util.List;

/**
 * (ScwPrivilege)表服务接口
 *
 * @author makejava
 * @since 2020-07-04 23:15:48
 */
public interface ScwPrivilegeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ScwPrivilege queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ScwPrivilege> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param scwPrivilege 实例对象
     * @return 实例对象
     */
    ScwPrivilege insert(ScwPrivilege scwPrivilege);

    /**
     * 修改数据
     *
     * @param scwPrivilege 实例对象
     * @return 实例对象
     */
    ScwPrivilege update(ScwPrivilege scwPrivilege);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}