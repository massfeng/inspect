package com.inspect.vo;

/**
 * 
 * @ClassName: Admin
 * @Description: 这是管理员的vo类
 * @author: xtf
 * @date: 2019年1月21日
 *
 */
public class Admin {
    /**
     * 管理员id
     */
    private Integer id;
    /**
     * 管理员名
     */
    private String Name;
    /**
     * 管理员密码
     */
    private String password;
    /**
     * 管理员等级<br/>
     * 1表示超级管理员<br/>
     * 2表示普通管理员
     */
    private Integer level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Admin [id=" + id + ", Name=" + Name + ", password=" + password + ", level=" + level + "]";
    }

}
