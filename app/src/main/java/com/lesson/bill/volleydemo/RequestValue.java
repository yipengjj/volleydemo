/*
 * 文件名：RequestValue.java 版权：Copyright by www.zoomlang.com 描述： 修改人：peter 修改时间：2014年11月24日 跟踪单号：
 * 修改单号： 修改内容：
 */

package com.lesson.bill.volleydemo;


import java.io.Serializable;
import java.util.Map;

/**
 * 接口统一请求对象
 * 
 * @author peter
 * @version 2015年5月4日
 * @see RequestValue
 * @since
 */
public class RequestValue implements Serializable
{
    /**
     * 意义，目的和功能，以及被用到的地方<br>
     */
    private static final long serialVersionUID = -584710997682083282L;

    /**
     * 客户端ID，每个客户下载APP后应该不用，采用百度推送组建生成
     */
    private String clientId;

    /**
     * 渠道，APP取值固定为IOS和ANDR
     */
    private String channel; // WEB、IOS、ANDR

    /**
     * 客户端IP
     */
    
    private String userIp;

    /**
     * 令牌ID
     */
    
    private String tokenId; // 客户端令牌ID

    /**
     * 查询第几页，主要用于数据翻页时传值
     */
    
    private String page = "1"; // 查询第几页

    /**
     * APP版本号
     */
    
    private String version; // APP版本号

    /**
     * 手机屏幕宽度，单位PX
     */
    
    private String width; // 手机屏幕宽度，单位px

    /**
     * 手机屏幕高度，单位PX
     */
    
    private String height; // 手机屏幕高度，单位px

    /**
     * MAP型简易传值对象，Map<String, String>
     */
    
    private Map<String, String> simpleArgs;
    
    /**
     * 单个String型简易传值对象
     */
    
    private String simpleParam;

    public String getXqId() {
        return xqId;
    }

    public void setXqId(String xqId) {
        this.xqId = xqId;
    }

    private String xqId;

    public Map<String, String> getSimpleArgs()
    {
        return simpleArgs;
    }

    public void setSimpleArgs(Map<String, String> simpleArgs)
    {
        this.simpleArgs = simpleArgs;
    }

    public String getClientId()
    {
        return clientId;
    }

    public void setClientId(String clientId)
    {
        this.clientId = clientId;
    }

    public String getChannel()
    {
        return channel;
    }

    public void setChannel(String channel)
    {
        this.channel = channel;
    }

    public String getUserIp()
    {
        return userIp;
    }

    public void setUserIp(String userIp)
    {
        this.userIp = userIp;
    }

    public String getTokenId()
    {
        return tokenId;
    }

    public void setTokenId(String tokenId)
    {
        this.tokenId = tokenId;
    }

    public String getPage()
    {
        return page;
    }

    public void setPage(String page)
    {
        this.page = page;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public String getWidth()
    {
        return width;
    }

    public void setWidth(String width)
    {
        this.width = width;
    }

    public String getHeight()
    {
        return height;
    }

    public void setHeight(String height)
    {
        this.height = height;
    }

    public String getSimpleParam()
    {
        return simpleParam;
    }

    public void setSimpleParam(String simpleParam)
    {
        this.simpleParam = simpleParam;
    }
}
