package com.inspect.vo;

/**
 * 
 * @ClassName: Student
 * @Description: 学生的vo类
 * @author: xtf
 * @date: 2019年1月21日
 *
 */
public class Student {
    /**
     * 学生id
     */
    private Integer id;
    /**
     * 学号
     */
    private String number;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 密码
     */
    private String password;
    /**
     * 班级id
     */
    private Integer ClassesId;
    /**
     * <li>1表示点到员
     * <li>2表示临时点到员
     * <li>3表示普通学生
     */
    private Integer level;

    /**
     * 学生状态
     * <li>1表示初始
     * <li>2表示缺到
     * <li>3表示请假
     * <li>4表示正常
     */
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getClassesId() {
        return ClassesId;
    }

    public void setClassesId(Integer classesId) {
        ClassesId = classesId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", number=" + number + ", email=" + email + ", password=" + password
                + ", ClassesId=" + ClassesId + ", level=" + level + ", state=" + state + "]";
    }

}
