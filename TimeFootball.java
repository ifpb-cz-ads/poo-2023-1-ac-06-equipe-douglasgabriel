public class TimeFootball{
	private String timeName;
	private String campeonato;
	private int titulos;
	private boolean venceu;
	// get e set do atributo timeName
	public String getTimeName(){
		return this.timeName;
	}
	public void setTimeName(String timeName){
		this.timeName = timeName;
	}
	// Final

	// get e set do atributo campeonato
	public String getCampeonato(){
		return this.campeonato;
	}
	public void setCampeonato(String campeonato){
		this.campeonato = campeonato;
	}
	// Final

	// get e set do atributo titulos
	public int getTitulos(){
		return this.titulos;
	}
	public void setTitulos(int titulos){
		this.titulos = titulos;
	}
	// Final

	// get e set do atributo venceu
	public void setVenceu(boolean venceu){
		this.venceu = venceu;
	}
	public boolean getVencu(){
		return this.venceu;
	}
	// Final

	public void nomeTime(){
		System.out.println(getTimeName());
	}
	public String campeonatoAtl (){
		System.out.println(getCampeonato());
		return this.campeonato;
	}
	public void campeao(){
		if (this.venceu == true) {
			System.out.println("O time foi campeoa");
		}else{
			System.out.println("O time nao foi campeoa");
		}
	}
}