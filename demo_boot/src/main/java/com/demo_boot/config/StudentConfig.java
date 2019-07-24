package com.demo_boot.config;

import com.demo_boot.Mapper.StudentMapper;
import com.demo_boot.Service.Impl.StudentServiceImpl;
import com.demo_boot.Service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author YuChen
 * @version 1.0
 * @date 2019/7/21 17:30
 * Describle 描述
 */
@Configuration
public class StudentConfig {
    @Bean
    public StudentService studentService(StudentMapper studentMapper){
        return new StudentServiceImpl();
    }
}
