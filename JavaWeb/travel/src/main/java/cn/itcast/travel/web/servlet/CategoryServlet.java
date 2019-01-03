package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.Category;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.service.impl.CategoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/category/*")
public class CategoryServlet extends BeanServlet {
    CategoryService service = new CategoryServiceImpl ();
    public void getCategory (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 查询类别
        List<Category> category = service.getCategory();

        // 响应回浏览器
        writeValue (response,category);
    }
}
