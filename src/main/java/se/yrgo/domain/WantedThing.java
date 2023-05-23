package se.yrgo.domain;

import javax.persistence.*;

@Entity
public class WantedThing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String wisher_id;

    public WantedThing() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWisher_id() {
        return wisher_id;
    }

    public void setWisher_id(String wisher_id) {
        this.wisher_id = wisher_id;
    }

    @Override
    public String toString() {
        return name;
    }
}
