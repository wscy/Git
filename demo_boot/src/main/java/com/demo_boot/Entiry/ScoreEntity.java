package com.demo_boot.Entiry;

import java.util.Objects;

/**
 * @author YuChen
 * @version 1.0
 * @date 2019/7/18 14:01
 * Describle 描述
 */
public class ScoreEntity {
    private String sId;
    private String cId;
    private Integer sScore;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public Integer getsScore() {
        return sScore;
    }

    public void setsScore(Integer sScore) {
        this.sScore = sScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoreEntity that = (ScoreEntity) o;
        return Objects.equals(sId, that.sId) &&
                Objects.equals(cId, that.cId) &&
                Objects.equals(sScore, that.sScore);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sId, cId, sScore);
    }
}
