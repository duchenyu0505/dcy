package com.dcy.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dcy.entity.Brand;
import com.dcy.entity.Goods;
import com.dcy.entity.Type;
import com.dcy.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {

	private Logger logger=LoggerFactory.getLogger(getClass());
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("list.do")
	public String list(Model m,String mohu,@RequestParam(defaultValue = "1")Integer currentPage) {
		PageHelper.startPage(currentPage, 3);
		List<Goods> list = goodsService.list(mohu);
		PageInfo pageInfo=new PageInfo(list);
		System.out.println(list);
		m.addAttribute("pageInfo",pageInfo);
		m.addAttribute("mohu",mohu);
		m.addAttribute("list", list);
		return "list";
	}
	
	@ResponseBody
	@RequestMapping("type.do")
	public Object typeList() {
		List<Type> type = goodsService.listType();
		System.out.println(type);
		return type;
	}
	
	@ResponseBody
	@RequestMapping("brand.do")
	public Object brandList() {
		List<Brand> brand = goodsService.listBrand();
		
		return brand;
	}
	
	@ResponseBody
	@RequestMapping("add.do")
	public Object add(Goods goods) {
		int i = goodsService.add(goods);
		
		return i;
	}
	
	@ResponseBody
	@RequestMapping("selectById.do")
	public Object selectById(Integer id,Model m) {
		Goods goods = goodsService.selectById(id);
		
		return goods;
	}
	
	@ResponseBody
	@RequestMapping("update.do")
	public Object update(Goods goods) {
		int i = goodsService.update(goods);
		
		return i;
	}
	
	
	@ResponseBody
	@RequestMapping("deletes.do")
	public Object deletes(String ids) {
		int del = goodsService.deletes(ids);
		
		return del;
	}
}
