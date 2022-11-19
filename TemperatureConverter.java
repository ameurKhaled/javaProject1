import java.util.Scanner;

public class TemperatureConverter {

        public static void main(String[] args) {


            double temperature, resultat;
            int continu;

                System.out.println("-----------------------------------Welcome------------------------------------------\n" +
                        "--------Celsius-Fahrenheit/Fahrenheit-Celsius converter--------");

            do {

                System.out.println( "1- Celsius-Fahrenheit\n" +
                        "2- Fahrenheit-Celsius");


                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();

                while (choice != 1 && choice != 2) {
                    System.out.println("You have to choose the conversion mode:\n" +
                            "1- Celsius-Fahrenheit\n" +
                            "2- Fahrenheit-Celsius");
                    choice = sc.nextInt();
                }

                System.out.println("Please enter the temperature to convert:");

                temperature = sc.nextInt();

                if (choice == 1) {
                    //F = (C * 9/5) + 32
                    resultat = (temperature * 9 / 5) + 32;
                    System.out.println(temperature + " °C --------> " + resultat + "°F");
                } else {
                    //C = (F - 32) * 5/9
                    resultat = (temperature - 32) * 5 / 9;
                    System.out.println(temperature + " °F --------> " + resultat + "°C");
                }

                System.out.println("do you want to convert other temperatures? \n" +
                        "1- Yes\n" +
                        "2- No");
                continu = sc.nextInt();


            }while (continu == 1 );

            if (continu == 2){
                System.out.println("-----------------------------Goodbye, see you soon-------------------------");
            }
        }

}
