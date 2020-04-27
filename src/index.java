import java.util.Arrays;

public class index {
    public static void main(String[] args) {
        String[] school1={"Nam","Lan","Hoa"};
        String[] school2={"Nham","Sang","Phu"};
        String[] school3= new String[6];
        for (int i = 0; i <school1.length ; i++) {
            school3[i]=school1[i];
        }
        for (int i = school2.length; i <school3.length ; i++) {
            school3[i]=school2[i-school2.length];
        }
        String show = Arrays.toString(school3);
        System.out.println(show);

    }
}
