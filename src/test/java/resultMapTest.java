
import mapper.DynamicSQLMapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Dept;
import pojo.Emp;
import utils.SqlSessionUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:谭恩翔
 * @create: 2022-08-06 01:06
 * @Description:
 */
public class resultMapTest {
    @Test
    public void testDeptAndEmpByStep() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "lkl", 12, "nan", null);
        List<Emp> empByDynamic = mapper.getEmpByDynamic(emp);
        System.out.println(empByDynamic);
    }

    @Test
    public void testDeptAndEmpByStep1() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "lk3", 12, "n", null);
        Emp emp1 = new Emp(null, "l13l", 12, "n", null);
        Emp emp2 = new Emp(null, "l233l", 12, "n", null);
        Emp emp3 = new Emp(null, "4l3l", 12, "n", null);
        Emp[] emps = {emp, emp1, emp2, emp3};
        Emp[] emps1 = new Emp[1];
        mapper.insert(emps1);
    }
    @Test
    public void testDeptAndEmpByStep2() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(8 );
        Emp emp1 = new Emp(9);
        Emp emp2 = new Emp(11);
        Emp emp3 = new Emp(10);
        List<Emp> emps = Arrays.asList(emp, emp1, emp2, emp3);

        mapper.delete(emps);
    }
}
