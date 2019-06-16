package com.proxy.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class PropUtils
{   
    
  /**
   * 获取ftpInfo 信息
   * 
   * @return
   * @see [类、类#方法、类#成员]
   */
  public static Properties getPropInfo() {
      Properties  pr = new Properties();
      BufferedReader br;
    try
    {
        br = new BufferedReader(new FileReader("FtpInfo.txt"));
        pr.load(br);
        br.close();
        return pr;
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return null;
    
  }
}
