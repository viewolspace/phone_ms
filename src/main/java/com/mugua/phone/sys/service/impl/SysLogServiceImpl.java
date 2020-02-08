package com.mugua.phone.sys.service.impl;

import com.mugua.phone.sys.service.SysLogService;
import com.youguu.core.util.PageHolder;
import com.mugua.phone.sys.dao.SysLogDAO;
import com.mugua.phone.sys.pojo.SysLog;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by leo on 2017/12/18.
 */
@Service("sysLogService")
public class SysLogServiceImpl implements SysLogService {

	@Resource
	private SysLogDAO sysLogDAO;

	@Override
	public PageHolder<SysLog> listSysLogByPage(String moduleName, String methodName, String userName, String ip,
											   String startDate, String endDate,  int appId, int pageIndex, int pageSize) {
		return sysLogDAO.listSysLogByPage(moduleName, methodName, userName, ip, startDate, endDate, appId, pageIndex, pageSize);
	}
}
