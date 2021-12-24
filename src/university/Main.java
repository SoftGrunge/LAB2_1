package university;
import static university.Gender.F;
import static university.Gender.M;
import static university.AcademDegree.MSc;
import static university.AcademDegree.PhD;
import static university.Stage.Bachelor;
import static university.Stage.Master;

public class Main {

    public static void main(String[] args) {
        Person[] person = {
                new Professors("Ronald  Turner", M, "Computer science", PhD, "Programming paradigms"),
                new Professors("Ruth Holling", F, "Jurisprudence", MSc, "Domestic arbitration"),
                new ActualStundents("Leo Wilkinson", M, "Computer science", Bachelor, 3),
                new ActualStundents("Anna Cunningham", F, "World economy", Bachelor, 1),
                new ActualStundents("Jill Lundqvist", F, "Jurisprudence", Master, 1),
                new GradeStundents("Ronald Correa", M, "Computer science", "Design of a functional programming language")
        };

        Person.printAll(person);

    }
}
