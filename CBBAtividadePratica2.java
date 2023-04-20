/**Abra a sua IDE NetBeans e implemente a classe TesteIgualdade2 já
 * apresentada; depois, teste o exemplo e veja se você conseguiu visualizar
 * melhor o exemplo explicado, compreendendo os conceitos associados. */

public class CBBAtividadePratica2{
    public static void main(String[] args) {
        String frase3;
        String frase4;
        frase3 = new String("Testando igualdade");
        frase4 = frase3;
        System.out.println("Frase 3: " + frase3);
        System.out.println("Frase 4: " + frase4);
        System.out.println("Frase 1 e Frase 2 são iguais? R: " + (frase3==frase4));
    }
}

/**
 * Frase 3: Testando igualdade
 * Frase 4: Testando igualdade 
 * Frase 1 e Frase 2 são iguais? R: true
 */

 /**EXPLICAÇÃO:
  * Esse exemplo não mudou muito em relação ao anterior o principio aplicado nessa questão 
  * é o mesmo da questão anterior, diferindo somente somente que ao inves de aplicar o constructor
  * NEW a variável Frase4, aplicou o mesmo valor da variavel Frase3.
  * Nesse exemplo, o que acontece é que a variável Frase4 irá referenciar o mesmo espaço de memória 
  * da variável Frase3. 
  */