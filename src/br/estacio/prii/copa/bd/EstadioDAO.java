/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.copa.bd;

import br.estacio.prii.copa.dao.GenericoDAO;
import br.estacio.prii.copa.entidade.Estadio;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruth
 */
public class EstadioDAO extends GenericoDAO{
    
    public EstadioDAO(){}
    
    public void incluir(Estadio estadio){
        String sql = "INSERT INTO ESTADIOS (nome, cidade, capacidade) VALUES (?, ?, ?)";
        
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, estadio.getNome());
            pstmt.setString(2, estadio.getCidade());
            pstmt.setString(3,(estadio.getCapacidade().toString()));
            
            
            pstmt.execute();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
    public List<Estadio> getLista() 
    {
        String sql = "SELECT * FROM ESTADIOS";
        List<Estadio> listaUsuarios = new ArrayList();
        Estadio estadio;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                estadio = new Estadio();
                estadio.setCodigo(rs.getInt("codigo"));
                estadio.setNome(rs.getString("nome"));
                listaUsuarios.add(estadio);
            }
            rs.close();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
        return listaUsuarios;
    }
}
