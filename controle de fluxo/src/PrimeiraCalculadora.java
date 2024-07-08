public class PrimeiraCalculadora {
    public static void main(String[] args) {
        int valor1 = 50;
        int valor2 = 50;
        String operador = "-";
        
        switch (operador) {
            case "+":{
                System.out.println(valor1+valor2);
                break;
            }
            case "x": {
                System.out.println(valor1 * valor2);
                break;
            }
            case "-":{
                System.out.println(valor1-valor2);
                break;
            }
            case "/":{
                System.out.println(valor1/valor2);
                break;
            }
            default:
                break;
        }
    }
}
