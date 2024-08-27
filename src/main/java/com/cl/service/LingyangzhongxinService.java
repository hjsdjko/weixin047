package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.LingyangzhongxinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LingyangzhongxinView;


/**
 * 领养中心
 *
 * @author 
 * @email 
 * @date 2024-03-15 13:19:20
 */
public interface LingyangzhongxinService extends IService<LingyangzhongxinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingyangzhongxinView> selectListView(Wrapper<LingyangzhongxinEntity> wrapper);
   	
   	LingyangzhongxinView selectView(@Param("ew") Wrapper<LingyangzhongxinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingyangzhongxinEntity> wrapper);
   	

}

