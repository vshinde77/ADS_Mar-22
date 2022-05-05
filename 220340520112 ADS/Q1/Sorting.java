// Question Number 1
// insertation sort

class Sorting{
	
	void  insertionSort(int a1[]){
		
		int n = a1.length;
		for(int i =1 ; i<n ; i++){
			
			int temp = a1[i];
			int j = i-1;
			while (j>=0 && a1 [j] > temp){
				
				a1[j+1] = a1[j];
				j=j-1;
				
				
			}
			a1[j+1]=temp;
			
			
		}
		
	}
	void display(int a1[]){
		int n =a1.length;
		for(int i = 0;i<n;i++){
			
			System.out.println(a1[i]+" ");
			
		}
		
	}
	/*
	void count(){
		int a1[i] = head;
		for(int i = 0;i<n;i++){
		int count =0;
		while(n!=0){
			count++;
		}
			
		}
		return count;
		
	}
	*/
	
	
	public static void main (String [] args){
		
		Sorting s1 = new Sorting();
		int a1[]={1,2,4,5,3};
		int a2[]={2,4,6,8,3};
		
		s1.insertionSort(a1);
		s1.display(a1);
		
		System.out.println("Print sort for a2 array");
		s1.insertionSort(a2);
		s1.display(a2);
		
		//s1.count(a1);
		//s1.display(a1);
		
		
		
	}
}
	








