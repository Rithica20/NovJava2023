package inheritance_practice;

public class HospitalTest {
    public static void main(String[] args) {

        Hospital h = new Hospital();
        h.CCUunit();// Hospital----ccu
        h.ICU();//Hospital----ICU
        h.covidCare();//Hospital----covidCare
        // hospital own methods

        Max m = new Max();
        m.PCU();
        m.CCUunit();
        m.ICU();//max own methods

        //Top casting
        Hospital hos = new Max();
        hos.covidCare();//max covidcare
        hos.ICU();//max icu
        hos.CCUunit();//max ccu//Hospital own method and child's overridden method

        Hospital hos1= new Apollo();
        hos1.CCUunit();//Apollo CCU
        hos1.ICU();//Apollo ICU
        hos1.covidCare();//hospital covidcare //Hospital own method and child's overridden method

        Hospital hos2 = new Fortis();
        hos2.ICU();//Fortis icu
        hos2.CCUunit();// Fortis CCU
        hos2.covidCare();//Hospital covidcare

        //down casting

        Fortis f = (Fortis)new Hospital();
        f.SICU();
        f.CCUunit();
        //CLassCastException at run time
    }
}
