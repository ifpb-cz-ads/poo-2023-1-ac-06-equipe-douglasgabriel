public class Lampada{
	private double valor;
	private int voltagem;
	private boolean estado;
	// Get e Set de valor 
	public void setValor(double valor){
		this.valor = valor;
	}
	public double getValor(){
		return this.valor;
	}
	// Final

	// Get e Set de voltagem
	public void setVoltagem(int voltagem){
		this.voltagem = voltagem;
	}
	public int getVoltagem(){
		return this.voltagem;
	}
	// Final

	// Get e Set de Estado
	public void setEstado(boolean estado){
		this.estado = estado;
	}
	public boolean getEstado(){
		return this.estado;
	}
	// Final

	// Funções que de Classe
	public void aprPreco(){
		System.out.println(getValor());
	}
	public void funciona(){
		if (this.estado == true) {
			System.out.println("A lampada funciona");
		}else{
			System.out.println("A lampada nao funciona");
		}
	}
	// Final 
}