package com.demo.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.OrderVO;

public interface OrderGet {
	

	    public  OrderVO getOrder(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException;
	    
	

}
