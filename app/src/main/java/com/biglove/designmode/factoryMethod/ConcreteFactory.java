package com.biglove.designmode.factoryMethod;

/**
 * Created by enid on 2016/4/28.
 */
public class ConcreteFactory extends Factory{
    @Override
    public <T extends IProduct> T createProduct(Class<T> c) {
        T product = null;

        try {
            product= (T)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }
}
