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

import com.cl.entity.DiscusslingyangzhongxinEntity;
import com.cl.entity.view.DiscusslingyangzhongxinView;

import com.cl.service.DiscusslingyangzhongxinService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 领养中心评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-15 13:19:21
 */
@RestController
@RequestMapping("/discusslingyangzhongxin")
public class DiscusslingyangzhongxinController {
    @Autowired
    private DiscusslingyangzhongxinService discusslingyangzhongxinService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusslingyangzhongxinEntity discusslingyangzhongxin,
		HttpServletRequest request){
        EntityWrapper<DiscusslingyangzhongxinEntity> ew = new EntityWrapper<DiscusslingyangzhongxinEntity>();

		PageUtils page = discusslingyangzhongxinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusslingyangzhongxin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusslingyangzhongxinEntity discusslingyangzhongxin, 
		HttpServletRequest request){
        EntityWrapper<DiscusslingyangzhongxinEntity> ew = new EntityWrapper<DiscusslingyangzhongxinEntity>();

		PageUtils page = discusslingyangzhongxinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusslingyangzhongxin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusslingyangzhongxinEntity discusslingyangzhongxin){
       	EntityWrapper<DiscusslingyangzhongxinEntity> ew = new EntityWrapper<DiscusslingyangzhongxinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusslingyangzhongxin, "discusslingyangzhongxin")); 
        return R.ok().put("data", discusslingyangzhongxinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusslingyangzhongxinEntity discusslingyangzhongxin){
        EntityWrapper< DiscusslingyangzhongxinEntity> ew = new EntityWrapper< DiscusslingyangzhongxinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusslingyangzhongxin, "discusslingyangzhongxin")); 
		DiscusslingyangzhongxinView discusslingyangzhongxinView =  discusslingyangzhongxinService.selectView(ew);
		return R.ok("查询领养中心评论表成功").put("data", discusslingyangzhongxinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusslingyangzhongxinEntity discusslingyangzhongxin = discusslingyangzhongxinService.selectById(id);
		discusslingyangzhongxin = discusslingyangzhongxinService.selectView(new EntityWrapper<DiscusslingyangzhongxinEntity>().eq("id", id));
        return R.ok().put("data", discusslingyangzhongxin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusslingyangzhongxinEntity discusslingyangzhongxin = discusslingyangzhongxinService.selectById(id);
		discusslingyangzhongxin = discusslingyangzhongxinService.selectView(new EntityWrapper<DiscusslingyangzhongxinEntity>().eq("id", id));
        return R.ok().put("data", discusslingyangzhongxin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusslingyangzhongxinEntity discusslingyangzhongxin, HttpServletRequest request){
    	discusslingyangzhongxin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusslingyangzhongxin);
        discusslingyangzhongxinService.insert(discusslingyangzhongxin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusslingyangzhongxinEntity discusslingyangzhongxin, HttpServletRequest request){
    	discusslingyangzhongxin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusslingyangzhongxin);
        discusslingyangzhongxinService.insert(discusslingyangzhongxin);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscusslingyangzhongxinEntity discusslingyangzhongxin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusslingyangzhongxin);
        discusslingyangzhongxinService.updateById(discusslingyangzhongxin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusslingyangzhongxinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscusslingyangzhongxinEntity discusslingyangzhongxin, HttpServletRequest request,String pre){
        EntityWrapper<DiscusslingyangzhongxinEntity> ew = new EntityWrapper<DiscusslingyangzhongxinEntity>();
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
		PageUtils page = discusslingyangzhongxinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusslingyangzhongxin), params), params));
        return R.ok().put("data", page);
    }








}
