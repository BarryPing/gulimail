package com.tfp.gulimall.order.dao;

import com.tfp.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author tfp
 * @email tfp@gmail.com
 * @date 2023-08-13 17:38:08
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
