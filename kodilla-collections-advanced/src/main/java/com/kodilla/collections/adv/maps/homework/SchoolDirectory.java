package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<Principal, School> host = new HashMap<>();
        Principal john = new Principal("John" , "Smith" , "IV LO");
        Principal candy = new Principal("Candy" , "Rose" , "I LO");
        Principal mateo = new Principal("Mateo" , "Luigi" , "II LO");

        School johnSchool = new School(20.0, 16.0, 28.0, 26.0);
        School candySchool = new School(30.0, 19.0, 32.0);
        School mateoSchool = new School(35.0, 19.0, 29.0, 14.0, 31.0, 33.0);

        host.put(john, johnSchool );
        host.put(candy, candySchool);
        host.put(mateo, mateoSchool);

        System.out.println(host.get(candy));

        for (Map.Entry<Principal, School> principalEntry : host.entrySet())
            System.out.println(principalEntry.getKey().getFirstName() +" "+ principalEntry.getKey().getLastname() +" " +"is a principal of " +
                    principalEntry.getKey().getSchoolname() +". The total number of students in this school is: "+" "+ principalEntry.getValue().getAverage());

    }

}
