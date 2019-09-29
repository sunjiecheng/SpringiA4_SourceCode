package com.sjc.spring.knights.con.impl;

import com.sjc.spring.knights.con.Quest;

import java.io.PrintStream;

/**
 * @author jiecheng
 * @create 2019-09-24 下午6:39
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
