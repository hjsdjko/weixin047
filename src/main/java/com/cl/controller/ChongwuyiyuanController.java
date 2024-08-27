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

import com.cl.entity.ChongwuyiyuanEntity;
import com.cl.entity.view.ChongwuyiyuanView;

import com.cl.service.ChongwuyiyuanService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 宠物医院
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-15 13:19:21
 */
@RestController
@RequestMapping("/chongwuyiyuan")
public class ChongwuyiyuanController {
    @Autowired
    private ChongwuyiyuanService chongwuyiyuanService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwuyiyuanEntity chongwuyiyuan,
		HttpServletRequest request){
        EntityWrapper<ChongwuyiyuanEntity> ew = new EntityWrapper<ChongwuyiyuanEntity>();

		PageUtils page = chongwuyiyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuyiyuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwuyiyuanEntity chongwuyiyuan, 
		HttpServletRequest request){
        EntityWrapper<ChongwuyiyuanEntity> ew = new EntityWrapper<ChongwuyiyuanEntity>();

		PageUtils page = chongwuyiyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuyiyuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwuyiyuanEntity chongwuyiyuan){
       	EntityWrapper<ChongwuyiyuanEntity> ew = new EntityWrapper<ChongwuyiyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwuyiyuan, "chongwuyiyuan")); 
        return R.ok().put("data", chongwuyiyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwuyiyuanEntity chongwuyiyuan){
        EntityWrapper< ChongwuyiyuanEntity> ew = new EntityWrapper< ChongwuyiyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwuyiyuan, "chongwuyiyuan")); 
		ChongwuyiyuanView chongwuyiyuanView =  chongwuyiyuanService.selectView(ew);
		return R.ok("查询宠物医院成功").put("data", chongwuyiyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwuyiyuanEntity chongwuyiyuan = chongwuyiyuanService.selectById(id);
		chongwuyiyuan = chongwuyiyuanService.selectView(new EntityWrapper<ChongwuyiyuanEntity>().eq("id", id));
        return R.ok().put("data", chongwuyiyuan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwuyiyuanEntity chongwuyiyuan = chongwuyiyuanService.selectById(id);
		chongwuyiyuan = chongwuyiyuanService.selectView(new EntityWrapper<ChongwuyiyuanEntity>().eq("id", id));
        return R.ok().put("data", chongwuyiyuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwuyiyuanEntity chongwuyiyuan, HttpServletRequest request){
    	chongwuyiyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwuyiyuan);
        chongwuyiyuanService.insert(chongwuyiyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwuyiyuanEntity chongwuyiyuan, HttpServletRequest request){
    	chongwuyiyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwuyiyuan);
        chongwuyiyuanService.insert(chongwuyiyuan);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongwuyiyuanEntity chongwuyiyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwuyiyuan);
        chongwuyiyuanService.updateById(chongwuyiyuan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwuyiyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
