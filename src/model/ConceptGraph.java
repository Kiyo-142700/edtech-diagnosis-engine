package model;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class ConceptGraph {
	private Map<String, Set<String>> adjacencyList;
	
	public ConceptGraph() {
		this.adjacencyList = new HashMap<>();
	}
	
	public void addPrerequisite(String prereqId, String nextId) {
		this.adjacencyList.putIfAbsent(prereqId, new HashSet<>());
		this.adjacencyList.get(prereqId).add(nextId);
	}
	
	public Set<String> getNextConcepts(String conceptId){
		return this.adjacencyList.getOrDefault(conceptId, new HashSet<>());
		
	}
	
	@Override
	public String toString() {
		return "ConceptGraph [ Relations=" + this.adjacencyList.toString() + "]";
	}
	
	public static void main (String[] args) {
		ConceptGraph graph = new ConceptGraph();
		graph.addPrerequisite("C01", "C02"); // Học xong C01 mới tới C02
		System.out.println("Cac chuong tiep theo sau C01: " + graph.getNextConcepts("C01"));
	}
}
