package br.estacio.prii.copa.dao;

import br.estacio.prii.copa.dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author francisco.newton
 */
public abstract class GenericoDAO {
    private final Connection connection = new ConnectionFactory().getDerbyConnection();
    
    protected Statement stmt;
    protected ResultSet rs;
    protected PreparedStatement pstmt;
    
    public Connection getConnection()
    {
        return connection;
    }
    
    
    
}
