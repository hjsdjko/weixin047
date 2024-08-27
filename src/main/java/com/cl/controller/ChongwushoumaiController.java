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
import com.cl.entity.OrdersEntity;
import com.cl.service.OrdersService;

import com.cl.entity.ChongwushoumaiEntity;
import com.cl.entity.view.ChongwushoumaiView;

import com.cl.service.ChongwushoumaiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 宠物售卖
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-15 13:19:20
 */
@RestController
@RequestMapping("/chongwushoumai")
public class ChongwushoumaiController {
    @Autowired
    private ChongwushoumaiService chongwushoumaiService;

    @Autowired
    private StoreupService storeupService;

    @Autowired
    private OrdersService ordersService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwushoumaiEntity chongwushoumai,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			chongwushoumai.setShangjiazhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChongwushoumaiEntity> ew = new EntityWrapper<ChongwushoumaiEntity>();

		PageUtils page = chongwushoumaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwushoumai), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwushoumaiEntity chongwushoumai, 
		HttpServletRequest request){
        EntityWrapper<ChongwushoumaiEntity> ew = new EntityWrapper<ChongwushoumaiEntity>();

		PageUtils page = chongwushoumaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwushoumai), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwushoumaiEntity chongwushoumai){
       	EntityWrapper<ChongwushoumaiEntity> ew = new EntityWrapper<ChongwushoumaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwushoumai, "chongwushoumai")); 
        return R.ok().put("data", chongwushoumaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwushoumaiEntity chongwushoumai){
        EntityWrapper< ChongwushoumaiEntity> ew = new EntityWrapper< ChongwushoumaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwushoumai, "chongwushoumai")); 
		ChongwushoumaiView chongwushoumaiView =  chongwushoumaiService.selectView(ew);
		return R.ok("查询宠物售卖成功").put("data", chongwushoumaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwushoumaiEntity chongwushoumai = chongwushoumaiService.selectById(id);
		chongwushoumai.setClicktime(new Date());
		chongwushoumaiService.updateById(chongwushoumai);
		chongwushoumai = chongwushoumaiService.selectView(new EntityWrapper<ChongwushoumaiEntity>().eq("id", id));
        return R.ok().put("data", chongwushoumai);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwushoumaiEntity chongwushoumai = chongwushoumaiService.selectById(id);
		chongwushoumai.setClicktime(new Date());
		chongwushoumaiService.updateById(chongwushoumai);
		chongwushoumai = chongwushoumaiService.selectView(new EntityWrapper<ChongwushoumaiEntity>().eq("id", id));
        return R.ok().put("data", chongwushoumai);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwushoumaiEntity chongwushoumai, HttpServletRequest request){
    	chongwushoumai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwushoumai);
        chongwushoumaiService.insert(chongwushoumai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwushoumaiEntity chongwushoumai, HttpServletRequest request){
    	chongwushoumai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwushoumai);
        chongwushoumaiService.insert(chongwushoumai);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongwushoumaiEntity chongwushoumai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwushoumai);
        chongwushoumaiService.updateById(chongwushoumai);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwushoumaiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ChongwushoumaiEntity chongwushoumai, HttpServletRequest request,String pre){
        EntityWrapper<ChongwushoumaiEntity> ew = new EntityWrapper<ChongwushoumaiEntity>();
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
		PageUtils page = chongwushoumaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwushoumai), params), params));
        return R.ok().put("data", page);
    }

        /**
     * 按用户购买推荐
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,ChongwushoumaiEntity chongwushoumai, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String goodtypeColumn = "diqu";
        List<OrdersEntity> orders = ordersService.selectList(new EntityWrapper<OrdersEntity>().eq("userid", userId).eq("tablename", "chongwushoumai").orderBy("addtime", false));
        List<String> goodtypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<ChongwushoumaiEntity> chongwushoumaiList = new ArrayList<ChongwushoumaiEntity>();
	//去重
    	List<OrdersEntity> ordersDist = new ArrayList<OrdersEntity>();
    	for(OrdersEntity o1 : orders) {
    		boolean addFlag = true;
    		for(OrdersEntity o2 : ordersDist) {
    			if(o1.getGoodid()==o2.getGoodid() || o1.getGoodtype().equals(o2.getGoodtype())) {
    				addFlag = false;
    				break;
    			}
    		}
    		if(addFlag) ordersDist.add(o1);
    	}
        if(ordersDist!=null && ordersDist.size()>0) {
                for(OrdersEntity o : ordersDist) {
                        chongwushoumaiList.addAll(chongwushoumaiService.selectList(new EntityWrapper<ChongwushoumaiEntity>().eq(goodtypeColumn, o.getGoodtype())));
                }
        }
        EntityWrapper<ChongwushoumaiEntity> ew = new EntityWrapper<ChongwushoumaiEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = chongwushoumaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwushoumai), params), params));
        List<ChongwushoumaiEntity> pageList = (List<ChongwushoumaiEntity>)page.getList();
        if(chongwushoumaiList.size()<limit) {
                int toAddNum = (limit-chongwushoumaiList.size())<=pageList.size()?(limit-chongwushoumaiList.size()):pageList.size();
                for(ChongwushoumaiEntity o1 : pageList) {
                    boolean addFlag = true;
                    for(ChongwushoumaiEntity o2 : chongwushoumaiList) {
                        if(o1.getId().intValue()==o2.getId().intValue()) {
                            addFlag = false;
                            break;
                        }
                    }
                    if(addFlag) {
                        chongwushoumaiList.add(o1);
                        if(--toAddNum==0) break;
                    }   
                }
        } else if(chongwushoumaiList.size()>limit) {
            chongwushoumaiList = chongwushoumaiList.subList(0, limit);
        }
        page.setList(chongwushoumaiList);
        return R.ok().put("data", page);
    }







}
