package com.zl.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zl.mybatis.delop.ActivityRD;
import com.zl.mybatis.entity.SaleUserRecord;

public interface PromotionMapper {
	public List<SaleUserRecord> getListRecord();
	
	public List<ActivityRD> getActivityRD(@Param("aa")String Orderid,@Param("bb")String MissId);
}
