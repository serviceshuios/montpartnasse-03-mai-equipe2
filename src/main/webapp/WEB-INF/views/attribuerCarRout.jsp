<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
    href="<%=request.getContextPath()%>/resources/css/style.css">
<title>LISTES ROUTIERES</title>
</head>
<body>
    <h2>CRUD ROUTIERES</h2>
    <div>
        <f:form modelAttribute="routiere" method="POST" action="attribuerRoutiere">
            Routiere : <select name="idCargaison"> 
				               <optgroup>
				                   <option value="0">---</option>  
				                   <c:if test="${! empty routieres}">    
				                       <c:forEach items="${routieres}" var="a">                   
				                          <option value="${a.idCargaison}"> 
				                              <c:out value="${a.nomCargaison},${a.depart},${a.destination},${a.immatriculation},${a.peage}"></c:out> 
				                          </option>      
				                       </c:forEach>                    
				                   </c:if>               
				               </optgroup>             
				         </select>
			 SocieteTransport : <select name="idSociete"> 
				               <optgroup>
				                   <option value="0">---</option>  
				                   <c:if test="${! empty societes}">    
				                       <c:forEach items="${societes}" var="s">                   
				                          <option value="${s.idSociete}"> 
				                              <c:out value="${s.nomSociete},${s.numSiret},${s.dateCreation}"></c:out> 
				                          </option>      
				                       </c:forEach>                    
				                   </c:if>               
				               </optgroup>             
				         </select>
				          <tr>
                    <td><input type="submit" value="enregistrer" /></td>
                </tr>	         
            
        </f:form>
    </div>
     
    
</body>
</html>