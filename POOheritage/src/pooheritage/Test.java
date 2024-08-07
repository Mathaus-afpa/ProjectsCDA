package pooheritage;

public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person("person", "azeakjela");
        Student student = new Student("person", "azeakjela");
        student.setProgram("CDA");
        student.setYear(2024);
        student.setFee(11111);
        Staff staff = new Staff("person", "azeakjela");
        staff.setSchool("AFPA");
        staff.setPay(222222);
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(staff.toString());
    }
}