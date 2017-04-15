package com.peizhengxing.chapter4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peizhengxing.chapter4.domain.Video;
import com.peizhengxing.chapter4.repository.VideoRepository;

@Service
public class VideosService {

	@Autowired
	private VideoRepository videoRepository;
	
	public List<Video> getVideos(String name){
		return videoRepository.findVideoByTitle("异位妊娠腹腔镜手术");
	}
}
