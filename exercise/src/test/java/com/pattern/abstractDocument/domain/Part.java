package com.pattern.abstractDocument.domain;

import java.util.Map;

import com.pattern.abstractDocument.AbstractDocument;

/**
 * 部件
 * 
 * @author  xueshaoqi
 * @version  [版本号, 2019年3月21日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Part extends AbstractDocument implements HasModel,HasType,HasPrices
{

    public Part(Map<String, Object> properties)
    {
        super(properties);
    }
    
}
