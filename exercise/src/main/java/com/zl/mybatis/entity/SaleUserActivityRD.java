package com.zl.mybatis.entity;

import java.util.Date;
/**
 * PYRAMID_SALE_USER_ACTIVITY_RD
 * @author xueshaoqi
 *
 * @version  2018-04-12 19:18
 * @since
 */
public class SaleUserActivityRD {
	
	private String MSISDN;
	private int PROMOTION_ID;
	private int ORDERID;
	private String NICKNAME;
	private String ACCOUNTNAME;
	private String FATHER_MSISDN;
	private String FATHER_ACCOUNTNAME;
	private String FATHER_NICKNAME;
	private int SINGLE_WITHDRAW_LIMIT_UPPER;
	private int  WITHDRAW_STATUS;
	private Date MODIFY_DATE;
	private int WITHDRAWAL_AMOUNT;
	private int TOTAL_REBATE;
	private int DAYTOTAL_REBATE;
	private int TOTAL_ORDER_NUM;
	public String getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}
	public int getPROMOTION_ID() {
		return PROMOTION_ID;
	}
	public void setPROMOTION_ID(int pROMOTION_ID) {
		PROMOTION_ID = pROMOTION_ID;
	}
	public int getORDERID() {
		return ORDERID;
	}
	public void setORDERID(int oRDERID) {
		ORDERID = oRDERID;
	}
	public String getNICKNAME() {
		return NICKNAME;
	}
	public void setNICKNAME(String nICKNAME) {
		NICKNAME = nICKNAME;
	}
	public String getACCOUNTNAME() {
		return ACCOUNTNAME;
	}
	public void setACCOUNTNAME(String aCCOUNTNAME) {
		ACCOUNTNAME = aCCOUNTNAME;
	}
	public String getFATHER_MSISDN() {
		return FATHER_MSISDN;
	}
	public void setFATHER_MSISDN(String fATHER_MSISDN) {
		FATHER_MSISDN = fATHER_MSISDN;
	}
	public String getFATHER_ACCOUNTNAME() {
		return FATHER_ACCOUNTNAME;
	}
	public void setFATHER_ACCOUNTNAME(String fATHER_ACCOUNTNAME) {
		FATHER_ACCOUNTNAME = fATHER_ACCOUNTNAME;
	}
	public String getFATHER_NICKNAME() {
		return FATHER_NICKNAME;
	}
	public void setFATHER_NICKNAME(String fATHER_NICKNAME) {
		FATHER_NICKNAME = fATHER_NICKNAME;
	}
	public int getSINGLE_WITHDRAW_LIMIT_UPPER() {
		return SINGLE_WITHDRAW_LIMIT_UPPER;
	}
	public void setSINGLE_WITHDRAW_LIMIT_UPPER(int sINGLE_WITHDRAW_LIMIT_UPPER) {
		SINGLE_WITHDRAW_LIMIT_UPPER = sINGLE_WITHDRAW_LIMIT_UPPER;
	}
	public int getWITHDRAW_STATUS() {
		return WITHDRAW_STATUS;
	}
	public void setWITHDRAW_STATUS(int wITHDRAW_STATUS) {
		WITHDRAW_STATUS = wITHDRAW_STATUS;
	}
	public Date getMODIFY_DATE() {
		return MODIFY_DATE;
	}
	public void setMODIFY_DATE(Date mODIFY_DATE) {
		MODIFY_DATE = mODIFY_DATE;
	}
	public int getWITHDRAWAL_AMOUNT() {
		return WITHDRAWAL_AMOUNT;
	}
	public void setWITHDRAWAL_AMOUNT(int wITHDRAWAL_AMOUNT) {
		WITHDRAWAL_AMOUNT = wITHDRAWAL_AMOUNT;
	}
	public int getTOTAL_REBATE() {
		return TOTAL_REBATE;
	}
	public void setTOTAL_REBATE(int tOTAL_REBATE) {
		TOTAL_REBATE = tOTAL_REBATE;
	}
	public int getDAYTOTAL_REBATE() {
		return DAYTOTAL_REBATE;
	}
	public void setDAYTOTAL_REBATE(int dAYTOTAL_REBATE) {
		DAYTOTAL_REBATE = dAYTOTAL_REBATE;
	}
	public int getTOTAL_ORDER_NUM() {
		return TOTAL_ORDER_NUM;
	}
	public void setTOTAL_ORDER_NUM(int tOTAL_ORDER_NUM) {
		TOTAL_ORDER_NUM = tOTAL_ORDER_NUM;
	}
	@Override
	public String toString() {
		return "SaleUserActivityRD [MSISDN=" + MSISDN + ", PROMOTION_ID=" + PROMOTION_ID + ", ORDERID=" + ORDERID
				+ ", NICKNAME=" + NICKNAME + ", ACCOUNTNAME=" + ACCOUNTNAME + ", FATHER_MSISDN=" + FATHER_MSISDN
				+ ", FATHER_ACCOUNTNAME=" + FATHER_ACCOUNTNAME + ", FATHER_NICKNAME=" + FATHER_NICKNAME
				+ ", SINGLE_WITHDRAW_LIMIT_UPPER=" + SINGLE_WITHDRAW_LIMIT_UPPER + ", WITHDRAW_STATUS="
				+ WITHDRAW_STATUS + ", MODIFY_DATE=" + MODIFY_DATE + ", WITHDRAWAL_AMOUNT=" + WITHDRAWAL_AMOUNT
				+ ", TOTAL_REBATE=" + TOTAL_REBATE + ", DAYTOTAL_REBATE=" + DAYTOTAL_REBATE + ", TOTAL_ORDER_NUM="
				+ TOTAL_ORDER_NUM + "]";
	}
	
	
}
