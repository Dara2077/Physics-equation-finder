import java.util.*;

public class Find{
    private ArrayList<String> equations; //Array that contains the equations
    private ArrayList<String> finalEquations;

    public Find(){
        equations = new ArrayList<String>(); //Initializing the arraylist
        equations.add("Dx = vit + 1/2at^2");
        equations.add("vf = vi + at");
        equations.add("vf^2 = vi^2 + 2aDx");
        equations.add("p- = mv-");
        equations.add("Dp = F-t");
        equations.add("K = 1/2mv^2");
        equations.add("DU = mgDh");
        equations.add("DE = Fdcosth = W");
        equations.add("ac = v^2/r");
        equations.add("Dx* = wi + 1/2a*t^2");
        equations.add("Dw = at");
        equations.add("T = 2pi/w");
        equations.add("x = Acos(2pift)");
        equations.add("a- = T*net/I");
        equations.add("T* = Fr");
        equations.add("L = Iw");
        equations.add("DL = T*t");
        equations.add("|Fs| = k|x-|");
        equations.add("Us = 1/2kx^2");
        equations.add("Ts = 2pi√(mk)");
        equations.add("Tp = 2pi√(t/g)");
        equations.add("|Fg-| = Gm1m2/r^2");
        equations.add("|Fg-| = mg-");
        equations.add("Ug = Gm1m2/r^2");
        equations.add("K = 1/2Iw^2");
        equations.add("Dx = v-t");
        equations.add("Wnet = DK");
        equations.add("wf^2 = wi^2 + 2aDa*");
        equations.add("v = rw");
        equations.add("a = ra*");
        equations.add("ac = rw2");
    }

    public ArrayList<String> applicableEquations(ArrayList<String> vars) {
        ArrayList<String> ret = new ArrayList<String>();
        for (String equation: equations){
            boolean exists = true;
            for (String var : vars) {
                if (equation.indexOf(var) == -1) {
                    exists = false;
                }
            }
            if (exists){
                ret.add(equation);
            }
        }
        finalEquations = ret;
        print();
        return ret;
    }

    private void print(){
        System.out.println();
        for (int i = 0; i < finalEquations.size(); i ++){
            int num = i + 1;
            System.out.println(num + ". " + finalEquations.get(i));
        }
    }
}