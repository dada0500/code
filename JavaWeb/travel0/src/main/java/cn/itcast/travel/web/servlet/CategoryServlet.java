package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.Category;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.service.impl.CategoryServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/category/*")
public class CategoryServlet  extends BeanServlet {
    private CategoryService service = new CategoryServiceImpl ();

    /**
     * 获取分类
     * @param req
     * @param resp
     * @throws IOException
     */
    public void getCategory(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<Category> category = service.getCategory ();
        writeValue (resp,category);
    }
}
