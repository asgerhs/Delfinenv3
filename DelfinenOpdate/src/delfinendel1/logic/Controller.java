/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinendel1.logic;

import DelfinenPart1.data.DBConnector;
import DelfinenPart1.data.DataAccessorDB;

/**
 *
 * @author bruger
 */

public class Controller {
    
    DataAccessorDB da = null;

    public Controller() {
        try {
            da = new DataAccessorDB(new DBConnector());
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Setup fail!");
        }

    }
    
    
    
    public void createMember(Member m)
    {
        da.createMember(m); 
    }
    
    public void createCompetitiveMember(competitiveMember cm) {
        da.createCompetitiveMember(cm);
    }
    
    public void insertBTime(competitiveMember cm) {
        da.insertBTime(cm);
    }
    
    public void insertBSTime(competitiveMember cm) {
        da.insertBSTime(cm);
    }
    
    public void insertBCTime(competitiveMember cm) {
        da.insertBCTime(cm);
    }
    
    public void insertCTime(competitiveMember cm) {
        da.insertCTime(cm);
    }
}
