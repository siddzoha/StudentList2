/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author zohaibsiddiqui
 */
public class PartTimeStudent extends Student {
    private int hoursPerWeek;

    public PartTimeStudent(String name, int age, int hoursPerWeek) {
        super(name, age);
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public String toString() {
        return super.toString() + " (Part-time, " + hoursPerWeek + " hrs/week)";
    }
}
