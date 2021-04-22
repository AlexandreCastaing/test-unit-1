import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("test");
    }

    public void test2(){

    }

    public double moy(ArrayList arlst){
        double total = 0;
        for(int i=0; i < arlst.size(); i++)
            total += new Double((Integer)arlst.get(i));
        return total / arlst.size();
    }
}
