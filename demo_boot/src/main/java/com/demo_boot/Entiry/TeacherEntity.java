package com.demo_boot.Entiry;

import java.util.Objects;

/**
 * @author YuChen
 * @version 1.0
 * @date 2019/7/18 14:01
 * Describle 描述
 */
public class TeacherEntity {
    private String tId;
    private String tName;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherEntity that = (TeacherEntity) o;
        return Objects.equals(tId, that.tId) &&
                Objects.equals(tName, that.tName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tId, tName);
    }
}
