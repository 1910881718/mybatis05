package com.pojo;

public class Permission {
    /**
     * 
     */
    private Long permissionId;

    /**
     * 
     */
    private String permissionName;

    /**
     * 
     */
    private Integer level;

    /**
     * 
     */
    private Long parentPermissionId;

    /**
     * 
     */
    private Integer available;

    /**
     * 
     */
    private String permission;

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getParentPermissionId() {
        return parentPermissionId;
    }

    public void setParentPermissionId(Long parentPermissionId) {
        this.parentPermissionId = parentPermissionId;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    @Override
    public String toString() {
        return "Permission{" +
                "permissionId=" + permissionId +
                ", permissionName='" + permissionName + '\'' +
                ", level=" + level +
                ", parentPermissionId=" + parentPermissionId +
                ", available=" + available +
                ", permission='" + permission + '\'' +
                '}';
    }
}