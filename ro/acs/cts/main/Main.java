package ro.acs.cts.main;

import ro.acs.cts.classes.Creator;
import ro.acs.cts.classes.DataReader;
import ro.acs.cts.classes.Inserter;
import ro.acs.cts.classes.Manager;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
            connection.setAutoCommit(false);

            Manager manager = new Manager(new Creator(), new Inserter(), new DataReader());
            manager.run(connection);

            /*Creator creator = new Creator();
            creator.createTable(connection);
            Inserter inserter = new Inserter();
            inserter.insertData(connection);
            DataReader dataReader = new DataReader();
            dataReader.readData(connection);*/

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}