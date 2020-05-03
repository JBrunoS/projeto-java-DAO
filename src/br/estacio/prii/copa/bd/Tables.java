/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.copa.bd;

import br.estacio.prii.copa.dao.GenericoDAO;
import java.sql.SQLException;

/**
 *
 * @author Ruth
 */
public class Tables extends GenericoDAO{
    
    public Tables(){
        
    }
    
    
    
    
    
    public boolean createTableUsuario()
    {
        String sql = "CREATE TABLE USUARIOS( " +
            "codigo integer not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) " +
            "CONSTRAINT PK_USUARIOS PRIMARY KEY, " +
            "username varchar(25), " +
            "nome varchar(40), " +
            "email varchar(40), " +
            "telefone varchar(40), " +
            "obs varchar(200), " +
            "admin BOOLEAN, " +
            "senha varchar(40)"    +
            ")";
        try 
        {
            this.pstmt = this.getConnection().prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
            System.out.println( "Criada tabela no banco de dados!" );
        }
        catch (SQLException e) 
        {
                e.printStackTrace();
        }
        
        return true;
    }
    
    public boolean createTableSelecao()
    {
        String sql = "CREATE TABLE SELECOES( " +
                "codigo integer not null GENERATED ALWAYS AS IDENTITY( START WITH 1, INCREMENT BY 1) " +
                "CONSTRAINT PK_SELECOES PRIMARY KEY, " +
                "nome varchar(40), " +
                "tecnico varchar(40), " +
                "grupo varchar(40), " +
                "descricao varchar(100), " +
                "imagem varchar(255)" +
                ")";
        
        try 
        {
            this.pstmt = this.getConnection().prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
            System.out.println( "Criada tabela no banco de dados!" );
        }
        catch (SQLException e) 
        {
                e.printStackTrace();
        }
        
        return true;
    }
    
    public boolean createTableEstadios(){
        String sql = "CREATE TABLE ESTADIOS ( " +
                "codigo integer not null GENERATED ALWAYS AS IDENTITY( START WITH 1, INCREMENT BY 1) " +
                "CONSTRAINT PK_ESTADIOS PRIMARY KEY, " +
                "nome varchar(40), " +
                "cidade varchar(40), " +
                "capacidade DOUBLE" +
                ")";
        
        try 
        {
            this.pstmt = this.getConnection().prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
            System.out.println( "Criada tabela no banco de dados!" );
        }
        catch (SQLException e) 
        {
                e.printStackTrace();
        }
        
        return true;
    }
    
    public boolean createTableJogos(){
        String sql = "CREATE TABLE JOGOS ( " +
                "codigo integer not null GENERATED ALWAYS AS IDENTITY( START WITH 1, INCREMENT BY 1) " +
                "CONSTRAINT PK_JOGOS PRIMARY KEY, " +
                "selecao1 varchar(40), " +
                "selecao2 varchar(40), " +
                "placar1 integer, " +
                "placar2 integer, " +
                "local varchar(40), " +
                "data varchar(40), " +
                "hora TIME, " +
                "fase varchar(40), " +
                "grupo varchar(10)" +
                ")";
        
        try 
        {
            this.pstmt = this.getConnection().prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
            System.out.println( "Criada tabela no banco de dados!" );
        }
        catch (SQLException e) 
        {
                e.printStackTrace();
        }
        
        return true;
    }
    
}
