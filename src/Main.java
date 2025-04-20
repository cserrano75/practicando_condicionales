import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome! \n");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese un numero: ");
//        float numero = scanner.nextFloat();
//        System.out.println (numero);
//        scanner.close();

        //Determinar si un numero es par o impar
        //        if (numero%2==0){
        //            System.out.println(numero + " es par");
        //        }else{
        //            System.out.println(numero + " es impar");
        //        }

        //Definir escalas de valores para una condicion

        //El estudiante tuvo un promedio de 8.2 y fue aprobado.
        //El estudiante tuvo un promedio de 5.8 y está en recuperación.
        //El estudiante tuvo un promedio de 4.3 y fue reprobado.

//                if (numero >= 7.0) {
//                    //El estudiante es aprobado si su promedio final es mayor o igual a 7.0.
//                    System.out.println("El estudiante tuvo un promedio de  " + numero + " y fue aprobado.");
//                   }else if (numero >= 5.0 && numero <= 6.9) {
//                    //Si el promedio está entre 5.0 y 6.9, está en recuperación.
//                    System.out.println("El estudiante tuvo un promedio de " + numero + " y está en recuperación.");
//
//                } else if (numero<5.0) {
//                    //Si es inferior a 5.0, está reprobado.
//                    System.out.println("El estudiante tuvo un promedio de " + numero +" y fue reprobado.");
//                }
        //Validar ingreso de contraseña
//        double miClave = 123456;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese la contraseña: ");
//        double numero = scanner.nextDouble();
//        scanner.close();
//
//        if(numero == miClave){
//            System.out.println("Acceso permitido");
//        }else{
//            System.out.println("!Acceso denegado¡");
//        }

        //Comparar dos numeros ingresados
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese un primer numero: ");
//        int primerNumero = scanner.nextInt();
//        System.out.println("Ingrese un segundo numero: ");
//        int segundoNumero = scanner.nextInt();
//
//        //System.out.println("Primer numero " + primerNumero + " Segundo numero " + segundoNumero);
//        scanner.close();
//
//        if(primerNumero==segundoNumero){
//            System.out.println("Los numeros ingresados son iguales!");
//        } else if (primerNumero>segundoNumero) {
//            System.out.println("El numero " + primerNumero + " es mayor");
//        }else {
//            System.out.println("El numero " + segundoNumero + " es mayor");
//        }

        //Aplicar descuento de 10% a un monto de compra mayor a 100
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese el valor de la compra: ");
//        double montoCompra = scanner.nextDouble();
//        scanner.close();
//
//        double montoConDescuento=0;
//        int descuento=10;
//
//        if(montoCompra>=100){
//            montoConDescuento=montoCompra-((montoCompra*10)/100);
//            System.out.println("El monto de la compra con descuento es :" +montoConDescuento);
//        }else{
//            montoConDescuento=montoCompra;
//            System.out.println("El monto de la compra no tiene descuento: " + montoConDescuento);
//        }

        //Determinar si un dia de la semana (texto) es habil o no
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese el dia : ");
//        String  diaIngresado = scanner.next();
//
//        scanner.close();
//
//        if(diaIngresado.equals("sabado")){
//            System.out.println(diaIngresado + " no es un dia habil");
//        } else if (diaIngresado.equals("domingo")) {
//            System.out.println(diaIngresado + " no es un dia habil");
//        }else {
//            System.out.println(diaIngresado + " es un dia habil");
//        }

        //Determinar si un numero esta dentro de un rango de valores permitido
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese el valor del prestamo : ");
//        double  montoIngresado = scanner.nextDouble();
//        scanner.close();
//
//        if (montoIngresado>=5000 || montoIngresado<=1000){
//            System.out.println("El valor " + montoIngresado + " no está dentro del intervalo permitido para el préstamo");
//        }

        //Validar lados de un triangulo
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese el primer lado : ");
//        double  primerLado = scanner.nextDouble();
//        System.out.println("Ingrese el segundo lado : ");
//        double  segundoLado = scanner.nextDouble();
//        System.out.println("Ingrese el tercer lado : ");
//        double  tercerLado = scanner.nextDouble();
//
//        scanner.close();
//
//        if((primerLado+segundoLado)>tercerLado){
//            System.out.println("Los lados pueden formar un triangulo");
//        }else{
//            System.out.println("Los lados NO pueden formar un triangulo");
//        }

        //Validar si se cumplen los requisitos
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese la edad : ");
//        double  edadDonante = scanner.nextDouble();
//        System.out.println("Ingrese el peso : ");
//        double  pesoDonante = scanner.nextDouble();
//        scanner.close();
//
//        if (edadDonante<18 || edadDonante>65){
//            System.out.println("El donante no es compatible.\n" +
//                    "Motivo: Debe tener entre 18 y 65 años");
//        } else if (pesoDonante<50) {
//            System.out.println("El donante no es compatible.\n" +
//                    "Motivo: Debe pesar mas de 50 kgs.");
//        }

        //Validar ingreso al sistema
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese el codigo de acceso : ");
//        double  codigoAcceso = scanner.nextDouble();
//        System.out.println("Ingrese el nivel de permiso : ");
//        double nivelUsuario = scanner.nextDouble();
//        scanner.close();
//
//        String mensaje="";
//        String mensajeStatus =" denegado ";
//        String mensajeCodigo ="";
//        String mensajeNivelUsuario ="";
//        String mensajeError="";
//
//        if ((nivelUsuario<1 || nivelUsuario>3) && codigoAcceso != 2023){
//            mensaje=  "Acceso denegado, codigo de acceso incorrecto y nivel de usuario incorrecto";
//        } else if (codigoAcceso == 2023 && (nivelUsuario<1 || nivelUsuario>3)) {
//            mensaje= "Acceso denegado, nivel de usuario incorrecto ";
//        }else {
//            mensaje = "Acceso permitido";
//        }
//        System.out.println(mensaje);

        Producto p1 = new Producto("Lapiz", 1.50);
        Producto p2 = p1;
        p2.setPrecio(2.00);
        System.out.println(p1.getPrecio());


    }
}