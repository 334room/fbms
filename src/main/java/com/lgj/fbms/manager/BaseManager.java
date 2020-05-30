package com.lgj.fbms.manager;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.dozer.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/19 21:03
 * @description：基础管理接口
 * @modified By：
 * @version: 1.0
 */

public class BaseManager<Mapper extends BaseMapper<T>, T> {

    @Autowired
    protected Mapper mapper;

    private IService<T> service = new ServiceImpl<Mapper, T>();

    public int insertOne(T entity) {
        return mapper.insert(entity);
    }


    public int batchInsert(Collection<T> entityList) {
        if (this.batchSave(entityList)) {
            return entityList.size();
        }
        return 0;
    }

    public boolean save(T entity) {
        return service.save(entity);
    }

    public boolean batchSave(Collection<T> entityList) {
        return service.saveBatch(entityList);
    }

    public int delete(Wrapper<T> wrapper) {
        return mapper.delete(wrapper);
    }

    public int deleteById(Serializable id) {
        return mapper.deleteById(id);
    }

    public int batchDeleteByIds(Collection<? extends Serializable> ids) {
        return mapper.deleteBatchIds(ids);
    }

    public boolean remove(Wrapper<T> wrapper) {
        return service.remove(wrapper);
    }

    public boolean removeById(Serializable id) {
        return service.removeById(id);
    }

    public boolean batchRemoveByIds(Collection<? extends Serializable> ids) {
        return service.removeByIds(ids);
    }

    public int update(T entity, Wrapper<T> wrapper) {
        return mapper.update(entity, wrapper);
    }

    public int updateById(T entity) {
        return mapper.updateById(entity);
    }

    public int batchUpdateById(Collection<T> entityList) {
        if (service.updateBatchById(entityList)) {
            return entityList.size();
        }
        return 0;
    }


    public boolean replace(T entity, Wrapper<T> wrapper) {
        return service.update(entity, wrapper);
    }

    public boolean replaceById(T entity) {
        return service.updateById(entity);
    }

    public boolean batchReplaceById(Collection<T> entityList) {
        return service.updateBatchById(entityList);
    }

    public T selectOne(Serializable id) {
        return mapper.selectById(id);
    }

    public List<T> batchSelectByIds(Collection<? extends Serializable> idList) {
        return mapper.selectBatchIds(idList);
    }

}
