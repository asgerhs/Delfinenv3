package delfinendel1.logic;

import DelfinenPart1.data.*;
import java.util.List;

/**
 *
 * @author bruger
 */
public class DelfinenPart1 {
    
    public static void main(String[] args) {
        DataAccessorDB da = null;
        try{
            da = new DataAccessorDB(new DBConnector());
        }catch(Exception ex){
            ex.printStackTrace();
        }
        List<Member> members = da.getMembers();
        System.out.println(members);
    }
    
    
    
}
