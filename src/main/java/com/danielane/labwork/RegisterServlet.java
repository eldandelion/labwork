package com.danielane.labwork;

import com.danielane.labwork.model.*;
import com.danielane.labwork.utils.Util;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/teacherRegister.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstNameString = request.getParameter("inputFirstName");
        String lastNameString = request.getParameter("inputLastName");
        String genderString = request.getParameter("selectGender");
        String ageString = request.getParameter("inputAge");
        String profPostString = request.getParameter("selectProfPost");
        String departmentString = request.getParameter("selectDepartment");
        String comPartyMemberString = request.getParameter("radioGroup");
        String[] lecturingStrings = request.getParameterValues("lecturingCheckbox");

        if (firstNameString != null && lastNameString != null && genderString != null && ageString != null && profPostString != null && departmentString != null) {
            String firstNameValue = Util.parseString(firstNameString);
            String lastNameValue = Util.parseString(lastNameString);
            int ageValue = Integer.parseInt(ageString);

            ComPartyMember comPartyMemberValue = ComPartyMember.newInstanceComPartyMember(Boolean.parseBoolean(comPartyMemberString));

            Gender genderValue = Gender.newInstanceGender(genderString);

            Department departmentValue = Department.newInstanceDepartment(departmentString);

            ProfessionalPost postValue = ProfessionalPost.newInstanceProfessionalPost(profPostString);

            Lecture lecturesValue = Lecture.newInstanceLecture(lecturingStrings);

            Teacher teacher = new Teacher(firstNameValue, lastNameValue, ageValue, comPartyMemberValue, genderValue, lecturesValue, postValue, departmentValue, TeachingMethod.givingLessons);

            request.setAttribute("teacher", teacher);

            getServletContext().getRequestDispatcher("/teacherReport.jsp").forward(request, response);

        }


    }


}
