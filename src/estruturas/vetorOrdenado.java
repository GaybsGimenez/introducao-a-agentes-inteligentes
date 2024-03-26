package estruturas;

import grafocidades.Cidade;
import grafocidades.Mapa;

public class VetorOrdenado {
    private Cidade[] cidades;
    private int numeroElementos;

    public VetorOrdenado(int tamanho){
        cidades = new Cidade[tamanho];
        numeroElementos = 0;
    }

    public void inserir(Cidade cidade){
        int posicao;
        for (posicao = 0; posicao < numeroElementos; posicao++){
            if (cidades[posicao].getDistanciaObjetivo() > cidade.getDistanciaObjetivo()) {
                break;
            }
        }
        for (int k = numeroElementos; k > posicao; k--){
            cidades[k] = cidades[k-1];
        }

        cidades[posicao] = cidade;
        numeroElementos++;
    }

    public void mostrar(){
        for (int i = 0; i < numeroElementos; i++){
            System.out.println(cidades[i].getNome() + " - " + cidades[i].getDistanciaObjetivo());
        }
    }

    public static void main(String args[]) {
        Mapa mapa =  new Mapa();
        VetorOrdenado vetor = new VetorOrdenado(5);

        vetor.inserir(mapa.getPortoUniao()); // 203
        vetor.inserir(mapa.getPauloFrontin()); // 172
        vetor.inserir(mapa.getBalsaNova()); // 41
        vetor.inserir(mapa.getPalmeira()); // 59

        vetor.mostrar();

        /*
        É para retornar:
        Balsa Nova - 41
        Palmeira - 59
        Paulo Frontin - 172
        Porto União - 230
         */
    }

}
