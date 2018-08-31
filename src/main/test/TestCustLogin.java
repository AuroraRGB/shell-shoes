
import com.aurora.dao.CustLoginDAO;
import com.aurora.entity.CustLogin;
import com.aurora.entity.Customer;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

public class TestCustLogin {
    @Test
    public void testCheckTelnoAndPwd(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        CustLoginDAO dao = sqlSession.getMapper(CustLoginDAO.class);
        Customer customer = dao.checkTelnoAndPwd(166789456L,"123456");
        System.out.println(customer);
    }

    @Test
    public void testCheckEmailAndPwd(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        CustLoginDAO dao = sqlSession.getMapper(CustLoginDAO.class);
        Customer customer = dao.checkEmailAndPwd("Ada123@163.com","123456");
        System.out.println(customer);
    }

    @Test
    public void testSave(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        CustLoginDAO dao = sqlSession.getMapper(CustLoginDAO.class);
        CustLogin custLogin =new CustLogin();
        custLogin.setLoginId(3);
        custLogin.setLoginName("Ada");
        custLogin.setLoginPwd("123456");
        custLogin.setLoginTime(new Date());
        custLogin.setLoginIp("0.0.0.1");
        custLogin.setLoginStatus(1);
        custLogin.setCustId(1001);
        int row = dao.save(custLogin);
//        sqlSession.commit();
        System.out.println(row);
    }
}
