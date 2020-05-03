package br.estacio.prii.copa.bd;

import br.estacio.prii.copa.dao.GenericoDAO;
import br.estacio.prii.copa.entidade.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author francisco.newton
 */
public class UsuarioDAO extends GenericoDAO
{
    
    public UsuarioDAO()
    {
        
    }
    
    
    
    public boolean validarLogin(String login, String senha){
        String sql = "SELECT * FROM USUARIOS WHERE USERNAME =? AND SENHA =? ";
        boolean resultado;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, login);
            pstmt.setString(2, senha);
            rs = pstmt.executeQuery();
            resultado = rs.next();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
        return resultado;
    }
    
    public void incluir(Usuario usuario)
    {
        String sql = "INSERT INTO USUARIOS (username, nome, email, telefone, obs, admin, senha) VALUES (?, ?, ?, ?, ?, ?, ?)" ;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, usuario.getLogin());
            pstmt.setString(2, usuario.getNome());
            pstmt.setString(3, usuario.getEmail());
            pstmt.setString(4, usuario.getCelular());
            pstmt.setString(5, usuario.getObs());
            pstmt.setString(6, Boolean.toString(usuario.isAdmin()));
            pstmt.setString(7, usuario.getSenha());
            pstmt.execute();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
    public List<Usuario> buscaUsuarioLogin(String login)
    {
        String sql = "SELECT * FROM USUARIOS WHERE USERNAME = ?";
        List<Usuario> listaUsuarios = new ArrayList();
        Usuario usuario;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, login);
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                usuario = new Usuario();
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setCelular(rs.getString("telefone"));
                usuario.setAdmin(rs.getBoolean("admin"));
                listaUsuarios.add(usuario);
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

    
    public List<Usuario> buscaUsuarioNome(String nome)
    {
        String sql = "SELECT * FROM USUARIOS WHERE NOME LIKE ?";
        List<Usuario> listaUsuarios = new ArrayList();
        Usuario usuario;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, "%"+nome+"%");
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                usuario = new Usuario();
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setCelular(rs.getString("telefone"));
                usuario.setLogin(rs.getString("username"));
                usuario.setAdmin(rs.getBoolean("admin"));
                listaUsuarios.add(usuario);
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
    
    public List<Usuario> buscaUsuarioTelefone(String telefone)
    {
        String sql = "SELECT * FROM USUARIOS WHERE TELEFONE LIKE ?";
        List<Usuario> listaUsuarios = new ArrayList();
        Usuario usuario;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, "%"+telefone+"%");
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                usuario = new Usuario();
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setCelular(rs.getString("telefone"));
                usuario.setLogin(rs.getString("username"));
                usuario.setAdmin(rs.getBoolean("admin"));
                listaUsuarios.add(usuario);
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
    
    public List<Usuario> getLista() 
    {
        String sql = "SELECT * FROM USUARIOS";
        List<Usuario> listaUsuarios = new ArrayList();
        Usuario usuario;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                usuario = new Usuario();
                usuario.setLogin(rs.getString("username"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setCelular(rs.getString("telefone"));
                listaUsuarios.add(usuario);
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
    
    /*public boolean consultar(String login, String senha)
    {
        String sql = "SELECT * FROM USUARIOS WHERE USERNAME=? AND SENHA=?";
       
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, login);
            pstmt.setString(2, senha);
            rs = pstmt.executeQuery();
            
            rs.close();
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
        return rs.getBoolean(1);
    }
    

    public List<Usuario> getLista() 
    {
        String sql = "SELECT * FROM TESTE";
        List<Usuario> listaUsuarios = new ArrayList();
        Usuario usuario;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                usuario = new Usuario();
                usuario.setCodigo(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                listaUsuarios.add(usuario);
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

    public List<Usuario> getListaNome(String nome)
    {
        String sql = "SELECT * FROM TESTE WHERE NOME LIKE ?";
        List<Usuario> listaUsuarios = new ArrayList();
        Usuario usuario;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, "%"+nome+"%");
            rs = pstmt.executeQuery();
            while (rs.next()) 
            {
                usuario = new Usuario();
                usuario.setCodigo(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                listaUsuarios.add(usuario);
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

    public boolean alterar(Usuario usuario)
    {
        String sql = "UPDATE TESTE SET nome=? WHERE id=?";
        boolean resultado;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setString(1, usuario.getNome());
            pstmt.setInt(2, usuario.getCodigo());
            resultado = (pstmt.executeUpdate() > 0);
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
        return resultado;
    }

    public boolean excluir(int codigo)
    {
        String sql = "DELETE FROM TESTE WHERE id=?";
        boolean resultado;
        try
        {
            pstmt = getConnection().prepareStatement(sql);
            pstmt.setInt(1, codigo);
            resultado = (pstmt.executeUpdate() > 0);
            pstmt.close();
        }
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
        return resultado;
    }
*/
    
}
