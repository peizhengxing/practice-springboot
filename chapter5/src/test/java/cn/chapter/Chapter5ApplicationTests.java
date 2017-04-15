package cn.chapter;

import java.util.concurrent.Future;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.chapter.task.Task;
import cn.chapter.task.TaskAsync;
import cn.chapter.task.TaskAsyncFuture;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Chapter5Application.class)
public class Chapter5ApplicationTests {

	@Autowired
	private Task task;
	
	@Autowired
	private TaskAsync taskAsync;

	@Autowired
	private TaskAsyncFuture taskAsyncFuture;
	
	@Test
	public void test() throws Exception{
		task.taskOne();
		task.taskTwo();
		task.taskThree();
	}
	
	@Test
	public void testAsync() throws Exception{
		taskAsync.taskOne();
		taskAsync.taskTwo();
		taskAsync.taskThree();
	}

	@Test
	public void testAsyncFuture() throws Exception{
		long start = System.currentTimeMillis();
		
		Future<String> task1 = taskAsyncFuture.taskOne();
		Future<String> task2 = taskAsyncFuture.taskTwo();
		Future<String> task3 = taskAsyncFuture.taskThree();
		while(true){
			if(task1.isDone() && task2.isDone() && task3.isDone()){
				break;
			}
			Thread.sleep(1000);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("全部任务完成，总耗时：" + (end - start) + "毫秒");
	}
}
