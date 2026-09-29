// Dépendance à ajouter (build.gradle.kts) :
// implementation("org.jsoup:jsoup:1.17.2")
import org.jsoup.Jsoup

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Usage: Jsoup <url>")
        return
    }
    val doc = Jsoup.connect(args[0]).get()
    for (lien in doc.select("a")) {
        println("${lien.text()} = ${lien.attr("href")}")
    }
}
