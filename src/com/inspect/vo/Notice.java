package com.inspect.vo;

/**
 * 
 * @ClassName: Notice
 * @Description: 公告id
 * @author: xtf
 * @date: 2019年1月21日
 *
 */
public class Notice {
    /**
     * 公告id
     */
    private Integer id;
    /**
     * 管理员id
     */
    private Integer adminId;
    /**
     * 标题
     */
    private String title;
    /**
     * 正文
     */
    private String content;
    /**
     * 创建时间
     */
    private String createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    @Override
    public String toString() {
        return "Notice [id=" + id + ", adminId=" + adminId + ", title=" + title + ", content=" + content
                + ", createDate=" + createDate + "]";
    }

}
