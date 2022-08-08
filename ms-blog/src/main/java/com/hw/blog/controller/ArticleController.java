package com.hw.blog.controller;

import com.hw.blog.service.ArticleService;
import com.hw.blog.vo.ArticleVo;
import com.hw.blog.vo.PageParams;
import com.hw.blog.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping
    public R<List<ArticleVo>> articles(@RequestBody PageParams pageParams) {
        return R.success(articleService.listArticles(pageParams));
    }
}
