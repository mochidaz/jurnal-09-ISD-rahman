import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;

enum VertexType {
    DIRECTED,
    UNDIRECTED
}

public class AdjacencyList<T> {
    VertexType type;
    Map<T, LinkedList<T>> list;

    AdjacencyList(VertexType type) {
        this.type = type;
        list = new HashMap<>();
    }

    private void addVertex(T vertex) {
        list.put(vertex, new LinkedList<>());
    }

    public void addEdge(T source, T destination) {
        if (!list.containsKey(source)) {
            addVertex(source);
        }

        if (!list.containsKey(destination)) {
            addVertex(destination);
        }

        list.get(source).add(destination);

        if (type == VertexType.UNDIRECTED) {
            list.get(destination).add(source);
        }
    }

    public void printGraph() {
        for (T vertex : list.keySet()) {
            System.out.print(vertex + " : ");
            for (T edge : list.get(vertex)) {
                if (list.get(vertex).getLast() == edge) {
                    System.out.print(edge);
                } else {
                    System.out.print(edge + " -> ");
                }
            }
            System.out.println();
        }
    }
}
