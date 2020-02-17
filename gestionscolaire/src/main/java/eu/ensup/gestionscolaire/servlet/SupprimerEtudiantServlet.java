package eu.ensup.gestionscolaire.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import eu.ensup.gestionscolaire.service.GestionnaireService;

/**
 * Servlet implementation class SupprimerEtudiant
 */
public class SupprimerEtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	GestionnaireService service = new GestionnaireService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SupprimerEtudiantServlet() {
		super();
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
		response.getWriter().append("Served at: ").append(request.getContextPath());

		// 1

		boolean suppression = service.supprimerEtudiant(1);
		HttpSession masession = request.getSession();
		masession.setAttribute("supEtudiant", suppression);
		// 2

		String nextJSP = "/accueil.jsp";
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher(nextJSP);
		// 3
		dispatcher.forward(request, response);
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
