class employee1 {
    int salary;
    String name;

    public int getsalary() {
        return salary;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }
}

public class ps_class_employee {
    public static void main(String[] args) {
        employee1 pavan = new employee1();
       pavan.setname("godage");
       pavan.salary=12000;

       System.out.println(pavan.getname());
       System.out.println(pavan.getsalary());
    }

}