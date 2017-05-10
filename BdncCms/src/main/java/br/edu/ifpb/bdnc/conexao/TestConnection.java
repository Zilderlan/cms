/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.conexao;

import br.edu.ifpb.bdnc.manager.PesquisaManager;
import br.edu.ifpb.bdnc.valueobjects.Pesquisa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC-CASA
 */
public class TestConnection {

    public static void main(String[] args) {
        List<String> list3 = new ArrayList();
        PesquisaManager pm = new PesquisaManager();
        Pesquisa p = new Pesquisa();
        Pesquisa p1 = new Pesquisa();
        p.setPesquisa("pesquisa");
        p1.setPesquisa("Educacao");
        pm.add(p1);
        String o  = pm.add(p);
       list3.add(o);
        System.out.println("Chaves: "+list3);
        
//        List<Pesquisa> list2 = pm.retornar(list);
        
//        System.out.println("Valores: "+ list2);
        
        
        
//        TemaManager tm =  new TemaManager();
//        Tema t = new Tema();
//        List<Tema> l = tm.buscarTodos();
//        for (Tema tem : l){
//            System.out.println(tem.getDescricao());
//        }
//        
//        BlogManager bm = new BlogManager();
////        bm.criaBlog("xxxxx", "hh");
//        
//        Instant agora = Instant.now();
//        System.out.println(agora.toEpochMilli());
////        System.out.println("Agor: "+agora.toEpochMilli());
//        MongoCollection collection = ConectionMongoDb.openConnection();
//        Pagina p = new Pagina();
//        p.setId(agora.toEpochMilli());
//        p.setTitulo("titulo");
//        p.setDescricao("descricao");
//        p.setConteudo("conteudo");
//        p.setFoto("foto");
////        collection.insertOne(p.toDocument());
//
//        Pagina pa = new Pagina(agora.toEpochMilli(), 0, "Turismo paraibano", "o turismo paraibano ...", "O vídeo "
//                + "fornece uma maneira poderosa de ajudá-lo a provar seu argumento. Ao clicar em Vídeo Online, "
//                + "você pode colar o código de inserção do vídeo que deseja adicionar. Você também pode digitar "
//                + "uma palavra-chave para pesquisar online o vídeo mais adequado ao seu documento. Para dar ao "
//                + "documento uma aparência profissional, o Word fornece designs de cabeçalho, rodapé, folha de "
//                + "rosto e caixa de texto que se complementam entre si. Por exemplo, você pode adicionar uma folha "
//                + "de rosto, um cabeçalho e uma barra lateral correspondentes.\n"
//                + "Clique em Inserir e escolha os elementos desejados nas diferentes galerias. Temas e estilos "
//                + "também ajudam a manter seu documento coordenado. Quando você clica em Design e escolhe um novo "
//                + "tema, as imagens, gráficos e elementos gráficos SmartArt são alterados para corresponder ao novo "
//                + "tema. Quando você aplica estilos, os títulos são alterados para coincidir com o novo tema. Economize "
//                + "tempo no Word com novos botões que são mostrados no local em que você precisa deles.\n"
//                + "Para alterar a maneira como uma imagem se ajusta ao seu documento, clique nela e um botão de "
//                + "opções de layout será exibido ao lado. Ao trabalhar em uma tabela, clique no local onde deseja "
//                + "adicionar uma linha ou uma coluna e clique no sinal de adição. A leitura também é mais fácil no "
//                + "novo modo de exibição de Leitura. Você pode recolher partes do documento e colocar o foco no texto "
//                + "desejado. Se for preciso interromper a leitura antes de chegar ao fim dela, o Word lembrará em que "
//                + "ponto você parou - até mesmo em outro dispositivo.");
//        pa.addCategoria(new Categoria(1, "Viagem"));
//        pa.addCategoria(new Categoria(2, "Politica"));
//        pa.addCategoria(new Categoria(3, "Educação"));
//        pa.addCategoria(new Categoria(4, "Culinária"));
//        pa.addPalavraChave(new PalavraChave(1, "Cajazeiras"));
//        pa.addPalavraChave(new PalavraChave(2, "Turismo"));
//        pa.addPalavraChave(new PalavraChave(3, "Nordeste"));
//        pa.addPalavraChave(new PalavraChave(4, "Interior"));
////        collection.insertOne(pa.toDocument());
//        PaginaManager man = new PaginaManager();
//        
////        TemaManager tm =  new TemaManager();
////        Blog t = new Blog();
////        t.setIdUser("zilderlan.leite@gmail.com");
////        t.setId("temas/metal/setting.jsp");
////        System.out.println(tm.addTema(t));
//        
////        man.addPag(pa);
//
//        System.out.println("Listando: ");
//        System.out.println("Pagina pesquisada: " + man.searchOne(1494320723784l));
//   
//        List<Pagina> pag = man.listar(3);
//        for (Pagina pag1 : pag) {
//            System.out.println("Pagina retornada pelo manager por id: " + pag + "\n");
//        }
//        System.out.println("Listando por titulo: ");
//        List<Pagina> l1 = man.listarPorNome("Educacao");
//        for (Pagina pag2 : l1) {
//            System.out.println("Pagina retornada por nome pelo manager: " + pag2 + "\n");
//        }
////        MongoCursor<Document> cursor = collection.find().iterator();
////        while (cursor.hasNext()) {
////            Pagina p2 = new Pagina().fromDocument(cursor.next());
////            System.out.println(p2 + "\n");
////        }
////        add();
//        User u = new User();
//        u.setEmail("zilderlan.leite@gmail.com");
//        u.setPassword("123456");
//        System.out.println("Test Login " + login(u));
////
////        System.out.println("Operações de Página");
////        
////        PaginaManager pm = new PaginaManager();
////        System.out.println("Listar Todas:\n"+pm.listar());
////        System.out.println("\nListar Por Nopme:\n"+pm.listarPorNome(""));
//    }
//
//    private static boolean add() {
//        User u = new User("zilderlan", "zilderlan.leite@gmail.com", "123456");
//        UserManager um = new UserManager();
//        um.addUser(u);
//        return true;
//    }
//
//    private static User login(User u) {
//        UserManager um = new UserManager();
//        return um.userLogin(u);
    }

  

}
