package com.ice.sell.repository;

import com.ice.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    /** 根据一定的 方法命名规则，就可以完成相应的功能，感觉要看一下JPA的源码部分了解一下怎么回事了*/
    List<ProductCategory> findProductCategoryByCategoryTypeIn (List<Integer> categoryTypeList);


}
