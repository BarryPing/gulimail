package com.tfp.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tfp.gulimall.product.entity.BrandEntity;
import com.tfp.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author tfp
 * @create 2023-08-12 22:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads(){
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("apple");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", "1L"));
        list.forEach(item->{
            System.out.println(item);
        });
    }
}
