package com.zl.mybatis.entity;

import com.zl.mybatis.pojo.UserAnswerRecord;

/**
 * @author xueshaoqi
 *
 * @version  2018-06-07 07:29
 * @since 
 */
/**
 * @author xueshaoqi
 *
 * @version  2018-06-07 07:29
 * @since 
 */
public class ResultRecord extends UserAnswerRecord{
	
	/** 总条数 */
	private int totalCount;
	
	/** 身份id */
	private String identityId;
	
	/** 用户账号 */
	private String account;
	
	/** 用户昵称 */
	private String nickName;

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public String getIdentityId() {
		return identityId;
	}

	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "ResultRecord [totalCount=" + totalCount + ", identityId=" + identityId + ", account=" + account
				+ ", nickName=" + nickName + "]";
	}
	
	
}
