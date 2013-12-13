<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <link href="<s:url value="/styles/main.css"/>" rel="stylesheet" type="text/css"/>
</head>
<body>
<center>
<div class="titleDiv"><s:text name="application.title"/></div>
<h1>
   <s:if test="empleado==null || empleado.codigo == null">
	 <s:text name="label.empleado.add"/>
   </s:if>
   <s:else>
	 <s:text name="label.empleado.edit"/>
   </s:else>
</h1>
	<table width=600 align=center>
	    <tr><td><a href="obtenerTodosEmpleados.action">Ver Empleados</a></td>
	     </tr>
	</table>	 
	 <table>
		<tr><td align="left" style="font:bold;color:red"> 
	            <s:fielderror/> 	 	
                <s:actionerror/>
                <s:actionmessage/>
             </td>
        </tr>
     </table>
     		 	
    <s:form>
    <s:hidden name="empleado.codigo"/>
     <table align="center" class="borderAll">
         <tr><td class="tdLabel"><s:text name="label.nombre"/></td>
         	        <td><s:textfield name="empleado.nombre" size="30"/></td>
         </tr>
        <tr>
            <td class="tdLabel"><s:text name="label.apellido"/></td>
                            <td><s:textfield name="empleado.apellido" size="30"/></td>
        </tr>
        <tr><td class="tdLabel"><s:text name="label.edad"/></td>
        	                <td><s:textfield name="empleado.edad" size="20"/></td>
        </tr>
        
    </table>
    		 <br/>
    <table> 
    	     <tr>
    		    <td><s:submit action="insertarOActualizar" key="button.label.submit" cssClass="butStnd"/></td>
    	        <td><s:reset key="button.label.cancel" cssClass="butStnd"/></td>
    		 </tr>
    </table> 		  		 
    	</s:form>
</center>		
</body>
</html>