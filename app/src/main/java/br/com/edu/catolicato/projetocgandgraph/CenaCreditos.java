package br.com.edu.catolicato.projetocgandgraph;

import br.com.edu.catolicato.projetocgandgraph.AndGraph.AGGameManager;
import br.com.edu.catolicato.projetocgandgraph.AndGraph.AGInputManager;
import br.com.edu.catolicato.projetocgandgraph.AndGraph.AGScene;
import br.com.edu.catolicato.projetocgandgraph.AndGraph.AGScreenManager;
import br.com.edu.catolicato.projetocgandgraph.AndGraph.AGSoundManager;
import br.com.edu.catolicato.projetocgandgraph.AndGraph.AGSprite;

//UMA CENA DA APLICACAO
public class CenaCreditos extends AGScene {

    AGSprite gatinhaBranco = null;
    int animacao = 0;

    int codigoDoSom = 0;

    public CenaCreditos(AGGameManager pManager) {
        super(pManager);
    }

    //CHAMADO TODA VEZ QUE A CENA FOR ATIVADA
    //SEMPRE QUE A CENA FOR EXIBIDA
    @Override
    public void init() {
        setSceneBackgroundColor(0, 0, 1);


        codigoDoSom = AGSoundManager.vrSoundEffects.loadSoundEffect("toc.wav");

        gatinhaBranco = createSprite(R.mipmap.gatinho, 8, 8);
        gatinhaBranco .setScreenPercent(35, 50);

        gatinhaBranco.vrPosition.setX(AGScreenManager.iScreenWidth / 2);
        gatinhaBranco.vrPosition.setY(AGScreenManager.iScreenHeight /2);

        gatinhaBranco.addAnimation(15, true, 0, 15);
        gatinhaBranco.addAnimation(10, true, 16, 28);
        gatinhaBranco.addAnimation(15, true, 29, 40);

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
            animacao++;

            AGSoundManager.vrSoundEffects.play(codigoDoSom);

            if (animacao > 2)
                animacao = 0;

            gatinhaBranco.setCurrentAnimation(animacao);

            return;
        }
    }
}
