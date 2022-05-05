package com.tao.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tao.springboot.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ArticleDao extends BaseMapper {
    /**
     * 根据 文章类型 进行查询文章
     * @param type
     * @return
     */
    List<Article> inquireArticleBook(String type);

    List<Article> confusedQueryBook(String bookName);

    List<Article> sortByTime();

    List<Article> sortByTime_desc();

    void likes(int id);

    void noLikes(int id);

    void addArticle(Article article);

    List<Article> findArticleType();

    List<Article> conditionFind(Article article);

    int batchDeleteArticle(List<Article> id);

}
