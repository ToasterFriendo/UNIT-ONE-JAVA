

public class Examplethree {

    public static void main(String[] args) {
        int mark1 = 87, mark2 = 97, mark3 = 63;
int numMarks = 3;
        
// implicit cast from int to double -> Java does it for you it is implicit
double average = (mark1 + mark2 + mark3) / numMarks;


        System.out.println(average);
    }
}
