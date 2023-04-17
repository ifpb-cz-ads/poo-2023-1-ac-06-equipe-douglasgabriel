/**
 * Abra a sua IDE NetBeans e implemente a classe TesteIgualdade3 já
 * mostrada; depois, teste o exemplo e veja se você conseguiu visualizar
 * melhor o exemplo explicado, compreendendo os conceitos associados.
 */

public class CBBAtividadePratica3 {
   public static void main(String[] args) {
    String frase1;
        String frase2;
        frase1 = new String("Testando igualdade");
        frase2 = new String("Testando igualdade");
        System.out.println("Frase 1: " + frase1);
        System.out.println("Frase 2: " + frase2);
        System.out.println("Frase 1 e Frase 2 são iguais? R: " + (frase1.equals(frase2)));
   } 
}

/**
 * Frase 1: Testando igualdade
 * Frase 2: Testando igualdade
 * Frase 1 e Frase 2 sÃ£o iguais? R: true
 */

 /**EXPLICAÇÃO:
  * Nesse caso com uso do constructor Equals, irá ser consultado o conteúdo das duas
  * variáveis e de acordo com o algoritmo, irá analisar se ambos os dados são iguais.
  */