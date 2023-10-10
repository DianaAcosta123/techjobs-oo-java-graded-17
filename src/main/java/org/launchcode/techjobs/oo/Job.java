package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        String newline = System.lineSeparator();

        if (name.equals("")) {

            setName("Data not available");

        }

        if (employer.getValue().equals("") || employer.getValue() == null) {

            employer.setValue("Data not available");

        }

        if (location.getValue().equals("") || location.getValue() == null) {

            location.setValue("Data not available");

        }

        if (positionType.getValue().equals("") || positionType.getValue() == null) {

            positionType.setValue("Data not available");

        }

        if (coreCompetency.getValue().equals("") || coreCompetency.getValue() == null) {

            coreCompetency.setValue("Data not available");

        }


        return newline + "ID: " + id +
                newline + "Name: " + name +
                newline + "Employer: " + employer +
                newline + "Location: " + location +
                newline + "Position Type: " + positionType +
                newline + "Core Competency: " + coreCompetency +
                newline;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    //Job.toString(), "\nID: " + jobOne.getId() +
    //       "\nName: " + jobOne.getName() +
    //       "\nEmployer: " + jobOne.getEmployer().getValue() +
    //       "\nLocation: " + jobOne.getLocation().getValue() +
    //        "\nPosition Type: " + jobOne.getPositionType().getValue() +
    //      "\nCore Competency: " + jobOne.getCoreCompetency().getValue() +
    //      "\n")

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
