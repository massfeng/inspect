package com.inspect.vo;

/**
 * 
 * @ClassName: Nocome
 * @Description: 未点到的vo类
 * @author: xtf
 * @date: 2019年1月21日
 *
 */
public class Nocome {
    /**
     * 未点到id
     */
    private Integer id;
    /**
     * 检查id
     */
    private Integer inspectId;
    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 点到员id
     */
    private Integer examiner;

    /**
     * 缺到日期
     */
    private String createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInspectId() {
        return inspectId;
    }

    public void setInspectId(Integer inspectId) {
        this.inspectId = inspectId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getExaminer() {
        return examiner;
    }

    public void setExaminer(Integer examiner) {
        this.examiner = examiner;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Nocome [id=" + id + ", inspectId=" + inspectId + ", studentId=" + studentId + ", examiner=" + examiner
                + ", createDate=" + createDate + "]";
    }

}
