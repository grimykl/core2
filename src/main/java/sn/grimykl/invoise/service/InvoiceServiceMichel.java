package sn.grimykl.invoise.service;

import sn.grimykl.invoise.entity.Invoice;
import sn.grimykl.invoise.repository.InvoiceRepository;

public class InvoiceServiceMichel {

    private static long lastNumber = 112L;
    private static InvoiceRepository invoiceRepository = new InvoiceRepository();

    public void createInvoice (Invoice invoice) {
        invoice.setNumber("INV_"+Long.toString(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
