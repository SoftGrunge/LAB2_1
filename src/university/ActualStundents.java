package university;

public class ActualStundents extends  Students{
    private int course;
    private Stage stage;
    public ActualStundents (String name, Gender gender, String department, Stage stage, int course){
        super (name, gender, department);
        setStage(stage);
        setCourse(course);
    }
    public Stage getStage(){
        return stage;
    }
    public int getCourse(){
        return course;
    }
    public void setStage(Stage stage){
        if (stage==null){
            throw new IllegalArgumentException("Поле не должно быть пустым");
        }else
            this.stage=stage;
    }
    public void setCourse(int course){
        if (course<1){
            throw new IllegalArgumentException("Курс должен быть от 1 до 6");
        }else
            this.course=course;
    }

    @Override
    public String getPersonInfo() {
        return getGender().getPronounce()+" is "+ getCourse() +"'th year " +getStage()+ " student.";
    }
}
