package com.proxy.utils;

/**
 * 
 * ftp路径工具类
 *
 * @author zKF24528
 * @version C10 2014年10月22日
 * @since SDP V300R003C10
 */
public class FtpSite
{
    /**
     * 主机IP地址
     */
    private String hostIp = "";

    /**
     * 主机端口号
     */
    private int port = 21;

    /**
     * ftp的用户名
     */
    private String userName = "";

    /**
     * ftp的密码
     */
    private String passWord = "";

    /**
     * 
     * 构造函数
     */
    public FtpSite()
    {
    }

    /**
     * 
     * 构造函数 
     * @param ip String
     * @param userName String
     * @param passWord String
     * @param port int
     */
    public FtpSite(String ip, String userName, String passWord, int port)
    {
        this.hostIp = ip;
        this.passWord = passWord;
        this.port = port;
        this.userName = userName;
    }

    /**
     * 取得hostIp
     * 
     * @return 返回hostIp。
     */
    public String getHostIp()
    {
        return hostIp;
    }

    /**
     * 设置hostIp
     * 
     * @param hostIp
     *            要设置的hostIp。
     */
    public void setHostIp(String hostIp)
    {
        this.hostIp = hostIp;
    }

    /**
     * 取得port
     * 
     * @return 返回port。
     */
    public int getPort()
    {
        return port;
    }

    /**
     * 设置port
     * 
     * @param port
     *            要设置的port。
     */
    public void setPort(int port)
    {
        this.port = port;
    }

    /**
     * 取得userName
     * 
     * @return 返回userName。
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * 设置userName
     * 
     * @param userName
     *            要设置的userName。
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    /**
     * 取得passWord
     * 
     * @return 返回passWord。
     */
    public String getPassWord()
    {
        return passWord;
    }

    /**
     * 设置passWord
     * 
     * @param passWord
     *            要设置的passWord。
     */
    public void setPassWord(String passWord)
    {
        this.passWord = passWord;
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("FtpSite [hostIp=");
        builder.append(hostIp);
        builder.append(", port=");
        builder.append(port);
        builder.append(", userName=");
        builder.append(userName);
        builder.append(", passWord=");
        builder.append(passWord);
        builder.append("]");
        return builder.toString();
    }
}
