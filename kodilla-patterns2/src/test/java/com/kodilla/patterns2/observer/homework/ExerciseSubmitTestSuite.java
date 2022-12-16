package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExerciseSubmitTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ExerciseSubmit mrBean = new Student("Mr. ", "Bean");
        ExerciseSubmit drHouse = new Student("Dr.", "House");
        ExerciseSubmit bennyHill = new Student("Benny", "Hill");
        ExerciseSubmit montyPython = new Student("Monty", "Python");
        ExerciseSubmit michaelScott = new Student("Michael", "Scott");
        Mentor szymonKociuba = new Mentor("Szymon Kociuba");
        Mentor mateuszLach = new Mentor("Mateusz Lach");
        mrBean.registerObserver(szymonKociuba);
        drHouse.registerObserver(szymonKociuba);
        bennyHill.registerObserver(mateuszLach);
        montyPython.registerObserver(szymonKociuba);
        michaelScott.registerObserver(mateuszLach);

        //When
        mrBean.addExerciseForVerification("Mr Bean Goes to Town");
        mrBean.addExerciseForVerification("Merry Christmas, Mr. Bean");
        drHouse.addExerciseForVerification("97 Seconds");
        bennyHill.addExerciseForVerification("Bennies from Heaven");
        bennyHill.addExerciseForVerification("Bonus Benny!");
        bennyHill.addExerciseForVerification("The Good, the Bawd and the Benny");
        montyPython.addExerciseForVerification("The Killer Joke");
        montyPython.addExerciseForVerification("The Dead Parrot Sketch");
        michaelScott.addExerciseForVerification("Dinner Party");
        michaelScott.addExerciseForVerification("Safety Training");
        michaelScott.addExerciseForVerification("The Injury");

        System.out.println("\n After accepting:");
        szymonKociuba.acceptExercise(mrBean,"Merry Christmas, Mr. Bean");
        System.out.println(mrBean.getExercisesList().get(1));
        boolean status = mrBean.getExercisesList().get(1).isAccepted();

        //Then
        assertEquals(5, szymonKociuba.getUpdateCount());
        assertEquals(6, mateuszLach.getUpdateCount());
        assertTrue(status);
    }
}
