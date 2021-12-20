package org.example;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public void doQuery() {

        System.out.println("Doing some query against data stored!!");

    }

}
