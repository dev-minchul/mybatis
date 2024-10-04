package com.app.servlet;
import java.io.Console;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.ProductDAO;
import com.app.vo.ProductVO;

public class Update extends HttpServlet{
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.setCharacterEncoding("UTF-8");
      resp.setContentType("text/html; charset-utf-8;");
      
      ProductDAO productDAO = new ProductDAO();
      ProductVO productVO = new ProductVO();
      
      productVO.setId(Long.parseLong(req.getParameter("id")));
      productVO.setProductName(req.getParameter("productName"));
      productVO.setProductPrice(Integer.parseInt(req.getParameter("productPrice")));
      productVO.setProductStock(Integer.parseInt(req.getParameter("productStock")));
//      System.out.println(req.getParameter("productName"), Integer.parseInt(req.getParameter("productPrice")), (req.getParameter("productStock"))  );
      productDAO.update(productVO);
      
      
      
   }
   
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doGet(req, resp);
   }
}
