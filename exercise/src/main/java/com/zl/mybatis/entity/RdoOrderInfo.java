package com.zl.mybatis.entity;

public class RdoOrderInfo {
	
	
	/** 操作类型，必填 */
	private int OperType;
	
	

	/** 咪咕数媒分配的 */
	private String CooperateCode;
	
	/** Productid */
	private String ProductCode;
	
	/** 状态码 */
	private int Status;
	
	/** 产品名称 */
	private String ProductName;
	
	/** 计费类型 */
	private String FeeType;
	
	
	/** 单位：厘 */
	private int Fee;
	
	public int getOperType() {
		return OperType;
	}
	public void setOperType(int operType) {
		OperType = operType;
	}
	public String getCooperateCode() {
		return CooperateCode;
	}
	public void setCooperateCode(String cooperateCode) {
		CooperateCode = cooperateCode;
	}
	public String getProductCode() {
		return ProductCode;
	}
	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getFeeType() {
		return FeeType;
	}
	public void setFeeType(String feeType) {
		FeeType = feeType;
	}
	public int getFee() {
		return Fee;
	}
	public void setFee(int fee) {
		Fee = fee;
	}
	@Override
	public String toString() {
		return "RdoOrderInfo [OperType=" + OperType + ", CooperateCode=" + CooperateCode + ", ProductCode="
				+ ProductCode + ", Status=" + Status + ", ProductName=" + ProductName + ", FeeType=" + FeeType
				+ ", Fee=" + Fee + "]";
	}
	
}
