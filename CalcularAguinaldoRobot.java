/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword;

/**
 *
 * @author tonyM
 */
public class CalcularAguinaldo {
    static final int Meses = 12;
    private float SalarioBruto;
    private float Alguinaldo;
    private float SalarioNeto;

    public CalcularAguinaldo(float SalarioBruto, float Alguinaldo, float SalarioNeto) {
        this.SalarioBruto = SalarioBruto;
        this.Alguinaldo = Alguinaldo;
        this.SalarioNeto = SalarioNeto;
    }

    
    public CalcularAguinaldo()
    {
    
    this.SalarioBruto = 0;
    this.Alguinaldo = 0;
    this.SalarioNeto = 0;
    
    }

    public float getSalarioNeto() {
        return SalarioNeto;
    }

    public void setSalarioNeto(float SalarioNeto) {
        this.SalarioNeto = SalarioNeto;
    }

    public float getSalarioBruto() {
        return SalarioBruto;
    }

    public void setSalarioBruto(float SalarioBruto) {
        this.SalarioBruto = SalarioBruto;
    }

    public float getAlguinaldo() {
        return Alguinaldo;
    }

    public void setAlguinaldo(float Alguinaldo) {
        this.Alguinaldo = Alguinaldo;
    }
    
   public float SalarioNeto()
   {
       float i = (float) (SalarioBruto * 0.13);
       SalarioNeto = SalarioBruto - i;
       return SalarioNeto;
   }
   public float CalcularAguinaldo()
   {
        Alguinaldo = SalarioNeto * Meses;
   return Alguinaldo;
   }
    
    
    
    
}
