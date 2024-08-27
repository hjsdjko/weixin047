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


import com.cl.dao.DiscusschongwushoumaiDao;
import com.cl.entity.DiscusschongwushoumaiEntity;
import com.cl.service.DiscusschongwushoumaiService;
import com.cl.entity.view.DiscusschongwushoumaiView;

@Service("discusschongwushoumaiService")
public class DiscusschongwushoumaiServiceImpl extends ServiceImpl<DiscusschongwushoumaiDao, DiscusschongwushoumaiEntity> implements DiscusschongwushoumaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwushoumaiEntity> page = this.selectPage(
                new Query<DiscusschongwushoumaiEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwushoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwushoumaiEntity> wrapper) {
		  Page<DiscusschongwushoumaiView> page =new Query<DiscusschongwushoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscusschongwushoumaiView> selectListView(Wrapper<DiscusschongwushoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwushoumaiView selectView(Wrapper<DiscusschongwushoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
