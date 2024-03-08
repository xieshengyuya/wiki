package com.xie.wiki.controller;

import com.xie.wiki.domain.Ebook;
import com.xie.wiki.req.EbookReq;
import com.xie.wiki.response.CommonResp;
import com.xie.wiki.response.EbookResp;
import com.xie.wiki.service.EbookService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

@RestController
public class EbookController {
    @Resource
    private EbookService ebookService;

    @GetMapping("/ebook/list")
    public CommonResp list(){
        CommonResp<List<Ebook>> commonResp = new CommonResp<>();
        commonResp.setContent(ebookService.list());
        return commonResp;
    }

    @GetMapping("/ebook/listWhich")
    public CommonResp listWhich(EbookReq ebookReq){
        CommonResp<List<EbookResp>> commonResp = new CommonResp<>();
        commonResp.setContent(ebookService.listWhich(ebookReq));
        return commonResp;
    }

}
