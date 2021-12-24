package university;

public abstract class Person {
    private String name;
    private Gender gender;
    private String verb;
    private String department;
    public Person(String name, Gender gender, String verb, String department){
        setName(name);
        setGender(gender);
        setVerb(verb);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public String getVerb() {
        return verb;
    }

    public Gender getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }

    public void setDepartment(String department) {
        if (department.isEmpty()) {
            throw new IllegalArgumentException("Поле не должно быть пустым");
        } else
            this.department = department;
    }

    public void setVerb(String verb){
            if (verb.isEmpty()) {
                throw new IllegalArgumentException("Поле не должно быть пустым");
            }
            this.verb = verb;
        }

    public void setGender(Gender gender) {
       if(gender == null){
           throw new IllegalArgumentException("Поле не должно быть пустым");
       }else
        this.gender = gender;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new IllegalArgumentException("Поле не должно быть пустым");
        } else
        this.name = name;
    }
    public abstract String getPersonInfo();
    public void print(){
        System.out.println("This is "+ name+"."+getGender().getPronounce()+" "+verb + " at "+ department+".");
        System.out.println(getPersonInfo());
    }
    public static void printAll(Person[] person){
        for (Person p : person){
            p.print();
            System.out.println();
        }
    }


}
