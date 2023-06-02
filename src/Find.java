import java.util.*;

public class Find{
    private ArrayList<String> equations; //Array that contains the equations
    private ArrayList<String> finalEquations;

    public Find(){
        equations = new ArrayList<String>(); //Initializing the arraylist
        equations.add("Δx = vit + 1/2at^2");
        equations.add("vf = vi + at");
        equations.add("vf^2 = vi^2 + 2aΔx");
        equations.add("p = mv");
        equations.add("J = F-t");
        equations.add("K = 1/2mv^2");
        equations.add("U = mgh");
        equations.add("ΔE = Fdcosθ = W");
        equations.add("ac = v^2/r");
        equations.add("Δθ = ⍵it + 1/2⍺t^2");
        equations.add("Δ⍵ = ⍺-t");
        equations.add("T = 2\uD835\uDF0B/⍵");
        equations.add("x = Acos(2\uD835\uDF0Bft)");
        equations.add("a = \uD835\uDF0Fnet/I");
        equations.add("\uD835\uDF0F = Frsinθ");
        equations.add("L = I⍵");
        equations.add("ΔL = \uD835\uDF0Ft");
        equations.add("|Fs| = k|x|");
        equations.add("Us = 1/2kx^2");
        equations.add("Ts = 2\uD835\uDF0B√(m/k)");
        equations.add("Tp = 2\uD835\uDF0B√(t/g)");
        equations.add("Fg = (Gm1m2)/(r^2)");
        equations.add("Fg = mg");
        equations.add("Ug = -(Gm1m2)/r");
        equations.add("K = 1/2I⍵^2");
        equations.add("Δx = v-t");
        equations.add("Wnet = ΔK");
        equations.add("⍵f^2 = ⍵i^2 + 2⍺Δθ");
        equations.add("v = r⍵");
        equations.add("a = r⍺");
        equations.add("ac = r⍵^2");
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
        return ret;
    }

}