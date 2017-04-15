package cn.chapter.task;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Task {

	public static Random random = new Random();
	
	public void taskOne() throws Exception{
		System.out.println("开始第一个任务");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("任务一完成耗时：" + (end - start));
	}
	
	public void taskTwo() throws Exception{
		System.out.println("开始第二个任务");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("任务二完成耗时：" + (end - start));
	}
	
	public void taskThree() throws Exception{
		System.out.println("开始第三个任务");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("任务三完成耗时：" + (end - start));
	}
}
