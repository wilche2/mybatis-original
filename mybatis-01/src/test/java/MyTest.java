import com.kuang.dao.UserDao;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author caoweiquan
 * @date 2021/3/6
 */
public class MyTest {

    @Test
    public void selectUser() {
        SqlSession session = MybatisUtils.getSession();
        //方法一:
        //List<User> users = session.selectList("com.kuang.mapper.UserMapper.selectUser");
        //方法二:
        UserDao mapper = session.getMapper(UserDao.class);
        List<User> users = mapper.selectUser();

        for (User user : users) {
            System.out.println(user);
        }
        session.close();
    }

}
