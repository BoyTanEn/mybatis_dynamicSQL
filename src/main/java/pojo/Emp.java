package pojo;

/**
 * @author:谭恩翔
 * @create: 2022-08-06 00:40
 * @Description:
 */
public class Emp {
    private Integer empId;
    private String empName;
    private int age;
    private String gender;
    private Dept dept;

    public Emp() {
    }

    public Emp(Integer empId, String empName, int age, String gender, Dept dept) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.dept = dept;
    }

    public Emp(Integer empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
