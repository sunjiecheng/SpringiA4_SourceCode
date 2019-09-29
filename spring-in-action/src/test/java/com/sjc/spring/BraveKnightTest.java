package com.sjc.spring;

import com.sjc.spring.knights.con.Quest;
import com.sjc.spring.knights.con.impl.BraveKnight;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author jiecheng
 * @create 2019-09-24 下午6:31
 */

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mock = Mockito.mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mock);
        braveKnight.embarkOnQuest();
        Mockito.verify(mock, Mockito.times(1)).embark();
    }
}
