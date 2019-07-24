package com.demo_boot.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author YuChen
 * @version 1.0
 * @date 2019/7/18 23:03
 * Describle 换一种查询方式
 */
public class StudentMessageDTO {
    private String sId;//学号
    private String sName;//姓名
    private List<TeacherAndCourseDTO> detail;//分数 和学科和教师类
    private ArrayList<HashMap<String,Object>> detail01;//处理的类

    public ArrayList<HashMap<String, Object>> getDetail01() {
        return detail01;
    }

    public void setDetail01(ArrayList<HashMap<String, Object>> detail01) {
        this.detail01 = detail01;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public List<TeacherAndCourseDTO> getDetail() {
        return detail;
    }

    public void setDetail(List<TeacherAndCourseDTO> detail) {
        this.detail = detail;
    }
}
