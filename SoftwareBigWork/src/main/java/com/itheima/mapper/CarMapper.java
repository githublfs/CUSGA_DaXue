package com.itheima.mapper;

import com.itheima.pojo.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CarMapper {

    /**
     * 查询所有车辆
     * @return
     */
    @Select("select * from car")
    List<Car> selectAll();

    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from customer")
    List<Customer> selectCustomer();
    /**
     * 查询所有交易
     * @return
     */
    @Select("select * from Trade")
    List<Trade> selectTrade();
    /**
     * 查询最大出价
     * @return
     */
    @Select("call QuireMaxBid()")
    List<QuireMaxBid> selectQurieMaxBid();

    /**
     * 查询福特汽车
     * @return
     */
    @Select("call QuireFORD()")
    List<Car> selectFORD();

    /**
     * 添加汽车
     * @param trade
     */
    @Insert("insert into trade values(#{customerID},#{autoID},NOW(),#{bid})")
    void addTrade(Trade trade);

    /**
     * 查询福特汽车
     * @return
     */
    @Select("call WinAndLose(#{autoID})")
    List<WinAndLose> selectWin(Car car);
    /**
     * 查询中标情况
     * @return
     */
    @Select("call TradeEnd()")
    List<TradeEnd> selectTradeEnd();

    /**
     * 删除中标
     * @return
     */
    @Delete("call DeleteTradeAndCar()")
    void deleteTradeEnd();

    /**
     * 添加汽车
     * @param car
     */
    @Insert("call addCar(#{autoID},#{location},#{year},#{type},#{mileage},#{vin})")
    void addCar(Car car);

    /**
     * 添加汽车
     * @param customer
     */
    @Insert("call addCustomer(#{customerID},#{lastName},#{firstName},#{address},#{city},#{state},#{zip},#{telephone},#{emailAddress})")
    void addCustomer(Customer customer);

}
