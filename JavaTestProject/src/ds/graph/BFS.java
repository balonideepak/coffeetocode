package ds.graph;

import java.util.LinkedList;
import java.util.ListIterator;

public class BFS {

	private static Graph graph = null;
	private static int numberOfVertices = 4;

	public static void main(String[] args) {

		graph = new Graph(numberOfVertices);
		graph.addVertex(0, 1);
		graph.addVertex(0, 2);
		graph.addVertex(1, 2);
		graph.addVertex(2, 0);
		graph.addVertex(2, 3);
		graph.addVertex(3, 3);

		doBFS(2); // starting node as '2'

	}

	private static void doBFS(int i) {

		LinkedList<Integer> queue = new LinkedList<Integer>();
		boolean visited[] = new boolean[numberOfVertices];

		queue.add(i);
		visited[i] = true;

		while (!queue.isEmpty()) {

			Integer poll = queue.poll();
			System.out.println(poll);

			ListIterator<Integer> listIterator = graph.getAdjList()[poll]
					.listIterator();
			while (listIterator.hasNext()) {
				Integer integer = (Integer) listIterator.next();
				if (!visited[integer]) {
					visited[integer] = true;
					queue.add(integer);
				}

			}
		}

	}

}

class Graph {
	private int v;
	private LinkedList  adjList[] = null;

	public Graph(int v) {
		this.v = v;
		adjList = new LinkedList[v];
		for(int i=0;i<this.v;i++){
			adjList[i]=new LinkedList();
		}
	}

	public LinkedList<Integer>[] getAdjList() {
		return adjList;
	}

	public void addVertex(int vertexToBeAddedTo, int vertexToAdd) {
		adjList[vertexToBeAddedTo].add(vertexToAdd);
	}

}
