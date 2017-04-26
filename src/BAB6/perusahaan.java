package BAB6;
public class perusahaan {
    private double lamakerja;
    private int gajipokok, bonus;

    public perusahaan(double lamakerja) {
        gajipokok = 2500000;
        this.lamakerja = lamakerja;
    }
    public int getGaji(){
        return gajipokok;
    }
    public int bonus(){
        if (lamakerja > 5) {
            bonus = 250000;
        }else{
            bonus = 0;
        }
       return bonus;
    }
    public double getLamakerja(){
        return lamakerja;
    }
}
