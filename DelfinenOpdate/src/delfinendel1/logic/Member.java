/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinendel1.logic;

/**
 *
 * @author frizz
 */
public class Member 
{
    private String fname;
    private String lname;
    private int age;
    private String team; 
    private String sex; 
    private String membership; 
    private String ActivePassive;
    
    public Member(String fname, String lname, int age, String team, String sex, String membership, String ActivePassive)
    {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.team = team;
        this.sex = sex;
        this.membership = membership;
        this.ActivePassive = ActivePassive;
    }



    public String getfName() {
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

    public String getMembership() {
        return membership;
    }

    public String getActivePassive() {
        return ActivePassive;
    }
    
    
     public int getSubscription()
    {
       int price = 500;
        
        if(getActivePassive().equals("Aktiv")){
            if(getAge() < 18){
                price = 1000;
            }
            else if(getAge() >= 60){
                price = (int) (1600 * 0.75);
            }
            else
                price = 1600;
        }
        return price;
        
    }
     
}
        
       /* if(Aktivitetsform.getSelectedItem().toString().equals("Aktiv")){
            if (Integer.parseInt(Alder.getText()) < 18){
                    price = 1000;
                    Label1.setText("Dit kontigent er" + price);
                }
                else if (Integer.parseInt(Alder.getText()) >= 60){
                    price = (int) (1600 * 0.75);
                    Label1.setText("Dit kontigent er" + price);
                }
                else
                    price = 1600;
                           
                
        }
        
        return price;
    }*/

    

