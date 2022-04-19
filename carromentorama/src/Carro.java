public class Carro {

    private String cor;
    private Integer quantidadePneus;
    private Integer quantidadePortas;
    private String arCondicionado;
    private String combustivel;
    private Integer quantidadeAirbag ;
    private String numeroChassi;
    private String anoFabricacao;

    public Carro(Integer quantidadeAirbag,
                 String cor,
                 int quantidadePneus,
                 int quantidadePortas,
                 String arCondicionado,
                 String combustivel,
                 String numeroChassi,
                 String anoFabricacao)
    {
        this.quantidadeAirbag = quantidadeAirbag;
        this.cor = cor;
        this.quantidadePneus = quantidadePneus;
        this.quantidadePortas = quantidadePortas;
        this.arCondicionado = arCondicionado;
        this.combustivel = combustivel;
        this.numeroChassi = numeroChassi;
        this.anoFabricacao = anoFabricacao;

    }

    public Integer getQuantidadePneus() {
        return quantidadePneus + 1;
    }

    public void setQuantidadePneus(Integer quantidadePneus) {
        this.quantidadePneus = quantidadePneus;
    }

    public void imprimeValores(){
        System.out.println("Quantidade de AirBags " + quantidadeAirbag);
        System.out.println("Cor do carro " + cor);
        System.out.println("Quantidade de pneus " + getQuantidadePneus());
        System.out.println("Quantidade de portas " + quantidadePortas);
        System.out.println("Ar condicionado " + arCondicionado);
        System.out.println("Combustivel " + combustivel);
        System.out.println("Numero de chassi " + numeroChassi);
        System.out.println("Ano de fabricacao " + anoFabricacao);

    }



}
