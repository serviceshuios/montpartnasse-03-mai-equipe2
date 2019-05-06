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
<title>LISTES AERIENNE</title>
</head>
<body>
    <h2>CRUD AERIENNES</h2>
    <div>
        <f:form modelAttribute="aerienne" method="POST" action="saveAerienne">
            <table>
            <tr>
                    <td><f:hidden path="idCargaison"/> </td>
                </tr>
                 <tr>
                    <td>NOMCARGAISON:</td>
                    <td><f:input path="nomCargaison" /></td>
                    <td><f:errors path="nomCargaison" cssClass="error"/></td>
                </tr>
                 <tr>
                    <td>DEPART:</td>
                    <td><f:input path="depart" /></td>
                    <td><f:errors path="depart" cssClass="error"/></td>
                </tr>
                 <tr>
                    <td>DESTINATION:</td>
                    <td><f:input path="destination" /></td>
                    <td><f:errors path="destination" cssClass="error"/></td>
                </tr>
                
                
                <tr>
                    <td>NumVol:</td>
                    <td><f:input path="numVol" /></td>
                    <td><f:errors path="numVol" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>PEAGE:</td>
                    <td><f:input path="taxe" /></td>
                    <td><f:errors path="taxe" cssClass="error"/></td>
                </tr>
                
                <tr>
                    <td><input type="submit" value="enregistrer" /></td>
                </tr>
            </table>
        </f:form>
    </div>
    <div id="listProduits">
        <table class="table1">
            <tr>
                
                <th>NumVol</th>
                <th>TAXE</th>
                
                <th>SUPPRIMER</th>
                <th>MODIFIER</th>
            </tr>
            <c:forEach var="a" items="${aeriennes}">
                <tr>
                    <td>${a.numVol}</td>
                    <td>${a.taxe}</td>
                    
                    <td><a href="deleteAerienne?id=${a.idCargaison}">supprimer</a></td>
                    <td><a href="editAerienne?id=${a.idCargaison}">editer</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>