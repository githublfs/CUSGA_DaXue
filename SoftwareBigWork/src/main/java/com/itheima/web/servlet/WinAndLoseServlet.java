package com.itheima.web.servlet;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Car;
import com.itheima.pojo.Trade;
import com.itheima.pojo.WinAndLose;
import com.itheima.service.CarService;
import com.itheima.service.impl.CarServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/winAndLoseServlet")
public class WinAndLoseServlet extends HttpServlet {

    private CarService carService = new CarServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 接收品牌数据
        BufferedReader br = request.getReader();
        String params = br.readLine();//json字符串

        //2. 转为 trade对象
        Car car = JSON.parseObject(params, Car.class);

        //3. 调用service查询
        List<WinAndLose> winAndLoses = carService.selectWin(car);
        System.out.println(car);
        //4.转为JSON
        String jsonString = JSON.toJSONString(winAndLoses);

        //5.写数据
        response.setContentType("text/json;charest=utf-8");
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
