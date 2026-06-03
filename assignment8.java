import java.util.Scanner;
class employee{
    String empid;
    String name;
    String department;
    double salary;

    employee(){
        empid="EMP000";
        name="unknown";
        department="unknown";
        salary=0;
    }
    employee(String empid, String name,String department,double salary){
        this.empid=empid;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    employee(String name,String department){
        this.empid=employeemanager.generateempid();
        this.name=name;
        this.department=department;
        this.salary=0;
    }

    public String getempid(){
        return empid;
    }
    public String getname(){
        return name;
    }
    public String getdepartment(){
        return department;
    }
    public double getsalary(){
        return salary;
    }
    public void setempid(String empid){
        this.empid=empid;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setdepartment(String department){
        this.department=department;
    }
    public void setsalary(double salary){
        if(salary>0){
        this.salary=salary;
    }
}
    public void displayEmployeeDetails(){
        System.out.println("name is "+name);
        System.out.println("employe idd is :"+empid);
        System.out.println("deaprtment is :"+department);
        System.out.println("salary is :"+salary);
    }
}

class employeemanager{
    static int nextempid=1;

    static String generateempid(){
        return "emp"+nextempid++;
    }
    employee arr[]= new employee[10];
    int count=0;

    void addemployee(employee emp){
        arr[count++]=emp;
    }

    void findemployeebyid(String id){
        for(int i=0;i<count;i++){
            if(arr[i].getempid().equals(id)){
                return arr[i];
            }
        }
        return null;

    }
    void updateemployeesalary(string id,double newsalary){
        employee e=findemployeebyid(id);
        if(e!=null){
            double oldsalary=e.getsalary();
            double sum=oldsalary+newsalary;
            e.setsalary(sum);
        }
    }
    void listallemployees(){
        for(int i=0;i<count;i++){
            arr[i].displayEmployeeDetails();
        }
    }
}

public class assignment8 {
    
}
