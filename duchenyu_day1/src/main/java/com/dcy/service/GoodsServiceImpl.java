package com.dcy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dcy.dao.GoodsDao;
import com.dcy.entity.Brand;
import com.dcy.entity.Goods;
import com.dcy.entity.Type;
@Transactional
@Service
public class GoodsServiceImpl implements GoodsService{

	
	@Autowired
	private GoodsDao goodsDao;
	
	
	public List<Goods> list(String mohu) {
		// TODO Auto-generated method stub
		return goodsDao.list(mohu);
	}


	@Override
	public List<Type> listType() {
		// TODO Auto-generated method stub
		return goodsDao.listType();
	}


	@Override
	public List<Brand> listBrand() {
		// TODO Auto-generated method stub
		return goodsDao.listBrand();
	}


	@Override
	public int add(Goods goods) {
		// TODO Auto-generated method stub
		return goodsDao.add(goods);
	}


	@Override
	public Goods selectById(Integer id) {
		// TODO Auto-generated method stub
		return goodsDao.selectById(id);
	}


	@Override
	public int update(Goods goods) {
		// TODO Auto-generated method stub
		return goodsDao.update(goods);
	}


	@Override
	public int deletes(String ids) {
		// TODO Auto-generated method stub
		return goodsDao.deletes(ids);
	}
	
	
}
