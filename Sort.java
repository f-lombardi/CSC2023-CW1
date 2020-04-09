/*****************************************************/
/*** Purpose:                                      ***/
/***                                               ***/
/***     Initial Author: Jason Steggles 20/09/17   ***/
/***     Extended by: Fabiana Lombardi  14/10/17   ***/
/*****************************************************/

import java.io.*;
import java.text.*;
import java.util.*;

public class Sort {

/** Array of integers to sort **/
private int[] A;
	
/** Size of the array **/
private int size;

/** Number of elements actually used in array **/
private int usedSize;

/** Global variables for counting sort comparisons **/
public int compIS; /** Global comparison count for Insertion Sort **/
public int compQS; /** Global comparison count for Quicksort **/
public int compNewS; /** Global comparison count for new sort **/

/*****************/
/** Constructor **/
/*****************/
Sort(int max)
{
    /** Initialiase global sort count variables **/
    compIS = 0;
    compQS = 0;
    compNewS = 0;
    
    /** Initialise size variables **/
    usedSize = 0;
    size = max;
    
    /** Create Array of Integers **/
    A = new int[size];
}

/*********************************************/
/*** Read a file of integers into an array ***/
/*********************************************/
public void readIn(String file)
{
   try
   {
       /** Initialise loop variable **/
       usedSize = 0;
       
       /** Set up file for reading **/
       FileReader reader = new FileReader(file);
       Scanner in = new Scanner(reader);
       
       /** Loop round reading in data while array not full **/
       while(in.hasNextInt() && (usedSize < size))
       {
           A[usedSize] = in.nextInt();
           usedSize++;
       }
       
    }
    catch (IOException e)
    {
       System.out.println("Error processing file " + file);
    }
}
/**********************/
/*** Insertion Sort ***/
/**********************/
public void insertion(){

	int i, j, newValue;
	for (i = 1; i < usedSize; i++){
		newValue = A[i];	/**Stores the next value insert**/
		j = i;
		while (j > 0 && A[j - 1] > newValue){
			int temp = A[j];
			A[j] = A[j - 1];	/**Pushes the space left**/
			j--;	/**Decrements j**/
			compIS++; /**Increments the comparison counter**/
		}
		compIS++;
		A[j] = newValue; /**Inserts key into space**/
	}
}
/**********************/
/***   Quicksort    ***/
/**********************/
public void quick(int L, int R){
	int index;
	if (R > L) {
		index = partition(L, R); /**Splits the array into two**/
		quick(L, index-1);	/**Sorts the left half**/
		quick(index+1, R);	/**Sorts the right half**/
	}
}

int partition(int L, int R){
	int pL = L;	/**Assigns pointers to the left and right**/
	int pR = R;
	int v = A[R]; /**Selects the pivot**/
	
	while (pL < pR){
		while (A[pL] < v){	/**Moves the left point**/
			pL++;	/**Increments the left pointer**/
			compQS++;	/**Increments the comparison counter**/
		}
		compQS++;
		while (A[pR] >= v && pR > L){	/**Moves the right pointer**/
			pR--;	/**Decrements the right pointer**/
			compQS++;
		}
		compQS++;
		if (pL < pR){
			swap(pL, pR);	/**Swaps the left and right pointer**/
		}
	}
	swap(pL, R); /**Puts the pivot in the correct position**/
	return pL; /**Returns the pivot position**/
}

private void swap(int pL,int pR){ 
	/**This swaps the pointers when it gets referred in the different methods above**/
	int temp = A[pL];
	A[pL] = A[pR];
	A[pR] = temp;
}
/**********************/
/***    NewSort     ***/
/**********************/
public void newSort(){
	int min, i, pos;
	pos = 0;	/**Assigns the position to start at 0**/
	
	while (pos < usedSize) {
		min = findMinFrom(pos); /**Uses the findMinFrom method, to find the minimum comparisons**/
		for ( i = pos; i < usedSize; i++) { /**Find the minimum element in the unsorted array**/
			compNewS++;	/**Increments the comparison counter**/
			if (A[i] == min){
				swap(i, pos);	/**Swap the values**/
				pos++;	/**Increments the position**/
			}
		}
	}
}
private int findMinFrom(int pos){
	int min;
	min = A[pos]; /**Assigns the minimum value**/
	
	for (int i = pos + 1; i < usedSize; i++){ /**If the element is less, then it is the new minimum**/
		compNewS++;
		if (A[i] < min){ 
			min = A[i]; /**Found new minimum**/
		}
	}
	return min;	/**Returns the minimum**/
}

/**********************/
/*** Display array  ***/
/**********************/
public void display(int line, String header)
{
    /*** Integer Formatter - three digits ***/
    NumberFormat FI = NumberFormat.getInstance();
    FI.setMinimumIntegerDigits(3);

    /** Print header string **/
    System.out.print("\n"+header);

    /** Display array data **/
    for (int i=0;i<usedSize;i++)
    {
        /** Check if new line is needed **/
        if (i%line == 0) 
        { 
            System.out.println(); 
        }
        
        /** Display an array element **/
        System.out.print(FI.format(A[i])+" ");
    }
}
} /** End of Sort Class **/