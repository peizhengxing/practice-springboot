package cn.chapter.es.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.chapter.es.service.IVideoService;


@RestController
public class VideoESController {
	
	@Autowired
    private IVideoService videoService;

	@RequestMapping(value="/search")
	public Object getVideoList(@RequestParam(defaultValue="",required=false) String keywrods){
		Map<String,Object> params = new HashMap<>();
		params.put("page", 1);
		params.put("size", 10);
		if(StringUtils.isNotEmpty(keywrods)){
			params.put("keywords", keywrods);
		}
		return videoService.getVideoList(params);
	}
}
