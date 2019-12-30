package com.dcy.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dcy.entity.Brand;
import com.dcy.entity.Goods;
import com.dcy.entity.Type;

public interface GoodsService {

	List<Goods> list(String mohu);
	
	List<Type> listType();
	
	List<Brand> listBrand();
	
	int add(Goods goods);
	
	Goods selectById(Integer id);
	
	int update(Goods goods);
	
	int deletes(String ids);
}
