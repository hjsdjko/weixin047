package com.cl.dao;

import com.cl.entity.LingyangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LingyangxinxiView;


/**
 * 领养信息
 * 
 * @author 
 * @email 
 * @date 2024-03-15 13:19:20
 */
public interface LingyangxinxiDao extends BaseMapper<LingyangxinxiEntity> {
	
	List<LingyangxinxiView> selectListView(@Param("ew") Wrapper<LingyangxinxiEntity> wrapper);

	List<LingyangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LingyangxinxiEntity> wrapper);
	
	LingyangxinxiView selectView(@Param("ew") Wrapper<LingyangxinxiEntity> wrapper);
	

}
