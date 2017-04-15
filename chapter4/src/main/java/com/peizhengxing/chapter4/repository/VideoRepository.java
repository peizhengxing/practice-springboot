package com.peizhengxing.chapter4.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.peizhengxing.chapter4.domain.Video;

public interface VideoRepository extends MongoRepository<Video, String>,VideoRepositoryCustom{

	List<Video> findVideoByTitle(String title);
}
