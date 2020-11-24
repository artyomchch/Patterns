import BFS.ComponentsBFSIterator
import DFS.Color
import DFS.adj
import DFS.sc


data class Node(var color: Color, var distance: Int = Int.MAX_VALUE, var parent: Int = -1);

var nodes: MutableList<Node> = mutableListOf()
var componentsBFSIterator = ComponentsBFSIterator()


fun main(args: Array<String>) {
    components()
}

fun components(){
    var tmp = sc.readLine()
    val (v, e) = tmp.split(" ").map { it.toInt() }

    (0..v-1).forEach { nodes.add(Node(Color.WHITE)) }
    (0..v-1).forEach { adj.add(mutableListOf()) }

    (0..v-1).forEach { nodes[it] = Node(Color.WHITE) }
    (0..e-1).forEach {
        tmp = sc.readLine()
        val (tv, tw) = tmp.split(" ").map { it.toInt() }
        adj[tv].add(Pair(tw, 1))
        adj[tw].add(Pair(tv, 1))
    }

    bfs(0)
    nodes = mutableListOf()
    (0..v-1).forEach { nodes.add(Node(Color.WHITE)) }
    bfs(6)
    nodes = mutableListOf()
    (0..v-1).forEach { nodes.add(Node(Color.WHITE)) }
    bfs(5)
}

fun bfs(u: Int) {
    val queue = mutableListOf<Int>()
//    val tmp: MutableList<Node> = Collections.nCopies(10, Node(Color.WHITE))
    nodes[u].distance = 0
    queue.add(u)
    componentsBFSIterator.queueSec = queue


    while(componentsBFSIterator.hasNext()) {

        val current = queue.removeAt(0)
        if(nodes[current].color == Color.WHITE) {
            nodes[current].color = Color.BLACK
            adj[current].forEach {
                if (nodes[it.first].distance == Int.MAX_VALUE) {
                    nodes[it.first].distance = nodes[current].distance + it.second
                    nodes[it.first].parent = it.first
                    queue.add(it.first)
                }
            }
        }
    }

    val visitedNodes = nodes.filter { it.color == Color.BLACK }
    println("элемент: $u и его путь $visitedNodes")
}