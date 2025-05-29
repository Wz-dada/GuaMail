package com.rkub.guamail.product.dao;

import com.rkub.guamail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author WangDada
 * @email 1063151660@qq.com
 * @date 2025-05-30 01:42:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
