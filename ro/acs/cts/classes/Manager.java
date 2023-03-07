package ro.acs.cts.classes;


import java.sql.Connection;
import java.sql.SQLException;

public class Manager {

    private Creator creator;
    private Inserter inserter;
    private DataReader dataReader;

    public Manager(Creator creator, Inserter inserter, DataReader dataReader) {
        this.creator = creator;
        this.inserter = inserter;
        this.dataReader = dataReader;
    }

    public void run(Connection connection) throws SQLException {
        creator.createTable(connection);
        inserter.insertData(connection);
        dataReader.readData(connection);
    }

}
