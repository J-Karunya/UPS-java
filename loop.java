class loop{
public static void main(String []a){
	int i=10;
	while (i>0){
		System.out.println(i);
		i--;
		}
	int e=1;
	while (e<51){
		if (e%2==0){
			e+=2;		
			System.out.println(e);
		}
		else{
			e+=1;
			System.out.println(e);
		}
		}
	}
}