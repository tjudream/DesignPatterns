package com.tjudream.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 * 使用容器实现单例模式
 * Created by mengxiansen on 2018-11-26 16:31
 *
 * @author mengxs@lenovocloud.com
 */
public class Singleton7 {
    private static Map<String, Object> objectMap = new HashMap<>();
    private Singleton7() {

    }

    public static void registerService(String key, Object instance) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, instance);
        }
    }

    public static Object getService(String key) {
        return objectMap.get(key);
    }
}
