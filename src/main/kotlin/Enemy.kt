class Enemy(name: String, attackPower: Double, health: Double) : Character(name, attackPower, health) {

    override fun takeDamage(attacker: Character) {
        this.health -= attacker.attackPower
        println("Hai ferito l'avversario, al goblin restano ${this.health} hp")
    }
}