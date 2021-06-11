package instructor;

public class Demo {

    public static void main(String[] args) {
        InstructorSet instructorSet;
        Instructor instructor1;
        Instructor instructor2;
        Instructor instructor3;
        instructorSet = new InstructorSet();
        instructor1 = new Instructor("Pf", "1", "111");
        instructor2 = new Instructor("Pf", "2", "103");
        instructor3 = new Instructor("Pf", "2", "306");
        instructorSet.add(instructor1);
        instructorSet.add(instructor2);
        instructorSet.add(instructor3);
        System.out.println(instructorSet);
        System.out.println(instructorSet.search(instructor1));
    }
}
