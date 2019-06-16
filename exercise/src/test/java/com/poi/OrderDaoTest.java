package com.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.InternalFrameFocusTraversalPolicy;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mugu.utils.StringUtils;
import com.zl.mybatis.dao.OrderMapper;
import com.zl.mybatis.dao.PromotionMapper;
import com.zl.mybatis.dao.UserAnswerRecordMapper;
import com.zl.mybatis.dao.UserMapper;
import com.zl.mybatis.delop.ActivityRD;
import com.zl.mybatis.entity.SaleUserActivityRD;
import com.zl.mybatis.entity.SaleUserRecord;
import com.zl.mybatis.entity.UserAnswerQueryVo;
import com.zl.mybatis.pojo.Orders;
import com.zl.mybatis.pojo.OrdersCustom;
import com.zl.mybatis.pojo.QueryVo;
import com.zl.mybatis.pojo.User;
import com.zl.mybatis.pojo.UserAnswerRecord;
import com.zl.utils.DateUtil;
import com.zl.utils.MyBatisUtils;

/**
 * 测试Dao层
 *
 * @author Rowling.Xe
 * @Version v1.0 2017年11月25日 下午6:37:27
 *
 */

public class OrderDaoTest {
	
	private SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void before() {
		sqlSessionFactory = MyBatisUtils.getnewInstance();
	}
	
	
	@Test
	public  void fis() throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\BR006713.xlsx");
		//XSSFWorkbook xssfWorkbook = new XSSFWorkbook(file);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
		 // 遍历Excel中所有的sheet
        for (int i = 0; i < xssfWorkbook.getNumberOfSheets(); i++) {
        	Sheet    sheet = xssfWorkbook.getSheetAt(i);
            if (sheet == null)
                continue;

            // 取第一行标题
           Row  row = sheet.getRow(0);
            String title[] = null;
            if (row != null) {
                title = new String[row.getLastCellNum()];

                for (int y = row.getFirstCellNum(); y < row.getLastCellNum(); y++) {
                	Cell  cell = row.getCell(y);
                    title[y] = (String) ImportExcelUtil.getCellValue(cell);
                }

            } else
                continue;
            
            ArrayList<RdoOrderInfo> list = new ArrayList<>();
            
            
            // 遍历当前sheet中的所有行
            for (int j = 1; j < sheet.getLastRowNum() + 1; j++) {
                row = sheet.getRow(j);
                Map<String, Object> m = new HashMap<String, Object>();
                // 遍历所有的列
                for (int y = row.getFirstCellNum(); y < row.getLastCellNum(); y++) {
                   Cell cell = row.getCell(y);
                    //String key = title[y];
                   // m.put(mapping.get(key), getCellValue(cell));
                    RdoOrderInfo info = new RdoOrderInfo();
                   // info.setCooperateCode((String) ImportExcelUtil.getCellValue(cell));
                    //info.(ImportExcelUtil.getCellValue(cell));
                    Object cellValue = ImportExcelUtil.getCellValue(cell);
                    System.out.println(cellValue);
                }
               
            }

        }
	}
	@Test
	public void XSSF() throws Exception, IOException {
		
		SqlSession session = sqlSessionFactory.openSession();
		UserAnswerRecordMapper mapper = session.getMapper(UserAnswerRecordMapper.class);
		
		//File file = new File("‪D:\\BR006713.xlsx");
		FileInputStream fis = new FileInputStream("D:\\BR006713.xlsx");
		//XSSFWorkbook xssfWorkbook = new XSSFWorkbook(file);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
		int numberOfSheets = xssfWorkbook.getNumberOfSheets();
		int numberOfSheets2 = xssfWorkbook.getNumberOfSheets();
		
		
		for (Row row : sheet) {
			
			// 一行数据 对应 一个区域对象
			if (row.getRowNum() == 0) {
				// 第一行 跳过
				System.out.println("end1");
				continue;
			}
		
			// 跳过空行
			if (row.getCell(0) == null)
					 {
				System.err.println("end2");
				continue;
			}
			System.out.println((int) row.getCell(0).getNumericCellValue());
			System.out.println(row.getCell(1).getStringCellValue());
			System.out.println(row.getCell(2).getStringCellValue());
			System.out.println((int)row.getCell(3).getNumericCellValue());
			System.out.println(row.getCell(4).getStringCellValue());
			System.out.println((int)row.getCell(5).getNumericCellValue());
			System.out.println((int)row.getCell(6).getNumericCellValue());
			
			com.zl.mybatis.entity.RdoOrderInfo info = new com.zl.mybatis.entity.RdoOrderInfo();
			info.setOperType((int) row.getCell(0).getNumericCellValue());
			info.setCooperateCode(row.getCell(1).getStringCellValue());
			info.setProductCode(row.getCell(2).getStringCellValue());
			info.setStatus((int)row.getCell(3).getNumericCellValue());
			info.setProductName(row.getCell(4).getStringCellValue());
			info.setFeeType(String.valueOf((int)row.getCell(5).getNumericCellValue()));
			info.setFee((int)row.getCell(6).getNumericCellValue());
			
			mapper.insertRdoEnitiy(info);
			
			session.commit();
		}
		
		
	}
	
	@Test
	public void sheet() throws Exception {
		  File file = new File("‪D:\\BR006713.xlsx");
	       
	        // new FileInputStream("D:\\TEST\\DIFF_READ_ORDER_ALL_20180410.txt"), "GB2312"
	        System.out.println(111);
	        //FileInputStream fis = new FileInputStream(file);
	        FileInputStream fis = new FileInputStream("D:\\BR006713.xlsx");
	        System.out.println(222);
	        Map<String, String> m = new HashMap<String, String>();
	        m.put("CooperateCode", "CooperateCode");
	        m.put("ProductCode", "ProductCode");
	        m.put("Status", "Status");
	        m.put("ProductName", "ProductName");
	        m.put("FeeType", "FeeType");
	        m.put("Fee", "Fee");
	        List<Map<String, Object>> ls = ImportExcelUtil.parseExcel(fis, file.getName(), m);
	       // System.out.println(JSON.toJSONString(ls));
	        
	       for (Map<String, Object> map : ls) {
			Set<String> keySet = map.keySet();
			for (String key : keySet) {
				System.out.println(key + "--" + map.get(key));
			}
	       }
	}
	
	
	@Test
	public void test() {
		SqlSession session = sqlSessionFactory.openSession();
		PromotionMapper mapper = session.getMapper(PromotionMapper.class);
		PageHelper.startPage(1, 2);
		List<SaleUserRecord> result = mapper.getListRecord();
		/*for (SaleUserRecord saleUserRecord : result) {
			System.out.println(saleUserRecord);
		}*/
		
		
		PageInfo<SaleUserRecord> pageInfo = new PageInfo<>(result);
		System.out.println(pageInfo.getPages());
		System.out.println(pageInfo.getPageNum());
		List<SaleUserRecord> list = pageInfo.getList();
		for (SaleUserRecord saleUserRecord : list) {
			System.out.println(saleUserRecord);
		}
		
		
		System.out.println(result.size());
	}
	
	
	@Test
	public void test22() {
		SqlSession session = sqlSessionFactory.openSession();
		PromotionMapper mapper = session.getMapper(PromotionMapper.class);
		List<ActivityRD> activityRD = mapper.getActivityRD("2", "3");

		for (ActivityRD activityRD2 : activityRD) {
			System.out.println(activityRD2);
		}
	}
	
	@Test
	public void test33() {
		int a =1 ;
		int b =2;
		int c;
		c =(a == b? a: b);
		System.out.println(c);
	}
	public static final String HOR_SEC_FORMAT = "yyyyMMdd";
	
	@Test
	public void test3333() throws ParseException {
		String date1 = "20180605";
		String date2 = "20180909";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(HOR_SEC_FORMAT);
		Date d =  simpleDateFormat.parse(date1);
		java.sql.Date date = new java.sql.Date(d.getTime());
		System.out.println(date);
		
		//Timestamp valueOf = Timestamp.valueOf(date1);
		//System.out.println(valueOf);
		
	}
	@Test
	public void test23() throws ParseException {
		SqlSession session = sqlSessionFactory.openSession();
		
		UserAnswerRecordMapper mapper = session.getMapper(UserAnswerRecordMapper.class);
		
		UserAnswerQueryVo qvo = new UserAnswerQueryVo();
		qvo.setIdentityId("11");;
		
		String date1 = "20180405";
		String date2 = "20180909";
		//Date strToDate1 = DateUtil.strToDate(date1, HOR_SEC_FORMAT);
		//Date strToDate2 = DateUtil.strToDate(date2, HOR_SEC_FORMAT);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(HOR_SEC_FORMAT);
		Date parse = simpleDateFormat.parse(date1);
		java.sql.Date d1 = new java.sql.Date(parse.getTime());
		
		Date parse2 = simpleDateFormat.parse(date2);
		java.sql.Date d2 = new java.sql.Date(parse2.getTime());
		qvo.setAnswerStartDate(d1);
		qvo.setAnswerEndDate(d2);
		
		List<UserAnswerRecord> list = mapper.getUserAnswerRecordList(qvo);
		System.out.println(list);
		for (UserAnswerRecord userAnswerRecord : list) {
			System.out.println(userAnswerRecord.getAnswerDate());
		}
	}
	
	
}




















