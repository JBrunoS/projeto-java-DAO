/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.copa.bd;

import br.estacio.prii.copa.dao.GenericoDAO;
import br.estacio.prii.copa.entidade.Jogo;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruth
 */
public class JogosDAO extends GenericoDAO{
     public JogosDAO(){}
     
     public void incluir(Jogo jogo){
     String sql = "INSERT INTO JOGOS(selecao1, selecao2, placar1, placar2, local, data, hora, fase, grupo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
         try
        {
            pstmt = getConnection().prepareStatement(sql);
            
            pstmt.setString(1, jogo.getSelecaoA());
            pstmt.setString(2, jogo.getSelecaoB());
            pstmt.setInt(3, jogo.getPlacarA());
            pstmt.setInt(4, jogo.getPlacarB());
            pstmt.setString(5, jogo.getLocal());
            pstmt.setString(6, jogo.getData().toString());
            pstmt.setTime(7, jogo.getHora());
            pstmt.setString(8, jogo.getFase());
            pstmt.setString(9, jogo.getGrupo());
            
            pstmt.execute();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
     }
     
     public List<Jogo> buscaJogoNome()
    {
        String sql = "SELECT * FROM JOGOS ORDER BY DATA";
        List<Jogo> listaJogos = new ArrayList();
        Jogo jogo;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                jogo = new Jogo();
                jogo.setSelecaoA(rs.getString("selecao1"));
                jogo.setSelecaoB(rs.getString("selecao2"));
                jogo.setPlacarA(rs.getInt("placar1"));
                jogo.setPlacarB(rs.getInt("placar2"));
                jogo.setLocal(rs.getString("local"));
                jogo.setData(rs.getString("data"));
                jogo.setHora(rs.getTime("hora"));
                jogo.setFase(rs.getString("fase"));
                jogo.setGrupo(rs.getString("grupo"));
                
                listaJogos.add(jogo);
            }
            rs.close();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
        return listaJogos;
    }
}
