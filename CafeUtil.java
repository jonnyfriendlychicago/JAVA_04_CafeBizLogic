import java.util.ArrayList;
public class CafeUtil {

    // public ArrayList streakGoal(Integer weeksCount) { /* this is for the list */
    public Integer streakGoalMthd(Integer weeksCount) {

        ArrayList<Integer> drinksEachWeekAL = new ArrayList<Integer>(); 
        
        int totalDrinks = 0; 
        // int totalDrinks;  /* this won't work */

        for (int i = 0; i <= (weeksCount-1); i++){

            int lastWeekValue; 
            if (i == 0) {
                lastWeekValue = 0;  
            }
            else {
                lastWeekValue = drinksEachWeekAL.get(i - 1); 
            }; 

            drinksEachWeekAL.add(lastWeekValue +1 ); 
            totalDrinks =  totalDrinks  + drinksEachWeekAL.get(i);  
        }
        // return drinksEachWeekAL; /* this is for the list */
        return totalDrinks; 
    }

    public double orderTotalMthd(double[] incomingArray) {

        double orderTotal = 0.0; 
        
        for (int i = 0; i < incomingArray.length; i++) {
            // orderTotal = orderTotal + incomingArray[i]; 
            orderTotal += incomingArray[i]; 
        }

        return orderTotal; 
    }

    public String displayMenuMthd(ArrayList<String>  incomingArrayList) {

        for (Integer i = 0; i < incomingArrayList.size(); i++){
            // String comeOn = (String) i ; 
            // + incomingArrayList.get(i); 
            // System.out.println(i); 
            // System.out.println(incomingArrayList.get(i)); 
            System.out.println(i + " " + incomingArrayList.get(i)); 
            
        }

        return "something here that doesn't matter b/c it doesn't go any further anyway";
    }

    public String addCustomerMthd(ArrayList<String> incomingArrayList) {
        System.out.println("Please enter your name"); 
        String userName = System.console().readLine();
        System.out.println("hello " + userName + "!"); 
        System.out.println("There are " + incomingArrayList.size() + " customer(s) in front of you."); 
        incomingArrayList.add(userName); 


        return "forgetAboutIt"; 
    }

}