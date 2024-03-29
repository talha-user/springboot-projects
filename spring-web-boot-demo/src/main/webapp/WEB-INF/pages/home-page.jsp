<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!Doctype html>
<html>
<head>
<title>My spring WebMVC Home</title>
</head>
<body>
<h3>Hello world!</h3>
<form>
  <label>UserName:
  <input type="text" name="unm" required>
  </label>
  <button>OK</button>
 
 
  
  <c:if test="${message ne null }">
  <h4>${message}</h4>
  </c:if>
  
</form>
</body>
</html>
