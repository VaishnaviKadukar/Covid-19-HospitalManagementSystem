/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgmtsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import mgmtsys.dbutil.DatabaseConnection;


/**
 *
 * @author welcome
 */
public class Countdoctordao {
    public static String countDoctors()throws Exception
   {     
       Connection con;
       con = DatabaseConnection.getCon();
        PreparedStatement ps;
        ps=con.prepareStatement("select count(*) from doctor");
        ResultSet rs=ps.executeQuery();
        String count=null;
       if(rs.next())
       {
        count=rs.getString("count(*)");
       }
         return count;
}
}

