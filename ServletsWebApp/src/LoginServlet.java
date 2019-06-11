
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		if (user.equals("harini") && pass.equals("123")) {
			RequestDispatcher rd = request.getRequestDispatcher("./welcome.html");
			rd.forward(request, response);
		} else {
			
			RequestDispatcher rd = request.getRequestDispatcher("./login.html");
			rd.include(request, response);
			out.println("incorrect credentials. please try again");
			
		}

	}

}
