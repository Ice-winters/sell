package com.ice.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@DynamicUpdate
@Table(name = "product_category")
public class ProductCategory {
    /*类目id */
    @Id
    @GeneratedValue
    private int categoryId;
    /*类目名字*/
    private String categoryName;

    /*类目编号*/

    private int categoryType;
    private Timestamp createTime;

    private Timestamp updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, int categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    @Id
    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "category_name")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Basic
    @Column(name = "category_type")
    public int getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(int categoryType) {
        this.categoryType = categoryType;
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
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

}
