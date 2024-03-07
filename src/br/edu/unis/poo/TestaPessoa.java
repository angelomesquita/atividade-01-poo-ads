package br.edu.unis.poo;

public class TestaPessoa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Pessoa 01", 43, 1.83);        
        Pessoa p2 = new Pessoa("Pessoa 02", 50, 1.64);        
        
        System.out.println("****************");
        System.out.println("* ATIVIDADE 01 *");
        System.out.println("****************");
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Altura: " + p1.getAltura());
        System.out.println("Tem necessidade especial: " + p1.isTemNecessidadeEspecial());
        System.out.println("*************************");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Idade: " + p2.getIdade());
        System.out.println("Altura: " + p2.getAltura());
    }
}
