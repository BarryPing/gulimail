package com.tfp.gulimall.coupon.dao;

import com.tfp.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author tfp
 * @email tfp@gmail.com
 * @date 2023-08-13 10:54:10
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
