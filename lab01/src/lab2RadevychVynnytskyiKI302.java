import java.io.*;
import java.util.*;
/**
 * Клас lab2RadevychVynnytskyiKI302 містить метод main, який є точкою входу в програму
 *
 * @author Radevych-Vynnytskyi Yaroslav
 * @version 1.0
 * @since version 1.0
 */
public class lab2RadevychVynnytskyiKI302
{
    /**
    * Статичний метод main є точкою входу в програму
    *
    * @param args Аргументи командного рядка (не використовуються).
    * @throws FileNotFoundException Виникає, якщо файл виникає будь-яка помилка з файлом "Matrix.txt".
    *
    */
	
	public static void main (String[] args) throws FileNotFoundException
    {
		int size;
        char[][]matrix;
        String filler;
        
        Scanner input = new Scanner(System.in);
        File dataFile = new File("Matrix.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        
        System.out.print("Enter matrix size: ");
        size = input.nextInt();
        input.nextLine();
        
        matrix = new char[size][];
        
        for (int i = 0; i < matrix.length / 2; i++)
        {
            matrix[i] = new char[i + 1];
        }
        
        int counter = 0;
        
        for (int i = matrix.length / 2; i < matrix.length; i++)
        {
        	counter++;
        	matrix[i] = new char[counter];
        }
        
        System.out.print("Enter matrix filler: ");
        filler = input.nextLine();
        input.close();
        
        switch(filler.length())
        {
        case 1 :
        	int right = 1;
            for (int i = 0; i < size; i++)
            {
            	if (i < size / 2)
            	{
            		for (int j = 0; j < i + 1; j++)
            		{
            			matrix[i][j] = (char) filler.codePointAt(0);
                        System.out.print(matrix[i][j] + " ");
                        fout.print(matrix[i][j] + " ");
            		}
            		System.out.println();
                    fout.println();
            	}
            	else 
            	{
            		for (int j = 0; j < size / 2; j++)
            		{
            			System.out.print("  ");
            			fout.print("  ");
            		}
        			for (int j = 0; j < right; j++)
            		{      
            			matrix[i][j] = (char) filler.codePointAt(0);
                        System.out.print(matrix[i][j] + " ");
                        fout.print(matrix[i][j] + " ");
                    }
            		right++;
            		System.out.println();
            		fout.println();
            	}
            }
        break;
        case 0 : 
            System.out.print("No character entered!");
            break;
        
        default:
            System.out.print("Too many characters entered!");
        }
        fout.flush();
        fout.close();
    }
}
