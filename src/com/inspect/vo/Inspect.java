package com.inspect.vo;

/**
 * 
 * @ClassName: Inspect
 * @Description: 这是检查的vo类
 * @author: xtf
 * @date: 2019年1月21日
 *
 */
public class Inspect {
    /**
     * 检查id
     */
    private Integer Id;
    /**
     * 检查名
     */
    private String inspectName;
    /**
     * 检查开始日期
     */
    private String startDate;
    /**
     * 检查结束日期
     */
    private String endDate;

    /**
     * 第一次点到开始时间
     */
    private String firstStartTime;

    /**
     * 第一次点到结束时间
     */
    private String fistEndTime;

    /**
     * 第二次点到开始时间
     */
    private String lastStartTime;

    /**
     * 第二次点到结束时间
     */
    private String lastEndTime;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getInspectName() {
        return inspectName;
    }

    public void setInspectName(String inspectName) {
        this.inspectName = inspectName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getFirstStartTime() {
        return firstStartTime;
    }

    public void setFirstStartTime(String firstStartTime) {
        this.firstStartTime = firstStartTime;
    }

    public String getFistEndTime() {
        return fistEndTime;
    }

    public void setFistEndTime(String fistEndTime) {
        this.fistEndTime = fistEndTime;
    }

    public String getLastStartTime() {
        return lastStartTime;
    }

    public void setLastStartTime(String lastStartTime) {
        this.lastStartTime = lastStartTime;
    }

    public String getLastEndTime() {
        return lastEndTime;
    }

    public void setLastEndTime(String lastEndTime) {
        this.lastEndTime = lastEndTime;
    }

    @Override
    public String toString() {
        return "Inspect [Id=" + Id + ", inspectName=" + inspectName + ", startDate=" + startDate + ", endDate="
                + endDate + ", firstStartTime=" + firstStartTime + ", fistEndTime=" + fistEndTime + ", lastStartTime="
                + lastStartTime + ", lastEndTime=" + lastEndTime + "]";
    }

}
