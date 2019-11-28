package cn.itcast.travel.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @创建人 lilinfeng
 * @创建时间 2019/11/28
 * @描述 异步请求用户名是否重复
 */
@WebServlet("/checkUserName")
public class UserNameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if ("application/x-www-form-urlencoded".equalsIgnoreCase(req.getContentType())) {
            //表单格式
            Map<String, String[]> parameterMap = req.getParameterMap();
            //返回参数
            Map<String, Object> params = new HashMap<String, Object>();

            for (Map.Entry<String, String[]> entry :
                    parameterMap.entrySet()) {
                params.put(entry.getKey(), entry.getValue()[0]);
            }

        }
    }
}
