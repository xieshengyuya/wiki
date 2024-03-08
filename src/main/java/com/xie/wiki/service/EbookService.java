package com.xie.wiki.service;

import com.xie.wiki.domain.Ebook;
import com.xie.wiki.domain.EbookExample;
import com.xie.wiki.mapper.EbookMapper;
import com.xie.wiki.req.EbookReq;
import com.xie.wiki.response.EbookResp;
import com.xie.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;
    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }

    public List<EbookResp> listWhich(EbookReq req){
        // 创建筛选框架：定死的
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        // 指定筛选标准
        criteria.andNameLike("%"+req.getName()+"%");
        // 获得筛选结果
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);


        // 将筛选结果封装到返回封装类中
//        List<EbookResp> ebookRespList = new LinkedList<EbookResp>();
//        for(Ebook ebook: ebookList){
//            EbookResp ebookresp = new EbookResp();
//            BeanUtils.copyProperties(ebook, ebookresp);
//            ebookRespList.add(ebookresp);
//        }

        List<EbookResp> ebookRespList = CopyUtil.copyList(ebookList, EbookResp.class);
        return ebookRespList;
    }

}
