

import java.util.Scanner;


class Vecteurs {
	
	public static int d;

	public static void main(String[] args) {
		
		System.out.println("----------Vecteur numero 1");
	    int V1[]= Stockage_vect() ;
	        Affiche(V1);
	    System.out.println("----------Vecteur numero 2");
	    int V2[]= Stockage_vect() ;
	           Affiche(V2);
	    System.out.println("ENTRER LA NORME P DU VECTEUR");
	    Scanner sc =new Scanner(System.in);
	    d= sc.nextInt();
	    
	    int[] vadd= Addition(V1, V2);
	    int[] vsous=Soustration(V1, V2);
	    int[] vscalaire = Produit_scalaire(V1, V2);
	    
	    double euclidien1 = norme(V1);
	    double euclidien2 = norme(V2);
	    double distance_eucli = distance(V1, V2);
	    
		double  norme_p_v1= norme(d, V1);
		double  norme_p_v2= norme(d, V2);
		double  distance_p_v1_v2= distance(V1, V2, d);
		
		 System.out.print("L' ADDITION DE V1 ET V2 EST \t");
                  Affiche(vadd);
                  
         System.out.print("La SOUSTRACTION DE V1 ET V2 EST \t");
                  Affiche(vsous);
                  
         System.out.print("LePRODUIT SCALAIRE DE V1 ET V2 EST \t");
                  Affiche(vscalaire);
                  
         System.out.print("LA norme euclidienne  DE V1 est "+euclidien1+" ET V2 EST "+ euclidien2+ "\n");
		   System.out.println("-------------------------------");
         System.out.print("LA DISTANCE euclidienne entre  V1 et V2 est "+distance_eucli+"\n");
		   System.out.println("-------------------------------");
                 
         System.out.print("LA norme "+d +" DE V1 est "+norme_p_v1+" ET V2 EST "+ norme_p_v2+ "\n");
		   System.out.println("-------------------------------");
         System.out.print("LA DISTANCE "+d+" entre  V1 et V2 est "+distance_p_v1_v2+"\n");
	}
	
 public static int[] Stockage_vect() {
	 
       int taille=0;
       System.out.println("-----------Entrer la taille du vecteur svp---------");
       Scanner sc =new Scanner(System.in);
       /*
       quand je crai une variable Scanner c,est pour recuperer l"entree utilisateur
       cette variable est 'sc' tu peux nommer autrement
       */
       taille =sc.nextInt();//permet de reuperer la taille 
       
        int tab[]= new int[taille]; 
        /*
         * je declare le tableau qui va contenir mes vecteurs en lui donnant la taille recuperer au clavier
         *  
         */
      
       for (int i = 0; i <taille; i++) {
		System.out.print("Entrer l'element numero "+(i+1)+"\t" );
	    tab[i]=sc.nextInt();
	}
       
       return tab;  //je retourne le tableau remplir contenant les coordonnées du vecteur
}
 
 public static void Affiche(int tab[]) { //cette methode ou encore fonction prend en entrer un tableau
	
	 System.out.print("[ ");
	 
	 for (int i = 0; i < tab.length; i++) {
		System.out.print( tab[i]+" ");
	}
	 System.out.print("] \n");
	  System.out.println("-------------------------------");

	 
}
 
 public static int[] Addition(int V1[],int V2[]) { //remarque " int[]" avant le nom de la fonction veut dire que je retourne un tableau
	 
	 
	 /*a defaut de retourner null quand les 2 tableaux
		 * n'ont pas la meme longueur, j'ai choisi de travailler avec la plus
		 * petite longueur  des 2*/
	 
	 int n = Math.min(V1.length, V2.length);
	 int V3[]=new int[n];

	 for (int i = 0; i < n; i++) {
		V3[i]= V1[i]+V2[i]; 
		/*
		 * si V1[1,3,7,8] et v2= [2,1,4,5]
		 * alors  V3=[1+2,3+1,7+4,8+5]
		 */
	}
	return V3; // je retourne le vecteur V3 contenant l"addition
}
 
 public static int[] Soustration(int V1[],int V2[]) { 
	 
	 int n = Math.min(V1.length, V2.length);
	 int V3[]=new int[n];
	
	 for (int i = 0; i < n; i++) {
		V3[i]= V1[i]-V2[i]; //j'ai change + en -
		/*
		 * si V1[1,3,7,8] et v2= [2,1,4,5]
		 * alors  V3=[1-2,3-1,7-4,8-5]
		 */
	}
	return V3; // je retourne le vecteur V3 contenant la soustraction
}
 
 public static int[] Produit_scalaire(int V1[],int V2[]) { 

	 
	 int n = Math.min(V1.length, V2.length);
	 int V3[]=new int[n] ;
	
	 for (int i = 0; i < n; i++) {
		V3[i]= V1[i]*V2[i]; //j'ai change + en -
		/*
		 * si V1[1,3,7,8] et v2= [2,1,4,5]
		 * alors  V3=[1*2,3*1,7*4,8*5]
		 */
	}
	return V3; // je retourne le vecteur V3 contenant le produit scalaire
}
 
 public static double norme(int p,int V1[]) { 

	 double norme=0.0;
	 double solution;

	 int n =V1.length;
	
	 for (int i = 0; i < n; i++) {
		norme += Math.pow(V1[i], p);
		
	}
	
	 solution = Math.pow(norme, (1.0/p));
	 
	return solution; // je retourne le vecteur V3 contenant le produit scalaire
}
 public static double norme(int v[]) {
	 int norme_euclidien=0;
	 double solution;
	 int n =v.length;
	 for (int i = 0; i < n; i++) {
			norme_euclidien += Math.pow(v[i], 2);   //Math.pow(v[i],2) signifit v[i] a la puissance 2
		}
	 solution = Math.pow(norme_euclidien, 1.0/2.0);
	 
	 return solution;
	 
}
 public static double distance(int x[],int y[],int p) {
	 /*a defaut de retourner null quand les 2 tableaux/vecteurs
		 * n'ont pas la meme longueur, j'ai choisi de travailler avec la plus
		 * petite longueur  des 2*/
	 
	 int n = Math.min(y.length, x.length);
	 int norme_euclidien=0;
	 double solution;
	 
	 for (int i = 0; i < n; i++) {
			norme_euclidien += Math.pow(x[i]-y[i], p);
		}
	 solution = Math.pow(norme_euclidien, 1.0/p);
	 
	 return solution;
}
 
 public static double distance(int x[],int y[]) {

	 int n = Math.min(y.length, x.length);
	 int norme_euclidien=0;
	 double solution;
	 
	 for (int i = 0; i < n; i++) {
			norme_euclidien += Math.pow(x[i]-y[i], 2);
		}
	 solution = Math.pow(norme_euclidien, 1.0/2.0);
	 
	 return solution;
}
 
}
