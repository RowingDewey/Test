package com.java.se;

import org.apache.poi.util.SystemOutLogger;
import org.junit.Test;

import java.sql.Date;

public class test1 {
	
	@Test
	public void t1() {
		short s1 = 1;
		s1 = (short) (s1 + 1);
		// 变量 s1 会出现类型转换错误（无法编译，IDE 提示错误），除非主动加上强转
		short s2 =1;
		s2 += 1;
		System.out.println(s1);
		System.out.println(s2);
	}
	
	@Test
	public void test2() {
		child child = new child();
		child.test();
	}
	
	@Test
	public void test3() {
		String s = "MSISDN,RECORDTIME,UANAME,ACCESSTYPE,ORDERTYPE,PRODUCTID,MCPID,CONTENTID,CHAPTERID,CHANNELCODE,FIRSTCATALOG,SECONDCATALOG,THIRDCATALOG,CURRENTCATALOG,REALINFORFEE,STANDINFORFEE,SALESSTRATEGYID,ISPRESENT,RECMSISDN,PAYTYPE,FEETYPE,TICKETID,PROVINCEID,CITYID,IPADDRESS,BEARTYPE,LOGINTYPE,VISITTYPE,ORDERNO,SOURCETYPE,ENTERPRISEID,CALCWAY,PAYMSISDN,APPPRODUCTID,TRANSACTIONID,ORIGTRANSACTIONID,SUBTYPE,PREPAYBEGINDATE,PREPAYENDDATE,SESSIONID,PROMOTIONID,SOURCEIP,SEQUENCE,LINKNO,WAPVERSION,UID,MOBILE,MOBILEREC,PAYMOBILE,ORDERTIME,TRADE_NO,OUT_TRADE_NO,CLIENT_VERSION,TERMINALUNIQUEID,TRANS_ID,FEE_CODE,IMSI,OSVERSION,BRAND,MODEL,MACADDRESS,BIZEXT,SUBSERVTYPE,SPID,PASSID,THIRDUID,ENDTIME,THIRDTYPE,TICKETPAYTYPE,TICKETPAYWAY,CAMPAIGNID";
		
		String[] split = s.split(",");
		System.out.println(split.length);
		
	}


	public static void main(String[] args)
	{
		System.out.println(System.currentTimeMillis());
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date);
	}
}
