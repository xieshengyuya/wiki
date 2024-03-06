package com.xie.wiki.service;

import com.xie.wiki.domain.People;
import com.xie.wiki.mapper.PeopleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PeopleService {
    @Resource
    private PeopleMapper peopleMapper;
    public List<People> list(){
        return peopleMapper.list();
    }

}
