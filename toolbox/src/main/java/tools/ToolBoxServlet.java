package tools;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/toolbox.do")
public class ToolBoxServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private Tools tools = new Tools();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String sort = "";
		
		
		if (request.getParameterMap().containsKey("sort")) {
			sort = request.getParameter("sort");
        }
		if(sort.equals("name")){
			tools.sortByName();
		}
		if(sort.equals("category")){
			tools.sortByCategory();
		}
		
		if (request.getParameterMap().containsKey("delete")) {
			tools.delete(request.getParameter("delete"));
        }
		
		request.setAttribute("allTools", tools.toolList());
		request.getRequestDispatcher("/WEB-INF/jspViews/mainPage.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameterMap().containsKey("addTool") && !request.getParameter("addTool").equals("") && !request.getParameter("addTool").equals("name")) {
				
				String addName = request.getParameter("addTool");
				if(request.getParameterMap().containsKey("addCategory") && !request.getParameter("addCategory").equals("")  && !request.getParameter("addCategory").equals("category")){
					String addCat = request.getParameter("addCategory");
					tools.add(addName, addCat);
				}else{
					tools.add(addName);
				}	
		}							
		if(request.getParameterMap().containsKey("editId") && !request.getParameter("editId").equals("") && !request.getParameter("editId").equals("id")){
			
				String editId = request.getParameter("editId");
				if (request.getParameterMap().containsKey("editName") && !request.getParameter("editName").equals("") && !request.getParameter("editName").equals("name")) {
					String editName = request.getParameter("editName");
					if(request.getParameterMap().containsKey("editCategory") && !request.getParameter("editCategory").equals("") && !request.getParameter("editCategory").equals("category")){
						String editCategory = request.getParameter("editCategory");
						tools.editNC(editId, editName, editCategory);
					}else{
						tools.editN(editId, editName);
					}
				}else{
					if(request.getParameterMap().containsKey("editCategory") && !request.getParameter("editCategory").equals("") && !request.getParameter("editCategory").equals("category")){
						String editCategory = request.getParameter("editCategory");
						tools.editC(editId, editCategory);
					}
				}				
		}
	
		request.setAttribute("allTools", tools.toolList());
		response.sendRedirect("/toolbox.do");
	}

}
