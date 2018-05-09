package com.lacus.demo.first.dao;

import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface FirstMapper {

    @Select("select * from telent")
    public List<HashMap> selectTelent(HashMap hashMap);

    @Select("select * from telent where telent_id=#{telent_id}")
    public HashMap selectOneTelent(HashMap hashMap);
}
