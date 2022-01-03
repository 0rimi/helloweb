package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	//필드
	//private static final long serialVersionUID = 1L;
    
    //생성자 - 기본 생성자 생략 가능 
    
	//메소드 일반
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//코드작성
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("	<head>");
		out.println("	<meta charset=\"UTF-8\">");
		out.println("	<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("	<h1>helloworld.jsp!!!! 안녕 jsp!!!!</h1>");
		out.println("</body>");
		out.println("</html>");
		out.println("");
		out.println("");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
