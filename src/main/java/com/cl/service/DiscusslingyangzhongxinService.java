package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusslingyangzhongxinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusslingyangzhongxinView;


/**
 * 领养中心评论表
 *
 * @author 
 * @email 
 * @date 2024-03-15 13:19:21
 */
public interface DiscusslingyangzhongxinService extends IService<DiscusslingyangzhongxinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusslingyangzhongxinView> selectListView(Wrapper<DiscusslingyangzhongxinEntity> wrapper);
   	
   	DiscusslingyangzhongxinView selectView(@Param("ew") Wrapper<DiscusslingyangzhongxinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusslingyangzhongxinEntity> wrapper);
   	

}

