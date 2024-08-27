package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 宠物医院
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-15 13:19:21
 */
@TableName("chongwuyiyuan")
public class ChongwuyiyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongwuyiyuanEntity() {
		
	}
	
	public ChongwuyiyuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 医院名称
	 */
					
	private String yiyuanmingcheng;
	
	/**
	 * 店铺封面
	 */
					
	private String dianpufengmian;
	
	/**
	 * 门诊时间
	 */
					
	private String menzhenshijian;
	
	/**
	 * 简介
	 */
					
	private String jianjie;
	
	/**
	 * 地区
	 */
					
	private String diqu;
	
	/**
	 * 热线电话
	 */
					
	private String rexiandianhua;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：医院名称
	 */
	public void setYiyuanmingcheng(String yiyuanmingcheng) {
		this.yiyuanmingcheng = yiyuanmingcheng;
	}
	/**
	 * 获取：医院名称
	 */
	public String getYiyuanmingcheng() {
		return yiyuanmingcheng;
	}
	/**
	 * 设置：店铺封面
	 */
	public void setDianpufengmian(String dianpufengmian) {
		this.dianpufengmian = dianpufengmian;
	}
	/**
	 * 获取：店铺封面
	 */
	public String getDianpufengmian() {
		return dianpufengmian;
	}
	/**
	 * 设置：门诊时间
	 */
	public void setMenzhenshijian(String menzhenshijian) {
		this.menzhenshijian = menzhenshijian;
	}
	/**
	 * 获取：门诊时间
	 */
	public String getMenzhenshijian() {
		return menzhenshijian;
	}
	/**
	 * 设置：简介
	 */
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
	/**
	 * 设置：地区
	 */
	public void setDiqu(String diqu) {
		this.diqu = diqu;
	}
	/**
	 * 获取：地区
	 */
	public String getDiqu() {
		return diqu;
	}
	/**
	 * 设置：热线电话
	 */
	public void setRexiandianhua(String rexiandianhua) {
		this.rexiandianhua = rexiandianhua;
	}
	/**
	 * 获取：热线电话
	 */
	public String getRexiandianhua() {
		return rexiandianhua;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
