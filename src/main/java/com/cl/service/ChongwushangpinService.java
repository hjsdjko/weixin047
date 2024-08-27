package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ChongwushangpinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChongwushangpinView;


/**
 * 宠物商品
 *
 * @author 
 * @email 
 * @date 2024-03-15 13:19:20
 */
public interface ChongwushangpinService extends IService<ChongwushangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwushangpinView> selectListView(Wrapper<ChongwushangpinEntity> wrapper);
   	
   	ChongwushangpinView selectView(@Param("ew") Wrapper<ChongwushangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwushangpinEntity> wrapper);
   	

}

