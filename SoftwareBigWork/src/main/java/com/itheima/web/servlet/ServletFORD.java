package com.itheima.web.servlet;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Car;
import com.itheima.service.CarService;
import com.itheima.service.impl.CarServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/servletFORD")
public class ServletFORD extends HttpServlet {

    private CarService carService = new CarServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.调用service查询
        List<Car> cars = carService.selectFORD();
        //2.转为JSON
        String jsonString = JSON.toJSONString(cars);
        //3.写数据
        response.setContentType("text/json;charest=utf-8");
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
