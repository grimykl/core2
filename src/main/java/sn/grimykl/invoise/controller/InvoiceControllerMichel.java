package sn.grimykl.invoise.controller;

import sn.grimykl.invoise.entity.Invoice;
import sn.grimykl.invoise.service.InvoiceService;
import sn.grimykl.invoise.service.InvoiceServiceMichel;

import java.util.Scanner;

public class InvoiceControllerMichel {

    public void createInvoiceUsingWebForm() {
        Invoice invoice = new Invoice();
        invoice.setCustomerName("Jean-Michel WEB");
        InvoiceServiceMichel invoiceService = new InvoiceServiceMichel();
        invoiceService.createInvoice(invoice);
    }
}
