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
 * @author William Huusfeldt, Asger H. Sørensen.
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

    public void createMember(Member m) {
        da.createMember(m);
    }

    public void createCompetitiveMember(competitiveMember cm) {
        da.createCompetitiveMember(cm);
    }

    public void insertBTime(int ID, double btime) {
        da.insertBTime(ID, btime);
    }

    public void insertBSTime(int ID, double bstime) {
        da.insertBSTime(ID, bstime);
    }

    public void insertBCTime(int ID, double bctime) {
        da.insertBCTime(ID, bctime);
    }

    public void insertCTime(int ID, double bctime) {
        da.insertCTime(ID, bctime);
    }
}
