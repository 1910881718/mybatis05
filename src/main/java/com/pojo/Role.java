package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class Role {
    /**
     * 
     */
    private Long roleId;

    /**
     * 
     */
    private String roleName;

    /**
     * 
     */
    private Integer available;

    /**
     * 
     */
    private String description;

    private List<User> userList;

    private List<Permission> permissionList = new ArrayList<>();

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", available=" + available +
                ", description='" + description + '\'' +
                ", userList=" + userList +
                ", permissionList=" + permissionList +
                '}';
    }
}