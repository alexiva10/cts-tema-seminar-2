package ro.acs.cts.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface CreateTable {
    void createTable(Connection connection) throws SQLException;
}
