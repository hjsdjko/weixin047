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

import com.cl.entity.ChongwushangpinEntity;
import com.cl.entity.view.ChongwushangpinView;

import com.cl.service.ChongwushangpinService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 宠物商品
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-15 13:19:20
 */
@RestController
@RequestMapping("/chongwushangpin")
public class ChongwushangpinController {
    @Autowired
    private ChongwushangpinService chongwushangpinService;

    @Autowired
    private StoreupService storeupService;

    @Autowired
    private OrdersService ordersService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwushangpinEntity chongwushangpin,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			chongwushangpin.setShangjiazhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChongwushangpinEntity> ew = new EntityWrapper<ChongwushangpinEntity>();

		PageUtils page = chongwushangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwushangpin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwushangpinEntity chongwushangpin, 
		HttpServletRequest request){
        EntityWrapper<ChongwushangpinEntity> ew = new EntityWrapper<ChongwushangpinEntity>();

		PageUtils page = chongwushangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwushangpin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwushangpinEntity chongwushangpin){
       	EntityWrapper<ChongwushangpinEntity> ew = new EntityWrapper<ChongwushangpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwushangpin, "chongwushangpin")); 
        return R.ok().put("data", chongwushangpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwushangpinEntity chongwushangpin){
        EntityWrapper< ChongwushangpinEntity> ew = new EntityWrapper< ChongwushangpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwushangpin, "chongwushangpin")); 
		ChongwushangpinView chongwushangpinView =  chongwushangpinService.selectView(ew);
		return R.ok("查询宠物商品成功").put("data", chongwushangpinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwushangpinEntity chongwushangpin = chongwushangpinService.selectById(id);
		chongwushangpin.setClicktime(new Date());
		chongwushangpinService.updateById(chongwushangpin);
		chongwushangpin = chongwushangpinService.selectView(new EntityWrapper<ChongwushangpinEntity>().eq("id", id));
        return R.ok().put("data", chongwushangpin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwushangpinEntity chongwushangpin = chongwushangpinService.selectById(id);
		chongwushangpin.setClicktime(new Date());
		chongwushangpinService.updateById(chongwushangpin);
		chongwushangpin = chongwushangpinService.selectView(new EntityWrapper<ChongwushangpinEntity>().eq("id", id));
        return R.ok().put("data", chongwushangpin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwushangpinEntity chongwushangpin, HttpServletRequest request){
    	chongwushangpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwushangpin);
        chongwushangpinService.insert(chongwushangpin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwushangpinEntity chongwushangpin, HttpServletRequest request){
    	chongwushangpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwushangpin);
        chongwushangpinService.insert(chongwushangpin);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongwushangpinEntity chongwushangpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwushangpin);
        chongwushangpinService.updateById(chongwushangpin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwushangpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ChongwushangpinEntity chongwushangpin, HttpServletRequest request,String pre){
        EntityWrapper<ChongwushangpinEntity> ew = new EntityWrapper<ChongwushangpinEntity>();
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
		PageUtils page = chongwushangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwushangpin), params), params));
        return R.ok().put("data", page);
    }

        /**
     * 按用户购买推荐
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,ChongwushangpinEntity chongwushangpin, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String goodtypeColumn = "shangpinmingcheng";
        List<OrdersEntity> orders = ordersService.selectList(new EntityWrapper<OrdersEntity>().eq("userid", userId).eq("tablename", "chongwushangpin").orderBy("addtime", false));
        List<String> goodtypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<ChongwushangpinEntity> chongwushangpinList = new ArrayList<ChongwushangpinEntity>();
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
                        chongwushangpinList.addAll(chongwushangpinService.selectList(new EntityWrapper<ChongwushangpinEntity>().eq(goodtypeColumn, o.getGoodtype())));
                }
        }
        EntityWrapper<ChongwushangpinEntity> ew = new EntityWrapper<ChongwushangpinEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = chongwushangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwushangpin), params), params));
        List<ChongwushangpinEntity> pageList = (List<ChongwushangpinEntity>)page.getList();
        if(chongwushangpinList.size()<limit) {
                int toAddNum = (limit-chongwushangpinList.size())<=pageList.size()?(limit-chongwushangpinList.size()):pageList.size();
                for(ChongwushangpinEntity o1 : pageList) {
                    boolean addFlag = true;
                    for(ChongwushangpinEntity o2 : chongwushangpinList) {
                        if(o1.getId().intValue()==o2.getId().intValue()) {
                            addFlag = false;
                            break;
                        }
                    }
                    if(addFlag) {
                        chongwushangpinList.add(o1);
                        if(--toAddNum==0) break;
                    }   
                }
        } else if(chongwushangpinList.size()>limit) {
            chongwushangpinList = chongwushangpinList.subList(0, limit);
        }
        page.setList(chongwushangpinList);
        return R.ok().put("data", page);
    }







}
