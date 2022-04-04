package com.spring.boot.example.springboot.mybatis.dao;

import java.util.Date;

public class News {
    private String id;
    public String getId(){return id;}
    public void setId(String id){this.id = id;}

    private String title;
    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}

    private String type;
    public String getType(){return type;}
    public void setType(String type){this.type = type;}

    private String user_id;
    public String getUser_id(){return user_id;}
    public void setUser_id(String user_id){this.user_id = user_id;}

    private String link;
    public String getLink(){return link;}
    public void setLink(String link){this.link = link;}

    private String cover;
    public String getCover(){return cover;}
    public void setCover(String cover){this.cover= cover;}

    private int downloads;
    public int getDownloads(){return downloads;}
    public void setDownloads(int downloads){this.downloads = downloads;}

    private Date gmt_create;
    public Date getGmt_create(){return gmt_create;}
    public void setGmt_create(Date gmt_create){this.gmt_create = gmt_create;}

    private String create_by;
    public String getCreate_by(){return create_by;}
    public void setCreate_by(String create_by){this.create_by = create_by;}

    private Date gmt_update;
    public Date getGmt_update(){return gmt_update;}
    public void setGmt_update(Date gmt_update){this.gmt_update = gmt_update;}

    private String update_by;
    public String getUpdate_by(){return update_by;}
    public void setUpdate_by(String update_by){this.update_by = update_by;}


}

