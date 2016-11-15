<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ex" uri="/WEB-INF/custom.tld" %>

<html>
<body>
<script type="text/javascript" src='/dwr/engine.js'></script>
<script type="text/javascript" src='/dwr/util.js'></script>
<script type="text/javascript" src='/dwr/interface/baseInfo.js'></script>
<script>
    function loadState() {
        baseInfo.getState(callBackFunctionForState);
    }
    function loadCity(i) {
        baseInfo.getCity(i, callBackFunctionForCity);
    }

    var callBackFunctionForState = function (methodReturn) {
        var select = document.createElement("select");
        select.id = "se1";
        for (i = 0; i < methodReturn.length; i++) {
            var option = document.createElement("option");
            option.value = methodReturn[i].name;
            option.selected = "";
            option.innerHTML = methodReturn[i].name;
            select.appendChild(option);
        }
        document.getElementById("out1").appendChild(select);
    }

    var callBackFunctionForCity = function (methodReturn) {
        var select = document.createElement("select");
        select.id = "se1";
        for (i = 0; i < methodReturn.length; i++) {
            var option = document.createElement("option");
            option.value = methodReturn[i].name;
            option.selected = "";
            option.innerHTML = methodReturn[i].name;
            select.appendChild(option);
        }
        document.getElementById("out1").appendChild(select);
    }

</script>

<c:set var="x" value="${1+3}"/>
<p>1+3=</p>
<c:out value="${x}"/><br>

<p>نام کاربر:</p>
<c:out value="${sessionScope.username}" default="نا مشخص"/><br>

<p>Taglib:</p>
<ex:State>
    State
</ex:State>

<P>JSTL,forEach:</P>
<c:forEach begin="1" end="3" var="i">
    <c:out value="${i}"/><br>
</c:forEach>

<button onclick="loadState()">getCountry</button>

<div id="out1"></div>
<br>

</body>
</html>