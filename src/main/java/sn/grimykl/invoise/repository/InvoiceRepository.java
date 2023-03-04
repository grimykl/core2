package sn.grimykl.invoise.repository;

import sn.grimykl.invoise.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository {

    private static final List<Invoice> invoices = new ArrayList<>();

    public void create(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("Invoice added with number "+invoice.getNumber()+" for customer "+invoice.getCustomerName()+".");
    }
}
