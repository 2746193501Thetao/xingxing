package test;

import com.tao.springboot.TaoMian;
import com.tao.springboot.dao.ArticleDao;
import com.tao.springboot.entity.Article;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;


@SpringBootTest(classes = TaoMian.class)
@RunWith(SpringRunner.class)
public class ArticleTest {

    @Autowired
    ArticleDao articleDao;


    @Test
    public void testFindArticleType(){
        List<Article> articleType = articleDao.findArticleType();
        List list =new ArrayList();
        for (Article article : articleType){
            String articleType1 = article.getArticleType();
            if (!list.contains(articleType1)){
                list.add(articleType1);
            }
         }
        System.out.println(list);
    }





}
