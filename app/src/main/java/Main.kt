import android.os.Build
import androidx.annotation.RequiresApi


fun main(args: Array<String>) {
//    While Loop
//    val uglyTroll = Troll("Ugly Troll")
//    println(uglyTroll)
//    uglyTroll.takeDamage(30)
//    println(uglyTroll)
//
//    val vlad = Vampire("Vlad")
//    println(vlad)
//    vlad.takeDamage(8)
//    println(vlad)
//
//    for (i in 1..10) {
//        val dracula = VampireKing("Dracula")
//        println(dracula)
//        while (dracula.lives > 0) {
//            if (dracula.dodges()) {
//                continue;
//            }
//            if (dracula.runAway()) {
//                println("Dracula ran away")
//                break;
//            } else {
//                dracula.takeDamage(80)
//            }
//        }
//        println("========================================")
//    }


//    For Loop
//    val conan = Player("Conan")
//    conan.getLoot(Loot("Invisibility",LootType.POTION,4.0))
//    conan.getLoot(Loot("Mithril",LootType.ARMOR,183.0))
//    conan.getLoot(Loot("Ring of speed",LootType.RING,25.0))
//    conan.getLoot(Loot("Red Potion",LootType.POTION,2.0))
//    conan.getLoot(Loot("Cursed Shield",LootType.ARMOR,-8.0))
//    conan.getLoot(Loot("Brass Ring",LootType.RING,1.0))
//    conan.getLoot(Loot("Chain Mail",LootType.ARMOR,4.0))
//    conan.getLoot(Loot("Gold Ring",LootType.RING,12.0))
//    conan.getLoot(Loot("Health Potion",LootType.POTION,3.0))
//    conan.getLoot(Loot("Silver Ring",LootType.RING,6.0))
//    conan.showInventory()

//    Do While Loop
    val dracula = VampireKing("Dracula")
    println(dracula)

    dracula.lives = 0
    do{
        if (dracula.dodges()) {
            dracula.lives += 1
            continue;
        }
        if (dracula.runAway()) {
            println("Dracula ran away")
            break;
        } else {
            dracula.takeDamage(80)
        }
    } while (dracula.lives > 0)
    println("========================================")
}
