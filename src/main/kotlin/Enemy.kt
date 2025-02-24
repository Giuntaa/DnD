class Enemy(name: String, attackPower: Double) : Character(name, attackPower) {

    override fun takeDamage(attacker: Character) {
        this.health -= attacker.attackPower
        println("Hai ferito l'avversario, al goblin restano ${this.health} hp")
    }
}