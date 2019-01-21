package com.inspect.vo;

/**
 * 
 * @ClassName: Classes
 * @Description: 这是班级的vo类
 * @author: xtf
 * @date: 2019年1月21日
 *
 */
public class Classes {
    /**
     * 班级id
     */
    private Integer id;
    /**
     * 班级号
     */
    private String classNumber;
    /**
     * 班主任id
     */
    private Integer teachId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public Integer getTeachId() {
        return teachId;
    }

    public void setTeachId(Integer teachId) {
        this.teachId = teachId;
    }

    @Override
    public String toString() {
        return "Classes [id=" + id + ", classNumber=" + classNumber + ", teachId=" + teachId + "]";
    }

}
