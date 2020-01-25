package model;

public class Course {

    int id;
    int code;
    String name;
    String description;
    int credit;

    public Course(int id, int code, String name, String description, int credit) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCredit() {
        return credit;
    }
}
