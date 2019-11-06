package com.sjc.spring;

import chapter04.soundsystem.CompactDisc;
import chapter04.soundsystem.TrackCounter;
import chapter04.soundsystem.TrackCounterConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author jiecheng
 * @create 2019-11-03 上午10:00
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private TrackCounter counter;

    @Test
    public void testTrackCounter() {
        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(7);
        cd.playTrack(7);
        cd.playTrack(7);

        Assert.assertEquals(1, counter.getPlayCount(1));
        Assert.assertEquals(1, counter.getPlayCount(2));
        Assert.assertEquals(4, counter.getPlayCount(3));

        Assert.assertEquals(3, counter.getPlayCount(7));
    }
}
