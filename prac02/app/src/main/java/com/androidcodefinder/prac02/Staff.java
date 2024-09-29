package com.androidcodefinder.prac02;

public class Staff {
    private String id;
    private String name;
    private String birthDate;
    private long salary;

    // Constructor
    public Staff(String id, String name, String birthDate, long salary) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public void setId(String id)
    {
        this.id = id;
    }
    public String getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;

    }

    public void setBirthDate(String birthDate)
    {
        this.birthDate = birthDate;
    }
    public String getBirthDate()
    {
        return birthDate;
    }

    public void setSalary(long salary)
    {
        this.salary = salary;
    }

    public long getSalary()
    {
        return salary;
    }
}
