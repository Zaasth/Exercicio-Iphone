package com.iPhone.Aparelho;

import com.iPhone.AparelhoTelefonico.AparelhoTelefonico;
import com.iPhone.NavagadorInternet.NavegadorNaInternet;
import com.iPhone.ReprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {

    }

    @Override
    public void iniciarCorreioVoz() {

    }

    @Override
    public void exibirPagina(String url) {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica(String musica) {

    }
}
