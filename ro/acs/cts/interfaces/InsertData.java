package ro.acs.cts.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface InsertData {
    void insertData(Connection connection) throws SQLException;
}
