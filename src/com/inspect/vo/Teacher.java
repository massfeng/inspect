package com.inspect.vo;

/**
 * 
 * @ClassName: Teacher
 * @Description: 老师的vo类
 * @author: xtf
 * @date: 2019年1月21日
 *
 */
public class Teacher {
    /**
     * 老师id
     */
    private Integer Id;
    /**
     * 老师姓名
     */
    private String name;
    /**
     * 老师邮箱
     */
    private String email;
    /**
     * 教工号
     */
    private String Number;
    /**
     * 密码
     */
    private String password;
    /**
     * 所管班级id
     */
    private Integer classesId;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getClassesId() {
        return classesId;
    }

    public void setClassesId(Integer classesId) {
        this.classesId = classesId;
    }

    @Override
    public String toString() {
        return "Teacher [Id=" + Id + ", name=" + name + ", email=" + email + ", Number=" + Number + ", password="
                + password + ", classesId=" + classesId + "]";
    }

}
