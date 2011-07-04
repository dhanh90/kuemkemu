/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package array;

/**
 *
 * @author kuem
 */
//import java.util.Scanner;

public class Main {

//----------------------------------------------------------------------------

        private static char source[] = {'c', 'a', 'r'};

        private static char result[] = new char[3];

        private static boolean picked[] = new boolean[3];

//----------------------------------------------------------------------------

        public static void main(String[] args) {

                     // initialize that none of characters was picked

                     java.util.Arrays.fill(picked, false);



                     pickCharAt(0);

        }

//----------------------------------------------------------------------------

        private static void pickCharAt(int position) {

                     // print out if 6 positions already filled

                     if (position > 2)

                                  System.out.println(String.valueOf(result));

                     // pick a remain character for current position

                     else

                                  for (int i=0; i<3; i++) {

                                                // if the character source[i] still not picked then pick it

                                                if (!picked[i]) {

                                                     result[position] = source[i];

                                                     picked[i] = true;
  System.out.println(String.valueOf(result));
                                                     // fetch for next position

                                                     pickCharAt(position + 1);

                                                     // return the character source[i] when recur back

                                                     picked[i] = false;
                                           System.out.println(picked[0]);
                                           System.out.println(picked[1]);
                                           System.out.println(picked[2]);
                                        }

        }

        }