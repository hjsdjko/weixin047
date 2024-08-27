package com.cl.dao;

import com.cl.entity.DiscusschongwushoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusschongwushoumaiView;


/**
 * 宠物售卖评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-15 13:19:21
 */
public interface DiscusschongwushoumaiDao extends BaseMapper<DiscusschongwushoumaiEntity> {
	
	List<DiscusschongwushoumaiView> selectListView(@Param("ew") Wrapper<DiscusschongwushoumaiEntity> wrapper);

	List<DiscusschongwushoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwushoumaiEntity> wrapper);
	
	DiscusschongwushoumaiView selectView(@Param("ew") Wrapper<DiscusschongwushoumaiEntity> wrapper);
	

}
