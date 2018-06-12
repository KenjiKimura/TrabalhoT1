package com.javaee.projeto1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = { "/home"})
public class HelloServlet extends HttpServlet {
	
	List<Usuario> lista  = new ArrayList<Usuario>();

	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String nome = req.getParameter("nome");
		Usuario u = new Usuario();
		u.setNome(nome);
		lista.add(u);
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet Post</title>");					
		out.println("</head>");
		
		out.println("<body>");
		out.println("<h2> Listar </h2>");
		
		for (Usuario usuario : lista) {
			out.println("<p>nome: "+ usuario.getNome() + "</p>");			
		}
			
		out.println("</body>");
		out.println("</html>");
	
		out.close();
		
	}
	
}
