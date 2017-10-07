/**
 * 
 */
package com.lt.boot.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* <p>Title: </p>  WebServlet.java 
* <p>Description: </p> TODO
* 
* @author Administrator
* @date 2017年10月7日 上午11:07:12
 */
public class WebServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this is bean register servlet");
		PrintWriter pw = resp.getWriter();
		pw.write("this is servlet for register bean");
		pw.flush();
		pw.close();
	}

	@Override
	public void init() throws ServletException {
		super.init();
	}

}
