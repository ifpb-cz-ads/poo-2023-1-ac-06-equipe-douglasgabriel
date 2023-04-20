class TestandoContaBancáriaSimplificada{
	public static void main(String []args){
		ContaBancariaSimplificada c1;
		c1 = new ContaBancariaSimplificada();
		c1.abreContaSimples("Maria", 100.0f);
		ContaBancariaSimplificada c2 = new ContaBancariaSimplificada();;
		c2.abreContaSimples("João", 80.0f);
		c1.deposita(200);
		c2.saldo = 1000;
		if(c1.retira(300)){
			System.out.println("Saque realizado com sucesso!");
		}else{
			System.out.println("Saldo insuficiente!");
		}
		c1.mostraDados();
		c2.mostraDados();
	}
}