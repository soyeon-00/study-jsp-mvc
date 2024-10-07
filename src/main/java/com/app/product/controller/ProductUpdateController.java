package com.app.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.ProductDAO;
import com.app.product.Action;
import com.app.product.Result;
import com.app.vo.ProductVO;

public class ProductUpdateController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		ProductDAO productDAO = new ProductDAO();
		Long id = Long.parseLong(req.getParameter("id"));
		
		ProductVO product = productDAO.select(id).orElseThrow(() -> {
			throw new RuntimeException();
		});
		
		req.setAttribute("product", product);
		result.setPath("update.jsp");
		
		return result;
	}

}
