package org.wcy.gen.model;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-09-14
 */
public class Userprize {
    /**
     * ID
     */
    private String id;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 奖品id
     */
    private String prizeid;

    /**
     * 获奖时间
     */
    private Date prizetime;

    /**
     * 状态
     */
    private String state;

    /**
     * 是否删除
     */
    private String isdelete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getPrizeid() {
        return prizeid;
    }

    public void setPrizeid(String prizeid) {
        this.prizeid = prizeid == null ? null : prizeid.trim();
    }

    public Date getPrizetime() {
        return prizetime;
    }

    public void setPrizetime(Date prizetime) {
        this.prizetime = prizetime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete == null ? null : isdelete.trim();
    }
}