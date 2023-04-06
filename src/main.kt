import kotlin.jvm.internal.Intrinsics.Kotlin

fun main (args: Array<String>) {
    println("Kotlin version ${KotlinVersion.CURRENT}")
    val errors: MutableList<String> = mutableListOf()

    if (0 !in args.indices || (0 in args.indices && !args[0].startsWith("--name="))) {
        errors.add("O parametro \"--name\" é obrigatório.")
    }

    if (1 !in args.indices || (1 in args.indices && !args[1].startsWith("--age="))) {
        errors.add("O parametro \"--age\" é obrigatório.")
    }

    if (errors.isNotEmpty()) {
        println("Problema de validação (${errors.count()})")
        return errors.forEach {
            println(it)
        }
    }

    val name = args[0].substring(7).trim()
    val age = args[1].substring(6).trim().toByte()

    println("Estamos verificando se você pode ou não entrar na festa")
    println("Por favor aguarde...")

    Thread.sleep(1000)

    if (age < 18) {
        return println("Infelizmente você não poderá entrar na festa :(")
    }

    println("Ebaa!! $name você pode entrar na festa, curta com moderação <3")
}
