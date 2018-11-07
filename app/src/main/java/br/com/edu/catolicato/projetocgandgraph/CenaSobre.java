package br.com.edu.catolicato.projetocgandgraph;

import br.com.edu.catolicato.projetocgandgraph.AndGraph.AGGameManager;
import br.com.edu.catolicato.projetocgandgraph.AndGraph.AGInputManager;
import br.com.edu.catolicato.projetocgandgraph.AndGraph.AGScene;

//UMA CENA DA APLICACAO
public class CenaSobre extends AGScene {



    public CenaSobre(AGGameManager pManager) {
        super(pManager);
    }

    //CHAMADO TODA VEZ QUE A CENA FOR ATIVADA
    //SEMPRE QUE A CENA FOR EXIBIDA
    @Override
    public void init() {
        setSceneBackgroundColor(255f,0,255f);
    }

    //APOS O RETORNO DE UMA INTERRUPCAO
    @Override
    public void restart() {
    }

    //QUANDO UM INTERRUPCAO OCERRER
    @Override
    public void stop() {
    }

    //CHAMADO N VEZES POR SEGUNDO
    @Override
    public void loop() {
        if (AGInputManager.vrTouchEvents.screenClicked()){
            vrGameManager.setCurrentScene(1);
            return;
        }
    }
}
