package tasks.DrivingSchoolFilter;

import java.util.ArrayList;
import java.util.List;

public class Candidate {
    private String name;
    private int age;
    private boolean hasMedCertificate;

    public Candidate(String name,int age,boolean hasMedCertificate){
        this.name = name;
        this.age = age;
        this.hasMedCertificate = hasMedCertificate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public boolean getHasMedCertificate(){
        return hasMedCertificate;
    }
    public static void drivingSchoolFilter(){
        List<Candidate> candidateList = new ArrayList<>();
        candidateList.add(new Candidate("Ivan", 17, false));
        candidateList.add(new Candidate("Igor", 22, false));
        candidateList.add(new Candidate("Irina", 28, true));
        candidateList.add(new Candidate("Irma", 16, true));


        List<Candidate> candidateRight = candidateList.stream()
                .filter(candidate -> candidate.getAge() >= 18 && candidate.getHasMedCertificate())
                .toList();

        List<String> candidateNames = candidateRight.stream()
                .map(candidate -> candidate.getName())
                .toList();

        System.out.println(candidateNames);
    }
}
