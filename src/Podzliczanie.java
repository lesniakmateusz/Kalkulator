public class Podzliczanie{



    public double podliczanie ( double sumaGodzinWeekend , double sumaGodzinTydzien){

        iloscDniWWeekend weekend = new iloscDniWWeekend();
        IloscDniPracujacych pracujace = new IloscDniPracujacych();


        double sumaGodzin = sumaGodzinWeekend + sumaGodzinTydzien;



        return sumaGodzin;



    }
}
