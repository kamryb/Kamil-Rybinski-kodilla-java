package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private  ItemDao itemDao;


    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product = new Product("Prod1");
        Product product2 = new Product("Prod2");

        Item item = new Item();
        Item item2 = new Item();


        item.setProduct(product);
        item2.setProduct(product2);

        Invoice invoice = new Invoice("22", (List<Item>) item);
        invoice.getItems().add(item);
        invoice.getItems().add(item2);

        item.setInvoice(invoice);
        item2.setInvoice(invoice);


        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();


        //Then

         Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);

    }
}
