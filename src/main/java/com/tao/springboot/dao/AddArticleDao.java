package com.tao.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tao.springboot.entity.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddArticleDao extends BaseMapper<Article> {


}
