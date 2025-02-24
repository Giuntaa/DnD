fun main() {

    print("Inserire il nome dell'eroe: ")
    val eroe = Hero(readln(), 10.0)
    val goblin = Enemy("goblin", 10.0)

    while (eroe.isAlive()){
        println("Azioni (digita numero corrispondente): \n 1)Attacco \n 2)Difesa \n 3)Fuga")
        val azione: Int = readln().toInt()
        when (azione) {
            1->eroe.attack(goblin)
            2-> eroe.defend()
            3->{
                println("Sei fuggito dalla battaglia")
                break
            }
        }
        goblin.attack(eroe)
        println("")
        if (!goblin.isAlive()){
            println("Hai eliminato l'avversario")
            break
        }
    }

    if (eroe.isAlive()){
        println("Hai vinto")
    }
    else{
        println("Hai perso")
    }
}