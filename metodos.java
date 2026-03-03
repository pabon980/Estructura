import java.util.Scanner;

public class metodos{
Scanner sc = new Scanner(System.in);

    public objlibro[][] llenarmatriz(objlibro[][] m){

        for (int i = 0; i <m.length; i++) {
            for (int j = 0; j <m.length; j++) {
                objlibro o = new objlibro();
            System.out.println("ingrese el titulo del libro: ");
            o.setTitulo(sc.next());
            System.out.println("ingrese el autor del libro: ");
            o.setAutor(sc.next());
            System.out.println("ingrese el precio del libro: ");
            o.setPrecio(sc.nextDouble());
            m[i][j]= o;
            }
        }
return m;
    }

        public void mostrarmatriz(objlibro[][] m){

            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j <m.length; j++) {
                    System.out.println("titulo:" + m[i][j].getTitulo());
                    System.out.println("autor:" + m[i][j].getAutor());
                    System.out.println("precio" + m[i][j].getPrecio());
                    System.out.println("---------------------------------------\n");


                    
                }
                
            }



        }

        public void valormayor(objlibro[][] m){
        double mayor;
        String nombreactual = "";
        mayor = 0;
            for (int i = 0; i <m.length; i++) {
                for (int j = 0; j <m.length; j++) {
                    if (m[i][j].getPrecio()>mayor) {
                        mayor = m[i][j].getPrecio();
                        nombreactual = m[i][j].getTitulo();

                        
                    }
                    
                }
                
            }
            System.out.println("el libro con mayor valor es "+ nombreactual +"\n"+ "precio: "+ mayor );





        }
 
    }

