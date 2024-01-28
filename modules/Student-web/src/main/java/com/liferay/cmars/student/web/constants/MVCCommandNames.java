package com.liferay.cmars.student.web.constants;


/*
Liferay에서 MVCCommandNames 클래스와 렌더(render) 커맨드의 관계는 MVC (Model-View-Controller) 패턴의 일부로서,
포틀릿의 다양한 뷰와 상호작용을 관리하는 데 사용됩니다.
여기서 MVCCommandNames는 포틀릿 내에서 수행되는 특정한 액션 또는 렌더링 요청을 식별하는 데 사용되는 상수들의 모음입니다.
*/
public class MVCCommandNames {

    public static final String ADD_STUDENT = "/student/add";
    public static final String DELETE_STUDENT = "/student/delete";
    public static final String EDIT_STUDENT = "/student/edit";
    public static final String VIEW_STUDENT = "/student/view";
    public static final String LIST_STUDENTS = "/student/list";
}
