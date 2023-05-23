package se.yrgo.rest;

import se.yrgo.domain.Person;
import se.yrgo.domain.WantedThing;

import java.util.List;

public class WantedThingList {

    private List<WantedThing> wantedThingList;

    public WantedThingList() {}

    public WantedThingList(List<WantedThing> list) {
        this.wantedThingList = list;
    }

    public List<WantedThing> getWantedThingList() {
        return wantedThingList;
    }

    public void setWantedThingList(List<WantedThing> wantedThingList) {
        this.wantedThingList = wantedThingList;
    }
}
