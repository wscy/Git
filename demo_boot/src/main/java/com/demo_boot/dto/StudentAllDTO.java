package com.demo_boot.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author YuChen
 * @version 1.0
 * @date 2019/7/18 14:52
 * Describle 这是返回给前端的数据
 */
@ApiModel(value = "Student",description = "学生信息描述")
public class StudentAllDTO {
    @ApiModelProperty("学号")
   private String sId;
    @ApiModelProperty("姓名")
   private String sName;
    @ApiModelProperty("成绩")
   private List<Integer> sScore;
    @ApiModelProperty("课程名")
   private List<String> cName;
    @ApiModelProperty("老师名")
   private List<String> tName;

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

    public List<Integer> getsScore() {
        return sScore;
    }

    public void setsScore(List<Integer> sScore) {
        this.sScore = sScore;
    }

    public List<String> getcName() {
        return cName;
    }

    public void setcName(List<String> cName) {
        this.cName = cName;
    }

    public List<String> gettName() {
        return tName;
    }

    public void settName(List<String> tName) {
        this.tName = tName;
    }
}
