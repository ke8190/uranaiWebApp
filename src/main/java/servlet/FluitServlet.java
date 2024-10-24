package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import ex.Fluit;

@WebServlet("/FluitServlet")
public class FluitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//「700円のいちご」を表すインスタンスの生成
		Fluit fluit = new Fluit("いちご", 700);
		
		//リクエストスコープに格納
		request.setAttribute("fluit", fluit);
		
		//fluit.jspにフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/ex/fluit.jsp");
		dispatcher.forward(request, response);
	}
}
