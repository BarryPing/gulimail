package com.tfp.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tfp.common.utils.PageUtils;
import com.tfp.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author tfp
 * @email tfp@gmail.com
 * @date 2023-08-13 13:34:47
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

