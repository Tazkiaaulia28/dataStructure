abstract class Employee{
    private String name;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee{
    private String position;

    public FullTimeEmployee(String name, int id, String position){
        super(name, id);
        this.position = position;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }

    @Override
    public double calculateSalary(){
        switch(position.toLowerCase()){
            case "manager":
                return 10000000;
            case "Supervisor":
                return 7000000;
            case "staff":
                return 5000000;
            default:
                return 0;
        }
    }
}

class PartTimeEmployee extends Employee{
    private double hourlyPrice;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyPrice, int hoursWorked){
        super(name, id);
        this.hourlyPrice = hourlyPrice;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyPrice(){
        return hourlyPrice;
    }

    public void setHourlyPrice(double hourlyPrice){
        this.hourlyPrice = hourlyPrice;
    }

    public void  setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary(){
        return hourlyPrice * hoursWorked;
    }
}

public class ManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee andi = new FullTimeEmployee("Andi",0001,"staff");
        PartTimeEmployee budi = new PartTimeEmployee("Budi",0001,50000,80);

        System.out.println("Gaji Pegawai Tetap "+andi.getName()+" : Rp."+andi.calculateSalary());
        System.out.println("Gaji Pegawai paruh waktu "+budi.getName()+" : Rp."+budi.calculateSalary());
    }
}

