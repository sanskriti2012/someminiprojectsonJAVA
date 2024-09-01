package FindMyTrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {
    public static void main(String[] args) {

        TrainSystem trainSystem=new TrainSystem();
        Station  station1=new Station("S0076","Agra");
        Station  station2=new Station("S0076","Lucknow");

        Train train1=new Train("12607","Express Train","Express");
        Train train2=new Train("14435","SuperFast Train","SuperFast");

        Platform p1=new Platform(1);
        Platform p2=new Platform(2);

        p1.setTrain(train1);
        p2.setTrain(train2);

        List<Platform> platformList=new ArrayList<>();
        platformList.add(p1);
        platformList.add(p2);
        station1.setPlatformList(platformList);
        Schedule s1=new Schedule(train1,station1,"9AM","9:05AM",p1);
        Schedule s2=new Schedule(train2,station2,"10AM","10:05AM",p2);
        trainSystem.addstation(station1);
        trainSystem.addstation(station2);
        trainSystem.addtrain(train1);
        trainSystem.addtrain(train2);
        trainSystem.addschedule(s1);
        trainSystem.addschedule(s2);

        //lets fndout our train between two stations
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the source :");
        String source=sc.nextLine();
        System.out.println("Enter the Destination :");
        String destination=sc.nextLine();
       List<Schedule> mytrains=trainSystem.Findmytrain(source,destination);
        System.out.println("your trains between " + source + "and "+destination);
        Schedule schedule=mytrains.get(0);
        Train train=schedule.getTrain();
        System.out.println(train);






    }



}
