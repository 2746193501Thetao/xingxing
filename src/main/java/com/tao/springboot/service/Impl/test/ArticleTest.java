package com.tao.springboot.service.Impl.test;

import com.tao.springboot.dao.ArticleDao;
import com.tao.springboot.entity.Article;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@Service
public class ArticleTest {

    @Resource
    ArticleDao articleDao;

    @Test
    public void id(){
        List<Article> articleType = articleDao.findArticleType();
        System.out.println(articleType);
    }
}
