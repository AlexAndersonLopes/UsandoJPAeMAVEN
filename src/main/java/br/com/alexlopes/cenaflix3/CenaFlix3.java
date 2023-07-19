package br.com.alexlopes.cenaflix3;

import br.com.alexlopes.cenaflix3.gui.login.Entrar;

public class CenaFlix3 {

    public static void main(String[] args) {

        Entrar a = new Entrar();
        a.setTitle("Recuperar Senha");
        a.setLocationRelativeTo(null);
        a.pack();
        a.setVisible(true);

    }
}
