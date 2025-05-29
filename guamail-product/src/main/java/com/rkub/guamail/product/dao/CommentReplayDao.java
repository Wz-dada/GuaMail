package com.rkub.guamail.product.dao;

import com.rkub.guamail.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author WangDada
 * @email 1063151660@qq.com
 * @date 2025-05-30 01:42:30
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
