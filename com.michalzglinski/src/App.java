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
    
        

      /* KALKULATOR IF

      if(o.equals("+")){
        System.out.println(a+" + "+b+" = "+(a+b));
      }else if(o.equals("-")){
        System.out.println(a+" + "+b+" = "+(a-b));
      }else{
        System.out.println("Podałeś zły operator");
      }
      //*/
    
        
     
        

      
    







     /* // PĘTLA FOR - deklaracje
      String[] licz = {"zero","jeden", "dwa", "trzy"};
      
      for(String l : licz ){
      //  System.out.println("0:"+l);
      }
      for(int i = 0; i < licz.length; i++ ){
        System.out.println(i+": "+licz[i]);
      }
    */

      


/*
String[][] dane = {
  {"Więcej niż jedno zwierzę","stado","klucz","dwa","owca","lama"},
  {"Sporty na s","sztafeta","skok o tyczce", "skoki narciarskie", "sumo", "szachy"}
};


int wynik = 0;


for(int i = 0; i < dane.length; i++){
  System.out.println(dane[i][0]); 
  String odp = scanner.nextLine(); 
  boolean isAnswerCorrect = false;
  
  for(int it = 1; it < dane[i].length; it++){
    
    if(dane[i][it].equals(odp)){
      isAnswerCorrect = true;
      System.out.println( "BRZDĘK" );
      wynik += it*10;
    }
  }
  if(!isAnswerCorrect){
    System.out.println("X");
  }
}      

System.out.println("Twój wynik to "+wynik);

}
}
/*/




        

      
int szansa = 1;
int randomNum = (int) (Math.random() * 101 ) + 1;

System.out.println("wymyśliłem jedną liczbe naturalna 1-100. Jaka to liczba?");

 while(szansa < 6)
 {
  
  
  int odp = scanner.nextInt();
  szansa ++;
  if(odp == randomNum)
  {
    System.out.println("Brawo! Zgadles!");
  }
  else if(odp < randomNum)
  {
    System.out.println("Myślałem nad wiekszą liczbą");
  }
  else if(odp > randomNum)
  {
    System.out.println("Myślałem nad mniejszą liczbą");
  }

  if(szansa == 6 && odp != randomNum)
  {
    System.out.println("Niestety nie udało ci sie :(");
  }
  

  if(odp == randomNum)
  {
    break;
  }
 }

//*
 Scanner scanner = new Scanner(System.in);
    System.out.println("Napisz nazwę województwa aby poznać jego stolicę: ");
    System.out.println(city(scanner.nextLine()));
    scanner.close();
  }
  static String city( String userWoj ){
    String[][] arr = {
      {"Slask","Katowice"},
      {"Wielkopolska","Poznań"},
      {"Malopolska","Kraków"},
      {"Mazowieckie","Warszawa"},
      {"Lodzkie", "Łódź"}
    };
    String output = "Nie znaleźliśmy takiego województwa.";
    int i = 0;
    while( i < arr.length ){
      if(arr[i][0].equals(userWoj)){
        output = "Stolicą województwa "+arr[i][0]+" jest "+arr[i][1];
        break;
      }
      i++;
    }
    return output;
  }
}


NewClass nc0bj = new NewClass ();
    System.out.println(nc0bj);
    NewClass ncObj = new NewClass(); 

    System.out.println(ncObj.name+" to "+ncObj.race+", który ma "+ncObj.age+" lat" );

  }
}