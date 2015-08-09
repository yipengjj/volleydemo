/*
 * 文件名：ResponseValue.java 版权：Copyright by www.zoomlang.com 描述： 修改人：peter 修改时间：2014年11月24日 跟踪单号：
 * 修改单号： 修改内容：
 */

package com.lesson.bill.volleydemo;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 接口统一返回对象
 * 
 * @author peter
 * @version 2015年5月4日
 * @see ResponseValue
 * @since
 */
public class ResponseValue<T> implements Serializable
{

    /**
     * 意义，目的和功能，以及被用到的地方<br>
     */
    private static final long serialVersionUID = 3886201949724826792L;

    /**
     * 渠道，APP取值固定为IOS和ANDR
     */
    
    private String channel;

    /**
     * 返回的业务ID
     */
    
    private String transId;

    /**
     * 用户ID
     */
    
    private String userId;

    /**
     * 用户昵称
     */
    
    private String userNickName;

    /**
     * 用户类型（Visitor：游客，Register：注册用户，AuthCustomer：认证用户）
     */
    
    private String userType;

    /**
     * 小区ID
     */
    
    private String xqId;

    /**
     * 小区名称
     */
    
    private String xqName;
    
    
    private String wyLogo;

    /**
     * 令牌ID
     */
    
    private String tokenId;

    /**
     * 接口返回码，成功为1，失败为-1
     */
    
    private String resultCode;

    /**
     * 接口返回信息
     */
    
    private String resultMsg;

    /**
     * 接口返回复杂对象集合,List形式，采用泛型定义
     */
    
    private List<T> resultList = new ArrayList<T>();

    /**
     * 接口返回单个复杂对象，泛型定义
     */
    
    private T resultEntity;

    public String getChannel()
    {
        return channel;
    }

    public void setChannel(String channel)
    {
        this.channel = channel;
    }

    public String getTransId()
    {
        return transId;
    }

    public String getXqId()
    {
        return xqId;
    }

    public void setXqId(String xqId)
    {
        this.xqId = xqId;
    }

    public void setTransId(String transId)
    {
        this.transId = transId;
    }

    public String getResultCode()
    {
        return resultCode;
    }

    public void setResultCode(String resultCode)
    {
        this.resultCode = resultCode;
    }

    public String getResultMsg()
    {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg)
    {
        this.resultMsg = resultMsg;
    }

    public List<T> getResultList()
    {
        return resultList;
    }

    public void setResultList(List<T> resultList)
    {
        this.resultList = resultList;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserNickName()
    {
        return userNickName;
    }

    public void setUserNickName(String userNickName)
    {
        this.userNickName = userNickName;
    }

    public String getUserType()
    {
        return userType;
    }

    public void setUserType(String userType)
    {
        this.userType = userType;
    }

    public String getTokenId()
    {
        return tokenId;
    }

    public void setTokenId(String tokenId)
    {
        this.tokenId = tokenId;
    }

    public T getResultEntity()
    {
        return resultEntity;
    }

    public void setResultEntity(T resultEntity)
    {
        this.resultEntity = resultEntity;
    }


    public void setXqName(String xqName)
    {
        this.xqName = xqName;
    }

    public String getWyLogo()
    {
        return wyLogo;
    }

    public void setWyLogo(String wyLogo)
    {
        this.wyLogo = wyLogo;
    }

}
