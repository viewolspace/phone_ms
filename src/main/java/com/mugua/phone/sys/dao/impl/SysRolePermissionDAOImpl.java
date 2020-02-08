package com.mugua.phone.sys.dao.impl;

import com.mugua.phone.sys.base.PhoneMsDAO;
import com.mugua.phone.sys.dao.SysRolePermissionDAO;
import com.mugua.phone.sys.pojo.SysRolePermission;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by leo on 2017/11/23.
 */
@Repository
public class SysRolePermissionDAOImpl extends PhoneMsDAO<SysRolePermission> implements SysRolePermissionDAO {
    @Override
    public int batchSaveSysRolePermission(List<SysRolePermission> sysRolePermissionList) {
        return this.batchInsert(sysRolePermissionList, "batchSaveSysRolePermission");
    }

    @Override
    public int deleteSysRolePermissionByRole(int roleId) {
        return this.deleteBy("deleteSysRolePermissionByRole", roleId);
    }

    @Override
    public List<SysRolePermission> listSysRolePermissionByRole(Integer... roleId) {
        return this.findBy("listSysRolePermissionByRole", roleId);
    }
}