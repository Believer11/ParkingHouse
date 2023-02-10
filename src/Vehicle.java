public class Vehicle {

    private String licensePlate;

    private int id;
    private String name;


    public Vehicle( int id, String licensePlate, String name) {
        this.licensePlate = licensePlate;
        this.id = id;
        this.name = name;
    }

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Vehicle() {
    }

    public void parkCar(){
    };



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

}
