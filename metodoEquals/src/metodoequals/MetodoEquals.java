
package metodoequals;

import java.util.Scanner;

public class MetodoEquals {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        String usuario = "";
        String password = "";
        
        System.out.print("Ingrese su usuario: ");
        usuario = entrada.nextLine();
        System.out.print("Ingrese su Password: ");
        password = entrada.nextLine();
        
        if(usuario.equals("mario12003906") && password.equals("mario1995")){
            System.out.println("Bienvenido al Sistema");
        }else{
            System.out.println("El usuario o contraseña es incorrecta.");
        }
        
        
        
    }
    
}
