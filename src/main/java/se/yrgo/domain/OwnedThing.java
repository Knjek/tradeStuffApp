package se.yrgo.domain;

import javax.persistence.*;

@Entity
public class OwnedThing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String owner_id;

    public OwnedThing() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    @Override
    public String toString() {
        return name;
    }
}
