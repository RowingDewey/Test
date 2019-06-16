package com.zl.mybatis.dao;

import java.util.List;

import com.zl.mybatis.entity.RdoOrderInfo;
import com.zl.mybatis.entity.UserAnswerQueryVo;
import com.zl.mybatis.pojo.UserAnswerRecord;

public interface UserAnswerRecordMapper {
	
	
	public List<UserAnswerRecord> getUserAnswerRecordList(UserAnswerQueryVo QueryVo);
	//anser_event_rule 
	public int delAnswerEvertRuleById(String eventid);
	
	public List<Integer> selectAnswerEvertRuleById(String eventid);
	
	public int delAnswerEventConfnById(String eventid);
	
	public List<UserAnswerRecord> getUserAnswerRecordList1(UserAnswerQueryVo QueryVo);
	
	public void insertRdoEnitiy(RdoOrderInfo rdoOrderInfo);
}
