//package com.example.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
//import org.springframework.data.redis.core.StringRedisTemplate;
//@Configuration
//public class RedisConfiguration {
////     @Bean
////    public RedisConnectionFactory redisConnectionFactory() {
////        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
////         RedisStandaloneConfiguration
////        jedisConnectionFactory.setHostName("127.0.0.1");
////        jedisConnectionFactory.setPort(6379);
////        jedisConnectionFactory.setPassword("1234");
////       return jedisConnectionFactory;
////    }
//
//    @Bean
//    RedisStandaloneConfiguration redisStandaloneConfiguration() {
//        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
//        redisStandaloneConfiguration.setHostName("dec67a089b92.c.methodot.com");
//        redisStandaloneConfiguration.setPort(31499);
//        redisStandaloneConfiguration.setDatabase(0);
//        return redisStandaloneConfiguration;
//    }
//
//    @Bean
//    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
//        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
//
//        stringRedisTemplate.setConnectionFactory(redisConnectionFactory);
//        return stringRedisTemplate;
//    }
//}
