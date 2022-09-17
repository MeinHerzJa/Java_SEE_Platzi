package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private String speciality;

    public Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del model.Doctor asignado es: "+ name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Comportamientos
    ArrayList <AvailableAppoiment> availableAppoiment = new ArrayList<>();
    public void addAvalaibleAppoiment(Date date, String time) {
        availableAppoiment.add(new Doctor.AvailableAppoiment(date,time));
    }

    public ArrayList<AvailableAppoiment> getAvailableAppoiment(){
        return availableAppoiment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality
                + "\nAvalaible: ";
    }

    @Override
    public void showDataUser() {
        System.out.println("Type User: Employee");
        System.out.println("Hospital: Red Cross");
        System.out.println("Department: Oncology");
    }

    public static class AvailableAppoiment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppoiment(Date date, String time) {
            this.date =  date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appoiments" +
                    "\nDate=" + date +
                    "\nTime='" + time;
        }
    }
}
