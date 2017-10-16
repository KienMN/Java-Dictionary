package dictionary;

import java.sql.*;

/**
 *
 * @author KienM
 */
public class Database {

    static final String eVDB = "jdbc:sqlite:anh_viet.db";
    static final String vEDB = "jdbc:sqlite:viet_anh.db";
    static final String className = "org.sqlite.JDBC";
    private static Connection connectEV;
    private static Connection connectVE;
    private static Statement statementEV;
    private static Statement statementVE;
    private String typeOfDictionary = "anh_viet";

    //Database constructor
    public Database() {
        try {
            Class.forName(className);
            connectEV = DriverManager.getConnection(eVDB);          //create connection
            connectEV.setAutoCommit(false);
            statementEV = connectEV.createStatement();              //create statement
            connectVE = DriverManager.getConnection(vEDB);
            connectVE.setAutoCommit(false);
            statementVE = connectVE.createStatement();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //close database
    public final void closeDatabase() {
        if (connectEV != null) {
            connectEV = null;
        }
        if (connectVE != null) {
            connectVE = null;
        }
        if (statementEV != null) {
            statementEV = null;
        }
        if (statementVE != null) {
            statementVE = null;
        }
    }

    //Searching method
    public String selectMeaning(String word) {
        if (!Interface.eVDictionary()) {                       //determine type of dictionary
            typeOfDictionary = "viet_anh";
        }
        String sql = "SELECT content FROM " + typeOfDictionary + " WHERE word = '" + word + "';";
        String res = null;
        try {                                                   //execute query
            ResultSet resultSet = null;
            if (!Interface.eVDictionary()) {
                resultSet = statementVE.executeQuery(sql);
            } else {
                resultSet = statementEV.executeQuery(sql);
            }
            if (resultSet != null) {
                res = resultSet.getString(1);
                return res;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //Addition method
    public void insertContent(String word, String meaning) {
        if (!Interface.eVDictionary()) {                       //determine type of dictionary
            typeOfDictionary = "viet_anh";
        }
        String sql = "INSERT INTO " + typeOfDictionary + " (word, content) VALUES ('" + word + "', '" + meaning + "');";
        try {                                                   //execute update
            if (Interface.eVDictionary()) {
                statementEV.executeUpdate(sql);
                connectEV.commit();
            } else {
                statementVE.executeUpdate(sql);
                connectVE.commit();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Update method
    public void updateContent(String word, String meaning) {
        if (!Interface.eVDictionary()) {                   //determine type of dictionary
            typeOfDictionary = "viet_anh";
        }
        String sql = "UPDATE " + typeOfDictionary + " SET content = '" + meaning + "' WHERE word = '" + word + "';";
        try {                                               //execute update
            if (Interface.eVDictionary()) {
                statementEV.executeUpdate(sql);
                connectEV.commit();
            } else {
                statementVE.executeUpdate(sql);
                connectVE.commit();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Removal method
    public void deleteContent(String word) {
        if (!Interface.eVDictionary()) {               //determine type of dictionary
            typeOfDictionary = "viet_anh";
        }
        String sql = "DELETE FROM " + typeOfDictionary + " WHERE word = '" + word + "';";
        try {
            if (Interface.eVDictionary()) {
                statementEV.executeUpdate(sql);
                connectEV.commit();
            } else {
                statementVE.executeUpdate(sql);
                connectVE.commit();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Create list of similar words
    public String listWords(String word) {
        if (!Interface.eVDictionary()) {                       //determine type of dictionary
            typeOfDictionary = "viet_anh";
        }
        String sql = "SELECT word FROM " + typeOfDictionary + " WHERE word LIKE '" + word + "%';";
        String res = "";
        try {
            ResultSet resultSet = null;
            if (!Interface.eVDictionary()) {
                resultSet = statementVE.executeQuery(sql);
            } else {
                resultSet = statementEV.executeQuery(sql);
            }
            while (resultSet.next()) {
                res += resultSet.getString(1) + "\n";
            }
//            System.out.println(res);
            return res;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
