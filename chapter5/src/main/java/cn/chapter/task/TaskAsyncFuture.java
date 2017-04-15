package cn.chapter.task;

import java.util.Random;
import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

@Component
public class TaskAsyncFuture {

	 public static Random random = new Random();
		
	    @Async
		public Future<String> taskOne() throws Exception{
			System.out.println("开始第一个异步任务");
			long start = System.currentTimeMillis();
			Thread.sleep(random.nextInt(10000));
			long end = System.currentTimeMillis();
			System.out.println("异步任务一完成耗时：" + (end - start));
			
			return new AsyncResult<String>("新异步任务一完成");
		}
		
	    @Async
		public Future<String> taskTwo() throws Exception{
			System.out.println("开始第二个异步任务");
			long start = System.currentTimeMillis();
			Thread.sleep(random.nextInt(10000));
			long end = System.currentTimeMillis();
			System.out.println("异步任务二完成耗时：" + (end - start));
			return new AsyncResult<String>("新异步任务二完成");
		}
		
	    @Async
		public Future<String> taskThree() throws Exception{
			System.out.println("开始第三个异步任务");
			long start = System.currentTimeMillis();
			Thread.sleep(random.nextInt(10000));
			long end = System.currentTimeMillis();
			System.out.println("异步任务三完成耗时：" + (end - start));
			return new AsyncResult<String>("新异步任务三完成");
		}
}
