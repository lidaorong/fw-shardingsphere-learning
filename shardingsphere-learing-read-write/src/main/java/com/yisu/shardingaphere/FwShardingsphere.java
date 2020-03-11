package com.yisu.shardingaphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @description 启动类
 * @author xuyisu
 * @date '2020-03-10'
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class FwShardingsphere {

    public static void main(String[] args) {
        SpringApplication.run(FwShardingsphere.class, args);
    }

}
