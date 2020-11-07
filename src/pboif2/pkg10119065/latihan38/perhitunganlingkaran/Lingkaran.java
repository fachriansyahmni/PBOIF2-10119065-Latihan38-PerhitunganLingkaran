package pboif2.pkg10119065.latihan38.perhitunganlingkaran;

/**
 *
 * @author Fachriansyah PC
 */
public class Lingkaran {
    private double diameter;
    
    public double getDiameter()
    {
        return diameter;
    }
    
    public double setDiameter(int diameter)
    {
        return this.diameter = diameter;
    }
    
    public int getJariJari()
    {
        return (int) (diameter/2);
    }
    
    public double getLuas()
    {
        return 3.14 * Math.pow(getJariJari(),2);
    }
    
    public double getKeliling()
    {
        return 2 * 3.14 *getJariJari();
    }
    public boolean cekUserInput()
    {
        if(diameter == (int)diameter)
        {
            return true;
        }else{
            return false;
        }
    }
    public void hasilPerhitungan()
    {
        System.out.println("\n====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari - jari lingkaran = "+getJariJari() +" cm");
        System.out.println("Luas lingkaran = "+getLuas()+" cm");
        System.out.println("Keliling lingkaran = "+getKeliling()+" cm");
        System.out.println("\nDeveloped by : Fachriansyah Muhammad Nur Ihsan");
    }
}
