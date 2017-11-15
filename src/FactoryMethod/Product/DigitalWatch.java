package FactoryMethod.Product;

import java.util.Date;

/**
 * Created by dvsta on 15.11.2017.
 */
public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
