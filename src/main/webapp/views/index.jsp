<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 1/3/2019
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator</title>
  </head>
  <body>
  <h1>Caculator</h1>
  <form  id="form" action="processCaculation" method="post">
    <input name="number1" type="text" >
    <input name="number2" type="text" >
    <p>
    </p>
    <select name="operation">
      <option value="Add" selected>Add(+)</option>
      <option value="Sub" >Sub(-)</option>
      <option value="Mul" >Mul(*)</option>
      <option value="Div" >Div(/)</option>
    </select>
    <input type="submit" value="Calculate">
  </form>
  <h2>${result}</h2>
  </body>
</html>
