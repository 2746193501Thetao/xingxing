package com.tao.springboot.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tao.springboot.dao.ArticleDao;
import com.tao.springboot.entity.Article;
import com.tao.springboot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    ArticleDao articleDao;

    @Override
    public List<Article> inquireArticleBook(String type) {
        List<Article> articles = articleDao.inquireArticleBook(type);
        if (articles.size()==0){
            return null;
        }
        return articles;

    }

    @Override
    public List<Article> confusedQueryBook(String bookName) {
        List<Article> articles = articleDao.confusedQueryBook(bookName);
        if (articles.size()==0){
            return null;
        }
        return articles;
    }

    @Override
    public List<Article> sortByTime() {
        return articleDao.sortByTime();
    }

    @Override
    public List<Article> sortByTime_desc() {
        return articleDao.sortByTime_desc();
    }

    @Override
    public void likes(int id) {
        articleDao.likes(id);
    }

    @Override
    public void noLikes(int id) {
        articleDao.noLikes(id);
    }

    @Override
    public void AddArticle(Article article) {
        articleDao.addArticle(article);
    }

    @Override
    public void deleteArticle(int articleId) {

    }

    @Override
    public void updateArticle(Article article) {

    }

    @Override
    public List<Article> findArticleType() {
        return articleDao.findArticleType();
    }

    @Override
    public List<Article> conditionFind(Article article) {
        return articleDao.conditionFind(article);
    }

    @Override
    public int batchDeleteArticle(List<Article> id) {
        return articleDao.batchDeleteArticle(id);
    }
}
