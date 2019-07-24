package com.demo_boot.Service;

import com.demo_boot.dto.StudentAllDTO;
import com.demo_boot.dto.StudentMessageDTO;
import org.springframework.stereotype.Service;

/**
 * @author YuChen
 * @version 1.0
 * @date 2019/7/16 16:10
 * Describle 描述
 */
@Service
public interface StudentService {
    //检查登陆名字
    public boolean CheckLogin(String userName,String Password);
    //查看学生信息
    public StudentAllDTO showMessage(String userName);
    //查看学生信息（换一种方法）
    public StudentMessageDTO showMessage01(String userName);

}
