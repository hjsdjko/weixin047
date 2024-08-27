package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.LingyangxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LingyangxinxiView;


/**
 * 领养信息
 *
 * @author 
 * @email 
 * @date 2024-03-15 13:19:20
 */
public interface LingyangxinxiService extends IService<LingyangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingyangxinxiView> selectListView(Wrapper<LingyangxinxiEntity> wrapper);
   	
   	LingyangxinxiView selectView(@Param("ew") Wrapper<LingyangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingyangxinxiEntity> wrapper);
   	

}

