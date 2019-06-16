package com.zl.mybatis.entity;

public class SaleUserRecord {
	
	private int ORDERID;
	private String MSISDN;
	private String MERID;
	private String NICKNAME;
	private String ACCOUNTNAME;
	private String CDK_KEY;
	private int CDK_PRICE;
	private int DISCOUNTRATE;
	private int ORDER_CHANNEL;
	private int PAY_STATUS;
	public int getORDERID() {
		return ORDERID;
	}
	public void setORDERID(int oRDERID) {
		ORDERID = oRDERID;
	}
	public String getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}
	public String getMERID() {
		return MERID;
	}
	public void setMERID(String mERID) {
		MERID = mERID;
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
	public String getCDK_KEY() {
		return CDK_KEY;
	}
	public void setCDK_KEY(String cDK_KEY) {
		CDK_KEY = cDK_KEY;
	}
	public int getCDK_PRICE() {
		return CDK_PRICE;
	}
	public void setCDK_PRICE(int cDK_PRICE) {
		CDK_PRICE = cDK_PRICE;
	}
	public int getDISCOUNTRATE() {
		return DISCOUNTRATE;
	}
	public void setDISCOUNTRATE(int dISCOUNTRATE) {
		DISCOUNTRATE = dISCOUNTRATE;
	}
	public int getORDER_CHANNEL() {
		return ORDER_CHANNEL;
	}
	public void setORDER_CHANNEL(int oRDER_CHANNEL) {
		ORDER_CHANNEL = oRDER_CHANNEL;
	}
	public int getPAY_STATUS() {
		return PAY_STATUS;
	}
	public void setPAY_STATUS(int pAY_STATUS) {
		PAY_STATUS = pAY_STATUS;
	}
	@Override
	public String toString() {
		return "SaleUserRecord [ORDERID=" + ORDERID + ", MSISDN=" + MSISDN + ", MERID=" + MERID + ", NICKNAME="
				+ NICKNAME + ", ACCOUNTNAME=" + ACCOUNTNAME + ", CDK_KEY=" + CDK_KEY + ", CDK_PRICE=" + CDK_PRICE
				+ ", DISCOUNTRATE=" + DISCOUNTRATE + ", ORDER_CHANNEL=" + ORDER_CHANNEL + ", PAY_STATUS=" + PAY_STATUS
				+ "]";
	}
	
}
