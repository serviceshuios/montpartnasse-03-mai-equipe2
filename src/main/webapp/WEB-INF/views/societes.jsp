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
<title>LISTES SOCIETES</title>
</head>
<body>
    <h2>CRUD SOCIETES TRANSPORT</h2>
    <div>
        <f:form modelAttribute="societe" method="POST" action="saveSocieteTransport">
            <table>
                <tr>
                    <td><f:hidden path="idSociete"/> </td>
                </tr>
                <tr>
                    <td>NOMSOCIETE:</td>
                    <td><f:input path="nomSociete" /></td>
                    <td><f:errors path="nomSociete" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>NUMSIRET:</td>
                    <td><f:input path="numSiret" /></td>
                    <td><f:errors path="numSiret" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>DATECREATION:</td>
                    <td><f:input path="dateCreation" /></td>
                    <td><f:errors path="dateCreation" cssClass="error"/></td>
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
                <th>ID</th>
                <th>NOMSOCIETE</th>
                <th>NUMSIRET</th>
                <th>DATECREATION</th>
                <th>SUPPRIMER</th>
                <th>MODIFIER</th>
            </tr>
            <c:forEach var="s" items="${societes}">
                <tr>
                    <td>${s.idSociete}</td>
                    <td>${s.nomSociete}</td>
                    <td>${s.numSiret}</td>
                    <td>${s.dateCreation}</td>
                    <td><a href="deleteSocieteTransport?idSociete=${s.idSociete}">supprimer</a></td>
                    <td><a href="editSocieteTransport?idSociete=${s.idSociete}">editer</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>


