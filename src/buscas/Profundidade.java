package buscas;

import estruturas.Pilha;
import grafocidades.Adjacente;
import grafocidades.Cidade;
import grafocidades.Mapa;

public class Profundidade {
    private Pilha fronteira;
    private Cidade inicio;
    private Cidade objetivo;

    public Profundidade (Cidade inicio, Cidade objetivo) {
        this.inicio = inicio;
        this.inicio.setVisitado(true); // setar propriedade VISITADO como verdadeiro para ja indicar que a cidade de origem foi visitada
        this.objetivo =objetivo;

        fronteira = new Pilha(20); // 20 total da pilha, pois no estudo de caso que estou fazendo são um total de 20 cidades
        fronteira.empilhar(inicio); // cidade inicial é passada para o topo da pilha
    }

    // Função para fazer a busca no grafo
    public void buscar(){
        Cidade topo = fronteira.getTopo();
        System.out.println("Topo: " + topo.getNome());

        // percorrer adjacentes não visitados do topo da pilha
        for(Adjacente a: topo.getAdjacentes()) {
            System.out.println("Verificando se já foi visitado " + a.getCidade().getNome());
            if (!a.getCidade() .isVisitado()) {
                a.getCidade() .setVisitado(true);
                fronteira.empilhar(a.getCidade()); // se a cidade nao foi visitada, ele empilha as cidades adjacentes
                buscar(); // recusivo, chamar novamente a função para chamar o novo topo da pilha
            }
        }
        // fronteira.desempilhar(); // quando não existe mais cidades adjacentes, ele retira da pilha
        System.out.println("Cidade que Desempilhou: " + fronteira.desempilhar() .getNome());


    }

    // Método main para realizar os testes da busca em profundidade
    public static void main(String args[]) {
        Mapa mapa = new Mapa(); // Instancia um objeto da classe Mapa para acessar as cidades
        Profundidade p = new Profundidade(mapa.getPortoUniao(), mapa.getCuritiba()); // Cria um objeto da classe Profundidade com as cidades de Porto União e Curitiba
        p.buscar(); // Chama o método buscar para realizar a busca em profundidade
    }


}

/*
É pra retornar:

Topo: Porto União
Verificando se já foi visitado Paulo Frontin
Topo: Paulo Frontin
Verificando se já foi visitado Porto União
Verificando se já foi visitado Irati
Topo: Irati
Verificando se já foi visitado Paulo Frontin
Verificando se já foi visitado Palmeira
Topo: Palmeira
Verificando se já foi visitado Irati
Verificando se já foi visitado São Mateus do Sul
Topo: São Mateus do Sul
Verificando se já foi visitado Palmeira
Verificando se já foi visitado Irati
Verificando se já foi visitado Lapa
Topo: Lapa
Verificando se já foi visitado Contenda
Topo: Contenda
Verificando se já foi visitado Balsa Nova
Topo: Balsa Nova
Verificando se já foi visitado Curitiba
Topo: Curitiba
Verificando se já foi visitado Campo Largo
Topo: Campo Largo
Verificando se já foi visitado Palmeira
Verificando se já foi visitado Balsa Nova
Verificando se já foi visitado Curitiba
Cidade que Desempilhou: Campo Largo
Verificando se já foi visitado Balsa Nova
Verificando se já foi visitado Araucária
Topo: Araucária
Verificando se já foi visitado Curitiba
Verificando se já foi visitado Contenda
Cidade que Desempilhou: Araucária
Verificando se já foi visitado São José dos Pinhais
Topo: São José dos Pinhais
Verificando se já foi visitado Curitiba
Verificando se já foi visitado Tijucas do Sul
Topo: Tijucas do Sul
Verificando se já foi visitado Mafra
Topo: Mafra
Verificando se já foi visitado Tijucas do Sul
Verificando se já foi visitado Lapa
Verificando se já foi visitado Canoinhas
Topo: Canoinhas
Verificando se já foi visitado Porto União
Verificando se já foi visitado Três Barras
Topo: Três Barras
Verificando se já foi visitado São Mateus do Sul
Verificando se já foi visitado Canoinhas
Cidade que Desempilhou: Três Barras
Verificando se já foi visitado Mafra
Cidade que Desempilhou: Canoinhas
Cidade que Desempilhou: Mafra
Verificando se já foi visitado São José dos Pinhais
Cidade que Desempilhou: Tijucas do Sul
Cidade que Desempilhou: São José dos Pinhais
Cidade que Desempilhou: Curitiba
Verificando se já foi visitado Campo Largo
Verificando se já foi visitado Contenda
Cidade que Desempilhou: Balsa Nova
Verificando se já foi visitado Araucária
Verificando se já foi visitado Lapa
Cidade que Desempilhou: Contenda
Verificando se já foi visitado São Mateus do Sul
Verificando se já foi visitado Mafra
Cidade que Desempilhou: Lapa
Verificando se já foi visitado Três Barras
Verificando se já foi visitado Porto União
Cidade que Desempilhou: São Mateus do Sul
Verificando se já foi visitado Campo Largo
Cidade que Desempilhou: Palmeira
Verificando se já foi visitado São Mateus do Sul
Cidade que Desempilhou: Irati
Cidade que Desempilhou: Paulo Frontin
Verificando se já foi visitado Canoinhas
Verificando se já foi visitado São Mateus do Sul
Cidade que Desempilhou: Porto União
Disconnected from the target VM, address: '127.0.0.1:58619', transport: 'socket'

Process finished with exit code 0

 */


