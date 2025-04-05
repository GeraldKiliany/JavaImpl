package javaimpltest;

import javaimpl.IntBinSearch;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IntBinSearchTest {

    // must be sorted array
    int[] myArray = {0,1,2,4,6,8};
    int myValL;
    int myValH;
    int indL;
    int indH;
    int missingValL;
    int missingValH;
    int invalidInd;

    @Before
    public void setUp() {
         myValL = 1;
         myValH = 8;
         missingValL = -2;
         missingValH = 100;
         indL = 1;
         indH = 5;
         invalidInd = -1;
    }


    @Test
    public void TestSearchForMyVal(){
        assert(IntBinSearch.BinarySearch(myArray,myValL));
        assert(IntBinSearch.BinarySearch(myArray,myValH));
    }

    @Test
    public void TestSearchForMissingVal(){
        assert(!IntBinSearch.BinarySearch(myArray, missingValL));
        assert(!IntBinSearch.BinarySearch(myArray,missingValH));
    }

    @Test
    public void TestSearchIndexOfMyVal(){
        assert(IntBinSearch.BinarySearchForInd(myArray,myValL) == indL);
        assert(IntBinSearch.BinarySearchForInd(myArray,myValH) == indH);
    }

    @Test
    public void TestSearchMissingIndex(){
        assert(IntBinSearch.BinarySearchForInd(myArray,missingValL) == invalidInd);
        assert(IntBinSearch.BinarySearchForInd(myArray,missingValH) == invalidInd);
    }

    @After
    public void tearDown(){
        myArray = null;
    }
}
