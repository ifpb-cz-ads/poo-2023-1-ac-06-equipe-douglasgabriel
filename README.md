# Resolução das questões:
#
## Livro: Batista & Moraes (Pág: 78 a 80)
## Alunos: _Douglas & Gabriel_
#
#### Questão 8: <br>
Identifique e explique o(s) erro(s) na classe abaixo: <br>
<br>
1 class Teste2 <br>
2 {<br>
3 /** <br>
4 * _Declaração dos campos desta classe_ <br>
5 */<br>
6 int num1,num2; <br>
7 /** <br>
8 * _Declaração dos métodos desta classe_ <br>
9 */ <br>
10 int maior() <br>
11 { <br>
12 if (num1 > num2) <br>
13 return true; <br>
14 else return false; <br>
15 } <br>
16 void menor() <br>
17 { <br>
18 if (num1 < num2) <br>
19 return num1; <br>
20 else return num2; <br>
21 } <br>
22 } // _fim da classe_ <br>
<br>
**Resolução:**<br>
O algoritmo codificado busca resolver o probllema de encontrar o maior número, entre os numero que foram, ou serão, informados e armazenados nas variáveis: _num1_ e _num2_. Sendo assim, o programador usou dois métodos, onde se encontram alguns erros:<br>
<br>
_10 int maior() <br>
11 { <br>
12 if (num1 > num2) <br>
13 return true; <br>
14 else return false; <br>
15 } <br>_
**Observe que:** O método usa o tipo **int**, sendo necessário retornar um valor do tipo inteiro, porém não é isso o que ocorre, a função retorna um valor do tipo **Boleano**. Sendo, portanto, um erro.<br>
<br>
**Outro Erro: ** <br>

16 _void menor() <br>
17 { <br>
18 if (num1 < num2) <br>
19 return num1; <br>
20 else return num2; <br>
21 } <br>_
**Observe que:** O método não usa um tipo defindo de uma variável, uso o termo **void**, a qual gerelmente, não retorna nenhum valor. Nesse caso, o termo retorna, e o valor retornado é um valor do tipo **Inteiro**.<br>
<br>
**Possível solução:**
 <br>
1 class Teste2 {<br>
2 <br>
3 int num1,num2; <br>
4<br>
5 int maior(){ <br>
6 if (num1 > num2)<br>
7 return num1; <br>
8 else return num2; <br>
9 } <br>
10 void menor(){ <br>
11 if (num1 < num2) <br>
12 System.out.printl("O Menor numero eh:" + num1); <br>
13 else return System.out.printl("O Menor numero eh:" + num2); <br>
14 } <br>
15 } // _fim da classe_ <br>
<br>

#### Questão 9: <br>
Identifique e explique o(s) erro(s) na classe abaixo. <br>
<br>
1 class TesteImpressao <br>
2 { <br>
3 main(String[] args) <br>
4 { <br>
5 System.out.println(“7+2=”+(7+2)); <br>
6 System.out.println(“7-2=”+(7-2)); <br>
7 System.out.println(“7x2=”+(7x2)); //_O termo "x" indica a multiplicação_ <br>
8 System.out.println(“7/2=”+(7/2)); <br>
9 return true; <br>
10 } <br>
11 } // fim da classe
<br>
**Observe que:** O código analisado faz referência ao um programa principal onde irá apresentar alguns resultados de cálculos. O problema em quaestão se deve ao retorno de valor **true**, tendo em vista que o **main** é acompanhado do termo **void**, e o mesmo, não retorna nenhum valor.<br>
<br>
**Possível solução:**
 <br>
 <br>
1 class TesteImpressao{ <br>
2 main(String[] args){ <br>
3 System.out.println(“7+2=”+(7+2)); <br>
4 System.out.println(“7-2=”+(7-2)); <br>
5 System.out.println(“7x2=”+(7x2)); //_O termo "x" indica a multiplicação_<br> 
6 System.out.println(“7/2=”+(7/2)); <br>
7 } <br>
8 } // fim da classe