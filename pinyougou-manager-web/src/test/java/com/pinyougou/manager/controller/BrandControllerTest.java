package com.pinyougou.manager.controller;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/springmvc.xml"})
public class BrandControllerTest extends AbstractJUnit4SpringContextTests{
	
	@Reference
	private BrandService brandService;



	@Test
	public void testFindAll() {
		
		List<TbBrand> list = brandService.findAll();
		for(TbBrand brand:list) {
			System.out.println(brand.getName());
		}
		System.out.println();
	}
	
	@Test
	public void addTest() {
		TbBrand brand = new TbBrand();
		brand.setFirstChar("K");
		brand.setName("卡车");
		
		brandService.add(brand);
		
		
	}

	
}
