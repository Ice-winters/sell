package com.ice.sell.service;

import com.ice.sell.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    ProductCategory findOne(Integer categoryType);

    List<ProductCategory> findAll();

    /**
     * 根据给定的categoryType的List集合 去查询出ProductCategory结果集
     * @param categoryTypeList
     * @return List
     */
    List<ProductCategory> findProductCategoryByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);



}
