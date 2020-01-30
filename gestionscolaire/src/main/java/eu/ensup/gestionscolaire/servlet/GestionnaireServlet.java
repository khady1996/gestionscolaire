package eu.ensup.gestionscolaire.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.ensup.gestionscolaire.service.GestionnaireService;

/**
 * Servlet implementation class CabinetServlet
 */

@WebServlet("/Accueil")
public class GestionnaireServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	GestionnaireService service = new GestionnaireService();

	/**
	 * Default constructor.
	 */
	public GestionnaireServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		RequestDispatcher dispatcher;
		String login = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(login);
		if (service.seConnecter(login, password) == true) {
			System.out.println("bienvenue");
			response.sendRedirect("accueil.jsp");
		} else {
			System.out.println("wrong password or user name");
			response.sendRedirect("error.jsp");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
