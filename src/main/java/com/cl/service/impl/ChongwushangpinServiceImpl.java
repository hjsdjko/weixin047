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


import com.cl.dao.ChongwushangpinDao;
import com.cl.entity.ChongwushangpinEntity;
import com.cl.service.ChongwushangpinService;
import com.cl.entity.view.ChongwushangpinView;

@Service("chongwushangpinService")
public class ChongwushangpinServiceImpl extends ServiceImpl<ChongwushangpinDao, ChongwushangpinEntity> implements ChongwushangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwushangpinEntity> page = this.selectPage(
                new Query<ChongwushangpinEntity>(params).getPage(),
                new EntityWrapper<ChongwushangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwushangpinEntity> wrapper) {
		  Page<ChongwushangpinView> page =new Query<ChongwushangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ChongwushangpinView> selectListView(Wrapper<ChongwushangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwushangpinView selectView(Wrapper<ChongwushangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
