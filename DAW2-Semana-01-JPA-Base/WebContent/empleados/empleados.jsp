<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <link href="<s:url value="/styles/main.css"/>" rel="stylesheet" type="text/css"/>
    <title><s:text name="label.empleados"/></title>
</head>
<body>

<div class="titleDiv"><s:text name="application.title"/></div>	
<h1><s:text name="label.empleados"/></h1>		   
<table width=600 align=center>
	<tr> <s:url id="insert" action="inicializarInsertarOActualizar"/>
		<td><s:a href="%{insert}">Agregar Nuevo Empleado</s:a></td>
	</tr>
</table>
<br>
<table align=center class="borderAll">
    <tr>
        <th><s:text name="label.nombre"/></th>
        <th><s:text name="label.apellido"/></th>
        <th><s:text name="label.edad"/></th>
        <th>&nbsp;</th>
    </tr>
    <s:iterator value="empleados" status="status">
        <tr class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
            <td class="nowrap"><s:property value="nombre"/></td>
            <td class="nowrap"><s:property value="apellido"/></td>
            <td class="nowrap"><s:property value="edad"/></td>
            <td class="nowrap">
                	<s:url id="update" action="inicializarInsertarOActualizar">
		       		   <s:param name="empleado.codigo" value="codigo"/>
		       		</s:url> 
                	<s:a href="%{update}">Editar</s:a>&nbsp;&nbsp;&nbsp;
                	
                	
                	<s:url id="delete" action="eliminar">
		       		   <s:param name="empleado.codigo" value="codigo"/>
		       		</s:url>
                	<s:a href="%{delete}">Eliminar</s:a>
            </td>
        </tr>  		
	 </s:iterator>
    </table>
</body>
</html>