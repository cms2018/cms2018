package com.heyrahul.cms2018.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heyrahul.cms2018.dbase.Dbs;
import com.heyrahul.cms2018.model.User;

public class UserControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		int user_id = Integer.parseInt(request.getParameter("user_id"));

		User user = new User();
		Dbs dbs = new Dbs();
		user = dbs.getUSer(user_id);
		PrintWriter out = response.getWriter();
		out.print(user.getUser_email());
	}

}
