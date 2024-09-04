package mx.ulsa.controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mx.ulsa.modelo.Usuario;

import java.io.IOException;

public class RegisterControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterControlador() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		//Aqui se hacen las validaciones
		System.out.println(name +" "+username+"  "+password);
		
		Usuario user = new Usuario(username, password);
		
		if (user.isRegistered()) {
            response.sendRedirect(request.getContextPath() + "/vista/login.jsp");
        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
