/**
 * 
 */
package com.lt.boot.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
*Title:  AnnotateServlet.java 
* Description:  TODO
* 
* @author Administrator
* @date 2017年10月7日 上午11:22:00
 */
@WebServlet(urlPatterns="/annotate/*")
public class AnnotateServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this is annotate servlet");
		PrintWriter pw = resp.getWriter();
		pw.write("this is annotate servlet by annotateServlet");
		pw.flush();
		pw.close();
	}

	@Override
	public void init() throws ServletException {
		super.init();
	}

}
