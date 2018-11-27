package com.tjudream.designpattern.singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-27 11:06
 *
 * @author mengxs@lenovocloud.com
 */
public class NSingleton {
    private static int maxNumOfSingleton = 3;
    private static List<NSingleton> nSingletonList = Arrays.asList(new NSingleton(), new NSingleton(), new NSingleton());
    private NSingleton() {

    }

    public static NSingleton getInstance(int k) {
        return nSingletonList.get(k);
    }

    public static NSingleton getInstance() {
        Random random = new Random();
        int k = random.nextInt(maxNumOfSingleton);
        return nSingletonList.get(k);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(NSingleton.getInstance().toString());
        }
    }
}
