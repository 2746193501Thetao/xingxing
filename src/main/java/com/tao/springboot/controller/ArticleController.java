package com.tao.springboot.controller;

import cn.hutool.core.util.BooleanUtil;
import com.tao.springboot.entity.Article;
import com.tao.springboot.entity.ProcessResult;
import com.tao.springboot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/SelectArticle")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @Resource
    StringRedisTemplate stringRedisTemplate;

    /**
     * 根据类型查询
     * @return
     */
    @GetMapping("/selectArticle")
    public ProcessResult articleType(@RequestParam String type){
        System.out.println(type);
        List<Article> articles = articleService.inquireArticleBook(type);
        System.out.println("List:"+articles);
        if (articles != null) {
            return new ProcessResult().seccess(articles);
        }
        return new ProcessResult().fail();

    }
//    搜索栏 模糊查询
    @GetMapping("/confusedQuery")
    public ProcessResult confusedQuery(@RequestParam String bookName){
        System.out.println(bookName+"--------------");
        List<Article> articles = articleService.confusedQueryBook(bookName);
        if (articles!=null){
            return new ProcessResult().seccess(articles);
        }
        return new ProcessResult().fail();
    }
    //根据发布时间查询 默认升序
   @GetMapping("/sortByTime")
    public ProcessResult time_Sort(){
       List<Article> articles = articleService.sortByTime();

       if (articles!=null){
           return new ProcessResult().seccess(articles);
       }
       return new ProcessResult().fail();
   }
//    根据发布时间查询 降序
    @GetMapping("/sortByTime_desc")
    public ProcessResult time_Sort_desc(){
        try{
            List<Article> articles = articleService.sortByTime_desc();
            return new ProcessResult().seccess(articles);
        }catch (Exception e){
            e.printStackTrace();
            return new ProcessResult().fail();
        }

    }

    //点赞功能实现
    @PutMapping("/likes/{id}")
    public ProcessResult likes(@PathVariable int id){
       /* Long userId = UserUtils.getUser().getId();
        System.out.println(userId);*/

        Long userId =  1l; // 模拟用户id id 为1

        String key = "Blog:liked:"+id;

        Boolean member = stringRedisTemplate.opsForSet().isMember(key, userId.toString());
        if (BooleanUtil.isFalse(member)){
            try{
                articleService.likes(id);
                stringRedisTemplate.opsForSet().add(key,userId.toString());
            }catch (Exception e){
                e.printStackTrace();
                return new ProcessResult().fail();
            }
        }else {
            articleService.noLikes(id);
            try{
                stringRedisTemplate.opsForSet().remove(key,userId.toString());
            }catch (Exception e){
                e.printStackTrace();
                return new ProcessResult().fail();
            }

        }
            return new ProcessResult().seccess();


    }
    @PostMapping("/test")
    public Article test(@RequestParam String bookName){
        System.out.println(bookName+"--------------");
        List<Article> articles = articleService.confusedQueryBook(bookName);
        for (Article articles1:articles) {
            return articles1;
        }
       return null;
    }

    @DeleteMapping("/a")
    public ProcessResult a(@RequestBody List<Article> article){
        System.out.println(article+"--------------");
        int articles = articleService.batchDeleteArticle(article);
        return new ProcessResult().seccess(articles);
    }

   /* @RequestMapping("b")
    public ProcessResult b(MultipartFile file){



    }*/

}
