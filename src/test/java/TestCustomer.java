package java;

import com.aurora.dao.CustomerDAO;

import com.aurora.model.entity.Customer;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

public class TestCustomer {

    @Test
    public void testQueryById(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        CustomerDAO dao = sqlSession.getMapper(CustomerDAO.class);
        Customer customer = dao.queryById(1001);
        System.out.println(customer);
    }
    @Test
    public void testIsValidTelno(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        CustomerDAO dao = sqlSession.getMapper(CustomerDAO.class);
        Long telno1 = dao.isValidTelno(166789456L);
        Long telno2 = dao.isValidTelno(1667894L);
        System.out.println(telno1);
        System.out.println(telno2);
    }

    @Test
    public void testIsValidEmail(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        CustomerDAO dao = sqlSession.getMapper(CustomerDAO.class);
        String email1 = dao.isValidEmail("Ada123@163.com");
        String email2 = dao.isValidEmail("Ada123456@163.com");
        System.out.println(email1);
        System.out.println(email2);
    }

    @Test
    public void testUpdatePwd(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        CustomerDAO dao =  sqlSession.getMapper(CustomerDAO.class);
        Customer customer = new Customer();
        customer.setCustId(1003);
        customer.setCustPwd("aaaaaa");
        int row = dao.updatePwd(customer);
//        sqlSession.commit();
        System.out.println(row);
    }

    @Test
    public void testRegister(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        CustomerDAO dao =  sqlSession.getMapper(CustomerDAO.class);
        Customer customer = new Customer();
        customer.setCustId(1005);
        customer.setCustPwd("1");
        customer.setCustName("aaa");
        customer.setCustAge(20);
        customer.setCustPhone(136111111L);
        customer.setCustEmail("333@gmail.com");
        customer.setCustCreateTime(new Date());
        customer.setCustUpdateTime(new Date());
        int row = dao.register(customer);
        sqlSession.commit();
        System.out.println(row);
    }

    @Test
    public void testUpdate(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        CustomerDAO dao =  sqlSession.getMapper(CustomerDAO.class);
        Customer customer = new Customer();
        customer.setCustId(1004);
        customer.setCustPwd("aaa111");
        customer.setCustName("test");
        customer.setCustAge(21);
        customer.setCustPhone(178667899L);
        customer.setCustEmail("111test@gmail.com");
        customer.setCustCreateTime(new Date());
        customer.setCustUpdateTime(new Date());
        int row = dao.update(customer);
        sqlSession.commit();
        System.out.println(row);
    }
}
