package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employe> employeList = Arrays.asList(new Employe(10,"Hari","IT",6000.0),
                new Employe(1,"meghana","IT",1234.0),
                new Employe(13,"ramu","IT",7680.0),
                new Employe(15,"sirish","IT",1140.0),
                new Employe(9,"rajesh","IT",9780.0),
                new Employe(5,"prasad","Bank",1123.0),
                new Employe(12,"om","Bank",1230.0),
                new Employe(2,"rakesh","Bank",6750.0),
                new Employe(6,"priya","Bank",98760.0),
                new Employe(16,"lakshmi","Bank",9860.0),
                new Employe(8,"asif","Ecommerce",62780.0),
                new Employe(14,"suresh","Ecommerce",73870.0),
                new Employe(3,"rajesh","Ecommerce",67380.0),
                new Employe(11,"sweety","Ecommerce",23670.0),
                new Employe(7,"sailu","Ecommerce",373780.0),
                new Employe(4,"john","Ecommerce",563760.0),
                new Employe(17,"Lisa","IT",6003.0),
                new Employe(18,"kareti","IT",60000.0));


        //employeList.stream().forEach(s->System.out.println(s));

        //fetch the top 5 employe salaries in IT department

           List<Employe> depts = employeList.stream().filter(e->e.getDepartment()=="IT")
                .collect(Collectors.toList());

           /*depts.stream().sorted((e1,e2)-> (int) (e2.getSalary()- e1.getSalary()))
                   .forEach(s->System.out.println(s.getName()+" "+s.getSalary()+" "+s.getDepartment()));*/

       /* depts.stream().sorted((e1,e2)-> (int) (e2.getSalary()- e1.getSalary())).limit(5)
                .forEach(s->System.out.println(s.getName()+"====== "+s.getSalary()+"====== "+s.getDepartment()));*/

        depts.stream().sorted(Comparator.comparingDouble(Employe::getSalary).reversed()).limit(5)
                .forEach(s->System.out.println(s.getName()+" "+s.getSalary()+" "+s.getDepartment()));









    }
}