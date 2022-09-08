package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


/**
 * @author:谭恩翔
 * @create: 2022-08-02 17:54
 * @Description:
 */
public class SqlSessionUtil {
    public static SqlSession getSqlSession() {
        SqlSession sqlSession = null;
        try {
            //读取mybatis的核心配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //创建SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //通过核心配置文件对应的字节输入流创建工厂类SqlSessionFactory,生产sqlsession对象
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            //true设置为默认自动提交。不待true是默认手动提交
            sqlSession = sqlSessionFactory.openSession(true);
            System.out.println("test1");
            System.out.println("test2");
            System.out.println("测试分支");
            System.out.println("酷酷酷酷酷");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sqlSession;
    }
}
