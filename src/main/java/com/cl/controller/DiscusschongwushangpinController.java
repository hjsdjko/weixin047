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

import com.cl.entity.DiscusschongwushangpinEntity;
import com.cl.entity.view.DiscusschongwushangpinView;

import com.cl.service.DiscusschongwushangpinService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 宠物商品评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-15 13:19:21
 */
@RestController
@RequestMapping("/discusschongwushangpin")
public class DiscusschongwushangpinController {
    @Autowired
    private DiscusschongwushangpinService discusschongwushangpinService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusschongwushangpinEntity discusschongwushangpin,
		HttpServletRequest request){
        EntityWrapper<DiscusschongwushangpinEntity> ew = new EntityWrapper<DiscusschongwushangpinEntity>();

		PageUtils page = discusschongwushangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschongwushangpin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusschongwushangpinEntity discusschongwushangpin, 
		HttpServletRequest request){
        EntityWrapper<DiscusschongwushangpinEntity> ew = new EntityWrapper<DiscusschongwushangpinEntity>();

		PageUtils page = discusschongwushangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschongwushangpin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusschongwushangpinEntity discusschongwushangpin){
       	EntityWrapper<DiscusschongwushangpinEntity> ew = new EntityWrapper<DiscusschongwushangpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusschongwushangpin, "discusschongwushangpin")); 
        return R.ok().put("data", discusschongwushangpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusschongwushangpinEntity discusschongwushangpin){
        EntityWrapper< DiscusschongwushangpinEntity> ew = new EntityWrapper< DiscusschongwushangpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusschongwushangpin, "discusschongwushangpin")); 
		DiscusschongwushangpinView discusschongwushangpinView =  discusschongwushangpinService.selectView(ew);
		return R.ok("查询宠物商品评论表成功").put("data", discusschongwushangpinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusschongwushangpinEntity discusschongwushangpin = discusschongwushangpinService.selectById(id);
		discusschongwushangpin = discusschongwushangpinService.selectView(new EntityWrapper<DiscusschongwushangpinEntity>().eq("id", id));
        return R.ok().put("data", discusschongwushangpin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusschongwushangpinEntity discusschongwushangpin = discusschongwushangpinService.selectById(id);
		discusschongwushangpin = discusschongwushangpinService.selectView(new EntityWrapper<DiscusschongwushangpinEntity>().eq("id", id));
        return R.ok().put("data", discusschongwushangpin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusschongwushangpinEntity discusschongwushangpin, HttpServletRequest request){
    	discusschongwushangpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusschongwushangpin);
        discusschongwushangpinService.insert(discusschongwushangpin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusschongwushangpinEntity discusschongwushangpin, HttpServletRequest request){
    	discusschongwushangpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusschongwushangpin);
        discusschongwushangpinService.insert(discusschongwushangpin);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscusschongwushangpinEntity discusschongwushangpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusschongwushangpin);
        discusschongwushangpinService.updateById(discusschongwushangpin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusschongwushangpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscusschongwushangpinEntity discusschongwushangpin, HttpServletRequest request,String pre){
        EntityWrapper<DiscusschongwushangpinEntity> ew = new EntityWrapper<DiscusschongwushangpinEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = discusschongwushangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschongwushangpin), params), params));
        return R.ok().put("data", page);
    }








}
