package eu.ensup.gestionscolaire.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.ensup.gestionscolaire.service.GestionnaireService;

/**
 * Servlet implementation class CabinetServlet
 */

//@WebServlet("/Accueil")
@WebServlet(value = { "/Accueil" })
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

		String methode = request.getMethod();
		System.out.println(methode);
		// 1. Récupérer la session actuelle assossiée à la requête
		System.out.println(request.getSession());
		// 2. Changer l'Id de cette session
		System.out.println(request.changeSessionId());
		// 3. Renvoie l'URL de la requete
		System.out.println(request.getRequestURI());

		// 4. Renvoie la chaîne de requête contenue dans l'URL
		System.out.println(request.getQueryString());

		// 5.
		System.out.println(request.getProtocol());

		// 6.
		System.out.println(request.getRemotePort());

//		RequestDispatcher dispatcher;
//		String login = request.getParameter("username");
//		String password = request.getParameter("password");
//
//		Gestionnaire gest = new Gestionnaire(login, password);
//		HttpSession masession = request.getSession();
//		masession.setAttribute("gestionnaire", gest);
//
//		if (service.seConnecter(login, password) == true) {
//			System.out.println("bienvenue");
//			response.sendRedirect("accueil.jsp");
//		} else {
//			System.out.println("wrong password or user name");
//			response.sendRedirect("error.jsp");
//		}

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
