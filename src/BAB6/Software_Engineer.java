package BAB6;
public class Software_Engineer extends perusahaan {
    private int tunjangan = 5500000,bonus = 300000;
    public Software_Engineer (double lamakerja){
        super(lamakerja);
    }
    public int getBonus(){
        return super.bonus()+bonus;
    } 
    public int getTotal(){
        return getGaji()+getBonus()+tunjangan;
    }

}
