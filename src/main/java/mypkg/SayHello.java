// Git collaborative COP-2805C (Java II) project.
// $Id$

package mypkg;

/** Class used for COP-2805C git and GitHub project.
*/
public class SayHello
{
    /** Displays greetings for all students.
      * When done, displays a count of students who edited this file.
      * @param args - Unused
      */
    public static void main ( String [] args )
    {
        int counter = 0;

        System.out.println( "Howdy!  My name is Wayne Pollock." );
        counter++;

        // (1) Add your own output below these comments that includes your name.
        // (2) Place "counter++;" command after your contribution, to keep count.
        // (3) Keep the existing println statement at the very end.


        System.out.println( "Number of students who edited this file: "
            + counter );
    }
}
