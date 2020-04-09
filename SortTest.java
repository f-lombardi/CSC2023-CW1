
/*************************************************/
/*** Simple test class for Sort class          ***/
/***                                           ***/
/*** Author: Jason Steggles    20/09/2017      ***/
/*** Extended by: Fabiana Lombardi  14/10/17   ***/
/*************************************************/


public class SortTest
{
	public static void main(String[] args) 
    {
		/**This is used to read in the different text document, with the length of each array**/
		Sort sortTest = new Sort(15);
		Sort sortTest2 = new Sort(15);
		Sort sortTest3 = new Sort(100);
		Sort sortTest4 = new Sort(100);
		Sort sortTest5 = new Sort(100);
 
		/**This reads in the values in Text1.txt**/
        sortTest.readIn("test1.txt");
        /**This sorts the values in Test1.txt using insertion sort**/
        sortTest.insertion();
        sortTest.readIn("test1.txt");
        /**This sorts the values in the array for the 15 numbers in the array for quicksort**/
        sortTest.quick(0, 14);
        /**This displays the comparison counter for insertion sort**/
        System.out.println("Insertion sort comparison counter 1: " + sortTest.compIS);
        /**Displays the sorted array in lines of 20 values**/
        sortTest.display(20,"Input Array 1 Sort");
        /**This displays the comparison counter for quicksort**/
        System.out.println("\n\nQuicksort comparison counter 1: " + sortTest.compQS);
        sortTest.display(20,"Input Array 1 Sort");
        
        /**This reads in the values in Text2.txt**/
        sortTest2.readIn("test2.txt");
        /**This sorts the values in Test2.txt using insertion sort**/
        sortTest2.insertion();
        sortTest2.readIn("test2.txt");
        /**This sorts the values in the array for the 15 numbers in the array for quicksort**/
        sortTest2.quick(0, 14);
        /**This displays the comparison counter for insertion sort**/
        System.out.println("\n\nInsertion sort comparison counter 2: " + sortTest2.compIS);
        /**Displays the sorted array in lines of 20 values**/
        sortTest2.display(20,"Input Array 2 Sort");
        /**This displays the comparison counter for quicksort**/
        System.out.println("\n\nQuicksort comparison counter 2: " + sortTest2.compQS);
        sortTest2.display(20,"Input Array 2 Sort");
        
        /**This reads in the values in Text3.txt**/
        sortTest3.readIn("test3.txt");
        /**This sorts the values in Test3.txt using insertion sort**/
        sortTest3.insertion();
        sortTest3.readIn("test3.txt");
        /**This sorts the values in the array for the 100 numbers in the array for quicksort**/
        sortTest3.quick(0, 99);
        /**This displays the comparison counter for insertion sort**/
        System.out.println("\n\nInsertion sort comparison counter 3: " + sortTest3.compIS);
        /**Displays the sorted array in lines of 20 values**/
        sortTest3.display(20,"Input Array 3 Sort");
        /**This displays the comparison counter for quicksort**/
        System.out.println("\n\nQuicksort comparison counter 3: " + sortTest3.compQS);
        sortTest3.display(20,"Input Array 3 Sort");
        
        /**This reads in the values in Text4.txt**/
        sortTest4.readIn("test4.txt");
        /**This sorts the values in Test4.txt using insertion sort**/
        sortTest4.insertion();
        sortTest4.readIn("test4.txt");
        /**This sorts the values in the array for the 100 numbers in the array for quicksort**/
        sortTest4.quick(0, 99);
        /**This displays the comparison counter for insertion sort**/
        System.out.println("\n\nInsertion sort comparison counter 4: " + sortTest4.compIS);
        /**Displays the sorted array in lines of 20 values**/
        sortTest4.display(20,"Input Array 4 Sort");
        /**This displays the comparison counter for quicksort**/
        System.out.println("\n\nQuicksort comparison counter 4: " + sortTest4.compQS);
        sortTest4.display(20,"Input Array 4 Sort");

        /**This reads in the values in Text3.txt**/
        sortTest3.readIn("test3.txt");
        /**This sorts the values in Test3.txt using new sort**/
        sortTest3.newSort();
        /**This reads in the values in Text4.txt**/
        sortTest4.readIn("test4.txt");
        /**This sorts the values in Test4.txt using new sort**/
        sortTest4.newSort();
        /**This reads in the values in Text5.txt**/
        sortTest5.readIn("test5.txt");
        /**This sorts the values in Test5.txt using new sort**/
        sortTest5.newSort();
        /**This reads in the values in Text5.txt**/
        sortTest5.readIn("test5.txt");
        /**This sorts the values in Test5.txt using insertion sort**/
        sortTest5.insertion();
        /**This displays the comparison counter for new sort**/
        System.out.println("\n\nNew sort comparison counter 3: " + sortTest3.compNewS);
        /**Displays the sorted array in lines of 20 values**/
        sortTest3.display(20,"Input Array 3 Sort");
        /**This displays the comparison counter for new sort**/
        System.out.println("\n\nNew sort comparison counter 4: " + sortTest4.compNewS);
        /**Displays the sorted array in lines of 20 values**/
        sortTest4.display(20,"Input Array 4 Sort");
        /**This displays the comparison counter for new sort**/
        System.out.println("\n\nNew sort comparison counter 5: " + sortTest5.compNewS);
        /**Displays the sorted array in lines of 20 values**/
        sortTest5.display(20,"Input Array 5 Sort");
        /**This displays the comparison counter for insertion sort**/
        System.out.println("\n\nInsertion sort comparison counter 5: " + sortTest5.compIS);
        /**Displays the sorted array in lines of 20 values**/
        sortTest5.display(20,"Input Array 5 Sort");
        
    }
    
} /** End of Test class **/