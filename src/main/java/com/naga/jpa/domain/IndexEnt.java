package com.naga.jpa.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;

@Entity
public class IndexEnt {

    @Id
    private String ric;

    @JdbcTypeCode(SqlTypes.JSON)
    private List<Basket> indexComponents;

    public IndexEnt() {
    }

    public IndexEnt(String ric, List<Basket> indexComponents) {
        this.ric = ric;
        this.indexComponents = indexComponents;
    }

    public String getRic() {
        return ric;
    }

    public void setRic(String ric) {
        this.ric = ric;
    }

    public List<Basket> getIndexComponents() {
        return indexComponents;
    }

    public void setIndexComponents(List<Basket> indexComponents) {
        this.indexComponents = indexComponents;
    }
}
