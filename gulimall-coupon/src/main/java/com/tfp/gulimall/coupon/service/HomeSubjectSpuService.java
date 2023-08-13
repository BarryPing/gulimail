package com.tfp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tfp.common.utils.PageUtils;
import com.tfp.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author tfp
 * @email tfp@gmail.com
 * @date 2023-08-13 10:54:10
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

