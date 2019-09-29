package com.sjc.spring.knights.config;

import com.sjc.spring.knights.con.Knight;
import com.sjc.spring.knights.con.Quest;
import com.sjc.spring.knights.con.impl.BraveKnight;
import com.sjc.spring.knights.con.impl.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiecheng
 * @create 2019-09-24 下午6:51
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
