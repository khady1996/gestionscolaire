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
 * Servlet implementation class ModifierEtudiant
 */
public class ModifierEtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	GestionnaireService service = new GestionnaireService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModifierEtudiantServlet() {
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

		boolean modification = service.modifierEtudiant(null);// etudiant
		HttpSession masession = request.getSession();
		masession.setAttribute("modifEtudiant", modification);
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
