public class Ejercicio4 {
    public static void main(String[] args) {
        int numeroIf = 5;
        if (numeroIf > 0) {
            System.out.println("Numero es positivo: " + numeroIf);
        }
        if (numeroIf < 0) {
            System.out.println("Numero es negativo: " + numeroIf);
        }
        if (numeroIf == 0) {
            System.out.println("El numero es 0");
        }
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do{
            System.out.println(numeroWhile);
        }while(numeroWhile<3);


        for (int numeroFor = 0; numeroFor <= 3 ; numeroFor++) {
            System.out.println(numeroFor);
        }
        var estacion = "OTOÑO";
        switch (estacion){
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("Estacion Erronea");
        }
    }
}
