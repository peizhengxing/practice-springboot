package cn.chapter.es.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import cn.chapter.es.domain.Video;

public interface VideoRepository extends ElasticsearchRepository<Video, Long> {

}
