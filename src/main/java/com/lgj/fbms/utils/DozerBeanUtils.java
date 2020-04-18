package com.lgj.fbms.utils;

import com.google.common.collect.Lists;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/18 17:42
 * @description：类型转换工具类
 * @modified By：
 * @version: 1.0
 */

@Component
public class DozerBeanUtils {

    private static final DozerBeanMapper MAPPER = new DozerBeanMapper();

    public static <T> T map(Object o, Class<T> clazz) {
        return MAPPER.map(o, clazz);
    }

    public static <T, E> List<T> mapList(List<E> list, Class<T> clazz) {
        List<T> tList = Lists.newArrayListWithExpectedSize(list.size());
        for (E entity : list) {
            tList.add(map(entity, clazz));
        }
        return tList;
    }

    public static void map(Object o1, Object o2) {
        MAPPER.map(o1, o2);
    }

}
