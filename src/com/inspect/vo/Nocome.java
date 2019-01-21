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

    @Override
    public String toString() {
        return "Nocome [id=" + id + ", inspectId=" + inspectId + ", studentId=" + studentId + ", examiner=" + examiner
                + "]";
    }

}
