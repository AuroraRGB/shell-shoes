import com.aurora.dao.ShoesDAO;
import com.aurora.entity.Shoes;
import com.aurora.entity.ShoesDetail;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestShoes {
    @Test
    public void testQueryAll(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesDAO dao = sqlSession.getMapper(ShoesDAO.class);
        List<Shoes> shoes = dao.queryAll();
        for (Shoes s:shoes) {
            System.out.println(s);
        }
    }

    @Test
    public void testQueryByName(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesDAO dao = sqlSession.getMapper(ShoesDAO.class);
        List<Shoes> shoes = dao.queryByName("shoes");
        for (Shoes s:shoes) {
            System.out.println(s);
        }
    }

    @Test
    public void testQueryByGender(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesDAO dao = sqlSession.getMapper(ShoesDAO.class);
        List<Shoes> shoes = dao.queryByGender(1);
        for (Shoes s:shoes) {
            System.out.println(s);
        }
    }

    @Test
    public void testQueryBySize(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesDAO dao = sqlSession.getMapper(ShoesDAO.class);
        List<ShoesDetail> shoesDetails = dao.queryBySize(44F);
        for (ShoesDetail s:shoesDetails) {
            System.out.println(s);
        }
    }

    @Test
    public void testQueryByPrice(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesDAO dao = sqlSession.getMapper(ShoesDAO.class);
        List<Shoes> shoes = dao.queryByPrice(220.0F,600.0F);
        for (Shoes s:shoes) {
            System.out.println(s);
        }
    }

    @Test
    public void testQueryByCategory(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesDAO dao = sqlSession.getMapper(ShoesDAO.class);
        List<Shoes> shoes = dao.queryByCategory(2);
        for (Shoes s:shoes) {
            System.out.println(s);
        }
    }
}
