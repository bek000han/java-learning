
import java.util.ArrayList;


public class ExerciseManagement {
    
    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise: exercises) {
            list.add(exercise.getName());
        } 
        
        return list;
    }
    
    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String exercise) {
        for (Exercise exercise1: exercises) {
            if (exercise1.getName().equals(exercise)) {
                exercise1.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String exercise) { 
        for (Exercise exercise1: exercises) {
            if (exercise1.getName().equals(exercise)) {
                return exercise1.isCompleted();
            }
        }
        
        return false;
    }
    
}
