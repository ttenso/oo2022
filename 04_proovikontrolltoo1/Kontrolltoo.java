import java.util.ArrayList;
import java.util.List;

public class Kontrolltoo {
    public static void main(String[] args) {
        double k = keskmiseLeidmine(1,2,3);
        System.out.println(k);
    }

    public static double keskmiseLeidmine(
            int arv1, int arv2, int arv3
    ){
        return (arv1+arv2+arv3)/3.0;
    }
    public static List<Double> libisevKeskmine(List<Integer> integers){
        List<Double> doubles = new ArrayList<>();
        for (int i = 0; i < integers.size()-2; i++) {
            double uusNumber = (
                    integers.get(i)+
                            integers.get(i+1)+
                            integers.get(i+2)
                )/3.0;
            doubles.add(uusNumber);
        }
        return doubles;
    }

}
