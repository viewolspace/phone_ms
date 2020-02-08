package com.mugua.phone.sys.dao;

import com.mugua.phone.sys.pojo.SysRole;
import com.youguu.core.util.PageHolder;

import java.util.List;

/**
 * Created by leo on 2017/11/23.
 */
public interface SysRoleDAO {
	int saveSysRole(SysRole role);

	int updateSysRole(SysRole role);

	int deleteSysRole(int id);

	SysRole getSysRole(int id);

	List<SysRole> listALLSysRole(int appId);

	PageHolder<SysRole> querySysRoleByPage(int appId, String name, int pageIndex, int pageSize);

	int relateApp(int id, int appId);

}
