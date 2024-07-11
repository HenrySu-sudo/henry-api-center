package org.gatech.henryapicommon.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * @TableName user
 */
@TableName(value ="user")
public class User implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 用户角色：user / admin
     */
    private String userRole;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * accessKey
     */
    private String accessKey;

    /**
     * secretKey
     */
    private String secretKey;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户昵称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户昵称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 账号
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 账号
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 用户头像
     */
    public String getUserAvatar() {
        return userAvatar;
    }

    /**
     * 用户头像
     */
    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    /**
     * 性别
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 性别
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 用户角色：user / admin
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * 用户角色：user / admin
     */
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    /**
     * 密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     * accessKey
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    /**
     * secretKey
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * secretKey
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 是否删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserAccount() == null ? other.getUserAccount() == null : this.getUserAccount().equals(other.getUserAccount()))
            && (this.getUserAvatar() == null ? other.getUserAvatar() == null : this.getUserAvatar().equals(other.getUserAvatar()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getUserRole() == null ? other.getUserRole() == null : this.getUserRole().equals(other.getUserRole()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getAccessKey() == null ? other.getAccessKey() == null : this.getAccessKey().equals(other.getAccessKey()))
            && (this.getSecretKey() == null ? other.getSecretKey() == null : this.getSecretKey().equals(other.getSecretKey()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserAccount() == null) ? 0 : getUserAccount().hashCode());
        result = prime * result + ((getUserAvatar() == null) ? 0 : getUserAvatar().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getUserRole() == null) ? 0 : getUserRole().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getAccessKey() == null) ? 0 : getAccessKey().hashCode());
        result = prime * result + ((getSecretKey() == null) ? 0 : getSecretKey().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", userAvatar=").append(userAvatar);
        sb.append(", gender=").append(gender);
        sb.append(", userRole=").append(userRole);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", accessKey=").append(accessKey);
        sb.append(", secretKey=").append(secretKey);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}