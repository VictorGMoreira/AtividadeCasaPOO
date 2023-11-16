package ifce;

import modelo.Pessoa;


public class Principal {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Victor",16);
        
        pessoa.imprimirInformacoes();
        
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
       
        pessoa.imprimirInformacoes();
        
        
        
    }
}