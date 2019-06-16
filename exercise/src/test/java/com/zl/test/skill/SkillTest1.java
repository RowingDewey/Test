package com.zl.test.skill;


import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.BeanUtils;

import com.poi.RdoOrderInfo;


public class SkillTest1
{   
    @Test
    public void test0() {
        String type = "205,210,214,215,18,19";
       // String type = "20";
        boolean b = false;
        
        if ( type.contains("205") || type.contains("210") || type.contains("214")
            || type.contains("215") || type.contains("18") || type.contains("19") )
        { 
            b = true;
        }
        System.out.println(b);
    }
    
    
    @Test
    public void test2() {
        String strs = "205,210,214,215,18,19";
        boolean b = isContains("215",",",strs);
        System.out.println(b);
    }
    
    public static boolean isContains(String str,String spilt,String strs)
    {
        if (strs == null || strs.trim().length() == 0)
        {
            return false;
        }
        
        String[] array = strs.split("\\" + spilt);
        
        for (int i = 0; i < array.length; i++)
        {   
            System.out.println(array[i]);
            if (array[i].equals(str))
            {
                return true;
            }
        }
        return false;
    }
    @Test
    public void test5() {
        RdoOrderInfo info1 = new RdoOrderInfo();
        info1.setFee(1);
        info1.setCooperateCode("aa");
        info1.setProductCode("ab");
        com.zl.mybatis.entity.RdoOrderInfo info = new com.zl.mybatis.entity.RdoOrderInfo();
        
        
            BeanUtils.copyProperties(info1, info);
       
        System.out.println(info);
    }
    
    @Test
    public void test4() {
        String[] strs = new String[]{"aaa","bbb"};
        List<String> asList = Arrays.asList(strs);
        strs[0] = "ccc";
        asList.add("ddd");
        System.out.println(asList.toString());
    }
    
    @Test
    public void test3() {
        List list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
       /* 
         var currentPage = pno;//当前页数 0 2 
    var startRow = (currentPage - 1) * pageSize+1;//开始显示的行  31     
    var endRow = currentPage * pageSize;//结束显示的行   40
    endRow = (endRow > num)? num : endRow;    //40*/
        //if($current_page > $totalPage){
        /**
         * int curPage = page.getPageNumber();  0   2   4   6
        int size = page.getPageSize();          2   2   2   2
        int pagelast =  curPage + size;         2   4   6   
         */
        List subList1 = list.subList(0, 0+2);
        List subList2 = list.subList(2, 2+2);
        List subList3 = list.subList(4, 4+2);//10 4+2 =6 
        System.out.println(list.size());
        List subList4 = list.subList(6, 7);
        System.out.println(subList1);
        System.out.println(subList2);
        System.out.println(subList3);
        System.out.println(subList4);
     /*   for(int i=0;i<list.size();i=i+2){
            if(i+2>list.size()){
                System.out.println(list.subList(i, list.size()));
            }else {
                System.out.println(list.subList(i, i+2));
            }

        }*/
    }

    
    @Test
    public void test11() {
        Integer []sz={3,2};
        List<Integer> list=new ArrayList(Arrays.asList(sz));//**须定义时就进行转化**
                list.add(1,5);
                Integer[] nsz=new Integer[list.size()];
                list.toArray(nsz);
                System.out.println(Arrays.toString(nsz));
   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Test
    public void test1() {
        boolean b = 1 > 0 ;
        System.out.println(b);
    }
    
    
}
