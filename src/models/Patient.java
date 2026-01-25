package models;

public class Patient {

    public int patientId;
    public String name;
    public int age;
    public String gender;
    public String phoneNumber;
    public int userId;

    public Patient(int patientId,String name,int age,String gender,String phoneNumber,int userId)
    {
        this.age=age;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.patientId=patientId;
        this.gender=gender;
        this.userId=userId;
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }


    public int getPatientId() {
        return patientId;
    }


    public int getAge() {
        return age;
    }


    public String getGender() {
        return gender;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String toString()
    {
        return "Patient ID : " +patientId +
                "Name : " + name +
                "Age : " + age +
                "Gender :" + gender +
                "Phone :" +phoneNumber;
    }


}
