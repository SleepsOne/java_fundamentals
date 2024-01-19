public class DaThuc {
    private String dathuc;
    private String[] str;
    private int[] a = new int[10000];

    public DaThuc() {

    }
    public DaThuc(String dt){
        StringBuilder dathuc = new StringBuilder(dt);
        for (int i = 0; i < 10000; i++) a[i] = 0;
        for (int i = 0; i < dathuc.length(); i++){
            char c = dathuc.charAt(i);
            if (!Character.isDigit(c) && c != '+'){
                dathuc.setCharAt(i, dathuc.charAt(i)) = " ";
            }
        }
        this.dathuc = dathuc.toString();
        this.str = this.dathuc.split("\\+");
        // 3 8
        // 7 2
        // 4 0

        String[] so = null;
        for (String x : str){
            so = x.split("\\s+");
            int val = Integer.parseInt(so[0]);
            int i = Integer.parseInt(so[1]);
            a[i] = val;
        }

    }

    public String getDathuc() {
        return dathuc;
    }

    public void setDathuc(String dathuc) {
        this.dathuc = dathuc;
    }

    public String[] getStr() {
        return str;
    }

    public void setStr(String[] str) {
        this.str = str;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public DaThuc cong(DaThuc p){
        DaThuc ans = new DaThuc();

        for (int i = 0; i < 10000; i++){
            ans.a[i] = this.a[i] + p.a[i];
        }

        return ans;
    }

    public void out(){
        String[] res = null;
        int ind = 0;
        for (int i = 9999; i >= 0; i--){

            if (this.a[i] != 0){
//                assert res != null;
                res[ind--] = String.format("%d*x^%d", a[i], i);
            }
        }
        for (int i = 0; i< res.length; i++){
            System.out.println(res[i]);
            if (i != res.length - 1){
                System.out.print("+");
            }
        }

    }
}
