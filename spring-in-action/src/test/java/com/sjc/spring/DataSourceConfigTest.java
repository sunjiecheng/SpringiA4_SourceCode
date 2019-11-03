package com.sjc.spring;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * @author jiecheng
 * @create 2019-10-27 下午12:09
 */
public class DataSourceConfigTest {

    @RunWith(SpringJUnit4ClassRunner.class)

    public static class DevDataSourceTest {
        @Autowired
        private DataSource dataSource;
    }
}
