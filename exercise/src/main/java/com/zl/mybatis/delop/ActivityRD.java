package com.zl.mybatis.delop;

import com.zl.mybatis.entity.SaleUserActivityRD;
import com.zl.mybatis.entity.SaleUserRecord;

/**
 * @author xueshaoqi
 *
 * @version  2018-04-12 19:20
 * @since 
 */
public class ActivityRD extends SaleUserActivityRD{
	
	private SaleUserRecord saleUserRecord;

	public SaleUserRecord getSaleUserRecord() {
		return saleUserRecord;
	}

	public void setSaleUserRecord(SaleUserRecord saleUserRecord) {
		this.saleUserRecord = saleUserRecord;
	}

	@Override
	public String toString() {
		return "ActivityRD [saleUserRecord=" + saleUserRecord + "]";
	}

	
}
