package Account;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Esiu on 2017-08-22.
 */
public class AccountTest {
    @Test
    public void kontoDomyslneGetIdGetNameGetBalance(){
        Account konto = new Account("1a", "KontoAAA");
        Assert.assertEquals("1a", konto.getID());
        Assert.assertEquals("KontoAAA", konto.getName());
        Assert.assertEquals(0, konto.getBalance());
    }
    @Test
    public  void kontoDomyslneCreditTest(){
        Account konto = new Account("1a", "KontoAAA");
        Assert.assertEquals(1000, konto.credit(1000));
        Assert.assertEquals(1000, konto.getBalance());
    }
    @Test
    public void kontoDomyslneDebitTest(){
        Account konto = new Account("1a", "KontoAAA");
        Assert.assertEquals(0,konto.debit(100));
    }
    @Test
    public void kontoDomyslneTransferTest(){
        Account konto = new Account("1a", "KontoAAA");
        Account konto2 = new Account("1b", "Konto222");
        Assert.assertEquals(0, konto.transferTo(konto2, 1000));
    }
    @Test
    public void kontoDomyslneStringTest() {
        Account konto = new Account("1a", "KontoAAA");
        Assert.assertEquals("Konto[id=1a,name=KontoAAA,balanse=0]", konto.toString());
    }
    @Test
    public void konto1500GetIdGetNameGetBalanse(){
        Account konto = new Account("2a", "KontoBBB",1500);
        Assert.assertEquals("2a", konto.getID());
        Assert.assertEquals("KontoBBB", konto.getName());
        Assert.assertEquals(1500, konto.getBalance());
    }
    @Test
    public void konto1500CreditTest() {
        Account konto = new Account("2a", "KontoBBB", 1500);
        Assert.assertEquals(2500, konto.credit(1000));
        Assert.assertEquals(2500, konto.getBalance());
    }
    @Test
    public void konto1500DebitTest() {
        Account konto = new Account("2a", "KontoBBB", 1500);
        Assert.assertEquals(500, konto.debit(1000));
        Assert.assertEquals(500, konto.getBalance());
    }
    @Test
    public void konto1500TransferTest() {
        Account konto = new Account("2a", "KontoBBB",1500);
        Account konto2 = new Account("1b", "Konto222");
        Assert.assertEquals(500, konto.transferTo(konto2, 1000));
        Assert.assertEquals(500, konto.getBalance());
        Assert.assertEquals(1000, konto2.getBalance());
    }
    @Test
    public void konto1500StringTest(){
        Account konto = new Account("2a", "KontoBBB",1500);
        Assert.assertEquals("Konto[id=2a,name=KontoBBB,balanse=1500]",konto.toString());
    }
}
