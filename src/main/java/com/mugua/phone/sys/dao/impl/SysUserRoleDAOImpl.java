package com.mugua.phone.sys.dao.impl;

import com.mugua.phone.sys.base.PhoneMsDAO;
import com.mugua.phone.sys.dao.SysUserRoleDAO;
import com.mugua.phone.sys.pojo.SysUserRole;
import org.springframework.stereotype.Repository;

/**
 * Created by leo on 2017/11/23.
 */
@Repository
public class SysUserRoleDAOImpl extends PhoneMsDAO<SysUserRole> implements SysUserRoleDAO {
    @Override
    public int saveSysUserRole(SysUserRole userRole) {
        return this.insert(userRole);
    }

    @Override
    public int updateSysUserRole(SysUserRole userRole) {
        return this.update(userRole);
    }

    @Override
    public SysUserRole findSysUserRoleByUid(int uid) {
        return this.findUniqueBy("selectByUid", uid);
    }

    @Override
    public int deleteSysUserRoleByUid(int uid) {
        return this.deleteBy("deleteByUid", uid);
    }
}
