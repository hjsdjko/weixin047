package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ChongwushoumaiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChongwushoumaiView;


/**
 * 宠物售卖
 *
 * @author 
 * @email 
 * @date 2024-03-15 13:19:20
 */
public interface ChongwushoumaiService extends IService<ChongwushoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwushoumaiView> selectListView(Wrapper<ChongwushoumaiEntity> wrapper);
   	
   	ChongwushoumaiView selectView(@Param("ew") Wrapper<ChongwushoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwushoumaiEntity> wrapper);
   	

}

