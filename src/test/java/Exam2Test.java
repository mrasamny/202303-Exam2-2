import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exam2Test {

	public static String toString(int[] anArray){
        String result = "{";
        for(int index = 0; index < anArray.length-1; index++){
            result += anArray[index]+", ";
        }
        if (anArray.length > 0){
            result += anArray[anArray.length-1];
        }
        result += "}";
        return result;
    }
	
    @Test
    void bubble_1() {
        int[] a = {1,9,3,6,2};
        int[] expected = {9,3,6,2,1};
        Exam2.bubble(a);
        assertArrayEquals(expected,a,"Expected: "+toString(expected)+"\nActual: "+toString(a));
    }

    @Test
    void bubble_2() {
        int[] a = {25,50,75,0,100};
        int[] expected = {50,75,25,100,0};
        Exam2.bubble(a);
        assertArrayEquals(expected,a,"Expected: "+toString(expected)+"\nActual: "+toString(a));
    }

    @Test
    void bubble_3() {
        int[] a = {75,100};
        int[] expected = {100,75};
        Exam2.bubble(a);
        assertArrayEquals(expected,a,"Expected: "+toString(expected)+"\nActual: "+toString(a));
    }

    @Test
    void bubble_4() {
        int[] a = {4};
        int[] expected = {4};
        Exam2.bubble(a);
        assertArrayEquals(expected,a,"Expected: "+toString(expected)+"\nActual: "+toString(a));
    }

    @Test
    void bubble_5() {
        int[] a = {};
        int[] expected = {};
        Exam2.bubble(a);
        assertArrayEquals(expected,a,"Expected: "+toString(expected)+"\nActual: "+toString(a));
    }
}