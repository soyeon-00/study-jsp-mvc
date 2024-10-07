package com.app.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.ProductDAO;
import com.app.product.Action;
import com.app.product.Result;

public class ProductReadController implements Action{

   @Override
   public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
      Result result = new Result();
      ProductDAO productDAO = new ProductDAO();
      
      req.setAttribute("product", productDAO.select(Long.parseLong(req.getParameter("id"))).orElseThrow(() -> {
         throw new RuntimeException();
      }));
      
      result.setPath("read.jsp");

      return result;
   }
   
}