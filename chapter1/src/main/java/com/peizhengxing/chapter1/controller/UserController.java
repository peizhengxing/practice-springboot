package com.peizhengxing.chapter1.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.peizhengxing.chapter1.domain.User;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/users")
public class UserController {

	static Map<Long,User> users = Collections.synchronizedMap(new HashMap<>());
	
	@ApiOperation(value="获取用户列表",notes="用户列表数据")
	@RequestMapping(value="/",method=RequestMethod.GET)
	public List<User> getUserList(){
		List<User> list = new ArrayList<>(users.values());
		return list;
	}
	
	@ApiOperation(value="添加用户",notes="根据User对象创建用户")
	@ApiImplicitParam(name = "user",value="用户详细信息实体User",required = true,dataType="User",paramType="body")
	@RequestMapping(value="/",method = RequestMethod.POST)
	public String postUser(@RequestBody User user){
		users.put(user.getId(), user);
		return "success";
	}
	
	@ApiOperation(value="获取用户详细信息",notes="根据URL中的ID来指定获取用户详细信息")
	@ApiImplicitParam(name="id",value="用户ID",required = true,dataType="Long",paramType="path")
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public User getUser(@PathVariable Long id){
		if(users.containsKey(id)){
			return users.get(id);
		}
		return null;
	}
	
	@ApiOperation(value="更新用户详细信息",notes="根据url的ID来指定修改用户信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="用户ID",required = true,dataType="Long",paramType="path"),
		@ApiImplicitParam(name="user",value="用户详细修改信息实体User",required = true,dataType="User",paramType="body")
	})
	@RequestMapping(value="/{id}",method = RequestMethod.PUT)
	public String putUser(@PathVariable Long id,@RequestBody User user){
		
		User u = users.get(id);	
		u.setAge(user.getAge());
		u.setName(user.getName());
		users.put(id, u);
		return "success";
	}
	
	@ApiOperation(value="删除用户",notes="根据url的ID指定删除对象")
	@ApiImplicitParam(name="id",value="用户ID",required = true,dataType="Long",paramType="path")
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable Long id){
		users.remove(id);
		return "success";
	}
}
