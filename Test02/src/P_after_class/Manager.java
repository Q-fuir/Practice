package P_after_class;

public class Manager
{
    String ManagerName;//管理人员姓名
    String ManagerNumber;//管理人员工号
    int ManagerSalary;//管理人员薪资
    double BasePay;//基本工资
    double award;//奖金

    public Manager()
    {
        super();
    }

    public Manager(String managerName, String managerNumber, int managerSalary)
    {
        ManagerName = managerName;
        ManagerNumber = managerNumber;
        ManagerSalary= managerSalary;
    }

    public String getManagerName()
    {
        return ManagerName;
    }

    public void setManagerName(String managerName)
    {
        ManagerName = managerName;
    }

    public String getManagerNumber()
    {
        return ManagerNumber;
    }

    public void setManagerNumber(String managerNumber)
    {
        ManagerNumber = managerNumber;
    }

    public int getManagerSalary()
    {
        return ManagerSalary;
    }

    public void setManagerSalary(int managerSalary)
    {
        ManagerSalary = managerSalary;
    }

    public double getBasePay()
    {
        return BasePay;
    }

    public void setBasePay(double basePay)
    {
        BasePay = basePay;
    }

    public double getAward()
    {
        return award;
    }

    public void setAward(double award)
    {
        this.award = award;
    }

    //打印姓名，工号信息
    public void intro(String managerName,String managerNumber){
            System.out.println("经理姓名："+managerName+"\n"+"工号："+managerNumber);
    }
    //打印薪资信息
    public void showSalary( double BasePay,double award){
         ManagerSalary=(int)(BasePay+award);
        System.out.println("基本工资为："+BasePay+"奖金为："+award);

    }
    //打印工作信息
    public void work(){
            System.out.println("正在努力的做着管理工作，分配任务，检查员工提交上来的代码.....");
    }
}
