package models;

import java.util.List;

public class Prescription {

    private int patientId;
    private int doctorId;
    private int prescriptionId;
    private List<String> medicines;
    private String remarks;
    private String date;

    public Prescription(int patientId,int doctorId,int prescriptionId,List<String> medicines,String remarks,String date)
    {
        this.date=date;
        this.remarks=remarks;
        this.prescriptionId=prescriptionId;
        this.doctorId=doctorId;
        this.patientId=patientId;
        this.medicines=medicines;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getDate() {
        return date;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public List<String> getMedicines() {
        return medicines;
    }

    public String getRemarks() {
        return remarks;
    }

    public String toString() {
        return "PrescriptionId : " + prescriptionId +
                "Patient Id : " + patientId +
                "Doctor Id : " + doctorId +
                "Medicines : " + medicines +
                "Remarks : " + remarks +
                "Date : " + date;
    }
}
