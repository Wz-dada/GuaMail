package com.rkub.guamail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rkub.common.utils.PageUtils;
import com.rkub.guamail.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author WangDada
 * @email 1063151660@qq.com
 * @date 2025-05-30 01:42:31
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

