package grafocidades;

public class Mapa {
    private Cidade portoUniao;
    private Cidade pauloFrontin;
    private Cidade canoinhas;
    private Cidade irati;
    private Cidade palmeira;
    private Cidade campoLargo;
    private Cidade curitiba;
    private Cidade balsaNova;
    private Cidade araucaria;
    private Cidade saoJose;
    private Cidade contenda;
    private Cidade mafra;
    private Cidade tijucas;
    private Cidade lapa;
    private Cidade saoMateus;
    private Cidade tresBarras;

    // Criar instâncias de todas as cidades
    public Mapa() {
        portoUniao = new Cidade("Porto União");
        pauloFrontin = new Cidade("Paulo Frontin");
        canoinhas = new Cidade("Canoinhas");
        irati = new Cidade("Irati");
        palmeira = new Cidade("Palmeira");
        campoLargo = new Cidade("Campo Largo");
        curitiba = new Cidade("Curitiba");
        balsaNova = new Cidade("Balsa Nova");
        araucaria = new Cidade("Araucária");
        saoJose = new Cidade("São José dos Pinhais");
        contenda = new Cidade("Contenda");
        mafra = new Cidade("Mafra");
        tijucas = new Cidade("Tijucas do Sul");
        lapa = new Cidade("Lapa");
        saoMateus = new Cidade("São Mateus do Sul");
        tresBarras = new Cidade("Três Barras");

        // Definir as arestas de cidades adjacentes de porto uniao
        portoUniao.addCidadeAdjacente(new Adjacente(pauloFrontin));
        portoUniao.addCidadeAdjacente(new Adjacente(canoinhas));
        portoUniao.addCidadeAdjacente(new Adjacente(saoMateus));

        // Definir as arestas de cidades adjacentes de paulo frontin
        pauloFrontin.addCidadeAdjacente(new Adjacente(portoUniao));
        pauloFrontin.addCidadeAdjacente(new Adjacente(irati));

        // Definir as arestas de cidades adjacentes de canoinhas
        canoinhas.addCidadeAdjacente(new Adjacente(portoUniao));
        canoinhas.addCidadeAdjacente(new Adjacente(tresBarras));
        canoinhas.addCidadeAdjacente(new Adjacente(mafra));

        // Adiciona cidade adjacente Paulo Frontin a Irati
        irati.addCidadeAdjacente(new Adjacente(pauloFrontin));
        irati.addCidadeAdjacente(new Adjacente(palmeira));
        irati.addCidadeAdjacente(new Adjacente(saoMateus));

        // Adiciona cidade adjacente Irati a Palmeira
        palmeira.addCidadeAdjacente(new Adjacente(irati));
        palmeira.addCidadeAdjacente(new Adjacente(saoMateus));
        palmeira.addCidadeAdjacente(new Adjacente(campoLargo));

        // Adiciona cidade adjacente Palmeira a Campo Largo
        campoLargo.addCidadeAdjacente(new Adjacente(palmeira));
        campoLargo.addCidadeAdjacente(new Adjacente(balsaNova));
        campoLargo.addCidadeAdjacente(new Adjacente(curitiba));

        // Adiciona cidades adjacentes a Curitiba
        curitiba.addCidadeAdjacente(new Adjacente(campoLargo));
        curitiba.addCidadeAdjacente(new Adjacente(balsaNova));
        curitiba.addCidadeAdjacente(new Adjacente(araucaria));
        curitiba.addCidadeAdjacente(new Adjacente(saoJose));

        // Adiciona cidades adjacentes a Balsa Nova
        balsaNova.addCidadeAdjacente(new Adjacente(curitiba));
        balsaNova.addCidadeAdjacente(new Adjacente(campoLargo));
        balsaNova.addCidadeAdjacente(new Adjacente(contenda));

        // Adiciona cidades adjacentes a Araucária
        araucaria.addCidadeAdjacente(new Adjacente(curitiba));
        araucaria.addCidadeAdjacente(new Adjacente(contenda));

        // Adiciona cidades adjacentes a São Jose
        saoJose.addCidadeAdjacente(new Adjacente(curitiba));
        saoJose.addCidadeAdjacente(new Adjacente(tijucas));

        // Adiciona cidades adjacentes a Contenda
        contenda.addCidadeAdjacente(new Adjacente(balsaNova));
        contenda.addCidadeAdjacente(new Adjacente(araucaria));
        contenda.addCidadeAdjacente(new Adjacente(lapa));

        // Adiciona cidades adjacentes a Mafra
        mafra.addCidadeAdjacente(new Adjacente(tijucas));
        mafra.addCidadeAdjacente(new Adjacente(lapa));
        mafra.addCidadeAdjacente(new Adjacente(canoinhas));

        // Adiciona cidades adjacentes a Tijucas
        tijucas.addCidadeAdjacente(new Adjacente(mafra));
        tijucas.addCidadeAdjacente(new Adjacente(saoJose));

        // Adiciona cidades adjacentes a Lapa
        lapa.addCidadeAdjacente(new Adjacente(contenda));
        lapa.addCidadeAdjacente(new Adjacente(saoMateus));
        lapa.addCidadeAdjacente(new Adjacente(mafra));

        // Adiciona cidades adjacentes a São Mateus
        saoMateus.addCidadeAdjacente(new Adjacente(palmeira));
        saoMateus.addCidadeAdjacente(new Adjacente(irati));
        saoMateus.addCidadeAdjacente(new Adjacente(lapa));
        saoMateus.addCidadeAdjacente(new Adjacente(tresBarras));
        saoMateus.addCidadeAdjacente(new Adjacente(portoUniao));

        // Adiciona cidades adjacentes a Tres Barras
        tresBarras.addCidadeAdjacente(new Adjacente(saoMateus));
        tresBarras.addCidadeAdjacente(new Adjacente(canoinhas));

    }

    public Cidade getPortoUniao() {
        return portoUniao;
    }

    public void setPortoUniao(Cidade portoUniao) {
        this.portoUniao = portoUniao;
    }

    public Cidade getPauloFrontin() {
        return pauloFrontin;
    }

    public void setPauloFrontin(Cidade pauloFrontin) {
        this.pauloFrontin = pauloFrontin;
    }

    public Cidade getCanoinhas() {
        return canoinhas;
    }

    public void setCanoinhas(Cidade canoinhas) {
        this.canoinhas = canoinhas;
    }

    public Cidade getIrati() {
        return irati;
    }

    public void setIrati(Cidade irati) {
        this.irati = irati;
    }

    public Cidade getPalmeira() {
        return palmeira;
    }

    public void setPalmeira(Cidade palmeira) {
        this.palmeira = palmeira;
    }

    public Cidade getCampoLargo() {
        return campoLargo;
    }

    public void setCampoLargo(Cidade campoLargo) {
        this.campoLargo = campoLargo;
    }

    public Cidade getCuritiba() {
        return curitiba;
    }

    public void setCuritiba(Cidade curitiba) {
        this.curitiba = curitiba;
    }

    public Cidade getBalsaNova() {
        return balsaNova;
    }

    public void setBalsaNova(Cidade balsaNova) {
        this.balsaNova = balsaNova;
    }

    public Cidade getAraucaria() {
        return araucaria;
    }

    public void setAraucaria(Cidade araucaria) {
        this.araucaria = araucaria;
    }

    public Cidade getSaoJose() {
        return saoJose;
    }

    public void setSaoJose(Cidade saoJose) {
        this.saoJose = saoJose;
    }

    public Cidade getContenda() {
        return contenda;
    }

    public void setContenda(Cidade contenda) {
        this.contenda = contenda;
    }

    public Cidade getMafra() {
        return mafra;
    }

    public void setMafra(Cidade mafra) {
        this.mafra = mafra;
    }

    public Cidade getTijucas() {
        return tijucas;
    }

    public void setTijucas(Cidade tijucas) {
        this.tijucas = tijucas;
    }

    public Cidade getLapa() {
        return lapa;
    }

    public void setLapa(Cidade lapa) {
        this.lapa = lapa;
    }

    public Cidade getSaoMateus() {
        return saoMateus;
    }

    public void setSaoMateus(Cidade saoMateus) {
        this.saoMateus = saoMateus;
    }

    public Cidade getTresBarras() {
        return tresBarras;
    }

    public void setTresBarras(Cidade tresBarras) {
        this.tresBarras = tresBarras;
    }
}
