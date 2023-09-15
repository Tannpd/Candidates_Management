
package view;

public class Main {
    public static void main(String[] args) {
        String mChon[] = {"Experience", "Fresher", "Internship","Searching"};
        CandidateManagement candidateManagement = new CandidateManagement("Main Menu", mChon, "exit");
        candidateManagement.run();
    }
}
