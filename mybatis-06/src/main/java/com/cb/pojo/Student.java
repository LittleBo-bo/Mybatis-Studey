package com.cb.pojo;

import lombok.Data;

@Data
public class Student {
    private int id;
    private  String name;
    //学生需要关联一个对象
    private Teacher teacher;
}
