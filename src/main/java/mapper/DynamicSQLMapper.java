package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Emp;

import java.util.List;

public interface DynamicSQLMapper {
    List<Emp> getEmpByDynamic(Emp emp);
    void insert(@Param("emps") Emp[]emps);
    void delete(@Param("emps") List<Emp> emps);
}
