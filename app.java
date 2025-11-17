import java.util.Scanner;
public class app {
    

    // skrivUt-metode 
    public static void skrivUt(Vare[] tabell) {
        for (int i = 0; i < tabell.length; i++) {
            System.out.println(tabell[i]);
        }
    }

   public static Vare finnVare(Vare[] tabell, int varenr) {
    for (int i = 0; i < tabell.length; i++) {
        if (tabell[i].getVarenr() == varenr) {
            return tabell[i];   
        }
    }
    return null;   
}

public static void endrePris(Vare [] tabell, int varenr, double nypris){
    Vare X = finnVare(tabell, varenr);
    X.setPris(nypris);
    System.out.println("Vare nr: " + varenr + " sin pris har blitt endra til --> " + nypris);
    

}


    public static void main(String[] args) {

        // Laga 3 objekt av klassen Vare
        Vare test0 = new Vare(0, "Doritos", 34.90);
        Vare test1 = new Vare(1, "Baconchips", 25.90);
        Vare test2 = new Vare(2, "Fried chicken chips", 43.90);

        // Legga inn i array
        Vare[] tabell = new Vare[3];
        tabell[0] = test0;
        tabell[1] = test1;
        tabell[2] = test2;

       
        skrivUt(tabell);
        finnVare(tabell, 1);
        endrePris(tabell, 1, 80);


        System.out.println("1: Skriv ut alle varenr ");
        System.out.println("2: Finn vare basert på id ");
        System.out.println("3: Endre pris basert på id ");
        System.out.println("4: Avslutta programmet ");
 Scanner scan = new Scanner(System.in);
 int svar = scan.nextInt();

        switch (svar){
            case 1:
            skrivUt(tabell);
            break;

            case 2:
    System.out.println("Skriv inn varenr då!");
    int inputvare = scan.nextInt();
    Vare funn = finnVare(tabell, inputvare);  
        System.out.println("Fann vare: " + funn);  
    break;


            case 3:
            System.out.println("Skriv inn varenr då!");
            int invarenr = scan.nextInt();
            System.out.println("Skriv ny pris og!");
            int newprice = scan.nextInt();
            endrePris(tabell, invarenr, newprice);
        

        case 4:
        System.out.println("Avsluttar programmet...");
        break;

        default:
        System.out.println("Ugyldeg verdi, avsluttar programmet...");
        break;
        }
    }

    //laga menyen til oppgåve 3

    

    

    
}
