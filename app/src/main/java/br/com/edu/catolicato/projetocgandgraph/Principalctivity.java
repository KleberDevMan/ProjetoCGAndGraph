package br.com.edu.catolicato.projetocgandgraph;

import android.os.Bundle;

import br.com.edu.catolicato.projetocgandgraph.AndGraph.AGActivityGame;

public class Principalctivity extends AGActivityGame {

    private CenaAbertura abertura;
    private CenaMenu menu;
    private CenaCreditos creditos;
    private CenaSobre sobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //INICIALIZA O MOTOR GRAFICO
        init(this, false);

        //INSTANCIA CENA
        abertura = new CenaAbertura(getGameManager());
        menu = new CenaMenu(getGameManager());
        creditos = new CenaCreditos(getGameManager());
        sobre = new CenaSobre(getGameManager());

        //REGISTRA CENAS
        getGameManager().addScene(abertura);
        getGameManager().addScene(menu);
        getGameManager().addScene(creditos);
        getGameManager().addScene(sobre);
    }
}
