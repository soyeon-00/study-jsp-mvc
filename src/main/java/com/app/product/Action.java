package com.app.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException;

}
