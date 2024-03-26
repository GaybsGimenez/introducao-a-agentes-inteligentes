package grafocidades;

import java.util.ArrayList;
import java.util.List; // Importa a classe List do pacote java.util

public class Cidade {
    private String nome; // Nome da cidade
    private Boolean visitado; // Indica se a cidade foi visitada durante uma busca
    private int distanciaObjetivo;
    private List<Adjacente> adjacentes; // Lista de cidades adjacentes e seus pesos (distâncias)

    // Constructor da classe Cidade
    public Cidade(String nome, int distanciaObjetivo){
        this.nome = nome;
        visitado = false; // Inicialmente, a cidade não foi visitada
        this.distanciaObjetivo = distanciaObjetivo;
        adjacentes = new ArrayList<Adjacente>(); // Inicializa a lista de cidades adjacentes
    }

    // Método para adicionar uma cidade adjacente à lista de adjacentes
    public void addCidadeAdjacente(Adjacente cidade) {
        adjacentes.add(cidade);
    }

    // Métodos getters e setters para os atributos privados

    // Getter para o nome da cidade
    public String getNome() {
        return nome;
    }

    // Setter para o nome da cidade
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para verificar se a cidade foi visitada
    public Boolean getVisitado() {
        return visitado;
    }

    // Setter para marcar se a cidade foi visitada
    public void setVisitado(Boolean visitado) {
        this.visitado = visitado;
    }

    // Getter para obter a lista de cidades adjacentes
    public List<Adjacente> getAdjacentes() {
        return adjacentes;
    }

    // Método para verificar se a cidade foi visitada
    public boolean isVisitado() {
        return visitado;
    }

    // Getter para obter a distância até o objetivo
    public int getDistanciaObjetivo() {
        return distanciaObjetivo;
    }

    // Setter para definir a distância até o objetivo
    public void setDistanciaObjetivo(int distanciaObjetivo) {
        this.distanciaObjetivo = distanciaObjetivo;
    }
}
