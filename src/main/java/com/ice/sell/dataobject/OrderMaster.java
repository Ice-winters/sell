package com.ice.sell.dataobject;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "order_master", schema = "sell", catalog = "")
public class OrderMaster {
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private byte orderStatus;
    private byte payStatus;
    private Timestamp createTime;
    private Timestamp updateTime;

    @Id
    @Column(name = "order_id")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "buyer_name")
    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    @Basic
    @Column(name = "buyer_phone")
    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    @Basic
    @Column(name = "buyer_address")
    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    @Basic
    @Column(name = "buyer_openid")
    public String getBuyerOpenid() {
        return buyerOpenid;
    }

    public void setBuyerOpenid(String buyerOpenid) {
        this.buyerOpenid = buyerOpenid;
    }

    @Basic
    @Column(name = "order_amount")
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    @Basic
    @Column(name = "order_status")
    public byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "pay_status")
    public byte getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(byte payStatus) {
        this.payStatus = payStatus;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderMaster that = (OrderMaster) o;
        return orderStatus == that.orderStatus &&
                payStatus == that.payStatus &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(buyerName, that.buyerName) &&
                Objects.equals(buyerPhone, that.buyerPhone) &&
                Objects.equals(buyerAddress, that.buyerAddress) &&
                Objects.equals(buyerOpenid, that.buyerOpenid) &&
                Objects.equals(orderAmount, that.orderAmount) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(orderId, buyerName, buyerPhone, buyerAddress, buyerOpenid, orderAmount, orderStatus, payStatus, createTime, updateTime);
    }
}
