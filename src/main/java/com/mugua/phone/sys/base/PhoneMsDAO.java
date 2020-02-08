package com.mugua.phone.sys.base;

import com.youguu.core.dao.SqlDAO;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.annotation.Resource;

public class PhoneMsDAO<T> extends SqlDAO<T> {
	public PhoneMsDAO() {
		super();
		setUseSimpleName(true);
	}

	@Resource(name = "phoneMsSessionFactory")
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

}
