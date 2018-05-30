package com.ice.sell.service.impl;

import com.ice.sell.dataobject.ProductCategory;
import com.ice.sell.repository.ProductCategoryRepository;
import com.ice.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public ProductCategory findOne(Integer categoryType) {
        return productCategoryRepository.findOne(categoryType);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryRepository.findAll();
    }

    /**
     * 根据给定的categoryType的List集合 去查询出相应的ProductCategory结果集
     * @param categoryTypeList
     * @return List
     */
    @Override
    public List<ProductCategory> findProductCategoryByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findProductCategoryByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return productCategoryRepository.save(productCategory);
    }
}
