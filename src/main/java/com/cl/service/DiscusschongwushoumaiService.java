package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusschongwushoumaiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusschongwushoumaiView;


/**
 * 宠物售卖评论表
 *
 * @author 
 * @email 
 * @date 2024-03-15 13:19:21
 */
public interface DiscusschongwushoumaiService extends IService<DiscusschongwushoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwushoumaiView> selectListView(Wrapper<DiscusschongwushoumaiEntity> wrapper);
   	
   	DiscusschongwushoumaiView selectView(@Param("ew") Wrapper<DiscusschongwushoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwushoumaiEntity> wrapper);
   	

}

