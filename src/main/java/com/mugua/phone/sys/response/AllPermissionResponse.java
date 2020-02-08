package com.mugua.phone.sys.response;

import com.mugua.phone.common.BaseResponse;
import com.mugua.phone.sys.vo.PermissionVO;

import java.util.List;

/**
 * 查询权限列表，包括菜单和按钮
 * Created by leo on 2017/11/30.
 */
public class AllPermissionResponse extends BaseResponse {

	private List<PermissionVO> data;

	public List<PermissionVO> getData() {
		return data;
	}

	public void setData(List<PermissionVO> data) {
		this.data = data;
	}
}
