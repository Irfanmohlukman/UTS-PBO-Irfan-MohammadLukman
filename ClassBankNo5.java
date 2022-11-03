/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classbankno5;

/**
 *
 * @author hp
 */
public class ClassBankNo5 {
    int saldo;
    ClassBankNo5 ( int saldo){
        this.saldo = saldo;
        
    }
    void getSaldo(){
        System.out.println("Selamat Datang di Bank irfan");
        System.out.println("Saldo saat ini : Rp." + this.saldo +"\n");
    }
    int simpanUang (int saldo){
        this.saldo += saldo;
        System.out.println("Simpan uang : Rp." + this.saldo);
        System.out.println("Saldo saat ini : Rp." + this.saldo +"\n");
        return this.saldo;
    }
    int ambilUang(int saldo){
        System.out.println("Ambil uang: Rp. " + saldo);
        if(this.saldo >= saldo ){
            this.saldo -= saldo;
            System.out.println("Saldo saat ini : Rp. " + this.saldo);
        }else {
            System.out.println("Saldo Anda Tidak Mencukupi");
    }
        return this.saldo;
     
    }   

    
    
}
