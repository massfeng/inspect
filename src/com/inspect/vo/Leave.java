package com.inspect.vo;

/**
 * 
 * @ClassName: Leave
 * @Description: 这是请假的vo类
 * @author: xtf
 * @date: 2019年1月21日
 *
 */
public class Leave {
    /**
     * 请假id
     */
    private Integer Id;
    /**
     * 请假人id
     */
    private Integer studentId;
    /**
     * 审核状态<br/>
     * <li>1表示通过
     * <li>2表示正在审核
     * <li>3表示未通过
     */
    private Integer state;
    /**
     * 审核人id<br/>
     * <li>如果该字段有值，表示是管理员通过的请求，id为管理员id
     * <li>如果该字段无值，表示是班主任通过的请求
     */
    private Integer audiorId;
    /**
     * 检查id
     */
    private Integer inspectId;

    /**
     * 请假发起时间
     */
    private String createDate;

    /**
     * 请假通过时间
     */
    private String passDate;

    /**
     * 请假时间
     */
    private String leaveDate;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getAudiorId() {
        return audiorId;
    }

    public void setAudiorId(Integer audiorId) {
        this.audiorId = audiorId;
    }

    public Integer getInspectId() {
        return inspectId;
    }

    public void setInspectId(Integer inspectId) {
        this.inspectId = inspectId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getPassDate() {
        return passDate;
    }

    public void setPassDate(String passDate) {
        this.passDate = passDate;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String toString() {
        return "Leave [Id=" + Id + ", studentId=" + studentId + ", state=" + state + ", audiorId=" + audiorId
                + ", inspectId=" + inspectId + ", createDate=" + createDate + ", passDate=" + passDate + ", leaveDate="
                + leaveDate + "]";
    }

}
