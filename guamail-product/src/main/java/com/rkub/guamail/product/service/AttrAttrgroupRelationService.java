package com.rkub.guamail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rkub.common.utils.PageUtils;
import com.rkub.guamail.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author WangDada
 * @email 1063151660@qq.com
 * @date 2025-05-30 01:26:00
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

