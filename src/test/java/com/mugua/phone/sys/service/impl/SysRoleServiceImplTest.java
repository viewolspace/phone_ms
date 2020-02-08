package com.mugua.phone.sys.service.impl;

import com.mugua.phone.sys.pojo.SysRole;
import com.mugua.phone.sys.service.SysRoleService;
import com.youguu.core.util.PageHolder;
import org.junit.Test;

public class SysRoleServiceImplTest extends BaseTest {

	SysRoleService sysRoleService = (SysRoleService) getBean("sysRoleService");


	@Test
	public void testQuerySysRoleByPage() throws Exception {
		PageHolder<SysRole> pageHolder = sysRoleService.querySysRoleByPage(1,"", 1, 50);

		System.out.println(pageHolder.size());
	}
}