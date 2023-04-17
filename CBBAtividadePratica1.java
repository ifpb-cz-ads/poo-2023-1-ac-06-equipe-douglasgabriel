/**
 * Abra a sua IDE NetBeans e implemente a classe TesteIgualdade, que   
 * está apresentada anteriormente; depois, teste o exemplo e veja se você
 * conseguiu visualizar melhor o exemplo explicado, compreendendo os conceitos associados.
 */

public class CBBAtividadePratica1{
    public static void main(String[] args) {
        String frase1;
        String frase2;
        frase1 = new String("Testando igualdade");
        frase2 = new String("Testando igualdade");
        System.out.println("Frase 1: " + frase1);
        System.out.println("Frase 2: " + frase2);
        System.out.println("Frase 1 e Frase 2 são iguais? R: " + (frase1==frase2));
    }
}

/**
 * Frase 1: Testando igualdade
 * Frase 2: Testando igualdade
 * Frase 1 e Frase 2 são iguais? R: false
 */

 /**
  * EXPLICAÇÃO:
  * Embora ambas sejam do mesmo tipo e apresentem a mesma frase, com as mesmas letras 
  * maiuscula e minusculas; o operador NEW cria dois objetos distintos e com espaços  
  * de alocação distintos.
  * O operador "==" ao ser usado com objetos não verifica se o objeto possui conteúdos
  * parecidos ou iguais, mas sim, verifica se a sua referência de memória é a mesma. 
  */