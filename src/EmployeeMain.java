public class EmployeeMain {
    public static void main(String[] args) {
        Address address=new Address();
        Employee e=new Employee();
        address.setHouseNo(18);
        address.setStreetName("StreetNo-2");
        address.setCity("Delhi");
        address.setCountry("India");
        address.setZipCode("110094");
        e.setName("Gaurav");
        e.setAge(27);
        e.setDob("17/09/1995");
        e.setAddress(address);
        System.out.println(address);
        System.out.println(e);
    }

}
