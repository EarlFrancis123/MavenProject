<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
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
  <h1>ABOUT US</h1>

    <ul >
        <li>
            <s:url var="Home" action="/"/>
            <s:a href = "%{Home}">Home</s:a>
        </li>
        <li>
          <s:url var="About" action="About"/>
          <s:a href = "%{About}">About</s:a>
      </li>
        <li> 
          <s:url var="OurServices" action="OurServices"/>
          <s:a href = "%{OurServices}">OurServices</s:a>
        </li>
        <li>
          <s:url var="ContactUs" action="ContactUs"/>
          <s:a href = "%{ContactUs}">ContactUs</s:a>
        </li>
      
    </ul>
    <!--<h1><s:property value = "name"></s:property></h1>-->
 <!-- <h1><s:property value = "Descrive"></s:property></h1>-->
  <!--<h1><s:property value = "IntroductionMessage"></s:property></h1>-->
  <h1><s:property value = "Description"></s:property></h1>
  <s:form action = "About" namespace = "/example ">
    <s:textfield key="username"/>
    <s:submit name = "submit"/>
<h1><s:property value = "username"/></h1>
    </s:form>
</body>
</html>
