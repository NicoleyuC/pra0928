import java.util.Scanner;

public class work0928 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chScore = sc.nextInt();
        if (chScore > 100 || chScore < 0 ){
            System.out.println("輸入資料超出範圍（0~100）");
        }else{
            if (chScore >= 90){
                System.out.println("國文 等地 為: A");
            }else {
                if (chScore >= 80){
                    System.out.println("國文 等地 為: B");
                }else {
                    System.out.println("國文 等地 為: C");
                }
            }
        }
    }
}
