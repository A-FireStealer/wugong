package com.atguigu.wugong;

public class Dugujiujian {

	public static void main(String[] args) {
		System.out.println("沧海一声笑");
		System.out.println("滔滔两岸潮");
		System.out.println("无忧无虑看今朝");
		System.out.println("沧海笑！");
		System.out.println("啦啦啦啦！");
		System.out.println("恩怨了");
		System.out.println("都来报！");
		System.out.println("笑藏刀！");
	}

}
package demo.collection;

import java.util.*;

import demo.bean.Book;

/**
 * 此类用于演示使用Collection集合的遍历
 * @author liyuting
 * 
 * 遍历：按一定的路径，依次将元素取出来使用
 *
 * 遍历方式：
 * 1、使用iterator迭代器
 * 2、jdk5.0出现了增强for循环，可以代替iterator迭代器
 * 特点：增强for就是简化版的iterator，本质一样
 * 
 * 只能用于遍历集合或数组
 * 语法：
 * for(元素类型 元素名 :  集合名或数组名){
 * 		访问元素
 * }
 * 
 * 
 */
public class TestCollection3 {
	@SuppressWarnings({"rawtypes", "unchecked" })
	public static void main(String[] args) {
		//1.创建集合对象
		Collection col = new ArrayList();
		
		//2.添加元素
		col.add(new Book("三国演义","罗贯中"));
		col.add(new Book("小李飞刀","古龙"));
		col.add(new Book("红楼梦","曹雪芹"));
		col.add(new Book("十万个为什么","佚名"));
		
		
		//3.遍历
		iterCollection1(col);
	
	}
	/**
	 * 遍历方式一：使用iterator
	 * @param col
	 */
	@SuppressWarnings("rawtypes")
	public static void iterCollection1(Collection col){
		//①获取该集合的迭代器
		Iterator iterator = col.iterator();
		//②进行迭代
		while(iterator.hasNext()){
			Object next = iterator.next();
//			col.remove(new Book("三国演义","罗贯中"));
			
			iterator.remove();
			
			System.out.println(next);
		}
		
	}
	/**
	 * 遍历方式二：使用增强for
	 * @param col
	 */
	public static void iterCollection2(Collection col){
		
		for(Object o: col){
			System.out.println(o);
		}
	}

}
