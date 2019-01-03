package com.itheima.proxy;

public interface IProducer {
    /**
     * 销售
     * @param money
     */
    void saleProduct(float money);

    /**
     * 售后
     * @param money
     */
    void afterProduct(float money);
}
