import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*  PODAWANIE SWOJEGO IMIENIA 
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
        /*  WARUNEK IF (JEŻELI)
        int nr = 2;
        if(nr==2){
            System.out.println("Liczba to 2 ");
        }else if (nr==3){
            System.out.println("Liczba to 3 ");
        }else{
            System.out.println("Jakaś inna liczba niż 3 i 2 ");
        }
        */
    
        System.out.println("Wpisz pierwszą liczbę");
        int a = scanner.nextInt();

        System.out.println("Podaj operator + * / - %");
        scanner.nextLine();
        String o = scanner.nextLine();

        System.out.println("Wpisz drugą liczbę");
        int b = scanner.nextInt();

      /* KALKULATOR IF
      if(o.equals("+")){
        System.out.println(a+" + "+b+" = "+(a+b));
      }else if(o.equals("-")){
        System.out.println(a+" + "+b+" = "+(a-b));
      }else{
        System.out.println("Podałeś zły operator");
      }
      //*/
        
      
        switch(o){
          case "+":
            System.out.println("wynik to: " +(a+b));
            break;
          case "-":
            System.out.println("wynik to: " +(a-b));
            break;
          case "*":
            System.out.println("wynik to: " +(a*b));
            break;
          case "/":
            System.out.println("wynik to: " +(a/b));
            break;
          case "%":
            System.out.println("wynik to: " +(a%b));
            break;
          default:
            System.out.println("Podales zly operator");
        }

      scanner.close();
    }
}



    

    
    


