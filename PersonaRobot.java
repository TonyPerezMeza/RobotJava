/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword;
import java.util.Scanner;
/**
 *
 * @author tonyM
 */
public class Persona {
    Scanner entrada=new Scanner(System.in);
    //Creacion de  variables
       private String NumeroId; //AAca se almacenara el numero de cedula, BIN, pasaporte de una persona.
       private String Nombre;// Aca se alamcernara el nombre de la persona
       private String PrimerApellido; // aca se alamacena el primer apellido de la persona.
       private String SegundoApellido; //  aca se alamacenara el segundo apellido de la persona 
       private int Edad; // aca se alamacera la edad de la persona
       private float Peso; // aca se alamacera el peso de la persona, ojo, es float.
       
       
    //creacion constructores
       // este constructor permite enviar un bloque de informacion completo de una persona.
  public Persona(String NumeroId, String Nombre, String PrimerApellido, String SegundoApellido, int Edad, float Peso) 
    {
        this.NumeroId = NumeroId;
        this.Nombre = Nombre;
        this.PrimerApellido = PrimerApellido;
        this.SegundoApellido = SegundoApellido;
        this.Edad = Edad;
        this.Peso = Peso;
    }

    Persona() {
        this.NumeroId = "";
        this.Nombre = "";
        this.PrimerApellido = "";
        this.SegundoApellido = "";
        this.Edad = 0;
        this.Peso = 0;
    }

    
    
    //creacion de metodos set y get 
    // estos se hacen un metodo set, y otro get por cada uno de los atributos. 

    //Metodo get funcioan para ir a traer el dato dentro de la variable, posee un return.
     public String getNumeroId() {
        return NumeroId;
    }
     // El medoto set recibe un parametro, y ese parametro se iguala a la variable para guardar el dato.
    public void setNumeroId(String NumeroId) {
        this.NumeroId = NumeroId;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    
    //creacion de los metodos de clase

   public void GuardarPersonas()
   {
        System.out.print("Inserte su numero de cedula: ");
        setNumeroId(entrada.nextLine());
        System.out.print("Inserte su Primer Nombre: ");
        setNombre(entrada.nextLine());
        System.out.print("Inserte su Primer Apellido: ");
        setPrimerApellido(entrada.nextLine());
        System.out.print("Inserte su Segundo Apellido: ");
        setSegundoApellido(entrada.nextLine());
        System.out.print("Inserte su edad: ");
        setEdad(Integer.parseInt(entrada.nextLine()));
        System.out.print("Inserte su peso: ");
        setPeso(Float.valueOf(entrada.nextLine()));
        
   }
   
   public void MostrarPersonas()
   {
        System.out.print("El numero de cedula es: " + getNumeroId()+"\n");
        System.out.print("El nombre es: " + getNombre()+"\n");
        System.out.print("El Primer apellido es: " + getPrimerApellido()+"\n");
        System.out.print("El Segundo apellido es: " + getSegundoApellido()+"\n");
        System.out.print("La edad es de: " + getEdad()+"\n");
        System.out.print("El peso es de: " + getPeso()+"\n");
        System.out.print("L proceso termino");
   
   
   }
   
    
    
      
    
    
    
    
    
    
    
}
