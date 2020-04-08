
package csc499hw1;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSC499HW1{


    public static String[] fileToStringArray(File file) throws FileNotFoundException{
        
        //declare the classes it uses
        Scanner sc = new Scanner(file);
        List<String> lines = new ArrayList<>();
        
        //this parses into array list line by line
        while (sc.hasNextLine())
            lines.add(sc.nextLine());
        
        //this converts the array list to an array
        String[] tempNameArray =  lines.toArray(new String[0]);
        //for some reason when it reads the text file random strings will have a
        //space at the end. this loop gets rid of all spaces in the strings
        for (int i = 0; i<tempNameArray.length; i++ ){
            tempNameArray[i] = tempNameArray[i].trim();
        }
        return tempNameArray;
    }
    

    
     // method to call sorting methods for length and alphabetically
    public static String[] sortAlphabetically(String[] toSort) {
        String tempForSort;
        
        //first sort it aplhabetically
        for (int i = 0; i < toSort.length; i++) {
            for (int j = 0; j < toSort.length; j++) {
                if(toSort[j].compareTo(toSort[i])>0){
                    tempForSort = toSort[i];
                    toSort[i] = toSort[j];
                    toSort[j] = tempForSort;
                }  
            }
        }
 
        return toSort;
    }
    
    public static String[] sortBySize(String[] toSort){
        //first find the largest and smallest string sizes in the array
        int shortest=Integer.MAX_VALUE;
        int longest = 0;
        for (int i = 0; i < toSort.length; i++) {
            if(toSort[i].length()>longest){
                longest = toSort[i].length();
            }else if(toSort[i].length()<shortest){
                shortest = toSort[i].length();
            }
        }  
        //create a new array for our output
        String[] sorted= new String[toSort.length];
        
        //start copying data from toSort to sorted, by size then alphabetically
        //j is the size, k is where we are in the toSort array
        int placeInArr = 0; // where we will insert the value into the new array
        for (int j = 3; j <= longest; j++) {
            for (int k = 0; k < sorted.length; k++) {
                if(toSort[k].length()==j){
                    sorted[placeInArr] = toSort[k];
                    placeInArr++;
                }
            }
        }
        
        
        
        
        
        return sorted;
    }
    
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // put the location of your file below
        
        String fileLocation = "C:\\Users\\ronal\\Downloads\\developer_exam_resources\\Developer Exam Resources\\Sort Me.txt";
        File file = new File(fileLocation); 
        
       //convert the file to an array of strings
       String[] toSort = fileToStringArray(file);

        
        //first sort it alphabetically
        String[] sortedAlphabetically = sortAlphabetically(toSort);
        
        //then sort it by size
        String[] sorted = sortBySize(sortedAlphabetically);
        
        
        new FileWriter(fileLocation, false).close();
        
        FileWriter myWriter = new FileWriter(fileLocation);
        for (int i = 0; i < sorted.length; i++) {
            if(sorted[i] !=null){
                System.out.println("");
                myWriter.write(sorted[i]);
                myWriter.write("\n");
        }
        
       
    
     }  
       myWriter.close();
        System.out.println("success");
    }
        
    }
  
 
    

