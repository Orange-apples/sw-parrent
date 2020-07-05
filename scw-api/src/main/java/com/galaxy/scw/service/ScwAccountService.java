package com.galaxy.scw.service;

import com.galaxy.scw.entity.ScwAccount;
import java.util.List;

/**
 * (ScwAccount)表服务接口
 *
 * @author makejava
 * @since 2020-07-04 23:14:26
 */
public interface ScwAccountService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ScwAccount queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ScwAccount> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param scwAccount 实例对象
     * @return 实例对象
     */
    ScwAccount insert(ScwAccount scwAccount);

    /**
     * 修改数据
     *
     * @param scwAccount 实例对象
     * @return 实例对象
     */
    ScwAccount update(ScwAccount scwAccount);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    List<ScwAccount> list();
}