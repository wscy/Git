package com.demo_boot.Controller;

import com.demo_boot.Service.StudentService;
import com.demo_boot.dto.StudentAllDTO;
import com.demo_boot.dto.StudentMessageDTO;

import com.demo_boot.utils.ReturnCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YuChen
 * @version 1.0
 * @date 2019/7/17 23:11
 * Describle 学生信息控制
 */
@Api(value = "学生信息查询",description = "学生信息查询API",tags = "UserApi", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class StudentControl {
    //记录日志
    private  static Logger logger= LoggerFactory.getLogger(StudentControl.class);

    @Autowired
    private StudentService studentService;

//    返回学生信息
    @ApiOperation("测试学生信息返回")
    @RequestMapping("showStudent")
    public StudentAllDTO showStudent(String userName){
            return studentService.showMessage(userName);
    }

    //返回学生信息的另一种方法
    @ApiOperation("测试学生信息返回01")
    @RequestMapping("showStudent01")
    public ReturnCode showStudent01(String userName){
        ReturnCode R=ReturnCode.ok();//正常返回
        R.put("data",studentService.showMessage01(userName));
        logger.info("这是普通的log");
        return R;
    }

}
