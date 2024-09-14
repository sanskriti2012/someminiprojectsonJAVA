package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class truckservice {
    public void addtruck(truck truck)
    {
        String sql="insert into truck(name,model,capacity,driver_name) values (?,?,?,?)";
        try{
            Connection connection=Connectiondetails.getConnection();
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1, truck.getName());
            preparedStatement.setString(2, truck.getModel());
            preparedStatement.setInt(3,truck.getCapacity());
            preparedStatement.setString(4,truck.getDriver_name());

            int update= preparedStatement.executeUpdate();
            System.out.println("row impacted:"+update);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public truck gettruckbyId(int id){
        String sql="select * from truck where id=?";
        truck truck=new truck();
        try{
            Connection connection=Connectiondetails.getConnection();
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                truck.setId(resultSet.getInt("id"));
                truck.setName(resultSet.getString("name"));
                truck.setModel(resultSet.getString("model"));
                truck.setCapacity(resultSet.getInt("capacity"));
                truck.setDriver_name(resultSet.getString("driver_name"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return truck ;
    }

    public void updatetruck(truck truck){
        String sql= "update truck set name=?, model=?,capacity=?,driver_name=? where id=?";
        try{
            Connection connection=Connectiondetails.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,truck.getName());
            preparedStatement.setString(2,truck.getModel());
            preparedStatement.setInt(3,truck.getCapacity());
            preparedStatement.setString(4,truck.getDriver_name());
            preparedStatement.setInt(5,truck.getId());

            int update =preparedStatement.executeUpdate();
            System.out.println("row updated"+update);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<truck> getalltrucks()
    {
         String sql="select * from truck";
         List<truck> trucks=new ArrayList<truck>();
         try{
             Connection connection=Connectiondetails.getConnection();
             Statement statement=connection.createStatement();
             ResultSet resultSet=statement.executeQuery(sql);
             while(resultSet.next())
             {
                 truck truck=new truck();
                 truck.setId(resultSet.getInt("id"));
                 truck.setName(resultSet.getString("name"));
                 truck.setModel(resultSet.getString("model"));
                 truck.setCapacity(resultSet.getInt("capacity"));
                 truck.setDriver_name(resultSet.getString("driver_name"));
                 trucks.add(truck);
             }
         }catch (Exception e)
         {
             e.printStackTrace();
         }
         return trucks;
    }

    public void  deletetruck(int id)
    {
        String deletequery="delete from truck where id =? ";
        try{
            Connection connection=Connectiondetails.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(deletequery);
            preparedStatement.setInt(1,id);
            int update= preparedStatement.executeUpdate();
            System.out.println("row deleted :"+update);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
