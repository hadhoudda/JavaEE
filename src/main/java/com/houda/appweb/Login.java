package com.houda.appweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
		
		String login = request.getParameter( "txtLogin" );
        String password = request.getParameter( "txtPassword" );
        if ( login == null ) login = "";
        if ( password == null ) password = "";
        
		response.setContentType("text/html");//on choisi le type text on choisir pdf image ...
		try (PrintWriter out = response.getWriter()){
			out.println( "<!DOCTYPE html>" );
            out.println( "<html>" );
            out.println( "    <head>" );
            out.println( "        <title>Veuillez vous identifier</title>" );
            out.println( "        <link rel='stylesheet' type='text/css' href='styles.css' />" );
            out.println( "    </head>" );
            out.println( "    <body>" );
            out.println( "        <h1>Titre 1</h1>" );
            out.println( "        <h2>" + new Date() + "</h2>" );
            
            out.println( "        <form method='POST' action='login'>" );
            out.println( "            <label for='txtLogin'>Login :</label>" ); 
            out.println( "            <input id='txtLogin' name='txtLogin' type='text' value='" + login + "' autofocus /><br/>" );
            out.println( "            <label for='txtPassword'>Password :</label>" ); 
            out.println( "            <input name='txtPassword' type='password' value='" + password + "' /><br/>" );
            out.println( "            <br/>" );
            out.println( "            <input name='btnConnect' type='submit' value='Se connecter' /><br/>" );
            out.println( "        </form>" );
            
            out.println( "    </body>" );
            out.println( "</html>" );
			
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter( "txtLogin" );
        String password = request.getParameter( "txtPassword" );
        //on garde le password et login que nous le tapez meme on refreche le page
         
        System.out.println( "recharge le page" );

        if ( login.equals( "houda" ) && password.equals( "1983" ) ) {
            response.setContentType( "text/html" );
            try ( PrintWriter out = response.getWriter() ) {
                  out.println( "VOUS ËTES CONNECTES" );
            }
        } else {
            doGet( request, response );
        }
    }
}