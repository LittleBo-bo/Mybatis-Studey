package com.cb.pojo;

import lombok.Data;

import java.io.Serializable;

@Data

public class User implements Serializable { //实体类序列化
    private int id;
    private String name;
    private String pwd;

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
}
