package grafocidades;


import java.util.ArrayList;
import java.util.List; // Importa a classe List do pacote java.util

public class Cidade {
    private String nome; // Nome da cidade
    private Boolean visitado; // Indica se a cidade foi visitada durante uma busca
    private List<Adjacente> adjacentes; // Lista de cidades adjacentes e seus pesos (distâncias)


    // Constructor da classe Cidade
    public Cidade(String nome){
        this.nome = nome;
        visitado = false; // Inicialmente, a cidade não foi visitada
        adjacentes = new ArrayList<Adjacente>(); // Inicializa a lista de cidades adjacentes
    }

    public void addCidadeAdjacente(Adjacente cidade) {
        adjacentes.add(cidade);
    }


    // Métodos getters e setters para os atributos privados


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getVisitado() {
        return visitado;
    }

    public void setVisitado(Boolean visitado) {
        this.visitado = visitado;
    }

    // Metodo getter para buscar o valor dos adjacentes

    public List<Adjacente> getAdjacentes() {
        return adjacentes;
    }
}

