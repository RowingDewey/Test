package com.zl.test.sql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import org.junit.Test;

import com.zl.mybatis.entity.SaleUserRecord;
import com.zl.utils.OracleDaoUtil;


public class OwnerDao {
    
    public static void main(String[] args)
    {
        int[] arr = {2,7,11,12};
        int[] twoSum = twoSum(arr,9);
        for (int i : twoSum)
        {
            System.out.println(i);
        }
    }
   
    public static int[] twoSum(int[] nu, int t) {
        int[] nums = nu;
        int target = t;
        int[] two = new int[2];
        for(int i = 0; i< nums.length; i++) {
            for(int j = 1; j< nums.length-1; j ++) {
                if(nums[i] + nums[j] == target) {
                    two[0] = i;
                    two[1] = j;
                    return two;
                } 
            }
        }
        return two;
    }
	/**
	 * 新增业主
	 */
	@Test
	public static void test(SaleUserRecord owners) {
		Connection  conn = null;
		PreparedStatement  stmt = null;
		try {
			//  获得连接
			conn = OracleDaoUtil.getConnection();
			// 预编译
			stmt = conn.prepareStatement("select * from  pyramid_sale_user_activity_rd");
			// 执行
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			OracleDaoUtil.release(null, stmt, conn);
		}
	}
	
	/**
	 * 更新业主信息
	 */
	/*@Test
	public static  void update(Owners owners) {
		Connection  conn = null;
		PreparedStatement  stmt = null;
		try {
			//  获得连接
			conn = OracleDaoUtil.getConnection();
			// 预编译
		//	stmt = conn.prepareStatement("update t_owners set values(?,?,?,?,?,?,?,?)");
			
			stmt = conn.prepareStatement("update t_owners set name=?,addressid=?," +
					" housenumber=?,watermeter=?,adddate=?,ownertypeid?,outdate=? where id =?");
			stmt.setString(1, owners.getName());
			stmt.setLong(2, owners.getAddressid());
			stmt.setString(3, owners.getHousenumber());
			stmt.setString(4, owners.getWatermeter());
			stmt.setDate(5, new Date(owners.getAdddate().getTime()));
			stmt.setLong(6, owners.getOwnertypeid());
			stmt.setLong(7, owners.getOutdate());
		//	stmt.setDate(8, new Date(owners.getOutdate()));
			// 执行
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			OracleDaoUtil.release(null, stmt, conn);
		}
	}*/
	
}
