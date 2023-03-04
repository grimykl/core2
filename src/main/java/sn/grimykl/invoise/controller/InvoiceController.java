package sn.grimykl.invoise.controller;

import sn.grimykl.invoise.entity.Invoice;
import sn.grimykl.invoise.service.InvoiceService;
import sn.grimykl.invoise.service.InvoiceServiceMichel;

import java.util.Scanner;

public class InvoiceController {

    public void createInvoiceUsingConsole() {
        String next = "";
        do {
            System.out.println( "What is the customer name?" );
            Scanner sc = new Scanner(System.in);
            String customerName = sc.nextLine();
            Invoice invoice = new Invoice();
            invoice.setCustomerName(customerName);
            InvoiceService invoiceService = new InvoiceService();
            invoiceService.createInvoice(invoice);
            System.out.println( "Do you want to create another one? Y/N" );
            sc = new Scanner(System.in);
            next = sc.nextLine();
        } while (next.equalsIgnoreCase("Y"));
    }
}
