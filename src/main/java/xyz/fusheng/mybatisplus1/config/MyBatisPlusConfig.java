package xyz.fusheng.mybatisplus1.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @FileName: MyBatisPlusConfig
 * @Author: code-fusheng
 * @Date: 2020/5/29 16:46
 * @version: 1.0
 * Description: MP配置类
 */

@Configuration
public class MyBatisPlusConfig {

    /**
     * 注册 MyBatisPlus 乐观锁拦截器
     * @return
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor(){
        return new OptimisticLockerInterceptor();
    }

    /**
     * 注册 MyBatisPlus Page拦截器
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
