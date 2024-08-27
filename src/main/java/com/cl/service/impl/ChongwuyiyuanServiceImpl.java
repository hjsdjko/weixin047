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


import com.cl.dao.ChongwuyiyuanDao;
import com.cl.entity.ChongwuyiyuanEntity;
import com.cl.service.ChongwuyiyuanService;
import com.cl.entity.view.ChongwuyiyuanView;

@Service("chongwuyiyuanService")
public class ChongwuyiyuanServiceImpl extends ServiceImpl<ChongwuyiyuanDao, ChongwuyiyuanEntity> implements ChongwuyiyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwuyiyuanEntity> page = this.selectPage(
                new Query<ChongwuyiyuanEntity>(params).getPage(),
                new EntityWrapper<ChongwuyiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwuyiyuanEntity> wrapper) {
		  Page<ChongwuyiyuanView> page =new Query<ChongwuyiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ChongwuyiyuanView> selectListView(Wrapper<ChongwuyiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwuyiyuanView selectView(Wrapper<ChongwuyiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
