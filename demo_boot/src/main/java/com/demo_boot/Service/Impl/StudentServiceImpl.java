package com.demo_boot.Service.Impl;

import com.demo_boot.Entiry.Student;
import com.demo_boot.Mapper.StudentMapper;
import com.demo_boot.Service.StudentService;
import com.demo_boot.dto.StudentAllDTO;
import com.demo_boot.dto.StudentMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author YuChen
 * @version 1.0
 * @date 2019/7/16 16:21
 * Describle 快速实现接口Alt
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public boolean CheckLogin(String userName,String password) {
        boolean flag=false;
        Student result=studentMapper.selectByName(userName);
        if(result!=null){
            String md502 = DigestUtils.md5DigestAsHex(password.getBytes());
            if(md502.equals(result.getPassword())){
                flag=true;
            }
    }
    return flag;
    }
//显示学生信息
    @Override
    public StudentAllDTO showMessage(String userName) {

        return studentMapper.findStudentMessage(userName);
    }
//显示学生信息（换一种方法）
    @Override
    public StudentMessageDTO showMessage01(String userName) {

        ArrayList<HashMap<String,Object>>detail001=new ArrayList<HashMap<String,Object>>();  //把学分，学科，教师分别存到map里面
        StudentMessageDTO studentMessageDTO =studentMapper.findStudentMessage01(userName);
        int len= studentMessageDTO.getDetail().size();//取得数组长度
        for (int i=0;i<len;i++){
            HashMap<String,Object>map=new HashMap<String,Object>();
            map.put("教师：", studentMessageDTO.getDetail().get(i).gettName());
            map.put("课程：", studentMessageDTO.getDetail().get(i).getcName());
            map.put("分数：", studentMessageDTO.getDetail().get(i).getsScore());
            detail001.add(map);
        }
        studentMessageDTO.setDetail01(detail001);
        return studentMessageDTO;
    }
}
