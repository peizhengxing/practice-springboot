package cn.chapter.es.service;

import java.util.List;
import java.util.Map;

import cn.chapter.es.domain.Video;


public interface IVideoService {

	List<Video> getVideoList(Map<String,Object> params);
}
