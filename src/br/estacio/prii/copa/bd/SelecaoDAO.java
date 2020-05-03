/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.copa.bd;

import br.estacio.prii.copa.dao.GenericoDAO;
import br.estacio.prii.copa.entidade.Selecao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruth
 */
public class SelecaoDAO extends GenericoDAO{
    
    public  SelecaoDAO(){}
    
    public void incluir(Selecao selecao){
        String sql = "INSERT INTO SELECOES (nome, tecnico, grupo, descricao, imagem) VALUES (?, ?, ?, ?, ?)";
        
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, selecao.getNome());
            pstmt.setString(2, selecao.getTecnico());
            pstmt.setString(3, selecao.getGrupo());
            pstmt.setString(4, selecao.getDescricao());
            pstmt.setString(5, selecao.getImagem());
            
            pstmt.execute();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
    public List<Selecao> buscaSelecaoGrupo(String grupo)
    {
        String sql = "SELECT * FROM SELECOES WHERE GRUPO = ?";
        List<Selecao> listaSelecao = new ArrayList();
        Selecao selecao;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, grupo);
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                selecao = new Selecao();
                selecao.setNome(rs.getString("nome"));
                listaSelecao.add(selecao);
            }
            rs.close();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
        return listaSelecao;
    }
    
}
