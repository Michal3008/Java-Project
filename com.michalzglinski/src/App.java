import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /* PODAWANIE SWOJEGO IMIENIA 


        PODAWANIE SWOJEGO IMIENIA 
        System.out.println("Podaj swoję imię");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
   
        System.out.println("Twoje imię to " + firstName );
        
        */

        /*  KALKULATOR DWOÓCH LICZB

        System.out.println("Podaj pierwszą liczbę");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        System.out.println(a+"b = a + b");
    


        scanner.close();
        */

        int nr = 2;
        if(nr==2){
            System.out.println("Liczba to 2 ");
        }else{
            System.out.println("Liczba to 3 ");
        }else{
            System.out.println("Jakaś inna liczba niż 3 i 2 ");





            



    scanner.close();

    System.out.println("Wpisz pierwszą liczbę");
      int a = scanner.nextInt();

      System.out.println("Podaj operator + lub -");
      scanner.nextLine();
      String o = scanner.nextLine();

      System.out.println("Wpisz drugą liczbę");
      int b = scanner.nextInt();

      if(o.equals("+")){
        System.out.println(a+" + "+b+" = "+(a+b));
      }else if(o.equals("-")){
        System.out.println(a+" + "+b+" = "+(a-b));
      }else{
        System.out.println("Podałeś zły operator");
      }



    scanner.close();
  }
}


    

    
    

}
