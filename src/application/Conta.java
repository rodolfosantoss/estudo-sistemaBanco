package application;

public class Conta {
	private double saldo = 1000;
	private int numConta, numAgencia;
	
	public Conta(int nConta, int nAgencia){
		this.numConta = nConta;
		this.numAgencia = nAgencia;
		
	}
	
	public double Saldo(){
		return this.saldo;
		
	}
	
	public void Sacar(double saque){
		this.saldo = this.saldo - saque;
		
	}
	
	public void Depositar(double deposito){
		this.saldo = this.saldo + deposito;
		
	}

}
