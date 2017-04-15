package com.peizhengxing.chapter4.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.peizhengxing.chapter4.service.VideosService;

@RestController
public class VideoController {

	@Autowired
	private VideosService service;
	
	@GetMapping(value="/videos")
	public Object getVideos(@RequestParam(required=false) String name) throws Exception{
		return service.getVideos(name);
	}
}
