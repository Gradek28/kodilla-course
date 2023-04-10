package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg  = UsersRepository.getUserList()
                .stream()
                .mapToInt(n -> n.getAge())
                .average()
                .getAsDouble();
        System.out.println(avg);

    }
}
