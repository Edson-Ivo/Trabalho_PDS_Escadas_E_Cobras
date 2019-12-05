package model;

public abstract class Casa{
	
	private int numero;
	private double x;
	private double y;
	
	public void efeitoCasa(Player p){
	}
	public void inserirCasaEspecial(Casa c){
	}
	
	Casa(int numero,double x,double y){
		this.numero=numero;
		this.x=x;
		this.y=y;
	}
	 
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Casa [numero=" + numero + ", x=" + x + ", y=" + y + "]";
	}

}
