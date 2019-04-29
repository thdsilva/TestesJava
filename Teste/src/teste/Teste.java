package teste;

public class Teste {

    public static void main(String[] args) {
    Vestuario v1 = new Vestuario();
    v1.nome = "Calça";
    v1.preco = 99.99;
    v1.tamanho = "GG";
    v1.tipo = "Verão";
    v1.vendido = true;
    v1.notaFiscal = false;
    v1.status();
    v1.trocar();
    
    Vestuario v2 = new Vestuario();
    v2.nome = "Camisa";
    v2.preco = 49.99;
    v2.tamanho = "P";
    v2.tipo = "Verão";
    v2.vendido = true;
    v2.notaFiscal = true;
    v2.status();
    v2.trocar();
    
    Bijuteria b1 = new Bijuteria();
    b1.nome = "colar";
    b1.preco = 199.99;
    b1.tipo = "ouro";
    b1.vendido = false;
    b1.peso = 110;
    b1.status();
    

    }
    
}
