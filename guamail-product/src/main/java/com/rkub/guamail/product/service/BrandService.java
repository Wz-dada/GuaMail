package com.rkub.guamail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rkub.common.utils.PageUtils;
import com.rkub.guamail.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author WangDada
 * @email 1063151660@qq.com
 * @date 2025-05-30 01:42:30
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

