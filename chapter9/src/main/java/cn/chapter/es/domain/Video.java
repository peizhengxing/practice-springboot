package cn.chapter.es.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexStoreType="video", indexName = "videoes")
public class Video {

	@Id
	private long id;//主键ID
	private long category;//分类ID
	private String videoZHName;//视频中文名称
	private String videoENName;//视频英文名称
	private String lecture;//视频讲师
	private long expertId; //专家主键ID
	private int copyrightType = 0;//视频版权
	private String sponsoredEnterprise;//视频赞助企业
	private String introduction;//视频简介
	private String img;//视频图片
	private Date recordTime;//视频记录时间
	private String remark;//视频备注
	private int publishState = 1;//视频发布状态 1 草稿 2 退稿 3 通过
	private Date publishTime;//发布时间
	private Date createTime;//创建时间
	private Date updateTime;//修改时间
	private String grade;//视频级别
	private String keywords;//关键字
	private String subspecialty;//亚专业
	private String diseaseNames;//疾病名称
	private String diseaseClass; // 疾病分类
	private String subDiseaseClass;//疾病分类子类
	private String freeWords;//自由词
	private String oldMongoId;//主要用于查询方便 生成一个ID
	private int isVIP = 2;//是否为VIP 2 否 1 是
	private double fee = 0D;//是否收费 大于0 为收费
	private int integral = 0;//是否为积分视频 大于0 为积分视频
    private int fakePlayNum = 0;//虚拟播放次数
    private int playNum = 0; //播放次数
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the category
	 */
	public long getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(long category) {
		this.category = category;
	}
	/**
	 * @return the videoZHName
	 */
	public String getVideoZHName() {
		return videoZHName;
	}
	/**
	 * @param videoZHName the videoZHName to set
	 */
	public void setVideoZHName(String videoZHName) {
		this.videoZHName = videoZHName;
	}
	/**
	 * @return the videoENName
	 */
	public String getVideoENName() {
		return videoENName;
	}
	/**
	 * @param videoENName the videoENName to set
	 */
	public void setVideoENName(String videoENName) {
		this.videoENName = videoENName;
	}
	/**
	 * @return the lecture
	 */
	public String getLecture() {
		return lecture;
	}
	/**
	 * @param lecture the lecture to set
	 */
	public void setLecture(String lecture) {
		this.lecture = lecture;
	}
	/**
	 * @return the expertId
	 */
	public long getExpertId() {
		return expertId;
	}
	/**
	 * @param expertId the expertId to set
	 */
	public void setExpertId(long expertId) {
		this.expertId = expertId;
	}
	/**
	 * @return the copyrightType
	 */
	public int getCopyrightType() {
		return copyrightType;
	}
	/**
	 * @param copyrightType the copyrightType to set
	 */
	public void setCopyrightType(int copyrightType) {
		this.copyrightType = copyrightType;
	}
	/**
	 * @return the sponsoredEnterprise
	 */
	public String getSponsoredEnterprise() {
		return sponsoredEnterprise;
	}
	/**
	 * @param sponsoredEnterprise the sponsoredEnterprise to set
	 */
	public void setSponsoredEnterprise(String sponsoredEnterprise) {
		this.sponsoredEnterprise = sponsoredEnterprise;
	}
	/**
	 * @return the introduction
	 */
	public String getIntroduction() {
		return introduction;
	}
	/**
	 * @param introduction the introduction to set
	 */
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	/**
	 * @return the img
	 */
	public String getImg() {
		return img;
	}
	/**
	 * @param img the img to set
	 */
	public void setImg(String img) {
		this.img = img;
	}
	/**
	 * @return the recordTime
	 */
	public Date getRecordTime() {
		return recordTime;
	}
	/**
	 * @param recordTime the recordTime to set
	 */
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @return the publishState
	 */
	public int getPublishState() {
		return publishState;
	}
	/**
	 * @param publishState the publishState to set
	 */
	public void setPublishState(int publishState) {
		this.publishState = publishState;
	}
	/**
	 * @return the publishTime
	 */
	public Date getPublishTime() {
		return publishTime;
	}
	/**
	 * @param publishTime the publishTime to set
	 */
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/**
	 * @return the keywords
	 */
	public String getKeywords() {
		return keywords;
	}
	/**
	 * @param keywords the keywords to set
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	/**
	 * @return the subspecialty
	 */
	public String getSubspecialty() {
		return subspecialty;
	}
	/**
	 * @param subspecialty the subspecialty to set
	 */
	public void setSubspecialty(String subspecialty) {
		this.subspecialty = subspecialty;
	}
	/**
	 * @return the diseaseNames
	 */
	public String getDiseaseNames() {
		return diseaseNames;
	}
	/**
	 * @param diseaseNames the diseaseNames to set
	 */
	public void setDiseaseNames(String diseaseNames) {
		this.diseaseNames = diseaseNames;
	}
	/**
	 * @return the diseaseClass
	 */
	public String getDiseaseClass() {
		return diseaseClass;
	}
	/**
	 * @param diseaseClass the diseaseClass to set
	 */
	public void setDiseaseClass(String diseaseClass) {
		this.diseaseClass = diseaseClass;
	}
	/**
	 * @return the subDiseaseClass
	 */
	public String getSubDiseaseClass() {
		return subDiseaseClass;
	}
	/**
	 * @param subDiseaseClass the subDiseaseClass to set
	 */
	public void setSubDiseaseClass(String subDiseaseClass) {
		this.subDiseaseClass = subDiseaseClass;
	}
	/**
	 * @return the freeWords
	 */
	public String getFreeWords() {
		return freeWords;
	}
	/**
	 * @param freeWords the freeWords to set
	 */
	public void setFreeWords(String freeWords) {
		this.freeWords = freeWords;
	}
	/**
	 * @return the oldMongoId
	 */
	public String getOldMongoId() {
		return oldMongoId;
	}
	/**
	 * @param oldMongoId the oldMongoId to set
	 */
	public void setOldMongoId(String oldMongoId) {
		this.oldMongoId = oldMongoId;
	}
	/**
	 * @return the isVIP
	 */
	public int getIsVIP() {
		return isVIP;
	}
	/**
	 * @param isVIP the isVIP to set
	 */
	public void setIsVIP(int isVIP) {
		this.isVIP = isVIP;
	}
	/**
	 * @return the fee
	 */
	public double getFee() {
		return fee;
	}
	/**
	 * @param fee the fee to set
	 */
	public void setFee(double fee) {
		this.fee = fee;
	}
	/**
	 * @return the integral
	 */
	public int getIntegral() {
		return integral;
	}
	/**
	 * @param integral the integral to set
	 */
	public void setIntegral(int integral) {
		this.integral = integral;
	}
	/**
	 * @return the fakePlayNum
	 */
	public int getFakePlayNum() {
		return fakePlayNum;
	}
	/**
	 * @param fakePlayNum the fakePlayNum to set
	 */
	public void setFakePlayNum(int fakePlayNum) {
		this.fakePlayNum = fakePlayNum;
	}
	/**
	 * @return the playNum
	 */
	public int getPlayNum() {
		return playNum;
	}
	/**
	 * @param playNum the playNum to set
	 */
	public void setPlayNum(int playNum) {
		this.playNum = playNum;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Video [id=" + id + ", category=" + category + ", videoZHName=" + videoZHName + ", videoENName="
				+ videoENName + ", lecture=" + lecture + ", expertId=" + expertId + ", copyrightType=" + copyrightType
				+ ", sponsoredEnterprise=" + sponsoredEnterprise + ", introduction=" + introduction + ", img=" + img
				+ ", recordTime=" + recordTime + ", remark=" + remark + ", publishState=" + publishState
				+ ", publishTime=" + publishTime + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", grade=" + grade + ", keywords=" + keywords + ", subspecialty=" + subspecialty + ", diseaseNames="
				+ diseaseNames + ", diseaseClass=" + diseaseClass + ", subDiseaseClass=" + subDiseaseClass
				+ ", freeWords=" + freeWords + ", oldMongoId=" + oldMongoId + ", isVIP=" + isVIP + ", fee=" + fee
				+ ", integral=" + integral + ", fakePlayNum=" + fakePlayNum + ", playNum=" + playNum + "]";
	}
	
}
