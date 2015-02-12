package com.test;

import org.springframework.dao.DataAccessException;

public  interface DBManager<T> {
	
	public void addUser(T t) throws DataAccessException;
	
	
	
	

}
