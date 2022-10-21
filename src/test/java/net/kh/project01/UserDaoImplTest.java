package net.kh.project01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class UserDaoImplTest {

    @Autowired
    UserDao userDao;

    @Test
    public void deleteUser() {
    }

    @Test
    public void selectUser() {
    }

    @Test
    public void insertUser() {
    }

    @Test
    public void updateUser() throws Exception{
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2022,1,1);

        userDao.deleteAll();
        User2 user = new User2("asdf","12345678","Joan","ccc@ccc.com",new Date(cal.getTimeInMillis()),"line",new Date());
        int rowCnt = userDao.insertUser(user);
        assertTrue(rowCnt==1);

        user.setPwd("11111111");
        user.setEmail("bbb@bbb.com");
        rowCnt = userDao.updateUser(user);
        assertTrue(rowCnt==1);

        User2 user2 = userDao.selectUser(user.getId());

        System.out.println("user = " + user);
        System.out.println("user2 = " + user2);
        assertTrue(user.equals(user2));
    }
}