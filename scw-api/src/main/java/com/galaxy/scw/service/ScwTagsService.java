package com.galaxy.scw.service;

import com.galaxy.scw.entity.ScwTags;
import java.util.List;

/**
 * (ScwTags)表服务接口
 *
 * @author makejava
 * @since 2020-07-04 23:16:07
 */
public interface ScwTagsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ScwTags queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ScwTags> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param scwTags 实例对象
     * @return 实例对象
     */
    ScwTags insert(ScwTags scwTags);

    /**
     * 修改数据
     *
     * @param scwTags 实例对象
     * @return 实例对象
     */
    ScwTags update(ScwTags scwTags);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}