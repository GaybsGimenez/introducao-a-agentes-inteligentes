package estruturas;

import grafocidades.Cidade;
import grafocidades.Mapa;

import javax.print.DocFlavor;

public class Pilha {
    private int tamanho;
    private Cidade[] cidades; // armazenar a pilha de cidades
    private int topo; // variável vai armazenzar o quem é o topo da pilha

    public Pilha(int tamanho){
        this.tamanho = tamanho;
        cidades = new Cidade[this.tamanho];
        topo = -1; // inicializa o topo com o valor -1, pois a pilha foi criada mas ainda não tem nenhum elemento adc nela
    }

    // Metodo Empilhar
    public void empilhar(Cidade cidade) {
        if (!pilhaCheia()){
            cidades[++topo] = cidade; // atribui a cidade atual ao topo da pilha e depois incrementa o topo
        }
        else {
            System.out.println("A pilha já está cheia");
        }
    }

    // Metodo Desempilhar - vai retornar qual cidade ele desempilhou
    public Cidade desempilhar(){
        if (!pilhaVazia()){
            return cidades[topo--]; // retorna o valor que está no topo da pilha e depois decrementa o topo
        }
        else{
            System.out.println("A pilha já está vazia");
            return null;
        }
    }

    // Metodo retorna o topo
    public Cidade getTopo(){
        if (!pilhaVazia()){
            return cidades[topo]; // retorna o valor que está no topo da pilha
        }
        else {
            System.out.println("A pilha está vazia");
            return null;
        }
    }

    // Verificar se a pilha está cheia - utilizado metodo "private" pois o usuário nao precisa saber esse retorno
    private boolean pilhaVazia(){
        return(topo == -1); // retorna TRUE se o topo for -1 (ou seja, não tiver nenhum item na pilha)
    }

    // verificar pilha está cheia - utilizado metodo "private" pois o usuário nao precisa saber esse retorno
    private boolean pilhaCheia(){
        return(topo == tamanho -1); // tamanho é a variável que vai indicar a capacidade maxima da pilha, -1 pois é iniciado em 0
    }

    // Criar um executável main
    public static void main(String args[]){
        Pilha pilha = new Pilha(5);
        Mapa mapa = new Mapa();

        pilha.empilhar(mapa.getPortoUniao());
        pilha.empilhar(mapa.getCampoLargo());
        pilha.empilhar(mapa.getCanoinhas());
        System.out.println(pilha.getTopo() .getNome());


        pilha.desempilhar();
        System.out.println(pilha.getTopo().getNome());
    }

}
