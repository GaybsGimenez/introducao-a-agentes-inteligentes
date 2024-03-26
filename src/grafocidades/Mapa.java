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
        portoUniao = new Cidade("Porto União", 230);
        pauloFrontin = new Cidade("Paulo Frontin", 172);
        canoinhas = new Cidade("Canoinhas", 141);
        irati = new Cidade("Irati", 139);
        palmeira = new Cidade("Palmeira", 59);
        campoLargo = new Cidade("Campo Largo", 27);
        curitiba = new Cidade("Curitiba", 0);
        balsaNova = new Cidade("Balsa Nova", 41);
        araucaria = new Cidade("Araucária", 23);
        saoJose = new Cidade("São José dos Pinhais", 13 );
        contenda = new Cidade("Contenda", 39);
        mafra = new Cidade("Mafra", 94);
        tijucas = new Cidade("Tijucas do Sul", 56);
        lapa = new Cidade("Lapa", 74);
        saoMateus = new Cidade("São Mateus do Sul", 123);
        tresBarras = new Cidade("Três Barras", 131);

        // Definir as arestas de cidades adjacentes de porto uniao
        portoUniao.addCidadeAdjacente(new Adjacente(pauloFrontin, 46));
        portoUniao.addCidadeAdjacente(new Adjacente(canoinhas, 78));
        portoUniao.addCidadeAdjacente(new Adjacente(saoMateus, 87));

        // Definir as arestas de cidades adjacentes de paulo frontin
        pauloFrontin.addCidadeAdjacente(new Adjacente(portoUniao, 46));
        pauloFrontin.addCidadeAdjacente(new Adjacente(irati, 75));

        // Definir as arestas de cidades adjacentes de canoinhas
        canoinhas.addCidadeAdjacente(new Adjacente(portoUniao, 78));
        canoinhas.addCidadeAdjacente(new Adjacente(tresBarras, 12));
        canoinhas.addCidadeAdjacente(new Adjacente(mafra, 66));

        // Adiciona cidade adjacente Paulo Frontin a Irati
        irati.addCidadeAdjacente(new Adjacente(pauloFrontin, 75));
        irati.addCidadeAdjacente(new Adjacente(palmeira, 75));
        irati.addCidadeAdjacente(new Adjacente(saoMateus,57));

        // Adiciona cidade adjacente Irati a Palmeira
        palmeira.addCidadeAdjacente(new Adjacente(irati, 75));
        palmeira.addCidadeAdjacente(new Adjacente(saoMateus, 77));
        palmeira.addCidadeAdjacente(new Adjacente(campoLargo, 55));

        // Adiciona cidade adjacente Palmeira a Campo Largo
        campoLargo.addCidadeAdjacente(new Adjacente(palmeira, 55));
        campoLargo.addCidadeAdjacente(new Adjacente(balsaNova, 22));
        campoLargo.addCidadeAdjacente(new Adjacente(curitiba, 29));

        // Adiciona cidades adjacentes a Curitiba
        curitiba.addCidadeAdjacente(new Adjacente(campoLargo,29));
        curitiba.addCidadeAdjacente(new Adjacente(balsaNova,51));
        curitiba.addCidadeAdjacente(new Adjacente(araucaria,37));
        curitiba.addCidadeAdjacente(new Adjacente(saoJose,15));

        // Adiciona cidades adjacentes a Balsa Nova
        balsaNova.addCidadeAdjacente(new Adjacente(curitiba,51));
        balsaNova.addCidadeAdjacente(new Adjacente(campoLargo,22));
        balsaNova.addCidadeAdjacente(new Adjacente(contenda,19));

        // Adiciona cidades adjacentes a Araucária
        araucaria.addCidadeAdjacente(new Adjacente(curitiba,37));
        araucaria.addCidadeAdjacente(new Adjacente(contenda,18));

        // Adiciona cidades adjacentes a São Jose
        saoJose.addCidadeAdjacente(new Adjacente(curitiba,15));
        saoJose.addCidadeAdjacente(new Adjacente(tijucas,49));

        // Adiciona cidades adjacentes a Contenda
        contenda.addCidadeAdjacente(new Adjacente(balsaNova,19));
        contenda.addCidadeAdjacente(new Adjacente(araucaria,18));
        contenda.addCidadeAdjacente(new Adjacente(lapa,26));

        // Adiciona cidades adjacentes a Mafra
        mafra.addCidadeAdjacente(new Adjacente(tijucas,99));
        mafra.addCidadeAdjacente(new Adjacente(lapa,57));
        mafra.addCidadeAdjacente(new Adjacente(canoinhas,66));

        // Adiciona cidades adjacentes a Tijucas
        tijucas.addCidadeAdjacente(new Adjacente(mafra,99));
        tijucas.addCidadeAdjacente(new Adjacente(saoJose,49));

        // Adiciona cidades adjacentes a Lapa
        lapa.addCidadeAdjacente(new Adjacente(contenda,26));
        lapa.addCidadeAdjacente(new Adjacente(saoMateus,60));
        lapa.addCidadeAdjacente(new Adjacente(mafra,57));

        // Adiciona cidades adjacentes a São Mateus
        saoMateus.addCidadeAdjacente(new Adjacente(palmeira,77));
        saoMateus.addCidadeAdjacente(new Adjacente(irati,57));
        saoMateus.addCidadeAdjacente(new Adjacente(lapa,60));
        saoMateus.addCidadeAdjacente(new Adjacente(tresBarras,43));
        saoMateus.addCidadeAdjacente(new Adjacente(portoUniao,87));

        // Adiciona cidades adjacentes a Tres Barras
        tresBarras.addCidadeAdjacente(new Adjacente(saoMateus,43));
        tresBarras.addCidadeAdjacente(new Adjacente(canoinhas,78));

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
