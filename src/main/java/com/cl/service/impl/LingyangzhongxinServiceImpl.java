package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.LingyangzhongxinDao;
import com.cl.entity.LingyangzhongxinEntity;
import com.cl.service.LingyangzhongxinService;
import com.cl.entity.view.LingyangzhongxinView;

@Service("lingyangzhongxinService")
public class LingyangzhongxinServiceImpl extends ServiceImpl<LingyangzhongxinDao, LingyangzhongxinEntity> implements LingyangzhongxinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingyangzhongxinEntity> page = this.selectPage(
                new Query<LingyangzhongxinEntity>(params).getPage(),
                new EntityWrapper<LingyangzhongxinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingyangzhongxinEntity> wrapper) {
		  Page<LingyangzhongxinView> page =new Query<LingyangzhongxinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<LingyangzhongxinView> selectListView(Wrapper<LingyangzhongxinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingyangzhongxinView selectView(Wrapper<LingyangzhongxinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
