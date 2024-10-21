package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/InquiryServlet")
public class InquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
			
		String name = request.getParameter("name");
		String qtype = request.getParameter("qtype");
		String body = request.getParameter("body");
		
		String errorMsg = "";
		if (name == null || name.length() == 0) {
			errorMsg += "名前が入力されていません。<br>";
		}
		if (qtype == null || qtype.length() == 0) {
			errorMsg += "お問い合わせの種類が選択されていません。<br>";
		} else {
			switch (qtype) { // 修正: switch 文を使用
            	case "company": qtype = "会社について"; break;
            	case "product": qtype = "製品について"; break;
            	case "support": qtype = "アフターサポートについて"; break;
			}
		}
		
		String msg = "お名前：" + name + "<br>" +
                "お問い合わせの種類：" + qtype + "<br>" +
                "お問い合わせ内容：<br>" + body + "<br><br>" +
                "以上の内容でよろしいですか？";
		if (errorMsg.length() != 0) {
			msg = errorMsg;
		}
		
		response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>お問い合わせ内容の確認</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>" + msg + "</p>");
        out.println("</body>");
        out.println("</html>");
	}
}
