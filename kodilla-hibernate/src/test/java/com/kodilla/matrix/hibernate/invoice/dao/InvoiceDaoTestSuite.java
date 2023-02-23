package com.kodilla.matrix.hibernate.invoice.dao;

import com.kodilla.matrix.hibernate.invoice.Invoice;
import com.kodilla.matrix.hibernate.invoice.Item;
import com.kodilla.matrix.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoAndProductDaoSaveWithItems() {
        //Given
        Item item1 = new Item(new BigDecimal(121.99),1,new BigDecimal(121.99));
        Item item2 = new Item(new BigDecimal(14.49), 3,new BigDecimal(43.47));
        Item item3 = new Item(new BigDecimal(2.99),10,new BigDecimal(20.99));
        Item item4 = new Item(new BigDecimal(99.01),1,new BigDecimal(99.01));
        Product product = new Product("First Product");
        Invoice invoice = new Invoice("0001");

        product.getItems().add(item1);
        product.getItems().add(item2);
        product.getItems().add(item4);

        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product);
        item4.setProduct(product);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //When
        productDao.save(product);
        long product_id = product.getId();
        invoiceDao.save(invoice);
        long invoice_id = invoice.getId();

        //Then
        assertNotEquals(0,product_id);
        assertNotEquals(0,invoice_id);

        //CleanUp
        try {
            productDao.deleteById(product_id);
            invoiceDao.deleteById(invoice_id);
        }catch (Exception e) {
        //       do nothing
        }
    }

}
