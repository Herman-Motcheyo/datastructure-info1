
import java.lang.Math;
import java.util.Scanner;

 class Geometrie {
    
	/*public static permet de creer une fonction en java
	   void veutb dire qu"elle ne retourne rien
	   ensuite la fonction principale est la methode main qui est comme celui du c
	   si tu voulais creer une fonction qui allait retourne un truc tu devais faire
	   
	public function type_de_retour nom_fonction(parametre ) {instruction}
	 */
	public static void main(String[] args) {
	
        presentation(); //METHODE MAIN 
	}
	
	// les fonction s'ecrive apres les accolladeq du main
	public static void cercle(double rayon) {
		double p =rayon*2*Math.PI;
		double surface = rayon*rayon+Math.PI;
		Afficher("CERCLE",p,surface);
	}
	public static void carre(double cote) {
		
		double p =cote*4;
		double surface = cote*cote;
		Afficher("CARRE",p,surface);
	}
	
	public static void rectangle(double longueur ,double largeur) {

		double p =(longueur +largeur)*2;
		double surface = longueur*largeur;
		Afficher("RECTANGLE",p,surface);	
	
	}
	
	public static void trapeze(double hauteur,double largeur,double longeur,double Pbase,double Gbase) {
           
		   double p= largeur+longeur+Pbase+Gbase;
           double surface = ((Gbase+Pbase)*hauteur)/2;
           Afficher("TRAPEZE",p,surface);
           
	}
	
	public static void triangle(char nature ,double cote1,double cote2,double cote3,double pbase,double hauteur) {
		if (nature=='i') {
			  double p= cote1+cote2+cote3;
	           double surface = (pbase*hauteur)/2;
	           Afficher("TRIANGLE ISOCELE",p,surface);
		} else if(nature=='r'){
			  double p= cote1+cote2+cote3;
	           double surface = (pbase*hauteur)/2;
	           Afficher("TRIANGLE RECTANGLE",p,surface);
		}else if (nature=='e') {
			  double p= cote1*3;
	           double surface = (pbase*hauteur)/2;
	           Afficher("TRIANGLE EQUILATERALE",p,surface);
		}
	}
	public static void Afficher(String nom_figure, double perimetre, double surface) {
		System.out.println("----------Figure "+ nom_figure+"----------------");
		System.out.println("--le perimetre est :\t"+ perimetre);
		System.out.println("--la surface est :\t"+ surface);
		
	}
       public static void presentation() {
    	   int choix=0;
    	   double longueur,largeur,rayon,cote,gbase,pbase,hauteur,cote2,cote3;
    	   String reponse;
    	   char rep;
    	   
    	   Scanner sc =new Scanner(System.in);
    	   Scanner line =new Scanner(System.in);
		System.out.println("--------------------------------------BIENVENUE SUR NOTRE PROGRAMME------------------");
		System.out.println("-----------------Ici nous allons calculer le perimetre et la surface des figures------");
		System.out.println("----------------------------------------1-CERCLE-------------");
		System.out.println("----------------------------------------2-CARRE-----------------");
		System.out.println("----------------------------------------3-TRAPEZE---------------");
		System.out.println("----------------------------------------4-TRIANGLE--------------");
		System.out.print("--------Faites votre choix 1,2,3ou 4 \t");
		 choix = sc.nextInt();
		 
		 switch (choix) {
	       	case 1:
		     	System.out.println("--Entrer le Rayon--");
			    rayon = sc.nextDouble();
			    cercle(rayon);
			   break;
	       	case 2:
	       		System.out.println("--Entrer le Coté--");
			    cote= sc.nextDouble();
			    carre(cote);
			    break;
	       	case 3:
	       		System.out.print("--Entrer la hauteur-- \t");
	       		hauteur=sc.nextDouble();
	       		System.out.print("--Entrer la petite base-- \t");
	       		pbase=sc.nextDouble();
	       		System.out.print("--Entrer la grande base-- \t");
	       		gbase=sc.nextDouble();
	       		System.out.print("--Entrer la longueur-- \t");
	       		longueur=sc.nextDouble();
	       		System.out.print("--Entrer la largeur-- \t");
	       		largeur=sc.nextDouble();
	       		
	       		trapeze(hauteur, largeur, longueur, pbase, gbase);
			    break;
			
	       	case 4:
	       		
	       		System.out.print("--Entrer la base-- \t");
	       		pbase=sc.nextDouble();
	       		System.out.print("--Entrer la hauteur-- \t");
	       		hauteur=sc.nextDouble();
	       		System.out.print("--Quel est la nature du triangle??(isocele, rectangle, equilateral)\t");
	       		reponse=line.nextLine();
	       		rep=reponse.charAt(0);//reuperation de du premier caractere des mots
	       		if (rep=='i') {
	       			System.out.println("--Entrer le Coté double-- \t");
	       			cote=sc.nextDouble();
	       			System.out.println("--Entr4er le second Coté -- \t");
	       			cote3=sc.nextDouble();
	       			triangle(rep, cote, cote, cote3, pbase, hauteur);
				} else if(rep=='r'){  // r=rectangle
					System.out.println("--Entrer le Coté 1-- \t");
	       			cote=sc.nextDouble();
	       			System.out.println("--Entr4er le second Coté 2 -- \t");
	       			cote2=sc.nextDouble();
	       			System.out.println("--Entr4er le second Coté 3 -- \t");
	       			cote3=sc.nextDouble();
	       			triangle(rep, cote, cote2, cote3, pbase, hauteur);
				}else if(rep=='e'){  // r=rectangle
					System.out.println("--Entrer le Coté -- \t");
	       			cote=sc.nextDouble();
	       			
	       			triangle(rep, cote, cote, cote, pbase, hauteur);
				}
	       		
	       		break;
		default:
			System.out.println("--CHOIX INCORRECT \t");
			break;
		}
	}
}
