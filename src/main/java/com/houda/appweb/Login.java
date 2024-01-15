package com.houda.appweb;

import java.io.IOException;

import com.houda.beans.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u1 = new User("houda","ben", true);
		User u2 = new User("Sajed","ben", true);
		User u3 = new User("selsabil","ben", true);
		User u4 = new User("Mimi","ben", false);
		String login = request.getParameter( "txtLogin" );
        String password = request.getParameter( "txtPassword" );
        if ( login == null ) login = "";
        if ( password == null ) password = "";
        
        //******** enregistre login et password en session ***********//
        // HttpSession comme un table on peut enregistre cle et donne 
        HttpSession session = request.getSession( true );
        session.setAttribute( "login", login );
        session.setAttribute( "password", password );
        //****** rediriger vers le vue *************//
        request.getRequestDispatcher( "/Login.jsp" ).forward( request, response );
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter( "txtLogin" );
        String password = request.getParameter( "txtPassword" );
        //on garde le password et login que nous le tapez meme on refreche le page
        
        HttpSession session = request.getSession( true );
        session.setAttribute( "login", login );
        session.setAttribute( "password", password );

        System.out.println( "recharge la page" );
        
        if ( login.trim().equals( "houda" ) && password.trim().equals( "1983" )||
        		login.trim().equals( "assil" ) && password.trim().equals( "2014" )) {
            session.setAttribute( "isConnected", true );
            request.getRequestDispatcher( "/Connected.jsp" ).forward( request, response );
        } else {
            session.setAttribute( "isConnected", false );
            request.getRequestDispatcher( "/Login.jsp" ).forward( request, response );
        }
    }
	
}