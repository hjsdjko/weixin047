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


import com.cl.dao.ChongwushoumaiDao;
import com.cl.entity.ChongwushoumaiEntity;
import com.cl.service.ChongwushoumaiService;
import com.cl.entity.view.ChongwushoumaiView;

@Service("chongwushoumaiService")
public class ChongwushoumaiServiceImpl extends ServiceImpl<ChongwushoumaiDao, ChongwushoumaiEntity> implements ChongwushoumaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwushoumaiEntity> page = this.selectPage(
                new Query<ChongwushoumaiEntity>(params).getPage(),
                new EntityWrapper<ChongwushoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwushoumaiEntity> wrapper) {
		  Page<ChongwushoumaiView> page =new Query<ChongwushoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ChongwushoumaiView> selectListView(Wrapper<ChongwushoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwushoumaiView selectView(Wrapper<ChongwushoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
