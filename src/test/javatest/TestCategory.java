package java;

import com.aurora.dao.CategoryDAO;
import com.aurora.model.entity.Category;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestCategory {
    @Test
    public void testCheckEmailAndPwd(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        CategoryDAO dao = sqlSession.getMapper(CategoryDAO.class);
        List<Category> categories = dao.queryAll();
        for (Category c:categories) {
            System.out.println(c);
        }
    }
}
