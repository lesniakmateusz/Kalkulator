import java.util.Scanner;

public class Main  {






    public static void main(String[] args) {

        iloscDniWWeekend weekend = new iloscDniWWeekend();
        IloscDniPracujacych pracujace = new IloscDniPracujacych();
        IloscDniNaUrlopie naUrlopie = new IloscDniNaUrlopie();
        IloscDniNaL4 naL4 = new  IloscDniNaL4();
        Podzliczanie podliczanie = new Podzliczanie();








        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj stawke godzinowa PLN:");
        double stawka = scanner.nextDouble();

        System.out.println("Podaj wartosc premi PLN:");
        double premia = scanner.nextDouble();

        System.out.println("Podaj liczbe godzin pracy dziennie:");
        double godziny = scanner.nextDouble();

        System.out.println("Podaj liczbe dni przepracowanych w tygodniu:");
        double dni = scanner.nextDouble();

        System.out.println("Podaj liczbe dni weekendowych:");
        double dniWeekend = scanner.nextDouble();

        System.out.println("Podaj liczbe dni urlopu:");
        double dniUrlop = scanner.nextDouble();

        System.out.println("Podaj liczbe dni na l4:");
        double dniNaL4 = scanner.nextDouble();

        double c = (naL4.iloscDniL4(godziny,dniNaL4) * stawka) * 80;
        double chorobowe = c / 100;

        double a = weekend.iloscDniWeekend(godziny,dniWeekend);
        double b = weekend.iloscDniWeekend(godziny,dni);

        double tyg = pracujace.iloscDniTydzien(godziny,dni) * stawka;
        double wee = weekend.iloscDniWeekend(godziny,dniWeekend) * stawka;
        double urlop = naUrlopie.iloscDniUrlop(godziny,dniUrlop) * stawka;
        double sum = (podliczanie.podliczanie(a,b) * stawka) + premia + chorobowe + urlop;






        System.out.println("Przepracowales:" + " " +podliczanie.podliczanie(a,b)    + " " + "godzin.");
        System.out.println("Urlop:" + " " +naUrlopie.iloscDniUrlop(godziny,dniUrlop)    + " " + "godzin.");
        System.out.println("Chorobowe:" + " " +naL4.iloscDniL4(godziny,dniNaL4)    + " " + "godzin.");
        System.out.println("Zarobiles za prace w tygodniu:" + " " + tyg + " " + "PLN.");
        System.out.println("Premia:" + " " + premia + " " + "PLN.");
        System.out.println("Zarobiles za prace w weekend:" + " " + wee + " " + "PLN.");
        System.out.println("Zarobiles za chorobowe:" + " " + chorobowe + " " + "PLN.");
        System.out.println("Zarobiles za urlop:" + " " + urlop + " " + "PLN.");
        System.out.println("Zarobiles za prace lacznie:" + " " + sum + " " + "PLN.");















    }
}