/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.Calendar;

/**
 *
 * @author victor.guimil
 */
public class ContaPoupanca extends Conta{
    
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    public boolean calcularNovoSaldo (double taxaRendimento){
        
        Calendar hoje = Calendar.getInstance();
        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            
            //saldo += saldo *taxaRendimento;
            this.setSaldo(this.getSaldo() + (this.getSaldo() *taxaRendimento));
           return true;
           
        }
        return false;
    }
    
}
