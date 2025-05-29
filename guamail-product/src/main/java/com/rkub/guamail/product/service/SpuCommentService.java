package com.rkub.guamail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rkub.common.utils.PageUtils;
import com.rkub.guamail.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author WangDada
 * @email 1063151660@qq.com
 * @date 2025-05-30 01:26:00
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

