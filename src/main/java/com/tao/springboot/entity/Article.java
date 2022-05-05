package com.tao.springboot.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bytecode.Throw;

import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
public class Article{
    @TableId(type = IdType.AUTO)
    Integer articleId;  //文章id

    String articleName; //文章名

    String articleType; //文章类型

    Integer  articleLikes; //点赞数

    Integer articleViews;  //浏览次数

    @TableField(exist = false)
    Boolean isLike;  //是否点赞

    @TableField(exist = false)
    String likeUser;  //点赞用户

    @TableField(value = "Article_create_date" ,fill = FieldFill.INSERT)
    Date articleCreateDate;   //文章创建时间

    @TableField(value = "Article_update_date",fill = FieldFill.INSERT_UPDATE)
    Date articleUpdateDate;  //文章修改时间

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        if (articleType==""||articleType==null){
            System.out.println("不能为空");
            new RuntimeException("不能为空");
            return;
        }
        this.articleType = articleType;
    }

    public Integer getArticleLikes() {
        return articleLikes;
    }

    public void setArticleLikes(Integer articleLikes) {
        this.articleLikes = articleLikes;
    }

    public Integer getArticleViews() {
        return articleViews;
    }

    public void setArticleViews(Integer articleViews) {
        this.articleViews = articleViews;
    }

    public Boolean getLike() {
        return isLike;
    }

    public void setLike(Boolean like) {
        isLike = like;
    }

    public String getLikeUser() {
        return likeUser;
    }

    public void setLikeUser(String likeUser) {
        this.likeUser = likeUser;
    }

    public Date getArticleCreateDate() {
        return articleCreateDate;
    }

    public void setArticleCreateDate(Date articleCreateDate) {
        this.articleCreateDate = articleCreateDate;
    }

    public Date getArticleUpdateDate() {
        return articleUpdateDate;
    }

    public void setArticleUpdateDate(Date articleUpdateDate) {
        this.articleUpdateDate = articleUpdateDate;
    }
}
