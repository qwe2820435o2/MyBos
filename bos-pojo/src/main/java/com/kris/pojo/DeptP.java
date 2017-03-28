package com.kris.pojo;

public class DeptP {
    private String deptId;

    private String dpetName;

    private String parentId;

    private String state;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDpetName() {
        return dpetName;
    }

    public void setDpetName(String dpetName) {
        this.dpetName = dpetName == null ? null : dpetName.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}