package com.ychenchen.spring.kafka.producer;

import java.util.Date;

/**
 * @author Alexis.Yang
 * @descriptioin
 * @date 2019-08-20 10:54
 * @copyright www.ychenchen.com
 */
public class Message {
    private String id;

    private String msg;

    private Date sendTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}
