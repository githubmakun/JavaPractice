//package Text116;
//
//import org.apache.commons.lang.builder.CompareToBuilder;
//
//public class Employee implements Comparable<Employee> {
//    
//    private int id;
//    private String name;
//    private int age;
//    
//    public Employee(int id, String name, int age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
//    
//    @Override
//    public int compareTo(Employee o) {
//        return new CompareToBuilder().append(id, o.id).append(name, o.name).append(age, o.age).toComparison();
//    }
//    
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("员工的编号：" + id + ", ");
//        sb.append("员工的姓名：" + name + ", ");
//        sb.append("员工的年龄：" + age);
//        return sb.toString();
//    }
//}
