package university;

public class GradeStundents extends Students{
    private String thesistitle;
    public GradeStundents (String name, Gender gender, String department, String thesistitle) {
        super(name,gender, department);
        setThesistitle(thesistitle);
    }



    public String getThesistitle(){
        return thesistitle;
    }


    public void setThesistitle(String thesistitle) {
        if(thesistitle==null){
            throw new IllegalArgumentException("Поле не должно быть пустым");
        }else
        this.thesistitle = thesistitle;
    }
    @Override
    public String getPersonInfo() {
        return getGender().getPronounceF()+" thesis title is "+ thesistitle + ".";
    }
}

