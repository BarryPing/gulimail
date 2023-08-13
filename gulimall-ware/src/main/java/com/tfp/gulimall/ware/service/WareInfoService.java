package com.tfp.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tfp.common.utils.PageUtils;
import com.tfp.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author tfp
 * @email tfp@gmail.com
 * @date 2023-08-13 17:46:10
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

