import java.util.Scanner;

public class PilaAlea 
{

    public static void main(String[] args) 
    {
int tope=0,Max;
System.out.println("\n EL TAMAÑO DE LA PILA ES DE 27");
Max=27;
String[]Pila=new String[Max];

int opcion;
do
{
   Scanner opciones=new Scanner(System.in);
   System.out.println("\n 1.-Llenar datos");
   System.out.println("\n 2.-Mostrar dato");
   System.out.println("\n 3.-Eliminar dato");
   System.out.println("\n 4.-Vaciar Pila");
   System.out.println("\n 5.-Agregar Datos");
   System.out.println("\n 6.-Ordenar Pila");
   System.out.println("\n 7.-Salir de la pila");
   System.out.println("\n Escoge una opcion");
   opcion=opciones.nextInt();
   switch(opcion)
   {
                   case 1:
                 int b=27;
                     Scanner leer=new Scanner(System.in);
                    System.out.println("INGRESE EL NUMERO DE DATOS: ");
                    int x=leer.nextInt();
                    if(x>b)
                    {
                        System.out.println("\n Verifique sus datos");
                    }
                    else
                    {
                    for(int i=0;i<x;i++)
                    {
        String[]abc={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y"," z"};
        int Aleatorio=(int)Math.round(Math.random()*27);
                    String numeros=(abc[Aleatorio]);
                     Pila[tope]=numeros;
                     tope++;
                     System.out.println("\n Dato añadido");
                    }
                    }
             break; 
                   case 2:
             for(int i=(tope-1);i>=0;i--)
                 {
                     System.out.println(Pila[i]);
                 }
                 break;
                   case 3:
                       if(tope>0)
                       {
                           tope--;
                           System.out.println("Se elimino un dato");
                       }
                       else
                       {
                          System.out.println("La pila esta vacia");
                       }
                       break;
                   case 4:
                   if(tope>0)
                   {
                       tope=0;
                       Max=0;
                       System.out.println("Se vaciol la pila");
                   }
                   else
                   {
                       System.out.println("La´pila ya esta vacia");
                   }
                   break;
                   case 5:
                       Scanner agrega=new Scanner(System.in);
                       System.out.println("\n Que dato desea agregar a la pila");
                       String Dato;
                       Dato=agrega.nextLine();
                       Pila[tope]=Dato;
                       tope++;
                       System.out.println("\n Agregaste un dato");
                       break;
                   case 6:
                       Scanner ordenar=new Scanner(System.in);
                       System.out.println("\n Se ordenaran los objetos");
                       String a=Pila[tope];
                       for(int i=(tope-1);i>=0;i--)
                 {
                     System.out.println(Pila[i]);
                 }
                       
                   
                       break;
   }
}
while(opcion!=7);
    }
    
}
