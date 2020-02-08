package com.mugua.phone.sys.dao;

import com.mugua.phone.sys.pojo.SysLog;
import com.youguu.core.util.PageHolder;

/**
 * Created by leo on 2017/12/18.
 */
public interface SysLogDAO {
	int saveSysLog(SysLog sysLog);

	PageHolder<SysLog> listSysLogByPage(String moduleName, String methodName, String userName, String ip, String startDate,
										String endDate, int appId, int pageIndex, int pageSize);

}
