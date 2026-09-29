// Dépendance à ajouter (build.gradle.kts) :
// implementation("commons-validator:commons-validator:1.8.0")
import org.apache.commons.validator.routines.EmailValidator

fun main() {
    val exemples = listOf(
        "jo@pipo.org",
        "ma_mu@m.ca",
        "a.a@a.ca",
        "a.a@a.aa",
        "ab@ab",
        "a.b@ab",
        "jo"
    )
    val validator = EmailValidator.getInstance()
    for (courriel in exemples) {
        println("$courriel -> ${validator.isValid(courriel)}")
    }
}
