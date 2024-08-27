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


import com.cl.dao.DiscusschongwushangpinDao;
import com.cl.entity.DiscusschongwushangpinEntity;
import com.cl.service.DiscusschongwushangpinService;
import com.cl.entity.view.DiscusschongwushangpinView;

@Service("discusschongwushangpinService")
public class DiscusschongwushangpinServiceImpl extends ServiceImpl<DiscusschongwushangpinDao, DiscusschongwushangpinEntity> implements DiscusschongwushangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwushangpinEntity> page = this.selectPage(
                new Query<DiscusschongwushangpinEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwushangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwushangpinEntity> wrapper) {
		  Page<DiscusschongwushangpinView> page =new Query<DiscusschongwushangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscusschongwushangpinView> selectListView(Wrapper<DiscusschongwushangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwushangpinView selectView(Wrapper<DiscusschongwushangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
