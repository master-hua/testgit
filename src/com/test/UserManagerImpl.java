package com.test;


import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author Jone Zhou
 *
 */
/*@Repository("testMapper")*/
public class UserManagerImpl extends SqlSessionDaoSupport{

	public void insert(TestEntity a) {
	   this.getSqlSession().insert("insert", a);
	}

	



}
