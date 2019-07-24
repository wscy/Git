package com.demo_boot.Mapper;

import com.demo_boot.Entiry.Student;
import com.demo_boot.dto.StudentAllDTO;
import com.demo_boot.dto.StudentMessageDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author YuChen
 * @version 1.0
 * @date 2019/7/16 16:55
 * Describle 描述
 */
@Mapper
public interface StudentMapper {
//    登陆通过姓名信息
    public Student selectByName(String userName);
//查找学生相关信息
    public StudentAllDTO findStudentMessage(String userName);
    //查找学生相关信息（换一种方法）
    StudentMessageDTO findStudentMessage01(String userName);
}
