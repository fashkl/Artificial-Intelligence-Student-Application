/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.sql.*;

/**
 *
 * @author Muhammed
 */
public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.jdbc.Driver");
             Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/stu","root","1994");
             int id=1;
             Statement st = mycon.createStatement();
             String select = "select * from student";
             
             ResultSet rs = st.executeQuery(select);
             
             while(rs.next()){
                 System.out.println("id ="+rs.getInt(1)+" Name ="+rs.getString(2));
             }

            
            
            
            
            
            
            
            
    }
    
}
