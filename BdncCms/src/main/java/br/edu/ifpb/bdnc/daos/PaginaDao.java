/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.daos;

import br.edu.ifpb.bdnc.conexao.ConectionMongoDb;
import br.edu.ifpb.bdnc.interfaces.PaginaDaoIf;
import br.edu.ifpb.bdnc.valueobjects.Pagina;
import br.edu.ifpb.bdnc.valueobjects.PalavraChave;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author PC-CASA
 */
public class PaginaDao implements PaginaDaoIf {

    private Pagina pagina;
    private List<Pagina> list;
    private ConectionMongoDb conn;
    MongoCollection<Document> col;
    MongoCursor<Document> cursor;

    @Override
    public boolean salvar(Pagina p) {
        col = conn.openConnection();
        col.insertOne(p.toDocument());
        conn.close();
        return true;
    }

    @Override
    public boolean remover(long id) {
        return false;
    }

    @Override
    public List<Pagina> searchAll(int id) {
        list = new ArrayList<>();
        col = conn.openConnection();
        cursor = col.find(eq("idBlog", id)).iterator();
        while (cursor.hasNext()) {
            pagina = new Pagina().fromDocument(cursor.next());
            list.add(pagina);
        }
        return list;
    }
    @Override
    public Pagina searchOne(long id) {
        col = conn.openConnection();
        cursor = col.find(eq("_id", id)).iterator();
        if (cursor.hasNext()) {
            pagina = new Pagina().fromDocument(cursor.next());
            return pagina;
        }
        return pagina;
    }

    @Override
    public List<Pagina> search(String titulo) {
        Bson filter = Filters.or(
                Filters.eq("titulo", titulo),
                Filters.eq("listPalavras.palavraChave", titulo),
                Filters.eq("listCateg.categoria", titulo)
        );
        list = new ArrayList<>();
        col = conn.openConnection();
        cursor = col.find(filter).iterator();
        System.out.println("antes do while");
        while (cursor.hasNext()) {
            System.out.println("depois do while");
            pagina = new Pagina().fromDocument(cursor.next());
            list.add(pagina);
            conn.close();
        }
        return list;
    }

    @Override
    public List<Pagina> searchId(int id) {
//        Bson filter = Filters.or(
//                Filters.eq("titulo", titulo),
//                Filters.eq("listPalavras.palavraChave", titulo),
//                Filters.eq("listCateg.categoria", titulo)
//        );
//        list = new ArrayList<>();
//        col = conn.openConnection();
//        cursor = col.find(filter).iterator();
//        System.out.println("antes do while");
        while (cursor.hasNext()) {
            System.out.println("depois do while");
            pagina = new Pagina().fromDocument(cursor.next());
            list.add(pagina);
            conn.close();
        }
        return list;
    }

    @Override
    public boolean edit(long id) {
        return false;
    }

//    @Override
    //    public boolean salvar(Pagina pag) {
    //        Instant agora = Instant.now();
    //        System.out.println();
    //        String sql = "INSERT INTO PAGINA(titulo ,descricao, conteudo, foto, id)"
    //                + " VALUES (?, ?, ?, ?, ?)";
    //        System.out.println();
    //        try {
    //            conn = ConectionPostgre.conexao();
    //            stm = ConectionPostgre.openStatement(sql);
    //            stm.setString(1, pag.getTitulo());
    //            stm.setString(2, pag.getDescricao());
    //            stm.setString(3, pag.getConteudo());
    //            stm.setString(4, pag.getFoto());
    //            stm.setLong(5, pag.getId());
    //            System.out.println("Funciona");
    //            stm.executeUpdate();
    //            return true;
    //        } catch (ClassNotFoundException | SQLException e) {
    //            System.err.println(e.getMessage());
    //            e.printStackTrace();
    //        } finally {
    //            ConectionPostgre.closeStatement(stm);
    //            ConectionPostgre.closeConnection(conn);
    //        }
    //        return false;
    //    }
    //
    //    @Override
    //    public boolean remover(long id) {
    //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //    }
    //
    //    @Override
    //    public List searchAll() {
    //        list = new ArrayList();
    //        String sql = "Select * from PAGINA ";
    //
    //        try {
    //            conn = ConectionPostgre.conexao();
    //            stm = conn.prepareStatement(sql);
    //            ResultSet result = stm.executeQuery();
    //            while (result.next()) {
    //                pagina = new Pagina();
    //                pagina.setTitulo(result.getString("titulo"));
    //                pagina.setDescricao(result.getString("descricao"));
    //                pagina.setConteudo(result.getString("conteudo"));
    //                pagina.setFoto(result.getString("foto"));
    //                pagina.setId(result.getLong("id"));
    //                list.add(pagina);
    //
    //            }
    //
    //        } catch (ClassNotFoundException | SQLException ex) {
    //            Logger.getLogger(PaginaDao.class.getName()).log(Level.SEVERE, null, ex);
    //        }
    //
    //        return list;
    //    }
    //
    //    @Override
    //    public List<Pagina> search(String titulo) {
    //        if (titulo.trim() == "") return null;
    //        list = new ArrayList<>();
    //        String sql = "SELECT * FROM PAGINA WHERE titulo ilike ?";
    //        try {
    //            conn = ConectionPostgre.conexao();
    //            stm = ConectionPostgre.openStatement(sql);
    //            stm.setString(1, "%" + titulo + "%");
    //            System.out.println();
    //            ResultSet result = stm.executeQuery();
    //            while (result.next()) {
    //                pagina = new Pagina();
    //
    //                pagina.setTitulo(result.getString("titulo"));
    //                pagina.setDescricao(result.getString("descricao"));
    //                pagina.setConteudo(result.getString("conteudo"));
    //                pagina.setFoto(result.getString("foto"));
    //                pagina.setId(result.getLong("id"));
    //                list.add(pagina);
    //            }
    //        } catch (ClassNotFoundException | SQLException ex) {
    //        } finally {
    //            ConectionPostgre.closeStatement(stm);
    //            ConectionPostgre.closeConnection(conn);
    //        }
    //        return list;
    //    }
    //
    //    @Override
    //    public boolean edit(long id) {
    //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //    }
}
