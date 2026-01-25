package models;

public class Doctor {

    private int doctorId;
    private String name;
    private String specialization;
    private int experienceYears;
    private int userId;

    public Doctor(int doctorId,String name,String specialization,int experienceYears,int userId )
    {
        this.doctorId=doctorId;
        this.name=name;
        this.specialization=specialization;
        this.experienceYears=experienceYears;
        this.userId=userId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString()
    {
        return "Doctor : " + doctorId +
                "Name : " + name +
                "Specialization : " + specialization +
                "Experience : " + experienceYears + "years";
    }
}
