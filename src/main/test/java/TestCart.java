import com.aurora.dao.CartDAO;
import com.aurora.entity.Cart;
import com.aurora.entity.ShoesDetail;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;


public class TestCart {

    @Test/*添加购物车*/
    public void testInsert(){
        Cart cart = new Cart(2015,1001,2,3,new Date(),new Date());
        SqlSession sqlSession = MyBatisUtil.getSession();
        CartDAO cartDAO = sqlSession.getMapper(CartDAO.class);
        int rows = cartDAO.insert(cart);
        System.out.println(rows);
        sqlSession.commit();
    }


    @Test/*查询购物车*/
    public void testQuery(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        CartDAO cartDAO = sqlSession.getMapper(CartDAO.class);
        List<Cart> cartList = cartDAO.queryAll(2);
        for(Cart carts:cartList){
            System.out.println(carts);
        }
    }

    @Test/*查看购物车中所有商品详情*/
    public void testQuery1(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        CartDAO cartDAO = sqlSession.getMapper(CartDAO.class);
        List<ShoesDetail> shoesDetails = cartDAO.queryAll1(1003);
        for(ShoesDetail shoesDetail :shoesDetails){
            System.out.println(shoesDetail);
        }
    }

    @Test/*删除购物车*/
    public void testDelete(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        CartDAO cartDAO = sqlSession.getMapper(CartDAO.class);
        int rows = cartDAO.delete(2,1001);
        System.out.println(rows);
        sqlSession.commit();
    }


    @Test/*修改购物车*/
    public void testUpdate(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        CartDAO cartDAO = sqlSession.getMapper(CartDAO.class);
        int rows = cartDAO.updateCount(2,1001,10);
        System.out.println(rows);
        sqlSession.commit();
    }




















}
