package cn.chapter.es.service;


import static com.google.common.collect.Lists.newArrayList;

import java.util.List;
import java.util.Map;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cn.chapter.es.domain.Video;
import cn.chapter.es.repository.VideoRepository;


@Service
public class IVideoServiceImpl implements IVideoService {

	private static final Logger log = LoggerFactory.getLogger(IVideoServiceImpl.class);
	
	@Autowired
	private VideoRepository videoDao;
	
	@Override
	public List<Video> getVideoList(Map<String, Object> params) {
		log.info("search params:" + params);
		int page = (int) params.get("page");
		int size = (int) params.get("size");
		QueryBuilder qb = QueryBuilders.boolQuery().must(QueryBuilders.multiMatchQuery(params.get("keywords"), "video_zh_name","keywords"));
		Pageable pageable = new PageRequest(page, size);
		Page<Video> pageVideos = videoDao.search(qb, pageable);
		if(pageVideos == null || pageVideos.getSize() <= 0){
			return null;
		}
		return newArrayList(pageVideos);
	}

}
