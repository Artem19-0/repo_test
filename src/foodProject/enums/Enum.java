package foodProject.enums;

public enum Enum {

    MON("monday"),TUE("tuesday"), WED("wednesday"),
    THUR("thursday"),FR("friday");

    private String fullName;

    private Enum(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
