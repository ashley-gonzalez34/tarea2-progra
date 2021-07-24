
package TAREA2;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class TAREA2 {
    
    private static Scanner teclado = new Scanner (System.in);
    
    public static void ejemplo1 (){
    String EdadCadena="20";
        int edad ;
        EdadCadena = "3.1416";
        
      
        double valorPi = Double.parseDouble ( EdadCadena);
        
        
        char c = "hola ".charAt(3);
        System.out.println("Valor de CharAt 3 = " + c );
        
       // Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();
        System.out.println("EdadCadena tu edad es  = "+edad);
        
        EdadCadena = String.valueOf(22);
        System.out.println("EdadCadena = "+ EdadCadena);
        
        short s = 129;
        byte b = (byte)  s;
        s = b ;
    }
    
    
    

    public static void radio (){
        Scanner r = new Scanner(System.in);
        System.out.println("Ingrese el radio :");
        double radio =Double.parseDouble(teclado.nextLine());
        double area= Math.PI*Math.pow(radio,2);
        System.out.println("Area = "+ area); 
    }
    
    public static void area (){
        String entrada = JOptionPane.showInputDialog("Introduce un radio");
        double radio = Double.parseDouble(entrada);
        double area =Math.pow(radio,2);
        System.out.println("area = "+area);
        
    }
    
    public static void  CodigoA(){
   
        String texto;
        int codigo=0;
        System.out.println("Ingrese un codigo ascii");
        texto=teclado.nextLine();
        codigo=Integer.parseInt(texto);
        char caracter = (char)codigo;
        System.out.println("caracter = "+ caracter);
        
          
    }
    
    public static void LetraAscii(){
        String palabra = "Hola";
        int  codificar= 0;
        String Ascii = "";
        String resultado = " ";
        int llave = 9; 
        
        
        for (int x=0;x<palabra.length();x++){
             
           
            codificar = (int)palabra.charAt(0);
            codificar = codificar + llave;
            char caracter =(char) codificar;
            
            resultado = resultado + caracter;
            System.out.println("caracter = "+ caracter);
            
            
           // Ascii = Ascii + ","+ (int)palabra.charAt(x);
         //System.out.println("Ascii = "+Ascii );        
         //System.out.println("palabra="+palabra.charAt (x));
       
        }
        
        System.out.println("resultado palabra codificado = "+ resultado);
        
   }
    public static void main(String[] args) 
    {
        
        Scanner codigoascii = new Scanner(System.in);
        System.out.println("Ingrese el codigo ascci que desea !!");
        // variable que se va almacenar los datos que se vayan ingresando
        char caracteres= codigoascii.next().charAt(0);
        // el mensaje que se estara desifrando  
        int ascii = (int )caracteres;
        System.out.println(" El caracter es  :"+caracteres+" Tiene el codigo ascii  "+(ascii));   
        
        //ejemplo1();
        //radio();
        //area();
        //CodigoA();
        LetraAscii();
        
        
        
        
    
    }
    
   


}

    
   
    

