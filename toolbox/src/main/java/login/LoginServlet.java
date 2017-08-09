package login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/jspViews/login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		UserValidation uv = new UserValidation();
		boolean valid = uv.isUserValid(login, password);
		if(valid){	
			response.sendRedirect("/toolbox.do");
		}else{	
			request.setAttribute("error", "wrong login or password, try again");
			request.getRequestDispatcher("/WEB-INF/jspViews/login.jsp").forward(request, response);
		}
	}
}
	


