package java;

import com.aurora.dao.ShoesImgDAO;
import com.aurora.model.entity.ShoesImg;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class testShoesImg {

    @Test
    public void testSaveShoesImg(){
        ShoesImg shoesImg = new ShoesImg(4,2001,"dddd",4);
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesImgDAO shoesImgDAO = sqlSession.getMapper(ShoesImgDAO.class);
        int rows = shoesImgDAO.insert(shoesImg);
        System.out.println(rows);
        sqlSession.commit();
        sqlSession.close();
    }

       @Test
    public void testqueryAllImgByShoesId(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesImgDAO shoesImgDAO = sqlSession.getMapper(ShoesImgDAO.class);
        List<ShoesImg> shoesImg = shoesImgDAO.queryAllImgByShoesId(2002);
        System.out.println(shoesImg);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testupdateByPrimaryKey(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesImgDAO shoesImgDAO = sqlSession.getMapper(ShoesImgDAO.class);
        int rows = shoesImgDAO.updateByPrimaryKey(new ShoesImg(1,2002,"eeee",5));
        System.out.println(rows);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testdeleteByPrimaryKey(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesImgDAO shoesImgDAO = sqlSession.getMapper(ShoesImgDAO.class);
        int rows = shoesImgDAO.deleteByPrimaryKey(4);
        System.out.println(rows);
        sqlSession.commit();
        sqlSession.close();
    }
}
