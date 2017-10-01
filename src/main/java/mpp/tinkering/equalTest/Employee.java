package mpp.tinkering.equalTest;


public class Employee {
    private String name;
    private int age;
    private double salary;
    private char sex;
    private float bonus;

    public Employee(String name, int age, double salary, char sex, float bonus) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.sex = sex;
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj == this) return true;

        if(getClass() != obj.getClass()) return false;

        Employee o = (Employee)obj;

        return o.age == this.age
                && o.bonus == this.bonus
                && o.name.equals(this.name)
                && o.sex == this.sex
                && o.salary == this.salary;
    }

    @Override
    public int hashCode() {
        int result = 17;

        int nameHash = name.hashCode();
        int ageHash = age;
        int sexhash = sex;

        long salartHashLong = Double.doubleToLongBits(salary);
        int salaryHash = (int) (salartHashLong ^ (salartHashLong >>> 32));
        int bonusHash = Float.floatToIntBits(bonus);

        result += 31*result + nameHash;
        result += 31*result + ageHash;
        result += 31*result + sexhash;
        result += 31*result + salaryHash;
        result += 31*result + bonusHash;

        return result;
    }
}
