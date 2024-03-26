package buscas;

import estruturas.VetorOrdenado;
import grafocidades.Adjacente;
import grafocidades.Cidade;
import grafocidades.Mapa;

public class Gulosa {
    private VetorOrdenado fronteira;
    private Cidade objetivo;
    private boolean achou;

    public Gulosa (Cidade objetivo) {
        this.objetivo = objetivo;
        achou = false;
    }

    public void buscar(Cidade atual) {
        System.out.println("\nAtual: " + atual.getNome());
        atual.setVisitado(true); // para não setar a cidade visitada

        if (atual == objetivo){
            achou = true;
        }
        else {
            // é o nó que vai mudar a cada iteração, pois a cada vez que chama a função buscar, ele atualiza para a cidade mais proxima
            fronteira = new VetorOrdenado(atual.getAdjacentes().size()); // método size() para obter o número de elementos na lista de adjacentes da cidade atual
            for(Adjacente a: atual.getAdjacentes()) {
                if (!a.getCidade().isVisitado()){
                    a.getCidade().setVisitado(true);
                    fronteira.inserir(a.getCidade()); // ordenar as fronteiras com do menor custo para o maior
                }
            }
        }
        fronteira.mostrar();
        if (fronteira.getPrimeiro() != null) {
            buscar(fronteira.getPrimeiro());
        }
    }

    public static void main (String args[]) {
        Mapa mapa = new Mapa();
        Gulosa g = new Gulosa(mapa.getCuritiba()); // (estado final) cidade objtivo
        g.buscar(mapa.getPortoUniao()); // (estado inicial) cidade inicial
    }


}
