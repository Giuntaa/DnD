fun azione(eroe: Hero, goblin: Character) {
    println("Azioni (digita numero corrispondente): \n 1)Attacco \n 2)Difesa \n 3)Fuga")
    val azione: Int = readln().toInt()
    when (azione) {
        1->eroe.attack(goblin)
        2->eroe.defend()
        3->println("Sei fuggito dalla battaglia")
    }
    println("")
}

fun main() {

    print("Inserire il nome dell'eroe: ")
    val eroe = Hero(readln(), 10.0, 100.0)
    val goblin_1 = Enemy("goblin", 10.0, 100.0)

    println("Hai incontrato un goblin\n")
    while (true) {
        if (eroe.isAlive()) {
            azione(eroe, goblin_1)
        }
        else {
            println("Hai perso")
            break
        }
        if (goblin_1.isAlive()) {
            goblin_1.attack(eroe)
        }
        else {
            println("Hai eliminato l'avversario")
            println("Hai vinto")
            break
        }
    }
}