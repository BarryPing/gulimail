package com.tfp.gulimall.product.dao;

import com.tfp.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tfp
 * @email tfp@gmail.com
 * @date 2023-08-12 21:44:16
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
