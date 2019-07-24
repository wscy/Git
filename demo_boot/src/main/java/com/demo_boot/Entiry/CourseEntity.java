package com.demo_boot.Entiry;

import java.util.Objects;

/**
 * @author YuChen
 * @version 1.0
 * @date 2019/7/18 14:01
 * Describle 描述
 */
public class CourseEntity {
    private String cId;
    private String cName;
    private String tId;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseEntity that = (CourseEntity) o;
        return Objects.equals(cId, that.cId) &&
                Objects.equals(cName, that.cName) &&
                Objects.equals(tId, that.tId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cId, cName, tId);
    }
}
