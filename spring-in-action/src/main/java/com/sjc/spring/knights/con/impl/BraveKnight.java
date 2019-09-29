package com.sjc.spring.knights.con.impl;

import com.sjc.spring.knights.con.Knight;
import com.sjc.spring.knights.con.Quest;

/**
 * @author jiecheng
 * @create 2019-09-24 下午6:29
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
