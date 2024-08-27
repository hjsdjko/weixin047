package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ChongwuyiyuanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChongwuyiyuanView;


/**
 * 宠物医院
 *
 * @author 
 * @email 
 * @date 2024-03-15 13:19:21
 */
public interface ChongwuyiyuanService extends IService<ChongwuyiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwuyiyuanView> selectListView(Wrapper<ChongwuyiyuanEntity> wrapper);
   	
   	ChongwuyiyuanView selectView(@Param("ew") Wrapper<ChongwuyiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwuyiyuanEntity> wrapper);
   	

}

