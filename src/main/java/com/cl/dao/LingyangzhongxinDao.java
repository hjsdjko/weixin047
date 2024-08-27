package com.cl.dao;

import com.cl.entity.LingyangzhongxinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LingyangzhongxinView;


/**
 * 领养中心
 * 
 * @author 
 * @email 
 * @date 2024-03-15 13:19:20
 */
public interface LingyangzhongxinDao extends BaseMapper<LingyangzhongxinEntity> {
	
	List<LingyangzhongxinView> selectListView(@Param("ew") Wrapper<LingyangzhongxinEntity> wrapper);

	List<LingyangzhongxinView> selectListView(Pagination page,@Param("ew") Wrapper<LingyangzhongxinEntity> wrapper);
	
	LingyangzhongxinView selectView(@Param("ew") Wrapper<LingyangzhongxinEntity> wrapper);
	

}
