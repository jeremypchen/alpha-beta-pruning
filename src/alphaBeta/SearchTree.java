package alphaBeta;

import java.util.HashMap;

import alphaBeta.Node.MinMax;

public class SearchTree {
	public HashMap<String, Node> gameTree = new HashMap<String, Node>();

	public SearchTree(){
		// Depth: 0, MAX
		Node A0 = new Node("A0", MinMax.MAX);
		// Depth: 1, MIN
		Node B0 = new Node("B0", MinMax.MIN);
		Node B1 = new Node("B1", MinMax.MIN);
		// Depth: 2, MAX (except one leaf node)
		Node C0 = new Node("C0", MinMax.MAX);
		Node C1 = new Node("C1", 5); // leaf
		Node C2 = new Node("C2", MinMax.MAX);
		Node C3 = new Node("C3", MinMax.MAX);
		Node C4 = new Node("C4", MinMax.MAX);
		// Depth: 3, MIN (except two leaf nodes)
		Node D0 = new Node("D0", MinMax.MIN);
		Node D1 = new Node("D1", MinMax.MIN);
		Node D2 = new Node("D2", MinMax.MIN);
		Node D3 = new Node("D3", MinMax.MIN);
		Node D4 = new Node("D4", MinMax.MIN);
		Node D5 = new Node("D5", MinMax.MIN);
		Node D6 = new Node("D6", -3); // leaf
		Node D7 = new Node("D7", MinMax.MIN);
		Node D8 = new Node("D8", MinMax.MIN);
		Node D9 = new Node("D9", 8); // leaf
		// Depth: 4, Leaf Nodes
		Node E0 = new Node("E0", 3);
		Node E1 = new Node("E1", -2);
		Node E2 = new Node("E2", 1);
		Node E3 = new Node("E3", -6);
		Node E4 = new Node("E4", 1);
		Node E5 = new Node("E5", -5);
		Node E6 = new Node("E6", 4);
		Node E7 = new Node("E7", 2);
		Node E8 = new Node("E8", 0);
		Node E9 = new Node("E9", 7);
		Node E10 = new Node("E10", 2);
		Node E11 = new Node("E11", 3);
		Node E12 = new Node("E12", 6);
		Node E13 = new Node("E13", 1);
		Node E14 = new Node("E14", 2);

		// Make connections
		A0.addChild(B0); A0.addChild(B1);
		B0.addChild(C0); B0.addChild(C1); B0.addChild(C2);
		B1.addChild(C3); B1.addChild(C4);
		C0.addChild(D0); C0.addChild(D1); C0.addChild(D2);
		C2.addChild(D3); C2.addChild(D4);
		C3.addChild(D5); C3.addChild(D6);
		C4.addChild(D7); C4.addChild(D8); C4.addChild(D9);
		D0.addChild(E0); D0.addChild(E1); D0.addChild(E2);
		D1.addChild(E3);
		D2.addChild(E4); D2.addChild(E5);
		D3.addChild(E6);
		D4.addChild(E7); D4.addChild(E8);
		D5.addChild(E9); D5.addChild(E10);
		D7.addChild(E11);
		D8.addChild(E12); D8.addChild(E13); D8.addChild(E14);

		gameTree.put("A0", A0);
		gameTree.put("B0", B0); gameTree.put("B1", B1);
		gameTree.put("C0", C0); gameTree.put("C1", C1); gameTree.put("C2", C2);
		gameTree.put("C3", C3); gameTree.put("C4", C4);
		gameTree.put("D0", D0); gameTree.put("D1", D1); gameTree.put("D2", D2);
		gameTree.put("D3", D3); gameTree.put("D4", D4); gameTree.put("D5", D5);
		gameTree.put("D6", D6); gameTree.put("D7", D7); gameTree.put("D8", D8);
		gameTree.put("D9", D9); gameTree.put("E0", E0); gameTree.put("E1", E1);
		gameTree.put("E2", E2); gameTree.put("E3", E3); gameTree.put("E4", E4);
		gameTree.put("E5", E5); gameTree.put("E6", E6); gameTree.put("E7", E7);
		gameTree.put("E8", E8); gameTree.put("E9", E9); gameTree.put("E10", E10);
		gameTree.put("E11", E11); gameTree.put("E12", E12); gameTree.put("E13", E13);
		gameTree.put("E14", E14);
	}

	public HashMap<String, Node> getTree(){
		return gameTree;
	}
}
