package com.cl.dao;

import com.cl.entity.ChongwushoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChongwushoumaiView;


/**
 * 宠物售卖
 * 
 * @author 
 * @email 
 * @date 2024-03-15 13:19:20
 */
public interface ChongwushoumaiDao extends BaseMapper<ChongwushoumaiEntity> {
	
	List<ChongwushoumaiView> selectListView(@Param("ew") Wrapper<ChongwushoumaiEntity> wrapper);

	List<ChongwushoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwushoumaiEntity> wrapper);
	
	ChongwushoumaiView selectView(@Param("ew") Wrapper<ChongwushoumaiEntity> wrapper);
	

}
