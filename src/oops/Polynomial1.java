package oops;

import java.util.Scanner;

import oops.Polynomial1.Polynomial.DynamicArray;

public class Polynomial1 {
	
	public static class Polynomial {

		
		/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
		 *  then corresponding term with specified degree and value is added int the polynomial. If the degree
		 *  is already present in the polynomial then previous coefficient is replaced by
		 *  new coefficient value passed as function argument
		*/
		DynamicArray coEff;

		Polynomial()
		{
			coEff=new DynamicArray();
		}

		public void setCoefficient(int degree, int coeff){
			coEff.add(degree,coeff);
		}
		
		// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
		public void print(){
			for(int i=0;i<coEff.size();i++)
			{
				if(i==0 && coEff.get(i)!=0)
				{
					System.out.print(coEff.get(i)+" ");
				}
				else
				{
					System.out.print(coEff.get(i)+"X"+i);
				}
			}
		}

		
		// Adds two polynomials and returns a new polynomial which has result
		public Polynomial add(Polynomial p){
				int len2=p.coEff.size();
				int len1=coEff.size();
				int len=Math.min(len1,len2);
				Polynomial newPoly=new Polynomial();
				for(int i=0;i<len;i++)
				{
					int c1=coEff.get(i);
					int c2=p.coEff.get(i);
					newPoly.coEff.add(i,c1+c1);
				}
			return newPoly;
		}
		
		// Subtracts two polynomials and returns a new polynomial which has result
		public Polynomial subtract(Polynomial p){
				Polynomial newPoly=new Polynomial();
				for(int i=0;i<10;i++)
				{
					int c1=coEff.get(i);
					int c2=p.coEff.get(i);
					newPoly.coEff.add(i,c1-c1);
				}
			return newPoly;
		}
		
		// Multiply two polynomials and returns a new polynomial which has result
		public Polynomial multiply(Polynomial p){
				int len2=p.coEff.size();
				int len1=coEff.size();
				int len=Math.min(len1,len2);
				Polynomial newPoly=new Polynomial();
				for(int i=0;i<len;i++)
				{
					int c1=coEff.get(i);
					int c2=p.coEff.get(i);
					newPoly.coEff.add(i,c1*c1);
				}
			return newPoly;
		}
		 class DynamicArray
		{
			private int[] data;
			private int nextIndexPosition;
			
			public DynamicArray() {
				data=new int[5];
				nextIndexPosition=0;
			}
			
			public int size()
			{
				return nextIndexPosition;
			}
			public void add(int ele)
			{
				if(nextIndexPosition>=data.length)
				{
					int[] d1=new int[2*data.length];
					for(int i=0;i<nextIndexPosition;i++)
					{
						d1[i]=data[i];
					}
					data=new int[2*data.length];
					for(int i=0;i<d1.length;i++)
					{
						data[i]=d1[i];
					}
				}
				data[nextIndexPosition++]=ele;
			}
			
			public boolean isEmpty()
			{
				if(nextIndexPosition==0)
				{
					return true;
				}
				return false;
			}
			
			public void set(int pos,int ele)
			{
				data[nextIndexPosition]=ele;
			}
			
			public void print()
			{
				for(int i=0;i<nextIndexPosition;i++)
				{
					System.out.print(data[i]+" ");
				}
				System.out.println();
			}
			public void add(int pos,int ele)
			{
				if(nextIndexPosition>=data.length)
				{
					int[] d1=new int[2*data.length];
					for(int i=0;i<nextIndexPosition;i++)
					{
						d1[i]=data[i];
					}
					data=new int[2*data.length];
					for(int i=0;i<d1.length;i++)
					{
						data[i]=d1[i];
					}
				}
				if(pos>=data.length)
				{
					int[] d1=new int[2*pos];
					for(int i=0;i<nextIndexPosition;i++)
					{
						d1[i]=data[i];
					}
					data=new int[2*pos];
					for(int i=0;i<d1.length;i++)
					{
						data[i]=d1[i];
					}
				}
				data[pos]=ele;
			}

			public int get(int pos) 
			{
				if(pos>=nextIndexPosition)
				{
					
				}
				return data[pos];
			}
		}


	}
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int degree1[] = new int[n];
	for(int i = 0; i < n; i++){
		degree1[i] = s.nextInt();
	}
	int coeff1[] = new int[n];
	for(int i = 0; i < n; i++){
		coeff1[i] = s.nextInt();
	}
	Polynomial first = new Polynomial();
	for(int i = 0; i < n; i++){
		first.setCoefficient(degree1[i],coeff1[i]);
	}
	n = s.nextInt();
	int degree2[] = new int[n];
	for(int i = 0; i < n; i++){
		degree2[i] = s.nextInt();
	}
	 int coeff2[] = new int[n];
	for(int i = 0; i < n; i++){
		coeff2[i] = s.nextInt();
	}
	Polynomial second = new Polynomial();
	for(int i = 0; i < n; i++){
		second.setCoefficient(degree2[i],coeff2[i]);
	}
	int choice = s.nextInt();
	Polynomial result;
	switch(choice){
	// Add
	case 1: 
		 result = first.add(second);
		result.print();
		break;
	// Subtract	
	case 2 :
		 result = first.subtract(second);
		result.print();
		break;
	// Multiply
	case 3 :
		 result = first.multiply(second);
		result.print();
		break;
	}

}


}
