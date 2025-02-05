package org.onlinedoctorapplication.diagnoses;

import org.onlinedoctorapplication.SymptomTransition;

import java.util.ArrayList;
import java.util.Arrays;

public class Allergy extends Diagnosis {
    public Allergy() throws Exception {
        name = "Allergy";
    }

    public void initializeDoctorsAndTransitions() throws Exception {
        if (this.getDoctors().size() == 0 || this.transitions.size() == 0) {
            this.addDoctor("Vladimir Zouev");
        }
        transitions = new ArrayList<>(
                Arrays.asList(new SymptomTransition("Headache", getDiagnosisByName("Flu")),
                        new SymptomTransition("Cough", getDiagnosisByName("Sinusitis"))
                )
        );
    }
}

