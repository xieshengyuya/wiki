package com.xie.wiki.controller;

import com.xie.wiki.domain.Ebook;
import com.xie.wiki.response.CommonResponse;
import com.xie.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

class Try{
    public int i;
    public int j;
}


@RestController
public class EbookController {
    @Resource
    private EbookService ebookService;

    @GetMapping("/ebook/list")
    public CommonResponse list(){
        CommonResponse<List<Ebook>> commonResponse = new CommonResponse<>();
        commonResponse.setContent(ebookService.list());
        return commonResponse;
    }

    @GetMapping("/ebook/trytry")
    public Try trytry(){
        Try myTry = new Try();
        myTry.i = 1;
        myTry.j = 2;

        return myTry;
    }
}
