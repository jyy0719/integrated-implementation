 package com.project.plus.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="selectNotReview")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReviewVO {
	@XmlElement(name="review")
	@XmlAttribute
	private int reviewNum;
	private int memberNum;
	private int clubNum;
	private String reviewContent;
	private String reviewPic;
	private int reviewRate;
	private Date reviewRegDate;
	
	/*필요한 VO*/
	@XmlTransient
	private String clubThumbPic;
	@XmlTransient
	private String clubName;
	private Date startDate;
	private Date endDate;
	
	

	public int getReviewNum() {
		return reviewNum;
	}
	public void setReviewNum(int reviewNum) {
		this.reviewNum = reviewNum;
	}
	public int getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}
	public int getClubNum() {
		return clubNum;
	}
	public void setClubNum(int clubNum) {
		this.clubNum = clubNum;
	}
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public String getReviewPic() {
		return reviewPic;
	}
	public void setReviewPic(String reviewPic) {
		this.reviewPic = reviewPic;
	}
	public int getReviewRate() {
		return reviewRate;
	}
	public void setReviewRate(int reviewRate) {
		this.reviewRate = reviewRate;
	}
	public Date getReviewRegDate() {
		return reviewRegDate;
	}
	public void setReviewRegDate(Date reviewRegDate) {
		this.reviewRegDate = reviewRegDate;
	}
	public String getClubThumbPic() {
		return clubThumbPic;
	}
	public void setClubThumbPic(String clubThumbPic) {
		this.clubThumbPic = clubThumbPic;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "ReviewVO [reviewNum=" + reviewNum + ", memberNum=" + memberNum + ", clubNum=" + clubNum
				+ ", reviewContent=" + reviewContent + ", reviewPic=" + reviewPic + ", reviewRate=" + reviewRate
				+ ", reviewRegDate=" + reviewRegDate + ", clubThumbPic=" + clubThumbPic + ", clubName=" + clubName
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
}
