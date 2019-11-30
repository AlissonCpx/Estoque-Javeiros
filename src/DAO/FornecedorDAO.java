
package DAO;

import Connection.Conexao;
import Model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FornecedorDAO {
    
    // metodo inserir
    public boolean inserir(Fornecedor f){
        Connection con = new Conexao().getConnection();
        PreparedStatement stmt;
        
        try {
            String sql = "insert into fornecedor(cnpj_fornecedor, nome_fornecedor, end_fornecedor, num_fornecedor, compl_fornecedor, bairro_fornecedor,cep_fornecedor, fone_fornecedor)\n" +
                "values(?, ?, ?, ?, ?, ?, ?, ?); ";
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, f.getCnpj());
            stmt.setString(2, f.getNome());
            stmt.setString(3, f.getEndereco());
            stmt.setString(4, f.getNumero());
            stmt.setString(5, f.getComplemento());
            stmt.setString(6, f.getBairro());
            stmt.setString(7, f.getCep());
            stmt.setString(8, f.getFone());
            
            stmt.execute();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    // metodo selecionar
    public List<Fornecedor> selecionarTodos(){
        Connection con = new Conexao().getConnection();
        List<Fornecedor> lista = new ArrayList<Fornecedor>();
        
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM fornecedor" );
            while ( rs.next() ) {
                Fornecedor fo = new Fornecedor();
                
               fo.setCod( rs.getInt("cod_fornecedor") );
               fo.setCnpj( rs.getString("cnpj_fornecedor") );
               fo.setNome( rs.getString("nome_fornecedor") );
               fo.setEndereco( rs.getString("end_fornecedor") );
               fo.setNumero( rs.getString("num_fornecedor") );
               fo.setComplemento( rs.getString("compl_fornecedor") );
               fo.setBairro( rs.getString("bairro_fornecedor") );
               fo.setCep( rs.getString("cep_fornecedor") );
               fo.setFone( rs.getString("fone_fornecedor") );

               lista.add(fo);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }
    
    
}