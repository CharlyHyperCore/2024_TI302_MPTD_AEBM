package unidad1.proglineal;

public class NumeroOptTest {
    
    public static void main(String[] args) {
        int [] arr = {1, -3, -6, 9, 0, 1, -2};
        int [] arr2 = {1, 2, 3};
        
        double [] arrDiv1 ={1, 2, 0, 1, -3};
        double [] arrDiv2 ={1, 0,  -6, 8,-4};
        NumeroOpt nop = new NumeroOpt(arr);
        DivisionCrazy dc = new DivisionCrazy(arrDiv1, arrDiv2);
        
        dc.resolver();
        dc.print();
        //System.out.println("nop: " + nop.calcularCP());

//        nop.setArreglo(arr2);
//        System.out.println("nop: " + nop.calcularCP());
    }
    
}
