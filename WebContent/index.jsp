<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.mysql.jdbc.Driver" %>

<%

Class.forName("com.mysql.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/relationanalayser", "root" , "mysql"); 

session.setAttribute("Con", con);

%>

<html>
    <head>
        <meta charset="utf-8" />
        <title>Login</title>
        
        <link rel="stylesheet" type="text/css" href="css/main.css"></link>
    </head>
    
    <body>
<header class="groove">
<h1 align="center">About our Website</h1>
<h2>Our website will help you to connect with the people who are like you. It works in simple manner. </h2>

<h4 class="steps"> <i>
<ul>
<li>Log in with your Facebook account</li>
<li>Answer our simple questions with your interest</li>
<li>Compare with other people who has maximum percentage with you</li>
<li>Connect and enjoy</li>
</ul>
</i></h4>
</header>
        <div id="main">
        	
        	<h1>Sign up!</h1>
        	
        	
 <div id="fb-root"></div>
<script>
  window.fbAsyncInit = function() {
  FB.init({
    appId      : 415379798504901,
    status     : true, // check login status
    cookie     : true, // enable cookies to allow the server to access the session
    xfbml      : true  // parse XFBML
  });

  FB.Event.subscribe('auth.authResponseChange', function(response) {
    if (response.status === 'connected') {
      testAPI();
    } else if (response.status === 'not_authorized') {
      FB.login();
    } else {
      FB.login();
    }
  });
  };

  // Load the SDK asynchronously
  (function(d){
   var js, id = 'facebook-jssdk', ref = d.getElementsByTagName('script')[0];
   if (d.getElementById(id)) {return;}
   js = d.createElement('script'); js.id = id; js.async = true;
   js.src = "//connect.facebook.net/en_US/all.js";
   ref.parentNode.insertBefore(js, ref);
  }(document));

  // Here we run a very simple test of the Graph API after login is successful. 
  // This testAPI() function is only called in those cases. 
  function testAPI() {
    console.log('Welcome!  Fetching your information.... ');
    FB.api('/me', function(response) {
      console.log('Good to see you, ' + response.name + '.');
	alert ("Welcome " + response.name + ": Your UID is " + response.id);
	
	var request = $.ajax({
	  url: "adduser.do",
	  type: "POST",
	  data: { name : response.name , id : response.id },
	  dataType: "html"
	});
	 
	request.done(function( msg ) {
	  alert("Inserted");
	});
	
    });
  }


</script>

<!--
  Below we include the Login Button social plugin. This button uses the JavaScript SDK to
  present a graphical Login button that triggers the FB.login() function when clicked. -->

<div class="fb-login-button" data-max-rows="5" data-size="xlarge" data-show-faces="false" data-auto-logout-link="false">Log In with Facebook</div>

        </div>
        
        <footer>
	        
            <h2 class="fots">The best place to engage with liked minded.</h2>
        </footer>
        
        <!-- JavaScript includes - jQuery, the complexify plugin and our own script.js -->
		<script src="js/jquery.min.js"></script>

		     
    </body>
</html>
