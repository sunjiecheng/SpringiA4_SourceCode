package com.sjc.spring.knights;

import com.sjc.spring.knights.con.Knight;
import com.sjc.spring.knights.config.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiecheng
 * @create 2019-09-24 下午6:52
 */
public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("META-INF.spring/knight.xml");
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(KnightConfig.class);

        Knight knight = context1.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
