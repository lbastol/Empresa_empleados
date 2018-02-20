/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package violet1;

/**
 *
 * @author Estudiante
 */
public class Violet1 {
    private int numero;
    private int clave;
    private String duenio;
    private double saldo;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getClave() {
        return clave;
    }

    public String getDuenio() {
        return duenio;
    }

    public double getSaldo() {
        return saldo;
    }

    public Violet1(int numero, int clave, String duenio, double saldo) {
        this.numero = numero;
        this.clave = clave;
        this.duenio = duenio;
        this.saldo = saldo;
    }
    public boolean consignar(double valor){
        if (valor > 0){
            this.saldo=this.saldo + valor;
            return true;
        }else
            return false;
    }
    public boolean retirar(double valor){
        if( valor < this.saldo){
            this.saldo= this.saldo - valor;
            return true;
        }else
            return false;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
