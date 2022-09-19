package Servicios03;

import Entidades03.Operacion;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class OperacionService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    DecimalFormat df = new DecimalFormat("#.00");

    public Operacion crearOperacion() {
        System.out.println("Ingresar el primer numero:");
        int num1 = leer.nextInt();
        System.out.println("Ingresar el segundo numero:");
        int num2 = leer.nextInt();
        return new Operacion(num1, num2);
    }

    public int sumar(Operacion o1) {
        return o1.getNum1() + o1.getNum2();
    }

    public int restar(Operacion o1) {
        return o1.getNum1() - o1.getNum2();
    }

    public int multiplicar(Operacion o1) {
        if (o1.getNum1() == 0 || o1.getNum2() == 0) {
            System.out.println("ERROR. No se valida multiplicar x 0");
            return 0;
        } else {
            return o1.getNum1() * o1.getNum2();
        }
    }

    public double dividir(Operacion o1) {
        if (o1.getNum1() == 0 || o1.getNum2() == 0) {
            System.out.println("ERROR. No se valida dividir x 0");
            return 0;
        } else {
            return (double) o1.getNum1() / o1.getNum2();
        }
    }

}
