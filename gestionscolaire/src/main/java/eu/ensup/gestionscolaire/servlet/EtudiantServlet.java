package eu.ensup.gestionscolaire.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import eu.ensup.gestionscolaire.domaine.Etudiant;
import eu.ensup.gestionscolaire.service.GestionnaireService;

/**
 * Servlet implementation class EleveServlet
 */
@WebServlet("/listEtudiants")
public class EtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	GestionnaireService service = new GestionnaireService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EtudiantServlet() {
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
		List<Etudiant> result = service.listerTousEtudiants();
		System.out.println(result);

		// 1.

		HttpSession masession = request.getSession();
		masession.setAttribute("etudiantList", result);

		// 2
		String nextJSP = "/accueil.jsp";
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher(nextJSP);

		// 3
		dispatcher.forward(request, response);
		System.out.println(request.getRequestDispatcher(nextJSP));

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
