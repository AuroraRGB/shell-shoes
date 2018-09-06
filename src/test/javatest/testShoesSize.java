package java;

import com.aurora.dao.ShoesSizeDAO;
import com.aurora.model.entity.ShoesSize;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class testShoesSize {

    @Test
    public void testShoesSize() {
        ShoesSize shoesSize = new ShoesSize(10, 46F, 1);
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesSizeDAO shoesSizeDAO = sqlSession.getMapper(ShoesSizeDAO.class);
        int rows = shoesSizeDAO.insertSelective(shoesSize);
        System.out.println(rows);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testQueryAllSizeByShoesId() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesSizeDAO shoesSizeDAO = sqlSession.getMapper(ShoesSizeDAO.class);
        List<ShoesSize> shoesSizes = shoesSizeDAO.queryAllSizeByShoesId(8);
        System.out.println(shoesSizes);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void testupdateByPrimaryKey() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesSizeDAO shoesSizeDAO = sqlSession.getMapper(ShoesSizeDAO.class);
        int rows = shoesSizeDAO.updateByPrimaryKey(new ShoesSize(10, 38F, 1));
        System.out.println(rows);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testdeleteByPrimaryKey() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesSizeDAO shoesSizeDAO = sqlSession.getMapper(ShoesSizeDAO.class);
        int rows = shoesSizeDAO.deleteByPrimaryKey(10);
        System.out.println(rows);
        sqlSession.commit();
        sqlSession.close();
    }
}


