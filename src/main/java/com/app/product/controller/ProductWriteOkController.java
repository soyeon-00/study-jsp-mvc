package com.app.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.ProductDAO;
import com.app.product.Action;
import com.app.product.Result;
import com.app.vo.ProductVO;

public class ProductWriteOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		ProductDAO productDAO = new ProductDAO();
		ProductVO productVO = new ProductVO();
		Result result = new Result();
		
		System.out.println(req.getParameter("productName"));
		System.out.println(req.getParameter("productPrice"));
		System.out.println(req.getParameter("productStock"));
		
		productVO.setProductName(req.getParameter("productName"));
		productVO.setProductPrice(Integer.parseInt(req.getParameter("productPrice")));
		productVO.setProductStock(Integer.parseInt(req.getParameter("productStock")));
		
		productDAO.insert(productVO);
		
		result.setRedirect(true);
		result.setPath(req.getContextPath() + "/read.product?id=" + productDAO.selectId());
		
		return result;
	}
}
