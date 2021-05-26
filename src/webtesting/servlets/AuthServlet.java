package webtesting.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import webtesting.testes.ValidationData;

/**
 * Servlet implementation class AuthServlet
 */
@WebServlet("/AuthServlet")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private ValidationData validation;
       private String erreur="";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthServlet() {
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
	//	doGet(request, response);
		validation=new ValidationData();
		String login=request.getParameter("login");
		String mdp=request.getParameter("mdp");
		RequestDispatcher rd= getServletContext().getRequestDispatcher("/index.jsp");
		
		if(!validation.verif_login(login))
		{
			erreur="erreur de login";
			request.setAttribute("erreur", erreur);
			rd.forward(request, response);
		}
		else if((!validation.verif_mdp(mdp)))
		{
			erreur="mot de passe incorrecte";
			request.setAttribute("erreur", erreur);
			rd.forward(request, response);
		}
		else
		{
			response.sendRedirect("Enfant.jsp");
		}
		
	}

}
