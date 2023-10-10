package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.testng.Assert.*;

public class JobTest {
    @Test
    public void testSettingJobId() {
        Job jobOne = new Job();
        Job jobTwo = new Job();
        assertNotEquals(jobOne.getId(), jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobOne = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals("Product tester", jobOne.getName());
        assertEquals("ACME", jobOne.getEmployer().getValue());
        assertEquals("Desert", jobOne.getLocation().getValue());
        assertEquals("Quality control", jobOne.getPositionType().getValue());
        assertEquals("Persistence", jobOne.getCoreCompetency().getValue());

        assertTrue(jobOne.getName() instanceof String);
        assertTrue(jobOne.getEmployer() instanceof Employer);
        assertTrue(jobOne.getLocation() instanceof Location);
        assertTrue(jobOne.getPositionType() instanceof PositionType);
        assertTrue(jobOne.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job jobOne = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job jobTwo = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertNotEquals(jobOne,jobTwo);

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        Job jobOne = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        char lastCharacter = jobOne.toString().charAt(0);
        char firstCharacter = jobOne.toString().charAt(jobOne.toString().length()-1);

        assertEquals(lastCharacter, '\n');
        assertEquals(firstCharacter, '\n');

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        Job jobOne = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals(jobOne.toString(), "\nID: " + jobOne.getId() +
                "\nName: " + jobOne.getName() +
                "\nEmployer: " + jobOne.getEmployer().getValue() +
                "\nLocation: " + jobOne.getLocation().getValue() +
                "\nPosition Type: " + jobOne.getPositionType().getValue() +
                "\nCore Competency: " + jobOne.getCoreCompetency().getValue() +
                "\n");
    }

    @Test
    public void testToStringHandlesEmptyField() {

        Job jobOne = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency(""));

        assertEquals(jobOne.toString(), "\nID: " + jobOne.getId() +
                "\nName: " + jobOne.getName() +
                "\nEmployer: " + jobOne.getEmployer().getValue() +
                "\nLocation: " + jobOne.getLocation().getValue() +
                "\nPosition Type: " + jobOne.getPositionType().getValue() +
                "\nCore Competency: " + "Data not available" +
                "\n");


    }



}
