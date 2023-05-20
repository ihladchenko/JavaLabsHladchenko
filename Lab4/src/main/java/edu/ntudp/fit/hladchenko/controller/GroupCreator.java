package edu.ntudp.fit.hladchenko.controller;

import edu.ntudp.fit.hladchenko.model.Group;

public class GroupCreator {

    public Group createGroup(String name) {
        return new Group(name);
    }
}
