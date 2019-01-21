package com.inspect.vo;

/**
 * 
 * @ClassName: Message
 * @Description: 消息的vo类
 * @author: xtf
 * @date: 2019年1月21日
 *
 */
public class Message {
    /**
     * 消息id
     */
    private Integer Id;
    /**
     * 发送者的id
     */
    private Integer senderId;
    /**
     * 接受者的id
     */
    private Integer receiveId;
    /**
     * 内容
     */
    private String content;
    /**
     * 发送时间
     */
    private String createDate;
    /**
     * 发送情况<br/>
     * <li>1表示老师给老师
     * <li>2表示学生给学生
     * <li>3表示老师给学生
     * <li>4表示学生给老师
     */
    private Integer level;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public Integer getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(Integer receiveId) {
        this.receiveId = receiveId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Message [Id=" + Id + ", senderId=" + senderId + ", receiveId=" + receiveId + ", content=" + content
                + ", createDate=" + createDate + ", level=" + level + "]";
    }

}
