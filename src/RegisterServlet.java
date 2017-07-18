

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customTools.DbUser;
import model.*;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String motto = request.getParameter("motto");
		String email = request.getParameter("email");
		
		Bhuser newUser = new Bhuser();
		newUser.setUseremail(email);
		newUser.setUsername(name);
		newUser.setMotto(motto);
		newUser.setUserpassword(password);
		
		DbUser.insert(newUser);
		
		request.setAttribute("message", "Your user has been created! Return to the login page to sign in.");
		getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
		//response.sendRedirect(request.getContextPath() + "/register.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
