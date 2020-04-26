package binaryTree;

import java.util.concurrent.ThreadLocalRandom;

public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rangeMin = 0;
		int rangeMax = 50;
		int numNodes = 25;
		
		Node n = new Node (5);
		for(int i=0; i<numNodes; i++) {
			int value = ThreadLocalRandom.current().nextInt(rangeMin, rangeMax + 1);
			n.insert(value);
		}
		
		n.contains(10);
		n.contains(20);
		n.contains(30);
		n.contains(40);
		n.contains(50);
		n.printInOrder();
	}

}
