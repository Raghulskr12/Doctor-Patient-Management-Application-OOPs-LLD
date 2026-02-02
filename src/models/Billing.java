package models;

public class Billing {

    private int billId;
    private int appointmentId;
    private int patientId;
    private double amount;
    private String paymentStatus;


    public Billing(int billId,int appointmentId,int patientId,double amount,String paymentStatus)
    {
        this.billId=billId;
        this.appointmentId=appointmentId;
        this.patientId=patientId;
        this.amount=amount;
        this.paymentStatus=paymentStatus;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public int getBillId() {
        return billId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    @Override
    public String toString()
    {
        return "Bill Id : " + billId +
                "Appointment Id : " + appointmentId +
                "Patient Id : " + patientId +
                "Amount : " + amount +
                "Payment Status : " + paymentStatus;
    }
}
