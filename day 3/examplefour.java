package day3;

public class examplefour {
    int mark1 = 87, mark2 = 97, mark3 = 63;
    int numMarks = 3;
            
   // explicit cast on numMarks to convert to a double temporary
   // double average = (mark1 + mark2 + (double)mark3) / numMarks;
   // double average = (double)(mark1 + mark2 + mark3) / numMarks; It's useless
    
   double average = (mark1 + mark2 + mark3) / (double)numMarks;

    
    
            System.out.println(average);

}
