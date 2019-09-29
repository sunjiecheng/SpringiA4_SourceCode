package com.sjc.spring.knights.con.impl;

/**
 * @author jiecheng
 * @create 2019-09-24 下午6:26
 */
public class DamselRescuingKnight {
    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
