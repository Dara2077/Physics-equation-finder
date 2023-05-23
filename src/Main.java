public class Main {
    public static void main(String[] args){
        boolean stop = false;
        while (!stop){
            FirstPage test = new FirstPage();
            if (test.getStopped()){
                stop = true;
            }
        }
        System.out.println("hi");
    }
}
