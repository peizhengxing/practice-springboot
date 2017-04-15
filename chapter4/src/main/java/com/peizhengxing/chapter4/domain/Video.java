package com.peizhengxing.chapter4.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "videos")
public class Video {

	@Id
	private String id;

	private String typeId;

	private String typePId;

	private String title;

	@Field(value = "engilsh_title")
	private String englishTitle;

	private String language;

	private String[] tags;

	private String[] subspecialty;

	private String[] freeWords;

	private String[] diseaseNames;

	private String level;

	@Field(value = "video_src")
	private String videoSrc;

	@Field(value = "c_url")
	private String courseURL;

	@Field(value = "o_url")
	private String videoURL;

	@Field(value = "pic_src")
	private String img;

	private String detail;

	@Field(value = "click_num")
	private Integer clickNum = 0;

	@Field(value = "collect_num")
	private Integer collectNum = 0;

	@Field(value = "publish_state")
	private Integer publishState = 1;

	private String role = "1";

	private Integer score = 0;

	private String operator;

	private String depart;

	private String lecture;

	@Field(value = "create_time")
	private Date createTime;

	private Integer source = 1;

	private Integer isDeleted = 1;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTypePId() {
		return typePId;
	}

	public void setTypePId(String typePId) {
		this.typePId = typePId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEnglishTitle() {
		return englishTitle;
	}

	public void setEnglishTitle(String englishTitle) {
		this.englishTitle = englishTitle;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public String[] getSubspecialty() {
		return subspecialty;
	}

	public void setSubspecialty(String[] subspecialty) {
		this.subspecialty = subspecialty;
	}

	public String[] getFreeWords() {
		return freeWords;
	}

	public void setFreeWords(String[] freeWords) {
		this.freeWords = freeWords;
	}

	public String[] getDiseaseNames() {
		return diseaseNames;
	}

	public void setDiseaseNames(String[] diseaseNames) {
		this.diseaseNames = diseaseNames;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getVideoSrc() {
		return videoSrc;
	}

	public void setVideoSrc(String videoSrc) {
		this.videoSrc = videoSrc;
	}

	public String getCourseURL() {
		return courseURL;
	}

	public void setCourseURL(String courseURL) {
		this.courseURL = courseURL;
	}

	public String getVideoURL() {
		return videoURL;
	}

	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Integer getClickNum() {
		return clickNum;
	}

	public void setClickNum(Integer clickNum) {
		this.clickNum = clickNum;
	}

	public Integer getCollectNum() {
		return collectNum;
	}

	public void setCollectNum(Integer collectNum) {
		this.collectNum = collectNum;
	}

	public Integer getPublishState() {
		return publishState;
	}

	public void setPublishState(Integer publishState) {
		this.publishState = publishState;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getLecture() {
		return lecture;
	}

	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

}
