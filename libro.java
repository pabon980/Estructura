import java.util.Scanner;

public class libro{
    


public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("ingrese la dimension de la matriz:");
    n= sc.nextInt();
    metodos M = new metodos();
    objlibro[][] o = new objlibro[n][n];

    o = M.llenarmatriz(o);
    M.mostrarmatriz(o);
    M.valormayor(o);
    
    }

}

