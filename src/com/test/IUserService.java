package com.test;

import java.util.List;

import org.springframework.dao.DataAccessException;

/**
 * 
 * @author Jone Zhou
 *
 */
public abstract interface IUserService {
	
	public void insert(TestEntity test);
	/*  public abstract void addUser(UserInfo paramUserInfo) throws ServiceException;*/
	
	public void addUser(TestEntity t) throws DataAccessException;
	
	public List<TestEntity> selectTestByCondition(TestEntity t);

}