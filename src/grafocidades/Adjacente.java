package grafocidades;

// Classe que representa uma cidade adjacente em um grafo
public class Adjacente {
    private Cidade cidade; // Representa a cidade adjacente
    private int distancia;

    // Construtor da classe Adjacente
    public Adjacente(Cidade cidade, int distancia) {
        this.cidade = cidade; // Inicializa a cidade adjacente com a cidade fornecida como parâmetro
        this.distancia = distancia;
    }

    // Método getter para obter a cidade adjacente
    public Cidade getCidade() {
        return cidade; // Retorna a cidade adjacente associada a este objeto Adjacente
    }

    // Método setter para definir a cidade adjacente
    public void setCidade(Cidade cidade) {
        this.cidade = cidade; // Define a cidade adjacente associada a este objeto Adjacente com a cidade fornecida como parâmetro
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}

