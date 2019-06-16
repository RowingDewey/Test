package com.proxy;

import java.io.IOException;
import java.util.Properties;

//import com.enterprisedt.net.ftp.FTPException;
import com.proxy.utils.FtpSite;
import com.proxy.utils.PropUtils;


public class FtpTest
{   
  static  Properties propInfo = null;
  static  String ftp_url =null;
  static  String user = null;
  static  String pwd = null;
  static  String prot = null;
    static{
        propInfo = PropUtils.getPropInfo();
        ftp_url = propInfo.getProperty("ctu_ftpUrl");
        user = propInfo.getProperty("ctu_userName");
        pwd = propInfo.getProperty("ctu_password");
        prot = propInfo.getProperty("ctu_port");
        System.out.println(ftp_url);
    }
    
 /*   public static void main(String[] args) throws IOException, FTPException, Exception
    {   
        
        
        if (propInfo != null)
        {
            FtpSite ftp_ctu = new FtpSite(ftp_url,user,pwd,Integer.parseInt(prot));
           // System.out.println(ftp_ctu);
            FtpProxyTest.download(ftp_ctu, "/home/ctu/release/ctu.war", "G:\\company\\test\\");
        }
        
    }*/
    
}
