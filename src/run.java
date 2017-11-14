import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class run {
    public static void main(String[] args) {

        List<Integer> cinemaTickets = new ArrayList<>(); // new list of integers

        int standardTicket = 8; // Standard £8
        int student = 6; // OAP & Student same price £6
        int oap = 6; // OAP
        int child = 4; // Child £4


        Boolean isWednesday = Boolean.TRUE; // wednesday boolean value true/false

        cinemaTickets.add(standardTicket); // add ticket on
        cinemaTickets.add(oap);
        cinemaTickets.add(child);
        cinemaTickets.add(student);


        int total = 0; // total of tickets

        for (int value : cinemaTickets){
            if(isWednesday) { // Check is wednesday
                total = total + value - 2; // if it is wednesday -2 to each ticket
            } else {
                total = total + value; // nothing happens normal price
            }

        }
        System.out.println(total); // print total
    }
}
