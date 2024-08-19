import java.util.*;

public class queue {

	public static void main(String[] args) {
		
		int[] queue = new int[5];
		int front = -1;
		int rear = -1;
		int size = 0;
		int proceed;
		int num;
		
		System.out.println("Enter 1 to begin or 0 to stop.");
		Scanner input = new Scanner(System.in);
		
		proceed = input.nextInt();
		while(proceed != 1 && proceed != 0) {
			System.out.println("Please try again.");
			proceed = input.nextInt();
		}
		
		while(proceed == 1) {
			
			System.out.println("Enter 1 to queue or 0 to dequeue.");
			proceed = input.nextInt();
			while(proceed != 1 && proceed != 0) {
				System.out.println("Please try again.");
				proceed = input.nextInt();
			}
			if(proceed == 1) {
				if(isEmpty(front, rear, size)) {
					
					front = 0;
					rear = 0;
					System.out.println("Please enter a number between 1 and 10 you would like to queue");
					num = input.nextInt();
					enQueue(queue, num, rear, size);
					rear = rear + 1;
					size = size + 1;
					
				}
				else if (size >= 5) {
				
					enQueue(queue, 0, rear, size);
					
				}
				else {
					
					System.out.println("Please enter a number between 1 and 10 you would like to queue");
					num = input.nextInt();
					enQueue(queue, num, rear, size);
					rear = rear + 1;
					size = size + 1;
				}
				
				if(rear == 5 && size < 5) {
					
					rear = 0;
					
				}
				
				
			}
			else if(proceed == 0){
				
				if(size == 0) {
					
					deQueue(queue, front, size);
					
				}
				else {
					
					deQueue(queue, front, size);
					front = front + 1;
					size = size - 1;
					
				}
				
				if(rear == 5 && size < 5) {
					
					rear = 0;
					
				}
				
			}
			
			System.out.println("Enter 1 to continue or 0 to stop.");
			proceed = input.nextInt();
			while(proceed != 1 && proceed != 0) {
				System.out.println("Please try again.");
				proceed = input.nextInt();
			}
			
		}
		
		System.out.print("Final Queue : ");
		
		if((5 - front) < size) {
		
			for(int i = front; i < 5; ++i) {
			
				System.out.print(queue[i] + " ");
			
			}
			for(int i = 0; i < rear; ++i) {
			
				System.out.print(queue[i] + " ");
			
			}
			
		}
		else {
			
			for(int i = front; i < front + size; ++i) {
				
				System.out.print(queue[i] + " ");
				
			}
		}
		
	}
	
	public static void enQueue(int[] list, int num, int rear, int size) {
		
		if(size < 5) {
			
			list[rear] = num;
		
		}
		
		else {
			
			System.out.println("Error, queue is already full.");
			
		}
		
	}
	
	public static void deQueue(int[] list, int front, int size) {
		
		if(size == 0) {
			
			System.out.println("Error, no elements to deQueue");
			
		}
		else {
			
			System.out.println(list[front] + " has been removed");
			
		}
		
	}
	
	public static boolean isEmpty(int front, int rear, int size) {
	
		if((front == -1 && rear == -1) || size == 0) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	

}
