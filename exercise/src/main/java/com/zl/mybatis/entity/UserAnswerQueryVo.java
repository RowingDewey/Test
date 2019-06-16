package com.zl.mybatis.entity;

import java.sql.Date;

public class UserAnswerQueryVo {
	
	private Date answerStartDate;
	
	private Date answerEndDate;

	private String identityId;
	
	public Date getAnswerStartDate() {
		return answerStartDate;
	}

	public void setAnswerStartDate(Date answerStartDate) {
		this.answerStartDate = answerStartDate;
	}

	public Date getAnswerEndDate() {
		return answerEndDate;
	}

	public void setAnswerEndDate(Date answerEndDate) {
		this.answerEndDate = answerEndDate;
	}

	public String getIdentityId() {
		return identityId;
	}

	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	
		
	
}
