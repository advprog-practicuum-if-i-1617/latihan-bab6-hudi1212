package BAB6;
public class Project_manager extends perusahaan{
    private int tunjangan = 6000000, bonus1 = 450000, bonus2 = 700000, bonus3 = 450000;
    private int bonus;
    public Project_manager(double lamakerja){
        super(lamakerja);
    }
    public int getBonus(){
        
        if (getLamakerja() >= 10) {
             bonus = bonus1+bonus2;
        }else{
             bonus = bonus1+bonus3;
        }
        return super.bonus()+bonus;
    }
    public int getTotal(){
        return getGaji()+ getBonus()+tunjangan;
    }        
}
