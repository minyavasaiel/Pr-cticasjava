import java.util.Scanner;
//import java.lang.Math;
public class Main {

	public static void main(String[] args) {
		// Ejercicio 1: programa para transoformar grados far en celsius 
		/*
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca los grados Farenheit: \n");
		float far = scan.nextFloat();
		float cel = ((far-32)*5)/9;
		System.out.println("El valor en grados Celsius es: " + cel + "ºC");
		scan.close();
	}
	*/
	
		//Ejercicio 2: volumen y área
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el valor del radio: ");
		float r = scan.nextFloat();
		final float PI = 3.14f;
		float area = 4*PI*r*r;
		System.out.println("El área es: " + area);
		System.out.println("El volumen es: " + ((area*r)/3));
		scan.close();
	}*/
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el valor de la nota (entre 0 y 10): ");
		int nota = scan.nextInt();
		if ( nota < 5) {
			System.out.println("SUSPENSO");
		} else if (nota < 7){
			System.out.println("APROBADO");			
		} else if (nota < 9) {
			System.out.println("NOTABLE");	
		} else {
			System.out.println("SOBRESALIENTE");
		}
		scan.close();	
		}*/
		
		//Ejercicio 4
		/*
		Scanner scan = new Scanner(System.in);
		int a= 0, e = 0, i = 0, o = 0, u = 0;
		String entrada = "hola";
		for(int x= 0; x <20; x++ ) {
			System.out.println("Introduzca un caracter:");
			entrada = scan.nextLine();
			switch(entrada) {
			case "a":
				a++;
				break;
			case "e":
				e++;
				break;
			case "i":
				i++;
				break;
			case "o":
				o++;
				break;
			case "u":
				u++;
				break;
			default:
				break;
			}
		}
	System.out.println("Número de a: " + a + "\n"
			+ "Número de e: " +e+ "\n"
			+ "Número de i: " +i+ "\n"
			+ "Número de o: " +o+ "\n"
			+ "Número de u: " +u+ "\n");
	scan.close();*/
		
		//Ejercicio 5
		/*Scanner scan=new Scanner(System.in);
		int n1,n2;
		String ch="";
		while(!ch.equals("0")) { //es lo mismo que ch!=0
			System.out.println("Introduzca el primer número: ");
			n1 = scan.nextInt();
			System.out.println("Introduzca el segundo número: ");
			n2 = scan.nextInt();
			System.out.println("Selecciona una operación (+,-,*,/,%):\n" + "Pulse 0 para salir.");
			ch=scan.next();
			switch (ch) {
			case "+":
				System.out.println("El resultado es: " + (n1+n2));
				break;
			case "-":
				System.out.println("El resultado es: " + (n1-n2));
				break;
			case "*":
				System.out.println("El resultado es: " + (n1*n2));
				break;
			case "/":
				System.out.println("El resultado es: " + (n1/n2));
				break;
			case "%":
				System.out.println("El resultado es: " + (n1%n2));
				break;
			case "0":
				System.out.println ("Fin del programa.");
				break;
			default:
				System.out.println("Error, operación incorrecta.");
				break;
			}
		}
		scan.close();*/
		
		//Ejercicio 6
		/*Scanner scan=new Scanner(System.in);
		float num;
		float sum=0;
		for(int i= 0; i<20; i++ ) {
			System.out.println("Introduzca un número:");
			num = scan.nextFloat();
			sum+=num;
			}
		scan.close();
		System.out.println("La media es: " + (sum/20) + "\n");*/
		
		//Ejercicio 7
		/*Scanner scan=new Scanner(System.in);
		int n, fac=1;
		System.out.println("Introduzca un número:");
		n=scan.nextInt();
		if(n!=0) {
			for(int i= n; i>0; i-- ) {
			fac=fac*i;
			}
		}else {
			fac=0;
		}
		System.out.println("El factorial es: " + fac + "\n");
		scan.close();*/
		
		//Ejercicio 8
		/*Scanner scan=new Scanner(System.in);
		int n, sum=0;
		System.out.println("Introduce el número de impares:");
		n=scan.nextInt();
		n=n*2;
		for (int i=1;i<n;i++) {
			sum+=i;
			i++;
		}
		scan.close();
		System.out.println("El resultado es= "+ sum);*/
		
		//Ejercicio 9
		/*int res= 0;
		for (int i=1;i<=500;i++) {
			if ((i%5)==0 && (i%7)==0) {
				res+=i;
				}
					}
		}
		System.out.println("El resultado es: " + res);
		*/
		
		//Ejercicio 10
	/*String twit;
	Scanner scan=new Scanner(System.in);
			System.out.println("Introduzca el twit a evaluar");
			twit=scan.nextLine();
			if(twit.length() <=280) {
				System.out.println("Twiteable");
			} else {
				System.out.println("No Twiteable");
							}
			scan.close();*/
		//Ejercio 11
		/*Scanner scan=new Scanner(System.in);
		int min,d,h;
		System.out.println("Introduzca los minutos");
		min=scan.nextInt();
		d=(min/60)/24;
		h=min/60;
		h=h-(d*24);
		min=min-(h*60)-(d*24*60);
		System.out.println(d+" días, "+h+" horas y "+ min+ " minutos.");
		scan.close();*/
		
		//Ejercicio 12
		/*Scanner scan=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Introduce el primer número: "+"\n");
		num1=scan.nextInt();
		System.out.println("Introduce el segundo número: "+"\n");
		num2=scan.nextInt();
		System.out.println("Introduce el tercer número: "+"\n");
		num3=scan.nextInt();
		if (((num1%2==0&&num2%2==0))||((num2%2==0)&&(num3%2==0))||((num1%2==0)&&(num3%2==0))) {
			System.out.println("Al menos dos de los números son pares."+"\n");
		} else {
			System.out.println("No hay dos o más números pares."+"\n");
		}
		scan.close();*/
		
		//Ejercicio 13
		/*Scanner scan=new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduce el primer número: "+"\n");
		n1=scan.nextInt();
		System.out.println("Introduce el segundo número: "+"\n");
		n2=scan.nextInt();
		if ((n1==0)||(n2==0)) {
			System.out.println("El producto es nulo."+"\n");
		} else if ((n1>0)&&(n2>0)||(n1<0)&&(n2<0)) {
				System.out.println("El producto es positivo."+"\n");
			} else { System.out.println ("El producto es negativo." +"\n");
		}scan.close();*/
		
		//Ejercicio 14
	/*Scanner scan=new Scanner(System.in);
		int x, y, aux=1;
		System.out.println("Introduce la base: "+"\n");
		x=scan.nextInt();
		System.out.println("Introduce la potencia: "+"\n");
		y=scan.nextInt();
		if (x>0&& y>0) {
		for(int i=0; i<y; i++) {
			aux*=x; // aux=aux*x;
		}
		System.out.println(x+" elevado a "+y+" es "+aux);
		} else { System.out.println("Introduce números naturales.");
		}
		scan.close();*/
		
		//Ejercicio 15
		/*Scanner scan=new Scanner(System.in);
		float max, min, var;
		System.out.println("Introducce el 1º valor: "+"\n");
		var=min=max=scan.nextFloat();
		for (int i=1;i<20;i++) {
			System.out.println("Introduce un número: "+(i+1)+"\n");
			var=scan.nextFloat();
				if (var>max) {
			max=var;
			} else if (min>var) {
				max=var;
			}
		}
		System.out.println("El valor máximo es "+ max+ " y el valor mínimo es "+min);
		scan.close();*/
		
		//ejercicio 16
		/*Scanner scan=new Scanner(System.in);
		int n;
		do {
		System.out.println("introduzca un valor entre 1 y 9");
		n=scan.nextInt();
		if (n<=0||n>=10) System.out.println("Error, número incorrecto.");
		} while(n<=0||n>=10);
			if(n==4||n==6 || n>=8) {
				System.out.println(n+" no es un número primo.");
			}else {
				System.out.println(n+" es un número primo.");
			}
		scan.close();*/
		
		//Ejercicio 17
		Scanner scan=new Scanner(System.in);
		int x, anterior=0;
		do {
		System.out.println("Introduzca un valor positivo: \n" + "Pulse 0 para salir.");
		x=scan.nextInt();
		if(x==0) break;
		} while (x<1);
		
		
		
		while (x!=0) {
			if(x>anterior) {
			anterior=x;
			} else if (x<0) {
				System.out.println("el número debe ser positivo.");
			}
			else {
			System.out.println("El número debe ser mayor que el anterior."+ "Pulse 0 para salir.");
			}
			System.out.println("Introduzca un valor mayor con el anterior."+ "Pulse 0 para salir.");
			x=scan.nextInt();
		}
		System.out.println("Bye"); 
		scan.close();
		
		
		//Ejercicio 18
		/*Scanner scan=new Scanner(System.in);
		int n, sumPares=0, sumImpar=0, nImpar=0;
		for (int i=0;i<10;i++) {
			System.out.println("Introduzca el "+(i+1)+" valor.");
			n=scan.nextInt();
			if (n%2==0) {
				sumPares+=n;
			}else {
				sumImpar+=n;
				nImpar++;
			}
		}
		System.out.println("La suma de los pares es "+sumPares);
		System.out.println("El total de pares es "+(10-nImpar));
		System.out.println("La media de los impares es "+(sumImpar/nImpar));
		scan.close();*/
		
		//Ejercicio 20
		/*Scanner scan=new Scanner(System.in);
		int n, spar=0, rest;
		System.out.println("Introduzca el valor.");
		n=scan.nextInt();
		while(n!=0) {
			rest=n%10;
			if(rest%2==0) {
				spar+=rest; //spar=spar+rest
				}
			n=n/10; //n/=10;
			System.out.println(rest);
		}
		System.out.println("La suma de los pares es "+ spar);
		scan.close();*/
}
}