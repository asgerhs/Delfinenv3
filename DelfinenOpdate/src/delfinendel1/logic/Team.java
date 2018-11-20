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
public class Team {
    
    private String teamname;
    private String name;
    private int age;
    private String sex;
    
    public Team(String teamname, String name, int age, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.teamname = teamname;
    }

    public String getTeamname() {
        return teamname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
    
}
