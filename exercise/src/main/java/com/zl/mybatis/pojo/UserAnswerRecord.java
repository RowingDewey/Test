package com.zl.mybatis.pojo;

import java.sql.Timestamp;
import java.util.Date;

//import java.sql.Date;

/**
 * 用户答题记录表
 *  
 * @author xueshaoqi
 * @version  C10 2018年6月6日
 * @since SDP V300R003C10
 */
public class UserAnswerRecord {
	

	/** id */
	private String id;
	
	/** 活动id */
	private String eventid;
	
	/** 用户身份号 */
	private String identityId;
	
	/** 用户账号 */
	private String userAccount;
	
	/** 用户昵称 */
	private String nickName;
	
	/** 题目数量1-999 */
	private int subjectNum;
	
	/** 答对数量1-999 */
	private int answerTrue;
	
	/** 答错数量1-999 */
	private int answerFalse;
	
	/** 书券金额 */
	private int ticketSum;
	
	/** 是否下发0：未下发1：下发 */
	private String isSend;
	
	/** 答题日期 yyyymmdd hh:mm:ss */
	private Timestamp answerDate;
		

	public Timestamp getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(Timestamp answerDate) {
		this.answerDate = answerDate;
	}

	/** 下发书券重试次数。默认为0，重试一次该值加1，最大为3 */
	private int sendTicketTimes;

	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getEventid() 
	{
		return eventid;
	}

	public void setEventid(String eventid) 
	{
		this.eventid = eventid;
	}

	public String getIdentityId() 
	{
		return identityId;
	}

	public void setIdentityId(String identityId) 
	{
		this.identityId = identityId;
	}

	public String getUserAccount() 
	{
		return userAccount;
	}

	public void setUserAccount(String userAccount) 
	{
		this.userAccount = userAccount;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) 
	{
		this.nickName = nickName;
	}

	public int getSubjectNum() 
	{
		return subjectNum;
	}

	public void setSubjectNum(int subjectNum) 
	{
		this.subjectNum = subjectNum;
	}

	public int getAnswerTrue() 
	{
		return answerTrue;
	}

	public void setAnswerTrue(int answerTrue) 
	{
		this.answerTrue = answerTrue;
	}

	public int getAnswerFalse() 
	{
		return answerFalse;
	}

	public void setAnswerFalse(int answerFalse) 
	{
		this.answerFalse = answerFalse;
	}

	public int getTicketSum() 
	{
		return ticketSum;
	}

	public void setTicketSum(int ticketSum) {
		this.ticketSum = ticketSum;
	}

	public String getIsSend() 
	{
		return isSend;
	}

	public void setIsSend(String isSend) 
	{
		this.isSend = isSend;
	}


	public int getSendTicketTimes() 
	{
		return sendTicketTimes;
	}

	public void setSendTicketTimes(int sendTicketTimes) 
	{
		this.sendTicketTimes = sendTicketTimes;
	}

	@Override
	public String toString() {
		return "UserAnswerRecord [id=" + id + ", eventid=" + eventid + ", identityId=" + identityId + ", userAccount="
				+ userAccount + ", nickName=" + nickName + ", subjectNum=" + subjectNum + ", answerTrue=" + answerTrue
				+ ", answerFalse=" + answerFalse + ", ticketSum=" + ticketSum + ", isSend=" + isSend + ", answerDate="
				+ answerDate + ", sendTicketTimes=" + sendTicketTimes + "]";
	}

	/**
	 * 
	 * 
	 * 
	 * <select id="getUserAnswerRecordList" parameterType="cn.itcast.mybatis.entity.UserAnswerQueryVo" resultMap="getUserAnswerRecordListMap">
	 		select * from ( 	select tmp_page.*, rownum row_id from 
	 			( select 
	 			IDENTITY_ID, USER_ACCOUNT, NICK_NAME, EVENT_ID, SUBJECT_NUM, ANSWER_TRUE, ANSWER_FALSE, TICKET_SUM, IS_SEND, ANSWER_DATE
	 			 from user_answer_record 
 		<where>
   			<if test="identityId != null and identityId != ''">
				IDENTITY_ID = #{identityId,jdbcType=VARCHAR}
		    </if> 
		   	<if test="answerStartDate != null ">  
		   		<if test="answerEndDate != null ">  
				   <![CDATA[
						and ANSWER_DATE <= #{answerEndDate,jdbcType=DATE} and ANSWER_DATE >= #{answerStartDate,jdbcType=DATE} 
				  ]]> 
				</if>
		   </if> 
		 </where>
		   order by ANSWER_DATE desc
		    		   )
	<![CDATA[	tmp_page where rownum <= 5 ) where row_id > 0  ]]> 
    </select>
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
}
