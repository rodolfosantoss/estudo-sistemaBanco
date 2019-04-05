package application;

import javax.swing.JOptionPane;

public class Banco {

	public static void main(String[] args) {
		int numConta, numAgencia, opc, digito1 = 0, digito2 = 0, dg1 = 0, dg2 = 0;
		double saque, deposito;
		
		
			numAgencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da Agencia"));
			numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta"));
		
		
		
		Conta conta = new Conta(numConta, numAgencia);
		
		opc = Integer.parseInt(JOptionPane.showInputDialog("Qual opção deseja executar?\n"
															+ "1 - Ver Saldo\n"
															+ "2 - Realizar Saque\n"
															+ "3 - Realizar Deposito\n"
															+ "4 - Encerrar"));
				
				
				while(opc != 4){
					
					if(opc == 1){
						JOptionPane.showMessageDialog(null, conta.Saldo());
						
						
					}else if(opc == 2){
						saque = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de saque?"));
						conta.Sacar(saque);
						
						
					 }else if(opc == 3){
						 deposito = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de deposito?"));
						 conta.Depositar(deposito);
						 
						 
					  }else{
						  JOptionPane.showMessageDialog(null, "Essa opção não existe!!!");
						  
						  
					  }
					
					
					
					
					opc = Integer.parseInt(JOptionPane.showInputDialog("Qual opção deseja executar?\n"
																		+ "1 - Ver Saldo\n"
																		+ "2 - Realizar Saque\n"
																		+ "3 - Realizar Deposito\n"
																		+ "4 - Encerrar"));
					
				}
				
				

	}

}
