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
public class Conta {

    /**
     */
    
    protected int agencia ;
    protected int numero;
    protected int digito;
    protected double saldo;
    
      static boolean sacar() {
        return false;
       
    }
     double setLimite;
    
    
    //depositar metodo
     public void depositar(double valor)
    {
        saldo += valor;
        //System.out.println("Depositado: " + valor);
        //System.out.println("Novo saldo: " + saldo + "\n");
    }
    
     //sacar 
     public boolean sacar(double valor){
          if((saldo-valor) >= 0){
          saldo -=valor;
          return true;
          }
          return false;
     }
          
              
     public void transferir(double valor) {
	System.out.println("Valor da Transferência: ");
	
	System.out.println("Transferindo valor... " + valor);
	System.out.println("Saldo: " + getSaldo());
	sacar();
        
                        
        
	}

    
   

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the digito
     */
    public int getDigito() {
        return digito;
    }

    /**
     * @param digito the digito to set
     */
    public void setDigito(int digito) {
        this.digito = digito;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

   
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
     public static void main(String[] args) {
              System.out.println("*** ContaCorrente ***");
         
         Conta contaCorrente = new Conta();
         contaCorrente.setAgencia(1);
         contaCorrente.setNumero(123445);
         contaCorrente.setDigito(1);
         System.out.println("CC." + contaCorrente.agencia +"." + contaCorrente.numero +" -" + contaCorrente.digito);
         contaCorrente.setLimite(50);
         System.out.println("Saldo Limite:"+ contaCorrente.SaldoComLimite() );
        contaCorrente.depositar(200);
         System.out.println("Deposito Efetuado com suceso, novo saldo ="+contaCorrente.getSaldo()+"**Saldo Limite:"+ contaCorrente.SaldoComLimite());
               
         contaCorrente.sacar(100);
         System.out.println("Saque Efetuado com suceso, novo saldo ="+contaCorrente.getSaldo()+"**Saldo Limite:"+ contaCorrente.SaldoComLimite());


         
         if (contaCorrente.sacar(200)){
            System.out.println("Saque Efetuado com suceso, novo saldo ="+contaCorrente.getSaldo()+"**Saldo Limite:"+ contaCorrente.SaldoComLimite());
                    }else{ 
        
        System.out.println("Saque Insuficiente de " +50 + ";saldo de ="+contaCorrente.getSaldo()+"**Saldo Limite:"+ contaCorrente.SaldoComLimite());
        
        }                 
       
         
      
	
         
        //conta poupanca
         System.out.println("*** ContaPoupanca ***");
         ContaPoupanca contaPoupanca = new ContaPoupanca();
         contaPoupanca.setAgencia(1);
         contaPoupanca.setNumero(123445);
         contaPoupanca.setDigito(1);
         System.out.println("CP." + contaPoupanca.agencia +"." + contaPoupanca.numero +" -" + contaPoupanca.digito);
         contaPoupanca.setDiaRendimento(12);
                           
        contaPoupanca.depositar(100);
                   
        
        System.out.println("Saldo da Conta Poupança:" + contaPoupanca.getSaldo());
        
        
        if (contaPoupanca.calcularNovoSaldo(0.02)){
            System.out.println("Rendimento aplicado novo è de = " + contaPoupanca.getSaldo());
        }else {
            
            System.out.println("Hoje não è dia de rendimento");
        }
                    
                              
        if (contaPoupanca.sacar(150)){
            System.out.println("Saque Efetuado com suceso, novo saldo ="+contaPoupanca.getSaldo());
                    }else{ 
        
        System.out.println("Saque Insuficiente de " +50 + ";saldo de ="+contaPoupanca.getSaldo());
        
        }
          contaCorrente.transferir(50);
        System.out.println("Valor da Transferência:" +contaPoupanca.getSaldo() );
	
       
        
    
}

    private void setLimite(int i) {
    }

    private double SaldoComLimite() {
        return 50;
        
    }

}
