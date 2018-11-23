/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinendel1.logic;

/**
 *
 * @author William Huusfeldt, Asger H. Sørensen.
 */
public class competitiveMember {

    private int id;
    private String fname;
    private String lname;
    private int age;
    private String team;
    private String sex;
    private double btime;
    private double ctime;
    private double bctime;
    private double bstime;

    public competitiveMember(int id, String fname, String lname, int age, String team, String sex, double btime, double ctime, double bctime, double bstime) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.team = team;
        this.sex = sex;
        this.btime = btime;
        this.ctime = ctime;
        this.bctime = bctime;
        this.bstime = bstime;
    }

    public int getID() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getAge() {
        return age;
    }

    public String getTeam() {
        return team;
    }

    public String getSex() {
        return sex;
    }

    public double getBtime() {
        return btime;
    }

    public double getCtime() {
        return ctime;
    }

    public double getBctime() {
        return bctime;
    }

    public double getBstime() {
        return bstime;
    }

}
