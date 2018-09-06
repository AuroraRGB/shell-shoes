package java;

import com.aurora.dao.ReceiveAddressDAO;
import com.aurora.model.entity.ReceiveAddress;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestReceiveAddress {

    @Test/*测试添加收件地址*/
    public void testSave(){
        ReceiveAddress receiveAddress = new ReceiveAddress(5,"安徽省","六安市","裕安区","鼓楼街道","安徽省六安市裕安区鼓楼街道皖西学院本部",261527,"薛成志",18637162728L,0,1004);
        SqlSession sqlSession = MyBatisUtil.getSession();
        ReceiveAddressDAO receiveAddressDAO  = sqlSession.getMapper(ReceiveAddressDAO.class);
        int rows = receiveAddressDAO.save(receiveAddress);
        System.out.println(rows);
        sqlSession.commit();
    }

    @Test/*测试查询收件地址*/
    public void testQueryAll(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        ReceiveAddressDAO receiveAddressDAO  = sqlSession.getMapper(ReceiveAddressDAO.class);
        List<ReceiveAddress> receiveAddressList = receiveAddressDAO.queryAll(1004);
        for(ReceiveAddress receiveAddresss : receiveAddressList){
            System.out.println(receiveAddresss);
        }
    }


    @Test/*测试删除收件地址*/
    public void testDelete(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        ReceiveAddressDAO receiveAddressDAO  = sqlSession.getMapper(ReceiveAddressDAO.class);
        int rows = receiveAddressDAO.delete(5,1004);
        System.out.println(rows);
        sqlSession.commit();
    }

    @Test/*测试修改收件地址*/
    public void testUpdate(){
        ReceiveAddress receiveAddress = new ReceiveAddress(4,"安徽省","池州市","青阳县","酉华街道","安徽省池州市青阳县酉华街道二酉村17号",242800,"薛成志",18637162728L,0,1004);
        SqlSession sqlSession = MyBatisUtil.getSession();
        ReceiveAddressDAO receiveAddressDAO  = sqlSession.getMapper(ReceiveAddressDAO.class);
        int rows = receiveAddressDAO.update(receiveAddress);
        System.out.println(rows);
        sqlSession.commit();
    }


    @Test/*测试增添默认收件地址*/
    public void testupdateDefaultAddress(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        ReceiveAddressDAO receiveAddressDAO  = sqlSession.getMapper(ReceiveAddressDAO.class);
        int rows = receiveAddressDAO.UpdateDefaultAddress(4,1004);
        System.out.println(rows);
        sqlSession.commit();
    }














}
