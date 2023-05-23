package se.yrgo.rest;

import se.yrgo.domain.OwnedThing;

import java.util.List;

public class OwnedThingList {
    private List<OwnedThing> ownedThingList;

    public OwnedThingList() {}

    public OwnedThingList(List<OwnedThing> ownedThingList) {
        this.ownedThingList = ownedThingList;
    }

    public List<OwnedThing> getThingList() {
        return ownedThingList;
    }

    public void setThingList(List<OwnedThing> ownedThingList) {
        this.ownedThingList = ownedThingList;
    }
}
