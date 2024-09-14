package com.example.demo;

public class Numero {
	int n;
	
	public Numero() {
		// TODO Auto-generated constructor stub
	}
	public Numero(int num) {
		n=num;
	}
	public int getNumero() {
		return n;
	}
	public void setNumero(int numero) {
		this.n = numero;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	// Método secuenciaCollatz
	  public static void secuenciaCollatz(int n) {
		    
		    if(n>0)
		    {
		    	System.out.println(n);
			    // la sucesión termina al llegar a uno.
		    	do {
				      // si el número es par, se lo divide por dos;
				      if (n % 2 == 0) {
				        n = n / 2;
				      } else if (n % 2 != 0)// si es impar, se le multiplica tres y se le suma uno;
				      {
				        n = n * 3 + 1;
				      }
				      System.out.println(n);

				    } while (n > 1);
		    }else
		    {
		    	System.out.println("Número invalido.");
		    }
		  }
	
	// Método Fizzbuzz
	  public static void fizzBuzz(int n) {
	    if(n>0)
	    {
	    	int i = 1;
		    
		    do {
		      if (i % 3 == 0 && i % 5 == 0) {
		        // Los números que sean múltiplos de 3 y 5 se cambian por FizzBuzz.
		        System.out.println("FizzBuzz");
		      } else if (i % 3 == 0) {
		        // Los números que sean múltiplos de 3 se cambian por Fizz.
		        System.out.println("Fizz");
		      } else if (i % 5 == 0) {
		        // Los números que sean múltiplos de 5 se cambian por Buzz.
		        System.out.println("Buzz");
		      } else {
		        System.out.println(i);
		      }
		      i++;
		    } while (i <= n); 
	    }else
	    {
	    	System.out.println("Número invalido.");
	    }

	  }

}
