package br.com.alexlopes.cenaflix3.util;

import br.com.alexlopes.cenaflix3.gui.login.Cadastrar;
import br.com.alexlopes.cenaflix3.gui.login.Entrar;
import br.com.alexlopes.cenaflix3.gui.podcast.CadastrarPodcast;
import br.com.alexlopes.cenaflix3.gui.podcast.DefinirPermissao;
import br.com.alexlopes.cenaflix3.gui.podcast.Listagem;
import br.com.alexlopes.cenaflix3.model.Usuario;

public class Janelas {

    private static Listagem listagem;
    private static Usuario a;
    private static CadastrarPodcast pod;

    /**
     * Ir para a tela CadastrarLogin
     */
    public static void irCadastrarLogin() {
        Cadastrar cadastrar = new Cadastrar();
        cadastrar.setTitle("Tela de Cadastro");
        cadastrar.setLocationRelativeTo(null);
        cadastrar.pack();
        cadastrar.setVisible(true);
    }

    /**
     * Ir para a tela Entrar
     */
    public static void irEntrar() {
        Entrar entrar = new Entrar();
        entrar.setTitle("LOGIN");
        entrar.setLocationRelativeTo(null);
        entrar.pack();
        entrar.setVisible(true);
    }

    /**
     * Ir para a tela istagem
     * @param usuario 
     */
    public static void irListagem2(Usuario usuario) {
        a = usuario;
        if (listagem != null) {
            pod.dispose();
            listagem.atualizarTabela();
        } else {
            listagem = new Listagem(usuario);
            listagem.setTitle("Programa Principal");
            listagem.setLocationRelativeTo(null);
            listagem.pack();
            listagem.setVisible(true);
            Mensagem.mensagemExito("Olá " + usuario.getNome() + ", sua permissão\né de " + usuario.getPermissao());
        }
    }

    /**
     * Ir para a tela CadastrarPodcast
     */
    public static void irCadastrarPodcast() {
        pod = new CadastrarPodcast(a);
        pod.setTitle("Cadastrar Podcast");
        pod.setLocationRelativeTo(null);
        pod.pack();
        pod.setVisible(true);
    }

    /**
     * Ir para a tela DefinirPermissao
     */
    public static void irDefinirPermissao(){
        DefinirPermissao perm = new DefinirPermissao();
        perm.setTitle("Alterar Permissão do Usuário");
        perm.setLocationRelativeTo(null);
        perm.pack();
        perm.setVisible(true);
    }
}
