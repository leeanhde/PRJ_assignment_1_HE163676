/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author anhde
 */
public class Session {
    private int id;
    private Lecturer lecturer;
    private Room room;
    private TimeSlot timeslot;
    private Date date;
    private Group group;
    private int index;
    private boolean attandated; 
    private ArrayList<Attandance> atts = new ArrayList<>();

    public Session() {
    }

    public Session(int id, Lecturer lecturer, Room room, TimeSlot timeslot, Date date, Group group, int index, boolean attandated) {
        this.id = id;
        this.lecturer = lecturer;
        this.room = room;
        this.timeslot = timeslot;
        this.date = date;
        this.group = group;
        this.index = index;
        this.attandated = attandated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public TimeSlot getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(TimeSlot timeslot) {
        this.timeslot = timeslot;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isAttandated() {
        return attandated;
    }

    public void setAttandated(boolean attandated) {
        this.attandated = attandated;
    }

    public ArrayList<Attandance> getAtts() {
        return atts;
    }

    public void setAtts(ArrayList<Attandance> atts) {
        this.atts = atts;
    }

    
    
}