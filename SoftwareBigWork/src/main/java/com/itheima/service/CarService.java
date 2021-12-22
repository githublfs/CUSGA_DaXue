package com.itheima.service;

import com.itheima.pojo.*;

import java.util.List;

public interface CarService {

    /**
     * 查询福特汽车
     * @return
     */
    List<Car> selectFORD();
    /**
     * 用户添加订单
     * @param trade
     */
    void addTrade(Trade trade);
    /**
     * 用户添加订单
     * @param car
     */
    void addCar(Car car);
    /**
     * 用户添加订单
     * @param customer
     */
    void addCustomer(Customer customer);

    /**
     * 查询所有汽车
     * @return
     */
    List<Car> selectAll();
    /**
     * 查询最大出价
     * @return
     */
    List<QuireMaxBid> selectQurieMaxBid();
    /**
     * 查询所有用户
     * @return
     */
    List<Customer> selectCustomer();
    /**
     * 查询所有订单
     * @return
     */
    List<Trade> selectTrade();

    /**
     * 查询赢家
     * @return
     */
    List<WinAndLose> selectWin(Car car);

    /**
     * 查询中标情况
     * @return
     */
    List<TradeEnd> selectTradeEnd();

    /**
     * 删除过期中标
     * @return
     */
    void deleteTradeEnd();

}
