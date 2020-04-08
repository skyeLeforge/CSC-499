/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc499hw1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ronal
 */
public class CSC499HW1Test {
    
    

    /**
     * Test of main method, of class CSC499HW1.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        CSC499HW1.main(args);
        
        String fileLocation = "C:\\Users\\ronal\\Downloads\\developer_exam_resources\\Developer Exam Resources\\Sort Me.txt";
        File file = new File(fileLocation); 
        
         //declare the classes it uses
        Scanner sc = new Scanner(file);
        List<String> lines = new ArrayList<>();
        
        //this parses into array list line by line
        while (sc.hasNextLine())
            lines.add(sc.nextLine());
        
        //this converts the array list to an array
        String[] actual =  lines.toArray(new String[0]);
        //for some reason when it reads the text file random strings will have a
        //space at the end. this loop gets rid of all spaces in the strings
        for (int i = 0; i<actual.length; i++ ){
            actual[i] = actual[i].trim();
        }
        
        //created expected output
        String[] expected = {"Kha",
                            "Asby",
                            "Bain",
                            "Dean",
                            "Fife",
                            "Wile",
                            "Baker",
                            "Ellis",
                            "Evans",
                            "Foley",
                            "Glock",
                            "Graff",
                            "Heigl",
                            "Lundy",
                            "McVey",
                            "Nylon",
                            "Peery",
                            "Reyes",
                            "White",
                            "Adkins",
                            "Broome",
                            "Hickey",
                            "Laymon",
                            "Rogers",
                            "Tanton",
                            "Taylor",
                            "Byfield",
                            "Dulaney",
                            "Hagberg",
                            "Hillman",
                            "McCrave",
                            "Michael",
                            "Padgett",
                            "Routson",
                            "Starkey",
                            "Stegman",
                            "Bostwick",
                            "Cachedon",
                            "Giddings",
                            "Guenther",
                            "Hatfield",
                            "Kalivoda",
                            "Kirkland",
                            "Phillips",
                            "Reynolds",
                            "Sullivan",
                            "Williams",
                            "Clevenger",
                            "Fitzjerrell",
                            "Hendrickson"
                                };
        assertArrayEquals(actual, expected);
        
    }
    
}
