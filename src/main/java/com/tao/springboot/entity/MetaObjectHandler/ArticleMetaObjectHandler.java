package com.tao.springboot.entity.MetaObjectHandler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ArticleMetaObjectHandler implements MetaObjectHandler{

    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("articleCreateDate",new Date(),metaObject);
        this.setFieldValByName("articleUpdateDate",new Date(),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("articleUpdateDate",new Date(),metaObject);
    }
}
