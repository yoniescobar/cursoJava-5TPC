
package POO;

import javax.swing.JOptionPane;

public class Empleado extends Persona{
    String tipoContrato;
    double sueldo;

    public Empleado(String tipoContrato, double sueldo, String nombres, String apellidos, String dpi, boolean tipo) {
        super(nombres, apellidos, dpi, tipo);
        this.tipoContrato = tipoContrato;
        this.sueldo = sueldo;
    }
    
    @Override
    public void verDatos(){
        JOptionPane.showMessageDialog(null,"\n Nombre: "+nombres+
                "\n Apllidos: "+apellidos+
                "\n CUI: "+dpi+
                "\ntipo: "+tipo+
                "\ntipo Contrato"+tipoContrato+
                "\nsueldo: "+sueldo,"Datos Empleado",1);
    }
    
    
}
