package com.cl.dao;

import com.cl.entity.ChongwuyiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChongwuyiyuanView;


/**
 * 宠物医院
 * 
 * @author 
 * @email 
 * @date 2024-03-15 13:19:21
 */
public interface ChongwuyiyuanDao extends BaseMapper<ChongwuyiyuanEntity> {
	
	List<ChongwuyiyuanView> selectListView(@Param("ew") Wrapper<ChongwuyiyuanEntity> wrapper);

	List<ChongwuyiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwuyiyuanEntity> wrapper);
	
	ChongwuyiyuanView selectView(@Param("ew") Wrapper<ChongwuyiyuanEntity> wrapper);
	

}
