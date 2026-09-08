package org.example

import javax.lang.model.util.Elements



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val doc: Document = Jsoup.connect("").get()
    log(doc.title())
    val newsHeadlines: Elements? = doc.select("")
}