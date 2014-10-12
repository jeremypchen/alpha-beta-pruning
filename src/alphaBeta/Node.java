package alphaBeta;

import java.util.ArrayList;
import java.util.List;

public class Node {
	public int depth;
	public Node parent;
	public List<Node> children = new ArrayList<Node>();
	
	public MinMax minmax;
	public double alpha;
	public double beta;
	public double value;
	public String name;
	
	public enum MinMax {MIN, MAX};
	
	// Non-Leaf Nodes
	public Node(String name, MinMax mm){
		depth = 0;
		this.name = name;
		alpha = Double.NEGATIVE_INFINITY;
		beta = Double.POSITIVE_INFINITY;
		minmax = mm;
	}
	
	// Leaf Nodes
	public Node(String name, int value){
		this.name = name;
		this.value = value;
	}
		
	public void addChild(Node child){
		children.add(child);
		child.parent = this;
		child.depth = this.depth + 1;
	}
	
	public String alphaBetaToString(){
		return "Alpha= " + alpha + "Beta= " + beta;
	}
	
}
