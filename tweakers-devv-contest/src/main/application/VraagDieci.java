package main.application;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class VraagDieci {

	private static int[][] tri;
	private static int line;
	private static int count;
	private static ArrayList<Integer> numbers = new ArrayList<>();


	public static void main(String[] args) throws FileNotFoundException{

		Scanner fileIn = new Scanner(new File("~/Desktop/inFile.txt"));

		readFile(fileIn);
		fileIn.close();

		persistData();
		
		System.out.println(tri[0][0]);
		//Answer is: 14816;
	}

	private static void persistData() {
		tri = new int[line][line];		

		for (int i = 0 ; i < line ; ++i){
			for (int j = 0 ; j <= i ; ++j){				
				tri[i][j] = numbers.get(count);
				count++;
			}
		}	

		for (int i = line-1 ; i > 0; --i){
			for(int j = 0 ; j < line-1; j++){
				tri[i-1][j] += Math.max(tri[i][j], tri[i][j+1]);
			}
		}		
	}

	private static void readFile(Scanner fileIn){
		while(fileIn.hasNextLine() && fileIn.hasNextInt()){
			line++;
			for(int i = 0 ; i < line; ++i){
				int temp = fileIn.nextInt();
				numbers.add(temp);
			}			
		}		
	}
}
