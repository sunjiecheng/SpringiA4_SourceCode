package com.sjc.spring.knights.con.impl;

import com.sjc.spring.knights.con.Quest;

public class RescueDamselQuest implements Quest {

    @Override
    public void embark() {
        System.out.println("Embarking on a quest to rescue the damsel.");
    }
}
