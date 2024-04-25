public class Main {
    public static void main(String[] args) {
        AdjacencyList<Character> graph = new AdjacencyList<Character>(VertexType.DIRECTED);

        graph.addEdge('A', 'B');
        graph.addEdge('A', 'D');
        graph.addEdge('A', 'E');

        graph.addEdge('B', 'E');

        graph.addEdge('C', 'B');

        graph.addEdge('D', 'G');

        graph.addEdge('E', 'H');
        graph.addEdge('E', 'F');

        graph.addEdge('F', 'C');
        graph.addEdge('F', 'H');

        graph.addEdge('G', 'H');

        graph.addEdge('H', 'I');

        graph.addEdge('I', 'F');

        graph.printGraph();
    }
}
