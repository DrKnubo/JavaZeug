public class ZahlendreieckDoWhile {

    public static void main(String[] args){

	int x = 0;
	
	do{

	for (int y = 0; y <= x; y++){

	    System.out.print(y);
	    }

	

	for (int w = (9 - x); w > 0; w--){
	System.out.print("*");
	}
	System.out.println("");
	x++;

	}while (x <= 9);


    }

}