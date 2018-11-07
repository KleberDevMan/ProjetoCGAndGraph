package br.com.edu.catolicato.projetocgandgraph;

import br.com.edu.catolicato.projetocgandgraph.AndGraph.AGGameManager;
import br.com.edu.catolicato.projetocgandgraph.AndGraph.AGScene;
import br.com.edu.catolicato.projetocgandgraph.AndGraph.AGScreenManager;
import br.com.edu.catolicato.projetocgandgraph.AndGraph.AGSoundManager;
import br.com.edu.catolicato.projetocgandgraph.AndGraph.AGSprite;
import br.com.edu.catolicato.projetocgandgraph.AndGraph.AGTimer;

//UMA CENA DA APLICACAO
public class CenaAbertura extends AGScene {

    AGTimer tempo = null;
    AGSprite pantera = null;
    AGSprite gatinhaBranco = null;



    public CenaAbertura(AGGameManager pManager) {
        super(pManager);
    }

    //CHAMADO TODA VEZ QUE A CENA FOR ATIVADA
    //SEMPRE QUE A CENA FOR EXIBIDA
    @Override
    public void init() {

        tempo = new AGTimer(3000);

        //Musica longa
        AGSoundManager.vrMusic.loadMusic("oest.mp3", true);
        AGSoundManager.vrMusic.play();

        setSceneBackgroundColor(0.218f,0.165f,0.32f);

        pantera = createSprite(R.mipmap.pantera, 2, 4);
        pantera.setScreenPercent(40, 15);

        //CONFIGURA O CENTRO DO OBJETO
        pantera.vrPosition.setX(AGScreenManager.iScreenWidth / 2);
        pantera.vrPosition.setY(AGScreenManager.iScreenHeight /2);

        //quantidade de quadros trocados por segundo
        //voltar para o primeiro?
        //frame inicial
        //frame final
        pantera.addAnimation(20, true, 0, 7);

        //espelhamento
        //pantera.iMirror = AGSprite.HORIZONTAL;//espelhamento horizontal
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

        tempo.update();

        if (tempo.isTimeEnded()) {
            //TROCA A CENA
            vrGameManager.setCurrentScene(1);
        }

        //Faz a pantera girar
        //pantera.fAngle += 5f;
    }
}
