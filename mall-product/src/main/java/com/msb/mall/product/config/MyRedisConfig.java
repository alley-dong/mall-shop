package com.msb.mall.product.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRedisConfig {

    @Bean
    public RedissonClient redissonClient(){
        Config config = new Config();
        // 配置连接的信息
        config.useSingleServer()
                .setAddress("redis://192.168.30.128:6380")
                .setPassword("1qaz@WSX");
        RedissonClient redissonClient = Redisson.create(config);
        return  redissonClient;
    }
}
