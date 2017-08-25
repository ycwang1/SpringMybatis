package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.mapper.CategoryMapper;
import com.test.pojo.Category;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMybatis {

	@Autowired
	private CategoryMapper categoryMapper;
	
	@Test
	public void testAdd(){
		Category category =new Category();
		category.setName("IM NEW");
		categoryMapper.add(category);
	}
	@Test
	public void testList(){
		List<Category> list = categoryMapper.list();
		System.out.println(list.size());
	}
	@Test
	public void testDelete(){
		categoryMapper.delete(103);
	}
	@Test
	public void testGet(){
		Category category = categoryMapper.get(104);
		System.out.println(category.getName());
	}
}
