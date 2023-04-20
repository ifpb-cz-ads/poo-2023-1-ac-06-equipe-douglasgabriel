public class ContaBancariaSimplificada{
	// Nome do titular
	String nomeDoCorrentista;

	// Saldo da conta
	float saldo;

	// Conta não especial
	boolean contaEEspecial;

	// Inicializa simultaneamente todos os dados do modelo
	void abreContaSimples(String nome, float valorMin){
		if (valorMin >= 100) {
			nomeDoCorrentista = nome;
			saldo = 0.00f;
			contaEEspecial = false;	
		}else{
			System.out.print("A conta só podera ser criada com um valor inicial de R$ 100");
		}
	}

	// Deposita um valor na conta
	void deposita(float valor){
		saldo = saldo + valor;
	}

	// Tenta retirar um valor da conta retornando um valor booleano
	boolean retira(float valor){
		boolean a = false;
		if (contaEEspecial == false) { // Informa se a operação foi realizada 
			if (valor <= saldo) { // Se existir saldo faz a retirada 
				saldo = saldo - valor;
				a = true;
			}
		}else{ // A conta é especial pode retirar à vontade
			saldo = saldo - valor;
			a = true;
		}
		return a;
	}
	void mostraDados(){// Mostra os dados da conta, imprimindo os seus valores
		System.out.print("O nome do correntista é ");
		System.out.print(nomeDoCorrentista);
		System.out.print("O saldo é ");
		System.out.print(saldo);
		if (saldo < 0 && contaEEspecial == false) {
			System.out.print("O Saldo está negativo !!!");
		}
		if (contaEEspecial) {
			System.out.print("A conta é especial.");
		}else{
			System.out.print("A conta é comum.");
		}
	}
}
