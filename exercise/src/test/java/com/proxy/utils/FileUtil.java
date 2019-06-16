package com.proxy.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;


/**
 * 文件工具类
 * 
 * @author zKF24528
 * @version [版本号, Apr 24, 2010]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class FileUtil
{
    /**
     * 日志对象
     */
    
    /**
     * 路径分隔符
     */
    public static final String FILE_SEPARATOR = System.getProperty("file.separator");
    
    
    /**
     * 关闭输入流
     * 
     * @param in 指定的输入流
     * 
     */
    public static void close(InputStream in)
    {
        if (null != in)
        {
            try
            {
                in.close();
            }
            catch (IOException e)
            {
             /*   if (LOG.isWarnEnabled())
                {
                    LOG.warn("close inputstream failure", e);
                }*/
            }
        }
    }
    
    /**
     * 关闭输入流
     * 
     * @param reader 要关闭的流
     */
    public static void close(Reader reader)
    {
        if (null != reader)
        {
            try
            {
                reader.close();
            }
            catch (IOException e)
            {
               /* if (LOG.isWarnEnabled())
                {
                    LOG.warn("close reader failure", e);
                }*/
            }
        }
    }
    
 
    
    /**
     * 关闭输出流
     * 
     * @param writer [要关闭的流]
     */
    public static void close(Writer writer)
    {
        if (null != writer)
        {
            try
            {
                writer.close();
            }
            catch (IOException e)
            {
               /* if (LOG.isWarnEnabled())
                {
                    LOG.warn("close writer failure", e);
                }*/
            }
        }
    }
    
    /**
     * 将内容写入文件
     * 
     * @param filePathAndName 文本文件完整绝对路径及文件名
     * @param fileContent 文本文件内容
     * @throws IOException IO异常
     */
    public static void createFile(String filePathAndName, String fileContent)
        throws IOException
    {
        createFile(filePathAndName, fileContent, true);
    }
    
    /**
     * 将内容写入文件
     * 
     * @param filePathAndName 文本文件完整绝对路径及文件名
     * @param fileContent 文本文件内容
     * @param append 是否是追加模式
     * @throws IOException IO异常
     */
    public static void createFile(String filePathAndName, String fileContent, boolean append)
        throws IOException
    {
        FileWriter resultFile = null;
        PrintWriter myFile = null;
        
        try
        {
            String filePath = filePathAndName;
            File myFilePath = new File(filePath);
            File parents = myFilePath.getParentFile();
            
            // 文件的父目录不存在，创建该目录
            if (!parents.exists() && parents.mkdirs())
            {
                // 上面方法有返回值，findBugs会报警，所以采用空实现的形式解决
                ;
            }
            // 判断文件是否存在
            if (!myFilePath.exists() && myFilePath.createNewFile())
            {
                // 新建文件
                // 上面方法有返回值，findBugs会报警，所以采用空实现的形式解决
                ;
            }
            resultFile = new FileWriter(myFilePath, append);
            myFile = new PrintWriter(resultFile);
            String strContent = fileContent;
            myFile.print(strContent);
            myFile.flush();
        }
        catch (Exception e)
        {
          //  LOG.error("", e);
        }
        finally
        {
            if (myFile != null)
            {
                myFile.close();
            }
            if (resultFile != null)
            {
                resultFile.close();
            }
        }
    }
    
    /**
     * 将内容写入文件
     * 
     * @param filePathAndName 文本文件完整绝对路径及文件名
     * @param fileContent 文本文件内容
     * @param encoding 编码格式
     * @throws IOException IO异常
     */
    public void createFile(String filePathAndName, String fileContent, String encoding)
        throws IOException
    {
        PrintWriter myFile = null;
        try
        {
            String filePath = filePathAndName;
            File myFilePath = new File(filePath);
            
            // 判断文件是否存在
            if (!myFilePath.exists() && myFilePath.createNewFile())
            {
                // 上面方法有返回值，findBugs会报警，所以采用空实现的形式解决
                ;
            }
            myFile = new PrintWriter(myFilePath, encoding);
            String strContent = fileContent;
            myFile.print(strContent);
            myFile.flush();
        }
        catch (Exception e)
        {
      //      LOG.error("", e);
        }
        finally
        {
            if (myFile != null)
            {
                myFile.close();
            }
        }
    }
}
