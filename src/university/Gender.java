package university;

public enum Gender {
    M ("He", "His"),
    F ("She", "Her");
    private  String pronounce;
    private String pronounceF;

    Gender(String pronounce, String pronounceF) {
        this.pronounce = pronounce;
        this.pronounceF= pronounceF;
    }

    public String getPronounce() {
        return pronounce;
    }

    public String getPronounceF() {
        return pronounceF;
    }
}
