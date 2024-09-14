package org.example;

import java.sql.*;
import java.util.List;

public class App {

    public static void main(String[] args) {
      truckservice truckservice=new truckservice();
       truck TATA=new truck("TATA","2019",1000,"RAJESH");
        truck VOLVO=new truck("VOLVO","2016",2000,"PUNIT");
        truck EICHER=new truck("EICHER","2022",3000,"DEEPAK");
        truckservice.addtruck(TATA);
        truckservice.addtruck(VOLVO);
        truckservice.addtruck(EICHER);

        //FETCH

        truck truck= truckservice.gettruckbyId(1);
        System.out.println("truck by id"+truck);

        //update
        truck.setDriver_name("ramesh");
        truckservice.updatetruck(truck);
        System.out.println("updated truck data"+truckservice.gettruckbyId(1));


        //get all trucks

        List<truck> all_trucks= truckservice.getalltrucks();
        System.out.println("get all trucks");
        for(truck truck1:all_trucks){
            System.out.println(truck1);
        }

        //delete truck data
        truckservice.deletetruck(2);
        System.out.println("data deleted by id"+2);
        all_trucks=truckservice.getalltrucks();
        System.out.println("all trucks after all operation");
        System.out.println(all_trucks);
    }

}
