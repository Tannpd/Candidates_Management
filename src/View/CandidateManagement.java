package view;


import Controller.Manager;
import Model.Candidate;
import java.util.ArrayList;



public class CandidateManagement extends Menu<String> {

    ArrayList<Candidate> candidates = new ArrayList<>();
    public CandidateManagement(String td, String[] mc, String exit) {
        super(td, mc, exit);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                Manager.createCandidate(candidates, 0);
                break;
            case 2:
                Manager.createCandidate(candidates, 1);
                break;
            case 3:
                Manager.createCandidate(candidates, 2);
                break;
            case 4:
                Manager.searchCandidate(candidates);
                break;
        }
    }
}
