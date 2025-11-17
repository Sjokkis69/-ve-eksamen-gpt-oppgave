public class Vare {
    private int varenr;
    private String namn;
    private double pris;
    


    public Vare (int varenr, String namn, double pris){
        this.varenr = varenr;
        this.namn = namn;
        this.pris = pris;
    }

    public int getVarenr(){
        return varenr;
    }
    public double getPris(){
        return pris;
    }
    public String getNamn(){
        return namn;
    }
    public void setPris(double pris){
        this.pris = pris;
    }
    public void setNamn(String namn){
        this.namn = namn;
    }
    public void setVarenr(int varenr){
        this.varenr = varenr;
    }

    @Override
    public String toString(){
        return "[Namn: " + namn + ", Pris: " + pris + ", Varenr: " + varenr + "]";
    }
    
   
    
}
