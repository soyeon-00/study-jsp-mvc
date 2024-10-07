package com.app.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.ProductDAO;
import com.app.product.Action;
import com.app.product.Result;
import com.app.vo.ProductVO;

public class ProductUpdateOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		ProductDAO productDAO = new ProductDAO();
		ProductVO productVO = new ProductVO();
		
		productVO.setId(Long.parseLong(req.getParameter("id")));
		productVO.setProductName(req.getParameter("productName"));
		productVO.setProductPrice(Integer.parseInt(req.getParameter("productPrice")));
		productVO.setProductStock(Integer.parseInt(req.getParameter("productStock")));
	
		productDAO.update(productVO);
		
		result.setRedirect(true);
		result.setPath(req.getContextPath() + "/read.product?id=" + req.getParameter("id"));
		
		
		return result;
	}

}
