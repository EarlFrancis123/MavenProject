<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
  <style>
        ul {
          list-style-type: none;
          margin: 0;
          padding: 0;
          overflow: hidden;
          background-color: #333;
        }
        
        li {
          float: left;
        }
        
        li a {
          display: block;
          color: white;
          text-align: center;
          padding: 14px 16px;
          text-decoration: none;
        }
        
        li a:hover {
          background-color: #111;
        }
            </style>
</head>


<body>

    <h1>My first Tomcat Activity</h1>
    <ul >
        <li>
            <s:url var="Home" action="/"/>
            <s:a href = "%{Home}">Home</s:a>
        </li>
        <li>
          <s:url var="About" action="example/About"/>
          <s:a href = "%{About}">About</s:a>
      </li>
        <li> 
          <s:url var="OurServices" action="example/OurServices"/>
          <s:a href = "%{OurServices}">OurServices</s:a>
        </li>
        <li>
          <s:url var="ContactUs" action="example/ContactUs"/>
          <s:a href = "%{ContactUs}">ContactUs</s:a>
        </li>
      
    </ul>
</body>
</html>
