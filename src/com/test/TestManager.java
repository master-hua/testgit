package com.test;

import java.util.List;


@SuppressWarnings("hiding")
public abstract interface TestManager<TestEntity>  extends DBManager<TestEntity> {

	public void insert(TestEntity t);
	
	public List<TestEntity> selectTestByCondition(TestEntity  t);
}
