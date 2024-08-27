package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusschongwushangpinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusschongwushangpinView;


/**
 * 宠物商品评论表
 *
 * @author 
 * @email 
 * @date 2024-03-15 13:19:21
 */
public interface DiscusschongwushangpinService extends IService<DiscusschongwushangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwushangpinView> selectListView(Wrapper<DiscusschongwushangpinEntity> wrapper);
   	
   	DiscusschongwushangpinView selectView(@Param("ew") Wrapper<DiscusschongwushangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwushangpinEntity> wrapper);
   	

}

