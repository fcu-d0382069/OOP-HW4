package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class NissanTiida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int side;
		int i;
		Scanner NissanTiida = new Scanner(System.in);
		System.out.println("設定共要幾次呼叫:");
		side = NissanTiida.nextInt();
		for(i=0;i<side;i++)
		{
			tiida();
		}
		
		

	}

	public static void tiida(){
		
		int k=1;
	    for(int i=0;i<k;i++)
	    {
	        for(int j=0;j<k;j++)
	        {
	            System.out.print("*");
	            
	        }
	        System.out.print("\n");
	        
	    }
		k++;
	}
	}
