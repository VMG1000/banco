/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author victor.guimil
 */
public class ContaCorrente extends Conta{
    
    private double limite =50.00;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public boolean sacar(double valor){
          if((saldo-valor) >= 0){
          saldo -=valor;
          return true;
          }
          return false;
     }
    
    @Override
      public void transferir( double valor) {
	System.out.println("Valor da Transferência: ");
	
	System.out.println("Transferindo valor... " + valor);
	System.out.println("Saldo: " + getSaldo());
	sacar();
      
        
	}

      
  
     
     }

