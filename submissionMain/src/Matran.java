import java.util.Scanner;

public class Matran {

    Scanner sc = new Scanner(System.in);
    private int[][] a;
    public Matran(int n) {
        a = new int[n][n];
    }
    public Matran(int[][] a){
        this.a = a;
    }
    public int[][] getMatran(){
        return a;
    }
    public int getKT(){
        return a.length;
    }
    public void input(Scanner sc){

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    public Matran tong(int[][] b) {
        int n = b.length;
        Matran c = new Matran(n);

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                c.a[i][j] = this.a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public void out(){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                System.out.print(a[i][j] +  " ");
            }
            System.out.println();
        }
    }


}
