package com.cb.dao;

import com.cb.pojo.blog;

import java.util.List;
import java.util.Map;

public interface blogMapper {

    List<blog> findALL();

    int update(Map map);

}
