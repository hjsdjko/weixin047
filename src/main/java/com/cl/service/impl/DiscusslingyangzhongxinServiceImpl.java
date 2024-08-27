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


import com.cl.dao.DiscusslingyangzhongxinDao;
import com.cl.entity.DiscusslingyangzhongxinEntity;
import com.cl.service.DiscusslingyangzhongxinService;
import com.cl.entity.view.DiscusslingyangzhongxinView;

@Service("discusslingyangzhongxinService")
public class DiscusslingyangzhongxinServiceImpl extends ServiceImpl<DiscusslingyangzhongxinDao, DiscusslingyangzhongxinEntity> implements DiscusslingyangzhongxinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusslingyangzhongxinEntity> page = this.selectPage(
                new Query<DiscusslingyangzhongxinEntity>(params).getPage(),
                new EntityWrapper<DiscusslingyangzhongxinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusslingyangzhongxinEntity> wrapper) {
		  Page<DiscusslingyangzhongxinView> page =new Query<DiscusslingyangzhongxinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscusslingyangzhongxinView> selectListView(Wrapper<DiscusslingyangzhongxinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusslingyangzhongxinView selectView(Wrapper<DiscusslingyangzhongxinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
