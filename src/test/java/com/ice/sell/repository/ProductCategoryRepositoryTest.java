package com.ice.sell.repository;

import com.ice.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void testFindOne() {
        ProductCategory one = productCategoryRepository.findOne(1);
        System.out.println("------------------------------------------------");
        System.out.println(one.toString());
        System.out.println("------------------------------------------------");
    }

    @Test
    public void testSaveOne() {
        ProductCategory category = new ProductCategory();
        //category.setCategoryId(1);
        category.setCategoryName("女生最喜欢的");
        category.setCategoryType(3);

        ProductCategory save = productCategoryRepository.save(category);
        System.out.println(save);
    }

    @Test
    public void testUpdateOne() {
        ProductCategory category = productCategoryRepository.findOne(2);
        category.setCategoryName("女生最喜欢的yes");
        category.setCategoryType(11);

        ProductCategory save = productCategoryRepository.save(category);
        System.out.println(save);
    }

    @Test
    public void testSaveOne2() {
        ProductCategory category = new ProductCategory("夏天穿的衣服", 12);

        ProductCategory result = productCategoryRepository.save(category);
        Assert.assertNotNull("你好小鬼，你保存的数据result为："+result+" not null",result);
        Assert.assertNotEquals(null,result);
        System.out.println(result);
    }
    @Test
    public void testFindOne2() {
        ProductCategory category = productCategoryRepository.findOne(5);

        Assert.assertNotNull("你好小鬼，你查询到的数据result为："+category+"  it cannot be null",category);
        //Assert.assertNotEquals(null,category);
        System.out.println(category);
    }

    @Test
    public void testFindAll (){
        // 这里的list中的数字代表的是主键categoryId,根据list中的主键查询出结果，查到的返回成一个list
        List<Integer> list = Arrays.asList(1, 3, 6);
        List<ProductCategory> all = productCategoryRepository.findAll(list);
        System.out.println(all);
    }

    @Test
    public void testFindAllByCategoryType() {
        // 这里的list中的数字代表的是categoryType的值,根据list中的值查询出结果，查到的返回成一个list
        List<Integer> list = Arrays.asList(1, 3, 6,11,12);
        List<ProductCategory> categoryList = productCategoryRepository.findProductCategoryByCategoryTypeIn(list);
        System.out.println(categoryList);
    }
}