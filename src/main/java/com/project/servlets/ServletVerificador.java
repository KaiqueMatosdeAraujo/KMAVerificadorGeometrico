package com.project.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletVerificador
 */
@WebServlet("/ServletVerificador")
public class ServletVerificador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletVerificador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		int val1= Integer.parseInt(request.getParameter("valor1"));
		int val2= Integer.parseInt(request.getParameter("valor2"));
		int val3= Integer.parseInt(request.getParameter("valor3"));
		
		if (val1 < val2 + val3 || val2 < val1 + val3 || val3 < val1 +  val2){
			response.getWriter().println("É um Triangulo.");
			
			
			if (val1 == val2  && val1 == val3){
				response.getWriter().println("TODOS os lados iguais, portanto é Triangulo Equilatero");
				}else if (val1 == val2 || val1 == val3) {
					response.getWriter().println("Ele possui dois lados iguais, portanto é Triangulo Isosceles");
				}else
					response.getWriter().println("Ele possui todos os lados diferentes , portanto é Triangulo Escaleno");
		}

	          
		}
	}


