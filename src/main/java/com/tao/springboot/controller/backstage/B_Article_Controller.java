package com.tao.springboot.controller.backstage;

import com.tao.springboot.entity.Article;
import com.tao.springboot.entity.ProcessResult;
import com.tao.springboot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/backstage")
public class B_Article_Controller {

    @Autowired
    ArticleService articleServcie;

    @PostMapping("/addArticle")
    public ProcessResult add(@RequestBody Article article){
        System.out.println("------"+article);
        try{
            articleServcie.AddArticle(article);
            return new ProcessResult().seccess();
        }catch (Exception e){
            e.printStackTrace();
            return new ProcessResult().fail();
        }



    }

    @DeleteMapping("deleteArticle")
    public ProcessResult del(int ArticleId){
        try{
            articleServcie.deleteArticle(ArticleId);
            return new ProcessResult().seccess();
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ProcessResult().fail();
    }


   /* @PutMapping("updateArticle")
    public ProcessResult update(Article article){
        articleServcie.updateArticle(article);

    }*/
}
