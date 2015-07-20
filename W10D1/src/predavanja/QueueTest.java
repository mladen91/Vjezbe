package predavanja;

public class QueueTest {

	public static void main(String[] args) {
		
		StringQueueComposition strComp= new StringQueueComposition();
		
		strComp.enqueue("A");
		strComp.enqueue("B");
		strComp.enqueue("C");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(strComp.size());
			System.out.println(strComp.dequeue());
		}

		
	}

}
