package com.tao.springboot;




import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

@MapperScan("com.tao.springboot.dao")
@SpringBootApplication
public class TaoMian {
    public static void main(String[] args) {
/*

            DocsConfig config = new DocsConfig();
            config.setProjectPath("G:\\springboot\\xingxing"); // 项目根目录
            config.setProjectName("xingxing"); // 项目名称
            config.setApiVersion("V1.0");       // 声明该API的版本
            config.setDocsPath("D:\\doc"); // 生成API 文档所在目录
            config.setAutoGenerate(Boolean.TRUE);  // 配置自动生成
            Docs.buildHtmlDocs(config); // 执行生成文档

*/


          SpringApplication.run(TaoMian.class,args);
    }
}
