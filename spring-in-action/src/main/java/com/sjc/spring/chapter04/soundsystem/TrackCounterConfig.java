package com.sjc.spring.chapter04.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;

/**
 * @author jiecheng
 * @create 2019-11-03 上午9:52
 */
@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        BlankDisc cd = new BlankDisc("Sgt. Pepper's Lonely Hearts Club Band","The Beatles",
                new ArrayList<String>(){{
                    add("a");
                    add("b");
                    add("c");
        }});
        return cd;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
