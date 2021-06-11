package instructor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InstructorSet {
    private Set<Instructor> instructorSet = new HashSet<>();

    public void add(Instructor instructor)
    {
        instructorSet.add(instructor);
    }
    public String toString()
    {
        String str = "";
        Iterator<Instructor> instructorIterator = instructorSet.iterator();
        while(instructorIterator.hasNext())
            str += instructorIterator.next().toString() + " ";
        System.out.println(str);
        return str;
    }

    public boolean search(Instructor instructor)
    {
        return instructorSet.contains(instructor);
    }
}
