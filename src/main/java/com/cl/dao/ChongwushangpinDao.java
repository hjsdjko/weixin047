package com.cl.dao;

import com.cl.entity.ChongwushangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChongwushangpinView;


/**
 * 宠物商品
 * 
 * @author 
 * @email 
 * @date 2024-03-15 13:19:20
 */
public interface ChongwushangpinDao extends BaseMapper<ChongwushangpinEntity> {
	
	List<ChongwushangpinView> selectListView(@Param("ew") Wrapper<ChongwushangpinEntity> wrapper);

	List<ChongwushangpinView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwushangpinEntity> wrapper);
	
	ChongwushangpinView selectView(@Param("ew") Wrapper<ChongwushangpinEntity> wrapper);
	

}
