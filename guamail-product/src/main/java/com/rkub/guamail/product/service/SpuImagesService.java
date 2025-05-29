package com.rkub.guamail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rkub.common.utils.PageUtils;
import com.rkub.guamail.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author WangDada
 * @email 1063151660@qq.com
 * @date 2025-05-30 01:26:00
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

