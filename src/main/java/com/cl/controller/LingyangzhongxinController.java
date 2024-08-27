package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.LingyangzhongxinEntity;
import com.cl.entity.view.LingyangzhongxinView;

import com.cl.service.LingyangzhongxinService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 领养中心
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-15 13:19:20
 */
@RestController
@RequestMapping("/lingyangzhongxin")
public class LingyangzhongxinController {
    @Autowired
    private LingyangzhongxinService lingyangzhongxinService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LingyangzhongxinEntity lingyangzhongxin,
		HttpServletRequest request){
        EntityWrapper<LingyangzhongxinEntity> ew = new EntityWrapper<LingyangzhongxinEntity>();

		PageUtils page = lingyangzhongxinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lingyangzhongxin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LingyangzhongxinEntity lingyangzhongxin, 
		HttpServletRequest request){
        EntityWrapper<LingyangzhongxinEntity> ew = new EntityWrapper<LingyangzhongxinEntity>();

		PageUtils page = lingyangzhongxinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lingyangzhongxin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LingyangzhongxinEntity lingyangzhongxin){
       	EntityWrapper<LingyangzhongxinEntity> ew = new EntityWrapper<LingyangzhongxinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( lingyangzhongxin, "lingyangzhongxin")); 
        return R.ok().put("data", lingyangzhongxinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LingyangzhongxinEntity lingyangzhongxin){
        EntityWrapper< LingyangzhongxinEntity> ew = new EntityWrapper< LingyangzhongxinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( lingyangzhongxin, "lingyangzhongxin")); 
		LingyangzhongxinView lingyangzhongxinView =  lingyangzhongxinService.selectView(ew);
		return R.ok("查询领养中心成功").put("data", lingyangzhongxinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LingyangzhongxinEntity lingyangzhongxin = lingyangzhongxinService.selectById(id);
		lingyangzhongxin = lingyangzhongxinService.selectView(new EntityWrapper<LingyangzhongxinEntity>().eq("id", id));
        return R.ok().put("data", lingyangzhongxin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LingyangzhongxinEntity lingyangzhongxin = lingyangzhongxinService.selectById(id);
		lingyangzhongxin = lingyangzhongxinService.selectView(new EntityWrapper<LingyangzhongxinEntity>().eq("id", id));
        return R.ok().put("data", lingyangzhongxin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LingyangzhongxinEntity lingyangzhongxin, HttpServletRequest request){
    	lingyangzhongxin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lingyangzhongxin);
        lingyangzhongxinService.insert(lingyangzhongxin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LingyangzhongxinEntity lingyangzhongxin, HttpServletRequest request){
    	lingyangzhongxin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lingyangzhongxin);
        lingyangzhongxinService.insert(lingyangzhongxin);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody LingyangzhongxinEntity lingyangzhongxin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(lingyangzhongxin);
        lingyangzhongxinService.updateById(lingyangzhongxin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        lingyangzhongxinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
