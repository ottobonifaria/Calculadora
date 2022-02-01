public class App
{
    public static void main( String[] args ){
        Calculadora calc = new Calculadora();

        calc.entrada(2);
        calc.setOperador('+');
        calc.entrada(3);

        System.out.println(calc.getResultado());

        calc.setOperador('*');
        calc.entrada(5);

        System.out.println(calc.getResultado());
    }
}
