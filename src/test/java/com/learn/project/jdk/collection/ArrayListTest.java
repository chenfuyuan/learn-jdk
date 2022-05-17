package com.learn.project.jdk.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO(这里用一句话描述这个类的作用)
 *
 * @author chenfuyuan
 * @date 2022/5/15 16:42
 */
public class ArrayListTest {

    @Test
    public void testEmptyConstructor() {
        ArrayList<String> list = new ArrayList<>();
        //new ArrayList 会赋值初始elementData
        //this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
        //当add(item)时，初次判断数组为空,扩容为DEFAULT_CAPACITY
        for (int i = 0; i < 10; i++) {
            list.add(i + "");
        }
        //扩容 elementData.size + elementData.size >> 1
        list.add("10");
    }

    @Test
    public void testSetCapacityConstructor() {
        ArrayList<String> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list.add(i+"");
        }
        list.add(5+"");
        System.out.println(list.toArray());
        list.remove("5");
    }

    @Test
    public void testSetCollectionConstructor() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b"));
        list.add("c");
    }
}
