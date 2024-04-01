package com.naga.jpa.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
public class IndexEnv {
    @Id
    private int id;

    @JdbcTypeCode(SqlTypes.JSON)
    private IndexEnt indexEnt;

    public IndexEnv() {
    }

    public IndexEnv(int id, IndexEnt indexEnt) {
        this.id = id;
        this.indexEnt = indexEnt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IndexEnt getIndexEnt() {
        return indexEnt;
    }

    public void setIndexEnt(IndexEnt indexEnt) {
        this.indexEnt = indexEnt;
    }
}
