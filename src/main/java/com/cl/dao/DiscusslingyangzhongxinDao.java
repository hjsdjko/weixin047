package com.cl.dao;

import com.cl.entity.DiscusslingyangzhongxinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusslingyangzhongxinView;


/**
 * 领养中心评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-15 13:19:21
 */
public interface DiscusslingyangzhongxinDao extends BaseMapper<DiscusslingyangzhongxinEntity> {
	
	List<DiscusslingyangzhongxinView> selectListView(@Param("ew") Wrapper<DiscusslingyangzhongxinEntity> wrapper);

	List<DiscusslingyangzhongxinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslingyangzhongxinEntity> wrapper);
	
	DiscusslingyangzhongxinView selectView(@Param("ew") Wrapper<DiscusslingyangzhongxinEntity> wrapper);
	

}
