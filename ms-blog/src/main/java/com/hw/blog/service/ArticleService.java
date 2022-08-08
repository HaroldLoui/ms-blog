package com.hw.blog.service;

import com.hw.blog.vo.ArticleVo;
import com.hw.blog.vo.PageParams;

import java.util.List;

public interface ArticleService {

    List<ArticleVo> listArticles(PageParams pageParams);
}
