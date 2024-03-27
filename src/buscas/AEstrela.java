package buscas;

import estruturas.VetorOrdenadoAdjacente;
import grafocidades.Adjacente;
import grafocidades.Cidade;
import grafocidades.Mapa;

public class AEstrela {
    private VetorOrdenadoAdjacente fronteira;
    private Cidade objetivo;
    private boolean achou;

    public AEstrela(Cidade objetivo){
        this.objetivo = objetivo;
        achou = false;
    }
    public void buscar(Cidade atual) {
        System.out.println("\n * Atual: " + atual.getNome());
        atual.setVisitado(true);

        if (atual == objetivo) {
            achou = true;
        }
        else {
            fronteira = new VetorOrdenadoAdjacente(atual.getAdjacentes().size());
            for (Adjacente a: atual.getAdjacentes()) {
                if(!a.getCidade().isVisitado()){
                    a.getCidade().setVisitado(true);
                    fronteira.inserir(a); // pararemtro é o adjacente
                }
            }

            fronteira.mostrar();
            if(fronteira.getPrimeiro() != null){
                buscar(fronteira.getPrimeiro());
            }

        }
    }

    // teste metodo main

    public static void main(String args[]){
        Mapa mapa = new Mapa();
        AEstrela a = new AEstrela(mapa.getCuritiba()); // estado objetivo
        a.buscar(mapa.getPortoUniao()); // estado inicial
    }

}
