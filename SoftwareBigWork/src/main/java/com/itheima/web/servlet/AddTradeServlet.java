package com.itheima.web.servlet;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Car;
import com.itheima.pojo.Trade;
import com.itheima.service.CarService;
import com.itheima.service.impl.CarServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/addTradeServlet")
public class AddTradeServlet extends HttpServlet {

    private CarService carService = new CarServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 接收品牌数据
        BufferedReader br = request.getReader();
        String params = br.readLine();//json字符串

        //转为 trade对象
        Trade trade = JSON.parseObject(params, Trade.class);
        System.out.println(trade);

        //2. 调用service添加
        carService.addTrade(trade);
        System.out.println(trade);

        //3. 响应成功的标识
        response.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
