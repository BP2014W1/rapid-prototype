package jcomparser;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Seed {

    public void getDBcontent(){

    }


    public void setDBcontent(){

    }

    public ArrayList<Integer> getAllActivityIDByFragmentID(int id) {
        jcomparser.Connector connect;
        Connection conn = jcomparser.Connector.connect();

        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Integer> results = new ArrayList<Integer>();
        if (conn == null) return results;

        try {
            //Execute a query
            stmt = conn.createStatement();
            String sql = "SELECT id FROM ProcessElement WHERE type = 'Activity' AND fragment_id = "+id+" ORDER BY id";

            rs = stmt.executeQuery(sql);
            while(rs.next()){
                results.add(rs.getInt("id"));
            }

            //Clean-up environment
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

        return results;
    }
}
