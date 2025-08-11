package dev.aymee;
import java.util.ArrayList;
import java.util.Collections;
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
   return weekDays;
   }

   public int getWeekDaysSize(){
      int size=0;
      if(weekDays!=null){
         size=weekDays.size();
      }
 return size;
   }

   public boolean removeDay(String day){
     if (weekDays!=null){
      return weekDays.remove(day);
     }
     else
     return false;

   }

   public String getDay(int index) {
    if (weekDays != null && index >= 0 && index < weekDays.size()) {
        return weekDays.get(index);
    }
    return null; 
}
   public boolean dayExist(String day){
      boolean exist=false;
     if(weekDays.contains(day)){
      exist=true;
     }
      return exist;
   }

   public void orderDays(){
       if(weekDays!=null){
         Collections.sort(weekDays);
       }
   }

   public void ClearweekDays(){
      if(weekDays!=null){
         weekDays.clear();
       }
   }
}
