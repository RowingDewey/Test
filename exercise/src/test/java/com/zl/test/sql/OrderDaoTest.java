package com.zl.test.sql;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zl.mybatis.dao.OrderMapper;
import com.zl.mybatis.dao.PromotionMapper;
import com.zl.mybatis.dao.UserAnswerRecordMapper;
import com.zl.mybatis.dao.UserMapper;
import com.zl.mybatis.delop.ActivityRD;
import com.zl.mybatis.entity.SaleUserRecord;
import com.zl.mybatis.entity.UserAnswerQueryVo;
import com.zl.mybatis.pojo.Orders;
import com.zl.mybatis.pojo.User;
import com.zl.mybatis.pojo.UserAnswerRecord;
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
	/**
	 * StartDate=Tue Jun 26 00:00:00 CST 2018; EndDate=Wed Jun 27 00:00:00 CST 2018
	 * @author xueshaoqi
	 * @throws ParseException
	 * 
	 * public static final String DEFAULT_FORMAT = "yyyyMMddHHmmss";
	 */
	public static final String DEFAULT_FORMAT = "yyyyMMddHHmmss";
	@Test
	public void test23() throws ParseException {
		SqlSession session = sqlSessionFactory.openSession();
		
		UserAnswerRecordMapper mapper = session.getMapper(UserAnswerRecordMapper.class);
		
		UserAnswerQueryVo qvo = new UserAnswerQueryVo();
		qvo.setIdentityId("11");;
		// 2018/6/27 18:50:10
		String date1 = "20180626";
		String date2 = "20180627";
		//System.out.println(date2.substring(date2.length()-1,date2.length()));//输出d
		//System.out.println(date2.substring(date2.length()-1));//输出d
		System.err.println(Integer.parseInt(date2) +1);
		
		String date3 = String.valueOf(Integer.parseInt(date2) +1);
		System.out.println(String.valueOf(Integer.parseInt(date2) +1));
		//Date strToDate1 = DateUtil.strToDate(date1, HOR_SEC_FORMAT);
		//Date strToDate2 = DateUtil.strToDate(date2, HOR_SEC_FORMAT);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(HOR_SEC_FORMAT);
		
		Date parse = simpleDateFormat.parse(date1);
		
		java.sql.Date d1 = new java.sql.Date(parse.getTime());
		
		Date parse2 = simpleDateFormat.parse(date3);
		java.sql.Date d2 = new java.sql.Date(parse2.getTime());
		qvo.setAnswerStartDate(d1);
		qvo.setAnswerEndDate(d2);
		
		List<UserAnswerRecord> list = mapper.getUserAnswerRecordList(qvo);
		
		
		for (UserAnswerRecord userAnswerRecord : list) {
			System.err.println(userAnswerRecord.getAnswerDate());
		}
	}
	
	@Test
	public void test266() throws ParseException {
		SqlSession session = sqlSessionFactory.openSession();
		
		UserAnswerRecordMapper mapper = session.getMapper(UserAnswerRecordMapper.class);
		
		UserAnswerQueryVo qvo = new UserAnswerQueryVo();
		
		
		String date1 = "20180606";
		//Date strToDate1 = DateUtil.strToDate(date1, HOR_SEC_FORMAT);
		//Date strToDate2 = DateUtil.strToDate(date2, HOR_SEC_FORMAT);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(HOR_SEC_FORMAT);
		Date parse = simpleDateFormat.parse(date1);
		java.sql.Date d1 = new java.sql.Date(parse.getTime());
		
		qvo.setAnswerStartDate(d1);
		List<UserAnswerRecord> list = mapper.getUserAnswerRecordList(qvo);
		System.out.println(list);
		
		
	
		for (UserAnswerRecord userAnswerRecord : list) {
			System.out.println(userAnswerRecord.toString());
		}
	}
	
	@Test
	public void test24() {
		SqlSession session = sqlSessionFactory.openSession();
		UserAnswerRecordMapper mapper = session.getMapper(UserAnswerRecordMapper.class);
		
		List<Integer> selectAnswerEvertRuleById = mapper.selectAnswerEvertRuleById("3");
		System.out.println(selectAnswerEvertRuleById.size());
		System.out.println("---------------");

		
		
	}
	
	@Test
	public void test26() {
		SqlSession session = sqlSessionFactory.openSession();
		UserAnswerRecordMapper mapper = session.getMapper(UserAnswerRecordMapper.class);
		
		int delAnswerEventConfnById = mapper.delAnswerEventConfnById("4");
		session.commit();
		System.out.println(delAnswerEventConfnById);
	}
	
	@Test
	public void test25() {
		SqlSession session = sqlSessionFactory.openSession();
		UserAnswerRecordMapper mapper = session.getMapper(UserAnswerRecordMapper.class);
		
		int delAnswerEvertRuleById = mapper.delAnswerEvertRuleById("5");  // 0
		session.commit();
		System.out.println(delAnswerEvertRuleById);
	}
	public static final String NOHOR_DAY_FORMAT = "yyyyMMdd";
@Test
public void test333() {
	
	DateFormat format = new SimpleDateFormat(NOHOR_DAY_FORMAT);
	  format.setLenient(false);
	  //要转换字符串 str_test
	  String str_test ="2011-04-24"; 
	  try {
	   Timestamp ts = new Timestamp(format.parse(str_test).getTime());
	   System.out.println(ts.toString());
	  } catch (ParseException e) {
	   e.printStackTrace();
	  }
}
	@Test
	public void test444() {
		boolean validDate = isValidDate("2017/07/23");
		System.out.println(validDate);
	}
		
/*	 public static boolean isValidDate(String str) { 
      boolean convertSuccess=true; 
      	
       SimpleDateFormat format = new SimpleDateFormat(NOHOR_DAY_FORMAT); 
		       try {
		    	   	// 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期
		           format.setLenient(false); 
		           format.parse(str); 
		        } catch (ParseException e) {
		            // e.printStackTrace();
		        	// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
		            convertSuccess=false;
		        }
		        return convertSuccess;
		  }*/
	
	public static void main(String[] args) {
		/*Timestamp currentDatetime = DateUtil.getCurrentDatetime();
		
		
		System.out.println(currentDatetime);
		Date date = DateUtil.getDate(new Date());
		Timestamp timestamp = new Timestamp(date.getTime());  
		System.out.println(timestamp);*/
		System.out.println(isValidDate("20131212"));
		
        
	}
	
	 public static boolean isValidDate(String inDate)
	 {
	        return isValidDate(inDate, "yyyyMMdd", true);
	 }
	    
	    /**
	     * 
	     * @author zhaoshuqing
	     * @param inDate
	     * @param format
	     * @param checkLenth
	     * @return
	     */
	    public static boolean isValidDate(String inDate, String format, boolean checkLenth)
	    {
	        if (inDate == null)
	            return false;
	        
	        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
	        if (checkLenth)
	        {
	            if (inDate.trim().length() != dateFormat.toPattern().length())
	                return false;
	        }
	        dateFormat.setLenient(false);
	        try
	        {
	            dateFormat.parse(inDate.trim());
	        }
	        catch (ParseException pe)
	        {
	            return false;
	        }
	        return true;
	    }
	
	
	
	
	
	
	
	@Test
	public void findOrderList() throws Exception {
		
		// 获取session
		SqlSession session = sqlSessionFactory.openSession();
		
		OrderMapper orderMapper = session.getMapper(OrderMapper.class);
		
		List<Orders> list = orderMapper.findOrderListResultMap();
		for (Orders orders : list) {
			System.err.println(orders);
			
		}
		System.err.println(list);
		session.close();
	}
	
	
	// 查询所有订单信息及 订单下的订单明细信息 一对多
	@Test
	public void findOrdersDetailList() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
		
		List<Orders> list = mapper.findOrdersDetailList();
		System.out.println(list);
		
	}
	
	// 查询用户购买的商品信息。
	//  org.xml.sax.SAXParseException; lineNumber: 79; columnNumber: 31; 元素类型 "result" 必须后跟属性规范 ">" 或 "/>"。
	@Test
	public void findOrderDetailToItem() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
		
		List<Orders> list = mapper.findOrderDetailToItem();
		
		System.out.println(list);
	}
	/**
	 * 作用：
	 *    当需要查询关联信息时再去查询数据库，默认不去关联查询，提高数据库性能
	 *    只有使用resultMap 支持延迟加载设置
	 *    场合：
	当只有部分记录需要关联查询其它信息时，此时可按需延迟加载，需要关联查询时再向数据库发出sql，以提高数据库性能。
	当全部需要关联查询信息时，此时不用延迟加载，直接将关联查询信息全部返回即可，可使用resultType或resultMap完成映射。
	 */
	// 测试 懒加载
	@Test
	public void findOrdersOrderLazyLoadingUser() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		
		List<Orders> list = orderMapper.findOrdersOrderLazyLoadingUser();
		
		
		System.out.println(111);
		for (Orders orders : list) {
			System.out.println(orders.getUser());
		}
		System.out.println(list);
	}
	/**
	 * 测试 一级缓存
	 */
	@Test
	public void testgetUserById() throws Exception  {
		// 获取session
		SqlSession session = sqlSessionFactory.openSession();
		// 获取mapper接口实例
		UserMapper userMapper = session.getMapper(UserMapper.class);
		
		User user = userMapper.getUserById(1);
		User user2 = userMapper.getUserById(1);
		System.out.println(user);
		session.close();
	}
	/**
	 * 测试二
一级缓存区域是根据SqlSession为单位划分的。
每次查询会先从缓存区域找，如果找不到从数据库查询，查询到数据将数据写入缓存。
Mybatis内部存储缓存使用一个HashMap，每个sqlSession对象使用一个map存储缓存数据，map的key唯一标识 一个sql语句，key对应的value是从数据库查询出来数据映射生成的java对象。
sqlSession执行insert、update、delete等操作commit提交后会清空缓存区域。
	 */
	@Test
	public void test2() throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		
		// 获取mapper接口实例
		UserMapper userMapper = session.getMapper(UserMapper.class);
		
		//  第一次查询
		User user1 = userMapper.getUserById(1);
		System.err.println(user1);
		
		// 在同一个session执行更新
		User update = new User();
		update.setId(1);
		update.setUsername("哈哈");
		
		userMapper.updateUser(update);
		session.commit();
		
		// 第二次查询，虽然是同一个session但是由于执行了更新操作 session的缓存被清空，这里重新发出sql操作
		User user = userMapper.getUserById(1);
		System.err.println(user);
	}
	/**
	 * 二级缓存
二级缓存区域是根据mapper的namespace划分的，相同namespace的mapper查询数据放在同一个区域，如果使用mapper代理方法每个mapper的namespace都不同，此时可以理解为二级缓存区域是根据mapper划分。
每次查询会先从缓存区域找，如果找不到从数据库查询，查询到数据将数据写入缓存。
Mybatis内部存储缓存使用一个HashMap，每个mapper映射文件(以namespace为单位)对应一个map，map的key唯一标识 一个sql语句，key对应的value是从数据查询出来数据映射生成的java对象。
sqlSession执行insert、update、delete等操作commit提交后会清空缓存区域。
	 */
	// 二级缓存需要查询结果映射的pojo对象实现java.io.Serializable
	@Test
	public void test3() throws Exception {
		// 获取session
		SqlSession sqlSession1 = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession1.getMapper(UserMapper.class);
		// 使用 sqlSession1 执行第一次查询
		User user1 = userMapper.getUserById(1);
		System.err.println(user1);
		// 关闭session1
		sqlSession1.close();
		
		// 获取session2
		SqlSession sqlSession2 = sqlSessionFactory.openSession();
		UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
		// 使用session2执行第二次查询，由于开启了二级缓存这里从缓存中获取数据
		// 不子让数据库发送sql
		User user2 = userMapper2.getUserById(1);
		System.err.println(user2); // Cache Hit Ratio [cn.itcast.mybatis.dao.UserMapper]: 0.5 
		// 关闭session2
		sqlSession2.close();
		
		/**
		 * 3步开启 二级缓存： 1.配置全局变量， <setting name="cacheEnabled" true> 2.在Mapper文件<cache /> ，表示此mapper开启二级缓存 3  序列化
		 */
		/**
		 * 禁用二级缓存  在mapper的语句中  useCache="false">
		 * 刷新缓存  在查询语句中设置statement配置中的flushCache="true" 属性，避免使用缓存时如果手动修改数据库表中的查询数据会出现脏读
		 * 高级配置   <cache  eviction="FIFO"  flushInterval="60000"  size="512"  readOnly="true"/>
		 */
	}
	
	
	/**
	 * 6.3.8.1mybatis整合ehcache原理
	 * 
	 * 		mybatis提供二级缓存Cache接口，如下：
	 * 通过实现Cache接口可以实现mybatis缓存数据通过其它缓存数据库整合，mybatis的特长是sql操作，
	 * 缓存数据的管理不是mybatis的特长，
	 * 为了提高缓存的性能将mybatis和第三方的缓存数据库整合，比如ehcache、memcache、redis等。
	 * 
	 */
}




















