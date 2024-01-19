package vn.edu.ptit;

import java.util.ArrayList;
import java.util.Scanner;

public class PaymentController {
    private Invoice invoice;
    private static Scanner sc = new Scanner(System.in);

    public PaymentController(){
//        String msv, hoten, soMonHoc,maMon, tenMon, soTinchi, SoQD, tenQD, donGia;
        invoice = new Invoice(new Rule());
        invoice.setSt(new Student());
        invoice.setAlSubject(new ArrayList<>());
        invoice.setRule(new Rule());
//        invoice
//        invoice
        invoice.getSt().setCode(sc.nextLine());
        invoice.getSt().setName(sc.nextLine());
        int soMonHoc_int = Integer.parseInt(sc.nextLine());
        ArrayList <Subject> tmp = new ArrayList<>();
        for (int i  = 0; i < soMonHoc_int; i++){
            String tmp1 = "";
            for (int j = 0; j < 3; j++){
                tmp1 += sc.nextLine() + "/";

            }
            String[] tmp2 = tmp1.split("/");
            tmp.add(new Subject(tmp2[1], tmp2[0], Integer.parseInt(tmp2[2])));
        }
        invoice.setAlSubject(tmp);
        invoice.getRule().setCode(sc.nextLine());
        invoice.getRule().setName(sc.nextLine());
        invoice.getRule().setCreditPrice(Double.parseDouble(sc.nextLine()));
        invoice.setAmount(TotalCal());
    }
    public double TotalCal(){
        double sum = 0;
        double gia = invoice.getRule().getCreditPrice();
        for (Subject x : invoice.getAlSubject()){
            sum += x.getCredit() * gia;

        }
        return sum;

    }

    public PaymentController(Invoice invoice) {
        this.invoice = invoice;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
