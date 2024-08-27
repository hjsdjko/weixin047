package com.cl.dao;

import com.cl.entity.DiscusschongwushangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusschongwushangpinView;


/**
 * 宠物商品评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-15 13:19:21
 */
public interface DiscusschongwushangpinDao extends BaseMapper<DiscusschongwushangpinEntity> {
	
	List<DiscusschongwushangpinView> selectListView(@Param("ew") Wrapper<DiscusschongwushangpinEntity> wrapper);

	List<DiscusschongwushangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwushangpinEntity> wrapper);
	
	DiscusschongwushangpinView selectView(@Param("ew") Wrapper<DiscusschongwushangpinEntity> wrapper);
	

}
