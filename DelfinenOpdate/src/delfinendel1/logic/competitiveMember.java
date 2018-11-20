/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinendel1.logic;

/**
 *
 * @author willi
 */
public class competitiveMember {

    private String fname;
    private String lname;
    private int age;
    private String team; 
    private String sex; 
    private int btime;
    private int ctime;
    private int bctime;
    private int bstime;

    public competitiveMember(String fname, String lname, int age, String team, String sex, int btime, int ctime, int bctime, int bstime) {
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

    public int getBtime() {
        return btime;
    }

    public int getCtime() {
        return ctime;
    }

    public int getBctime() {
        return bctime;
    }

    public int getBstime() {
        return bstime;
    }
    
    

    

}
