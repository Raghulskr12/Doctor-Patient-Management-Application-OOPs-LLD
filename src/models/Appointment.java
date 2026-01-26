package models;

public class Appointment {

    private int appointmentId;
    private int doctorId;
    private int patientId;
    private String date;
    private String time;
    private String status;

    public Appointment(int appointmentId,int doctorId,int patientId,String date,String time,String status)
    {
        this.appointmentId=appointmentId;
        this.doctorId=doctorId;
        this.patientId=patientId;
        this.date=date;
        this.time=time;
        this.status=status;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }


    public String getTime() {
        return time;
    }


    public String toString() {
        return "Appointment id :" + appointmentId +
                "Doctor id : " + doctorId +
                "Patient id : " + patientId +
                "Date : " + date +
                "Time : " + time +
                "Status : " + status;
                
    }
}
