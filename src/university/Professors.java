package university;

public class Professors extends Person{
private AcademDegree degree;
private String speciality;



    public Professors (String name, Gender gender, String department, AcademDegree degree, String speciality) {
        super(name, gender,"teaches", department );
        setAcademDegree(degree);
        setSpeciality(speciality);
    }
        public AcademDegree getAcedemDegree() {
            return degree;
        }
        public String getSpeciality(){
            return speciality;
        }
            public void setAcademDegree(AcademDegree degree){
        if (degree == null){
            throw new IllegalArgumentException("Поле не должно быть пустым");
        } else
            this.degree = degree;
            }
            public void setSpeciality(String speciality){
        if (speciality == null){
            throw new IllegalArgumentException("Поле не должно быть пустым");
        }else
            this.speciality = speciality;
            }
        @Override
    public String getPersonInfo(){
        return getGender().getPronounce() + " has " + getAcedemDegree()+ " degree in " + getSpeciality() + ".";
        }


}


