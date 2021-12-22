package com.itheima.service.impl;

import com.itheima.mapper.CarMapper;
import com.itheima.pojo.*;
import com.itheima.service.CarService;
import com.itheima.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class CarServiceImpl implements CarService {
    //1. 创建SqlSessionFactory 工厂对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Car> selectAll() {
        //1. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //2. 获取CarMapper
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        //3. 调用方法
        List<Car> cars = mapper.selectAll();
        //4. 释放资源
        sqlSession.close();
        return cars;
    }

    @Override
    public List<QuireMaxBid> selectQurieMaxBid() {
        //1. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //2. 获取CarMapper
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        //3. 调用方法
        List<QuireMaxBid> quireMaxBids = mapper.selectQurieMaxBid();
        //4. 释放资源
        sqlSession.close();
        return quireMaxBids;
    }

    @Override
    public List<Customer> selectCustomer() {
        //1. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //2. 获取CarMapper
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        //3. 调用方法
        List<Customer> customers = mapper.selectCustomer();
        //4. 释放资源
        sqlSession.close();
        return customers;
    }

    @Override
    public List<Trade> selectTrade() {
        //1. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //2. 获取CarMapper
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        //3. 调用方法
        List<Trade> trades = mapper.selectTrade();
        //4. 释放资源
        sqlSession.close();
        return trades;
    }

    @Override
    public List<WinAndLose> selectWin(Car car) {
        //1. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //2. 获取CarMapper
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        //3. 调用方法
        List<WinAndLose> winAndLoses = mapper.selectWin(car);
        //4. 释放资源
        sqlSession.close();
        return winAndLoses;
    }

    @Override
    public List<TradeEnd> selectTradeEnd() {
        //1. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //2. 获取CarMapper
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);

        //3. 调用方法
        List<TradeEnd> tradeEnds = mapper.selectTradeEnd();

        //4. 释放资源
        sqlSession.close();

        return tradeEnds;
    }

    @Override
    public void deleteTradeEnd() {
        //1. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //2. 获取CarMapper
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);

        //3. 调用方法
        mapper.deleteTradeEnd();
        //4. 提交事务
        sqlSession.commit();

        //4. 释放资源
        sqlSession.close();

    }


    @Override
    public void addTrade(Trade trade) {
        //1. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //2. 获取CarMapper
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        //3. 调用方法
        mapper.addTrade(trade);
        //4. 提交事务
        sqlSession.commit();
        //4. 释放资源
        sqlSession.close();
    }

    @Override
    public void addCar(Car car) {
        //1. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //2. 获取CarMapper
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        //3. 调用方法
        mapper.addCar(car);
        //4. 提交事务
        sqlSession.commit();
        //4. 释放资源
        sqlSession.close();
    }

    @Override
    public void addCustomer(Customer customer) {
        //1. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //2. 获取CarMapper
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        //3. 调用方法
        mapper.addCustomer(customer);
        //4. 提交事务
        sqlSession.commit();
        //4. 释放资源
        sqlSession.close();
    }


    @Override
    public List<Car> selectFORD() {
        //1. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //2. 获取CarMapper
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        //3. 调用方法
        List<Car> cars = mapper.selectFORD();
        //4. 释放资源
        sqlSession.close();
        return cars;
    }

}
