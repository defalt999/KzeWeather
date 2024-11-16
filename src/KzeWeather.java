import java.util.Scanner;

public class KzeWeather {
    public static void main(String[] args) throws Exception {
        WeatherService serviciu = new WeatherService();
        Scanner input =new Scanner(System.in);

        do {
            System.out.println("=======================");
            System.out.println("Introdu numele orasului");
            System.out.println("=======================");
            System.out.println(serviciu.getLocatie(input.nextLine()));
            System.out.println("=======================");

        }while(1==1);
    }
}