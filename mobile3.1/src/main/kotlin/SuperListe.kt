// Dépendance à ajouter pour GapList (build.gradle.kts) :
// implementation("org.magicwerk:brownies-collections:0.9.24")
import kotlin.random.Random
import java.util.LinkedList
import org.magicwerk.brownies.collections.GapList

fun testeCetteListe(liste: MutableList<Int>) {
    val random = Random(1234)

    val a = System.currentTimeMillis()
    repeat(100_000) { liste.add(random.nextInt()) }
    val b = System.currentTimeMillis()

    repeat(100_000) { liste.add(0, random.nextInt()) }
    val c = System.currentTimeMillis()

    repeat(100_000) { liste.add(random.nextInt(liste.size + 1), random.nextInt()) }
    val d = System.currentTimeMillis()

    println("Ajout fin: ${b - a}ms | Ajout début: ${c - b}ms | Ajout aléatoire: ${d - c}ms")
}

fun main() {
    println("LinkedList:")
    testeCetteListe(LinkedList())

    println("ArrayList:")
    testeCetteListe(ArrayList())

    println("GapList:")
    testeCetteListe(GapList())
}
