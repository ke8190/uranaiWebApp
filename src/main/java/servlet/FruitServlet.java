package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import ex.Fruit;

@WebServlet("/FruitServlet")
public class FruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//「700円のいちご」を表すインスタンスの生成
		Fruit fruit = new Fruit("いちご", 700);
		
		//リクエストスコープに格納
		//request.setAttribute("fruit", fruit);
		
		//セッションスコープに格納
		//HttpSession session = request.getSession();
		//session.setAttribute("fruit", fruit);
		
		//アプリケーションスコープに格納
		ServletContext application = this.getServletContext();
		application.setAttribute("fruit", fruit);
		
		//fluit.jspにフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/ex/fruit.jsp");
		dispatcher.forward(request, response);
	}
}
