import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] mas = {-2, 2, -4, 3, 8, 6};
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            System.out.println(Arrays.toString(mas));
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
