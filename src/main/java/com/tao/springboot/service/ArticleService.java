package com.tao.springboot.service;

import com.tao.springboot.entity.Article;

import java.util.List;

public interface ArticleService {

    List<Article> inquireArticleBook(String type);

    List<Article> confusedQueryBook(String bookName);

    List<Article> sortByTime();

    List<Article> sortByTime_desc();

    void likes(int id);

    void noLikes(int id);

    void AddArticle(Article article);

    void deleteArticle(int articleId);

    void updateArticle(Article article);

    List<Article> findArticleType();

    List<Article> conditionFind(Article article);

    int batchDeleteArticle(List<Article> id);
}
