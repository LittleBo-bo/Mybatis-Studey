package com.cb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class blog implements Serializable {
    private String id;
    private String title;
    private String author;
    private Date CreateTime;
    private int views;
}
