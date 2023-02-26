<%@ page import="com.danielane.labwork.model.Teacher" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%
    Teacher teacher = new Teacher();
    if (request.getAttribute("teacher") != null) {
        teacher = (Teacher) request.getAttribute("teacher");
    }

    StringBuilder stringBuilder = new StringBuilder();
    for (Map.Entry<String, String> entry : teacher.getLectures().getMyLectures().entrySet()){
        stringBuilder.append(entry.getValue() + "\n");
    }

%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="teacherReport.css" type="text/css">
    <title>Report Information</title>
</head>


<body>
<div class="wrapper">
    <div class="title">
        Provided Information
    </div>
    <div class="form">
        <div class="inputfield">
            <label>First Name</label>
            <input type="text" class="input" name="inputFirstName"
                   value=<%= teacher.getFirstName()%> readonly>
        </div>
        <div class="inputfield">
            <label>Last Name</label>
            <input type="text" class="input" name="inputLastName"
                   value=<%= teacher.getLastName()%> readonly>
        </div>
        <div class="inputfield">
            <label>Gender</label>
            <input type="text" class="input" name="inputFirstName" value='<%= teacher.getGender().getMyGender().getValue()%>' readonly>
        </div>
        <div class="inputfield">
            <label>Age</label>
            <input type="number" class="input" name="inputLastName" value=<%= teacher.getAge()%> readonly>
        </div>
        <div class="inputfield">
            <label>Professional Post</label>
            <textarea role="textbox" class="input" name="inputLastName" readonly><%= teacher.getProfessionalPost().getMyPost().getValue()%></textarea>
        </div>
        <div class="inputfield">
            <label>Department</label>
            <textarea role="textbox" class="input" name="inputLastName" readonly><%= teacher.getDepartment().getMyDepartment().getValue()%></textarea>
        </div>
        <div class="inputfield">
            <label>Communist Party Member?</label>
            <input type="text" class="input" autocomplete="family-name" name="inputLastName" value=<%= teacher.isComPartyMember().getMyComPartyMember().getValue()%> readonly required>
        </div>
        <div class="inputfield">
            <label>Lecturing</label>
            <textarea role="textbox" class="input" name="inputLastName" readonly><%= stringBuilder.toString()%></textarea>
        </div>

        <a href="/labwork/">
            <input type="button" value="Go Back" class="btn">
        </a>

    </div>

</div>
</body>
</html>