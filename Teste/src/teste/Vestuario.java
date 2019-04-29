package teste;

public class Vestuario {
    String nome;
    String tipo;
    String tamanho;
    double preco;
    boolean vendido;
    boolean notaFiscal;
    
    void status (){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Preço: " + this.preco);
        System.out.println("Peça foi Vendida? " + this.vendido);
        System.out.println("Possui nota fiscal? " + this.notaFiscal);
    }
    void trocar(){
        if  (this.notaFiscal == true){
            System.out.println("Então você pode efetuar a troca.\n");
    }else{
            System.out.println("Então você não pode efetuar a troca.\n");
        }
}
}
