package se.yrgo.rest;

import se.yrgo.domain.Person;

import java.util.List;

public class PersonList {

    private List<Person> personList;

    public PersonList() {}

    public PersonList(List<Person> list) {
        this.personList = list;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setThingList(List<Person> list) {
        this.personList = list;
    }
}
