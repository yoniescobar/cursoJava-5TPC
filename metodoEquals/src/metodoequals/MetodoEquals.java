package metodoequals;

import java.util.Scanner;

public class MetodoEquals {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String usuario = "";
        String password = "";
        int intentos=0;
        boolean rpt = false;
                
        do {
            System.out.print("Ingrese su usuario: ");
            usuario = entrada.nextLine();
            System.out.print("Ingrese su Password: ");
            password = entrada.nextLine();

            if (usuario.equals("mario12003906") && password.equals("mario1995")) {
                System.out.println("-------Bienvenido al Sistema---------");
                System.out.println("Menu");
                System.out.println("1. Planilla");
                System.out.println("2. Diario");
                System.out.println("3. Mayor");
                System.out.println("4. Balance");
                break;
            } else {
                
                System.out.println("\n\nEl usuario o contraseña es incorrecta.");
                rpt = true;
            }
               intentos++;
        }while(intentos<3);

        
        if(rpt==true){
        System.out.println("Haz superado el numero de intentos "+intentos);
        }
        
        
    }

}
