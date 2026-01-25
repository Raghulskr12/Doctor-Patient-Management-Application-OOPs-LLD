package models;

public class Doctor {

    private int doctorID;
    private String name;
    private String specialization;


    public Doctor(int doctorID,String name,String specialization)
    {
        this.doctorID=doctorID;
        this.name=name;
        this.specialization=specialization;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public String getName()
    {
        return name;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    @Override
    public String toString(){
        return "Doctor ID: " + doctorID + "Name: " + name + "Specialization : " +specialization;
    }
}
