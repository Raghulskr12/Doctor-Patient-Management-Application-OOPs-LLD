package models;

public class MedicalRecord {
    private int recordId;
    private int patientId;
    private int doctorId;
    private String description;
    private String diagnosis;
    private String date;


    public MedicalRecord(int recordId, int patientId, int doctorId, String description, String diagnosis, String date)
    {
        this.recordId=recordId;
        this.patientId=patientId;
        this.doctorId=doctorId;
        this.description=description;
        this.diagnosis=diagnosis;
        this.date=date;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getDate() {
        return date;
    }

    public int getRecordId() {
        return recordId;
    }

    public String getDescription() {
        return description;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String toString()
    {
        return  "Record Id :" + recordId +
                "Patient Id : " + patientId +
                "Doctor Id : " + doctorId +
                "Description : " + description +
                "Diagnosis : " + diagnosis +
                "Date : " + date;
    }
}
