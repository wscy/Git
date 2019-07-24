package com.demo_boot.dto;

/**
 * @author YuChen
 * @version 1.0
 * @date 2019/7/18 23:10
 * Describle 老师和学科类
 */
public class TeacherAndCourseDTO {
    private String tName;   //教师名
    private String cName;   //学科名
    private Integer sScore;//成绩

    public Integer getsScore() {
        return sScore;
    }

    public void setsScore(Integer sScore) {
        this.sScore = sScore;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }
}
