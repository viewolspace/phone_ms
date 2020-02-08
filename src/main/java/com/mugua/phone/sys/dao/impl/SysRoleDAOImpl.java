package com.mugua.phone.sys.dao.impl;

import com.mugua.phone.sys.base.PhoneMsDAO;
import com.mugua.phone.sys.dao.SysRoleDAO;
import com.mugua.phone.sys.pojo.SysRole;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leo on 2017/11/23.
 */
@Repository
public class SysRoleDAOImpl extends PhoneMsDAO<SysRole> implements SysRoleDAO {
    @Override
    public int saveSysRole(SysRole role) {
        this.insert(role);
        return role.getId();
    }

    @Override
    public int updateSysRole(SysRole role) {
        return this.update(role);
    }

    @Override
    public int deleteSysRole(int id) {
        return this.delete(id);
    }

    @Override
    public SysRole getSysRole(int id) {
        return this.get(id);
    }

    @Override
    public List<SysRole> listALLSysRole(int appId) {
        return this.findBy("find_all", appId);
    }

    @Override
    public PageHolder<SysRole> querySysRoleByPage(int appId, String name, int pageIndex, int pageSize) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("appId", appId);
        return this.pagedQuery("querySysRoleByPage", map, pageIndex, pageSize);
    }

    @Override
    public int relateApp(int id, int appId) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("appId", appId);
        return this.updateBy("relateApp", map);
    }
}
