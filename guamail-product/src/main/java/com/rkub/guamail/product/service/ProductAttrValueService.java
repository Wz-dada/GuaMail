package com.rkub.guamail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rkub.common.utils.PageUtils;
import com.rkub.guamail.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author WangDada
 * @email 1063151660@qq.com
 * @date 2025-05-30 01:42:30
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

