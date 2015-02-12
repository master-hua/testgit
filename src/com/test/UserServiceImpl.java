package com.test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Jone Zhou
 *
 */
@Service("userService")
public class UserServiceImpl implements IUserService{
	
	@Autowired
	TestManager<TestEntity> testManager;

	@Override
	public void insert(TestEntity test) {
		testManager.insert(test);
		
	}
	
	@Override
	public List<TestEntity> selectTestByCondition(TestEntity t) {
		return testManager.selectTestByCondition(t);
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public TestManager getTestMapper() {
		return testManager;
	}
	
	public void setTestMapper(TestManager testMapper) {
		this.testManager = testMapper;
	}

	@Override
	public void addUser(TestEntity t) throws DataAccessException {
		testManager.addUser(t);
		
	}















	

	/*@Override
	public void insert(Test test) {
		try {
			dbManager.save(test);
		} catch (DBException e) {
			e.printStackTrace();
		}
	}

	public DBManager<Test> getDbManager() {
		return dbManager;
	}

	public void setDbManager(DBManager<Test> dbManager) {
		this.dbManager = dbManager;
	}
	
	@Autowired(required=true)
	TestMapper testMapper;

	@Override
	public void insert(Test test) {
		// TODO Auto-generated method stub
		testMapper.insert(test);
	}

	IUserManager userManager;

	@Override
	public void addUser(UserInfo paramUserInfo) throws ServiceException {
		 if (userInfoBean == null) {
		      throw new ServiceException(ServiceErrorCode.ADD.toString(), 
		        "用户信息不能为空�?);
		    }
		try {
			userManager.insert(paramUserInfo);
		} catch (DBException e) {
			e.printStackTrace();
		}
	}
	
	public IUserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(IUserManager userManager) {
		this.userManager = userManager;
	}
	*/
	
	
	
}
