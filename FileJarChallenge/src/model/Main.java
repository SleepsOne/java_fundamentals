package model;


import view.InvoiceView;
import vn.edu.ptit.Invoice;
import vn.edu.ptit.PaymentController;

public class Main {
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}
