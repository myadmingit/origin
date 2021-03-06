package com.local.domain;

import com.local.util.DateUtil;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.ParseException;
import java.util.Date;

/**
 * 实体类
 */
public class Product {
    private String id;//主键
    private String productNum;//编号 唯一
    private String productName;//名称
    private String cityName;//出发城市
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date departureTime;//出发时间
    private String departureTimeStr;
    private Double productPrice;//产品价格
    private String ProductDesc;//产品描述
    private Integer productStatus;//状态 0关闭 1打开
    private String  productStatusStr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Date getDepartureTime() {

        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {

        this.departureTime = departureTime;
    }

    public String getDepartureTimeStr() {
        if (departureTime!=null){
            departureTimeStr = DateUtil.dateString(departureTime, "yyyy:MM:dd HH:mm:ss");

        }
        return departureTimeStr;
    }

    public void setDepartureTimeStr(String departureTimeStr) {
        this.departureTimeStr = departureTimeStr;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesc() {
        return ProductDesc;
    }

    public void setProductDesc(String productDesc) {
        ProductDesc = productDesc;
    }

    public Integer getProductStatus() {

        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductStatusStr() {
        if(productStatus!=null){
            if (productStatus==0){
                productStatusStr="关闭";
            }
            if (productStatus==1){
                productStatusStr="打开";
            }

        }
        return productStatusStr;
    }

    public void setProductStatusStr(String productStatusStr) {

        this.productStatusStr = productStatusStr;
    }

}
