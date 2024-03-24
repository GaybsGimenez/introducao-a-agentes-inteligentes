package estruturas;

public class Recursao {
    // indicar quando a recursão deve parar, senão ela entra em loop
    int i = 0;

    public void funcao(){
        System.out.println("Executando");
        if (i < 5){ // definiu o 5 como critério de parada
            i++;
            funcao(); // faz a chamada recursiva - se não tiver um idicativo de parada, como o if, por exemplo, a recursão entra em em loop infinito
        }

    }

    public static void main(String args[]){
        Recursao r = new Recursao();
        r.funcao();
    }
}

// pilha é pre requisito para a execusão de uma recursão