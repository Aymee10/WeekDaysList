package dev.aymee;
import java.util.ArrayList;
import java.util.List;

public class WeekList {
    List<String> weekDays;

    public WeekList() {
        weekDays=new ArrayList<>();
    }
    
    
   public void createWeekDays(){
      weekDays.clear();
      weekDays.add("Lunes");
      weekDays.add("Martes");
      weekDays.add("Miércoles");
      weekDays.add("Jueves");
      weekDays.add("Viernes");
      weekDays.add("Sábado");
      weekDays.add("Domingo");
   }

 public List<String> getWeekDays() {
    return new ArrayList<>(weekDays);
   }

   

   
}
