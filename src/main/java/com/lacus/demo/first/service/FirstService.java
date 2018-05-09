package com.lacus.demo.first.service;

import com.lacus.demo.first.dao.FirstMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class FirstService {

    @Autowired
    private FirstMapper firstMapper;


    public List<HashMap> doSelectAll(HashMap hashMap){
        return firstMapper.selectTelent(hashMap);
    }


    public HashMap doSelectOne(HashMap hash){
        return firstMapper.selectOneTelent(hash);
    }
}
