package com.sumanga.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
//        System.out.println("Hello Java");
//        List<String> students=new ArrayList<>();
//        students.add("Saman");
//        students.add("Namal");
//        students.add("Amal");
//        students.add("Ruwan");
//        students.add("Kanthi");
//
//        System.out.println(students);
//
//        List<String> x=students.stream().filter(s -> s.length()>5).collect(Collectors.toList());
//        System.out.println(x);
        List<Sensor> sensors=new ArrayList<>();

        Sensor sensor1 =new Sensor("Living room",28.0);
        sensors.add(sensor1);

        Sensor sensor2 =new Sensor("Office room",26.0);
        sensors.add(sensor2);

        Sensor sensor3 =new Sensor("Bed room",28.0);
        sensors.add(sensor3);

        Sensor sensor4 =new Sensor("Kitchen room",30.0);
        sensors.add(sensor4);

        Sensor sensor5 =new Sensor("Bath room",31.0);
        sensors.add(sensor5);
        

        List<Sensor> x=sensors.stream().filter(sensor -> sensor.getValue()>28).collect(Collectors.toList());
        System.out.println(x);

    }
}
