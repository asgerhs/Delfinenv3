/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelfinenPart1.data;

import DelfinenPart1.presentation.GUI_createMember;
import delfinendel1.logic.Member;
import delfinendel1.logic.competitiveMember;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asger H. Sørensen
 */
public class DataAccessorDB 
{
    private DBConnector connector = null;

    public DataAccessorDB(DBConnector connector) {
        this.connector = connector;
    }
    
       
    public List<Member> getMembers() {
        try {
            ArrayList<Member> m = new ArrayList<>();
            String query = "Select * from member;";

            Connection connection = connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                m.add(new Member(rs.getString("firstname"),
                        rs.getString("lastname"),
                        rs.getInt("age"), 
                        rs.getString("team"), 
                        rs.getString("sex"), 
                        rs.getString("membership"), 
                        rs.getString("activity")));

            }
            return m;

        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalAccessError("No Connection to database");
        }

    }
    
    
    
    public void createMember(Object obj) //Burg member evt.
    {
        try{
            Member member = (Member)obj;
           // String query = "insert into members (name, age, team, sex, membership, active) VALUES ('"+ member.getName()+"' + '" + member.getAge() +"' + '"+ member.getTeam()+"' + '"+ member.getSex()+"' + '" + member.getMembership() + "' + '" + member.getActivePassive() + "');";
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            //ResultSet rs = stmt.executeUpdate();
            stmt.executeUpdate("insert into member (firstname, lastname, age, team, sex, membership, activity, subscription) VALUES ('"+ member.getfName()+"', '"+member.getLname()+"', '" + member.getAge() +"', '"+ member.getTeam()+"', '"+ member.getSex()+"', '" + member.getMembership() + "', '" + member.getActivePassive() + "', '"+ member.getSubscription()+"');");

            
           
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessorDB.class.getName()).log(Level.SEVERE, null, ex);
            //filføj data exception
    } 
        
}
    
    public void createCompetitiveMember(Object obj) {
        try{
            competitiveMember cm = (competitiveMember)obj;
            Connection c = connector.getConnection();
            Statement stmt = c.createStatement();
            stmt.executeUpdate("insert into competitive (fname, lname, age, team, sex, btime, ctime, bctime, bstime) VALUES ('" + cm.getFname() + "', '" + cm.getLname() + "', '" + cm.getAge() + "', '" + cm.getTeam() + "', '" + cm.getSex() + "', " + cm.getBtime() + ", " + cm.getCtime() + ", " + cm.getBctime() + ", " + cm.getBstime() + ");");
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<competitiveMember> getCompetitiveMembers() {
        try {
            ArrayList<competitiveMember> cm = new ArrayList<>();
            String query = "Select * from competitive;";

            Connection connection = connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                cm.add(new competitiveMember(rs.getString("fname"),
                        rs.getString("lname"),
                        rs.getInt("age"), 
                        rs.getString("team"), 
                        rs.getString("sex"), 
                        rs.getInt("btime"), 
                        rs.getInt("ctime"),
                        rs.getInt("bctime"),
                        rs.getInt("bstime")));

            }
            return cm;

        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalAccessError("No Connection to database");
        }
        
        
        

    }
    
    public void insertBTime(Object obj) {
        try {
            competitiveMember cm = (competitiveMember) obj;
            Connection c = connector.getConnection();
            Statement stmt = c.createStatement();
            stmt.executeUpdate("insert into competitive (btime) VALUES ('" + cm.getBtime() + ");");
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertCTime(Object obj) {
        try {
            competitiveMember cm = (competitiveMember) obj;
            Connection c = connector.getConnection();
            Statement stmt = c.createStatement();
            stmt.executeUpdate("insert into competitive (ctime) VALUES ('" + cm.getCtime() + ");");
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertBCTime(Object obj) {
        try {
            competitiveMember cm = (competitiveMember) obj;
            Connection c = connector.getConnection();
            Statement stmt = c.createStatement();
            stmt.executeUpdate("insert into competitive (bctime) VALUES ('" + cm.getBctime() + ");");
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertBSTime(Object obj) {
        try {
            competitiveMember cm = (competitiveMember) obj;
            Connection c = connector.getConnection();
            Statement stmt = c.createStatement();
            stmt.executeUpdate("insert into competitive (bstime) VALUES ('" + cm.getBstime() + ");");
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editMemberFname(Object obj){
        try{
            Member member = (Member)obj;
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(
                    "UPDATE member "
                    + "SET firstname ='" + member.getfName() + "'"
                    //+ "WHERE firstname ='" + member.getfName() + "'"
                    + "WHERE lastname = '" + member.getLname() + "';");
                           
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editMemberLname(Object obj){
        try{
            Member member = (Member)obj;
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(
                    "UPDATE member "
                    + "SET lastname ='" + member.getLname() + "'"
                    //+ "WHERE firstname ='" + member.getfName() + "'"
                    + "WHERE firstname = '" + member.getfName() + "';");
                           
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void editMemberAge(Object obj){
        try{
            Member member = (Member)obj;
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(
                    "UPDATE member "
                    + "SET age ='" + member.getAge() + "'"
                    + "WHERE firstname ='" + member.getfName() + "'"
                    + "AND lastname = '" + member.getLname() + "';");
                           
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void editMemberTeam(Object obj){
        try{
            Member member = (Member)obj;
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(
                    "UPDATE member "
                    + "SET team ='" + member.getTeam() + "'"
                    + "WHERE firstname ='" + member.getfName() + "'"
                    + "AND lastname = '" + member.getLname() + "';");
                           
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
            public void editMemberActivity(Object obj){
        try{
            Member member = (Member)obj;
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(
                    "UPDATE member "
                    + "SET activity ='" + member.getActivePassive() + "'"
                    + "WHERE firstname ='" + member.getfName() + "'"
                    + "AND lastname = '" + member.getLname() + "';");
                           
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
